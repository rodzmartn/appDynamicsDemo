package com.example.orodriguez.appdynamics;

import android.app.DownloadManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class catalogo_Fragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_catalogo, container, false);

        View view = inflater.inflate(R.layout.fragment_catalogo,
                container, false);
        Button downcata;
        downcata = (Button)view.findViewById(R.id.downcata);
        downcata.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //DownloadWorker downloadWorker = new DownloadWorker(getContext());
                //downloadWorker.execute();

                Intent intent = new Intent(getContext(),Downwork2.class);
                startActivity(intent);
            }
        });
        return view;
    }

    /*public void OnDownload(View view) {
        DownloadWorker downloadWorker = new DownloadWorker(getContext());
        downloadWorker.execute();
    }*/
}
