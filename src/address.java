public class address {

    private String area;
    private  int homeno;

    public address(String area, int homeno) {
        this.area = area;
        this.homeno = homeno;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getHomeno() {
        return homeno;
    }

    public void setHomeno(int homeno) {
        this.homeno = homeno;
    }
}
