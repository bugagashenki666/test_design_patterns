public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Car car = director.construct("BMW;turboGL325;4;false");
        System.out.println(car.toString());
    }
}
