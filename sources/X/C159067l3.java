package X;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLException;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.7l3  reason: invalid class name and case insensitive filesystem */
public class C159067l3 {
    public int A00 = 0;
    public int A01;
    public EGLConfig A02;
    public EGLContext A03 = EGL14.EGL_NO_CONTEXT;
    public EGLDisplay A04 = EGL14.EGL_NO_DISPLAY;
    public AnonymousClass7FU A05;
    public final int A06;
    public final Object A07;
    public final Map A08 = AnonymousClass001.A0t();

    public static EGLConfig A00(EGLDisplay eGLDisplay, int[] iArr, int i) {
        EGLConfig eGLConfig;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0) && (eGLConfig = eGLConfigArr[0]) != null) {
            return eGLConfig;
        }
        C159217lP.A01("eglChooseConfig");
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("unable to find EGL config with flags = ");
        A0o.append(i);
        throw new GLException(-1, AnonymousClass000.A0X(", no GL Errors", A0o));
    }

    public final EGLConfig A01(int i) {
        int i2;
        Map map = this.A08;
        int i3 = i;
        Integer valueOf = Integer.valueOf(i3);
        if (map.containsKey(valueOf)) {
            return (EGLConfig) map.get(valueOf);
        }
        int i4 = 4;
        if ((i & 2) != 0) {
            i4 = 68;
        }
        int i5 = 0;
        if ((i & 4) != 0) {
            i5 = 16;
        }
        int i6 = i & 32;
        int i7 = 8;
        int i8 = 8;
        if (i6 != 0) {
            i7 = 2;
            i8 = 10;
        }
        if ((i & 8) != 0) {
            i7 = 0;
        }
        int[] iArr = {12324, i8, 12323, i8, 12322, i8, 12321, i7, 12325, i5, 12352, i4, 12344, 0, 12344, 0, 12344, 0, 12344, 0, 12344, 0, 12344};
        if ((i & 1) != 0) {
            iArr[20] = 12610;
            iArr[21] = 1;
        }
        int i9 = i & 16;
        if (i9 != 0) {
            iArr[16] = 12338;
            iArr[17] = 1;
            iArr[18] = 12337;
            iArr[19] = 4;
        }
        if ((i & 64) != 0) {
            iArr[14] = 12339;
            iArr[15] = 1;
        }
        if ((i3 & 128) != 0) {
            iArr[14] = 12339;
            iArr[15] = 4;
        }
        if (i6 == 0 || (i3 & ZipDecompressor.UNZIP_BUFFER_SIZE) == 0) {
            if ((i3 & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
                iArr[12] = 12327;
                i2 = -1;
            } else if ((i3 & 512) != 0) {
                iArr[12] = 12327;
                i2 = 12368;
            } else if ((i3 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                iArr[12] = 12327;
                i2 = 12369;
            } else if ((i3 & 256) != 0) {
                iArr[12] = 12327;
                iArr[13] = 12344;
            }
            iArr[13] = i2;
        }
        try {
            EGLConfig A002 = A00(this.A04, iArr, i3);
            if (!(i6 == 0 || (i3 & ZipDecompressor.UNZIP_BUFFER_SIZE) == 0)) {
                int[] iArr2 = new int[1];
                EGL14.eglGetConfigAttrib(this.A04, A002, 12327, iArr2, 0);
                iArr[12] = 12327;
                iArr[13] = iArr2[0];
                A002 = A00(this.A04, iArr, i3);
            }
            map.put(valueOf, A002);
            return A002;
        } catch (GLException e) {
            if (i9 != 0) {
                iArr[16] = 12344;
                iArr[17] = 0;
                iArr[18] = 12344;
                iArr[19] = 0;
                EGLConfig A003 = A00(this.A04, iArr, i3);
                map.put(valueOf, A003);
                return A003;
            }
            throw e;
        }
    }

    public void A02() {
        synchronized (this.A07) {
            EGLDisplay eGLDisplay = this.A04;
            EGLDisplay eGLDisplay2 = EGL14.EGL_NO_DISPLAY;
            if (eGLDisplay != eGLDisplay2) {
                if (eGLDisplay != eGLDisplay2) {
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                }
                EGL14.eglDestroyContext(this.A04, this.A03);
                EGL14.eglReleaseThread();
                EGL14.eglTerminate(this.A04);
            }
            this.A04 = EGL14.EGL_NO_DISPLAY;
            this.A03 = EGL14.EGL_NO_CONTEXT;
            this.A02 = null;
            this.A08.clear();
            this.A00 = 0;
            AnonymousClass7FU r2 = this.A05;
            if (r2 != null) {
                C156177gA r1 = C156177gA.A02;
                synchronized (r1) {
                    r1.A01.remove(r2);
                }
                AnonymousClass7FU r22 = this.A05;
                List list = r22.A00;
                list.remove(Integer.valueOf(hashCode()));
                if (list.isEmpty()) {
                    r22.A01.clear();
                }
                list.isEmpty();
            }
            this.A05 = null;
        }
    }

    public /* bridge */ /* synthetic */ void A03(int i) {
        EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
        synchronized (this.A07) {
            A04(eGLContext, i);
        }
    }

    public final void A04(EGLContext eGLContext, int i) {
        String format;
        this.A00 = i;
        this.A04 = EGL14.eglGetDisplay(0);
        C159217lP.A01("eglGetDisplay");
        EGLDisplay eGLDisplay = this.A04;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eGLDisplay, iArr, 0, iArr, 1)) {
                EGLConfig A012 = A01(i);
                this.A02 = A012;
                int i2 = this.A06;
                EGLContext eglCreateContext = EGL14.eglCreateContext(this.A04, A012, eGLContext, new int[]{12440, i2, 12344}, 0);
                this.A03 = eglCreateContext;
                if (i2 == 3 && (eglCreateContext == null || eglCreateContext == EGL14.EGL_NO_CONTEXT || EGL14.eglGetError() != 12288)) {
                    this.A03 = EGL14.eglCreateContext(this.A04, this.A02, eGLContext, new int[]{12440, 2, 12344}, 0);
                    format = "eglCreateContext Version 2 fallback";
                } else {
                    Object[] objArr = new Object[1];
                    AnonymousClass000.A1P(objArr, i2, 0);
                    format = String.format((Locale) null, "eglCreateContext Version %d", objArr);
                }
                C159217lP.A01(format);
                this.A03.getClass();
                C156177gA r2 = C156177gA.A02;
                AnonymousClass7FU r1 = this.A05;
                synchronized (r2) {
                    if (r1 != null) {
                        r2.A01.add(r1);
                    }
                }
                int[] iArr2 = new int[1];
                EGL14.eglQueryContext(this.A04, this.A03, 12440, iArr2, 0);
                this.A01 = iArr2[0];
                return;
            }
            C159217lP.A01("eglInitialize");
            throw new GLException(-1, "unable to initialize EGL14, no GL Errors");
        }
        throw AnonymousClass6CA.A0O();
    }

    public /* bridge */ /* synthetic */ void A05(C159067l3 r3, int i) {
        this.A05 = r3.A05;
        EGLContext eGLContext = r3.A03;
        synchronized (this.A07) {
            A04(eGLContext, i);
        }
        AnonymousClass7FU r0 = this.A05;
        if (r0 != null) {
            C86634Kw.A1V(r0.A00, hashCode());
        } else {
            this.A05 = new AnonymousClass7FU(this);
        }
    }

    public C159067l3(Object obj, int i) {
        this.A07 = obj;
        this.A05 = new AnonymousClass7FU(this);
        this.A06 = i;
    }
}
