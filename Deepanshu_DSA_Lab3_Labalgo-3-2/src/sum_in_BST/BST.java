package sum_in_BST;


	import java.util.ArrayList;
	import java.util.Scanner;

	public class BST {
		
	ArrayList<Integer> list=new ArrayList<>();
		
	public static void main(String[] args) {
			BST bst=new BST();
			Node root=null;
			Node nn=null;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number of nodes");
			int size=sc.nextInt();
			int i;
			for(i=1;i<=size;i++)
			{
				System.out.println("Enter the Data for the node "+i);
				int item=sc.nextInt();
				nn=new Node(item);
				if(root==null)
					root=nn;
				else
					bst.insert(root,nn);
				
			}
			
			bst.inOrder(root);
			System.out.println(bst.list);
			
			System.out.println("Enter Sum to be found ");
			int search=sc.nextInt(); //275
			int flag=0;
			for(int j=0;j<bst.list.size();j++)
			{
				int n1=bst.list.get(j); //n1=50
				int n2=search-n1; //225
				if(bst.list.contains(n2))
				{
					System.out.println("Sum is -");
					System.out.println("("+n1 +","+ n2+")");
					flag=1;
					break;
				}
				
			}
			if(flag==0)
				System.out.println("NO MATCHING ELEMENTS FOUND");
		}

		private void insert(Node root, Node nn) {
			if(nn.data < root.data)
			{
				if(root.left==null)
				{
					root.left=nn;
				}
				else
				{
					insert(root.left,nn);
					
				}
			}
			else
			{
				if(root.right==null)
				{
					root.right=nn;
				}
				else
				{
					insert(root.right,nn);
					
				}
			}
			
		}
		
	private void PreOrder(Node root) {
			if(root!=null)
			{
				System.out.println(root.data);
				PreOrder(root.left);
				PreOrder(root.right);
			}
		}

	private void inOrder(Node root) {
		if(root!=null)
		{
			inOrder(root.left);
			list.add(root.data);
			inOrder(root.right);
		}
	}

	private void PostOrder(Node root) {
		if(root!=null)
		{
			PostOrder(root.left);
			PostOrder(root.right);
			System.out.println(root.data);
		}
	}

	}

