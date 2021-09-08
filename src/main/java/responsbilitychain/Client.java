package responsbilitychain;

public class Client {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		//新增购买请求
		PurchaseRequest purchaseRequest = new PurchaseRequest(1, 100000, 1);

		//创建不同级别管理者
		DepartmentApprover departmentApprover = new DepartmentApprover("部门管理者");
		CollegeApprover collegeApprover = new CollegeApprover("学院管理者");
		ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("副校长");
		SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("校长");
	
	
		//set下一级别
		departmentApprover.setApprover(collegeApprover);
		collegeApprover.setApprover(viceSchoolMasterApprover);
		viceSchoolMasterApprover.setApprover(schoolMasterApprover);
		schoolMasterApprover.setApprover(departmentApprover);
		
		
		//审批请求
		departmentApprover.processRequest(purchaseRequest);
		viceSchoolMasterApprover.processRequest(purchaseRequest);
	}

}
