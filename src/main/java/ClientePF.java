public class ClientePF extends Cliente {

    private String CPF;
    @Override
    public String getID() {
        return this.CPF;
    }

    public ClientePF(String nome, String endereco, String email, String CPF) {
        super(nome,endereco,email);
        this.CPF = CPF;
    }


}
