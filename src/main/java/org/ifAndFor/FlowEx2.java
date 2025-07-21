package org.ifAndFor;

public class FlowEx2 {
    public static void main(String[] args) {

        FlowEx2 flowEx2 = new FlowEx2();

        flowEx2.printTriangleByOneStart();
    }

    public void printTriangleByFiveStart(){
        for(int i=0; i<5; i++){
            for(int j=5; j-i>0; j--){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public void printTriangleByOneStart(){
        for(int i=0; i<5; i++){
            for(int j=0; j<=i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
