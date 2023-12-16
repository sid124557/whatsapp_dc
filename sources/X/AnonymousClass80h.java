package X;

import java.util.Arrays;

/* renamed from: X.80h  reason: invalid class name */
public final class AnonymousClass80h implements C177618gA {
    public final C166617yz A00;
    public final boolean A01;
    public final int[] A02;
    public final boolean[] A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass80h.class != obj.getClass()) {
                return false;
            }
            AnonymousClass80h r5 = (AnonymousClass80h) obj;
            if (this.A01 != r5.A01 || !this.A00.equals(r5.A00) || !Arrays.equals(this.A02, r5.A02) || !Arrays.equals(this.A03, r5.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((C18300x5.A04(this.A00) + (this.A01 ? 1 : 0)) * 31) + Arrays.hashCode(this.A02)) * 31) + Arrays.hashCode(this.A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r4 != r8.length) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass80h(X.C166617yz r6, int[] r7, boolean[] r8, boolean r9) {
        /*
            r5 = this;
            r5.<init>()
            int r4 = r6.A01
            int r0 = r7.length
            r3 = 0
            r2 = 1
            if (r4 != r0) goto L_0x000e
            int r1 = r8.length
            r0 = 1
            if (r4 == r1) goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            X.C159197lM.A01(r0)
            r5.A00 = r6
            if (r9 == 0) goto L_0x0019
            if (r4 <= r2) goto L_0x0019
            r3 = 1
        L_0x0019:
            r5.A01 = r3
            java.lang.Object r0 = r7.clone()
            int[] r0 = (int[]) r0
            r5.A02 = r0
            java.lang.Object r0 = r8.clone()
            boolean[] r0 = (boolean[]) r0
            r5.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass80h.<init>(X.7yz, int[], boolean[], boolean):void");
    }
}
