
public class Periodical extends Item {

private int issueNum;

public Periodical(String name, int issueNum) {
super(name);
this.issueNum = issueNum;
}

@Override
public String getListing() {
return "Periodical Title: " + title + "\n" + "Issue# " + issueNum;
}

}
