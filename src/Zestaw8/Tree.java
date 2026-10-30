package Zestaw8;

public class Tree extends Plant implements Comparable<Tree> {
    private int height;

    public Tree(String name, int height){
        super(name);
        this.height = height;
    }
    public int getHeight() {return height;}

    @Override
    public int compareTo(Tree other){
        return Integer.compare(this.height, other.height);
    }
    @Override
    public String toString(){
        return "Tree: {name= " +getName()+ ", height= " +height+ "}";
    }
}
