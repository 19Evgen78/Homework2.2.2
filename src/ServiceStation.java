public class ServiceStation extends MotorTransport{

    public ServiceStation(String mobelName, int wheelsCount) {
        super(mobelName, wheelsCount);
    }

    public void check(WheeledTransport wheeledTransport) {
        service();
        checkTyre(wheelsCount);

    }
}
