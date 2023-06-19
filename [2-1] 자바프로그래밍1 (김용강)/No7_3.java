// 주사위를 Dice 클래스로 모델링 (주사위를 굴리는 함수 포함)
// Dice 클래스에 대한 객체 두 개를 생성하여, 각각 굴렸을 때 두 주사위의 숫자 합이 2가 되기까지 걸린 횟수 출력

class Dice{
    private int value;

    public Dice(){
        value=0;
    }

    public void roll(){
        value=(int) (Math.random()*6)+1;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int Value){
        this.value=value;
    }
}

public class No7_3 {
    public static void main(String[] args) {

        Dice dice1, dice2;
        int rollCount=0;

        dice1=new Dice();
        dice2=new Dice();

        do{
            dice1.roll();
            dice2.roll();
            System.out.println("주사위1= "+dice1.getValue()+" 주사위2= "+dice2.getValue());
            rollCount++;
        } while ((dice1.getValue()+dice2.getValue())!=2);

        System.out.println("(1, 1)이 나오는데 걸린 횟수= "+rollCount);
    }
}
