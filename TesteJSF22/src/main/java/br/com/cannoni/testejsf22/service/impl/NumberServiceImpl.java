package br.com.cannoni.testejsf22.service.impl;

import java.math.BigDecimal;
import java.math.MathContext;

import org.springframework.stereotype.Component;

import br.com.cannoni.jagent.service.exception.ServiceException;
import br.com.cannoni.testejsf22.service.NumberService;

/**
 * @author patrizio
 * @since 03/05/2016
 */
@Component("numberService")
public class NumberServiceImpl implements NumberService {
	
	@Override
	public BigDecimal calculateDivision(BigDecimal dividend, BigDecimal divisor) {
		try {
			return dividend.divide(divisor, MathContext.DECIMAL32);
		} catch (Exception e) {
			throw new ServiceException(e.getMessage(), e);
		}
	}

}
