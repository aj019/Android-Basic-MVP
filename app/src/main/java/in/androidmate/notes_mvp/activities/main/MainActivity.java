package in.androidmate.notes_mvp.activities.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import in.androidmate.notes_mvp.R;
import in.androidmate.notes_mvp.activities.books.BooksActivity;
import in.androidmate.notes_mvp.activities.main.MVP;
import in.androidmate.notes_mvp.activities.main.MainPresenterImp;
import in.androidmate.notes_mvp.adapters.NotesAdapter;


public class MainActivity extends AppCompatActivity implements View.OnClickListener,MVP.MainView {

    @BindView(R.id.etText)
    EditText etText;

    @BindView(R.id.btClick)
    Button btClick;

    @BindView(R.id.rvNotes)
    RecyclerView rvNotes;

    RecyclerView.Adapter adapter;
    LinearLayoutManager llm;
    MVP.MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        setupMVP();
        setupViews();


    }

    private void setupMVP() {

        mPresenter = new MainPresenterImp(this);

    }

    private void setupViews() {


        btClick.setOnClickListener(this);
        rvNotes = (RecyclerView) findViewById(R.id.rvNotes);
        llm = new LinearLayoutManager(this);
        rvNotes.setLayoutManager(llm);

        showNotes();

    }

    private void showNotes() {

        mPresenter.showAllNotes();
    }




    @Override
    public void onClick(View v) {

        startActivity(new Intent(this, BooksActivity.class));
        mPresenter.addNote(etText);
    }


    @Override
    public void updateNotesList() {
        adapter.notifyDataSetChanged();
    }

    @Override
    public void showResults(List<String> notes) {
        adapter = new NotesAdapter(this,notes);
        rvNotes.setAdapter(adapter);
    }
}
