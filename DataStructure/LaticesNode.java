package DataStructure;

public class LaticesNode {
	public boolean isStart;
	public LaticesNode right;
	public LaticesNode down;
	public int label;
	public long visited;
	
	public LaticesNode(int n) {
		label = n;
		visited = 0;
	}
	

}
