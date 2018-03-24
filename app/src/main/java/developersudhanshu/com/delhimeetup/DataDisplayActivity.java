package developersudhanshu.com.delhimeetup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DataDisplayActivity extends AppCompatActivity {

    TextView dataDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_display);

        dataDisplay = (TextView) findViewById(R.id.tv_data_display);

        if(getIntent().hasExtra(Constants.INTENT_EXTRA_KEY)){
            dataDisplay.setText(getIntent().getStringExtra(Constants.INTENT_EXTRA_KEY));
        }else{
            dataDisplay.setText("Error is displaying text");
        }
    }
}
