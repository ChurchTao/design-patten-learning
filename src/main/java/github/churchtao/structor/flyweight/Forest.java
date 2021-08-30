package github.churchtao.structor.flyweight;

import github.churchtao.structor.flyweight.factory.TreeFactory;
import github.churchtao.structor.flyweight.item.Tree;
import github.churchtao.structor.flyweight.item.TreeType;

import java.util.ArrayList;
import java.util.List;

public class Forest {

    private List<Tree> trees = new ArrayList<>();

    public static void main(String[] args) {
        Forest forest = new Forest();

        TreeType treeType = TreeFactory.getTreeType("红黑树","red","木头");
        TreeType treeType2 = TreeFactory.getTreeType("红黑树","black","木头");
        TreeType bplusTree = TreeFactory.getTreeType("B+树","透明","jingtir-=");

        Tree tree1 = new Tree(1,2,treeType);
        forest.trees.add(tree1);
        Tree tree2 = new Tree(2,3,treeType);
        forest.trees.add(tree2);
        Tree tree3 = new Tree(3,4,treeType);
        forest.trees.add(tree3);
        Tree tree4 = new Tree(3,1,treeType);
        forest.trees.add(tree4);
        Tree tree5 = new Tree(4,6,treeType);
        forest.trees.add(tree5);
        for (Tree tree : forest.trees) {
            tree.draw("this");
        }



    }

}
