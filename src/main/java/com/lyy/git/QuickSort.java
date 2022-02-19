package com.lyy.git;
//快速排序实现
public class QuickSort {
    public static void main(String[] args) {
        int arr[]={10,20,5,3,0};
        System.out.println("排序前的数组:");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+"\t");
        }
        QuickSort sort = new QuickSort();
        sort.QuickSort(arr,0,arr.length-1);
        System.out.println("\n排序后的数组:");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+"\t");
        }


    }
    public void QuickSort(int arr[],int start,int end){
        if(start<end)
        {
            int index=getIndex(arr,start,end);
            QuickSort(arr,start,index-1);
            QuickSort(arr,index+1,end);
        }
    }
    public int getIndex(int arr[],int start,int end){
        int pivot=arr[start];
        while (start<end){
            while (arr[end]>pivot&&start<end)
                end--;
                arr[start]=arr[end];
            while (arr[start]<pivot&&start<end)
                start++;
                arr[end]=arr[start];
        }
        arr[start]=pivot;
        return start;
    }
}
