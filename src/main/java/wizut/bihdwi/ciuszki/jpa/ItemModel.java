package wizut.bihdwi.ciuszki.jpa;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "item_model")
public class ItemModel {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @NotNull
    @Size(max = 30)
    @Column(name = "name")
    private String name;



    @NotNull
    @Size(max = 30)
    @Column(name = "is_shoe")
    private Boolean is_shoe;


    public ItemModel() {
    }

    public ItemModel(Integer id, @NotNull @Size(max = 30) String name, @NotNull @Size(max = 30) Boolean is_shoe) {
        this.id = id;
        this.name = name;
        this.is_shoe = is_shoe;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Boolean getIs_shoe() {
        return is_shoe;
    }

    public void setIs_shoe(Boolean is_shoe) {
        this.is_shoe = is_shoe;
    }
}
