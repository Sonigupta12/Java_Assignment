package org.nagarro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Tshirt {

	@Id

	@Column(name = "Tshirt_ID")
	private String id;

	@Column(name = "Tshirt_Name")
	private String name;

	@Column(name = "Color")
	private String color;

	@Column(name = "Gender")
	private String gender_recommendation;

	@Column(name = "Size")
	private String size;

	@Column(name = "Price")
	private Double price;

	@Column(name = "Rating")
	private float rating;

	@Column(name = "Availability")
	private String availability;

	public String getid() {
		return id;
	}

	public String getname() {
		return name;
	}

	public String getcolor() {
		return color;
	}

	public String getgender_recommendation() {
		return gender_recommendation;
	}

	public String getsize() {
		return size;
	}

	public double getprice() {
		return price;
	}

	public float getrating() {
		return rating;
	}

	public String getavailability() {
		return availability;
	}

	public String getdata() {

		return " TshirtID: " + getid() + " Name: " + getname() + " Color: " + getcolor() + " Gender: "
				+ getgender_recommendation() + " Size: " + getsize() + " Price: " + getprice() + " Rating: "
				+ getrating();
	}

	public void setid(String id) {
		this.id = id;
	}

	public void setname(String name) {
		this.name = name;
	}

	public void setcolor(String color) {
		this.color = color;
	}

	public void setgender_recommendation(String gender_recommendation) {
		this.gender_recommendation = gender_recommendation;

	}

	public void setsize(String data) {
		this.size = data;
	}

	public void setprice(double price) {
		this.price = price;
	}

	public void setrating(float rating) {
		this.rating = rating;
	}

	public void setavailability(String availability) {
		this.availability = availability;
	}
}
