package controle;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.event.ActionEvent;

@ManagedBean(name="controleComponentes")
@SessionScoped
public class ControleComponentes implements Serializable{
	private String texto;
	private String idComponente;
	
	public ControleComponentes(){
		
	}
	
	public String geraTexto(){
		texto = "texto gerado: < > & <b> Texto em negrito</b></br>";
		return "componentesParte2";
	}

	public String getTexto() {
		return texto;
	}
	
	public String executar(){
		return "componentesParte3";
	}
	
	
	public void listener(ActionEvent event){
		UIComponent source = event.getComponent(); //captura qual componente executou a ação
		idComponente = "Componente que executou a ação: " + source.getId();
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getIdComponente() {
		return idComponente;
	}

	public void setIdComponente(String idComponente) {
		this.idComponente = idComponente;
	}
	
	
}
