import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
       
        int n=arr1.length+arr2.length;
       int arr3[]=new int[n];
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;k++;
            }else{
                arr3[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(j<arr2.length){
            arr3[k]=arr2[j];
            j++;
            k++;
        }
        while(i<arr1.length){
            arr3[k]=arr1[i];
            i++;
            k++;
        }
        
        if(arr3.length%2!=0)
        {
            int p=arr3.length/2;
            return (Double.valueOf(arr3[p]));
        }
        else
        {
            int p=arr3.length/2;
            p=arr3[p]+arr3[p-1];
            Double d= new Double(p);
            return (Double.valueOf(d/2));
        }
    }
}