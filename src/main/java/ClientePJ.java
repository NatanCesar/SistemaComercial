public class ClientePJ extends Cliente{
    private String CNPJ;
    @Override
    public String getID() {
        return CNPJ;
    }

    public ClientePJ(String nome, String endereco, String email, String CNPJ) {
        super(nome, endereco, email);
        this.CNPJ = CNPJ;
    }
}
