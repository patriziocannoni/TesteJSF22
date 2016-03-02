package testejsf22.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import testejsf22.dao.MockDataDAO;
import testejsf22.model.MockData;

/**
 * @author patrizio
 * @since 03/06/2015
 */
@ManagedBean
@ViewScoped
public class MockDataMB extends BaseMB {

	private static final long serialVersionUID = 1902978664827034540L;

	@ManagedProperty(value = "#{mockDataDAO}")
	private MockDataDAO mockDataDAO;

	private List<MockData> mockDatas;

	@PostConstruct
	private void init() {
		mockDatas = mockDataDAO.obterMockData();
	}

	public List<MockData> getMockDatas() {
		return mockDatas;
	}

	public void setMockDataDAO(MockDataDAO mockDataDAO) {
		this.mockDataDAO = mockDataDAO;
	}

}
