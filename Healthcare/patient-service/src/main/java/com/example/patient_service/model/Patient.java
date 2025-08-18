package com.example.patient_service.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private String gender;
    private String contactNumber;
    private String insuranceNumber;

    // Constructors
    public Patient() {}

    public Patient(String name, int age, String gender, String contactNumber, String insuranceNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contactNumber = contactNumber;
        this.insuranceNumber = insuranceNumber;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }

    public String getInsuranceNumber() { return insuranceNumber; }
    public void setInsuranceNumber(String insuranceNumber) { this.insuranceNumber = insuranceNumber; }
    
    // to string
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", contactNumber="
				+ contactNumber + ", insuranceNumber=" + insuranceNumber + "]";
	}
    
    
}

