package JavaMasterClassCoursePractice.Section7_OOP_Inheritance.TypeOfInheritance.SingleInheritance.Animal;

public class Animal {
    private String name;
    private int quantity;
    private String type;
    private int age;

    public Animal( String name, int quantity, String type, int age ) {
        this.name = name;
        this.quantity = quantity;
        this.type = type;
        this.age = age;
    }

    public boolean isExtinct() {
        if ( quantity < 100){
            return false;
        }
        return true;
    }

    public String doesExtinct(){
        if(isExtinct()){
            return "Extinct";
        }
        return "Tuyet Chung";
    }
    public int calAge(){
        return 2025 - age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
