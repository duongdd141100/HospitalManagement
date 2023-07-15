package model;

/**
 *
 */
public class Medicine {
    
    private Long id;
    
    private String name;
    
    private Double price;
    
    private String information;
    
    private Integer amount;

    public Medicine(Long id, String name, Double price, String information, Integer amount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.information = information;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    
}
