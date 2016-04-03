package DataStructure;

public class Diamond extends Pyramid {
	private int nodeCount;
	public Diamond(long diamondArray[], int midHeight, int nodeCount, int pyramidCount) {
		super(diamondArray, midHeight, pyramidCount);
		this.nodeCount = nodeCount;
	}
	public boolean isInPyramidAndNotDiamond(int i) {
		int test = super.getNodeCount();
		return (i >= 0 && i < super.getNodeCount() - super.getHeight());
	}
	
	public int getLeft(int i) {

		int left = -1;
		if(isInPyramidAndNotDiamond(i)) {
			left = super.getLeft(i);
		} else {
			if(hasLeft(i)) {
				int nodeInRow = getNumberOfNodeInRow(i);
				left = i + nodeInRow - 1;
			}
		}

		return left;
	}
	
	public boolean hasLeft(int i) {
		boolean hasLeft = true;
		int nodeInRow = super.getHeight();
		int firstNoLeft = super.getNodeCount() - nodeInRow;
		while(firstNoLeft <= i) {
			if(i == firstNoLeft) {
				hasLeft = false;
			}
			firstNoLeft += nodeInRow;
			--nodeInRow;
			
		}
		return hasLeft;
	}
	
	public int getNumberOfNodeInRow(int i) {
		int numberOfNodeInRow = 0;
		if(i < super.getNodeCount()) {
			numberOfNodeInRow = super.getCurrentRow(i);
		} else {
			numberOfNodeInRow = super.getHeight() - (getCurrentRow(i) - super.getHeight());
		}
		
		return numberOfNodeInRow;
	}
	
	public int getRight(int i) {		
		int right = -1;
		if(isInPyramidAndNotDiamond(i)) {
			right = super.getRight(i);
		} else {
			if(hasRight(i)) {
				int nodeInRow = getNumberOfNodeInRow(i);
				right = i + nodeInRow;
			}
		}

		return right;
	}
	
	public boolean hasRight(int i) {
		boolean hasRight = true;
		int nodeInRow = super.getHeight() - 1;
		int firstNoRight = super.getNodeCount() - 1;
		
		while(firstNoRight <= i) {
			if(firstNoRight == i) {
				return false;
			}
			firstNoRight += nodeInRow;
			--nodeInRow;
		}
		
		return hasRight;
	}
	
	public int getCurrentRow(int i) {
		int position = super.getCurrentRow(i);
		int pyramidHeight = super.getHeight();
		int pyramidNodeCount = super.getNodeCount();
		if(position == -1) {
			while(pyramidNodeCount <= i && pyramidHeight > 0) {
				--pyramidHeight;
				pyramidNodeCount += pyramidHeight;
				if(pyramidHeight == 0) {
					return -1;
				}
			}
		}
		
		return position != -1 ? position : super.getHeight() + (super.getHeight() - pyramidHeight);
	}
	
	public boolean isLeaf(int i) {
		return (i == nodeCount-1) ? true : false; 
	}
	
	public void inOrderTraversal(int i) {
		if(i == -1) {
			return;
		}
		super.updateNodeValue(i, super.getNodeValue(i) + 1);
		int left = getLeft(i);
		int right = getRight(i);
		inOrderTraversal(left);
		inOrderTraversal(right);
 	}
	
	public int getNodeCount() {
		return nodeCount;
	}
	
	public String getRow(int row) {
		String genRow = "";

		for(int i = 0; i < nodeCount; ++i) {
			if(getCurrentRow(i) == row) {
				genRow += super.getNodeValue(i) + " ";
			}
		}
		
		return genRow;
	}
	public boolean hasRightNeighbor(int i) {
		return getCurrentRow(i) == getCurrentRow(i+1) ? true : false;
	}
	
	public boolean hasLeftNeighbor(int i) {
		if(i == 0)
			return false;
		return getCurrentRow(i) == getCurrentRow(i-1) ? true : false;
	}
	public void fillDiamond() {
		for(int i = 0; i < nodeCount; ++i) {
			boolean hasLeftNeighbor = hasLeftNeighbor(i);
			boolean hasRightNeighbor = hasRightNeighbor(i);
			boolean hasLeft = hasLeft(i);
			boolean hasRight = hasRight(i);
			int left = getLeft(i);
			int right = getRight(i);
			if(left != -1) {
				if(hasLeftNeighbor) {
					super.updateNodeValue(left, super.getNodeValue(i) + super.getNodeValue(i - 1));
				} else {
					super.updateNodeValue(left, super.getNodeValue(i));
				}
			}
			
			if(right != -1) {
				if(hasRightNeighbor) {
					super.updateNodeValue(right, super.getNodeValue(i) + super.getNodeValue(i + 1));
				} else {
					super.updateNodeValue(right, super.getNodeValue(i));
				}
			}
			
		}
	}
	public void printDiamond() {
		for(int i = 1; i <= super.getHeight() + super.getHeight() - 1; ++i) {
			System.out.println(getRow(i));
		}
	}
}
