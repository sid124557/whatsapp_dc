package X;

import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.7oa  reason: invalid class name and case insensitive filesystem */
public class C160887oa {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r6.isEmpty() != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long A01(X.C180608lL r8, X.C153007aW r9) {
        /*
            java.util.List r0 = r9.A05
            java.util.ArrayList r7 = X.AnonymousClass002.A0J(r0)
            java.util.List r0 = r9.A04
            java.util.ArrayList r6 = X.AnonymousClass002.A0J(r0)
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0019
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            r1 = 1
        L_0x001a:
            java.lang.String r0 = "only timelinespeed or pts mutator may be populated."
            X.C159297la.A02(r1, r0)
            java.util.List r0 = r9.A02
            java.util.Iterator r2 = X.AnonymousClass6C7.A0u(r0)
            r4 = 0
        L_0x0027:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0039
            java.lang.Object r0 = r2.next()
            X.7aw r0 = (X.C153257aw) r0
            long r0 = A02(r8, r0)
            long r4 = r4 + r0
            goto L_0x0027
        L_0x0039:
            java.util.Iterator r1 = r7.iterator()
            r2 = 0
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004f
            r1.next()
            java.lang.String r0 = "getTargetTimeRange"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x004f:
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0069
            java.util.Iterator r1 = r6.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0069
            r1.next()
            java.lang.String r0 = "getSourceTimeRange"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0069:
            long r4 = r4 - r2
            long r4 = r4 + r2
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160887oa.A01(X.8lL, X.7aW):long");
    }

    public static long A00(C180608lL r8, C142366x5 r9, C153537bV r10) {
        int size;
        HashMap A02 = r10.A02(r9);
        int i = 0;
        if (A02 == null) {
            size = 0;
        } else {
            size = A02.size();
        }
        long j = -1;
        while (i < size) {
            if (r10.A00(r9, i) != null) {
                j = Math.max(j, 0 + A01(r8, r10.A00(r9, i)));
                i++;
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("No track available for ");
                throw AnonymousClass002.A0C(AnonymousClass000.A0X(r9.name(), A0o));
            }
        }
        return j;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: int} */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long A02(X.C180608lL r9, X.C153257aw r10) {
        /*
            boolean r0 = r10.A01()
            if (r0 == 0) goto L_0x0009
            long r0 = r10.A00
            return r0
        L_0x0009:
            java.io.File r4 = r10.A02
            X.7av r5 = r10.A01
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r0 = r5.A01
            java.util.concurrent.TimeUnit r2 = r5.A02
            long r7 = r3.convert(r0, r2)
            long r0 = r5.A00
            long r5 = r3.convert(r0, r2)
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0025
            r7 = 0
        L_0x0025:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0068
            r6 = 1
            r5 = 0
            android.net.Uri r0 = android.net.Uri.fromFile(r4)     // Catch:{ IllegalArgumentException -> 0x003c }
            X.7Uf r0 = r9.B2y(r0)     // Catch:{ IllegalArgumentException -> 0x003c }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ IllegalArgumentException -> 0x003c }
            long r0 = r0.A07     // Catch:{ IllegalArgumentException -> 0x003c }
            long r5 = r2.toMicros(r0)     // Catch:{ IllegalArgumentException -> 0x003c }
            goto L_0x0068
        L_0x003c:
            java.util.Locale r3 = java.util.Locale.US
            r0 = 4
            java.lang.Object[] r2 = new java.lang.Object[r0]
            boolean r0 = r4.exists()
            X.AnonymousClass6C7.A1V(r2, r5, r0)
            boolean r0 = r4.canRead()
            X.AnonymousClass6C7.A1V(r2, r6, r0)
            r1 = 2
            java.lang.String r0 = r4.getPath()
            r2[r1] = r0
            r1 = 3
            java.lang.String r0 = r4.getCanonicalPath()
            r2[r1] = r0
            java.lang.String r0 = "mediaMetadataExtractor.extractMediaMetadata IllegalArgumentException. exists: %b, canRead: %b, path: %s, canonicalPath: %s"
            java.lang.String r0 = java.lang.String.format(r3, r0, r2)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x0068:
            long r5 = r5 - r7
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160887oa.A02(X.8lL, X.7aw):long");
    }

    public static void A03(C142366x5 r1, C153537bV r2) {
        Iterator A0u = AnonymousClass001.A0u(r2.A01(r1));
        while (A0u.hasNext()) {
            Iterator A0q = C18320x8.A0q(AnonymousClass0x2.A0W(A0u));
            if (A0q.hasNext()) {
                A0q.next();
                throw AnonymousClass001.A0g("getMediaEffect");
            }
        }
    }
}
