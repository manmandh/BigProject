package entities;
import java.util.Date;
public class Computer {
    protected String ten_may;
    protected Date timeVao;
    protected Date timeRa;
    protected Double tongTien;
    public Computer() {
    }

    public Computer(String ten_may, Date timeVao, Date timeRa, Double tongTien) {
        this.ten_may = ten_may;
        this.timeVao = timeVao;
        this.timeRa = timeRa;
        this.tongTien = tongTien;
    }
    public String getTen_may() {
        return ten_may;
    }

    public void setTen_may(String ten_may) {
        this.ten_may = ten_may;
    }

    public Date getTimeVao() {
        return timeVao;
    }

    public void setTimeVao(Date timeVao) {
        this.timeVao = timeVao;
    }

    public Date getTimeRa() {
        return timeRa;
    }

    public void setTimeRa(Date timeRa) {
        this.timeRa = timeRa;
    }

    public Double getTongTien() {
        return tongTien;
    }

    public void setTongTien(Double tongTien) {
        this.tongTien = tongTien;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ten_may='" + ten_may + '\'' +
                ", timeVao=" + timeVao +
                ", timeRa=" + timeRa +
                ", tongTien=" + tongTien +
                '}';
    }
}
