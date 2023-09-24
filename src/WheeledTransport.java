public abstract class WheeledTransport {
    private final String mobelName;
    final int wheelsCount;

    public WheeledTransport(String mobelName, int wheelsCount) {
        this.mobelName = mobelName;
        this.wheelsCount = wheelsCount;
    }

    public String getMobelName() {
        return mobelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void service() {
        System.out.println("Обслуживаем " + mobelName);
        System.out.println();
    }

    public void checkTyre(int wheels) {
        for (int i = 0; i < wheels; i++) {
            System.out.println("Меняем покрышку");
        }
    }


}