package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
	@Id
	private int id;

	private String permntaddress;

	private String tempaddress;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPermntaddress() {
		return permntaddress;
	}

	public void setPermntaddress(String permntaddress) {
		this.permntaddress = permntaddress;
	}

	public String getTempaddress() {
		return tempaddress;
	}

	public void setTempaddress(String tempaddress) {
		this.tempaddress = tempaddress;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", permntaddress=" + permntaddress + ", tempaddress=" + tempaddress + "]";
	}

}
