public class BonusMilesService {

    int cost = 20; // количество рублей для одной бонусной милли

    public int calculate(int price) {
        int result;
        result = price / cost;
        return result;
    }

}
