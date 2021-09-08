package prototype.improve;

public class Sheep implements Cloneable{
    private String name;
    private int age;
    private String color;

     public Sheep(String name, int age, String color){
         super();
         this.name = name;
         this.age =age;
         this.color = color;

     }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age){
         this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }
    public String getName(){
         return name;
    }

    @Override
    public String toString() {
        return "name " + this.name + "； age" + this.age + "； color" + this.color;
    }

    @Override
    protected Object clone() {
        Sheep sheep = null;
        try{sheep = (Sheep)super.clone();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
         return sheep;
    }
}
