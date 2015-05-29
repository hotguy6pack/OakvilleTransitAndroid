package bowenowen.oakvilletransit.Fragments.Closest;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import bowenowen.oakvilletransit.R;

/**
 * Created by owenchen on 15-05-10.
 */
public class ClosestListFragment extends Fragment {
    ListView routeList;

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.closest_fragment, null, false);

        return view;
    }
}

