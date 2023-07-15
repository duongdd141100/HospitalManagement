package model;

/**
 *
 */
public class HealthcareService {
    
    private Long id;
    
    private String name;
    
    private Double price;
    
    private String information;

    public HealthcareService(Long id, String name, Double price, String information) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.information = information;
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
    
}
