import java.util.Objects;

public class UsuarioDto {
    final Long id;
    final String nombre;

    public UsuarioDto(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsuarioDto that = (UsuarioDto) o;
        return Objects.equals(id, that.id) && Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre);
    }

    @Override
    public String toString() {
        return "UsuarioDto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
