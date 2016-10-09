package com.example.portfolio.myappportfolio;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class AppPortfolioFragment extends Fragment {

    public AppPortfolioFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.app_portfolio_fragment, container, false);

        final ArrayList<String> lstProjects = new ArrayList<>();
        lstProjects.add("Popular Movies");
        lstProjects.add("Stock Hawk!");
        lstProjects.add("Build it Bigger");
        lstProjects.add("Make Your App Material");
        lstProjects.add("Go Ubiquitous");
        lstProjects.add("Capstone");

        ArrayAdapter<String> projectsAdapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item_project, R.id.list_item_project_textview, lstProjects);
        ListView lstViewProjects = (ListView) rootView.findViewById(R.id.listview_portfolio);
        lstViewProjects.setAdapter(projectsAdapter);

        lstViewProjects.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "This button will launch my " + lstProjects.get(position) + " project!", Toast.LENGTH_LONG).show();
            }
        });

        return rootView;
    }
}
