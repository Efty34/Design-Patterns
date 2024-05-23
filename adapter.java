interface webdriver {
    public void getelement();
    public void setelement();
}

class chromedriver implements webdriver {
    @Override
    public void getelement() {
        System.out.println("Get Element from Chrome Driver");
    }

    @Override
    public void setelement() {
        System.out.println("Set Element from Chrome Driver");
    }

}

class iedriver {
    public void findelement() {
        System.out.println("Find Element from IE Driver");
    }

    public void clickelement() {
        System.out.println("Click Element from IE Driver");
    }
}

class webadapter implements webdriver {
    iedriver ied;

    public webadapter(iedriver ied) {
        this.ied = ied;
    }

    @Override
    public void getelement() {
        ied.findelement();
    }

    @Override
    public void setelement() {
        ied.clickelement();
    }
}

public class adapter {
    public static void main(String[] args) {
        chromedriver cd = new chromedriver();
        cd.getelement();
        cd.setelement();

        iedriver ied = new iedriver();
        ied.findelement();
        ied.clickelement();

        webdriver wd = new webadapter(ied);
        wd.getelement();
        wd.setelement();
    }
}
