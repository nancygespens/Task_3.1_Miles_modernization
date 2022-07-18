public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000; // стоимость билета
        int miles = service.calculate(price); // количество миллей
        System.out.println();
        System.out.println("Цена билета: " + price + " рублей");
        System.out.println();
        System.out.println("За каждые 20 рублей, потраченные на билет, начисляется 1 миля");
        System.out.println();
        System.out.println("Количество начисленных мили за купленный билет: " + miles + " миль");
    }
}