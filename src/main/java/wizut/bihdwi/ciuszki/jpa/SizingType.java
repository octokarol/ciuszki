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


    @NotNull
    @Size(max = 30)
    @Column(name = "size_us")
    private Float size_us;

    @NotNull
    @Size(max = 30)
    @Column(name = "size_uk")
    private Float size_uk;

    @NotNull
    @Size(max = 30)
    @Column(name = "size_eu")
    private Float size_eu;

    @NotNull
    @Size(max = 30)
    @Column(name = "size_cm")
    private Float size_cm;

    @NotNull
    @Size(max = 30)
    @Column(name = "size_br")
    private Float size_br;

    @NotNull
    @Size(max = 30)
    @Column(name = "size_cn")
    private Float size_cn;

    public SizingType() {
    }

    public SizingType(Integer id, @NotNull @Size(max = 30) String size, @NotNull @Size(max = 30) Float size_us, @NotNull @Size(max = 30) Float size_uk, @NotNull @Size(max = 30) Float size_eu, @NotNull @Size(max = 30) Float size_cm, @NotNull @Size(max = 30) Float size_br, @NotNull @Size(max = 30) Float size_cn) {
        this.id = id;
        this.size = size;
        this.size_us = size_us;
        this.size_uk = size_uk;
        this.size_eu = size_eu;
        this.size_cm = size_cm;
        this.size_br = size_br;
        this.size_cn = size_cn;
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

    public Float getSize_cn() {
        return size_cn;
    }

    public void setSize_cn(Float size_cn) {
        this.size_cn = size_cn;
    }
}
