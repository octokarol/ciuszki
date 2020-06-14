package wizut.bihdwi.ciuszki.jpa;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table(name = "offer")
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotNull
    @Size(max = 255, min = 5)
    @Column(name = "title")
    private String title;

    @Column(name = "date")
    private LocalDate dateTime;

    @NotNull
    @Column(name = "year")
    private Integer year;

    @NotNull
    @Size(max = 30)
    @Column(name = "condition")
    private String condition;

    @NotNull
    @Lob
    @Size(max = 65535, min = 5)
    @Column(name = "description")
    private String description;


    @NotNull
    @Column(name = "price")
    private Integer price;


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
    @JoinColumn(name = "item_model_id", referencedColumnName = "id")
    @ManyToOne
    private ItemModel model;


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


    @NotNull
    @Column(name = "user_id")
    private Integer userId;

    public Offer() {
    }

    public Offer(Integer id, @NotNull @Size(max = 255, min = 5) String title, LocalDate dateTime, @NotNull Integer year, @NotNull @Size(max = 30) String condition, @NotNull @Size(max = 65535, min = 5) String description, @NotNull Integer price, @NotNull @Size(max = 30) Integer retail_price, @NotNull @Size(max = 30) String colour, @Size(max = 30) String cut, @NotNull ItemModel model, @NotNull ItemManufacturer manufacturer, SizingType sizing, SizingTypeShoe shoeSizing, @NotNull Integer userId) {
        this.id = id;
        this.title = title;
        this.dateTime = dateTime;
        this.year = year;
        this.condition = condition;
        this.description = description;
        this.price = price;
        this.retail_price = retail_price;
        this.colour = colour;
        this.cut = cut;
        this.model = model;
        this.manufacturer = manufacturer;
        this.sizing = sizing;
        this.shoeSizing = shoeSizing;
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDate dateTime) {
        this.dateTime = dateTime;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
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

    public ItemModel getModel() {
        return model;
    }

    public void setModel(ItemModel model) {
        this.model = model;
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

    public SizingTypeShoe getShoeSizing() {
        return shoeSizing;
    }

    public void setShoeSizing(SizingTypeShoe shoeSizing) {
        this.shoeSizing = shoeSizing;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
