package az.edu.ada.wm2.authorcrudsecurity.model.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    private static Long nextId = 1L;
    private Long id;
    private String name;

    public Role(String name) {
        this.name = name;
        this.id = nextId++;
    }

    @Override
    public String toString() {
        return name;
    }
}
