package greetings;

import printing.Printer;
import printing.Machine;

public class HelloWorld
{

		public static void main(String[] arg)
		{
////			System.out.println("hello world!");
//            Printer myPrinter = new Printer();
//            myPrinter.isOn = false;
//            myPrinter.modelNumber = "ABCD";
//
//            Printer yourPrinter = new Printer();
//            yourPrinter.isOn = true;
//            yourPrinter.modelNumber = "EFGH";
//
////            System.out.println("my printer's model number is " + yourPrinter.modelNumber + ", mine is " + myPrinter.modelNumber);
////            myPrinter.print("Hello Printer!");
//            String theModelNumber = myPrinter.getModelNumber();

//            Printer myPrinter = new Printer(true, "MY PRINTER");
//            myPrinter.print(4);
//            myPrinter.TurnOff();
//            myPrinter.print(2);
//
//            Printer yourPrinter = new Printer(false, "YOUR PRINTER");
//            yourPrinter.print(0);
//
//            Printer otherPrinter = new Printer(false, "OTHER PRINTER");
//            otherPrinter.printColors();

            Machine inheritedPrinter = new Printer(true, "MY INHERTIED PRINTER");
//            Machine machine = new Machine(false);
            inheritedPrinter.TurnOn();

		}


	}
