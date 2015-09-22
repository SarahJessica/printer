package printing;

/**
 * Created by leives01 on 21/09/15.
 */
public class Printer extends Machine{
    private String modelNumber;
    private String onStatus;


    public Printer(boolean isOn, String modelNumber){
        super(isOn);
        this.modelNumber = modelNumber;
    }

    public void print(int copies){

        for (int i = 0 ; i < copies ; i++){
            System.out.println(modelNumber + " copy " + i);
        }

        if(isOn) {
            onStatus = "is on!";
        } else {
            onStatus = "is not on";
        }

        System.out.println(modelNumber + " " + onStatus);

//        switch(copies){
//            case 0:
//                System.out.println(modelNumber + " isn't printing any copies.");
//                break;
//            case 1:
//                System.out.println(modelNumber + " is printing " + copies + " copies.");
//                break;
//            case 2:
//                System.out.println(modelNumber + " is printing " + copies + " copies.");
//                break;
//            default:
//                System.out.println(modelNumber + " is printing several copies");
//        }

    }

    public void printColors(){
        String[] colors = new String[] {
                "Red", "Blue", "Green", "Orange", "Purple", "Teal", "Pink"
        };

        for( String currentColor : colors){
            System.out.println("the current printer colour is " + currentColor);

            if ( "Orange".equals(currentColor)){
                break;
            }
            System.out.println(currentColor);
        }
    }


    public void print(String text){
        System.out.println(text);
    }

    public String getModelNumber(){
        return modelNumber;
    }
}
