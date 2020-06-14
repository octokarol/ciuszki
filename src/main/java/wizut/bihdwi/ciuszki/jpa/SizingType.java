package wizut.bihdwi.ciuszki.jpa;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "sizing_type")
public class SizingType {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;


    @NotNull
    @Size(max = 30)
    @Column(name = "size")
    private String size;




    public SizingType() {
    }

    public SizingType(Integer id, @NotNull @Size(max = 30) String size) {
        this.id = id;
        this.size = size;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


}
