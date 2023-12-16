package X;

import java.util.zip.ZipEntry;

/* renamed from: X.6NU  reason: invalid class name */
public final class AnonymousClass6NU extends C147667Fe implements Comparable {
    public final int A00;
    public final ZipEntry A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6NU(java.lang.String r4, java.util.zip.ZipEntry r5, int r6) {
        /*
            r3 = this;
            r0 = 4
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r1 = r5.getName()
            r0 = 0
            r2[r0] = r1
            long r0 = r5.getSize()
            X.AnonymousClass001.A1Q(r2, r0)
            long r0 = r5.getCompressedSize()
            X.AnonymousClass0x2.A1U(r2, r0)
            long r0 = r5.getCrc()
            X.AnonymousClass0x2.A1V(r2, r0)
            java.lang.String r0 = "pseudo-zip-hash-1-%s-%s-%s-%s"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r3.<init>(r4, r0)
            r3.A01 = r5
            r3.A00 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6NU.<init>(java.lang.String, java.util.zip.ZipEntry, int):void");
    }

    public int compareTo(Object obj) {
        return this.A01.compareTo(((C147667Fe) obj).A01);
    }
}
