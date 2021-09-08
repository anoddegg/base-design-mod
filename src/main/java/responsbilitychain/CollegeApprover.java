package responsbilitychain;

public class CollegeApprover extends Approver {

	public CollegeApprover(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	
	@Override
	public void processRequest(PurchaseRequest purchaseRequest) {
		// TODO Auto-generated method stub
		if(purchaseRequest.getPrice() > 5000 && 10000 >= purchaseRequest.getPrice()) {
			System.out.println(" 请求编号 id= " + purchaseRequest.getId() + " 被 " + this.name + "审批");
		}else {
			approver.processRequest(purchaseRequest);
		}
	}
}