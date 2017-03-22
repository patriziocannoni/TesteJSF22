/**
 * 
 */
package testejsf22.service;

import java.util.List;

import testejsf22.model.MemoryInfo;

/**
 * @author patrizio
 *
 */
public interface MemInfoService {

	List<MemoryInfo> getMemoryInfo();
	
	List<String> getDiskInfo();
	
}
