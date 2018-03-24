package developersudhanshu.com.delhimeetup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button fragActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // fetching the views form the XML
        fragActivity = (Button) findViewById(R.id.btn_frag_act);

        // Setting the listener's on both the button's
        fragActivity.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_frag_act:
                Intent intent = new Intent(this, FragmentActivity.class);
                startActivity(intent);
                break;
        }
    }
}
