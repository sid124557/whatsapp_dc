package X;

import android.opengl.GLES20;
import java.nio.FloatBuffer;

/* renamed from: X.7j9  reason: invalid class name and case insensitive filesystem */
public class C157927j9 {
    public int A00;

    public void A02(String str, FloatBuffer floatBuffer) {
        int i = this.A00;
        if (i == -1) {
            throw AnonymousClass002.A0E("The program has been released");
        } else if (i != -1) {
            int glGetAttribLocation = GLES20.glGetAttribLocation(i, str);
            if (glGetAttribLocation >= 0) {
                GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 0, floatBuffer);
                C1454575y.A00("setVertexAttribArray");
                return;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Could not locate '");
            A0o.append(str);
            A0o.append("' in program");
            throw AnonymousClass6C7.A0e(A0o);
        } else {
            throw AnonymousClass002.A0E("The program has been released");
        }
    }

    public C157927j9() {
        int A002 = A00(35633, "varying vec2 interp_tc;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\n\nuniform mat4 texMatrix;\n\nvoid main() {\n    gl_Position = in_pos;\n    interp_tc = (texMatrix * in_tc).xy;\n}\n");
        int A003 = A00(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES oes_tex;\n\nvoid main() {\n  gl_FragColor = texture2D(oes_tex, interp_tc);\n}\n");
        int glCreateProgram = GLES20.glCreateProgram();
        this.A00 = glCreateProgram;
        if (glCreateProgram != 0) {
            GLES20.glAttachShader(glCreateProgram, A002);
            GLES20.glAttachShader(this.A00, A003);
            GLES20.glLinkProgram(this.A00);
            int[] iArr = {0};
            GLES20.glGetProgramiv(this.A00, 35714, iArr, 0);
            if (iArr[0] == 1) {
                GLES20.glDeleteShader(A002);
                GLES20.glDeleteShader(A003);
                C1454575y.A00("Creating GlShader");
                return;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("GlShader Could not link program: ");
            C18260x0.A1K(A0o, GLES20.glGetProgramInfoLog(this.A00));
            throw AnonymousClass002.A0E(GLES20.glGetProgramInfoLog(this.A00));
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("glCreateProgram() failed. GLES20 error: ");
        A0o2.append(GLES20.glGetError());
        throw AnonymousClass6C7.A0e(A0o2);
    }

    public int A01(String str) {
        int i = this.A00;
        if (i != -1) {
            int glGetUniformLocation = GLES20.glGetUniformLocation(i, str);
            if (glGetUniformLocation >= 0) {
                return glGetUniformLocation;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Could not locate uniform '");
            A0o.append(str);
            A0o.append("' in program");
            throw AnonymousClass6C7.A0e(A0o);
        }
        throw AnonymousClass002.A0E("The program has been released");
    }

    public static int A00(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = {0};
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 1) {
                C1454575y.A00("compileShader");
                return glCreateShader;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("GlShader Could not compile shader ");
            A0o.append(i);
            A0o.append(":");
            C18260x0.A1K(A0o, GLES20.glGetShaderInfoLog(glCreateShader));
            throw AnonymousClass002.A0E(GLES20.glGetShaderInfoLog(glCreateShader));
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("glCreateShader() failed. GLES20 error: ");
        A0o2.append(GLES20.glGetError());
        throw AnonymousClass6C7.A0e(A0o2);
    }
}
