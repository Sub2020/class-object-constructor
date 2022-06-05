package classobjectconstructor;

public class UseHouse {
    public static void main(String[] args) {

        House myHouse = new House("Trump Tower2024");

        myHouse.room();
        myHouse.kitchen();
        myHouse.bathroom();
        myHouse.livingRoom();
        System.out.println("MyHouse.unit");
        myHouse.address = 11373;
        System.out.println(myHouse.address);

        House yourHouse = new House("The Trump Tower", 11373);
        House hisHouse = new House();
    }
}
