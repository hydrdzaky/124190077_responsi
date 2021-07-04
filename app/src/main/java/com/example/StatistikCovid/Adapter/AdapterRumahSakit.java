package com.example.StatistikCovid.Adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.StatistikCovid.R;
import com.example.StatistikCovid.Data.GetRumahSakit;

import java.util.List;


public class AdapterRumahSakit extends RecyclerView.Adapter<AdapterRumahSakit.ViewHolder> {

       List<GetRumahSakit.DataRS> mdatars;
       private Context context;
        private Bundle bundle;






        public AdapterRumahSakit(Context context1, List<GetRumahSakit.DataRS> Mdatars) {

            this.mdatars =  Mdatars;
            context = context1;
//            System.out.println(mdatacovid.datacovid.size());
        }

        static class ViewHolder extends RecyclerView.ViewHolder {

          TextView NamaRs;
          TextView Alamat;
          String Long;
          String Lat;
          Button Maps;



            ViewHolder(View v) {

                super(v);

               NamaRs = v.findViewById(R.id.tv_namars);
               Alamat = v.findViewById(R.id.tv_alamatrs2);
               Maps = v.findViewById(R.id.button);






            }
        }

        @NonNull
        @Override
        public AdapterRumahSakit.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            View view = LayoutInflater.from(context).inflate(R.layout.barisrs,parent, false);
            ViewHolder mViewHolder = new ViewHolder(view);

            return mViewHolder;
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {

                String Nama = mdatars.get(position).nama;
;               String Alamat1 = mdatars.get(position).alamat;
                String Lat = mdatars.get(position).latitude;
                String Long = mdatars.get(position).longtitude;

               // String Gambar = mrepository.get(position).owner.avatar_url;
               // String url = mrepository.get(position).html_url;

                holder.NamaRs.setText(Nama);
              holder.Alamat.setText("Sembuh : " + Alamat1);


               holder.Maps.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                     Uri link = Uri.parse("https://maps.google.com/?q="+Nama);
                          Intent map = new Intent(Intent.ACTION_VIEW, link);
                          map.setPackage("com.google.android.apps.maps");
                          context.startActivity(map);
                     }
                 });


           //     Picasso.get().load(Gambar).into(holder.Gambar);


        }

        @Override
        public int getItemCount() {

            return mdatars.size();
        }
    }

