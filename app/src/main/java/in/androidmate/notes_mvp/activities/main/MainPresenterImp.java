package in.androidmate.notes_mvp.activities.main;

import android.widget.EditText;

import in.androidmate.notes_mvp.activities.main.MVP;
import in.androidmate.notes_mvp.models.NotesData;

/**
 * Created by anujgupta on 26/07/17.
 */

public class MainPresenterImp implements MVP.MainPresenter {

    MVP.MainView mainView;
    NotesData notesData = new NotesData();

    public MainPresenterImp(MVP.MainView mainView) {
        this.mainView = mainView;
    }


    @Override
    public void showAllNotes() {

        mainView.showResults(notesData.getNotes());
    }

    @Override
    public void addNote(EditText editText) {
        String note = editText.getText().toString();
        notesData.addNote(note);
        mainView.updateNotesList();

    }
}
