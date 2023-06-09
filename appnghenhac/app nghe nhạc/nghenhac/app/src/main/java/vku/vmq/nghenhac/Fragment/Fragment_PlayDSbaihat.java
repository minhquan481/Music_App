package vku.vmq.nghenhac.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import vku.vmq.nghenhac.Activity.PlaynhacActivity;
import vku.vmq.nghenhac.Adapter.PlayAdapter;
import vku.vmq.nghenhac.R;


public class Fragment_PlayDSbaihat extends Fragment {

    View view;
    RecyclerView recyclerViewplaynhac;
    PlayAdapter playAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable  ViewGroup container,  Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_playdsbai,container,false);
        recyclerViewplaynhac = view.findViewById(R.id.recyclerPlaybaihat);
        if (PlaynhacActivity.mangbaihat.size() > 0) {
            playAdapter = new PlayAdapter(getActivity(), PlaynhacActivity.mangbaihat);
            recyclerViewplaynhac.setLayoutManager(new LinearLayoutManager(getActivity()));
            recyclerViewplaynhac.setAdapter(playAdapter);
        }
        return view;

    }
}
