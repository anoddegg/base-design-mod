package builder.improve;

public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        House house = houseDirector.construceHouse();


        //
        HighBuilding hIghBuilding = new HighBuilding();

        houseDirector.setHouseBuilder(hIghBuilding);
        house = houseDirector.construceHouse();

    }
}
