package fahruddin_kadir_161204;

//this package library
import java.util.Scanner;

/**
 *
 * @author Fahruddin Kadir
 */
public class Tugas1_161204 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masukan = new Scanner (System.in);
        
        String nama,kelas,alamat,stb;
        int umur;
        float nilaiTugas,nilaiFinal;
        
        //proses input Nama
        System.out.print("Masukan Nama : ");
        nama = masukan.next();
        
        System.out.print("\nMasukan Stb : ");
        stb = masukan.next();
        
        System.out.print("\nMasukan Kelas : ");
        kelas = masukan.next();
        
        System.out.print("\nMasukan alamat : ");
        alamat = masukan.next();
        
        System.out.print("\nMasukan Umur : ");
        umur = Integer.parseInt(masukan.next());        //convert ke integer (bilangan bulat)
        
        System.out.print("\nMasukan Nilai Tugas : ");
        nilaiTugas = Float.parseFloat(masukan.next());  //convert to Float
        
        System.out.print("\nMasukan alamat : ");
        nilaiFinal = Float.parseFloat(masukan.next());  //convert to Float
        
        
        //Proses cetak        
        System.out.print("\nNama :" + nama);
        System.out.print("\nStb :" + stb);                
        System.out.print("\nKelas :" + kelas);
        System.out.print("\nalamat :" + alamat);
        System.out.print("\numur :" + umur);        
        System.out.print("\nNilai Tugas :" + nilaiTugas);        
        System.out.print("\nNilai Final :" + nilaiFinal);
    }   
}
