package state;

/**
 * 奖品发完了状态
 * @author Administrator
 *
 */
public class DispenseOutState extends State {

	//
    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }
    @Override
    public void deductMoney() {
        System.out.println("不能扣积分，请下此再参加");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖，请下次在参加");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("没有奖品了，请下此再参加");
    }
}
