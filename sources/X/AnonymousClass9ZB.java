package X;

import android.opengl.GLES20;

/* renamed from: X.9ZB  reason: invalid class name */
public final class AnonymousClass9ZB implements C185278tN {
    public final C193679Po A00;
    public final C151837Wm A01;
    public final boolean A02;

    public void Axo() {
        GLES20.glBindFramebuffer(36160, this.A00.A00);
    }

    public void release() {
        C193679Po r6 = this.A00;
        C151837Wm r5 = r6.A03;
        r6.A03 = null;
        if (r5 != null) {
            GLES20.glDeleteFramebuffers(1, new int[]{r6.A00}, 0);
            int[] iArr = r6.A05;
            r6.A05 = null;
            if (iArr != null) {
                GLES20.glDeleteRenderbuffers(1, iArr, 0);
            }
            r5.A00();
        }
    }

    public AnonymousClass9ZB(int i, int i2, boolean z) {
        C193679Po r1 = new C193679Po(i, i2, z);
        this.A00 = r1;
        this.A02 = r1.A04;
        C151837Wm r0 = r1.A03;
        C162457s7.A0C(r0);
        this.A01 = r0;
    }

    public C151837Wm BDb() {
        return this.A01;
    }

    public boolean BGy() {
        return this.A02;
    }
}
