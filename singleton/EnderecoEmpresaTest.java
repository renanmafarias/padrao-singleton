package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnderecoEmpresaTest {

    @Test
    public void deveRetornarTipoLogradouro() {
        EnderecoEmpresa.getInstance().setTipoLogradouro("Rua");
        assertEquals("Rua", EnderecoEmpresa.getInstance().getTipoLogradouro());
    }

    @Test
    public void deveRetornarLogradouro() {
        EnderecoEmpresa.getInstance().setLogradouro("ABCDE");
        assertEquals("ABCDE", EnderecoEmpresa.getInstance().getLogradouro());
    }

    @Test
    public void deveRetornarNumero() {
        EnderecoEmpresa.getInstance().setNumero(125);
        assertEquals(125, EnderecoEmpresa.getInstance().getNumero());
    }

    @Test
    public void deveRetornarBairro() {
        EnderecoEmpresa.getInstance().setBairro("Centro");
        assertEquals("Centro", EnderecoEmpresa.getInstance().getBairro());
    }

    @Test
    public void deveRetornarMunicipio() {
        EnderecoEmpresa.getInstance().setMunicipio("Rio de Janeiro");
        assertEquals("Rio de Janeiro", EnderecoEmpresa.getInstance().getMunicipio());
    }

    @Test
    public void deveRetornarEstado() {
        EnderecoEmpresa.getInstance().setEstado("RJ");
        assertEquals("RJ", EnderecoEmpresa.getInstance().getEstado());
    }

    @Test
    public void deveRetornarCep() {
        EnderecoEmpresa.getInstance().setCep("99999999");
        assertEquals("99999999", EnderecoEmpresa.getInstance().getCep());
    }
}
