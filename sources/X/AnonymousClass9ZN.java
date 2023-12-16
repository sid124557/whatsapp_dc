package X;

import android.opengl.GLES20;

/* renamed from: X.9ZN  reason: invalid class name */
public final class AnonymousClass9ZN implements C180448l5 {
    public C185278tN B0f(C151837Wm r9, C185558ts r10, int i, int i2, boolean z) {
        boolean z2 = false;
        if ((((AnonymousClass9ZC) r10).A02.A00 & 32) != 0) {
            z2 = true;
        }
        AnonymousClass9ZB r5 = new AnonymousClass9ZB(i, i2, z2);
        if (z || z2) {
            C193679Po r7 = r5.A00;
            GLES20.glBindFramebuffer(36160, r7.A00);
            int[] iArr = new int[1];
            r7.A05 = iArr;
            GLES20.glGenRenderbuffers(1, iArr, 0);
            GLES20.glBindRenderbuffer(36161, r7.A05[0]);
            GLES20.glRenderbufferStorage(36161, 33189, r7.A02, r7.A01);
            GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, r7.A05[0]);
            int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
            if (glCheckFramebufferStatus == 36053) {
                GLES20.glBindRenderbuffer(36161, 0);
                GLES20.glBindFramebuffer(36160, 0);
            } else {
                throw C1899593h.A0Y("Depth buffer attachment to FrameBufferTexture failed with ", AnonymousClass001.A0o(), glCheckFramebufferStatus);
            }
        }
        return r5;
    }
}
