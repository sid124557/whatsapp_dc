package X;

import android.os.Handler;

/* renamed from: X.91L  reason: invalid class name */
public class AnonymousClass91L implements Handler.Callback {
    public Object A00;
    public final int A01;

    public AnonymousClass91L(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:25|26|27|28|29|216) */
    /* JADX WARNING: Code restructure failed: missing block: B:215:?, code lost:
        return false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00b0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r20) {
        /*
            r19 = this;
            r3 = r19
            int r0 = r3.A01
            r4 = r20
            switch(r0) {
                case 0: goto L_0x0012;
                case 1: goto L_0x0350;
                case 2: goto L_0x03aa;
                case 3: goto L_0x03cf;
                case 4: goto L_0x03f0;
                case 5: goto L_0x03fc;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r3.A00
            X.5b3 r0 = (X.C107285b3) r0
            boolean r0 = X.C107285b3.A06(r4, r0)
            return r0
        L_0x0012:
            java.lang.Object r0 = r3.A00     // Catch:{ all -> 0x033f }
            X.7kj r0 = (X.C158897kj) r0     // Catch:{ all -> 0x033f }
            int r1 = r4.what     // Catch:{ all -> 0x033f }
            switch(r1) {
                case 1: goto L_0x032a;
                case 2: goto L_0x01a8;
                case 3: goto L_0x012b;
                case 4: goto L_0x00ba;
                case 5: goto L_0x00b5;
                case 6: goto L_0x0113;
                case 7: goto L_0x009f;
                case 8: goto L_0x0084;
                case 9: goto L_0x001d;
                default: goto L_0x001b;
            }     // Catch:{ all -> 0x033f }
        L_0x001b:
            goto L_0x03cd
        L_0x001d:
            java.lang.Object r4 = r4.obj     // Catch:{ all -> 0x033f }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ all -> 0x033f }
            int r2 = r0.A00     // Catch:{ all -> 0x033f }
            r1 = 2
            if (r2 == r1) goto L_0x03cd
            r0.A00 = r1     // Catch:{ all -> 0x033f }
            java.lang.Object r2 = r4.first     // Catch:{ all -> 0x033f }
            java.util.HashSet r2 = (java.util.HashSet) r2     // Catch:{ all -> 0x033f }
            r0.A09 = r2     // Catch:{ all -> 0x033f }
            java.lang.Object r1 = r4.second     // Catch:{ all -> 0x033f }
            int r1 = X.AnonymousClass0x7.A05(r1)     // Catch:{ all -> 0x033f }
            long r8 = (long) r1     // Catch:{ all -> 0x033f }
            r4 = 0
            int r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x0071
            int r1 = r2.size()     // Catch:{ all -> 0x033f }
            java.lang.Integer[] r1 = new java.lang.Integer[r1]     // Catch:{ all -> 0x033f }
            java.lang.Object[] r2 = r2.toArray(r1)     // Catch:{ all -> 0x033f }
            java.lang.Integer[] r2 = (java.lang.Integer[]) r2     // Catch:{ all -> 0x033f }
            r1 = 0
            r1 = r2[r1]     // Catch:{ all -> 0x033f }
            X.7bV r4 = r0.A05     // Catch:{ all -> 0x033f }
            X.6x5 r2 = X.C142366x5.AUDIO     // Catch:{ all -> 0x033f }
            int r1 = r1.intValue()     // Catch:{ all -> 0x033f }
            X.7aW r1 = r4.A00(r2, r1)     // Catch:{ all -> 0x033f }
            if (r1 == 0) goto L_0x0071
            java.util.List r1 = r1.A02     // Catch:{ all -> 0x033f }
            X.7aw r2 = X.AnonymousClass6C9.A0T(r1)     // Catch:{ all -> 0x033f }
            X.8lL r1 = r0.A0G     // Catch:{ IOException -> 0x006f }
            long r4 = X.C160887oa.A02(r1, r2)     // Catch:{ IOException -> 0x006f }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ IOException -> 0x006f }
            long r1 = r1.toSeconds(r4)     // Catch:{ IOException -> 0x006f }
            long r8 = java.lang.Math.min(r1, r8)     // Catch:{ IOException -> 0x006f }
            goto L_0x0071
        L_0x006f:
            r8 = 0
        L_0x0071:
            r6 = 0
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x033f }
            X.7av r4 = new X.7av     // Catch:{ all -> 0x033f }
            r4.<init>(r5, r6, r8)     // Catch:{ all -> 0x033f }
            r0.A04 = r4     // Catch:{ all -> 0x033f }
            boolean r1 = r0.A03()     // Catch:{ all -> 0x033f }
            if (r1 == 0) goto L_0x03cd
            goto L_0x032d
        L_0x0084:
            java.lang.Object r4 = r4.obj     // Catch:{ all -> 0x033f }
            X.7bV r4 = (X.C153537bV) r4     // Catch:{ all -> 0x033f }
            X.7QR r1 = r0.A08     // Catch:{ all -> 0x033f }
            X.7hd r2 = new X.7hd     // Catch:{ all -> 0x033f }
            r2.<init>(r1)     // Catch:{ all -> 0x033f }
            r2.A05 = r4     // Catch:{ all -> 0x033f }
            X.7QR r1 = new X.7QR     // Catch:{ all -> 0x033f }
            r1.<init>(r2)     // Catch:{ all -> 0x033f }
            r0.A08 = r1     // Catch:{ all -> 0x033f }
            r0.A05 = r4     // Catch:{ all -> 0x033f }
            r0.A02()     // Catch:{ all -> 0x033f }
            goto L_0x03cd
        L_0x009f:
            java.lang.Object r2 = r4.obj     // Catch:{ all -> 0x033f }
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch:{ all -> 0x033f }
            X.7VY r1 = new X.7VY     // Catch:{ all -> 0x033f }
            r1.<init>()     // Catch:{ all -> 0x033f }
            r1.A00(r2)     // Catch:{ all -> 0x033f }
            r0.A01()     // Catch:{ all -> 0x00b0 }
            goto L_0x03cd
        L_0x00b0:
            r1.A00(r2)     // Catch:{ all -> 0x033f }
            goto L_0x03cd
        L_0x00b5:
            r0.A01()     // Catch:{ all -> 0x033f }
            goto L_0x03cd
        L_0x00ba:
            java.lang.Object r1 = r4.obj     // Catch:{ all -> 0x033f }
            long r4 = X.C18320x8.A05(r1)     // Catch:{ all -> 0x033f }
            java.lang.System.nanoTime()     // Catch:{ all -> 0x033f }
            r0.A02 = r4     // Catch:{ all -> 0x01a6 }
            X.7kl r1 = r0.A07     // Catch:{ all -> 0x01a6 }
            r1.A00(r4)     // Catch:{ all -> 0x01a6 }
            X.7kl r1 = r0.A06     // Catch:{ all -> 0x01a6 }
            r1.A00(r4)     // Catch:{ all -> 0x01a6 }
            java.util.Map r1 = r0.A0K     // Catch:{ all -> 0x01a6 }
            java.util.HashSet r1 = X.C18310x6.A0s(r1)     // Catch:{ all -> 0x01a6 }
            java.util.Iterator r9 = r1.iterator()     // Catch:{ all -> 0x01a6 }
        L_0x00d9:
            boolean r1 = r9.hasNext()     // Catch:{ all -> 0x01a6 }
            if (r1 == 0) goto L_0x0100
            java.lang.Object r1 = r9.next()     // Catch:{ all -> 0x01a6 }
            int r6 = X.AnonymousClass0x7.A05(r1)     // Catch:{ all -> 0x01a6 }
            X.8v9 r8 = r0.A00(r6)     // Catch:{ all -> 0x01a6 }
            if (r8 == 0) goto L_0x00d9
            X.7bV r2 = r0.A05     // Catch:{ all -> 0x01a6 }
            X.6x5 r1 = X.C142366x5.AUDIO     // Catch:{ all -> 0x01a6 }
            r2.A00(r1, r6)     // Catch:{ all -> 0x01a6 }
            r6 = 0
            long r1 = r4 - r6
            long r1 = java.lang.Math.max(r1, r6)     // Catch:{ all -> 0x01a6 }
            r8.Bl2(r1)     // Catch:{ all -> 0x01a6 }
            goto L_0x00d9
        L_0x0100:
            r1 = 0
            r0.A0A = r1     // Catch:{ all -> 0x01a6 }
            X.7Wp r1 = r0.A0F     // Catch:{ all -> 0x01a6 }
            X.7JP r0 = r1.A01     // Catch:{ all -> 0x01a6 }
            X.85o r0 = r0.A02     // Catch:{ all -> 0x01a6 }
            r0.flush()     // Catch:{ all -> 0x01a6 }
            java.nio.ByteBuffer r0 = r1.A00     // Catch:{ all -> 0x01a6 }
            r0.clear()     // Catch:{ all -> 0x01a6 }
            goto L_0x03cd
        L_0x0113:
            int r2 = r0.A00     // Catch:{ all -> 0x033f }
            r1 = 1
            if (r2 != r1) goto L_0x03cd
            r1 = 0
            r0.A00 = r1     // Catch:{ all -> 0x033f }
            X.7Wp r1 = r0.A0F     // Catch:{ all -> 0x033f }
            X.7JP r0 = r1.A01     // Catch:{ all -> 0x033f }
            X.85o r0 = r0.A02     // Catch:{ all -> 0x033f }
            r0.flush()     // Catch:{ all -> 0x033f }
            java.nio.ByteBuffer r0 = r1.A00     // Catch:{ all -> 0x033f }
            r0.clear()     // Catch:{ all -> 0x033f }
            goto L_0x03cd
        L_0x012b:
            java.lang.System.nanoTime()     // Catch:{ all -> 0x033f }
            X.7bV r1 = r0.A05     // Catch:{ all -> 0x01a6 }
            X.6x5 r7 = X.C142366x5.AUDIO     // Catch:{ all -> 0x01a6 }
            X.8lL r6 = r0.A0G     // Catch:{ all -> 0x01a6 }
            long r4 = X.C160887oa.A00(r6, r7, r1)     // Catch:{ all -> 0x01a6 }
            X.7bV r2 = r0.A05     // Catch:{ all -> 0x01a6 }
            X.6x5 r1 = X.C142366x5.VIDEO     // Catch:{ all -> 0x01a6 }
            long r1 = X.C160887oa.A00(r6, r1, r2)     // Catch:{ all -> 0x01a6 }
            long r1 = java.lang.Math.max(r4, r1)     // Catch:{ all -> 0x01a6 }
            r0.A03 = r1     // Catch:{ all -> 0x01a6 }
            X.7bV r1 = r0.A05     // Catch:{ all -> 0x01a6 }
            java.util.HashMap r1 = r1.A02(r7)     // Catch:{ all -> 0x01a6 }
            if (r1 == 0) goto L_0x019f
            int r1 = r1.size()     // Catch:{ all -> 0x01a6 }
            r0.A01 = r1     // Catch:{ all -> 0x01a6 }
            X.7av[] r1 = new X.C153247av[r1]     // Catch:{ all -> 0x01a6 }
            r0.A0B = r1     // Catch:{ all -> 0x01a6 }
            r2 = 0
        L_0x0159:
            int r1 = r0.A01     // Catch:{ all -> 0x01a6 }
            if (r2 >= r1) goto L_0x0179
            X.7bV r1 = r0.A05     // Catch:{ all -> 0x01a6 }
            X.7aW r1 = r1.A00(r7, r2)     // Catch:{ all -> 0x01a6 }
            long r4 = X.C160887oa.A01(r6, r1)     // Catch:{ all -> 0x01a6 }
            X.7av[] r1 = r0.A0B     // Catch:{ all -> 0x01a6 }
            r10 = 0
            long r12 = r10 + r4
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x01a6 }
            X.7av r8 = new X.7av     // Catch:{ all -> 0x01a6 }
            r8.<init>(r9, r10, r12)     // Catch:{ all -> 0x01a6 }
            r1[r2] = r8     // Catch:{ all -> 0x01a6 }
            int r2 = r2 + 1
            goto L_0x0159
        L_0x0179:
            java.util.HashMap r6 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x01a6 }
            r5 = 0
        L_0x017e:
            X.7av[] r4 = r0.A0B     // Catch:{ all -> 0x01a6 }
            int r1 = r4.length     // Catch:{ all -> 0x01a6 }
            if (r5 >= r1) goto L_0x018f
            java.lang.String r2 = java.lang.Integer.toString(r5)     // Catch:{ all -> 0x01a6 }
            r1 = r4[r5]     // Catch:{ all -> 0x01a6 }
            r6.put(r2, r1)     // Catch:{ all -> 0x01a6 }
            int r5 = r5 + 1
            goto L_0x017e
        L_0x018f:
            X.7QR r1 = r0.A08     // Catch:{ all -> 0x01a6 }
            X.7Um r2 = r1.A07     // Catch:{ all -> 0x01a6 }
            X.6O5 r1 = new X.6O5     // Catch:{ all -> 0x01a6 }
            r1.<init>(r0, r2, r6)     // Catch:{ all -> 0x01a6 }
            r0.A07 = r1     // Catch:{ all -> 0x01a6 }
            r0.A02()     // Catch:{ all -> 0x01a6 }
            goto L_0x03cd
        L_0x019f:
            java.lang.String r0 = "No audio tracks"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ all -> 0x01a6 }
            throw r0     // Catch:{ all -> 0x01a6 }
        L_0x01a6:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x033f }
        L_0x01a8:
            int r2 = r0.A00     // Catch:{ all -> 0x033f }
            r1 = 1
            r7 = 2
            if (r2 == r7) goto L_0x01b0
            if (r2 != r1) goto L_0x03cd
        L_0x01b0:
            int r1 = r0.A01     // Catch:{ all -> 0x033f }
            if (r1 == 0) goto L_0x03cd
            boolean r1 = r0.A0A     // Catch:{ all -> 0x033f }
            if (r1 != 0) goto L_0x02b0
            java.util.Map r5 = r0.A0K     // Catch:{ all -> 0x033f }
            java.util.HashSet r1 = X.C18310x6.A0s(r5)     // Catch:{ all -> 0x033f }
            java.util.Iterator r10 = r1.iterator()     // Catch:{ all -> 0x033f }
        L_0x01c2:
            boolean r1 = r10.hasNext()     // Catch:{ all -> 0x033f }
            if (r1 == 0) goto L_0x0202
            java.lang.Object r9 = r10.next()     // Catch:{ all -> 0x033f }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x033f }
            int r6 = r9.intValue()     // Catch:{ all -> 0x033f }
            X.7av[] r1 = r0.A0B     // Catch:{ all -> 0x033f }
            r8 = r1[r6]     // Catch:{ all -> 0x033f }
            long r1 = r0.A02     // Catch:{ all -> 0x033f }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x033f }
            boolean r1 = r8.A01(r1, r4)     // Catch:{ all -> 0x033f }
            if (r1 == 0) goto L_0x01c2
            int r1 = r0.A00     // Catch:{ all -> 0x033f }
            if (r1 != r7) goto L_0x01ed
            java.util.HashSet r1 = r0.A09     // Catch:{ all -> 0x033f }
            boolean r1 = r1.contains(r9)     // Catch:{ all -> 0x033f }
            if (r1 != 0) goto L_0x01ed
            goto L_0x01c2
        L_0x01ed:
            X.7Wp r1 = r0.A0F     // Catch:{ all -> 0x033f }
            X.7nM r1 = r1.A02     // Catch:{ all -> 0x033f }
            boolean[] r2 = r1.A03     // Catch:{ all -> 0x033f }
            r1 = 1
            r2[r6] = r1     // Catch:{ all -> 0x033f }
            X.8v9 r4 = r0.A00(r6)     // Catch:{ all -> 0x033f }
            if (r4 == 0) goto L_0x01c2
            long r1 = r0.A02     // Catch:{ all -> 0x033f }
            r4.B1J(r1)     // Catch:{ all -> 0x033f }
            goto L_0x01c2
        L_0x0202:
            r4 = 0
        L_0x0203:
            int r1 = r0.A01     // Catch:{ all -> 0x033f }
            if (r4 >= r1) goto L_0x021d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x033f }
            boolean r1 = r5.containsKey(r1)     // Catch:{ all -> 0x033f }
            if (r1 != 0) goto L_0x021a
            X.7Wp r1 = r0.A0F     // Catch:{ all -> 0x033f }
            X.7nM r1 = r1.A02     // Catch:{ all -> 0x033f }
            boolean[] r2 = r1.A03     // Catch:{ all -> 0x033f }
            r1 = 0
            r2[r4] = r1     // Catch:{ all -> 0x033f }
        L_0x021a:
            int r4 = r4 + 1
            goto L_0x0203
        L_0x021d:
            int r1 = r0.A00     // Catch:{ all -> 0x033f }
            X.7Wp r10 = r0.A0F     // Catch:{ all -> 0x033f }
            if (r1 == r7) goto L_0x029f
            X.7nM r11 = r10.A02     // Catch:{ all -> 0x033f }
            java.nio.ByteBuffer[] r5 = r10.A04     // Catch:{ all -> 0x033f }
            java.nio.ByteBuffer r1 = r11.A01     // Catch:{ all -> 0x033f }
            if (r1 != 0) goto L_0x0233
            int r1 = r11.A00     // Catch:{ all -> 0x033f }
            java.nio.ByteBuffer r1 = X.AnonymousClass6C7.A0s(r1)     // Catch:{ all -> 0x033f }
            r11.A01 = r1     // Catch:{ all -> 0x033f }
        L_0x0233:
            r1.clear()     // Catch:{ all -> 0x033f }
            int r12 = r5.length     // Catch:{ all -> 0x033f }
            java.nio.ByteBuffer[] r9 = new java.nio.ByteBuffer[r12]     // Catch:{ all -> 0x033f }
            r4 = 0
        L_0x023a:
            if (r4 >= r12) goto L_0x0257
            boolean[] r1 = r11.A03     // Catch:{ all -> 0x033f }
            boolean r1 = r1[r4]     // Catch:{ all -> 0x033f }
            r2 = r5[r4]     // Catch:{ all -> 0x033f }
            if (r1 == 0) goto L_0x0252
            java.util.List[] r1 = r11.A02     // Catch:{ all -> 0x033f }
            r1 = r1[r4]     // Catch:{ all -> 0x033f }
            java.nio.ByteBuffer r2 = X.C160277nM.A00(r2, r1)     // Catch:{ all -> 0x033f }
            java.util.List r1 = r11.A04     // Catch:{ all -> 0x033f }
            java.nio.ByteBuffer r2 = X.C160277nM.A00(r2, r1)     // Catch:{ all -> 0x033f }
        L_0x0252:
            r9[r4] = r2     // Catch:{ all -> 0x033f }
            int r4 = r4 + 1
            goto L_0x023a
        L_0x0257:
            r8 = 0
        L_0x0258:
            int r1 = r11.A00     // Catch:{ all -> 0x033f }
            if (r8 >= r1) goto L_0x0296
            r13 = 0
            r6 = 0
        L_0x025e:
            if (r13 >= r12) goto L_0x028e
            boolean[] r1 = r11.A03     // Catch:{ all -> 0x033f }
            boolean r1 = r1[r13]     // Catch:{ all -> 0x033f }
            if (r1 == 0) goto L_0x028b
            r1 = r9[r13]     // Catch:{ all -> 0x033f }
            short r5 = r1.getShort(r8)     // Catch:{ all -> 0x033f }
            int r4 = X.C160277nM.A05     // Catch:{ all -> 0x033f }
            int r6 = r6 + r4
            int r5 = r5 + r4
            if (r6 >= r4) goto L_0x0275
            if (r5 >= r4) goto L_0x0275
            goto L_0x0281
        L_0x0275:
            int r1 = r6 + r5
            int r2 = r1 * 2
            int r6 = r6 * r5
            int r6 = r6 / r4
            int r2 = r2 - r6
            int r1 = X.C160277nM.A06     // Catch:{ all -> 0x033f }
            int r6 = r2 - r1
            goto L_0x0283
        L_0x0281:
            int r6 = r6 * r5
            int r6 = r6 / r4
        L_0x0283:
            int r1 = X.C160277nM.A06     // Catch:{ all -> 0x033f }
            if (r6 != r1) goto L_0x0289
            int r6 = r1 + -1
        L_0x0289:
            int r6 = r6 - r4
            short r6 = (short) r6     // Catch:{ all -> 0x033f }
        L_0x028b:
            int r13 = r13 + 1
            goto L_0x025e
        L_0x028e:
            java.nio.ByteBuffer r1 = r11.A01     // Catch:{ all -> 0x033f }
            r1.putShort(r6)     // Catch:{ all -> 0x033f }
            int r8 = r8 + 2
            goto L_0x0258
        L_0x0296:
            java.nio.ByteBuffer r1 = r11.A01     // Catch:{ all -> 0x033f }
            r1.flip()     // Catch:{ all -> 0x033f }
            java.nio.ByteBuffer r1 = r11.A01     // Catch:{ all -> 0x033f }
            r10.A00 = r1     // Catch:{ all -> 0x033f }
        L_0x029f:
            long r4 = r0.A02     // Catch:{ all -> 0x033f }
            long r1 = r0.A0C     // Catch:{ all -> 0x033f }
            long r4 = r4 + r1
            r0.A02 = r4     // Catch:{ all -> 0x033f }
            X.7kl r1 = r0.A07     // Catch:{ all -> 0x033f }
            r1.A00(r4)     // Catch:{ all -> 0x033f }
            X.7kl r1 = r0.A06     // Catch:{ all -> 0x033f }
            r1.A00(r4)     // Catch:{ all -> 0x033f }
        L_0x02b0:
            X.7Wp r8 = r0.A0F     // Catch:{ all -> 0x033f }
            X.7JP r6 = r8.A01     // Catch:{ all -> 0x033f }
            java.nio.ByteBuffer r11 = r8.A00     // Catch:{ all -> 0x033f }
            X.85o r9 = r6.A02     // Catch:{ all -> 0x033f }
            X.7RI r4 = r9.A00     // Catch:{ all -> 0x033f }
            r1 = 5000(0x1388, double:2.4703E-320)
            X.7aZ r4 = r4.A00     // Catch:{ all -> 0x033f }
            X.85a r13 = r4.A00(r1)     // Catch:{ all -> 0x033f }
            if (r13 == 0) goto L_0x02fe
            java.nio.ByteBuffer r1 = r13.B50()     // Catch:{ all -> 0x033f }
            r1.put(r11)     // Catch:{ all -> 0x033f }
            r14 = 0
            int r15 = r11.position()     // Catch:{ all -> 0x033f }
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x033f }
            long r1 = r6.A01     // Catch:{ all -> 0x033f }
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x033f }
            r4 = 1
            long r4 = r12.toNanos(r4)     // Catch:{ all -> 0x033f }
            long r1 = r1 * r4
            r4 = 44100(0xac44, float:6.1797E-41)
            long r4 = (long) r4     // Catch:{ all -> 0x033f }
            long r1 = r1 / r4
            long r16 = r10.toMicros(r1)     // Catch:{ all -> 0x033f }
            r18 = 1
            r13.Blq(r14, r15, r16, r18)     // Catch:{ all -> 0x033f }
            X.7RI r1 = r9.A00     // Catch:{ all -> 0x033f }
            X.7aZ r1 = r1.A00     // Catch:{ all -> 0x033f }
            r1.A03(r13)     // Catch:{ all -> 0x033f }
            long r4 = r6.A01     // Catch:{ all -> 0x033f }
            int r2 = r11.position()     // Catch:{ all -> 0x033f }
            r1 = 4
            int r2 = r2 / r1
            long r1 = (long) r2     // Catch:{ all -> 0x033f }
            long r4 = r4 + r1
            r6.A01 = r4     // Catch:{ all -> 0x033f }
        L_0x02fe:
            java.nio.ByteBuffer r1 = r8.A00     // Catch:{ all -> 0x033f }
            boolean r1 = r1.hasRemaining()     // Catch:{ all -> 0x033f }
            r1 = r1 ^ 1
            r1 = r1 ^ 1
            r0.A0A = r1     // Catch:{ all -> 0x033f }
            boolean r1 = r0.A03()     // Catch:{ all -> 0x033f }
            if (r1 != 0) goto L_0x031d
            boolean r1 = r9.BpL()     // Catch:{ all -> 0x033f }
            if (r1 == 0) goto L_0x031d
            android.os.Handler r0 = r0.A0E     // Catch:{ all -> 0x033f }
            r0.removeMessages(r7)     // Catch:{ all -> 0x033f }
            goto L_0x03cd
        L_0x031d:
            android.os.Handler r1 = r0.A0E     // Catch:{ all -> 0x033f }
            boolean r0 = r1.hasMessages(r7)     // Catch:{ all -> 0x033f }
            if (r0 != 0) goto L_0x03cd
            android.os.Message r0 = r1.obtainMessage(r7)     // Catch:{ all -> 0x033f }
            goto L_0x033a
        L_0x032a:
            r1 = 1
            r0.A00 = r1     // Catch:{ all -> 0x033f }
        L_0x032d:
            android.os.Handler r2 = r0.A0E     // Catch:{ all -> 0x033f }
            r1 = 2
            boolean r0 = r2.hasMessages(r1)     // Catch:{ all -> 0x033f }
            if (r0 != 0) goto L_0x03cd
            android.os.Message r0 = r2.obtainMessage(r1)     // Catch:{ all -> 0x033f }
        L_0x033a:
            r0.sendToTarget()     // Catch:{ all -> 0x033f }
            goto L_0x03cd
        L_0x033f:
            r2 = move-exception
            java.lang.Object r1 = r3.A00
            X.7kj r1 = (X.C158897kj) r1
            X.7VY r0 = new X.7VY
            r0.<init>()
            r0.A00(r2)
            r1.A01()     // Catch:{ all -> 0x03ca }
            goto L_0x03cd
        L_0x0350:
            java.lang.Object r5 = r3.A00
            X.7Zr r5 = (X.C152647Zr) r5
            int r1 = r4.what
            r0 = 1
            if (r1 != 0) goto L_0x0398
            java.util.concurrent.CopyOnWriteArraySet r0 = r5.A07
            java.util.Iterator r6 = r0.iterator()
        L_0x035f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0421
            java.lang.Object r4 = r6.next()
            X.7Wa r4 = (X.C151717Wa) r4
            X.8mZ r3 = r5.A04
            X.8le r2 = r5.A03
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x0389
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0389
            X.7VD r1 = r4.A00
            java.lang.Object r0 = r3.get()
            X.7VD r0 = (X.AnonymousClass7VD) r0
            r4.A00 = r0
            r0 = 0
            r4.A01 = r0
            java.lang.Object r0 = r4.A03
            r2.BGo(r1, r0)
        L_0x0389:
            X.8hJ r0 = r5.A02
            X.88l r0 = (X.C1692188l) r0
            r1 = 0
            android.os.Handler r0 = r0.A00
            boolean r0 = r0.hasMessages(r1)
            if (r0 == 0) goto L_0x035f
            goto L_0x0421
        L_0x0398:
            if (r1 != r0) goto L_0x0421
            int r1 = r4.arg1
            java.lang.Object r0 = r4.obj
            X.48s r0 = (X.C835148s) r0
            r5.A02(r0, r1)
            r5.A00()
            r5.A01()
            goto L_0x0421
        L_0x03aa:
            int r0 = r4.what
            if (r0 != 0) goto L_0x03cd
            java.lang.Object r3 = r3.A00
            X.7ko r3 = (X.C158937ko) r3
            java.lang.Object r2 = r4.obj
            X.7K0 r2 = (X.AnonymousClass7K0) r2
            java.lang.Object r1 = r3.A03
            monitor-enter(r1)
            X.7K0 r0 = r3.A00     // Catch:{ all -> 0x03c7 }
            if (r0 == r2) goto L_0x03c1
            X.7K0 r0 = r3.A01     // Catch:{ all -> 0x03c7 }
            if (r0 != r2) goto L_0x03c5
        L_0x03c1:
            r0 = 2
            r3.A06(r2, r0)     // Catch:{ all -> 0x03c7 }
        L_0x03c5:
            monitor-exit(r1)     // Catch:{ all -> 0x03c7 }
            goto L_0x0421
        L_0x03c7:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x03c7 }
            throw r0
        L_0x03ca:
            r0.A00(r2)
        L_0x03cd:
            r0 = 0
            return r0
        L_0x03cf:
            java.lang.Object r3 = r3.A00
            X.4xk r3 = (X.C97174xk) r3
            int r0 = r4.what
            r2 = 2
            r1 = 1
            if (r0 == r1) goto L_0x03dc
            if (r0 == r2) goto L_0x03dc
            goto L_0x0421
        L_0x03dc:
            android.os.Handler r0 = r3.A02
            r0.removeMessages(r1)
            r0.removeMessages(r2)
            r0 = 0
            com.whatsapp.voipcalling.CallInfo r1 = r3.A09(r0)
            if (r1 == 0) goto L_0x0421
            r0 = 0
            r3.A0F(r1, r0)
            goto L_0x0421
        L_0x03f0:
            java.lang.Object r1 = r3.A00
            com.whatsapp.calling.callgrid.view.VoipInCallNotifBanner r1 = (com.whatsapp.calling.callgrid.view.VoipInCallNotifBanner) r1
            int r0 = r4.what
            if (r0 != 0) goto L_0x0421
            r1.A01()
            goto L_0x0421
        L_0x03fc:
            java.lang.Object r2 = r3.A00
            X.4NC r2 = (X.AnonymousClass4NC) r2
            int r1 = r4.what
            r0 = 1
            if (r1 != r0) goto L_0x0421
            com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel r3 = r2.A02
            int r2 = r2.A00
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/OrientationViewModel/onOrientationListenerChanged "
            X.C18260x0.A0w(r0, r1, r2)
            X.4C1 r0 = r3.A07
            java.lang.Object r0 = r0.get()
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            if (r0 != 0) goto L_0x0421
            r3.A0D(r2)
        L_0x0421:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass91L.handleMessage(android.os.Message):boolean");
    }
}
