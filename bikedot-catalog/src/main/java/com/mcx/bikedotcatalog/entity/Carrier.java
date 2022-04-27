package com.mcx.bikedotcatalog.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Carrier implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "id")
	private CarrierType type;
	
	private String description;
	
	private String refrence;
	
	public Carrier() {
		super();
	}

	public Carrier(Long id, CarrierType type, String description, String refrence) {
		super();
		this.id = id;
		this.type = type;
		this.description = description;
		this.refrence = refrence;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CarrierType getType() {
		return type;
	}

	public void setType(CarrierType type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRefrence() {
		return refrence;
	}

	public void setRefrence(String refrence) {
		this.refrence = refrence;
	}

	@Override
	public String toString() {
		return "Carrier [id=" + id + ", type=" + type + ", description=" + description + ", refrence=" + refrence + "]";
	}
}
