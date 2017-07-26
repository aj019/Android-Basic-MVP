package in.androidmate.notes_mvp;

import android.widget.EditText;

/**
 * Created by anujgupta on 26/07/17.
 */

public class MVP {

    interface MainPresenter{

        void setText(EditText editText);

    }

    interface MainView{

        void changeText(String text);
    }

}
