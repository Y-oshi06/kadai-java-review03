package baseball;

public class BaseBallTeam {
    public String name;
    public int win;
    public int lose;
    public int draw;

    public BaseBallTeam(String name,int win,int lose,int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    public double getRate(){
        double winRate = (double) win / (win + lose);
        return winRate;
    }

    public void report(){
        double a = getRate();
        System.out.println(this.name +"の2022年の成績は、" + this.win +"勝" + this.lose +"敗" +this.draw + "分" + a + "です。" );

    }

}
