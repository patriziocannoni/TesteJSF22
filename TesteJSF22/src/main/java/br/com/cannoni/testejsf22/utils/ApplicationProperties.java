package br.com.cannoni.testejsf22.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

/**
 * @author patrizio
 * @since 27/04/2016
 */
@Repository
public class ApplicationProperties {

	private final String propertiesFileName = "application.properties";
	
	private Properties properties;
	
	@PostConstruct
	private void load() {
		properties = new Properties();
		try {
			properties.load(new FileInputStream("/home/patrizio/Desenvolvimento/Servidores/apache-tomcat-8.0.24/conf/" + propertiesFileName));
		} catch (FileNotFoundException e) {
			loadFromClassPath();
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	private void loadFromClassPath() {
		InputStream classPathInputStream = ApplicationProperties.class.getClassLoader().getResourceAsStream(propertiesFileName);
		try {
			properties.load(classPathInputStream);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public String getProperty01() {
		return properties.getProperty("property_01");
	}
	
	public String getProperty02() {
		return properties.getProperty("property_02");
	}
	
}
