public class Car {
    private String manufacturer;
    private String model;
    private int year;

    public Car(String manufacturer, String model, int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }

/*
*
    public Car(Car car1) {

    }
*/

    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }


    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    public void  setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }



}
