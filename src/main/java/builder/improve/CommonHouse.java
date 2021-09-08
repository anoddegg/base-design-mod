package builder.improve;

public class CommonHouse extends HouseBuilder {
    public void buildBasic() {
        System.out.println("给普通房子打地基5m");
    }

    public void buildWalls() {
        System.out.println("给普通房子砌墙");
    }

    public void roofed() {
        System.out.println("给普通房子盖房顶");
    }
}
