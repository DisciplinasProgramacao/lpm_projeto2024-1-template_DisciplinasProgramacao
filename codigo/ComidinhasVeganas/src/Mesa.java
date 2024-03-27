import java.util.Date;

public class Mesa {
    private int idMesa;
    private int capacidade;
    private boolean mesaEstaLivre;

	public Mesa(int idMesa, int capacidade, boolean mesaEstaLivre) {
		this.idMesa = idMesa;
		this.capacidade = capacidade;
		this.mesaEstaLivre = mesaEstaLivre;
	}

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public boolean getMesaEstaLivre() {
        return mesaEstaLivre;
    }

    public void setMesaEstaLivre(boolean mesaEstaLivre) {
        this.mesaEstaLivre = mesaEstaLivre;
    }

    public void ocupar(){

    }

    public void desocupar(){

    }
    
}
