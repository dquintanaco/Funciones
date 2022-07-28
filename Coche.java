public class Coche {
    private int numCarDoor;

    public Coche (int numCarDoor) {
        this.numCarDoor = numCarDoor;
    }
    public void addDoor() {
        this.numCarDoor++;
    }

    public int getNumCarDoor() {
        return numCarDoor;
    }

    public static void main(String[] args) {
        Coche coche = new Coche(3);

        coche.addDoor();

        System.out.println(coche.getNumCarDoor());
    }
}
