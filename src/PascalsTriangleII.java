import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.

 Note that the row index starts from 0.


 In Pascal's triangle, each number is the sum of the two numbers directly above it.

 Example:

 Input: 3
 Output: [1,3,3,1]
 Follow up:

 Could you optimize your algorithm to use only O(k) extra space?
 */
public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res=new ArrayList<>();
        res.add(1);
        if(rowIndex==0){
            return res;
        }
        res.add(1);
        if(rowIndex==1){
            return res;
        }
        for(int n=2;n<=rowIndex;n++){
            for(int m=0;m<n-1;m++){
                res.add(m,res.get(m)+res.get(m+1));
                res.remove(m+1);
            }
            res.add(0,1);
        }
        return res;
    }
}
