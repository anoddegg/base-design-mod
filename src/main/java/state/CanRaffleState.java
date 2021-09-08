package state;

import java.util.Random;

/**
 *
 * @author Administrator
 *
 */
public class CanRaffleState extends State {

    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    //已经扣了积分，不能再扣了
    @Override
    public void deductMoney() {
        System.out.println("扣取过了积分");
    }

    //抽完奖后，根据实际情况，改编成新的状态
    @Override
    public boolean raffle() {
        System.out.println("");
        Random r = new Random();
        int num = r.nextInt(10);
        //10%中将机会
        if(num == 0){
            //改变成中将状态
            activity.setState(activity.getDispenseState());
            return true;
        }else{
            System.out.println("没抽中");
            // 改变不能抽奖状态
            activity.setState(activity.getNoRafflleState());
            return false;
        }
    }

    //
    @Override
    public void dispensePrize() {
        System.out.println("没中奖，不能发放奖品");
    }
}
