package github.churchtao.behaviour.chain.component;

public class Dialog extends Container{

    private String wikiPageUrl;

    public Dialog(String wikiPageUrl) {
        this.wikiPageUrl = wikiPageUrl;
    }

    @Override
    public void showHelp() {
        if (wikiPageUrl!=null){
            System.out.println("open web:"+wikiPageUrl);
        } else {
            super.showHelp();
        }
    }

    public String getWikiPageUrl() {
        return wikiPageUrl;
    }

    public void setWikiPageUrl(String wikiPageUrl) {
        this.wikiPageUrl = wikiPageUrl;
    }
}
