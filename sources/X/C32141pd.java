package X;

import java.util.Map;

/* renamed from: X.1pd  reason: invalid class name and case insensitive filesystem */
public class C32141pd extends C53272mp {
    public final C55682qk A00;
    public final C42802Po A01;
    public final C55892r5 A02;
    public final C61042zc A03;
    public final Map A04;

    public C32141pd(C55682qk r7, C42802Po r8, AnonymousClass1VX r9, AnonymousClass4FV r10, C60592yo r11, C55892r5 r12, C61042zc r13, Map map, Map map2) {
        super(r7, r9, r10, r11, map);
        this.A00 = r7;
        this.A02 = r12;
        this.A03 = r13;
        this.A01 = r8;
        this.A04 = map2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0291, code lost:
        if (r8.intValue() != 2) goto L_0x0293;
     */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.AnonymousClass36K r25) {
        /*
            r24 = this;
            java.lang.String r0 = "stream:error"
            r2 = r25
            boolean r0 = X.AnonymousClass36K.A0W(r2, r0)
            r7 = r24
            if (r0 == 0) goto L_0x0033
            X.2Po r5 = r7.A01
            X.2jr r0 = r5.A02
            boolean r0 = r0.A02()
            r8 = 0
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = "code"
            int r1 = r2.A0b(r0, r3)     // Catch:{ 24Y -> 0x0085 }
            r0 = 515(0x203, float:7.22E-43)
            if (r1 == r0) goto L_0x002b
            r0 = 516(0x204, float:7.23E-43)
            if (r1 != r0) goto L_0x005e
            r1 = 245(0xf5, float:3.43E-43)
            goto L_0x002d
        L_0x002b:
            r1 = 244(0xf4, float:3.42E-43)
        L_0x002d:
            X.2yo r0 = r5.A03     // Catch:{ 24Y -> 0x0085 }
            r0.A01(r2, r8, r1)     // Catch:{ 24Y -> 0x0085 }
            return
        L_0x0033:
            java.lang.String r0 = "error"
            boolean r0 = X.AnonymousClass36K.A0W(r2, r0)
            if (r0 == 0) goto L_0x0084
            java.lang.String r0 = "code"
            r3 = 0
            java.lang.String r1 = r2.A0r(r0, r3)
            java.lang.String r0 = "479"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0084
            X.2yo r1 = r7.A04
            java.lang.String r0 = "ConnectionThreadRequestsImpl/smax/invalid"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4Ag r2 = r1.A01
            r1 = 0
            r0 = 237(0xed, float:3.32E-43)
            android.os.Message r0 = android.os.Message.obtain(r3, r1, r0, r1)
            r2.Bfr(r0)
            return
        L_0x005e:
            X.2sr r0 = r5.A00
            boolean r0 = r0.A0Y()
            if (r0 == 0) goto L_0x008b
            java.lang.String r0 = "conflict"
            X.36K r0 = r2.A0l(r0)
            if (r0 == 0) goto L_0x008b
            java.lang.String r1 = X.AnonymousClass36K.A0K(r0)
            java.lang.String r0 = "device_removed"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008b
            java.lang.String r0 = "CompanionXmppReadInterceptorImpl/handleStreamError deregister"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.2dy r0 = r5.A01
            r0.A01(r8, r3, r4)
        L_0x0084:
            return
        L_0x0085:
            r1 = move-exception
            java.lang.String r0 = "CompanionConnectionInterceptor/handleStreamError"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x008b:
            java.lang.String r0 = "ack"
            X.36K r1 = r2.A0l(r0)
            if (r1 == 0) goto L_0x0255
            java.lang.String r0 = "id"
            java.lang.String r9 = r2.A0r(r0, r8)
            java.lang.String r0 = r1.A0r(r0, r8)
            if (r9 != 0) goto L_0x00a0
            r9 = r0
        L_0x00a0:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ErrorStanzaHandler/received ack-kick id="
            X.C18260x0.A0t(r0, r9, r1)
            X.1ay r5 = new X.1ay
            r5.<init>()
            X.2r5 r6 = r7.A02
            monitor-enter(r6)
            int[] r12 = r6.A07     // Catch:{ all -> 0x023a }
            int r11 = r12.length     // Catch:{ all -> 0x023a }
            r22 = 0
            r20 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
            r18 = 0
            r16 = 0
        L_0x00c0:
            if (r10 >= r11) goto L_0x0114
            r0 = r12[r10]     // Catch:{ all -> 0x023a }
            java.util.Map r1 = r6.A03(r0)     // Catch:{ all -> 0x023a }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x023a }
            r0.<init>(r1)     // Catch:{ all -> 0x023a }
            java.util.Iterator r15 = X.AnonymousClass001.A0u(r0)     // Catch:{ all -> 0x023a }
        L_0x00d1:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x023a }
            if (r0 == 0) goto L_0x0111
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r15)     // Catch:{ all -> 0x023a }
            java.lang.Object r3 = r0.getKey()     // Catch:{ all -> 0x023a }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x023a }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x023a }
            X.2rb r1 = (X.C56202rb) r1     // Catch:{ all -> 0x023a }
            if (r1 == 0) goto L_0x00d1
            r13 = 1
            long r22 = r22 + r13
            java.lang.Integer r0 = r1.A0A     // Catch:{ all -> 0x023a }
            if (r0 == 0) goto L_0x00f9
            int r0 = r0.intValue()     // Catch:{ all -> 0x023a }
            if (r0 <= 0) goto L_0x00f9
            long r18 = r18 + r13
        L_0x00f9:
            if (r9 == 0) goto L_0x00d1
            java.lang.String r0 = r1.A0C     // Catch:{ all -> 0x023a }
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x023a }
            if (r0 == 0) goto L_0x00d1
            long r16 = r16 + r13
            long r3 = r3.longValue()     // Catch:{ all -> 0x023a }
            int r0 = (r20 > r3 ? 1 : (r20 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d1
            r20 = r3
            r8 = r1
            goto L_0x00d1
        L_0x0111:
            int r10 = r10 + 1
            goto L_0x00c0
        L_0x0114:
            java.lang.Long r0 = java.lang.Long.valueOf(r22)     // Catch:{ all -> 0x023a }
            r5.A05 = r0     // Catch:{ all -> 0x023a }
            java.lang.Long r0 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x023a }
            r5.A04 = r0     // Catch:{ all -> 0x023a }
            java.lang.Long r0 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x023a }
            r5.A07 = r0     // Catch:{ all -> 0x023a }
            if (r8 == 0) goto L_0x01b7
            int r0 = r8.A02     // Catch:{ all -> 0x023a }
            java.util.Map r0 = r6.A03(r0)     // Catch:{ all -> 0x023a }
            int r0 = r0.size()     // Catch:{ all -> 0x023a }
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)     // Catch:{ all -> 0x023a }
            r5.A06 = r0     // Catch:{ all -> 0x023a }
            long r3 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x023a }
            long r0 = r8.A04     // Catch:{ all -> 0x023a }
            java.lang.Long r0 = X.C18310x6.A0f(r3, r0)     // Catch:{ all -> 0x023a }
            r5.A09 = r0     // Catch:{ all -> 0x023a }
            java.lang.Integer r0 = r8.A0A     // Catch:{ all -> 0x023a }
            if (r0 == 0) goto L_0x014e
            java.lang.Long r0 = X.C18280x3.A0U(r0)     // Catch:{ all -> 0x023a }
            r5.A08 = r0     // Catch:{ all -> 0x023a }
        L_0x014e:
            boolean r0 = r8 instanceof X.C28261gT     // Catch:{ all -> 0x023a }
            if (r0 == 0) goto L_0x0167
            X.1gT r8 = (X.C28261gT) r8     // Catch:{ all -> 0x023a }
            java.lang.Integer r0 = X.C18280x3.A0S()     // Catch:{ all -> 0x023a }
            r5.A03 = r0     // Catch:{ all -> 0x023a }
            int r0 = r8.A05     // Catch:{ all -> 0x023a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x023a }
            r5.A02 = r0     // Catch:{ all -> 0x023a }
            java.lang.String r0 = r8.A07     // Catch:{ all -> 0x023a }
            r5.A0B = r0     // Catch:{ all -> 0x023a }
            goto L_0x01b7
        L_0x0167:
            boolean r0 = r8 instanceof X.AnonymousClass1gR     // Catch:{ all -> 0x023a }
            if (r0 == 0) goto L_0x018a
            X.1gR r8 = (X.AnonymousClass1gR) r8     // Catch:{ all -> 0x023a }
            java.lang.Integer r0 = X.C18290x4.A0b()     // Catch:{ all -> 0x023a }
            r5.A03 = r0     // Catch:{ all -> 0x023a }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x023a }
            java.lang.String r0 = r8.A01     // Catch:{ all -> 0x023a }
            r1.append(r0)     // Catch:{ all -> 0x023a }
            java.lang.String r0 = "/"
            r1.append(r0)     // Catch:{ all -> 0x023a }
            java.lang.String r0 = r8.A00     // Catch:{ all -> 0x023a }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x023a }
            r5.A0A = r0     // Catch:{ all -> 0x023a }
            goto L_0x01b7
        L_0x018a:
            boolean r0 = r8 instanceof X.AnonymousClass1gS     // Catch:{ all -> 0x023a }
            if (r0 == 0) goto L_0x01a7
            X.1gS r8 = (X.AnonymousClass1gS) r8     // Catch:{ all -> 0x023a }
            java.lang.Integer r0 = X.AnonymousClass001.A0f()     // Catch:{ all -> 0x023a }
            r5.A03 = r0     // Catch:{ all -> 0x023a }
            int r0 = r8.A00     // Catch:{ all -> 0x023a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x023a }
            r5.A01 = r0     // Catch:{ all -> 0x023a }
            int r0 = r8.A03     // Catch:{ all -> 0x023a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x023a }
            r5.A02 = r0     // Catch:{ all -> 0x023a }
            goto L_0x01b7
        L_0x01a7:
            X.1gU r8 = (X.AnonymousClass1gU) r8     // Catch:{ all -> 0x023a }
            java.lang.Integer r0 = X.C18290x4.A0a()     // Catch:{ all -> 0x023a }
            r5.A03 = r0     // Catch:{ all -> 0x023a }
            int r0 = r8.A00     // Catch:{ all -> 0x023a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x023a }
            r5.A00 = r0     // Catch:{ all -> 0x023a }
        L_0x01b7:
            monitor-exit(r6)
            X.4FV r0 = r7.A03
            r0.BhB(r5)
            X.2zc r3 = r7.A03
            long r0 = android.os.SystemClock.uptimeMillis()
            r3.A01 = r0
            if (r9 == 0) goto L_0x0255
            java.lang.Integer r8 = r5.A03
            if (r8 == 0) goto L_0x023d
            int r1 = r8.intValue()
            r0 = 2
            if (r1 != r0) goto L_0x023d
            r12 = 0
            java.util.HashSet r5 = X.AnonymousClass002.A0K()
            monitor-enter(r6)
            java.util.Map r4 = r6.A06     // Catch:{ all -> 0x023a }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x023a }
            r0.<init>(r4)     // Catch:{ all -> 0x023a }
            monitor-exit(r6)
            java.util.Iterator r3 = X.C18290x4.A10(r0)
        L_0x01e4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0200
            java.lang.Object r1 = r3.next()
            X.1gT r1 = (X.C28261gT) r1
            java.lang.String r0 = r1.A0C
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x01e4
            java.util.Set r0 = r1.A03
            if (r0 == 0) goto L_0x01e4
            r5.addAll(r0)
            goto L_0x01e4
        L_0x0200:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0207
            r5 = r12
        L_0x0207:
            monitor-enter(r6)
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x023a }
            r0.<init>(r4)     // Catch:{ all -> 0x023a }
            monitor-exit(r6)
            java.util.Iterator r13 = X.C18290x4.A10(r0)
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4 = 0
        L_0x0218:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0235
            java.lang.Object r6 = r13.next()
            X.1gT r6 = (X.C28261gT) r6
            long r0 = r6.A03
            java.lang.String r3 = r6.A0C
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x0218
            int r3 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0218
            r12 = r6
            r10 = r0
            goto L_0x0218
        L_0x0235:
            if (r12 == 0) goto L_0x023f
            java.lang.String r4 = r12.A02
            goto L_0x023f
        L_0x023a:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x023d:
            r5 = 0
            r4 = r5
        L_0x023f:
            java.util.Map r10 = r7.A04
            boolean r0 = r10.containsKey(r9)
            if (r0 != 0) goto L_0x0280
            boolean r0 = r10.containsKey(r4)
            if (r0 != 0) goto L_0x0280
            r10.put(r9, r5)
            if (r4 == 0) goto L_0x0255
            r10.put(r4, r5)
        L_0x0255:
            X.2yo r5 = r7.A04
            X.36K[] r1 = r2.A03
            r4 = 0
            if (r1 == 0) goto L_0x027d
            int r0 = r1.length
            if (r0 <= 0) goto L_0x027d
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/stream/error "
            r3.append(r0)
            r1 = r1[r4]
            java.lang.String r0 = r1.A00
            X.AnonymousClass0x2.A1N(r3, r0)
            byte[] r0 = r1.A01
            java.lang.String r0 = java.util.Arrays.toString(r0)
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r3)
        L_0x0279:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x02ea
        L_0x027d:
            java.lang.String r0 = "ConnectionThreadRequestsImpl/stream/error"
            goto L_0x0279
        L_0x0280:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ErrorStanzaHandler/received multiple ack-kick for id="
            X.C18260x0.A0t(r0, r9, r1)
            if (r8 == 0) goto L_0x0293
            int r3 = r8.intValue()
            r1 = 2
            r0 = 1
            if (r3 == r1) goto L_0x0294
        L_0x0293:
            r0 = 0
        L_0x0294:
            r6 = 0
            if (r0 == 0) goto L_0x02a4
            if (r4 == 0) goto L_0x029a
            r9 = r4
        L_0x029a:
            java.lang.Object r0 = r10.put(r9, r5)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r5 != 0) goto L_0x02da
            if (r0 != 0) goto L_0x02e6
        L_0x02a4:
            java.lang.String r0 = "multi-kick-"
        L_0x02a7:
            X.2qk r5 = r7.A00
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0l(r0)
            java.lang.String r3 = "unknown"
            if (r8 == 0) goto L_0x02bb
            int r1 = r8.intValue()
            r0 = 1
            if (r1 != r0) goto L_0x02c6
            java.lang.String r3 = "message"
        L_0x02bb:
            java.lang.String r1 = X.AnonymousClass000.A0X(r3, r4)
            java.lang.String r0 = "unacked-stanza"
            r5.A0A(r0, r6, r1)
            goto L_0x0255
        L_0x02c6:
            r0 = 2
            if (r1 != r0) goto L_0x02cd
            java.lang.String r3 = "receipt"
            goto L_0x02bb
        L_0x02cd:
            r0 = 4
            if (r1 != r0) goto L_0x02d4
            java.lang.String r3 = "notification"
            goto L_0x02bb
        L_0x02d4:
            r0 = 3
            if (r1 != r0) goto L_0x02bb
            java.lang.String r3 = "call"
            goto L_0x02bb
        L_0x02da:
            if (r0 == 0) goto L_0x02e6
            boolean r0 = java.util.Collections.disjoint(r5, r0)
            r0 = r0 ^ 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x02a4
        L_0x02e6:
            java.lang.String r0 = "multi-kick-fp-"
            goto L_0x02a7
        L_0x02ea:
            java.lang.String r0 = "code"
            int r4 = r2.A0b(r0, r4)     // Catch:{ 24Y -> 0x0305 }
            X.4Ag r3 = r5.A01     // Catch:{ 24Y -> 0x0305 }
            r0 = 158(0x9e, float:2.21E-43)
            android.os.Message r2 = X.AnonymousClass0x7.A0G(r0)     // Catch:{ 24Y -> 0x0305 }
            android.os.Bundle r1 = r2.getData()     // Catch:{ 24Y -> 0x0305 }
            java.lang.String r0 = "errorCode"
            r1.putInt(r0, r4)     // Catch:{ 24Y -> 0x0305 }
            r3.Bfr(r2)     // Catch:{ 24Y -> 0x0305 }
            return
        L_0x0305:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32141pd.A00(X.36K):void");
    }
}
