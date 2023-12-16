package X;

import android.opengl.GLES20;
import java.nio.FloatBuffer;

/* renamed from: X.0NG  reason: invalid class name */
public class AnonymousClass0NG {
    public C04000Mk A00;
    public final C05470Tl A01 = new C05470Tl(C02200Fg.FULL_RECTANGLE);

    public void A00(int i, float[] fArr) {
        C04000Mk r5 = this.A00;
        float[] fArr2 = AnonymousClass0X6.A00;
        C05470Tl r0 = this.A01;
        FloatBuffer floatBuffer = r0.A06;
        int i2 = r0.A02;
        FloatBuffer floatBuffer2 = r0.A05;
        AnonymousClass0X6.A03("draw start");
        GLES20.glUseProgram(r5.A00);
        AnonymousClass0X6.A03("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniformMatrix4fv(r5.A06, 1, false, fArr2, 0);
        AnonymousClass0X6.A03("glUniformMatrix4fv");
        GLES20.glUniformMatrix4fv(r5.A07, 1, false, fArr, 0);
        AnonymousClass0X6.A03("glUniformMatrix4fv");
        int i3 = r5.A02;
        GLES20.glEnableVertexAttribArray(i3);
        AnonymousClass0X6.A03("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(i3, 2, 5126, false, 8, floatBuffer);
        AnonymousClass0X6.A03("glVertexAttribPointer");
        int i4 = r5.A03;
        GLES20.glEnableVertexAttribArray(i4);
        AnonymousClass0X6.A03("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(i4, 2, 5126, false, 8, floatBuffer2);
        AnonymousClass0X6.A03("glVertexAttribPointer");
        int i5 = r5.A05;
        if (i5 >= 0) {
            GLES20.glUniform1fv(i5, 9, r5.A09, 0);
            GLES20.glUniform2fv(r5.A08, 9, r5.A0A, 0);
            GLES20.glUniform1f(r5.A04, 0.0f);
        }
        GLES20.glDrawArrays(5, 0, i2);
        AnonymousClass0X6.A03("glDrawArrays");
        GLES20.glDisableVertexAttribArray(i3);
        GLES20.glDisableVertexAttribArray(i4);
        GLES20.glBindTexture(36197, 0);
        GLES20.glUseProgram(0);
    }

    public AnonymousClass0NG(C04000Mk r3) {
        this.A00 = r3;
    }
}
