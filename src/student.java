public class student {
    private String name;
    private int roll;
    private address address;

    student(){


    }

  student(String name, int roll , address address){
        this.name=name;
        this.roll=roll;
        this.address=address;
  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public address getAddress() {
        return address;
    }

    public void setAddress(address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", address=" + getAddress().getArea() +"    home no "+getAddress().getHomeno()+
                '}';
    }
}
