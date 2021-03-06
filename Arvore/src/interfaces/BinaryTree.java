package interfaces;

import binary.NodeBT;

public interface BinaryTree extends Tree {
    public NodeBT getLeft(NodeBT no) throws InvalidPositionException;
    public NodeBT getRight(NodeBT no) throws InvalidPositionException;
    public NodeBT getSibling(NodeBT no) throws InvalidPositionException;
    public boolean hasLeft(NodeBT no) throws InvalidPositionException;
    public boolean hasRight(NodeBT no) throws InvalidPositionException;
    
    public void add(int key, Object o)throws InvalidPositionException;
    public Object remover(int key) throws InvalidPositionException;
    //public Position search(int key, Position p);
}
