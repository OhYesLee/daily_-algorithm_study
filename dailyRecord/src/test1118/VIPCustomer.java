package test1118;

/**
 * 우수 고객(VIPCustomer) 구현
 * 매출에 더 많은 기여를 하는 단골 고객
 * 제품을 살때 10%를 할인해 줌
 * 보너스 포인트는 제품 가격의 5%를 적립해 줌
 * 담당 전문 상담원이 배정됨
 * Customer 클래스에 추가해서 구현하는 것은 좋지 않음
 * VIPCustomer 클래스를 따로 구현
 * 이미 Customer에 구현된 내용이 중복되므로 Customer를 확장하여 구현함(상속)
 */
public class VIPCustomer extends Customer {

    private int agentID;
    double salesRatio;

    public VIPCustomer() {
        customerGrade = "VIP";    //오류 발생
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }

    public int getAgentID() {
        return agentID;
    }
}
