package dss.g22.business.moradores;

public class Morador {

    private String nome;
    private String email;
    private String password;
    private int idMorador;
    private boolean foiEliminado;

    public String getPassword() {
        return this.password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setIdMorador(int idMorador) {
        this.idMorador = idMorador;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSaldo() {
        // TODO - implement Morador.getSaldo
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdMorador() {
        return this.idMorador;
    }

    public boolean getFoiEliminado() {
        return this.foiEliminado;
    }

    /**
     *
     * @param foiEliminado
     */
    public void setFoiEliminado(boolean foiEliminado) {
        this.foiEliminado = foiEliminado;
    }

    /**
     *
     * @param nome
     * @param email
     * @param password
     */
    public Morador(String nome, String email, String password) {
        this.nome = nome;
        this.email = email;
        this.password = password;
    }

    /**
     *
     * @param idMorador
     * @param nome
     * @param email
     * @param password
     */
    public Morador(int idMorador, String nome, String email, String password) {
        this.idMorador = idMorador;
        this.nome = nome;
        this.email = email;
        this.password = password;
    }

    public Morador(int idMorador, String nome, String email, String password, boolean foiEliminado) {
        this.idMorador = idMorador;
        this.nome = nome;
        this.email = email;
        this.password = password;
        this.foiEliminado = foiEliminado;
    }
}
