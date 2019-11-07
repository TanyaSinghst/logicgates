package main;
class MainXnor{
    public static void main(String[] args) {
        XnorGate o = new XnorGate();
        o.printTruthTable();
    }
}
public class XnorGate {
    private int input1;
    private int input2;
    public XnorGate() {
        input1 = 0;
        input2 = 0;
    }
    public XnorGate(int input1, int input2) {
        this.input1 = input1;
        this.input2 = input2;
    }
    public int getInput1() {
        return this.input1;
    }

    public void setInput1(int input1) {
        this.input1 = input1;
    }

    public int getInput2() {
        return this.input2;
    }

    public void setInput2(int input2) {
        this.input2 = input2;
    }

    private int getOutput(int input1, int input2) {


        setInput1(input1);


        setInput2(input2);


        return (this.input1 == this.input2) ? 1 : 0;


    }

    private void printOutput() {


        System.out.println(0 + " XNOR " + 0 + " results " + getOutput(0, 0) + '\n' +


                0 + " XNOR " + 1 + " results " + getOutput(0, 1) + '\n' +


                1 + " XNOR " + 0 + " results " + getOutput(1, 0) + '\n' +


                1 + " XNOR " + 1 + " results " + getOutput(1, 1) + '\n');


    }

    public void printTruthTable() {


        System.out.println("----Truth Table For XNOR Gate----");


        printOutput();


    }


}


