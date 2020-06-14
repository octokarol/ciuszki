package wizut.bihdwi.ciuszki.jpa;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "sizing_type_shoe")
public class SizingTypeShoe {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @NotNull
    @Column(name = "size_us")
    private Float size_us;

    @NotNull
    @Column(name = "size_uk")
    private Float size_uk;

    @NotNull
    @Column(name = "size_eu")
    private Float size_eu;

    @NotNull
    @Column(name = "size_cm")
    private Float size_cm;

    @NotNull
    @Column(name = "size_br")
    private Float size_br;

    @NotNull
    @Column(name = "size_jp")
    private Float size_jp;

    public SizingTypeShoe() {
    }

    public SizingTypeShoe(Integer id, @NotNull Float size_us, @NotNull Float size_uk, @NotNull Float size_eu, @NotNull Float size_cm, @NotNull Float size_br, @NotNull Float size_jp) {
        this.id = id;
        this.size_us = size_us;
        this.size_uk = size_uk;
        this.size_eu = size_eu;
        this.size_cm = size_cm;
        this.size_br = size_br;
        this.size_jp = size_jp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getSize_us() {
        return size_us;
    }

    public void setSize_us(Float size_us) {
        this.size_us = size_us;
    }

    public Float getSize_uk() {
        return size_uk;
    }

    public void setSize_uk(Float size_uk) {
        this.size_uk = size_uk;
    }

    public Float getSize_eu() {
        return size_eu;
    }

    public void setSize_eu(Float size_eu) {
        this.size_eu = size_eu;
    }

    public Float getSize_cm() {
        return size_cm;
    }

    public void setSize_cm(Float size_cm) {
        this.size_cm = size_cm;
    }

    public Float getSize_br() {
        return size_br;
    }

    public void setSize_br(Float size_br) {
        this.size_br = size_br;
    }

    public Float getSize_jp() {
        return size_jp;
    }

    public void setSize_jp(Float size_jp) {
        this.size_jp = size_jp;
    }
}
