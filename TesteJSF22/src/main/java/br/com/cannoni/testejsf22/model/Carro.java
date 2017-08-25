package br.com.cannoni.testejsf22.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * @author patrizio
 * @since 31/03/2015
 */
@Entity
public class Carro {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String marca;

	@Column(nullable = false)
	private String modelo;

	@Column(nullable = false)
	private Integer ano;
	
	@OneToOne(optional = true)
	private CarroInfo carroInfo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public CarroInfo getCarroInfo() {
		return carroInfo;
	}

	public void setCarroInfo(CarroInfo carroInfo) {
		this.carroInfo = carroInfo;
	}

}
