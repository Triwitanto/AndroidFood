package androidfood.triwi.id.androidfood;

/**
 * Created by TRW on 3/10/2018.
 */

public class Contact {

    int img_id;
    String nama_kue, jenis_kue;

    public Contact(int img_id, String nama_kue, String jenis_kue){

        this.setImg_id(img_id);
        this.setNama_kue(nama_kue);
        this.setJenis_kue(jenis_kue);

    }
    public int getImg_id() {
        return img_id;
    }

    public void setImg_id(int img_id) {
        this.img_id = img_id;
    }

    public String getNama_kue() {
        return nama_kue;
    }

    public void setNama_kue(String nama_kue) {
        this.nama_kue = nama_kue;
    }

    public String getJenis_kue() {
        return jenis_kue;
    }

    public void setJenis_kue(String jenis_kue) {
        this.jenis_kue = jenis_kue;
    }
}
