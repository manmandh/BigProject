package gui_quannet;
import Model.May_tinh;
import java.util.ArrayList;
public class DS_Maytinh {
    ArrayList<May_tinh>ds;
    public ArrayList<May_tinh>getDS(){
        return ds;
    }
    public void setDs(ArrayList<May_tinh>ds){
        this.ds=ds;
    }
    public DS_Maytinh(){
        ds=new ArrayList<May_tinh>();
    }
    public void Them(May_tinh nv){
        ds.add(nv);
    }
     public void Sua(May_tinh nv) {
         for (int i = 0; i < ds.size(); i++) {
             if (nv.getTen_may().equalsIgnoreCase(ds.get(i).getTen_may())) {
                 ds.set(i, nv);
             }
         }
     }
     public May_tinh Tim(String maNV) {
         for (int i = 0; i < ds.size(); i++) {
             if (ds.get(i).getTen_may().equalsIgnoreCase(maNV)) {
                 return ds.get(i);
             }
         }
         return null;
     }
    public void Xoa(String maNV){
        for(int i=0; i<ds.size(); i++){
            if(ds.get(i).getTen_may().equalsIgnoreCase(maNV)){
                ds.remove(i);
                break;
            }
        }
    } 
}
