package HomeWork.HomeWork4;

public class RBTree {

    RBTreeNode root;
    private StringBuilder vizualTree = new StringBuilder();

    public boolean add(int value) {
        if (root != null) {
            boolean result = addNode(root, value);
            root = treeRebalance(root);
            root.setColor(NodeColor.BLACK);
            return result;
        } else {
            root = new RBTreeNode();
            root.setColor(NodeColor.BLACK);
            root.setValue(value);
            return true;
        }
    }

    public boolean addNode(RBTreeNode node, int value) {
        if (node.getValue() == value) {
            return false;
        } else {
            if (node.getValue() > value) {
                if (node.getLeftChild() != null) {
                    boolean result = addNode(node.getLeftChild(), value);
                    node.setLeftChild(treeRebalance(node.getLeftChild()));
                    return result;
                } else {
                    node.setLeftChild(new RBTreeNode());
                    node.getLeftChild().setColor(NodeColor.RED);
                    node.getLeftChild().setValue(value);
                    return true;
                }
            } else {
                if (node.getRigthChild() != null) {
                    boolean result = addNode(node.getRigthChild(), value);
                    node.setRigthChild(treeRebalance(node.getRigthChild()));
                    return result;
                } else {
                    node.setRigthChild(new RBTreeNode());
                    node.getRigthChild().setColor(NodeColor.RED);
                    node.getRigthChild().setValue(value);
                    return true;
                }
            }
        }
    }

    private RBTreeNode treeRebalance(RBTreeNode node) {
        RBTreeNode result = node;
        boolean needRebalance;
        do {
            needRebalance = false;
            if (result.getRigthChild() != null && result.getRigthChild().getColor() == NodeColor.RED &&
                    (result.getLeftChild() != null && result.getLeftChild().getColor() == NodeColor.BLACK)) {
                needRebalance = true;
                result = rigthSwap(result);
            }
            if (result.getLeftChild() != null && result.getLeftChild().getColor() == NodeColor.RED &&
                    (result.getLeftChild().getLeftChild() != null
                            && result.getLeftChild().getLeftChild().getColor() == NodeColor.RED)) {
                needRebalance = true;
                result = leftSwap(result);
            }
            if (result.getLeftChild() != null && result.getLeftChild().getColor() == NodeColor.RED &&
                    result.getRigthChild() != null && result.getRigthChild().getColor() == NodeColor.RED) {
                needRebalance = true;
                colorSwap(result);
            }
        } while (needRebalance);
        return result;
    }

    private RBTreeNode rigthSwap(RBTreeNode node) {

        RBTreeNode rigthChild = node.getRigthChild();
        RBTreeNode betweenChild = rigthChild.getLeftChild();
        rigthChild.setLeftChild(node);
        node.setRigthChild(betweenChild);
        rigthChild.setColor(node.getColor());
        node.setColor(NodeColor.RED);
        return rigthChild;

    }

    private RBTreeNode leftSwap(RBTreeNode node) {
        RBTreeNode leftChild = node.getLeftChild();
        RBTreeNode betweenChild = leftChild.getRigthChild();
        leftChild.setRigthChild(node);
        node.setLeftChild(betweenChild);
        leftChild.setColor(node.getColor());
        node.setColor(NodeColor.RED);
        return leftChild;
    }

    private void colorSwap(RBTreeNode node) {
        node.getRigthChild().setColor(NodeColor.BLACK);
        node.getLeftChild().setColor(NodeColor.BLACK);
        node.setColor(NodeColor.RED);
    }

    @Override
    public String toString() {
        System.out.println("строение слева --> направо");
        System.out.println("  ");
        buildTree("", root);
        return vizualTree.toString();
    }

    public void buildTree(String prefix, RBTreeNode node) {
        if (node != null) {
            buildTree(prefix + "     ", node.getRigthChild());
            vizualTree.append(prefix).append(" --< ").append(node.getValue())
                             .append("").append(node.getColor().toString()).append("\n");
            buildTree(prefix + "      ", node.getLeftChild());
        }
    }

}
