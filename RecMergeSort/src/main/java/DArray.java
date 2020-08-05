/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barry
 */
 public class DArray {
    private double[] theArray;
    private int nElems;
    
    public DArray(int max){
        theArray = new double[max];
        nElems = 0;
    }
    
    public void insert(double value){
        theArray[nElems] = value;
        nElems++;
    }
    
    public void display(){
        for(int i = 0; i <nElems; i++){
            System.out.print(theArray[i] + " ");
        }
        System.out.println(" ");
    }
    
    public void mergeSort(){
        double[] workSpace = new double[nElems];
        recMergeSort(workSpace, 0, nElems-1);
    }
    
    public void recMergeSort( double[] workSpace, int lowerBound, int upperBound){
        if(lowerBound == upperBound){
            return;
        }else{
            int mid = (lowerBound+upperBound)/2;
            
            recMergeSort(workSpace, lowerBound, mid);
            
            recMergeSort(workSpace, mid+1, upperBound);
            
            merge(workSpace, lowerBound, mid+1, upperBound);
        }
    }
    
    public void merge(double[] workSpace, int lowPtr, int highPtr, int upperBound){
        int j = 0;
        int lowerBound = lowPtr;
        int mid = highPtr;
        int n = upperBound - lowerBound+1;
        
        while(lowPtr <= mid && highPtr <= upperBound){
            if(theArray[lowPtr] < theArray[lowPtr++]){
                workSpace[j++] = theArray[lowPtr++];
            }else{
                workSpace[j++] = theArray[highPtr++];
            }
        }
        while(lowPtr <= mid){
            workSpace[j++] = theArray[lowPtr++];
        }
        while(highPtr <= upperBound){
            workSpace[j++] = theArray[highPtr++];
        }
        
        for( j = 0; j < n; j++){
            theArray[lowerBound + j] = workSpace[j];
        }
            
    }
    

        
}
