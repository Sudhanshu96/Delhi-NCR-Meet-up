package developersudhanshu.com.delhimeetup;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailsFragment extends Fragment {

    TextView dataTextView;

    public DetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_details, container, false);
        Bundle bundle = getArguments();
        String data = "";

        if(bundle != null)
            data = bundle.getString(Constants.INTENT_EXTRA_KEY);

        dataTextView = (TextView) view.findViewById(R.id.tv_data_display);
        dataTextView.setText(data);

        return view;
    }

}
