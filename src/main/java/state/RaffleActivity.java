package state;

/**
 *
 * 抽奖活动
 * @author Administrator
 *
 */
public class RaffleActivity {

	// state表示当前状态，在活动中是变化的
    State state = null;

    //奖品数量
    int count = 0;

    //四个属性表示四种状态，使用单例模式，然后getInstance，可以不拥有这四个属性
    State noRafflleState = new NoRaffleState(this);
    State canRaffleState = new CanRaffleState(this);

    State dispenseState =   new DispenseState(this);
    State dispensOutState = new DispenseOutState(this);

    //构造器初始化奖品数量和当前状态
    public RaffleActivity( int count) {
        //初始化为不能抽奖状态
        this.state = getNoRafflleState();
        //初始化奖品数量
        this.count = count;
    }

    public void debuctMoney(){
        state.deductMoney();
    }

    //抽奖
    public void raffle(){
        //如果抽奖成功，
        if(state.raffle()){
            //领奖品
            state.dispensePrize();
        }

    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    //领取一次奖品
    public int getCount() {
    	int curCount = count; 
    	count--;
        return curCount;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getNoRafflleState() {
        return noRafflleState;
    }

    public void setNoRafflleState(State noRafflleState) {
        this.noRafflleState = noRafflleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(State canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(State dispenseState) {
        this.dispenseState = dispenseState;
    }

    public State getDispensOutState() {
        return dispensOutState;
    }

    public void setDispensOutState(State dispensOutState) {
        this.dispensOutState = dispensOutState;
    }
}
