package Model;

public class Nguoi_choi {
    protected int ID_NguoiChoi;
    protected String Ten_NguoiChoi;
    protected String MatKhau_NguoiChoi;
    protected int NapTien;
    
    public Nguoi_choi() {
    }

    public Nguoi_choi(int ID_NguoiChoi, String Ten_NguoiChoi, String MatKhau_NguoiChoi, int NapTien) {
        this.ID_NguoiChoi = ID_NguoiChoi;
        this.Ten_NguoiChoi = Ten_NguoiChoi;
        this.MatKhau_NguoiChoi = MatKhau_NguoiChoi;
        this.NapTien = NapTien;
    }

    public int getID_NguoiChoi() {
        return ID_NguoiChoi;
    }

    public void setID_NguoiChoi(int ID_NguoiChoi) {
        this.ID_NguoiChoi = ID_NguoiChoi;
    }

    public String getTen_NguoiChoi() {
        return Ten_NguoiChoi;
    }

    public void setTen_NguoiChoi(String Ten_NguoiChoi) {
        this.Ten_NguoiChoi = Ten_NguoiChoi;
    }

    public String getMatKhau_NguoiChoi() {
        return MatKhau_NguoiChoi;
    }

    public void setMatKhau_NguoiChoi(String MatKhau_NguoiChoi) {
        this.MatKhau_NguoiChoi = MatKhau_NguoiChoi;
    }

    public int getNapTien() {
        return NapTien;
    }

    public void setNapTien(int NapTien) {
        this.NapTien = NapTien;
    }

    @Override
    public String toString() {
        return "Nguoi_choi{" +
                "ID_NguoiChoi='" + ID_NguoiChoi + '\'' +
                ", Ten_NguoiChoi='" + Ten_NguoiChoi + '\'' +
                ", MatKhau_NguoiChoi='" + MatKhau_NguoiChoi + '\'' +
                ", NapTien=" + NapTien +
                '}';
    }
}
