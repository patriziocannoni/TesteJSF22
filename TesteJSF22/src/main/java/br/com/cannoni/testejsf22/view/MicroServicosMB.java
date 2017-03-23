package br.com.cannoni.testejsf22.view;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import br.com.cannoni.jagent.model.MemoryInfo;
import br.com.cannoni.jagent.service.MemInfoService;

/**
 * @author Patrizio
 * @since 19/02/2014
 */
@ManagedBean
@RequestScoped
public class MicroServicosMB extends BaseMB {
	
	private static final long serialVersionUID = 3292584361945796547L;
	
	@ManagedProperty(value = "#{memInfoService}")
	private MemInfoService memInfoService;
	
	private List<MemoryInfo> displayInformations = new ArrayList<>();
	
	public List<MemoryInfo> getMemoryInfo() {
		List<MemoryInfo> list = memInfoService.getMemoryInfo();
		if (displayInformations.isEmpty()) {
			displayInformations.add(list.get(0));
			displayInformations.add(list.get(1));
		}
		return displayInformations;
	}
	
	public List<String> getDiskInfo() {
		return memInfoService.getDiskInfo();
	}

	public MemInfoService getMemInfoService() {
		return memInfoService;
	}

	public void setMemInfoService(MemInfoService memInfoService) {
		this.memInfoService = memInfoService;
	}

}
