package ObjectedOrientedProgramming.enum_Learning;

public class CallEnum {
    public static void main(String[] args) {

        testEnum e = testEnum.SATURDAY;

//        switch (e){
//
//            case SATURDAY:
//                System.out.println("we have class today");
//                break;
//            case THURSDAY:
//                System.out.println("we don't have class today");
//                break;
//        }

        for (testEnum d : testEnum.values()) {

            System.out.println(d);
        }

    }
}
