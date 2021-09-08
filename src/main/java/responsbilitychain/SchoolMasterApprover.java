package responsbilitychain;

public class SchoolMasterApprover extends Approver {

	public SchoolMasterApprover(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	
	@Override
	public void processRequest(PurchaseRequest purchaseRequest) {
		// TODO Auto-generated method stub
		if(purchaseRequest.getPrice() > 30000) {
			System.out.println(" 请求编号 id= " + purchaseRequest.getId() + " 被 " + this.name + "审批");
		}else {
			System.out.println("处理不了");
		}
	}
}
