package X;

import java.nio.MappedByteBuffer;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.5Q5  reason: invalid class name */
public class AnonymousClass5Q5 {
    public C105015Tf A00;
    public final ConcurrentHashMap A01 = AnonymousClass0x9.A1D();
    public final ConcurrentHashMap A02 = AnonymousClass0x9.A1D();

    public String A00(int i) {
        String str;
        ConcurrentHashMap concurrentHashMap = this.A02;
        Integer valueOf = Integer.valueOf(i);
        String A0e = C18320x8.A0e(valueOf, concurrentHashMap);
        if (A0e != null) {
            return A0e;
        }
        C105015Tf r5 = this.A00;
        if (r5 == null) {
            return null;
        }
        synchronized (r5) {
            int i2 = r5.A02.get(i);
            if (i2 == 0) {
                str = null;
            } else {
                MappedByteBuffer mappedByteBuffer = r5.A03;
                mappedByteBuffer.position(i2);
                int position = mappedByteBuffer.position();
                int A012 = r5.A01(position);
                int A002 = r5.A00(position + 4);
                byte[] bArr = new byte[A002];
                mappedByteBuffer.position(r5.A00 + A012);
                mappedByteBuffer.get(bArr, 0, A002);
                str = new String(bArr, r5.A04);
            }
        }
        if (str == null) {
            return str;
        }
        concurrentHashMap.put(valueOf, str);
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f0, code lost:
        if (r3 != 16) goto L_0x00f2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A01(X.C160177nA r18, java.lang.Object r19, int r20) {
        /*
            r17 = this;
            r4 = r19
            r2 = r17
            java.util.concurrent.ConcurrentHashMap r12 = r2.A01
            r3 = r20
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r12.get(r11)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r1 = 0
            if (r0 != 0) goto L_0x006a
            X.5Tf r10 = r2.A00
            if (r10 == 0) goto L_0x00fe
            monitor-enter(r10)
            android.util.SparseIntArray r0 = r10.A01     // Catch:{ all -> 0x0063 }
            int r0 = r0.get(r3)     // Catch:{ all -> 0x0063 }
            if (r0 != 0) goto L_0x0024
            goto L_0x00fd
        L_0x0024:
            java.nio.MappedByteBuffer r9 = r10.A03     // Catch:{ all -> 0x0063 }
            r9.position(r0)     // Catch:{ all -> 0x0063 }
            int r0 = r9.position()     // Catch:{ all -> 0x0063 }
            byte r8 = r9.get(r0)     // Catch:{ all -> 0x0063 }
            int r13 = r0 + 1
            r0 = 6
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x0063 }
            r7 = 0
            r6 = 0
        L_0x0038:
            if (r6 >= r8) goto L_0x0066
            byte r14 = r9.get(r13)     // Catch:{ all -> 0x0063 }
            int r1 = r13 + 1
            int r2 = r10.A01(r1)     // Catch:{ all -> 0x0063 }
            int r1 = r1 + 4
            int r5 = r10.A00(r1)     // Catch:{ all -> 0x0063 }
            int r13 = r1 + 2
            byte[] r3 = new byte[r5]     // Catch:{ all -> 0x0063 }
            int r1 = r10.A00     // Catch:{ all -> 0x0063 }
            int r1 = r1 + r2
            r9.position(r1)     // Catch:{ all -> 0x0063 }
            r9.get(r3, r7, r5)     // Catch:{ all -> 0x0063 }
            java.nio.charset.Charset r2 = r10.A04     // Catch:{ all -> 0x0063 }
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x0063 }
            r1.<init>(r3, r7, r5, r2)     // Catch:{ all -> 0x0063 }
            r0[r14] = r1     // Catch:{ all -> 0x0063 }
            int r6 = r6 + 1
            goto L_0x0038
        L_0x0063:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L_0x0066:
            monitor-exit(r10)
            r12.put(r11, r0)
        L_0x006a:
            boolean r1 = r4 instanceof java.lang.String
            r6 = r18
            if (r1 == 0) goto L_0x00cd
            java.lang.String r4 = (java.lang.String) r4
            r1 = 46
            int r3 = r4.indexOf(r1)
            r1 = -1
            r2 = 0
            if (r3 != r1) goto L_0x008c
            long r3 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x00f2 }
            double r7 = (double) r3     // Catch:{ NumberFormatException -> 0x00f2 }
            r13 = 0
            r10 = r2
            r9 = r2
            r11 = r3
            r15 = r13
            int r3 = r6.A03(r7, r9, r10, r11, r13, r15)     // Catch:{ NumberFormatException -> 0x00f2 }
            goto L_0x00e0
        L_0x008c:
            double r7 = java.lang.Double.parseDouble(r4)     // Catch:{ NumberFormatException -> 0x00f2 }
            r15 = 0
            if (r3 != 0) goto L_0x0097
            r11 = 0
            goto L_0x009f
        L_0x0097:
            java.lang.String r1 = r4.substring(r2, r3)     // Catch:{ NumberFormatException -> 0x00f2 }
            long r11 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x00f2 }
        L_0x009f:
            int r1 = r3 + 1
            java.lang.String r5 = r4.substring(r1)     // Catch:{ NumberFormatException -> 0x00f2 }
            int r9 = r5.length()     // Catch:{ NumberFormatException -> 0x00f2 }
            r4 = r9
        L_0x00aa:
            if (r4 <= 0) goto L_0x00b9
            int r1 = r4 + -1
            char r3 = r5.charAt(r1)     // Catch:{ NumberFormatException -> 0x00f2 }
            r1 = 48
            if (r3 != r1) goto L_0x00b9
            int r4 = r4 + -1
            goto L_0x00aa
        L_0x00b9:
            long r13 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x00f2 }
            if (r4 == 0) goto L_0x00c7
            java.lang.String r1 = r5.substring(r2, r4)     // Catch:{ NumberFormatException -> 0x00f2 }
            long r15 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x00f2 }
        L_0x00c7:
            r10 = r4
            int r3 = r6.A03(r7, r9, r10, r11, r13, r15)     // Catch:{ NumberFormatException -> 0x00f2 }
            goto L_0x00e0
        L_0x00cd:
            boolean r1 = r4 instanceof java.lang.Long
            if (r1 == 0) goto L_0x00f2
            long r1 = X.C18310x6.A0B(r4)
            double r7 = (double) r1
            r9 = 0
            r13 = 0
            r10 = r9
            r11 = r1
            r15 = r13
            int r3 = r6.A03(r7, r9, r10, r11, r13, r15)
        L_0x00e0:
            r2 = 1
            if (r3 == r2) goto L_0x00f3
            r2 = 2
            if (r3 == r2) goto L_0x00f3
            r2 = 4
            if (r3 == r2) goto L_0x00fb
            r1 = 8
            if (r3 == r1) goto L_0x00f3
            r1 = 16
            r2 = 5
            if (r3 == r1) goto L_0x00f3
        L_0x00f2:
            r2 = 0
        L_0x00f3:
            r1 = r0[r2]
            if (r1 != 0) goto L_0x00fe
            r1 = 0
            r1 = r0[r1]
            return r1
        L_0x00fb:
            r2 = 3
            goto L_0x00f3
        L_0x00fd:
            monitor-exit(r10)
        L_0x00fe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5Q5.A01(X.7nA, java.lang.Object, int):java.lang.String");
    }

    public AnonymousClass5Q5(MappedByteBuffer mappedByteBuffer, List list) {
        if (mappedByteBuffer != null) {
            this.A00 = new C105015Tf(mappedByteBuffer, list);
        }
    }
}
