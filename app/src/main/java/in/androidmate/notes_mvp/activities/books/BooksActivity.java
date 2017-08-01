package in.androidmate.notes_mvp.activities.books;

import android.app.Activity;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;

import butterknife.BindView;
import in.androidmate.notes_mvp.R;
import in.androidmate.notes_mvp.adapters.BookAdapter;
import in.androidmate.notes_mvp.models.Books;

public class BooksActivity extends Activity implements MVP_Books.BooksView{

    MVP_Books.BooksPresenter mPresenter;
    private String query = "Programming";
    @BindView(R.id.buttonRefresh)
    FloatingActionButton fab;

    @BindView(R.id.recycleView)
    RecyclerView rv;

    @BindView(R.id.progress)
    ProgressBar pb;

    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);

        setupMVP();
        setupViews();
        getBooks();

    }

    private void setupMVP() {

        mPresenter = new BooksPresenterImp(this);

    }

    private void setupViews() {

        rv.setLayoutManager(new GridLayoutManager(this,2));

    }

    private void getBooks(){
        mPresenter.getBooksFromServer(query);
    }

    @Override
    public void showBooksInRecycler(Books books) {

        adapter = new BookAdapter(books.getItems(),R.layout.item_books,this);
        rv.setAdapter(adapter);

    }

    @Override
    public void showProgressBar() {
        pb.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgressBar() {

        pb.setVisibility(View.INVISIBLE);
    }
}
