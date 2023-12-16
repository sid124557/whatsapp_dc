package X;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: X.0X6  reason: invalid class name */
public class AnonymousClass0X6 {
    public static final float[] A00;

    public static FloatBuffer A01(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    static {
        float[] fArr = new float[16];
        A00 = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public static void A02(int i, String str) {
        if (i < 0) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Unable to locate '");
            A0o.append(str);
            throw AnonymousClass002.A0E(AnonymousClass000.A0X("' in program", A0o));
        }
    }

    public static int A00(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        A03(AnonymousClass000.A0Y("glCreateShader type=", AnonymousClass001.A0o(), i));
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Could not compile shader ");
        A0o.append(i);
        Log.e("Grafika", AnonymousClass000.A0X(":", A0o));
        StringBuilder A0o2 = AnonymousClass001.A0o();
        AnonymousClass001.A1L(A0o2);
        AnonymousClass000.A1D(GLES20.glGetShaderInfoLog(glCreateShader), "Grafika", A0o2);
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public static void A03(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder A0l = AnonymousClass000.A0l(str);
            AnonymousClass000.A1G(": glError 0x", A0l, glGetError);
            String obj = A0l.toString();
            Log.e("Grafika", obj);
            throw AnonymousClass002.A0E(obj);
        }
    }
}
