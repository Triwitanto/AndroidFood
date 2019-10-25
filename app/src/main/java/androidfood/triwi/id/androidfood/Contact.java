package androidfood.triwi.id.androidfood;

/**
 * Created by TRW on 3/10/2018.
 */

class Contact {

    private int imgId;
    private String namaKue, jenisKue;

    Contact(int imgId, String namaKue, String jenisKue){
        this.setImgId(imgId);
        this.setNamaKue(namaKue);
        this.setJenisKue(jenisKue);
    }
    int getImgId() {
        return imgId;
    }

    private void setImgId(int imgId) {
        this.imgId = imgId;
    }

    String getNamaKue() {
        return namaKue;
    }

    private void setNamaKue(String namaKue) {
        this.namaKue = namaKue;
    }

    String getJenisKue() {
        return jenisKue;
    }

    private void setJenisKue(String jenisKue) {
        this.jenisKue = jenisKue;
    }
}
