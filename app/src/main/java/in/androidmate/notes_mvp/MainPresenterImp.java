package in.androidmate.notes_mvp;

import android.widget.EditText;

/**
 * Created by anujgupta on 26/07/17.
 */

public class MainPresenterImp implements MVP.MainPresenter {

    MVP.MainView mainView;

    public MainPresenterImp(MVP.MainView mainView) {
        this.mainView = mainView;
    }


    @Override
    public void setText(EditText editText) {
        mainView.changeText(editText.getText().toString());
    }
}
