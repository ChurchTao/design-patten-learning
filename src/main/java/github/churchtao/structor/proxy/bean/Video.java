package github.churchtao.structor.proxy.bean;

public class Video {

    private int id;
    private String name;

    public Video(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
