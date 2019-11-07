package main;
class Mainnot{
    public static void main(String[] args) {

        NotGate b = new NotGate();
        b.printTruthTable();
    }
}
public class NotGate {
        private int input1;

        public NotGate() {
            input1 = 0;
        }

        public NotGate(int input1) {
            this.input1 = input1;
        }

        public int getInput1() {
            return this.input1;
        }

        public void setInput1(int input1) {
            this.input1 = input1;
        }


        private int getOutput(int input1) {
            setInput1(input1);
            if (this.input1 == 0)
                return 1;
            else return 0;

        }

        private void printOutput() {
            System.out.println(" NOT " + 0 + " results " + getOutput(0) + '\n' +
                    " NOT " + 1 + " results " + getOutput(1) + '\n');
        }

        public void printTruthTable() {
            System.out.println("----Truth table for NOT Gate----");
            printOutput();
        }
    }


