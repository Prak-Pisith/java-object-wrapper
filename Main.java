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

class MyUtils {
    public static String moneyFormatter(long money) {
        return String.format("I'm having around %,d in my bank account", money);
//        return "I'm having around in my bank account";
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

        // =======
        long money = 1000000L;
        String bankAcc = MyUtils.moneyFormatter(money);
        System.out.println(bankAcc);
    }
}