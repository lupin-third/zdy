package com.springboot.zdy.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author dengyuan zhang
 * @date 2021/11/23 - 10:01
 * 反向遍历ArrayList
 */
public class ReverseForeach {
    public static class ReversibleArrayList<T> extends ArrayList<T>{
        public ReversibleArrayList(Collection<T> c){
            super(c);
        }
        public Iterable<T> reversed(){
            return new Iterable<T>() {
                @Override
                public Iterator<T> iterator() {
                    return new Iterator<T>() {
                        int current = size()-1;
                        @Override
                        public boolean hasNext() {
                            return current>-1;
                        }

                        @Override
                        public T next() {
                            return get(current--);
                        }
                        public void remove(){
                            throw new UnsupportedOperationException();
                        }
                    };
                }
            };
        }
    }
}
//适配器示例
 class AdapterMethodIdiom{
    public static void main(String[] args) {
        ReverseForeach.ReversibleArrayList<String> ral =
                new ReverseForeach.ReversibleArrayList<String>(Arrays.asList("To be or not to be".split(" ")));
        for(String s : ral){
            System.out.print(s);
        }
        System.out.println();
        for(String s : ral.reversed()){
            System.out.print(s);
        }
    }
}
