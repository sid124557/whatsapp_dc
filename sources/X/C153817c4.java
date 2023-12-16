package X;

import android.media.MediaDrm;

/* renamed from: X.7c4  reason: invalid class name and case insensitive filesystem */
public final class C153817c4 {
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r4 = X.AnonymousClass6CA.A0j(r1, "_");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        if ("neg".equals(r4[r3 - 2]) == false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(java.lang.Throwable r5) {
        /*
            android.media.MediaDrm$MediaDrmStateException r5 = (android.media.MediaDrm.MediaDrmStateException) r5
            java.lang.String r1 = r5.getDiagnosticInfo()
            r5 = 0
            if (r1 == 0) goto L_0x0031
            java.lang.String r0 = "_"
            java.lang.String[] r4 = X.AnonymousClass6CA.A0j(r1, r0)
            int r3 = r4.length
            r1 = 2
            if (r3 < r1) goto L_0x0031
            int r0 = r3 + -1
            r2 = r4[r0]
            r0 = 3
            if (r3 < r0) goto L_0x0026
            int r3 = r3 - r1
            r1 = r4[r3]
            java.lang.String r0 = "neg"
            boolean r1 = r0.equals(r1)
            r0 = 1
            if (r1 != 0) goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            r2.getClass()     // Catch:{ NumberFormatException -> 0x0031 }
            int r5 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0031 }
            if (r0 == 0) goto L_0x0031
            int r5 = -r5
        L_0x0031:
            int r0 = com.facebook.android.exoplayer2.util.Util.A01(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153817c4.A00(java.lang.Throwable):int");
    }

    public static boolean A01(Throwable th) {
        return th instanceof MediaDrm.MediaDrmStateException;
    }
}
