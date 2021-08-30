package github.churchtao.behaviour.chain.component;

public abstract class Component implements ComponentWithContextualHelp{

    protected Container container;

    private String toolTipText;

    @Override
    public void showHelp() {
        if (toolTipText != null){
            System.out.println(toolTipText);
        } else {
            container.showHelp();
        }
    }

    public String getToolTipText() {
        return toolTipText;
    }

    public void setToolTipText(String toolTipText) {
        this.toolTipText = toolTipText;
    }
}
