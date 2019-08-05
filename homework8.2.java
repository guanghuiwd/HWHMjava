//代理模式和装饰者模式

public class SportsmanCn implements Sportsman {//定义运动员
    private String name;
    private String wins;
    private String loses;
    @Override
    public void Game() {//定义比赛
        Higher();
        Faster();
        Stronger();
    }
    void Higher(){ System.out.println("运动员：更高"); }
    void Faster() { System.out.println("运动员：更快"); }
    void Stronger(){ System.out.println("运动员：更强"); }
}

public class Agent implements Sportsman{//代理模式：通过定义一个代理人来帮运动员做额外工作

    Sportsman sportsman;

    public Agent(Sportsman sportsman) {
        this.sportsman = sportsman;
    }

    void findOpponent(){
        System.out.println("代理人:寻找适用于当前运动员的对手");
    }

    void findSponsor(){
        System.out.println("代理人:寻找赞助商");
    }

    void Negotiate(){
        System.out.println("代理人:洽谈");
    }

   @Override
    public void Game() {
        findOpponent();
        findSponsor();
        Negotiate();
        System.out.println("让运动员去比赛");
        sportsman.Game();
    }
}
public class Test {//代理模式实现
    public static void main(String[] args) {
        Sportsman realSportsman = new SportsmanCn();
        Sportsman Agent = new Agent(realSportsman);
        System.out.println("准备比赛！");
        Agent.Game();
        System.out.println("比赛结束");
    }
}

public class SportsmanInTechShoes implements Sportsman {//装饰者模式：给运动员高科技鞋
    Sportsman sportsman;
    public SportsmanInTechShoes(Sportsman sportsman) {
        this.sportsman = sportsman;
    }
    void moveFast(){
        System.out.println("穿上高科技鞋：速度+10");
    }

    @Override
    public void Game() {
        sportsman.Game();
    }
}
public class Test2 {//装饰者模式实现
    public static void main(String[] args) {
        Sportsman realSportsman = new SportsmanCn();
        SportsmanInTechShoes sportsmanInTechShoes = new SportsmanInTechShoes(realSportsman);
        Sportsman Agent = new Agent(sportsmanInTechShoes);
        System.out.println("准备比赛！");
        sportsmanInTechShoes.moveFast();
        Agent.Game();
        System.out.println("比赛结束");
    }
}
