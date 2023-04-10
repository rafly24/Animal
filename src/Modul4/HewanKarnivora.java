package Modul4;

class HewanKarnivora extends Hewan implements Karnivora {
    public HewanKarnivora(String name, String sound) {
        super(name, sound);
    }

    @Override
    String getAnimalType() {
        return "Carnivore";
    }

    @Override
    public void showFood() {
        System.out.println("daging");
    }
}
