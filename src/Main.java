
public class Main {
    public static void main(String[] args) {
        WheeledTransport[] transports = new WheeledTransport[]{
                new Car("car 1",4),
                new Car("car 2",4),
                new Truck("truck 1",6),
                new Truck("truck 2",8),
                new Bicycle("bicycle 1",2),
                new Bicycle("bicycle 2",2)
        };
        for (WheeledTransport transport : transports) {
            transport.service();
            System.out.println();
        }
    }
}