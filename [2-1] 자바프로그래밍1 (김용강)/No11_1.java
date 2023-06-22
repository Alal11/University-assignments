// 아래 프로그램 작성 후 결과 확인

public class No11_1 {
    private int i;
    protected char c;
    public int f;
    private void teatA(){
        i=3;
        c='a';
        f=1;
    }
}

class A extends No11_1{
    int j;
    void testB(){
        j=6;
        // i=9;     // 오류 남
        c='k';
        f=89;
        // testA();     // 오류 남
    }
}
