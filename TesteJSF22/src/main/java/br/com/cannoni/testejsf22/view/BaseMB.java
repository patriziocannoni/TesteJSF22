package br.com.cannoni.testejsf22.view;

import java.io.Serializable;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author patrizio
 * @since 16/04/2015
 */
@SuppressWarnings("serial")
public abstract class BaseMB implements Serializable {

	protected final Object getObjectFromSessionMap(String key) {
		return getExternalContext().getSessionMap().get(key);
	}

	protected final Object getAndRemoveObjectFromSessionMap(String key) {
		Object object = getExternalContext().getSessionMap().get(key);
		getExternalContext().getSessionMap().remove(key);
		return object;
	}

	protected final void putObjectIntoSessionMap(String key, Object object) {
		getExternalContext().getSessionMap().put(key, object);
	}

	private ExternalContext getExternalContext() {
		return FacesContext.getCurrentInstance().getExternalContext();
	}

}
