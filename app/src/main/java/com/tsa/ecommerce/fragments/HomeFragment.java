package com.tsa.ecommerce.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tsa.ecommerce.R;
import com.tsa.ecommerce.adapters.BannerAdapter;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    RecyclerView bannerRecycler;
    ArrayList bannerList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        bannerRecycler=root.findViewById(R.id.bannerRecycler);

        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        bannerList=new ArrayList();
        loadBaner(bannerList);
    }

    private void loadBaner( ArrayList listBanner) {

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        bannerRecycler.setLayoutManager(layoutManager);

        BannerAdapter userDashboardAdapter = new BannerAdapter(getActivity(), listBanner);
        bannerRecycler.setAdapter(userDashboardAdapter);

    }
}