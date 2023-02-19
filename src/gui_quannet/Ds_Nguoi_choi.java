package gui_quannet;
import Model.Nguoi_choi;

import java.util.ArrayList;

public class Ds_Nguoi_choi {
    ArrayList<Nguoi_choi>ds;
    public ArrayList<Nguoi_choi>getDS(){
        return ds;
    }
    
    public void setDs(ArrayList<Nguoi_choi>ds){
        this.ds=ds;
    }
    
    public Ds_Nguoi_choi(){
        ds = new ArrayList<Nguoi_choi>();
    }
    
    public void Them(Nguoi_choi nv){
        ds.add(nv);
    }
//
//    public void Sua(Nguoi_choi nv){
//        for(int i=0;i<ds.size();i++){
//            if(nv.getID_NguoiChoi().trim().equalsIgnoreCase(ds.get(i).ID_NguoiChoi)){
//                ds.set(i, nv);
//            }
//        }
//    }
    
    public Nguoi_choi Tim(int maNV){
        for(int i=0;i<ds.size();i++){
            if(ds.get(i).getID_NguoiChoi()== maNV){
                return ds.get(i);
            }
        }
        return null;
    }

    public void Xoa(int maNV){
        for(int i=0;i<ds.size();i++){
            if(ds.get(i).getID_NguoiChoi() == maNV){
                ds.remove(i);
                break;
            }
        }
    }
}
