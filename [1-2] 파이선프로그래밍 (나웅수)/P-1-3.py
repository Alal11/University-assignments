def city_three(a):                        # 사용자 정의 함수 city_three 선언

    while (1):                            # 무한 반복문
        a = input("도시를 추가하세요 (종료: exit) : ")
        if a == "exit":                   # a가 exit라면 반복문 멈춤
            break
        else:
            # city 리스트에 a를 인덱스 0부터 2까지 슬라이싱 한 것을 추가
            city.append(a[0:3])

    return city


city = []

city_three(city)                           # 사용자 정의 함수 호출

print("결과 >> ", city)                    # city 출력
