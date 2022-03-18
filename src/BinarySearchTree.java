public class BinarySearchTree {
    BinarySearchSubTree root;

    static class BinarySearchSubTree {
        private int key;
        private BinarySearchSubTree parent;
        private BinarySearchSubTree left;
        private BinarySearchSubTree right;

        public BinarySearchSubTree(int key) {
            this.key = key;
        }

        public BinarySearchSubTree getParent() {
            return parent;
        }

        public void setParent(BinarySearchSubTree parent) {
            this.parent = parent;
        }

        public BinarySearchSubTree getLeft() {
            return left;
        }

        public void setLeft(BinarySearchSubTree left) {
            this.left = left;
        }

        public BinarySearchSubTree getRight() {
            return right;
        }

        public void setRight(BinarySearchSubTree right) {
            this.right = right;
        }
    }
}