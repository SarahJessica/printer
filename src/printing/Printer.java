package printing;

/**
 * Created by leives01 on 21/09/15.
 */
public class Printer extends Machine{
//    private boolean isOn;
    private String modelNumber;
    private String onStatus;


    public Printer(boolean isOn, String modelNumber){
//        this.isOn = isOn;
        super(isOn);
        this.modelNumber = modelNumber;
    }

    public void print(int copies){

//        for (int i = 0; i < copies; i++){
//            System.out.println(modelNumber + " copy " + i);
//        }

//        while(copies > 0){
//            System.out.println("printing!!!");
//        } /* infinite loop!!!!!!!!! */

        if(isOn)
            onStatus = "Sis on!";
        else
            onStatus = "is not on";

        switch(copies){
            case 0:
                System.out.println(modelNumber + " isn't printing any copies.");
                break;
            case 1:
                System.out.println(modelNumber + " is printing " + copies + " copies.");
                break;
            case 2:
                System.out.println(modelNumber + " is printing " + copies + " copies.");
                break;
            default:
                System.out.println(modelNumber + " is printing several copies");
        }

        if(isOn){
            System.out.println(modelNumber + " is on!");
        }
        else {
            System.out.println(modelNumber + " is off!");
        }
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
