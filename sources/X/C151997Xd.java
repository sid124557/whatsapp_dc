package X;

import android.opengl.GLES20;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.7Xd  reason: invalid class name and case insensitive filesystem */
public class C151997Xd {
    public final /* synthetic */ C160457nf A00;

    public C151997Xd(C160457nf r1) {
        this.A00 = r1;
    }

    public final int A00(String str) {
        C160457nf r1 = this.A00;
        Map map = r1.A05;
        if (map.containsKey(str)) {
            return AnonymousClass001.A0K(map.get(str));
        }
        int glGetUniformLocation = GLES20.glGetUniformLocation(r1.A00, str);
        if (glGetUniformLocation != -1) {
            C18280x3.A1D(str, map, glGetUniformLocation);
            return glGetUniformLocation;
        }
        throw AnonymousClass001.A0e(String.format((Locale) null, "Uniform location not found: %s", AnonymousClass000.A1b(str)));
    }

    public void A01(C151837Wm r9, String str) {
        int size;
        Map map = this.A00.A04;
        if (map.containsKey(str)) {
            size = AnonymousClass001.A0K(map.get(str));
        } else {
            size = map.size();
            C18280x3.A1D(str, map, size);
        }
        int i = r9.A01;
        int i2 = r9.A00;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("gl.Program::setTexture::before: textureUnit: ");
        A0o.append(size);
        A0o.append(" textureTarget: ");
        A0o.append(i);
        C159217lP.A02(AnonymousClass000.A0Y(" textureHandle: ", A0o, i2), new Object[0]);
        int A002 = A00(str);
        GLES20.glActiveTexture(33984 + size);
        GLES20.glBindTexture(i, i2);
        GLES20.glUniform1i(A002, size);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        AnonymousClass6C7.A1J("gl.Program::setTexture::after: textureUnit: ", " textureTarget: ", A0o2, size, i);
        C159217lP.A02(AnonymousClass000.A0Y(" textureHandle: ", A0o2, i2), new Object[0]);
    }

    public void A02(String str, float[] fArr) {
        GLES20.glUniformMatrix4fv(A00(str), 1, false, fArr, 0);
    }
}
