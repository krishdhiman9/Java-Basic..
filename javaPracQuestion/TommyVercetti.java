package javaPracQuestion;

class TommyVercetti {

    void hitting() {
        System.out.println("Tommy is hitting");
    }

    void running() {
        System.out.println("Tommy is running");
    }

    void firing() {
        System.out.println("Tommy is firing");
    }

    public static void main(String[] args) {
        TommyVercetti t = new TommyVercetti();

        t.hitting();
        t.running();
        t.firing();
    }
}
