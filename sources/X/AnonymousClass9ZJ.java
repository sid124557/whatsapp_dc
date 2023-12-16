package X;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.os.Looper;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.9ZJ  reason: invalid class name */
public class AnonymousClass9ZJ implements C185568tt {
    public static final Map A0G = Collections.synchronizedMap(AnonymousClass001.A0t());
    public Handler A00;
    public final int A01;
    public final Context A02;
    public final AnonymousClass9MN A03;
    public final C159067l3 A04;
    public final C159067l3 A05;
    public final C194729Ug A06;
    public final C183768qc A07;
    public final AnonymousClass9LG A08;
    public final C194439Sw A09 = new C194439Sw();
    public final Object A0A = AnonymousClass002.A0D();
    public final boolean A0B;
    public final boolean A0C;
    public volatile Looper A0D;
    public volatile C185558ts A0E;
    public volatile boolean A0F;

    public final void A00() {
        C185558ts r7 = this.A0E;
        if (r7 != null) {
            try {
                List list = this.A09.A00;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((C185288tO) list.get(i)).B1c();
                }
                AnonymousClass9ZC r72 = (AnonymousClass9ZC) r7;
                if (!r72.A01) {
                    r72.A01 = true;
                    AnonymousClass9ZL r6 = r72.A07;
                    C183758qb r0 = r6.A02;
                    if (r0 != null) {
                        r0.B1c();
                    }
                    HashMap hashMap = r6.A04;
                    Iterator A0u = AnonymousClass001.A0u(hashMap);
                    while (A0u.hasNext()) {
                        Map.Entry A0w = AnonymousClass001.A0w(A0u);
                        ((C185288tO) A0w.getValue()).B1c();
                        ((C185288tO) A0w.getValue()).release();
                    }
                    hashMap.clear();
                    r6.A00 = null;
                    C159067l3 r62 = r72.A02;
                    synchronized (r62.A07) {
                        EGLDisplay eGLDisplay = r62.A04;
                        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                        }
                    }
                    C151087Tj r2 = r72.A03;
                    EGLSurface eGLSurface2 = r2.A00;
                    if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                        EGL14.eglDestroySurface(r2.A01.A04, eGLSurface2);
                    }
                    r2.A00 = EGL14.EGL_NO_SURFACE;
                    r62.A02();
                    C159067l3 r02 = r72.A00;
                    if (r02 != null) {
                        r02.A02();
                    }
                }
            } catch (Throwable th) {
                try {
                    BLj(new C201649kV("GlHostImpl.detachGlContext() failed.", th));
                } catch (Throwable th2) {
                    this.A0E = null;
                    this.A0F = false;
                    A0G.remove(this.A00.getLooper());
                    throw th2;
                }
            }
            this.A0E = null;
            this.A0F = false;
            A0G.remove(this.A00.getLooper());
        }
    }

    public boolean A01() {
        boolean z;
        synchronized (this.A0A) {
            C185558ts r0 = this.A0E;
            Looper looper = this.A0D;
            if (r0 == null || (this.A0F && looper != Looper.myLooper())) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    public void AxO(C185288tO r5) {
        Object obj = this.A0A;
        C194439Sw r2 = this.A09;
        if (r5 != null) {
            synchronized (obj) {
                try {
                    if (!r2.A00.contains(r5)) {
                        r5.BFr(this);
                        C185558ts r1 = this.A0E;
                        if (r1 != null && A01()) {
                            r5.AxN(r1);
                        }
                        r2.A01(r5);
                    }
                } catch (Throwable th) {
                    BLj(new C201649kV("GlHostImpl.attach() failed.", th));
                }
            }
        }
    }

    public void B1d(C185288tO r5) {
        Object obj = this.A0A;
        C194439Sw r0 = this.A09;
        if (r5 != null) {
            synchronized (obj) {
                try {
                    if (r0.A02(r5) && this.A0E != null) {
                        r5.B1c();
                    }
                } catch (Throwable th) {
                    BLj(new C201649kV("GlHostImpl.detach() failed.", th));
                }
            }
        }
    }

    public C185558ts B6O() {
        C185558ts r0;
        synchronized (this.A0A) {
            AnonymousClass9ZJ r02 = (AnonymousClass9ZJ) A0G.get(Looper.myLooper());
            if (r02 != null) {
                r0 = r02.A0E;
            } else {
                r0 = null;
            }
            r0.getClass();
        }
        return r0;
    }

    public void BLj(C201649kV r4) {
        C1903895p r2 = this.A03.A00;
        AnonymousClass96d r1 = new AnonymousClass96d(r4);
        if (r2.A0A != null) {
            Log.e("CameraProcessor/mediaGraphErrorCallback");
        }
        r2.A00(r1);
    }

    public AnonymousClass9ZJ(Context context, Looper looper, AnonymousClass9MN r7, C159067l3 r8, C194729Ug r9, AnonymousClass9LG r10) {
        this.A02 = context;
        this.A06 = r9;
        AnonymousClass9LF r0 = C194729Ug.A06;
        Object A0a = C18290x4.A0a();
        Map map = r9.A00;
        Object obj = map.get(r0);
        int A0K = AnonymousClass001.A0K(obj != null ? obj : A0a);
        this.A01 = A0K;
        AnonymousClass9LF r02 = C194729Ug.A02;
        Object obj2 = C194849Us.A05;
        Object obj3 = map.get(r02);
        this.A04 = C161027oq.A01(obj3 != null ? obj3 : obj2, A0K);
        this.A05 = r8;
        this.A03 = r7;
        this.A00 = new Handler(looper);
        this.A0D = looper;
        AnonymousClass9LF r03 = C194729Ug.A01;
        Object obj4 = Boolean.FALSE;
        Object obj5 = map.get(r03);
        this.A0B = AnonymousClass001.A1Z(obj5 != null ? obj5 : obj4);
        AnonymousClass9LF r04 = C194729Ug.A08;
        Object obj6 = Boolean.TRUE;
        Object obj7 = map.get(r04);
        this.A0C = AnonymousClass001.A1Z(obj7 != null ? obj7 : obj6);
        this.A07 = new AnonymousClass9ZK((Looper) map.get(C194729Ug.A09));
        this.A08 = r10;
    }

    public C183768qc BC4() {
        return this.A07;
    }
}
