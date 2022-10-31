# include <stdio.h>

int main()
{
    char munja[30];
    FILE* fp;
    errno_t err;

    printf("■키보드로 입력한 문자열을 파일에 저장\n");
    err = fopen_s(&fp, "input.txt", "w");


    if (NULL != fp)
    {
        printf("input.txt 파일 생성 완료!\n");

        printf("1.문자열 입력 : ");
        gets_s(munja, sizeof(munja));

        printf("2.파일에 쓴 내용 출력 : %s\n", munja);

        for (int cnt = 0; munja[cnt] != NULL; cnt++)
            fputc(munja[cnt], fp);

        fclose(fp);
        printf("input.txt 파일 닫기 성공!\n");
    }
    else
    {
        printf("파일 열기에 실패 했습니다!\n");
    }
    
    return 0;
}
