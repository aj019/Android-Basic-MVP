package in.androidmate.notes_mvp.activities.books;

import in.androidmate.notes_mvp.models.Books;

/**
 * Created by anujgupta on 27/07/17.
 */

public interface MVP_Books {

     interface BooksPresenter{

         void getBooksFromServer(String q);

    }

     interface BooksView{

         void showBooksInRecycler(Books books);
         void showProgressBar();
         void hideProgressBar();
    }

}
