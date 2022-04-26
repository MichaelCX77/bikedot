package com.mcx.bikedotcatalog.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CARRIER_TYPE")
public class CarrierType implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "id")
	private AccessibilityType accessibility;
	
	public CarrierType() {
		super();
	}

	public CarrierType(Long id, String name, AccessibilityType accessibility) {
		super();
		this.id = id;
		this.name = name;
		this.accessibility = accessibility;
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

	public AccessibilityType getAccessibility() {
		return accessibility;
	}

	public void setAccessibility(AccessibilityType accessibility) {
		this.accessibility = accessibility;
	}

	@Override
	public String toString() {
		return "PortadorType [id=" + id + ", name=" + name + ", accessibility=" + accessibility + "]";
	}
	
}
