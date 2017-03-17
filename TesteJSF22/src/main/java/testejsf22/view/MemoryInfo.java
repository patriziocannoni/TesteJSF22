/**
 * 
 */
package testejsf22.view;

/**
 * @author patrizio
 * 
 */
public class MemoryInfo {
	
	private String description;
	
	private String value;
	
	public MemoryInfo(String description, String value) {
		this.description = description;
		this.value = value;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
