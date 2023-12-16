package X;

/* renamed from: X.6OQ  reason: invalid class name */
public final class AnonymousClass6OQ extends AnonymousClass867 {
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0093 A[LOOP:4: B:27:0x0093->B:28:0x0095, LOOP_START, PHI: r4 
      PHI: (r4v1 int) = (r4v0 int), (r4v2 int) binds: [B:12:0x0034, B:28:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bi4(java.nio.ByteBuffer r10) {
        /*
            r9 = this;
            int r4 = r10.position()
            int r3 = r10.limit()
            int r2 = r3 - r4
            X.7iQ r0 = r9.A00
            int r0 = r0.A02
            r8 = 805306368(0x30000000, float:4.656613E-10)
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            r5 = 4
            r1 = 3
            if (r0 == r1) goto L_0x002a
            if (r0 == r5) goto L_0x0025
            if (r0 == r6) goto L_0x002c
            if (r0 == r7) goto L_0x0028
            if (r0 == r8) goto L_0x0025
            java.lang.IllegalStateException r0 = X.AnonymousClass6CA.A0O()
            throw r0
        L_0x0025:
            int r2 = r2 / 2
            goto L_0x002c
        L_0x0028:
            int r2 = r2 / 3
        L_0x002a:
            int r2 = r2 * 2
        L_0x002c:
            java.nio.ByteBuffer r2 = r9.A00(r2)
            X.7iQ r0 = r9.A00
            int r0 = r0.A02
            if (r0 == r1) goto L_0x0093
            if (r0 == r5) goto L_0x006e
            if (r0 == r6) goto L_0x0061
            if (r0 == r7) goto L_0x0052
            if (r0 == r8) goto L_0x0043
            java.lang.IllegalStateException r0 = X.AnonymousClass6CA.A0O()
            throw r0
        L_0x0043:
            if (r4 >= r3) goto L_0x00a6
            int r0 = r4 + 2
            X.AnonymousClass6C9.A1D(r10, r2, r0)
            int r0 = r4 + 3
            X.AnonymousClass6C9.A1D(r10, r2, r0)
            int r4 = r4 + 4
            goto L_0x0043
        L_0x0052:
            if (r4 >= r3) goto L_0x00a6
            int r0 = r4 + 1
            X.AnonymousClass6C9.A1D(r10, r2, r0)
            int r0 = r4 + 2
            X.AnonymousClass6C9.A1D(r10, r2, r0)
            int r4 = r4 + 3
            goto L_0x0052
        L_0x0061:
            if (r4 >= r3) goto L_0x00a6
            int r0 = r4 + 1
            X.AnonymousClass6C9.A1D(r10, r2, r0)
            X.AnonymousClass6C9.A1D(r10, r2, r4)
            int r4 = r4 + 2
            goto L_0x0061
        L_0x006e:
            if (r4 >= r3) goto L_0x00a6
            float r5 = r10.getFloat(r4)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = X.AnonymousClass001.A01(r5, r0, r1)
            r0 = 1191181824(0x46fffe00, float:32767.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            short r1 = (short) r0
            r0 = r1 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r2.put(r0)
            int r0 = r1 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r2.put(r0)
            int r4 = r4 + 4
            goto L_0x006e
        L_0x0093:
            if (r4 >= r3) goto L_0x00a6
            r0 = 0
            r2.put(r0)
            int r0 = X.AnonymousClass6CA.A08(r10, r4)
            int r0 = r0 + -128
            byte r0 = (byte) r0
            r2.put(r0)
            int r4 = r4 + 1
            goto L_0x0093
        L_0x00a6:
            int r0 = r10.limit()
            r10.position(r0)
            r2.flip()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6OQ.Bi4(java.nio.ByteBuffer):void");
    }
}
