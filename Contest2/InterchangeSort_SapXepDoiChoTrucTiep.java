/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest2;

import java.util.*;

public class InterchangeSort_SapXepDoiChoTrucTiep {
    static int [] A=new int[100];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            A[i]=sc.nextInt();
        }
        for (int i = 0; i < n-1; ++i) {   
            boolean print=false;
            for (int j = i+1; j < n; j++) {                                                                
                if(A[i]>A[j]){
                    int t=A[i];
                    A[i]=A[j];
                    A[j]=t;
                    print=true;
                }                
            }
            if(print) in(n,i+1);
        }   
    }
      public static void in(int n,int k){
        StringBuilder result=new StringBuilder();
        result.append("Buoc "+k+": ");
        for (int i = 0; i < n; i++) {
            result.append(A[i]+" ");            
        }
        result.deleteCharAt(result.length()-1);
        System.out.println(result.toString());
    }
}
