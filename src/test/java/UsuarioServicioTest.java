import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UsuarioServicioTest {

    private UsuarioServicio usuarioServicio;

    @BeforeEach
    public void setUp() {
        this.usuarioServicio = new UsuarioServicio();
    }

    @DisplayName("Dado un usuario que queremos crear " +
            "Cuando llamamos a 'crearUsuario' " +
            "Esperamos que el usuario este creado ")
    @Test
    public void dadoUsuarioParaCrearEsperamosUnUsuarioCreado() {
        UsuarioDto esperado = new UsuarioDto(1L, "Prueba");
        final UsuarioDto resultado =
                usuarioServicio.crearUsuario(1L, "Prueba");
        Assertions.assertEquals(esperado.id, resultado.id);
        Assertions.assertEquals(esperado.nombre, resultado.nombre, "Los nombres son diferentes");
        Assertions.assertEquals(esperado, resultado);
    }

    @DisplayName("Dado un usuario que queremos crear Y pasamos diferentes " +
            "Cuando llamamos a 'crearUsuario' " +
            "Esperamos que el usuario este creado ")
    @Test
    public void test2() {
        UsuarioDto esperando = new UsuarioDto(1L, "Prueba");
        final UsuarioDto resultado = usuarioServicio.crearUsuario(1L, "Prueba");
        Assertions.assertEquals(esperando.id, resultado.id);
        Assertions.assertEquals(esperando.nombre, resultado.nombre);
        Assertions.assertEquals(esperando, resultado);
    }

    @Test
    public void test3() {
        final UsuarioDto resultado = usuarioServicio.obtenerUsuario(1L);
        Assertions.assertNull(resultado);
    }

    @Test
    public void test4() {
        UsuarioDto esperado = new UsuarioDto(1L, "Nombre");
        usuarioServicio.crearUsuario(1L, "Nombre");
        final UsuarioDto resultado = usuarioServicio.obtenerUsuario(1L);
        Assertions.assertEquals(esperado, resultado);
    }

}