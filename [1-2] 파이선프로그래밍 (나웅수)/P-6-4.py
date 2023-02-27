import numpy as np

lotto = np.random.randint(1, 46, size=6)

print("추출된 번호: {0}".format(np.sort(lotto)))
