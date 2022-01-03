package fcu.sep.fcushop.model;

/**
 * This is the class of Product model.
 */
public class Product {

  private long id;

  private String name;

  private String imageUrl;

  private int price;

  private String description;

  public Product() {
  }

  /**
   * Constructor of Product class.
   *
   * @param id product id
   * @param name product name
   * @param imageUrl the url of product image
   * @param price product price
   * @param description product description
   */
  public Product(long id, String name, String imageUrl, int price, String description) {
    this.id = id;
    this.name = name;
    this.imageUrl = imageUrl;
    this.price = price;
    this.description = description;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
