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
    ArrayList<Contact> adapter_list = new ArrayList<>();
    HomeActivity homeActivity;
    Context ctx;


    public  ContactAdapter(ArrayList<Contact>adapter_list,Context ctx)
    {
        this.adapter_list = adapter_list;
        this.ctx = ctx;
        homeActivity =(HomeActivity) ctx;

    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_layout,parent,false);
        ContactViewHolder contactViewHolder = new ContactViewHolder(view, homeActivity);


        return contactViewHolder;
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {

       holder.img.setImageResource(adapter_list.get(position).getImg_id());
       holder.Nama.setText(adapter_list.get(position).getNama_kue());
       holder.Jenis.setText(adapter_list.get(position).getJenis_kue());

    }

    @Override
    public int getItemCount() {
        return adapter_list.size();
    }

    public static class  ContactViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView Nama,Jenis;
        CheckBox checkBox;
        HomeActivity homeActivity;

        public ContactViewHolder(View itemView, HomeActivity homeActivity) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.imgId);
            Nama = (TextView) itemView.findViewById(R.id.namaKue);
            Jenis = (TextView)itemView.findViewById(R.id.jenisKue);
            checkBox = (CheckBox) itemView.findViewById(R.id.checkbox);
            this.homeActivity = homeActivity;
        }
    }
}
