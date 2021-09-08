package state;

/**

 * @author Administrator
 *
 */
public class ClientTest {

	public static void main(String[] args) {

	    //创建活动对象，奖品有一个
        RaffleActivity activity = new RaffleActivity(1);

        //连续抽奖30次
        for (int i = 0; i < 30; i++) {
            System.out.println("--------第" + (i + 1) + "----------");

            activity.debuctMoney();


            activity.raffle();
        }
	}

}
