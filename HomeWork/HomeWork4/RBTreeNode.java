package HomeWork.HomeWork4;

public class RBTreeNode {
    
        private int value;
        private NodeColor color;
        private RBTreeNode leftChild;
        private RBTreeNode rigthChild;

        public int getValue() {
            return value;
        }
        public void setValue(int value) {
            this.value = value;
        }
        public NodeColor getColor() {
            return color;
        }
        public void setColor(NodeColor color) {
            this.color = color;
        }
        public RBTreeNode getLeftChild() {
            return leftChild;
        }
        public void setLeftChild(RBTreeNode leftChild) {
            this.leftChild = leftChild;
        }
        public RBTreeNode getRigthChild() {
            return rigthChild;
        }
        public void setRigthChild(RBTreeNode rigthChild) {
            this.rigthChild = rigthChild;
        }
        public void add(int i) {
        }

}
