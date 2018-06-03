
public class Tree {
		
	private Node root;
	
		public Node getRoot()
		{
			return root;
		}
		
		public void setRoot(Node r)
		{
			root = r;
		}
		
		public boolean isEmpty()
		{
			return root == null;
		}
		
		public boolean add(Node newOne, Node parent)
		{
			if(newOne.getID() == parent.getID())
			{
				return false;
			}
			else if(newOne.getID() < parent.getID())
			{
				// newOne belongs to the left of the parent
					if(parent.getLeft() == null)
					{
						parent.setLeft(newOne);
						return true;
					}
					else
					{
						add(newOne, parent.getLeft());
					}
			}
			else
			{
				// newOne belongs to the right of the parent
				if(parent.getRight() == null)
				{
					parent.setRight(newOne);
					return true;
				}
				else
				{
					add(newOne, parent.getRight());
				}
			}
			return false;
		}
		
		public boolean addNode(Node newOne)
		{
			return add(newOne, root);
		}
		
		public Node find(int idToFind)
		{
			Node marker = root;
			while(marker != null)
			{
				if(idToFind > marker.getID())
				{
					marker = marker.getRight();
				}
				else if  (idToFind < marker.getID())
				{
					marker = marker.getLeft();
				}
				else
				{
					return marker;
				}
			}
			return null;
		}
		
		public Node findRightmost(Node start)
		{
			Node marker = start;
			while(marker != null)
			{
				Node right = marker.getRight();
				if(right != null)
				{
					marker = marker.getRight();
				}
				else 
				{
					return marker;
				}
			}
			return null;
		}
		
		public Node findParent(int idToFind)
		{
			Node marker = root;
			while(marker != null)
			{
				Node left = marker.getLeft();
				Node right = marker.getRight();
				if(marker.getID() == idToFind || (left != null && left.getID() == idToFind) ||(right != null &&  right.getID() == idToFind))
				{
					return marker;
				}
				else if(idToFind < marker.getID())
				{
					marker = marker.getLeft();
				}
				else 
				{
					marker = marker.getRight();
				}
			}
			return null;
		}
		
		public void delete(int idToDelete)
		{
			Node toDelete = find(idToDelete);
			Node parent = findParent(idToDelete);
			
			if(toDelete == null){
				System.out.println("Nothing to delete");
			}else{
				if(toDelete.getChildren() == 0){
					if(toDelete == parent.getLeft()){
						parent.setLeft(null);
					}else if(toDelete == parent.getRight()){
					        parent.setRight(null);
					}else{
					    root = null;   
					}
				}else if(toDelete.getChildren() == 1){
					if(toDelete == parent.getLeft()){
					        if(toDelete.getLeft() != null) {
					                parent.setLeft(toDelete.getLeft());
					        } else {
					                parent.setLeft(toDelete.getRight());
					        }
					}else if(toDelete == parent.getRight()){
					        if(toDelete.getLeft() != null) {
					                parent.setRight(toDelete.getLeft());
					        }else {
					                parent.setRight(toDelete.getRight());
					        }
					}else{
					        if(toDelete.getLeft() != null) {
					                root = toDelete.getLeft();
					        }  else {
					                root = toDelete.getRight();
					        }
					}
				}else{ //toDelete has two children
					if(toDelete == parent.getLeft()){	
	                                         Node rightmost = findRightmost(toDelete.getLeft());
	                                         Node rightmostParent = findParent(rightmost.getID());
	                                         
					        if(rightmostParent != toDelete) {
					                rightmostParent.setRight(rightmost.getLeft());
					        }
					        if(toDelete.getLeft() != rightmost) {
					                rightmost.setLeft(toDelete.getLeft());
					        }			        
					        rightmost.setRight(toDelete.getRight());	
					        
					        parent.setLeft(rightmost);
					}
					else if(toDelete == parent.getRight()){
					        Node rightmost = findRightmost(toDelete.getLeft());
					        Node rightmostParent = findParent(rightmost.getID());
					        
	                                           if(rightmostParent != toDelete) {
	                                                        rightmostParent.setRight(rightmost.getLeft());
	                                            }
	                                           if(toDelete.getLeft() != rightmost) {
	                                                        rightmost.setLeft(toDelete.getLeft());
	                                           }
	                                           rightmost.setRight(toDelete.getRight());
	                                                
	                                            parent.setRight(rightmost);
					}else{
					        Node rightmost = findRightmost(toDelete.getLeft());
					        Node rightmostParent = findParent(rightmost.getID());
					        
	                                           if(rightmostParent != toDelete)  {
	                                                        rightmostParent.setRight(rightmost.getLeft());
	                                            }
	                                            if(toDelete.getLeft() != rightmost)  {
	                                                        rightmost.setLeft(toDelete.getLeft());
	                                            }
	                                             rightmost.setRight(toDelete.getRight());
	                                                
	                                            root = rightmost;
					}
				}
			}
		}
}
