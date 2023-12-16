package X;

/* renamed from: X.3Qh  reason: invalid class name and case insensitive filesystem */
public final class C67693Qh implements AnonymousClass4DA {
    public final C29021i9 A00;
    public final C55492qR A01;
    public final AnonymousClass33p A02;
    public final C621133n A03;
    public final C48972fm A04;
    public final C614730x A05;
    public final C50442iB A06;
    public final AnonymousClass4FS A07;
    public final boolean A08;

    public int[] B81() {
        return new int[]{74, 75, 76, 77, 78, 196, 82, 83, 84};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:143:0x030a, code lost:
        r4.BkM(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x030d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0317, code lost:
        X.C48972fm.A02(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x031a, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BFA(android.os.Message r14, int r15) {
        /*
            r13 = this;
            r1 = 196(0xc4, float:2.75E-43)
            java.lang.String r5 = "errorCode"
            r0 = 1
            r9 = r13
            if (r15 == r1) goto L_0x031b
            r4 = 0
            switch(r15) {
                case 74: goto L_0x0105;
                case 75: goto L_0x02ec;
                case 76: goto L_0x0164;
                case 77: goto L_0x009e;
                case 78: goto L_0x024d;
                default: goto L_0x000c;
            }
        L_0x000c:
            switch(r15) {
                case 82: goto L_0x0041;
                case 83: goto L_0x0010;
                case 84: goto L_0x0035;
                default: goto L_0x000f;
            }
        L_0x000f:
            return r4
        L_0x0010:
            java.lang.String r1 = "prekey digest none"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.1i9 r1 = r13.A00
            r1.A0A()
            boolean r1 = r13.A08
            if (r1 == 0) goto L_0x002a
            X.4FS r4 = r13.A07
            r1 = 47
            X.3Zn r3 = new X.3Zn
            r3.<init>(r13, r1)
            goto L_0x030a
        L_0x002a:
            X.2fm r4 = r13.A04
            r1 = 48
            X.3Zn r3 = new X.3Zn
            r3.<init>(r13, r1)
            goto L_0x0317
        L_0x0035:
            java.lang.String r1 = "prekey digest server error"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.1i9 r1 = r13.A00
            r1.A0A()
            return r0
        L_0x0041:
            java.lang.Object r5 = r14.obj
            android.os.Bundle r5 = (android.os.Bundle) r5
            java.lang.String r1 = "registration"
            byte[] r6 = r5.getByteArray(r1)
            java.lang.String r1 = "type"
            byte r11 = r5.getByte(r1)
            java.lang.String r1 = "signedKeyId"
            byte[] r8 = r5.getByteArray(r1)
            java.lang.String r1 = "keyIds"
            java.io.Serializable r4 = r5.getSerializable(r1)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            if (r4 != 0) goto L_0x0085
            r10 = 0
        L_0x0065:
            java.lang.String r1 = "hash"
            byte[] r7 = r5.getByteArray(r1)
            java.lang.String r1 = "checking prekey digest"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.1i9 r1 = r13.A00
            r1.A0A()
            boolean r1 = r13.A08
            if (r1 == 0) goto L_0x0092
            X.4FS r1 = r13.A07
            r12 = 2
            X.3cA r5 = new X.3cA
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r1.BkM(r5)
            return r0
        L_0x0085:
            int r3 = r4.length
            byte[][] r10 = new byte[r3][]
            r2 = 0
        L_0x0089:
            if (r2 >= r3) goto L_0x0065
            r1 = r4[r2]
            r10[r2] = r1
            int r2 = r2 + 1
            goto L_0x0089
        L_0x0092:
            X.2fm r1 = r13.A04
            r12 = 3
            X.3cA r5 = new X.3cA
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            X.C48972fm.A02(r1, r5)
            return r0
        L_0x009e:
            X.1i9 r4 = r13.A00
            monitor-enter(r4)
            java.lang.String r1 = "prekey set successful"
            java.util.Iterator r2 = X.C61102zi.A04(r4, r1)     // Catch:{ all -> 0x0161 }
            boolean r1 = r2.hasNext()     // Catch:{ all -> 0x0161 }
            if (r1 == 0) goto L_0x00b9
            r2.next()     // Catch:{ all -> 0x0161 }
            java.lang.String r0 = "onSetPreKeySuccess"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)     // Catch:{ all -> 0x0161 }
            throw r0     // Catch:{ all -> 0x0161 }
        L_0x00b9:
            X.2Ov[] r5 = r4.A04     // Catch:{ all -> 0x0161 }
            r1 = 0
            r4.A04 = r1     // Catch:{ all -> 0x0161 }
            X.2sr r1 = r4.A09     // Catch:{ all -> 0x0161 }
            boolean r1 = r1.A0Y()     // Catch:{ all -> 0x0161 }
            if (r1 == 0) goto L_0x00e3
            X.33p r1 = r4.A0D     // Catch:{ all -> 0x0161 }
            boolean r1 = r1.A2K()     // Catch:{ all -> 0x0161 }
            if (r1 == 0) goto L_0x00e3
            X.2by r7 = r4.A0B     // Catch:{ all -> 0x0161 }
            java.lang.String r1 = "CompanionRegistrationLogger/logRegistrationComplete"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0161 }
            r8 = 5
            r10 = 0
            X.4FS r1 = r7.A05     // Catch:{ all -> 0x0161 }
            r9 = 4
            X.3aD r6 = new X.3aD     // Catch:{ all -> 0x0161 }
            r6.<init>(r7, r8, r9, r10)     // Catch:{ all -> 0x0161 }
            r1.BkM(r6)     // Catch:{ all -> 0x0161 }
        L_0x00e3:
            X.33n r1 = r4.A0E     // Catch:{ all -> 0x0161 }
            boolean r1 = r1.A0X()     // Catch:{ all -> 0x0161 }
            if (r1 == 0) goto L_0x00f6
            X.4FS r2 = r4.A0J     // Catch:{ all -> 0x0161 }
            r1 = 23
            X.C70173a4.A00(r2, r5, r4, r1)     // Catch:{ all -> 0x0161 }
        L_0x00f2:
            r4.A0D()     // Catch:{ all -> 0x0161 }
            goto L_0x0103
        L_0x00f6:
            X.2fm r3 = r4.A0F     // Catch:{ all -> 0x0161 }
            r2 = 24
            X.3a4 r1 = new X.3a4     // Catch:{ all -> 0x0161 }
            r1.<init>(r5, r2, r4)     // Catch:{ all -> 0x0161 }
            X.C48972fm.A02(r3, r1)     // Catch:{ all -> 0x0161 }
            goto L_0x00f2
        L_0x0103:
            monitor-exit(r4)
            return r0
        L_0x0105:
            java.lang.Object r5 = r14.obj
            java.util.List r5 = (java.util.List) r5
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "RecvPreKeyMessageListener/onGetPreKeySuccess Schedule processing of prekeys. Count = "
            X.C18260x0.A1C(r1, r2, r5)
            X.2qR r4 = r13.A01
            monitor-enter(r4)
            X.1VX r3 = r4.A05     // Catch:{ all -> 0x0161 }
            X.2vE r2 = X.C58422vE.A01     // Catch:{ all -> 0x0161 }
            r1 = 767(0x2ff, float:1.075E-42)
            int r2 = r3.A0O(r2, r1)     // Catch:{ all -> 0x0161 }
            monitor-exit(r4)
            if (r2 <= 0) goto L_0x0139
            int r1 = r5.size()
            if (r1 < r2) goto L_0x0139
            boolean r1 = r13.A08
            if (r1 == 0) goto L_0x0142
            X.4FS r3 = r13.A07
            r2 = 10
        L_0x0130:
            X.3Zy r1 = new X.3Zy
            r1.<init>(r13, r2, r5)
            r3.BkP(r1)
            return r0
        L_0x0139:
            boolean r1 = r13.A08
            if (r1 == 0) goto L_0x0156
            X.4FS r3 = r13.A07
            r2 = 12
            goto L_0x0130
        L_0x0142:
            X.2fm r4 = r13.A04
            r1 = 11
            X.3Zy r3 = new X.3Zy
            r3.<init>(r13, r1, r5)
            java.util.concurrent.ThreadPoolExecutor r2 = r4.A00
            X.5sI r1 = new X.5sI
            r1.<init>(r4, r3)
            r2.execute(r1)
            return r0
        L_0x0156:
            X.2fm r4 = r13.A04
            r1 = 13
            X.3Zy r3 = new X.3Zy
            r3.<init>(r13, r1, r5)
            goto L_0x0317
        L_0x0161:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0164:
            java.lang.Object r8 = r14.obj
            android.os.BaseBundle r8 = (android.os.BaseBundle) r8
            java.lang.String r1 = "jids"
            java.lang.String[] r1 = r8.getStringArray(r1)
            if (r1 != 0) goto L_0x0184
            r1 = 0
        L_0x0171:
            X.C626936e.A06(r1)
            int r11 = r1.length
            com.whatsapp.jid.DeviceJid[] r6 = new com.whatsapp.jid.DeviceJid[r11]
        L_0x0177:
            if (r4 >= r11) goto L_0x01b2
            r2 = r1[r4]
            com.whatsapp.jid.DeviceJid r2 = com.whatsapp.jid.DeviceJid.of(r2)
            r6[r4] = r2
            int r4 = r4 + 1
            goto L_0x0177
        L_0x0184:
            java.util.List r2 = java.util.Arrays.asList(r1)
            int r1 = r1.length
            java.util.ArrayList r3 = X.AnonymousClass002.A0I(r1)
            if (r2 == 0) goto L_0x01a9
            java.util.Iterator r2 = r2.iterator()
        L_0x0193:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x01a9
            java.lang.String r1 = X.AnonymousClass001.A0m(r2)
            if (r1 == 0) goto L_0x0193
            com.whatsapp.jid.Jid r1 = X.AnonymousClass32W.A00(r1)
            if (r1 == 0) goto L_0x0193
            r3.add(r1)
            goto L_0x0193
        L_0x01a9:
            com.whatsapp.jid.Jid[] r1 = new com.whatsapp.jid.Jid[r4]
            java.lang.Object[] r1 = r3.toArray(r1)
            com.whatsapp.jid.Jid[] r1 = (com.whatsapp.jid.Jid[]) r1
            goto L_0x0171
        L_0x01b2:
            X.2iB r7 = r13.A06
            int r8 = r8.getInt(r5)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "prekey request failed; jid="
            r2.append(r1)
            X.C18320x8.A1P(r2, r6)
            java.lang.String r1 = "; errorCode="
            X.C18260x0.A0y(r1, r2, r8)
            X.2qR r9 = r7.A02
            monitor-enter(r9)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x024a }
            java.lang.String r1 = "prekeysmanager/onGetPreKeyError:"
            r2.append(r1)     // Catch:{ all -> 0x024a }
            java.lang.String r1 = java.util.Arrays.toString(r6)     // Catch:{ all -> 0x024a }
            X.C18260x0.A1K(r2, r1)     // Catch:{ all -> 0x024a }
            r10 = 0
        L_0x01df:
            r5 = 600(0x258, float:8.41E-43)
            r4 = 500(0x1f4, float:7.0E-43)
            if (r10 >= r11) goto L_0x01fd
            r3 = r6[r10]     // Catch:{ all -> 0x024a }
            java.util.Map r1 = r9.A08     // Catch:{ all -> 0x024a }
            java.lang.Object r2 = r1.remove(r3)     // Catch:{ all -> 0x024a }
            X.2Qn r2 = (X.C43042Qn) r2     // Catch:{ all -> 0x024a }
            if (r4 > r8) goto L_0x01fa
            if (r8 >= r5) goto L_0x01fa
            if (r2 == 0) goto L_0x01fa
            java.util.Map r1 = r9.A09     // Catch:{ all -> 0x024a }
            r1.put(r3, r2)     // Catch:{ all -> 0x024a }
        L_0x01fa:
            int r10 = r10 + 1
            goto L_0x01df
        L_0x01fd:
            if (r4 > r8) goto L_0x0229
            if (r8 >= r5) goto L_0x0229
            boolean r1 = r9.A01     // Catch:{ all -> 0x024a }
            if (r1 == 0) goto L_0x0211
            boolean r1 = r9.A00     // Catch:{ all -> 0x024a }
            if (r1 != 0) goto L_0x0229
            java.util.Map r1 = r9.A08     // Catch:{ all -> 0x024a }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x024a }
            if (r1 == 0) goto L_0x0229
        L_0x0211:
            r9.A01 = r0     // Catch:{ all -> 0x024a }
            r9.A00 = r0     // Catch:{ all -> 0x024a }
            X.2pM r1 = r9.A07     // Catch:{ all -> 0x024a }
            long r4 = r1.A01()     // Catch:{ all -> 0x024a }
            r1 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r1
            android.os.Handler r3 = r9.A02     // Catch:{ all -> 0x024a }
            r2 = 4
            X.3Zq r1 = new X.3Zq     // Catch:{ all -> 0x024a }
            r1.<init>(r9, r2)     // Catch:{ all -> 0x024a }
            r3.postDelayed(r1, r4)     // Catch:{ all -> 0x024a }
        L_0x0229:
            monitor-exit(r9)
            r1 = 406(0x196, float:5.69E-43)
            boolean r2 = X.AnonymousClass000.A1U(r8, r1)
            boolean r1 = r7.A0A
            if (r1 == 0) goto L_0x023f
            X.4FS r4 = r7.A09
            r1 = 33
            X.5sI r3 = new X.5sI
            r3.<init>(r7, r6, r1, r2)
            goto L_0x030a
        L_0x023f:
            X.2fm r4 = r7.A06
            r1 = 34
            X.5sI r3 = new X.5sI
            r3.<init>(r7, r6, r1, r2)
            goto L_0x0317
        L_0x024a:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x024d:
            java.lang.Object r1 = r14.obj
            android.os.BaseBundle r1 = (android.os.BaseBundle) r1
            int r6 = r1.getInt(r5)
            X.1i9 r7 = r13.A00
            monitor-enter(r7)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x02e9 }
            java.lang.String r1 = "prekey set failed: "
            X.C18260x0.A0w(r1, r2, r6)     // Catch:{ all -> 0x02e9 }
            java.util.Iterator r2 = X.C61102zi.A03(r7)     // Catch:{ all -> 0x02e9 }
            boolean r1 = r2.hasNext()     // Catch:{ all -> 0x02e9 }
            if (r1 == 0) goto L_0x0277
            r2.next()     // Catch:{ all -> 0x02e9 }
            java.lang.String r0 = "onSetPreKeyError"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)     // Catch:{ all -> 0x02e9 }
            throw r0     // Catch:{ all -> 0x02e9 }
        L_0x0277:
            r1 = 0
            r7.A04 = r1     // Catch:{ all -> 0x02e9 }
            r1 = 0
            r7.A0E(r1)     // Catch:{ all -> 0x02e9 }
            X.2sr r1 = r7.A09     // Catch:{ all -> 0x02e9 }
            boolean r1 = r1.A0Y()     // Catch:{ all -> 0x02e9 }
            if (r1 == 0) goto L_0x0296
            X.33p r1 = r7.A0D     // Catch:{ all -> 0x02e9 }
            boolean r1 = r1.A2K()     // Catch:{ all -> 0x02e9 }
            if (r1 == 0) goto L_0x0296
            X.2by r5 = r7.A0B     // Catch:{ all -> 0x02e9 }
            r3 = 4
            long r1 = (long) r6     // Catch:{ all -> 0x02e9 }
            r5.A00(r3, r1)     // Catch:{ all -> 0x02e9 }
        L_0x0296:
            r1 = 406(0x196, float:5.69E-43)
            if (r6 != r1) goto L_0x02c1
            java.lang.String r1 = "failed to set prekeys; regenerating keys; errorCode=406"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x02e9 }
            X.33n r1 = r7.A0E     // Catch:{ all -> 0x02e9 }
            boolean r1 = r1.A0X()     // Catch:{ all -> 0x02e9 }
            if (r1 == 0) goto L_0x02b4
            X.4FS r3 = r7.A0J     // Catch:{ all -> 0x02e9 }
            r2 = 49
            X.5sG r1 = new X.5sG     // Catch:{ all -> 0x02e9 }
            r1.<init>((java.lang.Object) r7, (int) r2)     // Catch:{ all -> 0x02e9 }
            r3.BkM(r1)     // Catch:{ all -> 0x02e9 }
            goto L_0x02e7
        L_0x02b4:
            X.2fm r3 = r7.A0F     // Catch:{ all -> 0x02e9 }
            r2 = 49
            X.5sG r1 = new X.5sG     // Catch:{ all -> 0x02e9 }
            r1.<init>((java.lang.Object) r7, (int) r2)     // Catch:{ all -> 0x02e9 }
            X.C48972fm.A02(r3, r1)     // Catch:{ all -> 0x02e9 }
            goto L_0x02e7
        L_0x02c1:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x02e9 }
            java.lang.String r1 = "failed to set prekeys; will try again on next xmpp connect; errorCode="
            X.C18260x0.A0x(r1, r2, r6)     // Catch:{ all -> 0x02e9 }
            r1 = 500(0x1f4, float:7.0E-43)
            if (r6 < r1) goto L_0x02e7
            r1 = 600(0x258, float:8.41E-43)
            if (r6 >= r1) goto L_0x02e7
            r7.A03 = r0     // Catch:{ all -> 0x02e9 }
            X.3Wi r6 = r7.A08     // Catch:{ all -> 0x02e9 }
            X.3Zq r5 = new X.3Zq     // Catch:{ all -> 0x02e9 }
            r5.<init>(r7, r4)     // Catch:{ all -> 0x02e9 }
            X.2pM r1 = r7.A0I     // Catch:{ all -> 0x02e9 }
            long r3 = r1.A01()     // Catch:{ all -> 0x02e9 }
            r1 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r1
            r6.A0T(r5, r3)     // Catch:{ all -> 0x02e9 }
        L_0x02e7:
            monitor-exit(r7)
            return r0
        L_0x02e9:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x02ec:
            java.lang.Object r2 = r14.obj
            android.os.BaseBundle r2 = (android.os.BaseBundle) r2
            java.lang.String r1 = "jid"
            java.lang.String r1 = r2.getString(r1)
            com.whatsapp.jid.Jid r2 = X.AnonymousClass32W.A00(r1)
            X.C626936e.A06(r2)
            boolean r1 = r13.A08
            if (r1 == 0) goto L_0x030e
            X.4FS r4 = r13.A07
            r1 = 14
            X.3Zy r3 = new X.3Zy
            r3.<init>(r13, r1, r2)
        L_0x030a:
            r4.BkM(r3)
            return r0
        L_0x030e:
            X.2fm r4 = r13.A04
            r1 = 15
            X.3Zy r3 = new X.3Zy
            r3.<init>(r13, r1, r2)
        L_0x0317:
            X.C48972fm.A02(r4, r3)
            return r0
        L_0x031b:
            java.lang.Object r2 = r14.obj
            android.os.BaseBundle r2 = (android.os.BaseBundle) r2
            r2.getInt(r5)
            java.lang.String r1 = "errorText"
            r2.getString(r1)
            X.1i9 r1 = r13.A00
            monitor-enter(r1)
            monitor-exit(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67693Qh.BFA(android.os.Message, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0024, code lost:
        if (r9.A0Y(r1, 1885) == false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C67693Qh(X.C29021i9 r3, X.C55492qR r4, X.AnonymousClass33p r5, X.C621133n r6, X.C48972fm r7, X.C614730x r8, X.AnonymousClass1VX r9, X.C50442iB r10, X.AnonymousClass4FS r11) {
        /*
            r2 = this;
            r2.<init>()
            r2.A07 = r11
            r2.A05 = r8
            r2.A04 = r7
            r2.A00 = r3
            r2.A03 = r6
            r2.A02 = r5
            r2.A06 = r10
            r2.A01 = r4
            r0 = 2232(0x8b8, float:3.128E-42)
            X.2vE r1 = X.C58422vE.A02
            boolean r0 = r9.A0Y(r1, r0)
            if (r0 == 0) goto L_0x0026
            r0 = 1885(0x75d, float:2.641E-42)
            boolean r1 = r9.A0Y(r1, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            r2.A08 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67693Qh.<init>(X.1i9, X.2qR, X.33p, X.33n, X.2fm, X.30x, X.1VX, X.2iB, X.4FS):void");
    }
}
