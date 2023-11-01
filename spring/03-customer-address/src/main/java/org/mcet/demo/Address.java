package org.mcet.demo;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private Integer id=1;
	private String street="Udumalaipettai road";
	private String city="Pollachi";
	
	public Address() {}

	public Address(Integer id, String street, String city) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + "]";
	}
	
}
