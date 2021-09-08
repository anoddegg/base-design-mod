package builder.improve;

public class HighBuilding extends HouseBuilder {
    public void buildBasic() {
        System.out.println("高楼地基100");
    }

    public void buildWalls() {
        System.out.println("高楼墙10cm");
    }

    public void roofed() {
        System.out.println("高楼屋顶");
    }
}
