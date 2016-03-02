package testejsf22.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import testejsf22.dao.CarroDAO;
import testejsf22.model.Carro;

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

	@PostConstruct
	private void init() {
		carros = carroDAO.obterCarros();
	}

	public List<Carro> getCarros() {
		return carros;
	}

	public void setCarroDAO(CarroDAO carroDAO) {
		this.carroDAO = carroDAO;
	}

}
