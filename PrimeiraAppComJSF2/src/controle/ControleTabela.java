package controle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import controle.Pessoa;

@ManagedBean(name="controleTabela")
@SessionScoped
public class ControleTabela implements Serializable {
	
	private List<Pessoa> lista;
	
	public ControleTabela(){
		lista = new ArrayList<Pessoa>();
		lista.add(new Pessoa (1, "jo�o","(88)1234-5678"));
		lista.add(new Pessoa (2, "jo�o2","(88)1234-5678"));
		lista.add(new Pessoa (3, "jo�o3","(88)1234-5678"));
		lista.add(new Pessoa (4, "jo�o4","(88)1234-5678"));
		lista.add(new Pessoa (5, "jo�o5","(88)1234-5678"));
		lista.add(new Pessoa (6, "jo�o6","(88)1234-5678"));
	}
	public String salvar(){
		for (Pessoa obj : lista) obj.setEditando(false);;
		return null;
	}
	public String excluir(Pessoa obj) {
		lista.remove(obj);
		return null;
	}

	public List<Pessoa> getLista() {
		return lista;
	}

	public void setLista(List<Pessoa> lista) {
		this.lista = lista;
	}
}
