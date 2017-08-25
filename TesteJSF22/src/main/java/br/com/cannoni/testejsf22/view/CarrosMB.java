package br.com.cannoni.testejsf22.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import br.com.cannoni.testejsf22.dao.CarroDAO;
import br.com.cannoni.testejsf22.model.Carro;

/**
 * @author Patrizio
 * @since 19/02/2014
 */
@ManagedBean
@RequestScoped
public class CarrosMB extends BaseMB {

	private static final long serialVersionUID = -8056570916653047015L;

	@ManagedProperty(value = "#{carroDAO}")
	private CarroDAO carroDAO;

	private List<Carro> carros;
	
	private Carro carro;

	@PostConstruct
	private void init() {
		carro = new Carro();
		carros = carroDAO.obterCarros();
	}

	public List<Carro> getCarros() {
		return carros;
	}
	
	public String inserirCarro() {
		carroDAO.inserirCarro(carro);
		return null;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	
	public void setCarroDAO(CarroDAO carroDAO) {
		this.carroDAO = carroDAO;
	}
	
}
