#include <stdio.h>

FILE* fb;
errno_t err;

int open()
{
    int su = 0x0000035;

    err = fopen_s(&fb, "sample.dat", "wb");

    printf("바이너리 파일 생성 : sample.dat\n\n");
    fwrite(&su, sizeof(int), 1, fb);
    fclose(fb);

}
int data_p()
{
    int data;

    err = fopen_s(&fb, "sample.dat", "rb");     // 읽기 모드로 바이너리 파일 열기

    if (NULL != fb)               // 파일 열기에 성공한 경우
    {
        printf("sample.dat 파일 열기 성공!\n");

        fread(&data, sizeof(int), 1, fb);
        fclose(fb);

        printf("읽어온 데이터 : %d(0x00%x)\n", data, data);
    }
    else
        printf("파일 열기에 실패 했습니다!\n");

}

int main(void)
{
    printf("■바이너리 파일 생성 후 데이터 읽어오기\n");

    printf("[open() 함수 호출]\n");
    open();

    printf("[data_p() 함수 호출]\n");
    data_p();

    return 0;
}
