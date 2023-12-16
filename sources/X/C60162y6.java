package X;

/* renamed from: X.2y6  reason: invalid class name and case insensitive filesystem */
public class C60162y6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r11 == 4) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C60162y6 A00(java.lang.String r12) {
        /*
            java.lang.String r0 = "\\."
            java.lang.String[] r6 = r12.split(r0)     // Catch:{ Exception -> 0x003a }
            int r11 = r6.length     // Catch:{ Exception -> 0x003a }
            r5 = 4
            r4 = 1
            r3 = 3
            r2 = 0
            if (r11 == r3) goto L_0x0010
            r1 = 0
            if (r11 != r5) goto L_0x0011
        L_0x0010:
            r1 = 1
        L_0x0011:
            java.lang.String r0 = "Version name must have 3 or 4 parts"
            X.C626936e.A0E(r1, r0)     // Catch:{ Exception -> 0x003a }
            r0 = r6[r2]     // Catch:{ Exception -> 0x003a }
            int r7 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x003a }
            r0 = r6[r4]     // Catch:{ Exception -> 0x003a }
            int r8 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x003a }
            r0 = 2
            r0 = r6[r0]     // Catch:{ Exception -> 0x003a }
            int r9 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x003a }
            if (r11 != r5) goto L_0x0037
            r0 = r6[r3]     // Catch:{ Exception -> 0x003a }
            int r10 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x003a }
        L_0x0031:
            X.2y6 r6 = new X.2y6     // Catch:{ Exception -> 0x003a }
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x003a }
            goto L_0x0039
        L_0x0037:
            r10 = 0
            goto L_0x0031
        L_0x0039:
            return r6
        L_0x003a:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "version/parse ["
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = "]"
            X.C18260x0.A15(r0, r1, r2)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60162y6.A00(java.lang.String):X.2y6");
    }

    public int A01(C60162y6 r5) {
        int i = this.A01;
        int i2 = r5.A01;
        if (i >= i2) {
            if (i <= i2) {
                int i3 = this.A04;
                int i4 = r5.A04;
                if (i3 >= i4) {
                    if (i3 <= i4) {
                        int i5 = this.A03;
                        int i6 = r5.A03;
                        if (i5 >= i6) {
                            if (i5 <= i6) {
                                int i7 = this.A00;
                                int i8 = r5.A00;
                                if (i7 >= i8) {
                                    if (i7 <= i8) {
                                        return 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public C60162y6(int i, int i2, int i3, int i4, int i5) {
        this.A01 = i;
        this.A04 = i2;
        this.A03 = i3;
        this.A00 = i4;
        this.A02 = i5;
    }

    public String toString() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A01);
        A0o.append(".");
        A0o.append(this.A04);
        A0o.append(".");
        A0o.append(this.A03);
        if (this.A02 == 4) {
            str = AnonymousClass000.A0h(AnonymousClass000.A0l("."), this.A00);
        } else {
            str = "";
        }
        return AnonymousClass000.A0X(str, A0o);
    }
}
