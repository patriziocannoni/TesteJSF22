package testejsf22.view;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * @author patrizio
 * @since 05/04/2015
 */
@ManagedBean
@ViewScoped
public class QuestionarioMB extends BaseMB {

	/**
	 * Serial.
	 */
	private static final long serialVersionUID = 5484011394350028128L;

	private String resposta;

	private List<String> respostas;

	/**
	 * Construtor.
	 */
	public QuestionarioMB() {
		super();
	}

	@PostConstruct
	private void init() {
		System.out.println("Construtor " + this);
		carregarRespostas();
	}

	@SuppressWarnings("unchecked")
	private void carregarRespostas() {
		respostas = (List<String>) getObjectFromSessionMap("respostas");
		if (respostas == null) {
			respostas = new ArrayList<String>();
		}
	}

	public String vaiPagina(String pagina) {
		respostas.add(resposta);
		putObjectIntoSessionMap("respostas", respostas);
		return pagina;
	}

	public List<String> getRespostas() {
		return respostas;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

}
