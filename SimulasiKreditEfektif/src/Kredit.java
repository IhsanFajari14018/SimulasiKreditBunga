/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author i14018
 */
interface Kredit {
    
    /**
     * Menghitung biaya pokok
     * @return 
     */
    public double pokok();
    
    /**
     * Menghitung biaya pokok
     * @param bulanKe
     * @param pokok
     * @return 
     */
    public double bunga(int bulanKe, double pokok);
    
    /**
     * Menghitung biaya cicilan
     * @param pokok
     * @param bunga
     * @param admin
     * @return 
     */
    public double cicilan(double pokok, double bunga, double admin);
    
    /**
     * Simulator untuk menghitung Kredit Efektif
     * @return 
     */
    public String simulasi();
}
