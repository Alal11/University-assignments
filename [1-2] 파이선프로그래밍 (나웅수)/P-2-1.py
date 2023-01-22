# os.listdir() 함수와 os.path.isdir() 함수
import os

# 현재 디렉토리 내의 모든 파일과 폴더명을 리스트의 형태로 나열
list = os.listdir(".")

print("# 폴더와 파일 구분하기")

for x in list:
    if (os.path.isdir(x)):      # 입력된 경로가 폴더인지 아닌지 판별
        print("폴더:", x)
    else:
        print("파일:", x)
