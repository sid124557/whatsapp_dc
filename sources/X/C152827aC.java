package X;

import android.content.res.Resources;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.CharBuffer;

/* renamed from: X.7aC  reason: invalid class name and case insensitive filesystem */
public class C152827aC {
    public final Resources A00;

    public C160457nf A02(String str, String str2, boolean z) {
        String obj;
        if (!z) {
            String[] split = str2.split("\n");
            String str3 = split[0];
            if (str3.equals("#extension GL_OES_EGL_image_external : require")) {
                obj = AnonymousClass6C9.A0c(str3.length(), str2);
            } else if (!str3.equals("#version 300 es")) {
                throw AnonymousClass001.A0e("Fragment shader's first line must be:\n#extension GL_OES_EGL_image_external : require");
            } else if (split[2].equals("#extension GL_OES_EGL_image_external : require")) {
                StringBuilder A0A = C18330xA.A0A("");
                for (int i = 0; i < split.length; i++) {
                    if (i != 2) {
                        A0A.append(split[i]);
                        A0A.append(10);
                    }
                }
                obj = A0A.toString();
            } else {
                throw AnonymousClass001.A0e("Fragment shader's fourth line must be:\n#extension GL_OES_EGL_image_external : require");
            }
            str2 = obj.replaceFirst("samplerExternalOES", "sampler2D").replaceFirst("__samplerExternal2DY2YEXT", "sampler2D");
        }
        return new C160457nf(str, str2);
    }

    public final String A03(int i) {
        InputStreamReader inputStreamReader = new InputStreamReader(this.A00.openRawResource(i));
        try {
            StringBuilder A0o = AnonymousClass001.A0o();
            CharBuffer allocate = CharBuffer.allocate(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
            while (inputStreamReader.read(allocate) != -1) {
                allocate.flip();
                A0o.append(allocate);
                allocate.clear();
            }
            String obj = A0o.toString();
            try {
                inputStreamReader.close();
            } catch (IOException unused) {
            }
            return obj;
        } catch (IOException e) {
            throw C18330xA.A09(e);
        } catch (Throwable th) {
            try {
                inputStreamReader.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    public C152827aC(Resources resources) {
        this.A00 = resources;
    }

    public static C160457nf A00(C152827aC r1, int i, int i2) {
        return new C160457nf(r1.A03(i), r1.A03(i2));
    }

    public C160457nf A01(int i, int i2, boolean z) {
        return A02(A03(i), A03(i2), z);
    }
}
