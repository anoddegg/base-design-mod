package builder.improve;

public class House {
    private String baise;
    private String wall;
    private String roofed;
    public String getBaise(){
        return baise;
    }

    public String getWall() {
        return wall;
    }

    public String getRoofed(){
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }

    public void setBaise(String baise) {
        this.baise = baise;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }
}
