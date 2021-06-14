import java.io.InputStreamReader;
import java.util.Scanner;

public class Dynamicdata {
 
    static class Node
    {
        int data;
        Node left,right;
        Node(int data)
        {
            this.data=data;
            left=null;
            right=null;
        }

    }

    public void insert(Node node, int data)
    {
        if(data<node.data)
        {
            if(node.left!=null)
            {
                insert(node.left, data);
            }
            else
            {
                System.out.println("Inserted "+ data+" to the left of "+node.data);
                node.left=new Node(data);
            }
        }
        else if(data>node.data)
        {
            if(node.right!=null)
            {
                insert(node.right,data);
            }
            else
            {
                System.out.println("Inserted "+data+" to right of "+node.data);
                node.right=new Node(data);
            }
        }
    }

    public static void searchIterative(Node root, int key)
    {
        Node curr = root;

        Node parent = null;

        while (curr != null && curr.data != key)
        {
            parent = curr;
            if (key < curr.data) 
            {
                curr = curr.left;
            }
            else 
            {
                curr = curr.right;
            }
        }
        if (curr == null)
        {
            System.out.print("Key Not found");
            return;
        }
 
        if (parent == null) 
        {
            System.out.print("The node with key " + key + " is root node");
        }
        else if (key < parent.data)
        {
            System.out.print("The given key is the left node of the node with key "+ parent.data);
        }
        else 
        {
            System.out.print("The given key is the right node of the node with key "+ parent.data);
        }
    }

    public static void InOrder(Node node) 
    {
        if(node != null) 
        {
            InOrder(node.left);
            System.out.print(" " + node.data);
            InOrder(node.right);

        }
    }
    public void PreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.data);
            PreOrder(node.left);
            PreOrder(node.right);
        }
    }
    public void PostOrder(Node node) {
        if (node != null) {
            PostOrder(node.left);
            PostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }
    
    public static void main(String args[]) 
    { 
        Dynamicdata DLL = new Dynamicdata();

        Scanner scanner = new Scanner(new InputStreamReader(System.in));

        System.out.println("Please enter the root node value :");

        int RootNode = scanner.nextInt();
        Node root = new Node(RootNode);

        System.out.println("Please enter the number values you want to enter :");

        int N =scanner.nextInt();

        int[] array = new int[10];  
        
        System.out.println("Please enter the node values : ");  
        for (int i=0; i<N; i++) 
        { 
            array[i]=scanner.nextInt();
        } 

        for(int j=0;j<N;j++)
        {
            DLL.insert(root,array[j]);
        }

        System.out.println("Please enter type of order i.e Inorder(I)/Preorder(P)/Postorder(PO) :");
        String Order = scanner.next();

        if(Order=="I")
        {
            System.out.println("\n Traversing tree in order");
            DLL.InOrder(root);
        }

        else if(Order=="P")
        {
            System.out.println("\n Traversing tree in Pre-order");
            DLL.PreOrder(root); 
        }
        
        else
        {
            System.out.println("\n Traversing tree in Post-order");
            DLL.PostOrder(root); 
        }

        System.out.println("\n Please enter the the node for searching :");
        int SNode = scanner.nextInt();
        DLL.searchIterative(root, SNode);

    }
}
