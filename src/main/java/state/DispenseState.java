package state;

/**
 * 发放奖品
 * @author Administrator
 *
 */
public class DispenseState extends State {

    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }
    
    //

    @Override
    public void deductMoney() {
        System.out.println("不能抽奖");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖");
        return false;
    }

    //发放奖品
    @Override
    public void dispensePrize() {
        if(activity.getCount() > 0){
            System.out.println("恭喜中奖了");
            // 改为不能抽奖状态
            activity.setState(activity.getNoRafflleState());
        }else{
            System.out.println("奖品发完了");
            // 改变状态为不能抽奖
            activity.setState(activity.getDispensOutState());
        }

    }
}
