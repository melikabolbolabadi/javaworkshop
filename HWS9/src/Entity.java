public class Entity
{
    public int code;
    public String name;
    public String gender;
    public String color;
    public long price;

    public int getCode(){return code; }

    public void setCode(int code){
this.code=code;
}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) { this.price = price; }

}
