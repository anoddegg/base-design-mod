package builder.improve;

public class HouseDirector {
    HouseBuilder houseBuilder = null;
    //构造器传入
    public HouseDirector(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    //通过setter传入
    public void setHouseBuilder(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    //处理建造房子的流程
    public House construceHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
