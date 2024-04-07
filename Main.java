import java.util.ArrayList;

class robot {
    private String name;

    public robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Object Wapper Demo");

        int i = 233;
        Integer iWrap = new Integer(i);
        System.out.println("i : " + i);
        System.out.println("iWrap : " + iWrap);

        // =======

        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(4);
        intList.add(34);
        intList.add(89);
        // Autoboxing
        // Auto wrapped and unwrap (int => Integer)
        int intList0 = intList.get(0);
        System.out.println("intList0 : " + intList0);
    }
}