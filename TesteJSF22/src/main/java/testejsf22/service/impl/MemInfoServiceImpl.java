/**
 * 
 */
package testejsf22.service.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import testejsf22.service.MemInfoService;

/**
 * @author patrizio
 *
 */
@Service("memInfoService")
public class MemInfoServiceImpl implements MemInfoService {
	
	@Override
	public List<String> getMemoryInfo() {
		List<String> memLines = new ArrayList<>();
		try {
			memLines = Files.readAllLines(Paths.get("/proc/meminfo"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return memLines;
	}

}
