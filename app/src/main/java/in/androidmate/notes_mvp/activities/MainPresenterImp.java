package in.androidmate.notes_mvp.activities;

import android.widget.EditText;

import java.util.List;

import in.androidmate.notes_mvp.activities.MVP;
import in.androidmate.notes_mvp.models.NotesData;

/**
 * Created by anujgupta on 26/07/17.
 */

public class MainPresenterImp implements MVP.MainPresenter {

    MVP.MainView mainView;

    public MainPresenterImp(MVP.MainView mainView) {
        this.mainView = mainView;
    }


    @Override
    public void showAllNotes() {
        NotesData notesData = new NotesData();
        mainView.showResults(notesData.getNotes());
    }

    @Override
    public void addNote(EditText editText) {
        String note = editText.getText().toString();

    }
}
