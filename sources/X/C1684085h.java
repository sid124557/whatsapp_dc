package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Trace;
import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.85h  reason: invalid class name and case insensitive filesystem */
public class C1684085h implements C186408vG {
    public C158247jf A00;
    public C153037aZ A01;
    public C150057Oz A02;
    public final /* synthetic */ C1684185i A03;

    public void BhL(Context context, C151307Uf r13, C158247jf r14, AnonymousClass724 r15, C151367Um r16, int i) {
        int i2;
        HashMap A022;
        C142616xU r2 = C142616xU.CODEC_VIDEO_H264;
        C158247jf r7 = r14;
        AnonymousClass7YY r0 = r14.A0E;
        if (r0 != null) {
            r2 = r0.A02;
        }
        int i3 = r14.A0A;
        if (i3 <= 0 || (i2 = r14.A08) <= 0) {
            Object[] objArr = new Object[2];
            AnonymousClass000.A1P(objArr, i3, 0);
            AnonymousClass000.A1M(objArr, r14.A08);
            throw new AnonymousClass6O1(String.format("Invalid dimensions: width=%d, height=%d", objArr));
        }
        C150167Pm r6 = new C150167Pm(r2, i3, i2);
        r6.A05 = r14.A00();
        r6.A02 = r14.A02;
        r6.A06 = r14.A01;
        AnonymousClass7YY r02 = r14.A0E;
        if (r02 != null) {
            int i4 = r02.A01;
            int i5 = r02.A00;
            r6.A04 = i4;
            r6.A03 = i5;
            r6.A09 = true;
        }
        C1684185i r3 = this.A03;
        C153537bV r8 = r3.A01;
        if (!(r8 == null || (A022 = r8.A02(C142366x5.VIDEO)) == null)) {
            Iterator A10 = C18290x4.A10(A022);
            while (A10.hasNext()) {
                Iterator A0u = AnonymousClass6C7.A0u(((C153007aW) A10.next()).A02);
                while (A0u.hasNext()) {
                    ((C153257aw) A0u.next()).A01();
                }
            }
        }
        int i6 = r14.A0B;
        if (i6 != -1) {
            r6.A00 = i6;
        }
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(r6.A08.value, r6.A07, r6.A01);
        createVideoFormat.setInteger("color-format", 2130708361);
        int i7 = r6.A05;
        if (i7 > 0) {
            createVideoFormat.setInteger("bitrate", i7);
        }
        int i8 = r6.A06;
        if (i8 > 0) {
            createVideoFormat.setInteger("frame-rate", i8);
        }
        int i9 = r6.A02;
        if (i9 > -1) {
            createVideoFormat.setInteger("i-frame-interval", i9);
        }
        if (r6.A09) {
            createVideoFormat.setInteger("profile", r6.A04);
            createVideoFormat.setInteger("level", r6.A03);
        }
        int i10 = r6.A00;
        if (i10 != -1) {
            createVideoFormat.setInteger("bitrate-mode", i10);
        }
        new Pair(-1, -1);
        C153037aZ A023 = C162127rJ.A02(createVideoFormat, C141286vK.SURFACE, r2.value, r14.A0F);
        this.A01 = A023;
        A023.A02();
        AnonymousClass7BA r9 = r3.A00;
        C153037aZ r22 = this.A01;
        C159297la.A02(AnonymousClass000.A1Y(r22.A06, C142306wz.ENCODER), (String) null);
        this.A02 = new C150057Oz(context, r22.A05, r13, r7, r8, r9, r16);
        this.A00 = r14;
    }

    public C1684085h(C1684185i r1) {
        this.A03 = r1;
    }

    public void B1y(long j) {
        C150057Oz r2 = this.A02;
        Trace.beginSection("TranscodeOutputSurfaceForJBMMR2.displayFrame()");
        AnonymousClass7QP r0 = r2.A06.A00;
        r0.getClass();
        EGLDisplay eGLDisplay = r0.A0A;
        EGLSurface eGLSurface = r0.A0B;
        EGLExt.eglPresentationTimeANDROID(eGLDisplay, eGLSurface, j * 1000);
        EGL14.eglSwapBuffers(eGLDisplay, eGLSurface);
        Trace.endSection();
    }

    public String B7K() {
        try {
            return this.A01.A04.getName();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public MediaFormat BAI() {
        return this.A01.A00;
    }

    public int BAL() {
        C158247jf r0 = this.A00;
        return (r0.A09 + r0.A04) % 360;
    }

    public void Bis(C1683385a r5) {
        C153037aZ r3 = this.A01;
        boolean z = r3.A07;
        Trace.beginSection("MediaCodecWrapper.releaseOutputBuffer");
        int i = r5.A02;
        if (i >= 0) {
            r3.A04.releaseOutputBuffer(i, z);
        }
        Trace.endSection();
    }

    public void BjW(long j) {
        long j2 = j * 1000;
        AnonymousClass7QP r3 = this.A02.A06.A00;
        r3.getClass();
        C159217lP.A02("onDrawFrame start", AnonymousClass4L0.A0U());
        List<C185808uH> list = r3.A0F;
        if (!list.isEmpty()) {
            C159297la.A02(AnonymousClass000.A1W(r3.A04), (String) null);
            SurfaceTexture surfaceTexture = r3.A02;
            float[] fArr = r3.A0I;
            surfaceTexture.getTransformMatrix(fArr);
            if (r3.A08) {
                Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
                Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
                Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
            }
            for (C185808uH BRf : list) {
                long micros = TimeUnit.NANOSECONDS.toMicros(j2);
                C157607ia r7 = r3.A0E;
                C151837Wm r6 = r3.A04;
                float[] fArr2 = r3.A0G;
                float[] fArr3 = r3.A0J;
                float[] fArr4 = r3.A0H;
                r7.A01 = r6;
                r7.A04 = fArr;
                r7.A05 = fArr2;
                r7.A03 = fArr3;
                r7.A02 = fArr4;
                r7.A00 = j2;
                BRf.BRf(r7, micros);
            }
            return;
        }
        SurfaceTexture surfaceTexture2 = r3.A02;
        float[] fArr5 = r3.A0I;
        surfaceTexture2.getTransformMatrix(fArr5);
        GLES20.glClear(16640);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, r3.A01);
        C151997Xd A022 = r3.A03.A02();
        A022.A02("uSTMatrix", fArr5);
        A022.A02("uConstMatrix", r3.A0G);
        A022.A02("uSceneMatrix", r3.A0J);
        A022.A02("uContentTransform", r3.A0H);
        C160457nf.A01(r3.A0C, A022.A00);
        GLES20.glFinish();
    }

    public void BpK() {
        C153037aZ r2 = this.A01;
        C159297la.A02(AnonymousClass000.A1Y(r2.A06, C142306wz.ENCODER), (String) null);
        r2.A04.signalEndOfInputStream();
    }

    public void finish() {
        EGLSurface eGLSurface;
        AnonymousClass7VY r4 = new AnonymousClass7VY();
        AnonymousClass7B2.A00(r4, this.A01);
        C150057Oz r3 = this.A02;
        if (r3 != null) {
            AnonymousClass7BA r2 = r3.A06;
            if (r3.A00 != null) {
                if (EGL14.eglGetCurrentContext().equals(r3.A00)) {
                    EGLDisplay eGLDisplay = r3.A01;
                    EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
                }
                EGL14.eglDestroyContext(r3.A01, r3.A00);
            }
            EGLDisplay eGLDisplay2 = r3.A01;
            if (!(eGLDisplay2 == null || (eGLSurface = r3.A02) == null)) {
                EGL14.eglDestroySurface(eGLDisplay2, eGLSurface);
            }
            AnonymousClass7QP r0 = r2.A00;
            if (r0 != null) {
                for (C185808uH Bdl : r0.A0F) {
                    Bdl.Bdl();
                }
            }
            r3.A01 = null;
            r3.A00 = null;
            r3.A02 = null;
            r2.A00 = null;
        }
        Throwable th = r4.A01;
        if (th != null) {
            throw th;
        }
    }

    public void flush() {
        this.A02.A06.A00.getClass();
    }

    public C1683385a B1U(long j) {
        try {
            return this.A01.A01(250000);
        } catch (Throwable th) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("codec info: ");
            A0o.append(this.A01.A01);
            A0o.append(" , mMediaTranscodeParams.mDebugStats: ");
            throw new IllegalStateException(AnonymousClass000.A0X(this.A00.A0F, A0o), th);
        }
    }
}
