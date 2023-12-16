package X;

import android.opengl.GLES20;
import java.nio.FloatBuffer;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.7nf  reason: invalid class name and case insensitive filesystem */
public class C160457nf {
    public int A00 = GLES20.glCreateProgram();
    public String A01;
    public String A02;
    public final C151997Xd A03;
    public final Map A04 = AnonymousClass001.A0t();
    public final Map A05 = AnonymousClass001.A0t();
    public final Map A06 = AnonymousClass001.A0t();

    public static /* synthetic */ void A01(AnonymousClass7J7 r13, C160457nf r14) {
        int glGetAttribLocation;
        Map map = r13.A02;
        List list = r13.A01;
        for (int i = 0; i < list.size(); i++) {
            String A0n = AnonymousClass001.A0n(list, i);
            Map map2 = r14.A06;
            if (map2.containsKey(A0n)) {
                glGetAttribLocation = AnonymousClass001.A0K(map2.get(A0n));
            } else {
                glGetAttribLocation = GLES20.glGetAttribLocation(r14.A00, A0n);
                if (glGetAttribLocation != -1) {
                    C18280x3.A1D(A0n, map2, glGetAttribLocation);
                } else {
                    Object[] A0L = AnonymousClass002.A0L();
                    A0L[0] = A0n;
                    throw AnonymousClass001.A0e(String.format((Locale) null, "Vertex attribute location not found: %s", A0L));
                }
            }
            if (glGetAttribLocation != -1) {
                AnonymousClass7FV r3 = (AnonymousClass7FV) map.get(A0n);
                FloatBuffer floatBuffer = r3.A01;
                int position = floatBuffer.position();
                GLES20.glBindBuffer(34962, 0);
                GLES20.glVertexAttribPointer(glGetAttribLocation, r3.A00, 5126, false, 0, floatBuffer.position(position));
                GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                floatBuffer.position(position);
            }
        }
        GLES20.glDrawArrays(r13.A00, 0, 4);
    }

    public C151997Xd A02() {
        int i = this.A00;
        if (i != 0) {
            GLES20.glUseProgram(i);
            Object[] A1X = AnonymousClass0x9.A1X();
            AnonymousClass000.A1L(A1X, this.A00);
            A1X[1] = this.A02;
            A1X[2] = this.A01;
            C159217lP.A02("gl.Program::use, programHandle=%d, vertexShaderSource=%s , fragmentShaderSource=%s", A1X);
            return this.A03;
        }
        throw AnonymousClass001.A0e("Program not initialized");
    }

    public void A03() {
        if (this.A00 != 0) {
            int[] A0E = C18330xA.A0E();
            GLES20.glGetIntegerv(35725, A0E, 0);
            if (this.A00 == A0E[0]) {
                GLES20.glUseProgram(0);
            }
            GLES20.glDeleteProgram(this.A00);
            this.A00 = 0;
        }
    }

    public C160457nf(String str, String str2) {
        this.A02 = str;
        this.A01 = str2;
        int glCreateShader = GLES20.glCreateShader(35633);
        int glCreateShader2 = GLES20.glCreateShader(35632);
        GLES20.glAttachShader(this.A00, glCreateShader);
        GLES20.glAttachShader(this.A00, glCreateShader2);
        A00(glCreateShader, str);
        A00(glCreateShader2, str2);
        GLES20.glLinkProgram(this.A00);
        int[] A0E = C18330xA.A0E();
        GLES20.glGetProgramiv(this.A00, 35714, A0E, 0);
        if (A0E[0] != 0) {
            if (glCreateShader != 0) {
                GLES20.glDetachShader(this.A00, glCreateShader);
                GLES20.glDeleteShader(glCreateShader);
            }
            if (glCreateShader2 != 0) {
                GLES20.glDetachShader(this.A00, glCreateShader2);
                GLES20.glDeleteShader(glCreateShader2);
            }
            this.A03 = new C151997Xd(this);
            return;
        }
        String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(this.A00);
        A03();
        throw AnonymousClass002.A0E(AnonymousClass000.A0V("Failed to link program: ", glGetProgramInfoLog, AnonymousClass001.A0o()));
    }

    public static final void A00(int i, String str) {
        GLES20.glShaderSource(i, str);
        GLES20.glCompileShader(i);
        int[] A0E = C18330xA.A0E();
        GLES20.glGetShaderiv(i, 35713, A0E, 0);
        if (A0E[0] == 0) {
            String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(i);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Failed to compile shader:\n");
            A0o.append(glGetShaderInfoLog);
            throw AnonymousClass002.A0E(AnonymousClass000.A0V("\n\n", str, A0o));
        }
    }
}
