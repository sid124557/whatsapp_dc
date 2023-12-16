package X;

/* renamed from: X.24A  reason: invalid class name */
public class AnonymousClass24A extends Exception {
    public final Integer e2eFailureReason;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass24A(java.lang.Integer r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid message; error="
            r2.append(r0)
            r2.append(r4)
            if (r5 != 0) goto L_0x001a
            java.lang.String r0 = ""
        L_0x0010:
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r2)
            r3.<init>(r0)
            r3.e2eFailureReason = r4
            return
        L_0x001a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = ", "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r5, r1)
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass24A.<init>(java.lang.Integer, java.lang.String):void");
    }

    public static AnonymousClass24A A00(int i) {
        return new AnonymousClass24A(Integer.valueOf(i), (String) null);
    }
}
