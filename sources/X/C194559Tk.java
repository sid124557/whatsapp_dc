package X;

import android.graphics.SurfaceTexture;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.opengl.GLES20;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9Tk  reason: invalid class name and case insensitive filesystem */
public class C194559Tk {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public MediaRecorder A07;
    public Surface A08;
    public RandomAccessFile A09;
    public CountDownLatch A0A;
    public final Object A0B;
    public final boolean A0C;
    public volatile SurfaceTexture A0D;
    public volatile SurfaceTexture A0E;
    public volatile AnonymousClass9XB A0F;

    public void A03() {
        try {
            MediaRecorder mediaRecorder = this.A07;
            if (mediaRecorder != null) {
                mediaRecorder.stop();
            }
            MediaRecorder mediaRecorder2 = this.A07;
            if (mediaRecorder2 != null) {
                mediaRecorder2.reset();
                this.A07.release();
                this.A07 = null;
            }
            AnonymousClass9XB r0 = this.A0F;
            if (r0 != null) {
                r0.A05((Surface) null);
            }
            Surface surface = this.A08;
            if (surface != null) {
                surface.release();
                this.A08 = null;
            }
            RandomAccessFile randomAccessFile = this.A09;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException unused) {
                }
                this.A09 = null;
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        } catch (Throwable th) {
            MediaRecorder mediaRecorder3 = this.A07;
            if (mediaRecorder3 != null) {
                mediaRecorder3.reset();
                this.A07.release();
                this.A07 = null;
            }
            AnonymousClass9XB r02 = this.A0F;
            if (r02 != null) {
                r02.A05((Surface) null);
            }
            Surface surface2 = this.A08;
            if (surface2 != null) {
                surface2.release();
                this.A08 = null;
            }
            RandomAccessFile randomAccessFile2 = this.A09;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (IOException unused2) {
                }
                this.A09 = null;
            }
            throw th;
        }
    }

    public SurfaceTexture A00(int i, int i2, int i3, int i4, int i5) {
        SurfaceTexture surfaceTexture;
        this.A00 = i4;
        this.A04 = i5;
        this.A06 = i3;
        boolean A1S = AnonymousClass000.A1S(i3 % 180);
        int i6 = i;
        if (A1S) {
            i6 = i2;
        }
        this.A02 = i6;
        if (!A1S) {
            i = i2;
        }
        this.A01 = i;
        try {
            this.A0A.await(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e("GLSurfacePipeCoordinatorImpl", AnonymousClass000.A0a("Timeout when creating SurfaceNode: ", AnonymousClass001.A0o(), e));
        }
        synchronized (this.A0B) {
            SurfaceTexture surfaceTexture2 = this.A0E;
            if (surfaceTexture2 != null) {
                AnonymousClass9XB r3 = this.A0F;
                if (r3 == null) {
                    r3 = new AnonymousClass9XB(this.A0C);
                    this.A0F = r3;
                }
                r3.A03(surfaceTexture2, this.A04);
                int i7 = this.A02;
                int i8 = this.A01;
                SurfaceTexture surfaceTexture3 = r3.A0B;
                if (!(surfaceTexture3 != null && r3.A01 == i7 && r3.A00 == i8)) {
                    r3.A01 = i7;
                    r3.A00 = i8;
                    if (surfaceTexture3 != null) {
                        surfaceTexture3.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
                        r3.A0B.release();
                        r3.A0B = null;
                    }
                    int i9 = r3.A03;
                    if (i9 != -1) {
                        GLES20.glDeleteTextures(1, new int[]{i9}, 0);
                        r3.A03 = -1;
                    }
                    int[] iArr = new int[1];
                    GLES20.glGenTextures(1, iArr, 0);
                    AnonymousClass9XB.A02("glGenTextures");
                    int i10 = iArr[0];
                    r3.A03 = i10;
                    GLES20.glBindTexture(36197, i10);
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("glBindTexture ");
                    AnonymousClass9XB.A02(AnonymousClass000.A0h(A0o, r3.A03));
                    GLES20.glTexParameterf(36197, 10241, 9729.0f);
                    GLES20.glTexParameterf(36197, 10240, 9729.0f);
                    GLES20.glTexParameteri(36197, 10242, 33071);
                    GLES20.glTexParameteri(36197, 10243, 33071);
                    AnonymousClass9XB.A02("glTexParameter");
                    SurfaceTexture surfaceTexture4 = new SurfaceTexture(r3.A03);
                    r3.A0B = surfaceTexture4;
                    surfaceTexture4.setOnFrameAvailableListener(r3);
                    surfaceTexture3 = r3.A0B;
                }
                this.A0D = surfaceTexture3;
                surfaceTexture = this.A0D;
            } else {
                throw AnonymousClass001.A0e("SurfaceNode was not created");
            }
        }
        return surfaceTexture;
    }

    public AnonymousClass9VT A01(CamcorderProfile camcorderProfile, String str, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (this.A06 % 180 != 0) {
            i2 = camcorderProfile.videoFrameHeight;
            i3 = camcorderProfile.videoFrameWidth;
        } else {
            i2 = camcorderProfile.videoFrameWidth;
            i3 = camcorderProfile.videoFrameHeight;
        }
        if (!this.A0C) {
            i4 = this.A02;
            i5 = this.A01;
        } else if (this.A04 % 180 != 0) {
            i4 = this.A03;
            i5 = this.A05;
        } else {
            i4 = this.A05;
            i5 = this.A03;
        }
        float f = (float) i2;
        float f2 = (float) i3;
        float f3 = ((float) i4) / ((float) i5);
        if (f / f2 > f3) {
            i2 = (int) (f2 * f3);
        } else {
            i3 = (int) (f / f3);
        }
        camcorderProfile.videoFrameWidth = i2 - (i2 % 16);
        camcorderProfile.videoFrameHeight = i3 - (i3 % 16);
        String str2 = str;
        this.A09 = new RandomAccessFile(str, "rws");
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.A07 = mediaRecorder;
        mediaRecorder.setAudioSource(5);
        this.A07.setVideoSource(2);
        this.A07.setOrientationHint(this.A00);
        this.A07.setProfile(camcorderProfile);
        this.A07.setOutputFile(this.A09.getFD());
        this.A07.prepare();
        this.A08 = this.A07.getSurface();
        AnonymousClass9XB r1 = this.A0F;
        if (r1 != null) {
            r1.A05(this.A08);
        }
        this.A07.start();
        AnonymousClass9S5 r3 = new AnonymousClass9S5(str2, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, this.A00, i);
        r3.A00(AnonymousClass9VT.A0J, Integer.valueOf(camcorderProfile.audioCodec));
        r3.A00(AnonymousClass9VT.A0R, Integer.valueOf(camcorderProfile.videoCodec));
        r3.A00(AnonymousClass9VT.A0O, Long.valueOf(SystemClock.elapsedRealtime()));
        return new AnonymousClass9VT(r3);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0051 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02() {
        /*
            r10 = this;
            X.9XB r4 = r10.A0F
            r3 = 0
            r10.A0F = r3
            if (r4 == 0) goto L_0x00d9
            android.opengl.EGLDisplay r1 = r4.A0F
            android.opengl.EGLDisplay r0 = android.opengl.EGL14.EGL_NO_DISPLAY
            r6 = -1
            r5 = 0
            if (r1 == r0) goto L_0x00b9
            java.lang.Object r8 = r4.A0I
            monitor-enter(r8)
            android.opengl.EGLSurface r1 = r4.A0T     // Catch:{ all -> 0x0081 }
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE     // Catch:{ all -> 0x0081 }
            r2 = 1
            if (r1 == r0) goto L_0x0065
            android.opengl.EGLDisplay r9 = r4.A0F     // Catch:{ RuntimeException -> 0x0051 }
            android.opengl.EGLSurface r7 = r4.A0T     // Catch:{ RuntimeException -> 0x0051 }
            android.opengl.EGLSurface r1 = r4.A0T     // Catch:{ RuntimeException -> 0x0051 }
            android.opengl.EGLContext r0 = r4.A0E     // Catch:{ RuntimeException -> 0x0051 }
            android.opengl.EGL14.eglMakeCurrent(r9, r7, r1, r0)     // Catch:{ RuntimeException -> 0x0051 }
            android.opengl.EGLDisplay r7 = r4.A0F     // Catch:{ RuntimeException -> 0x0051 }
            android.opengl.EGLSurface r1 = r4.A0T     // Catch:{ RuntimeException -> 0x0051 }
            int[] r9 = r4.A0Q     // Catch:{ RuntimeException -> 0x0051 }
            r0 = 12375(0x3057, float:1.7341E-41)
            android.opengl.EGL14.eglQuerySurface(r7, r1, r0, r9, r5)     // Catch:{ RuntimeException -> 0x0051 }
            android.opengl.EGLDisplay r7 = r4.A0F     // Catch:{ RuntimeException -> 0x0051 }
            android.opengl.EGLSurface r1 = r4.A0T     // Catch:{ RuntimeException -> 0x0051 }
            r0 = 12374(0x3056, float:1.734E-41)
            android.opengl.EGL14.eglQuerySurface(r7, r1, r0, r9, r2)     // Catch:{ RuntimeException -> 0x0051 }
            r1 = r9[r5]     // Catch:{ RuntimeException -> 0x0051 }
            r0 = r9[r2]     // Catch:{ RuntimeException -> 0x0051 }
            android.opengl.GLES20.glViewport(r5, r5, r1, r0)     // Catch:{ RuntimeException -> 0x0051 }
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            android.opengl.GLES20.glClearColor(r0, r0, r0, r1)     // Catch:{ RuntimeException -> 0x0051 }
            r0 = 16384(0x4000, float:2.2959E-41)
            android.opengl.GLES20.glClear(r0)     // Catch:{ RuntimeException -> 0x0051 }
            android.opengl.EGLDisplay r1 = r4.A0F     // Catch:{ RuntimeException -> 0x0051 }
            android.opengl.EGLSurface r0 = r4.A0T     // Catch:{ RuntimeException -> 0x0051 }
            android.opengl.EGL14.eglSwapBuffers(r1, r0)     // Catch:{ RuntimeException -> 0x0051 }
        L_0x0051:
            android.opengl.EGLDisplay r7 = r4.A0F     // Catch:{ all -> 0x0081 }
            android.opengl.EGLSurface r1 = r4.A0G     // Catch:{ all -> 0x0081 }
            android.opengl.EGLContext r0 = r4.A0E     // Catch:{ all -> 0x0081 }
            android.opengl.EGL14.eglMakeCurrent(r7, r1, r1, r0)     // Catch:{ all -> 0x0081 }
            android.opengl.EGLDisplay r1 = r4.A0F     // Catch:{ all -> 0x0081 }
            android.opengl.EGLSurface r0 = r4.A0T     // Catch:{ all -> 0x0081 }
            android.opengl.EGL14.eglDestroySurface(r1, r0)     // Catch:{ all -> 0x0081 }
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE     // Catch:{ all -> 0x0081 }
            r4.A0T = r0     // Catch:{ all -> 0x0081 }
        L_0x0065:
            r4.A0C = r3     // Catch:{ all -> 0x0081 }
            monitor-exit(r8)     // Catch:{ all -> 0x0081 }
            java.lang.Object r7 = r4.A0J
            monitor-enter(r7)
            android.opengl.EGLSurface r1 = r4.A0U     // Catch:{ all -> 0x007e }
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE     // Catch:{ all -> 0x007e }
            if (r1 == r0) goto L_0x007c
            android.opengl.EGLDisplay r1 = r4.A0F     // Catch:{ all -> 0x007e }
            android.opengl.EGLSurface r0 = r4.A0U     // Catch:{ all -> 0x007e }
            android.opengl.EGL14.eglDestroySurface(r1, r0)     // Catch:{ all -> 0x007e }
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE     // Catch:{ all -> 0x007e }
            r4.A0U = r0     // Catch:{ all -> 0x007e }
        L_0x007c:
            monitor-exit(r7)     // Catch:{ all -> 0x007e }
            goto L_0x0084
        L_0x007e:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x007e }
            throw r0
        L_0x0081:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0081 }
            throw r0
        L_0x0084:
            android.opengl.EGLSurface r1 = r4.A0G
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE
            if (r1 == r0) goto L_0x008f
            android.opengl.EGLDisplay r0 = r4.A0F
            android.opengl.EGL14.eglDestroySurface(r0, r1)
        L_0x008f:
            int r1 = r4.A03
            if (r1 == r6) goto L_0x009a
            int[] r0 = new int[r2]
            r0[r5] = r1
            android.opengl.GLES20.glDeleteTextures(r2, r0, r5)
        L_0x009a:
            int r0 = r4.A02
            if (r0 == 0) goto L_0x00a1
            android.opengl.GLES20.glDeleteProgram(r0)
        L_0x00a1:
            android.opengl.EGLDisplay r2 = r4.A0F
            android.opengl.EGLSurface r1 = android.opengl.EGL14.EGL_NO_SURFACE
            android.opengl.EGLContext r0 = android.opengl.EGL14.EGL_NO_CONTEXT
            android.opengl.EGL14.eglMakeCurrent(r2, r1, r1, r0)
            android.opengl.EGLDisplay r1 = r4.A0F
            android.opengl.EGLContext r0 = r4.A0E
            android.opengl.EGL14.eglDestroyContext(r1, r0)
            android.opengl.EGL14.eglReleaseThread()
            android.opengl.EGLDisplay r0 = r4.A0F
            android.opengl.EGL14.eglTerminate(r0)
        L_0x00b9:
            android.opengl.EGLDisplay r0 = android.opengl.EGL14.EGL_NO_DISPLAY
            r4.A0F = r0
            android.opengl.EGLContext r0 = android.opengl.EGL14.EGL_NO_CONTEXT
            r4.A0E = r0
            r4.A0D = r3
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE
            r4.A0G = r0
            r4.A02 = r5
            r4.A03 = r6
            android.graphics.SurfaceTexture r0 = r4.A0B
            if (r0 == 0) goto L_0x00d9
            r0.setOnFrameAvailableListener(r3)
            android.graphics.SurfaceTexture r0 = r4.A0B
            r0.release()
            r4.A0B = r3
        L_0x00d9:
            r10.A0D = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194559Tk.A02():void");
    }

    public void A04(int i) {
        this.A04 = i;
        synchronized (this.A0B) {
            SurfaceTexture surfaceTexture = this.A0E;
            AnonymousClass9XB r1 = this.A0F;
            if (!(r1 == null || surfaceTexture == null)) {
                r1.A03(surfaceTexture, this.A04);
            }
        }
    }

    public C194559Tk(boolean z) {
        Object A0D2 = AnonymousClass002.A0D();
        this.A0B = A0D2;
        synchronized (A0D2) {
            this.A0A = new CountDownLatch(1);
        }
        this.A0C = z;
    }
}
