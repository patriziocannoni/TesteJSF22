package testejsf22.view;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import testejsf22.service.MemInfoService;

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
	
	public List<String> getMemoryInfo() {
		return memInfoService.getMemoryInfo().subList(0, 3);
	}

	public MemInfoService getMemInfoService() {
		return memInfoService;
	}

	public void setMemInfoService(MemInfoService memInfoService) {
		this.memInfoService = memInfoService;
	}

}
