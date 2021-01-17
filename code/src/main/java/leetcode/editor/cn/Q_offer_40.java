package leetcode.editor.cn;

import java.util.PriorityQueue;
import java.util.Queue;

public class Q_offer_40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if(arr.length==0 || k<=0){
            return new int[0];
        }
        Queue<Integer> pq=new PriorityQueue<>((v1,v2)->v2-v1);
        for (int i = 0; i < arr.length; i++) {
            if (pq.size()<k){
                pq.offer(arr[i]);
            }else {
                if (arr[i]<pq.peek()){
                    pq.poll();
                    pq.offer(arr[i]);
                }
            }
        }

//123
int x=123;
        int[] result=new int[k];
        int i=0;
       for (Integer p:pq){
           result[i]=p;
           i++;
       }
       return result;
    }
}
