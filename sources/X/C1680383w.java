package X;

import android.graphics.SurfaceTexture;

/* renamed from: X.83w  reason: invalid class name and case insensitive filesystem */
public class C1680383w implements C185288tO, C180458l6 {
    public int A00;
    public int A01;
    public final AnonymousClass7Ow A02 = new AnonymousClass7Ow();
    public final AnonymousClass7U1 A03;
    public final C162017r3 A04;
    public final boolean A05;
    public final float[] A06 = new float[16];

    public void AxN(C185558ts r6) {
        AnonymousClass7U1 r2;
        int i;
        AnonymousClass96Y r3;
        int i2;
        AnonymousClass7Ow r4 = this.A02;
        if (r4.A04 == null) {
            if (this.A05) {
                AnonymousClass96Y r32 = new AnonymousClass96Y();
                r4.A04 = r32;
                r2 = this.A03;
                i = r32.A02().A00;
                r3 = r32;
            } else {
                r2 = this.A03;
                C150027Ov r1 = new C150027Ov("SurfaceInput");
                r1.A01 = 36197;
                C151837Wm r33 = new C151837Wm(r1);
                r4.A04 = r33;
                i = r33.A00;
                r3 = r33;
            }
            r2.A03 = i;
            if (i != 0) {
                SurfaceTexture surfaceTexture = r2.A04;
                if (surfaceTexture != null) {
                    surfaceTexture.detachFromGLContext();
                    surfaceTexture.attachToGLContext(i);
                    if (r2.A02) {
                        surfaceTexture.setOnFrameAvailableListener(r2.A00);
                    }
                    surfaceTexture.updateTexImage();
                } else {
                    r2.A00();
                }
            }
            int i3 = this.A01;
            if (i3 > 0 && (i2 = this.A00) > 0) {
                r3.A01(i3, i2);
            }
        }
    }

    public void B1c() {
        AnonymousClass7Ow r1 = this.A02;
        C151837Wm r0 = r1.A04;
        if (r0 != null) {
            r0.A00();
            r1.A04 = null;
        }
        AnonymousClass7U1 r3 = this.A03;
        if (r3.A04 != null) {
            synchronized (r3.A01) {
                SurfaceTexture surfaceTexture = r3.A04;
                r3.A04 = null;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
            }
        }
        r3.A03 = 0;
    }

    public AnonymousClass7Ow B7r() {
        long j;
        try {
            AnonymousClass7U1 r8 = this.A03;
            SurfaceTexture surfaceTexture = r8.A04;
            if (surfaceTexture != null) {
                surfaceTexture.updateTexImage();
            }
            float[] fArr = this.A06;
            SurfaceTexture surfaceTexture2 = r8.A04;
            if (surfaceTexture2 != null) {
                surfaceTexture2.getTransformMatrix(fArr);
            }
            C162017r3 r6 = this.A04;
            int i = 0;
            while (true) {
                float[] fArr2 = r6.A0B;
                if (i >= fArr2.length) {
                    break;
                } else if (fArr[i] != fArr2[i]) {
                    System.arraycopy(fArr, 0, fArr2, 0, 16);
                    r6.A08 = true;
                    break;
                } else {
                    i++;
                }
            }
            AnonymousClass7Ow r2 = this.A02;
            r2.A05 = r6.A02();
            SurfaceTexture surfaceTexture3 = r8.A04;
            if (surfaceTexture3 != null) {
                j = surfaceTexture3.getTimestamp();
            } else {
                j = 0;
            }
            r2.A03 = j;
        } catch (RuntimeException unused) {
        }
        return this.A02;
    }

    public void BFr(C185568tt r1) {
    }

    public void release() {
    }

    public C1680383w(AnonymousClass7U1 r2, C162017r3 r3) {
        this.A04 = r3;
        this.A03 = r2;
        this.A05 = C195029Vp.A00();
    }
}
