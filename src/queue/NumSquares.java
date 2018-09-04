package queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/*
Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.

Example 1:

Input: n = 12
Output: 3
Explanation: 12 = 4 + 4 + 4.
Example 2:

Input: n = 13
Output: 2
Explanation: 13 = 4 + 9.
 */
public class NumSquares {
    public int numSquares(int n) {
        int res=0;
        Queue<Integer> bfs_c=new LinkedList<>();
        bfs_c.add(n);
        int count=1;   //breadth each time
        boolean isFinish=false;   //find min
        do{
            int temp_count=0;
            while(count!=0) {
                int temp=bfs_c.poll();
                if(temp==0){
                    isFinish=true;
                    break;
                }
                int temp_max=Math.round((float)(Math.sqrt(temp)-0.5));
                temp_count+=temp_max;
                for(int i=temp_max;i>0;i--){
                    bfs_c.add(temp-i*i);
                }
                count--;
            }
            if(!isFinish) {
                res++;
            }
            count=temp_count;
        }while(!isFinish);
        return res;
    }
    public static void main(String args[]){
        System.out.println(new NumSquares().numSquares(7168));
    }
}
