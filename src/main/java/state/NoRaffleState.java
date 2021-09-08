package state;

/**
 * 不能抽奖的状态
 * @author Administrator
 *
 */
public class NoRaffleState extends State {

    //初始化是传入活动引用
    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    //当前状态可以扣积分，扣除后将状态设置成可抽奖状态
    @Override
    public void deductMoney() {
        System.out.println("扣除积分50，可以抽奖");
        activity.setState(activity.getCanRaffleState());
    }

    // 当前状态不能抽奖
    @Override
    public boolean raffle() {
        System.out.println("扣分之后才能抽奖");
        return false;
    }

    // 当前状态不能发放奖品
    @Override
    public void dispensePrize() {
        System.out.println("不能发奖品");
    }
}
