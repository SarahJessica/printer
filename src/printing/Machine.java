package printing;

/**
 * Created by leives01 on 21/09/15.
 */
public class Machine {
    protected boolean isOn;

    public Machine(boolean isOn){

        this.isOn = isOn;
    }

    public void TurnOn(){

        isOn = true;
        System.out.println("machine is on!");
    }

    public void TurnOff(){
        isOn = false;
    }


}
