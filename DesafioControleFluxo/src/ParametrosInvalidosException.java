public class ParametrosInvalidosException extends Exception
{
    public String mensagemErro;

    public ParametrosInvalidosException(String mensagem) {
        mensagemErro = "Parâmetros inválidos : " + mensagem;
    }
}
