# include <stdio.h>

int main()
{
	char munja[30];
	FILE* fp;
	errno_t err;

	printf("■ \'test05.txt\' 파일을 열고 닫는 프로그램\n");
	err = fopen_s(&fp, "test05.txt", "w");						// fopen_s() : 파일 열기 - 에서 사용하는 파일 모드 w : 파일 새로 생성해서 열기(기존 파일 내용은 삭제)
	
	
	if (NULL != fp)						// 파일 열기에 성공한 경우
	{
		printf("test05.txt 파일 생성 완료\n");

		printf("1.문자열 입력 : ");
		gets_s(munja, sizeof(munja));							// gets_s() : 표준 입력 스트림의 버퍼에서 문자열 읽기

		printf("2.파일에 입력한 문자열은 %s\n",munja);

		for (int cnt = 0; munja[cnt] != NULL; cnt++)
			fputc(munja[cnt], fp);								// fputs() : 문자열 출력하기

		printf("3.문자열 입력 : ");
		gets_s(munja, sizeof(munja));

		printf("4.파일에 추가한 문자열은 %s\n", munja);

		for (int cnt = 0; munja[cnt] != NULL; cnt++)
			fputc(munja[cnt], fp);

		fclose(fp);												// fclose() : 파일 닫기
		printf("5.test05.txt 파일의 전체 내용을 확인하세요.\n");
	}
	else
	{
		printf("파일 열기에 실패 했습니다!\n");
	}

	return 0;
}
