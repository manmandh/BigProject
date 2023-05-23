package layout;
import entities.Computer;

import java.util.ArrayList;
public class ListComputer {
    ArrayList<Computer>ds;
    public ArrayList<Computer>getDS(){
        return ds;
    }
    public void setDs(ArrayList<Computer>ds){
        this.ds=ds;
    }
    public ListComputer(){
        ds=new ArrayList<Computer>();
    }
    public void Them(Computer nv){
        ds.add(nv);
    }
     public void Sua(Computer nv) {
         for (int i = 0; i < ds.size(); i++) {
             if (nv.getTen_may().equalsIgnoreCase(ds.get(i).getTen_may())) {
                 ds.set(i, nv);
             }
         }
     }
     public Computer Tim(String maNV) {
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
