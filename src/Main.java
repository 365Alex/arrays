import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //задание 1
        int[] w = new int[3];
        w[0]=1;
        w[1]=2;
        w[2]=3;
        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        int[] z = new int[3];
        z[0] = 7;
        z[1] = 10;
        z[2] = 26;


        //задание 2
        for (int p =0; p<w.length; p++){
            System.out.print(w[p]);
            if(p<w.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int v = 0; v<fractionalNumbers.length; v++){
            System.out.print(fractionalNumbers[v]);
            if (v<fractionalNumbers.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int f = 0; f<z.length; f++){
            System.out.print(z[f]);
            if (f<z.length-1){
                System.out.print(", ");
            }
        }

        //задание 3
        System.out.println();
        for (int e = w.length-1; e>=0; e--){
            if (e!=0){
                System.out.print(w[e] + ", ");
            }else {
                System.out.print(w[e]);
            }
        }
        System.out.println();
        for (int m = fractionalNumbers.length-1; m >= 0; m--){
            if(m != 0){
                System.out.print(fractionalNumbers[m] + ", ");
            }else {
                System.out.print(fractionalNumbers[m]);
            }
        }

        System.out.println();
        for (int x = z.length - 1; x>=0; x--){
            if (x!=0){
                System.out.print(z[x] + ", ");
            }else {
                System.out.print(z[x]);
            }

        }
        System.out.println();
        //задание 4
        for (int u = 0; u< w.length; u++){
            if (w[u] % 2 ==1){
                w[u] += 1;
            }
        }
        System.out.println(Arrays.toString(w));

    }
}