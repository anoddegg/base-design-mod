package memento.game;

public class GameRole {

    private int vit;
    private int def;

    // 创建memento，根据当前的状态得到
    public Memento createMemento(){
        return new Memento(vit, def);
    }

    //从备忘录对象，恢复GameROle
    public void recoverGameRoleFromMemento(Memento memento){
        this.def = memento.getDef();
        this.vit = memento.getVit();
    }

    //显示当前游戏角色的状态
    public void display(){
        System.out.println("状态vit" + this.vit+"状态def" + this.vit);
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }
}
