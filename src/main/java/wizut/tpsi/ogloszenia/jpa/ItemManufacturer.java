package wizut.tpsi.ogloszenia.jpa;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "item_manufacturer")
public class ItemManufacturer {
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
    @Column(name = "origin")
    private String origin;

    public ItemManufacturer() {
    }

    public ItemManufacturer(Integer id, @NotNull @Size(max = 30) String name, @NotNull @Size(max = 30) String origin) {
        this.id = id;
        this.name = name;
        this.origin = origin;
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

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }


}
