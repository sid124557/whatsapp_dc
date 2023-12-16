package X;

/* renamed from: X.4uq  reason: invalid class name and case insensitive filesystem */
public class C95904uq extends C1000359d {
    public final int responseCode;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002a, code lost:
        if (r4 >= 500) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0041, code lost:
        if (r5.contains("URL signature expired") != false) goto L_0x0043;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C95904uq(int r4, java.lang.String r5) {
        /*
            r3 = this;
            r2 = 0
            r0 = 400(0x190, float:5.6E-43)
            if (r4 == r0) goto L_0x002c
            r0 = 401(0x191, float:5.62E-43)
            r1 = 8
            if (r4 == r0) goto L_0x002e
            r0 = 403(0x193, float:5.65E-43)
            if (r4 == r0) goto L_0x0039
            r0 = 404(0x194, float:5.66E-43)
            if (r4 == r0) goto L_0x0043
            r0 = 408(0x198, float:5.72E-43)
            if (r4 == r0) goto L_0x002c
            r0 = 410(0x19a, float:5.75E-43)
            if (r4 == r0) goto L_0x0043
            r0 = 416(0x1a0, float:5.83E-43)
            if (r4 == r0) goto L_0x0037
            r0 = 429(0x1ad, float:6.01E-43)
            if (r4 == r0) goto L_0x0034
            r0 = 507(0x1fb, float:7.1E-43)
            if (r4 == r0) goto L_0x0034
            r0 = 500(0x1f4, float:7.0E-43)
            r1 = -1
            if (r4 < r0) goto L_0x002e
        L_0x002c:
            r1 = 16
        L_0x002e:
            r3.<init>(r2, r2, r1)
            r3.responseCode = r4
            return
        L_0x0034:
            r1 = 12
            goto L_0x002e
        L_0x0037:
            r1 = 6
            goto L_0x002e
        L_0x0039:
            if (r5 == 0) goto L_0x002e
            java.lang.String r0 = "URL signature expired"
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x002e
        L_0x0043:
            r1 = 5
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95904uq.<init>(int, java.lang.String):void");
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("failed to download; code=");
        A0o.append(this.responseCode);
        A0o.append("; status=");
        return AnonymousClass000.A0X(C625435m.A01(this.downloadStatus), A0o);
    }
}
