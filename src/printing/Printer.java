package printing;

/**
 * Created by leives01 on 21/09/15.
 */
//public class Printer extends Machine{
public class Printer implements IMachine{
    private String modelNumber;
    private PaperTray paperTray = new PaperTray();


    public Printer(boolean isOn, String modelNumber){
//        super(isOn);
        this.modelNumber = modelNumber;
    }

    @Override
    public void TurnOn(){
        super.TurnOn();
        System.out.println("the printer is on!");
    }

    public void print(int copies){

//        for (int i = 0 ; i < copies ; i++){
        while(copies > 0){
            System.out.println(modelNumber + " " + copies + " remaining.");
            copies --;
        }

//        if(isOn) {
//            onStatus = "is on!";
//        } else {
//            onStatus = "is not on";
//        }

//        System.out.println(modelNumber + " " + onStatus);

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
