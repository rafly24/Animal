package Modul4;

public class Main {
    public static void main(String[] args) {
        Hewan cat = new HewanKarnivora("kucing", "miaw");
        Hewan bear = new HerbivoradanKarnivora("beruang", "haumm");
        Hewan dog = new HewanKarnivora("Anjing", "wouff");
        Hewan horse = new Hewanherbivora("Kuda", "igh");

        System.out.println(cat.getnama() + " adalah " + cat.getAnimalType() + ", suara: " + cat.getsuara() + " Makanan:");
        cat.showFood();
        System.out.println(bear.getnama() + "adalah " + bear.getAnimalType() + ", suara: " + bear.getsuara() + " Makanan:");
        bear.showFood();
        System.out.println(dog.getnama() + " adalah" + dog.getAnimalType() + ", Suara: " + dog.getsuara() + " Makanan:");
        dog.showFood();
        System.out.println(horse.getnama() + " adalah " + horse.getAnimalType() + ", suara: " + horse.getsuara() + "Makanan:");
        horse.showFood();
    }
}
