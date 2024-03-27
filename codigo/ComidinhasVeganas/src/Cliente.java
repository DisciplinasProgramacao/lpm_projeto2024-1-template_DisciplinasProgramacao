public class Cliente {
    private int idCliente;
    private String nome;

    public Cliente(int idCliente, String nome) {
        this.idCliente = idCliente;
        this.nome = nome;
    }
    /**
     * Retorna o id do cliente.
     * @return id do cliente.
     */
    public int getIdCliente() {
        return idCliente;

    }

    /**
     * Retorna o nome do cliente.
     * @return O nome do cliente.
     */
    public String getNome() {
        return nome;
    }

}
