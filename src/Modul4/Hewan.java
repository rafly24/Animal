package Modul4;
 abstract class Hewan {
     String nama;
     String suara;

     public Hewan(String nama, String suara) {
         this.nama = nama;
         this.suara = suara;
     }

     public String getnama() {
         return nama;
     }

     public void setName(String nama) {
         this.nama = nama;
     }

     abstract String getAnimalType();

     public String getsuara() {
         return suara;
     }

     public void setSound(String suara) {
         this.suara = suara;
     }

     public void showFood() {
         System.out.println("Unknown food");
     }
}
