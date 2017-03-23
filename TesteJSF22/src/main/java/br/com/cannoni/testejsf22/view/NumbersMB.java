package br.com.cannoni.testejsf22.view;

import java.math.BigDecimal;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import br.com.cannoni.testejsf22.service.NumberService;

/**
 * @author patrizio
 * @since 03/05/2015
 */
@ManagedBean
@ViewScoped
public class NumbersMB extends BaseMB {
	
	private static final long serialVersionUID = 523075813676629297L;

	private BigDecimal number01;
	
	private BigDecimal number02;
	
	private BigDecimal result;
	
	@ManagedProperty(value = "#{numberService}")
	private NumberService numberService;
	
	public void calculateDivision() {
		result = numberService.calculateDivision(number01, number02);
	}

	public BigDecimal getNumber01() {
		return number01;
	}

	public void setNumber01(BigDecimal number01) {
		this.number01 = number01;
	}

	public BigDecimal getNumber02() {
		return number02;
	}

	public void setNumber02(BigDecimal number02) {
		this.number02 = number02;
	}

	public BigDecimal getResult() {
		return result;
	}

	public void setNumberService(NumberService numberService) {
		this.numberService = numberService;
	}
}
