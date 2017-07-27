package in.androidmate.notes_mvp.activities.main;

import android.widget.EditText;

import java.util.List;

/**
 * Created by anujgupta on 26/07/17.
 */

public class MVP {

    interface MainPresenter{

        void showAllNotes();
        void addNote(EditText editText);

    }

    interface MainView{

        void updateNotesList();
        void showResults(List<String> notes);

    }

}
