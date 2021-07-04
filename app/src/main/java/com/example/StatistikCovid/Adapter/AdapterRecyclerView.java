package com.example.StatistikCovid.Adapter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;

import com.example.StatistikCovid.R;
import com.example.StatistikCovid.Data.*;


public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder> {

       GetCovid.RawCovid mdatacovid;
       private Context context;
        private Bundle bundle;
       // private ItemDetail itemdetail;





        public AdapterRecyclerView(Context context1, GetCovid.RawCovid datacovid) {

            this.mdatacovid= datacovid;
            context = context1;
//            System.out.println(mdatacovid.datacovid.size());
        }

        static class ViewHolder extends RecyclerView.ViewHolder {

            TextView Tanggal;
            TextView Meninggal;
            TextView Sembuh;
            TextView Terkonfirmasi;
            LinearLayout listdata;



            ViewHolder(View v) {

                super(v);

                Tanggal = v.findViewById(R.id.tanggal1);
                Meninggal = v.findViewById(R.id.alamat);
                Sembuh =  v.findViewById(R.id.tv_namars);
                Terkonfirmasi = v.findViewById(R.id.tv_terkonfirmasi);





            }
        }

        @NonNull
        @Override
        public AdapterRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            View view = LayoutInflater.from(context).inflate(R.layout.bariscovid,parent, false);
            ViewHolder mViewHolder = new ViewHolder(view);

            return mViewHolder;
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {

                String Tanggal = mdatacovid.datacovid.get(position).tanggal;
;               String Sembuh = mdatacovid.datacovid.get(position).sembuh;
                String Meninggal = mdatacovid.datacovid.get(position).meninggal;
                String Terkonfirmasi = mdatacovid.datacovid.get(position).confirmation;

               // String Gambar = mrepository.get(position).owner.avatar_url;
               // String url = mrepository.get(position).html_url;

                holder.Tanggal.setText(Tanggal);
                holder.Sembuh.setText("Sembuh : " + Sembuh);
                holder.Meninggal.setText("Meninggal : "+ Meninggal);
                holder.Terkonfirmasi.setText("Terkonfirmasi : " + Terkonfirmasi);
             //   holder.Date.setText(Date);

           //     Picasso.get().load(Gambar).into(holder.Gambar);


        }

        @Override
        public int getItemCount() {

            return mdatacovid.datacovid.size();
        }
    }

