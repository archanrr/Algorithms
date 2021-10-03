// Java Program to print binary tree in 2D
class GFG
{
	
static final int COUNT = 10;

// Function to print binary tree in 2D
// It does reverse inorder traversal
static void print2DUtil(Node root, int space)
{
	// Base case
	if (root == null)
		return;

	// Increase distance between levels
	space += COUNT;

	// Process right child first
	print2DUtil(root.right, space);

	// Print current node after space
	// count
	System.out.print("\n");
	for (int i = COUNT; i < space; i++)
		System.out.print(" ");
	System.out.print(root.data + "\n");

	// Process left child
	print2DUtil(root.left, space);
}

// Wrapper over print2DUtil()
static void print2D(Node root)
{
	// Pass initial space count as 0
	print2DUtil(root, 0);
}
}

// This code is contributed by Arnab Kundu
