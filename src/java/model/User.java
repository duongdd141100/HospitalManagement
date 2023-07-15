package model;

/**
 *
 */
public class User {
    
    private Long id;
    
    private String name;
    
    private String address;
    
    private Integer age;
    
    private Boolean gender;
    
    private String username;
    
    private String password;
    
    private String role;

    public User(Long id, String name, String address, Integer age, Boolean gender, String username, String password, String role) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.gender = gender;
        this.username = username;
        this.password = password;
        this.role = role;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
