package layout;
import entities.Player;

import java.util.ArrayList;

public class ListPlayer {
    ArrayList<Player>ds;
    public ArrayList<Player>getDS(){
        return ds;
    }
    
    public void setDs(ArrayList<Player>ds){
        this.ds=ds;
    }
    
    public ListPlayer(){
        ds = new ArrayList<Player>();
    }
    
    public void Them(Player nv){
        ds.add(nv);
    }
//
//    public void Sua(Player nv){
//        for(int i=0;i<ds.size();i++){
//            if(nv.getID_NguoiChoi().trim().equalsIgnoreCase(ds.get(i).ID_NguoiChoi)){
//                ds.set(i, nv);
//            }
//        }
//    }
    
    public Player Tim(int maNV){
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
