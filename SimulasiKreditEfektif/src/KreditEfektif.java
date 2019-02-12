/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author i14018
 */
public class KreditEfektif {
    
    private double pinjaman ;
    private double sukuBunga;
    private double tenor;
    private double biayaAdmin;
    
    public KreditEfektif(double p, double sb, int t, double ba){
        this.pinjaman = p;
        this.sukuBunga = sb;
        this.tenor = t;
        this.biayaAdmin = ba;
    }
    
    /**
     * Menhitung biaya pokok
     * @return value pokok tipe double
     */
    private double pokok(){
        double valuePokok;
        valuePokok = this.pinjaman/this.tenor;
        return valuePokok;
    }
    
    /**
     * Menhitung biaya pokok
     * @return value pokok tipe double
     */
    private double bunga(int bulanKe, double pokok){
        double valueBunga;
        valueBunga = ((this.pinjaman-(bulanKe*pokok))*(this.sukuBunga/100))/this.tenor;
        return valueBunga;    
    }
    
    /**
     * Menghitung biaya pokok
     * @return value pokok tipe double
     */
    private double cicilan(double pokok, double bunga){
        return pokok+bunga;
    }
    
    /**
     * Menghitung decimal agar output menjadi 2 angka dibelakang koma (,)
     * @param value
     * @param places
     * @return 
     */
    private double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
    
    public String simulasi(){
        String output = "Periode | Angsuran Bunga | Angsuran Pokok | Total Angsuran | Sisa Pinjaman";
        double tempPokok;
        double tempBunga;
        double tempTotalAngsuran;
        double tempSisaPinjaman = this.pinjaman;
        
        for (int i = 0; i < this.tenor; i++) {
            tempPokok = this.pokok();                        
            tempBunga = this.bunga(i,tempPokok);            
            tempTotalAngsuran = this.cicilan(tempPokok,tempBunga);            
            tempSisaPinjaman = tempSisaPinjaman - tempPokok;            
            output += "\n"+(i+1)+"       | "+String.format("%.2f",tempBunga)+"     | "+String.format("%.2f",tempPokok)+"    | "+String.format("%.2f",tempTotalAngsuran)+"    | "+String.format("%.2f",tempSisaPinjaman);
        }       
        
        return output;
    }
            
            
}
