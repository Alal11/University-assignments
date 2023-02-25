import numpy as np


def nearest_value(vactor, n):
    dif = np.abs(vactor-n)
    print("가장 인접한 값: {0}".format(vactor[dif.argmin()]))


X = np.array([1, 2, 3, 4, 5, 6, 7])
target = 4.3
nearest_value(X, target)
