public abstract class MotorTransport extends WheeledTransport {
    public MotorTransport(String mobelName, int wheelsCount) {
        super(mobelName, wheelsCount);
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void service() {
        super.service();
        checkEngine();
    }


}
