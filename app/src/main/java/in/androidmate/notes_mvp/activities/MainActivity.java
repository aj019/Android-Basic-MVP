package in.androidmate.notes_mvp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import in.androidmate.notes_mvp.R;
import in.androidmate.notes_mvp.activities.MVP;
import in.androidmate.notes_mvp.activities.MainPresenterImp;
import in.androidmate.notes_mvp.adapters.NotesAdapter;
import in.androidmate.notes_mvp.models.NotesData;


public class MainActivity extends AppCompatActivity implements View.OnClickListener,MVP.MainView {

    private EditText etText;
    private Button btClick;
    private RecyclerView rvNotes;
    RecyclerView.Adapter adapter;
    LinearLayoutManager llm;

    MVP.MainPresenter mPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupMVP();
        setupViews();


    }

    private void setupViews() {


        etText = (EditText) findViewById(R.id.etText);
        rvNotes = (RecyclerView) findViewById(R.id.rvNotes);
        btClick = (Button) findViewById(R.id.btClick);
        btClick.setOnClickListener(this);

        rvNotes = (RecyclerView) findViewById(R.id.rvNotes);
        llm = new LinearLayoutManager(this);
        rvNotes.setLayoutManager(llm);

        showNotes();

    }

    private void showNotes() {

        mPresenter.showAllNotes();
    }

    private void setupMVP() {

        mPresenter = new MainPresenterImp(this);

    }


    @Override
    public void onClick(View v) {

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
