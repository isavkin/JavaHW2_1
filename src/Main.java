public class Main {
    public static void main(String[] args) {
        BmiService servise = new BmiService();
        double height = 1.87;
        int weight = 98;
        int index = servise.calculate(weight, height);
        System.out.print(index);
    }
}