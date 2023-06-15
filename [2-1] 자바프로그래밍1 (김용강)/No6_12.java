// SafeArray 클래스 작성
// 속성
//  - private int a[];
//  - public int length;
// SafeArray 객체 생성 후 배열 값 입력 시 잘못된 인덱스 번호 차단
// 예시
// SafeArray array = new SafeArray(3);
// 이후 array[3] 에 값 넣으려고 할 시 "잘못된 인덱스 3" 이라고 반환

class SafeArray{
    private int a[];
    public int length;

    public SafeArray(int size){
        a=new int[size];
        length=size;
    }

    public int get(int index){
        if(index>=0&&index<length)
            return a[index];
        return -1;
    }

    public void put(int index, int value){
        if(index>=0&&index<length)
            a[index]=value;
        else System.out.println("잘못된 인덱스 "+index);
    }
}

public class No6_12 {
    public static void main(String[] args) {
        SafeArray array=new SafeArray(3);

        for(int i=0; i<(array.length+1); i++)
        {
            array.put(i, i*10); // put(index, value)
        }
    }
}
