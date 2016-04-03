package DataStructure;

import java.util.Vector;

public class LaticesGrid {
	private int gridSize;
	private LaticesNode[][] laticesVector;
	private LaticesNode start;
	public long test = 0;

	public LaticesGrid(int n) {
		gridSize = n + 1;
		constructVectorGrid();
		setAllNodesRight();
		setAllNodeDown();
		start = laticesVector[0][0];
		test = 0;
	}
	
	public void constructVectorGrid() {
		int counter = 0; 
		laticesVector = new LaticesNode[gridSize][gridSize];
		for(int i = 0; i < gridSize; ++i) {
			for(int j = 0; j < gridSize; ++j) {
				laticesVector[i][j] = new LaticesNode(counter);
				++counter;
			}
		}
	}
	
	public void setAllNodesRight() {
		for(int i = 0; i < gridSize; ++i) {
			for(int j = 0; j < gridSize - 1; ++j) {
				laticesVector[i][j].right = laticesVector[i][j+1];
			}
		}
	}
	
	public void setAllNodeDown() {
		for(int i = 0; i < gridSize - 1; ++i) {
			for(int j = 0; j < gridSize; ++j) {
				laticesVector[i][j].down = laticesVector[i+1][j];
			}
		}
	}
	
	public LaticesNode getEnd() {
		return laticesVector[gridSize-1][gridSize-1];
	}
	
	public LaticesNode getStart() {
		return start;
	}
	
	public long iterateThroughAllNodes(LaticesNode n) {
		
		if(n == null) {
			return 0;
		}
		//System.out.println(n.label);
		++(n.visited);
		return 1 + iterateThroughAllNodes(n.down) + iterateThroughAllNodes(n.right);
		
	}
	
	public long treeCountDown(long n) {
		long sum = 0;
		for(int i = 1; i <= n; ++i) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String args[]) {
		for(int i = 1; i < 7; ++ i) {
			LaticesGrid lg = new LaticesGrid(i);
			lg.iterateThroughAllNodes(lg.getStart());
			//lg.iterateThroughAllNodes(lg.getStart().right);
			//lg.iterateThroughAllNodes(lg.getStart().right.down.right);
			//lg.iterateThroughAllNodes(lg.getStart().right.down.down);
			LaticesNode end = lg.getEnd();
			System.out.println("*" + end.visited + "*");
		}

	}

}
