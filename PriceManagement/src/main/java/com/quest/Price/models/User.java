package com.quest.Price.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users_tb")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private String email;
	
	@Column(nullable=false)
	private String fullname;
	
	@Column(nullable=false)
	private  String address;
	
	@Column(nullable=false)
    private String city;
	
    @Column(nullable=false)
	private String state;
    
    @Column(nullable=false)
    private Integer zipcode;
    
    @Column(nullable=false)
    private String nameofcard;
    
    @Column(nullable=false)
    private Integer credit_debit_card;
    
    @Column(nullable=false)
    private String expmonth;
    
    @Column(nullable=false)
    private Integer expyear;
    
    @Column(nullable=false)
    private Integer cvv;
    
    public User() {
	}

	public User(Long id, String email, String fullname, String address, String city, String state, Integer zipcode,
			String nameofcard, Integer credit_debit_card, String expmonth, Integer expyear, Integer cvv) {
		this.id = id;
		this.email = email;
		this.fullname = fullname;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.nameofcard = nameofcard;
		this.credit_debit_card = credit_debit_card;
		this.expmonth = expmonth;
		this.expyear = expyear;
		this.cvv = cvv;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getZipcode() {
		return zipcode;
	}

	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}

	public String getNameofcard() {
		return nameofcard;
	}

	public void setNameofcard(String nameofcard) {
		this.nameofcard = nameofcard;
	}

	public Integer getCredit_debit_card() {
		return credit_debit_card;
	}

	public void setCredit_debit_card(Integer credit_debit_card) {
		this.credit_debit_card = credit_debit_card;
	}

	public String getExpmonth() {
		return expmonth;
	}

	public void setExpmonth(String expmonth) {
		this.expmonth = expmonth;
	}

	public Integer getExpyear() {
		return expyear;
	}

	public void setExpyear(Integer expyear) {
		this.expyear = expyear;
	}

	public Integer getCvv() {
		return cvv;
	}

	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", fullname=" + fullname + ", address=" + address + ", city="
				+ city + ", state=" + state + ", zipcode=" + zipcode + ", nameofcard=" + nameofcard
				+ ", credit_debit_card=" + credit_debit_card + ", expmonth=" + expmonth + ", expyear=" + expyear
				+ ", cvv=" + cvv + "]";
	}


}
