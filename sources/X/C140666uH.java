package X;

import java.io.InputStream;

/* renamed from: X.6uH  reason: invalid class name and case insensitive filesystem */
public class C140666uH extends InputStream {
    public InputStream A00;
    public boolean A01 = true;
    public final AnonymousClass7Z0 A02;

    public final C188598zB A00() {
        C183618qL A002 = this.A02.A00();
        if (A002 == null) {
            return null;
        }
        if (A002 instanceof C188598zB) {
            return (C188598zB) A002;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass6C7.A1O(A0o, "unknown object encountered: ", A002);
        throw AnonymousClass002.A0C(A0o.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r0 = A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r0 != null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        r5.A00 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r4 < 1) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read(byte[] r6, int r7, int r8) {
        /*
            r5 = this;
            java.io.InputStream r0 = r5.A00
            r4 = 0
            r3 = -1
            if (r0 != 0) goto L_0x0018
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x0035
            X.8zB r0 = r5.A00()
            if (r0 == 0) goto L_0x0035
            r5.A01 = r4
        L_0x0012:
            java.io.InputStream r0 = r0.BA6()
            r5.A00 = r0
        L_0x0018:
            java.io.InputStream r2 = r5.A00
            int r1 = r7 + r4
            int r0 = r8 - r4
            int r0 = r2.read(r6, r1, r0)
            if (r0 < 0) goto L_0x0028
            int r4 = r4 + r0
            if (r4 != r8) goto L_0x0018
            return r4
        L_0x0028:
            X.8zB r0 = r5.A00()
            if (r0 != 0) goto L_0x0012
            r0 = 0
            r5.A00 = r0
            r0 = 1
            if (r4 < r0) goto L_0x0035
            return r4
        L_0x0035:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140666uH.read(byte[], int, int):int");
    }

    public C140666uH(AnonymousClass7Z0 r2) {
        this.A02 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read() {
        /*
            r3 = this;
            java.io.InputStream r0 = r3.A00
            r2 = -1
            if (r0 != 0) goto L_0x0018
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0028
            X.8zB r1 = r3.A00()
            if (r1 == 0) goto L_0x0028
            r0 = 0
            r3.A01 = r0
        L_0x0012:
            java.io.InputStream r0 = r1.BA6()
            r3.A00 = r0
        L_0x0018:
            int r0 = r0.read()
            if (r0 < 0) goto L_0x001f
            return r0
        L_0x001f:
            X.8zB r1 = r3.A00()
            if (r1 != 0) goto L_0x0012
            r0 = 0
            r3.A00 = r0
        L_0x0028:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140666uH.read():int");
    }
}
