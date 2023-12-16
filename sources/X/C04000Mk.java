package X;

import android.opengl.GLES20;
import android.util.Log;

/* renamed from: X.0Mk  reason: invalid class name and case insensitive filesystem */
public class C04000Mk {
    public int A00;
    public int A01 = 36197;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public float[] A09 = new float[9];
    public float[] A0A;

    public C04000Mk(C02210Fh r8) {
        int A002;
        int A003 = AnonymousClass0X6.A00(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n");
        int i = 0;
        if (!(A003 == 0 || (A002 = AnonymousClass0X6.A00(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n")) == 0)) {
            int glCreateProgram = GLES20.glCreateProgram();
            AnonymousClass0X6.A03("glCreateProgram");
            if (glCreateProgram == 0) {
                Log.e("Grafika", "Could not create program");
            }
            GLES20.glAttachShader(glCreateProgram, A003);
            AnonymousClass0X6.A03("glAttachShader");
            GLES20.glAttachShader(glCreateProgram, A002);
            AnonymousClass0X6.A03("glAttachShader");
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                Log.e("Grafika", "Could not link program: ");
                Log.e("Grafika", GLES20.glGetProgramInfoLog(glCreateProgram));
                GLES20.glDeleteProgram(glCreateProgram);
            } else {
                i = glCreateProgram;
            }
        }
        this.A00 = i;
        if (i != 0) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Created program ");
            A0o.append(i);
            A0o.append(" (");
            A0o.append(r8);
            Log.d("Grafika", AnonymousClass000.A0e(A0o));
            int glGetAttribLocation = GLES20.glGetAttribLocation(this.A00, "aPosition");
            this.A02 = glGetAttribLocation;
            AnonymousClass0X6.A02(glGetAttribLocation, "aPosition");
            int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.A00, "aTextureCoord");
            this.A03 = glGetAttribLocation2;
            AnonymousClass0X6.A02(glGetAttribLocation2, "aTextureCoord");
            int glGetUniformLocation = GLES20.glGetUniformLocation(this.A00, "uMVPMatrix");
            this.A06 = glGetUniformLocation;
            AnonymousClass0X6.A02(glGetUniformLocation, "uMVPMatrix");
            int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.A00, "uTexMatrix");
            this.A07 = glGetUniformLocation2;
            AnonymousClass0X6.A02(glGetUniformLocation2, "uTexMatrix");
            int glGetUniformLocation3 = GLES20.glGetUniformLocation(this.A00, "uKernel");
            this.A05 = glGetUniformLocation3;
            if (glGetUniformLocation3 < 0) {
                this.A05 = -1;
                this.A08 = -1;
                this.A04 = -1;
                return;
            }
            int glGetUniformLocation4 = GLES20.glGetUniformLocation(this.A00, "uTexOffset");
            this.A08 = glGetUniformLocation4;
            AnonymousClass0X6.A02(glGetUniformLocation4, "uTexOffset");
            int glGetUniformLocation5 = GLES20.glGetUniformLocation(this.A00, "uColorAdjust");
            this.A04 = glGetUniformLocation5;
            AnonymousClass0X6.A02(glGetUniformLocation5, "uColorAdjust");
            System.arraycopy(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f}, 0, this.A09, 0, 9);
            float f = 1.0f / ((float) 256);
            float f2 = -f;
            this.A0A = new float[]{f2, f2, 0.0f, f2, f, f2, f2, 0.0f, 0.0f, 0.0f, f, 0.0f, f2, f, 0.0f, f, f, f};
            return;
        }
        throw AnonymousClass002.A0E("Unable to create program");
    }
}
