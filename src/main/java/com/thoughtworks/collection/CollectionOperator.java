package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> list=new ArrayList<>();
        if(left<right){
            for (int i=left;i<=right;i++){
                list.add(i);
            }
        }else{
            for (int i=left;i>=right;i--){
                list.add(i);
            }
        }
        return list;

    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> list=new ArrayList<>();
        if (left<right){
            for (int i=left;i<=right;i++){
                if(i%2==0){
                    list.add(i);
                }
            }
        }else {
            for (int i=left;i>=right;i--){
                if(i%2==0){
                    list.add(i);
                }
            }
        }
        return list;
    }

    public List<Integer> popEvenElments(int[] array) {
//        int[] array2=new int[array.length];
//        for (int i=0,j=0;i<array.length;i++){
//            if (array[i]%2==0){
//                array2[j]=array[i];
//                j++;
//            }
//        }
//        return array2;
        throw new NotImplementedException();
    }

    public int popLastElment(int[] array) {
        throw new NotImplementedException();
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
