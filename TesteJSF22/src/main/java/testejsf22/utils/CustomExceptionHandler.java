package testejsf22.utils;

import java.util.Iterator;

import javax.faces.FacesException;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerWrapper;
import javax.faces.context.FacesContext;
import javax.faces.event.ExceptionQueuedEvent;
import javax.faces.event.ExceptionQueuedEventContext;

/**
 * @author patrizio
 * @since 02/05/2016
 */
public class CustomExceptionHandler extends ExceptionHandlerWrapper {
	
	private ExceptionHandler wrapped;
	
	public CustomExceptionHandler(ExceptionHandler wrapped) {
		this.wrapped = wrapped;
	}
	
	@Override
	public ExceptionHandler getWrapped() {
		return wrapped;
	}
	
	@Override
	public void handle() throws FacesException {
		final Iterator<ExceptionQueuedEvent> i = getUnhandledExceptionQueuedEvents().iterator();
		
		while (i.hasNext()) {
            ExceptionQueuedEvent event = i.next();
            ExceptionQueuedEventContext context = (ExceptionQueuedEventContext) event.getSource();
            
            Throwable t = context.getException();
            
            FacesContext.getCurrentInstance().addMessage("ERROR", new FacesMessage(t.getCause().getMessage()));
		
            i.remove();
		}
		
		getWrapped().handle();
	}

}
