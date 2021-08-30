package github.churchtao.behaviour.chain.component;

public class Panel extends Container{

    private String modalHelpText;

    public Panel(String modalHelpText) {
        this.modalHelpText = modalHelpText;
    }

    @Override
    public void showHelp() {
        if (modalHelpText!=null){
            System.out.println("Panel:"+modalHelpText);
        } else {
            super.showHelp();
        }
    }
}
