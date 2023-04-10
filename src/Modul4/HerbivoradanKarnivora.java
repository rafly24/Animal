package Modul4;

class HerbivoradanKarnivora extends Hewan implements Karnivora,Herbivora {
    public HerbivoradanKarnivora(String name, String sound) {
    super(name, sound);
}

    @Override
    String getAnimalType() {
        return "Carnivore and Herbivore";
    }

    @Override
    public void showFood() {
        System.out.println("Daging dan  tumbuhan");
    }
}
