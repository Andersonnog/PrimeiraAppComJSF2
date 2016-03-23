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
		lista.add(new Pessoa (1, "joão","(88)1234-5678"));
		lista.add(new Pessoa (2, "joão2","(88)1234-5678"));
		lista.add(new Pessoa (3, "joão3","(88)1234-5678"));
		lista.add(new Pessoa (4, "joão4","(88)1234-5678"));
		lista.add(new Pessoa (5, "joão5","(88)1234-5678"));
		lista.add(new Pessoa (6, "joão6","(88)1234-5678"));
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
