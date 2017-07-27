package in.androidmate.notes_mvp.activities.books;


import android.util.Log;

import in.androidmate.notes_mvp.models.Books;
import in.androidmate.notes_mvp.models.Item;
import in.androidmate.notes_mvp.network.NetworkClient;
import in.androidmate.notes_mvp.network.NetworkStore;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by anujgupta on 27/07/17.
 */

public class BooksPresenterImp implements MVP_Books.BooksPresenter {

    MVP_Books.BooksView booksView;

    public BooksPresenterImp(MVP_Books.BooksView booksView){
        this.booksView = booksView;
    }


    @Override
    public void getBooksFromServer(String q) {

        booksView.showProgressBar();
        Observable<Books> observable = NetworkClient.getRetrofit().create(NetworkStore.class)
                                      .getTopBooks(q)
                                      .subscribeOn(Schedulers.io())
                                      .observeOn(AndroidSchedulers.mainThread());

        Subscriber<Books> subscriber = new Subscriber<Books>() {
            @Override
            public void onCompleted() {
                booksView.hideProgressBar();
            }

            @Override
            public void onError(Throwable e) {
                Log.d("Error",e.getMessage());
            }

            @Override
            public void onNext(Books books) {

                booksView.showBooksInRecycler(books);
            }
        };

        observable.subscribe(subscriber);

    }
}
