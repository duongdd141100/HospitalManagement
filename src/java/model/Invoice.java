package model;

/**
 *
 */
public class Invoice {
    
    private Integer id;
    
    private Double totalAmount;
    
    private String paymentStatus;
    
    private String userFullName;

    public Invoice(Integer id, Double totalAmount, String paymentStatus, String userFullName) {
        this.id = id;
        this.totalAmount = totalAmount;
        this.paymentStatus = paymentStatus;
        this.userFullName = userFullName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }
    
}
