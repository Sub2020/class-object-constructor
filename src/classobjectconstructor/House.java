package classobjectconstructor;

public class House {
    public int address;
    String name;
    char unit = 'A';


    House(String name) {
        this.name = name;

    }

    House(String name, int address) {
        this.name = name;
        this.address = address;

    }

    public House() {

    }

    public void room() {
        System.out.println("Never stop trying, your time will come");
    }

    void kitchen() {
        System.out.println("always spend more money in kitchen");
    }

    void bathroom() {
        System.out.println("Keep bathroom clean again");
    }
    void livingRoom () {
        System.out.println("Watch Qatar WorldCup2022 on TV and wins ticket");
    }
}
