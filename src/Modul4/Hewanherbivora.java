package Modul4;

class Hewanherbivora extends Hewan implements Herbivora {
    public Hewanherbivora(String name, String sound) {
        super(name, sound);
    }

    @Override
    String getAnimalType() {
        return "Herbivore";
    }

    @Override
    public void showFood() {
        System.out.println("Tumbuhan");
    }

}
