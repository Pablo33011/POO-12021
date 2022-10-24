import cv2
import numpy as np
import math

def SinWaveImg( img, alpha, D0, sita) :
    nr, nc = img.shape[:2]
    m = int(nr/2)
    n = int(nc/2)
    mag = alpha * np.real(img[m,n])
    for i in range (int(360/sita)):
        x = np.int(D0 * math.sin(sita*i/180*np.pi))
        y = np.int(D0 * math.cos(sita*i/180*np.pi))
        img[x+m,y+n] = mag
    return img


def Fourier( f ):
    ff = np.zeros(f.shape)
    ff = np.abs(f)
    fff = ff.copy()
    cv2.normalize(ff, fff, 0, 255, cv2.NORM_MINMAX)
    cv2.imshow("fourier", fff)
    cv2.waitKey(0)
    return fff


img = cv2.imread(".\Proyecto\Imagenes\Prueba.jpeg", 0)
nr, nc = img.shape[:2]
f = np.fft.fft2(img)
fshift = np.fft.fftshift( f )
Fourier( fshift )

sin = SinWaveImg( fshift, 0.1, 100, 90 )

noise = np.fft.ifft2( sin )
out = np.zeros( noise.shape )
out = np.uint8( np.clip(np.real(noise), 0, 255) )
cv2.imshow("output",out)
cv2.imwrite("Prueba.jpeg",out)
cv2.waitKey(0)