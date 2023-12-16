package X;

import java.io.IOException;

/* renamed from: X.0Oi  reason: invalid class name and case insensitive filesystem */
public class C04450Oi {
    public final AnonymousClass33p A00;
    public final AnonymousClass1VX A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r10.startsWith(r8.A02) == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        if (r10.startsWith(r8.A06) == false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A00(java.io.File r9, java.lang.String r10) {
        /*
            r8 = this;
            if (r10 == 0) goto L_0x000b
            java.lang.String r0 = r8.A06
            boolean r1 = r10.startsWith(r0)
            r0 = 1
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            r7 = 0
            if (r0 != 0) goto L_0x0029
            X.33p r0 = r8.A00
            boolean r0 = r0.A27()
            if (r0 != 0) goto L_0x002a
            if (r10 == 0) goto L_0x002a
            java.lang.String r0 = r8.A07
            boolean r0 = r10.startsWith(r0)
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = r8.A05
            boolean r0 = r10.startsWith(r0)
            if (r0 == 0) goto L_0x002a
        L_0x0029:
            return r7
        L_0x002a:
            X.1VX r5 = r8.A01
            r0 = 1239(0x4d7, float:1.736E-42)
            int r0 = r5.A0N(r0)
            long r3 = (long) r0
            r1 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 * r1
            r0 = 1240(0x4d8, float:1.738E-42)
            int r0 = r5.A0N(r0)
            long r5 = (long) r0
            long r5 = r5 * r1
            if (r10 == 0) goto L_0x004a
            java.lang.String r0 = r8.A02
            boolean r1 = r10.startsWith(r0)
            r0 = 1
            if (r1 != 0) goto L_0x004b
        L_0x004a:
            r0 = 0
        L_0x004b:
            long r1 = r9.length()
            if (r0 == 0) goto L_0x0052
            r3 = r5
        L_0x0052:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0069
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "gdrive-util/should-backup/too-large "
            X.AnonymousClass000.A10(r9, r0, r1)
            java.lang.String r0 = " size:"
            java.lang.String r0 = X.AnonymousClass000.A0N(r9, r0, r1)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r7
        L_0x0069:
            java.lang.String r1 = r9.getName()
            java.lang.String r0 = "."
            int r2 = r1.lastIndexOf(r0)
            r0 = -1
            if (r2 == r0) goto L_0x007f
            int r1 = r1.length()
            r0 = 1
            int r1 = r1 - r0
            if (r2 == r1) goto L_0x007f
            return r0
        L_0x007f:
            r9.getAbsolutePath()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04450Oi.A00(java.io.File, java.lang.String):boolean");
    }

    public boolean A01(String str) {
        if (str == null || !str.startsWith(this.A04)) {
            return false;
        }
        return true;
    }

    public C04450Oi(C64393Dh r3, AnonymousClass33p r4, AnonymousClass1VX r5) {
        this.A01 = r5;
        this.A00 = r4;
        try {
            this.A02 = r3.A0A().getCanonicalPath();
            this.A06 = r3.A0I().getCanonicalPath();
            this.A03 = r3.A0E().getCanonicalPath();
            this.A04 = r3.A0G().getCanonicalPath();
            this.A07 = r3.A0J().getCanonicalPath();
            this.A05 = r3.A0H().getCanonicalPath();
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
