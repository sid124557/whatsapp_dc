package X;

import android.opengl.EGL14;
import android.opengl.GLES20;
import java.util.Locale;

/* renamed from: X.7lP  reason: invalid class name and case insensitive filesystem */
public class C159217lP {
    public static String A00(String str, String str2, int i) {
        Object[] A1Z = AnonymousClass6C9.A1Z(str, 3);
        C18300x5.A1K(Integer.valueOf(i), str2, A1Z);
        return String.format((Locale) null, "%s: GL error 0x%04x %s occurred, see logcat output", A1Z);
    }

    public static void A01(String str) {
        boolean z = false;
        int i = 12288;
        while (true) {
            int eglGetError = EGL14.eglGetError();
            if (eglGetError == 12288) {
                break;
            }
            z = true;
            i = eglGetError;
        }
        if (z) {
            switch (i) {
                case 12289:
                    throw new AnonymousClass6LO(A00(str, "EGL_NOT_INITIALIZED", i));
                case 12290:
                    throw new AnonymousClass6LB(A00(str, "EGL_BAD_ACCESS", i));
                case 12291:
                    throw new AnonymousClass6LC(A00(str, "EGL_BAD_ALLOC", i));
                case 12292:
                    throw new AnonymousClass6LD(A00(str, "EGL_BAD_ATTRIBUTE", i));
                case 12293:
                    throw new AnonymousClass6LE(A00(str, "EGL_BAD_CONFIG", i));
                case 12294:
                    throw new AnonymousClass6LF(A00(str, "EGL_BAD_CONTEXT", i));
                case 12295:
                    throw new AnonymousClass6LG(A00(str, "EGL_BAD_CURRENT_SURFACE", i));
                case 12296:
                    throw new AnonymousClass6LH(A00(str, "EGL_BAD_DISPLAY", i));
                case 12297:
                    throw new AnonymousClass6LI(A00(str, "EGL_BAD_MATCH", i));
                case 12298:
                    throw new AnonymousClass6LJ(A00(str, "EGL_BAD_NATIVE_PIXMAP", i));
                case 12299:
                    throw new AnonymousClass6LK(A00(str, "EGL_BAD_NATIVE_WINDOW", i));
                case 12300:
                    throw new AnonymousClass6LL(A00(str, "EGL_BAD_PARAMETER", i));
                case 12301:
                    throw new AnonymousClass6LM(A00(str, "EGL_BAD_SURFACE", i));
                case 12302:
                    throw new AnonymousClass6LN(A00(str, "EGL_CONTEXT_LOST", i));
                default:
                    throw new AnonymousClass8RP(i, A00(str, "UNKNOWN", i));
            }
        }
    }

    public static void A02(String str, Object... objArr) {
        boolean z = false;
        int i = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            z = true;
            i = glGetError;
        }
        if (z) {
            String format = String.format(str, objArr);
            switch (i) {
                case 1280:
                    throw new AnonymousClass6LP(A00(format, "GL_INVALID_ENUM", i));
                case 1281:
                    throw new AnonymousClass6LS(A00(format, "GL_INVALID_VALUE", i));
                case 1282:
                    throw new AnonymousClass6LR(A00(format, "GL_INVALID_OPERATION", i));
                case 1285:
                    throw new AnonymousClass6LT(A00(format, "GL_OUT_OF_MEMORY", i));
                case 1286:
                    throw new AnonymousClass6LQ(A00(format, "GL_INVALID_FRAMEBUFFER_OPERATION", i));
                default:
                    throw new AnonymousClass8RP(i, A00(format, "UNKNOWN", i));
            }
        }
    }
}
