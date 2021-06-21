public class BSTDeleteNode {
    class Node {
        int Data;
        Node left, right;

        public Node(int item) {
            Data = item;
            left = right = null;
        }
    }

    Node Root;

    BSTDeleteNode() {
        Root = null;
    }

    void DeleteNode(int Data) {
        Root = DeleteData(Root, Data);
    }

    Node DeleteData(Node Root, int Data) {
        if (Root == null) {
            return Root;
        }
        if (Data < Root.Data) {
            Root.left = DeleteData(Root.left, Data);
        } else if (Data > Root.Data) {
            Root.right = DeleteData(Root.right, Data);
        } else {
            if (Root.left == null) {
                return Root.right;
            } else if (Root.right == null) {
                return Root.left;
            }
            Root.Data = Minalue(Root.right);
            Root.right = DeleteData(Root.right, Root.Data);
        }
        return Root;
    }

    int Minalue(Node Root) {
        int Min = Root.Data;
        while (Root.left != null) {
            Min = Root.left.Data;
            Root = Root.left;
        }
        return Min;
    }

    void Insert(int Data) {
        Root = InsertData(Root, Data);
    }

    Node InsertData(Node Root, int Data) {
        if (Root == null) {
            Root = new Node(Data);
            return Root;
        }
        if (Data < Root.Data) {
            Root.left = InsertData(Root.left, Data);
        } else if (Data > Root.Data) {
            Root.right = InsertData(Root.right, Data);
        }
        return Root;
    }

    void inorder() {
        InorderData(Root);
    }

    void InorderData(Node Root) {
        if (Root != null) {
            InorderData(Root.left);
            System.out.print(Root.Data + " ");
            InorderData(Root.right);
        }
    }

    public static void main(String[] args) {
        BSTDeleteNode tree = new BSTDeleteNode();

       /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
        20   40  60   80 
      */
        tree.Insert(50);
        tree.Insert(30);
        tree.Insert(20);
        tree.Insert(40);
        tree.Insert(70);
        tree.Insert(60);
        tree.Insert(80);

        System.out.println("Inorder traversal of the given tree");
        tree.inorder();

        System.out.println("\nDelete 20");
        tree.DeleteNode(20);
        System.out.println("Inorder traversal of the modified tree");
        tree.inorder();

        System.out.println("\nDelete 30");
        tree.DeleteNode(30);
        System.out.println("Inorder traversal of the modified tree");
        tree.inorder();

        System.out.println("\nDelete 50");
        tree.DeleteNode(50);
        System.out.println("Inorder traversal of the modified tree");
        tree.inorder();
    }
}