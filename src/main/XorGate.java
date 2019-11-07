package main;
class MainXor{
    public static void main(String[] args) {
        XorGate x = new XorGate();
        x.printTruthTable();
    }
}

public class XorGate {
    private int input1;


    private int input2;


    public XorGate() {


        input1 = 0;


        input2 = 0;


    }


    public XorGate(int input1, int input2) {
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
        return (this.input1 == this.input2) ? 0 : 1;
    }
    private void printOutput() {

        System.out.println(0 + " XOR " + 0 + " results " + getOutput(0, 0) + '\n' +
                0 + " XOR " + 1 + " results " + getOutput(0, 1) + '\n' +
                1 + " XOR " + 0 + " results " + getOutput(1, 0) + '\n' +
                1 + " XOR " + 1 + " results " + getOutput(1, 1) + '\n');
    }
    public void printTruthTable() {
        System.out.println("----Truth Table For XOR Gate----");
        printOutput();
    }
}


