import numpy as np

# 1부터 100까지 임의의 난수 100개를 생성하여, 10열 10행 배열로 나타냄
arr = np.random.randint(1, 101, size=100).reshape(10, 10)

print("생성된 10x10 Array:")
print("array({0})".format(arr))
print("최댓값: {0}".format(arr.max()))
print("최소값: {0}".format(arr.min()))

print("\n2, 3 Columm Indexing:")
print("array({0})".format(arr[:, 1:3]))
