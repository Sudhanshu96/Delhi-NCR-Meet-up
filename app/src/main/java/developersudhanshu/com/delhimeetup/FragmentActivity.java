package developersudhanshu.com.delhimeetup;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        ListFragment listFragment = new ListFragment();

        // Setting up a fragment transaction to replace the fragment
        android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.frag_container, listFragment)
                .commit();

        // Note: Question to the audience- Why not used "add()" transaction here ?
    }
}
