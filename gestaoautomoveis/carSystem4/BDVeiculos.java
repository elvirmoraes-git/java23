package carSystem4;

public class BDVeiculos {
	
	public BDVeiculos() {
		// TODO Auto-generated constructor stub
	}

	// Quantidade de veículos por tipo.
	int qtVeiculo = 3;
	
	Passeio[ ] listaPasseio = new Passeio[ qtVeiculo ];
	Carga  [ ] listaCarga   = new Carga  [ qtVeiculo ];

	public Passeio[] getListaPasseio() {
		return listaPasseio;
	}
	public void setListaPasseio(Passeio[] listaPasseio) {
		this.listaPasseio = listaPasseio;
	}
	public Carga[] getListaCarga() {
		return listaCarga;
	}
	public void setListaCarga(Carga[] listaCarga) {
		this.listaCarga = listaCarga;
	}
}
