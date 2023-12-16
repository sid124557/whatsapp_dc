package X;

import android.content.Context;
import android.graphics.Point;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.SurfaceHolder;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.GlVideoRenderer;
import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.Voip;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.8KC  reason: invalid class name */
public class AnonymousClass8KC implements VideoPort {
    public static final float[] A0N = {0.0f, 0.0f, 0.0f, 1.0f};
    public static final float[] A0O = {0.0f, 0.0f, 0.0f, 0.0f};
    public static final float[] A0P = {0.19607843f, 0.19607843f, 0.19607843f, 1.0f};
    public int A00 = 0;
    public int A01;
    public int A02 = 0;
    public C187958y5 A03;
    public AnonymousClass7X0 A04;
    public C179818jl A05 = null;
    public WeakReference A06;
    public C158677kN A07;
    public boolean A08;
    public boolean A09;
    public final Handler A0A;
    public final HandlerThread A0B;
    public final AnonymousClass747 A0C;
    public final C116655qe A0D;
    public final AnonymousClass1VX A0E;
    public final UserJid A0F;
    public final GlVideoRenderer A0G;
    public final Set A0H = AnonymousClass002.A0K();
    public final AtomicBoolean A0I = new AtomicBoolean(false);
    public final boolean A0J;
    public final boolean A0K;
    public volatile boolean A0L;
    public volatile boolean A0M;

    public final int A05(float[] fArr) {
        C626936e.A0D(AnonymousClass000.A1U(fArr.length, 4), "Color array must be RGBA");
        C626936e.A03(this.A0B);
        GLES20.glClearColor(fArr[0], fArr[1], fArr[2], fArr[3]);
        GLES20.glClear(16384);
        return A02();
    }

    public Point getWindowSize() {
        return new Point(0, 0);
    }

    public int resetBlackScreen() {
        return A04(new AnonymousClass91H(this, 7));
    }

    public static boolean A00(AnonymousClass8KC r1) {
        return r1.A0E.A0X(2831);
    }

    public final int A01() {
        C626936e.A03(this.A0B);
        try {
            int[] iArr = C158677kN.A00;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("EglBase14/ SDK version: ");
            A0o.append(C177508fz.A04);
            A0o.append(". isEGL14Supported: ");
            C18260x0.A1U(A0o, true);
            this.A07 = new C177508fz((C1440970a) null, iArr);
            return 0;
        } catch (Exception e) {
            Log.e((Throwable) e);
            A07();
            return -5;
        }
    }

    public final int A02() {
        C626936e.A03(this.A0B);
        C177508fz r2 = (C177508fz) this.A07;
        r2.A05();
        EGLSurface eGLSurface = r2.A03;
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            throw AnonymousClass002.A0E("No EGLSurface - can't swap buffers");
        } else if (EGL14.eglSwapBuffers(r2.A02, eGLSurface)) {
            return 0;
        } else {
            return -3;
        }
    }

    public final int A03(Message message, String str) {
        if (this.A0A.sendMessage(message)) {
            return 0;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("voip/CoreVideoPort/");
        A0o.append(str);
        A0o.append(" failed: ");
        A0o.append(-100);
        A0o.append(" for ");
        C18260x0.A0n(this.A0F, A0o);
        return -100;
    }

    public final int A04(Callable callable) {
        return AnonymousClass001.A0K(AnonymousClass25H.A00(this.A0A, -100, callable));
    }

    public final void A06() {
        if (!this.A0M) {
            this.A0M = true;
            Set<C182078np> set = this.A0H;
            synchronized (set) {
                for (C182078np BZq : set) {
                    BZq.BZq();
                }
            }
        }
    }

    public final void A07() {
        C626936e.A03(this.A0B);
        this.A0G.release();
        this.A0I.set(false);
        try {
            this.A07.A01();
            this.A07.A04();
            this.A07.A03();
        } catch (Exception e) {
            Log.e((Throwable) e);
        }
    }

    public final void A08() {
        C626936e.A03(this.A0B);
        C158677kN r2 = this.A07;
        if (((C177508fz) r2).A03 != EGL14.EGL_NO_SURFACE) {
            r2.A01();
            this.A07.A04();
        }
    }

    public void A09(C182078np r3) {
        Set set = this.A0H;
        synchronized (set) {
            set.add(r3);
        }
        if (this.A0M) {
            r3.BZq();
        }
    }

    public void A0A(C182078np r3) {
        Set set = this.A0H;
        synchronized (set) {
            set.remove(r3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (X.AnonymousClass75J.A00(r0.get(), r6) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r5.A0L
            if (r0 != 0) goto L_0x0038
            java.lang.ref.WeakReference r0 = r5.A06
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r0.get()
            boolean r0 = X.AnonymousClass75J.A00(r0, r6)
            r1 = 1
            if (r0 == 0) goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            X.8jl r0 = r5.A05
            if (r0 != 0) goto L_0x0043
            X.8OZ r0 = new X.8OZ
            r0.<init>(r5, r6, r1)
            int r2 = r5.A04(r0)
        L_0x0023:
            r5.A0M = r3
            if (r2 != 0) goto L_0x0045
            boolean r0 = r5.A09
            if (r0 != 0) goto L_0x0039
            r5.A09 = r4
            X.5qe r0 = r5.A0D
            r0.A03(r5)
        L_0x0032:
            java.lang.ref.WeakReference r0 = X.AnonymousClass0x9.A14(r6)
            r5.A06 = r0
        L_0x0038:
            return
        L_0x0039:
            boolean r0 = r5.A0K
            if (r0 == 0) goto L_0x0032
            com.whatsapp.jid.UserJid r0 = r5.A0F
            com.whatsapp.voipcalling.Voip.startVideoRenderStream(r0)
            goto L_0x0032
        L_0x0043:
            r2 = 0
            goto L_0x0023
        L_0x0045:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/CoreVideoPort/onSurfaceAvailable failed to create surface ("
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ") for "
            r1.append(r0)
            com.whatsapp.jid.UserJid r0 = r5.A0F
            r1.append(r0)
            X.AnonymousClass0x2.A19(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8KC.A0B(java.lang.Object):void");
    }

    public void A0C(Object obj) {
        WeakReference weakReference;
        if (!this.A0L && (weakReference = this.A06) != null && AnonymousClass75J.A00(weakReference.get(), obj)) {
            this.A02 = 0;
            this.A00 = 0;
            if (this.A05 == null) {
                if (AnonymousClass001.A1Z(AnonymousClass25H.A00(this.A0A, Boolean.FALSE, new AnonymousClass91H(this, 6)))) {
                    A04(new AnonymousClass91H(this, 9));
                }
            }
            if (this.A06 != null) {
                this.A06 = null;
            }
            if (this.A0K) {
                Voip.stopVideoRenderStream(this.A0F);
            }
        }
    }

    public void A0D(Object obj, int i, int i2) {
        String str;
        if (!this.A0L) {
            WeakReference weakReference = this.A06;
            if (weakReference == null || !AnonymousClass75J.A00(weakReference.get(), obj)) {
                str = "voip/CoreVideoPort/onSurfaceSizeChanged invalid surface";
            } else {
                this.A02 = i;
                this.A00 = i2;
                if (A00(this)) {
                    Handler handler = this.A0A;
                    handler.removeMessages(1);
                    A03(handler.obtainMessage(1, i, i2), "setWindowSize");
                    return;
                }
                if (this.A05 == null) {
                    int A0K2 = AnonymousClass001.A0K(AnonymousClass25H.A00(this.A0A, -100, new C173028Oa(this, i, i2)));
                    if (A0K2 != 0) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("voip/CoreVideoPort/setWindowSize failed: ");
                        A0o.append(A0K2);
                        A0o.append(" for ");
                        str = AnonymousClass000.A0R(this.A0F, A0o);
                    }
                }
                C116655qe r0 = this.A0D;
                C626936e.A01();
                UserJid userJid = this.A0F;
                if (r0.A03.A0a(userJid)) {
                    Voip.setVideoPreviewSize(i, i2);
                    return;
                } else {
                    Voip.setVideoDisplayPort(userJid, this);
                    return;
                }
            }
            Log.i(str);
        }
    }

    public final boolean A0E() {
        C626936e.A03(this.A0B);
        if (((C177508fz) this.A07).A03 == EGL14.EGL_NO_SURFACE || !this.A0I.get()) {
            return false;
        }
        return true;
    }

    public AnonymousClass7X0 createSurfaceTexture() {
        if (this.A0L) {
            Log.w("voip/CoreVideoPort/createSurfaceTexture called after release");
            return null;
        }
        return (AnonymousClass7X0) AnonymousClass25H.A00(this.A0A, (Object) null, new AnonymousClass91H(this, 8));
    }

    public Context getContext() {
        return null;
    }

    @Deprecated
    public SurfaceHolder getSurfaceHolder() {
        return null;
    }

    public void releaseSurfaceTexture(AnonymousClass7X0 r3) {
        if (this.A0L) {
            return;
        }
        if (A00(this)) {
            Handler handler = this.A0A;
            handler.removeMessages(7);
            A03(handler.obtainMessage(7, r3), "releaseSurfaceTexture");
            return;
        }
        A04(new AnonymousClass91I(this, 3, r3));
    }

    public int renderNativeFrame(long j, int i, int i2, int i3, int i4, int i5) {
        int A042 = A04(new C173098Oh(this, i, i2, i3, i4, i5, j));
        if (A042 == 0) {
            A06();
        }
        return A042;
    }

    public void setListener(C179828jm r1) {
    }

    public void setPassthroughVideoPortCallback(C179818jl r3) {
        Handler handler = this.A0A;
        handler.removeMessages(10);
        A03(handler.obtainMessage(10, r3), "attach new surface manager");
    }

    public int setScaleType(int i) {
        if (this.A0J) {
            Log.d("voip/CoreVideoPort/setScaleType ignored, cropping disabled");
            return 0;
        } else if (!A00(this)) {
            int A042 = A04(new AnonymousClass91J(this, i, 1));
            if (A042 == 0) {
                return A042;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("voip/CoreVideoPort/setScaleType failed: ");
            A0o.append(A042);
            A0o.append(" for ");
            C18260x0.A0o(this.A0F, A0o);
            return A042;
        } else if (!this.A0I.get()) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("voip/CoreVideoPort/setScaleType failed: -6 for ");
            C18260x0.A0n(this.A0F, A0o2);
            return -6;
        } else {
            Handler handler = this.A0A;
            handler.removeMessages(2);
            return A03(handler.obtainMessage(2, Integer.valueOf(i)), "setScaleType");
        }
    }

    public AnonymousClass8KC(AnonymousClass747 r4, C116655qe r5, AnonymousClass1VX r6, UserJid userJid, C187958y5 r8, GlVideoRenderer glVideoRenderer, boolean z) {
        this.A0F = userJid;
        this.A0E = r6;
        this.A0G = glVideoRenderer;
        this.A0C = r4;
        this.A0D = r5;
        this.A03 = r8;
        this.A0K = z;
        this.A0J = r6.A0X(4158);
        StringBuilder A0o = AnonymousClass001.A0o();
        C18280x3.A1G(A0o, "VideoPort_", this);
        HandlerThread handlerThread = new HandlerThread(A0o.toString());
        this.A0B = handlerThread;
        C124756Dt r2 = new C124756Dt(AnonymousClass6C9.A0S(handlerThread), this);
        this.A0A = r2;
        if (A00(this)) {
            Handler handler = this.A0A;
            handler.removeMessages(4);
            A03(handler.obtainMessage(4), "initEgl");
            return;
        }
        int A0K2 = AnonymousClass001.A0K(AnonymousClass25H.A00(r2, -100, new AnonymousClass91H(this, 11)));
        if (A0K2 != 0) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("voip/CoreVideoPort/create failed to init EGL (");
            A0o2.append(A0K2);
            C18260x0.A1Q(A0o2, ") for ", userJid);
        }
    }

    public void release() {
        C626936e.A01();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("voip/CoreVideoPort/ release for ");
        UserJid userJid = this.A0F;
        C18260x0.A0m(userJid, A0o);
        this.A0L = true;
        Set set = this.A0H;
        synchronized (set) {
            set.clear();
        }
        if (this.A09) {
            this.A09 = false;
            this.A0D.A05(userJid);
        }
        Handler handler = this.A0A;
        handler.removeCallbacksAndMessages((Object) null);
        if (A00(this)) {
            AnonymousClass7X0 r1 = this.A04;
            handler.removeMessages(7);
            A03(handler.obtainMessage(7, r1), "releaseSurfaceTexture");
        } else {
            A04(new AnonymousClass91H(this, 4));
        }
        A04(new AnonymousClass91H(this, 5));
        this.A0B.quit();
    }

    public void renderTexture(AnonymousClass7X0 r3, int i, int i2) {
        if (A00(this)) {
            Handler handler = this.A0A;
            handler.removeMessages(6);
            A03(handler.obtainMessage(6, i, i2, r3), "renderTexture");
        } else if (A04(new C173058Od(this, r3, i, i2)) == 0) {
            A06();
        }
    }

    public void setCornerRadius(float f) {
        if (A00(this)) {
            Handler handler = this.A0A;
            handler.removeMessages(3);
            A03(handler.obtainMessage(3, Float.valueOf(f)), "setCornerRadius");
            return;
        }
        int A042 = A04(new AnonymousClass8OV(this, f));
        if (A042 != 0) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("voip/CoreVideoPort/setCornerRadius failed: ");
            A0o.append(A042);
            A0o.append(" for ");
            A0o.append(this.A0F);
            C18260x0.A1L(A0o, ". Retrying on valid surface");
        }
    }
}
