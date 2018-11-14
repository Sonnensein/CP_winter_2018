package pl.waw.sgh;

public class loops {
    public static void main(String[] args) {
        for (int i=0; i<5;i++) {
            System.out.println("I=" + i);
        }
        System.out.println();
        for (int i=6; i<5;i++) {
            //skip to next interation
            System.out.println("I=" + i);
            //stop the loop
            if (i==4) break;
        }
        int j = 5;
        while(j<6) {
            System.out.println("J=" + j);
            //jak nie zatrzymamy to leci
            j++;
        }
        int k=6;
                do {
                    System.out.println("K=" + k);
                    k--;
                }while (k>2);
                }
    }

