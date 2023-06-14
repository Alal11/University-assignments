// Person이라는 클래스를 작성하고 테스트
// 필드
//  - Name: 이름 / String
//  - Mobile: 폰번호 / String / private
//  - Office: 사무실번호 / String / private
//  - Email: 이메일 / String / private
// method
//  - Person(n, m, o, e): 생성자
//  - toString(): 문자열 변환 / 출력
//  - setName(), getName(), setMobile(), getMobile(), setOffice(), setEmail(), getEmail()
// PersonTest


class Person {
    String name;
    private String mobile;
    private String office;
    private String email;

    public Person(String name, String mobile, String office, String email)
    {
        // super();
        this.name=name;
        this.mobile=mobile;
        this.office=office;
        this.email=email;
    }

    @Override
    public String toString(){
        return "연습문제6.Person [name="+name+", mobile="+mobile+", office="+office+", email="+email+"]";
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getMobile()
    {
        return mobile;
    }
    public void setMobile(String mobile){
        this.mobile=mobile;
    }
    public String getOffice()
    {
        return office;
    }
    public void setOffice(String office)
    {
        this.office=office;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
}


public class No6_11 {
    public static void main(String[] args) {
        Person obj=new Person("Kim","01012345678","0311234567","abc@example.net");
        System.out.println(obj);

        System.out.println("name="+obj.getName()+", mobile="+obj.getMobile()+", office="+obj.getOffice()+", email="+obj.getEmail());

        obj.setName("Park");
        obj.setMobile("01087654321");
        obj.setOffice("0411234567");
        obj.setEmail("cba@example.ac.kr");
        System.out.println(obj);

        Person obj2=obj;
        System.out.println(obj2);
    }
}
