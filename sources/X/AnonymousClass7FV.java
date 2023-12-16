package X;

import java.nio.FloatBuffer;

/* renamed from: X.7FV  reason: invalid class name */
public class AnonymousClass7FV {
    public final int A00;
    public final FloatBuffer A01;

    public AnonymousClass7FV(float[] fArr) {
        int length = fArr.length;
        if (length % 2 == 0) {
            FloatBuffer asFloatBuffer = AnonymousClass6C7.A0s(length * 4).asFloatBuffer();
            asFloatBuffer.put(fArr);
            this.A01 = (FloatBuffer) asFloatBuffer.position(0);
            this.A00 = 2;
            return;
        }
        throw AnonymousClass6CA.A0N();
    }
}
