package test1121;

public class Customer {
    // 디폴트 생성자 없애고 매개 변수가 있는 생성자 추가
    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;

        customerGrade = "SILVER";
        bonusRatio = 0.01;
        System.out.println("Customer(int, String) 생성자 호출");
    }

}
