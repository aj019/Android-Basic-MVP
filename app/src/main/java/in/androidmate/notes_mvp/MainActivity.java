package in.androidmate.notes_mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener,MVP.MainView {

    private TextView tvText;
    private EditText etText;
    private Button btClick;
    private ListView lv;

    MVP.MainPresenter mPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViews();
        setupMVP();

    }

    private void setupViews() {

        tvText = (TextView) findViewById(R.id.tvText);
        etText = (EditText) findViewById(R.id.etText);
        lv = (ListView) findViewById(R.id.lv);
        btClick = (Button) findViewById(R.id.btClick);
        btClick.setOnClickListener(this);
    }

    private void setupMVP() {

        mPresenter = new MainPresenterImp(this);

    }


    @Override
    public void onClick(View v) {
        mPresenter.setText(etText);
    }

    @Override
    public void changeText(String text) {
        tvText.setText(text);
    }
}
