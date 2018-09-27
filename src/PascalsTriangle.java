import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
 *
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 *
 * Example:
 *
 * Input: 5
 * Output:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 */
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        if(numRows==0){
            return res;
        }
        ArrayList<Integer> first=new ArrayList<>();
        first.add(1);
        res.add(first);
        for(int n=1;n<numRows;n++){
            List<Integer> pre=res.get(n-1);
            List<Integer> cur=new ArrayList<>();
            cur.add(1);
            for(int m=1;m<n;m++){
                cur.add(pre.get(m-1)+pre.get(m));
            }
            cur.add(1);
            res.add(cur);
        }
        return res;
    }
}
