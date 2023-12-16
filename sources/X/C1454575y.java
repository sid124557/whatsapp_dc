package X;

import android.opengl.GLES20;

/* renamed from: X.75y  reason: invalid class name and case insensitive filesystem */
public class C1454575y {
    public static void A00(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            throw AnonymousClass002.A0E(AnonymousClass000.A0Y(": GLES20 error: ", AnonymousClass000.A0l(str), glGetError));
        }
    }
}
