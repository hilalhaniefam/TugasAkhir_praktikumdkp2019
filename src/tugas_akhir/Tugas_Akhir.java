
package tugas_akhir;

public class Tugas_Akhir {
   private int Harga;
   private double Berat;
   private double ttlharga;
   
    public void setHarga(int harga) {
        this.Harga=harga;
    }
    
    public void setBerat(double berat) {
        this.Berat=berat;
    }
    public double getHasil (){
        return ttlharga ;
    }
   public void perhitungan (){
       this.ttlharga=this.Harga*this.Berat;
    }
}


