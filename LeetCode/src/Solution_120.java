
public class Solution_120 {

	public int minimumTotal(List<List<Integer>> triangle) {
        
        int deep = triangle.length();
        
        int[] d = new int[deep];
        d[0] = triangle.get(0).get(0);
        for (int i = 1; i < d.length; i++) {
			for (int j = 0; j < d.length; j++) {
				if(triangle.get(i).get(j) < triangle.get(i).get(j + 1)){
					d[i] = triangle.get(i).get(j) + d[i -1];
				} else{
					d[i] = triangle.get(i).get(j + 1) + d[i -1];
				}
			}
		}
        
        return d[deep - 1];
    }
}
