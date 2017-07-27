package in.androidmate.notes_mvp.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by anujgupta on 27/07/17.
 */

public class NotesData {

    List<String> notes = new ArrayList<String>();

    public NotesData() {

    }

    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public void addNote(String note){
        notes.add(note);
    }

}
