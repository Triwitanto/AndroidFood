package androidfood.triwi.id.androidfood;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by TRW on 3/10/2018.
 */

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {
    private ArrayList<Contact> adapterList;
    private HomeActivity homeActivity;

    ContactAdapter(ArrayList<Contact> adapterList, Context ctx) {
        this.adapterList = adapterList;
        homeActivity =(HomeActivity) ctx;
    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_layout,parent,false);

        return new ContactViewHolder(view, homeActivity);
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {
       holder.img.setImageResource(adapterList.get(position).getImgId());
       holder.nama.setText(adapterList.get(position).getNamaKue());
       holder.jenis.setText(adapterList.get(position).getJenisKue());
    }

    @Override
    public int getItemCount() {
        return adapterList.size();
    }

    static class  ContactViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView nama, jenis;
        CheckBox checkBox;
        HomeActivity homeActivity;

        ContactViewHolder(View itemView, HomeActivity homeActivity) {
            super(itemView);
            img = itemView.findViewById(R.id.imgId);
            nama = itemView.findViewById(R.id.namaKue);
            jenis = itemView.findViewById(R.id.jenisKue);
            checkBox = itemView.findViewById(R.id.checkbox);
            this.homeActivity = homeActivity;
        }
    }
}
