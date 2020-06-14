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
    @Column(name = "retail_price")
    private Integer retail_price;

    @NotNull
    @Size(max = 30)
    @Column(name = "colour")
    private String colour;

    @Size(max = 30)
    @Column(name = "cut")
    private String cut;

    @NotNull
    @Size(max = 30)
    @Column(name = "gender")
    private String gender;

    @NotNull
    @Size(max = 30)
    @Column(name = "is_shoe")
    private Boolean is_shoe;

    @NotNull
    @JoinColumn(name = "manufacturer_id", referencedColumnName = "id")
    @ManyToOne
    private ItemManufacturer manufacturer;

    @JoinColumn(name = "sizing_id", referencedColumnName = "id")
    @ManyToOne
    private SizingType sizing;

    @JoinColumn(name = "shoe_sizing_id", referencedColumnName = "id")
    @ManyToOne
    private SizingTypeShoe shoeSizing;



    public ItemModel() {
    }

    public ItemModel(Integer id, @NotNull @Size(max = 30) String name, @NotNull @Size(max = 30) Boolean is_shoe, @NotNull @Size(max = 30) Integer retail_price, @NotNull @Size(max = 30) String colour, @NotNull @Size(max = 30) String cut, @NotNull @Size(max = 30) String gender, @NotNull ItemManufacturer manufacturer, @NotNull SizingType sizing) {
        this.id = id;
        this.name = name;
        this.is_shoe = is_shoe;
        this.retail_price = retail_price;
        this.colour = colour;
        this.cut = cut;
        this.gender = gender;
        this.manufacturer = manufacturer;
        this.sizing = sizing;
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

    public Integer getRetail_price() {
        return retail_price;
    }

    public void setRetail_price(Integer retail_price) {
        this.retail_price = retail_price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getCut() {
        return cut;
    }

    public void setCut(String cut) {
        this.cut = cut;
    }

    public ItemManufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(ItemManufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public SizingType getSizing() {
        return sizing;
    }

    public void setSizing(SizingType sizing) {
        this.sizing = sizing;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public SizingTypeShoe getShoeSizing() {
        return shoeSizing;
    }

    public void setShoeSizing(SizingTypeShoe shoeSizing) {
        this.shoeSizing = shoeSizing;
    }
}
