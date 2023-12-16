package X;

/* renamed from: X.73S  reason: invalid class name */
public class AnonymousClass73S extends C142766xj {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass73S(int r3) {
        /*
            r2 = this;
            r2.A00 = r3
            switch(r3) {
                case 0: goto L_0x000c;
                case 1: goto L_0x0010;
                case 2: goto L_0x0014;
                case 3: goto L_0x0018;
                case 4: goto L_0x001c;
                case 5: goto L_0x0020;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r1 = "OCULUS"
            r0 = 6
        L_0x0008:
            r2.<init>(r1, r0)
            return
        L_0x000c:
            java.lang.String r1 = "FACEBOOK"
            r0 = 0
            goto L_0x0008
        L_0x0010:
            java.lang.String r1 = "FACEBOOK_DEBUG"
            r0 = 1
            goto L_0x0008
        L_0x0014:
            java.lang.String r1 = "FACEBOOK_LITE"
            r0 = 2
            goto L_0x0008
        L_0x0018:
            java.lang.String r1 = "INSTAGRAM"
            r0 = 3
            goto L_0x0008
        L_0x001c:
            java.lang.String r1 = "MLITE"
            r0 = 4
            goto L_0x0008
        L_0x0020:
            java.lang.String r1 = "MESSENGER"
            r0 = 5
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass73S.<init>(int):void");
    }

    public String A00() {
        switch (this.A00) {
            case 0:
                return "com.facebook.katana";
            case 1:
                return "com.facebook.wakizashi";
            case 2:
                return "com.facebook.lite";
            case 3:
                return "com.instagram.android";
            case 4:
                return "com.facebook.mlite";
            case 5:
                return "com.facebook.orca";
            default:
                return "com.oculus.twilight";
        }
    }
}
