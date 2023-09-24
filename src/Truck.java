public class Truck extends MotorTransport {
    public Truck(String mobelName, int wheelsCount) {
        super(mobelName, wheelsCount);
    }

    private void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void service() {
        super.service();
        checkTrailer();

    }

}
