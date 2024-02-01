package ie.atu.productv5;

public class TV extends Product {

    private String Manufacturer;
    private int Screen_Size;
    public TV() {
        super();
        Manufacturer = "";
        Screen_Size = 0;
        count++;
    }
    public void setManufacturer(String manufacturer) {
        this.Manufacturer = manufacturer;
    }
    public String getManufacturer() {
        return Manufacturer;
    }
    public void setScreen_Size(int screen_Size) {
        this.Screen_Size = screen_Size;
    }
    public int getScreen_Size() {
        return Screen_Size;
    }
    @Override
    public String toString() {
        return super.toString() + " by " + Manufacturer + "\n Screen size : " + Screen_Size + "Inches"  ;
    }
    /*
    public Music() {
        super();
        Screen_Size = "";
        count++;
    }
    public void setScreen_Size(String screen_Size) {
        this.Screen_Size = screen_Size;
    }
    public String getScreen_Size() {
        return Screen_Size;
    }
    @Override
    public String toString() {
        return super.toString() + " Size " + Screen_Size;
    }
*/
}



