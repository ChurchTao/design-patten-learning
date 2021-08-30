package github.churchtao.structor.flyweight.factory;

import github.churchtao.structor.flyweight.item.TreeType;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

    private static Map<String, TreeType> treeTypes = new HashMap<>();


    public static TreeType getTreeType(String name,String color,String texture){
        String key = name+"_"+color+"_"+texture;
        if (treeTypes.get(key)!=null){
            return treeTypes.get(key);
        } else {
            TreeType treeType = new TreeType(name, color, texture);
            treeTypes.put(key,treeType);
            return treeType;
        }
    }
}
