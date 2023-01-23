import calendar                 # claenda 모듈을 가져온다

# week_list에 월~일요일까지 넣어준다
week_list = ['월요일', '화요일', '수요일', '목요일', '금요일', '토요일', '일요일']

# 윤년인지 판단하는 isleap 메서드(윤년이면 거짓)
print("2022년은 윤년? :", calendar.isleap(2022))

# 지정한 연도 사이에 윤년이 몇 번 있는지 출력
print("2000~2050년 사이의 윤년의 갯수:", calendar.leapdays(2000, 2050))

# 지정한 날짜의 요일에 해당하는 값을 받은 후 week_list의 인덱스에 해당하는 요일 출력
print("2022년 10월 13일은 :", week_list[calendar.weekday(2022, 10, 13)])
