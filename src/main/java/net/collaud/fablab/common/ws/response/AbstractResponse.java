package net.collaud.fablab.common.ws.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gaetan Collaud <gaetancollaud@gmail.com>
 */
@XmlRootElement
abstract public class AbstractResponse {
	
	private final List<String> errors;

	public AbstractResponse() {
		errors = new ArrayList<>();
	}
	
	public void addError(String error){
		errors.add(error);
	}
	
	@XmlElement
	public boolean isError(){
		return !errors.isEmpty();
	}

	@XmlElement
	public List<String> getErrors() {
		return errors;
	}
	
}
