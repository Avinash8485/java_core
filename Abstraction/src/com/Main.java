package com;

class Main {
    public static void main(String[] args) {
        String[] arr = {jahadish,Avinash,prakash,gowtham};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Array.toString(arr));
        } 
    }
    public static void mergeSort(String[] arr,int start ,int end){
       if(start<end ){
           int mid = start+(end - start)/2;
           mergeSort(arr,start,mid);
           mergeSort(arr,mid+1,end);
           merge(arr,start,mid,end);
       } 
    }
    public static void merge(String[] arr,int start,int mid,int end){
        int a = mid - start+1;
        int b = end - mid;
        String[] startArray = new String[a];
        String[] endArray = new String[b];
        
        System.out.arraycopy(arr,start,startArray,0,a);
        System.out.arrayCopy(arr,mid+1,endArray,mid+1,b);
        
        int i=0,j=0,k=start;
        while(i<startArray.length && j<endArray.length){
            if(startArray[i].compareToIgnoreCase(endArray[j]){
                arr[k++] = startArray[i++];
            }
            else{
                arr[k++] =endArray[j++];
            }
        }
        while(i<startArray.length){
            arr[k++] = startArray[i++];
        }
        while(j<endArray.length){
            arr[k++] = endArray[j++];
        }
    }
}

