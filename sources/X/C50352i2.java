package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2i2  reason: invalid class name and case insensitive filesystem */
public final class C50352i2 {
    public final C56972sr A00;
    public final C56642sK A01;
    public final C47922e3 A02;
    public final AnonymousClass2Y3 A03;
    public final C48562f6 A04;
    public final C59652xG A05;
    public final AnonymousClass1VX A06;
    public final C66383Le A07;
    public final C614030o A08;

    public final C35371wl A00(UserJid userJid) {
        AnonymousClass2K8 A042;
        Long l = null;
        AnonymousClass1VX r5 = this.A06;
        C58422vE r4 = C58422vE.A02;
        if (!r5.A0Y(r4, 4991) || (A042 = this.A01.A04(userJid)) == null) {
            return null;
        }
        C35371wl r1 = new C35371wl(A042.A01, 3);
        if (r5.A0Y(r4, 4992)) {
            l = A042.A00;
        }
        return new C35371wl(r1, l);
    }

    /* JADX WARNING: type inference failed for: r5v15, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0566, code lost:
        if (r1.equals(r13) == false) goto L_0x0373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ae, code lost:
        if (r23 == 78) goto L_0x01b0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0230 A[Catch:{ Exception -> 0x0256 }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02db A[LOOP:2: B:154:0x02d5->B:156:0x02db, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01a3  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C35331wh A01(X.C624134x r41, java.lang.String r42) {
        /*
            r40 = this;
            r11 = 0
            r2 = r41
            r12 = r42
            boolean r10 = X.AnonymousClass0x2.A1Y(r2, r12)
            byte r0 = r2.A1I
            r23 = r0
            boolean r5 = X.C627636p.A0J(r23)
            r39 = 0
            if (r5 == 0) goto L_0x002c
            java.lang.String r0 = "media_viewer"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x002c
            r0 = r2
            X.4DU r0 = (X.AnonymousClass4DU) r0
            int r1 = r0.BEM()
            if (r1 == r10) goto L_0x056a
            r0 = 2
            if (r1 != r0) goto L_0x002c
            java.lang.String r39 = "view_once_expired"
        L_0x002c:
            java.lang.String r4 = "Error creating protobuf"
            r3 = r40
            X.2f6 r0 = r3.A04
            r0.A01(r2)
            r1 = 12
            r13 = 0
            r0 = r23
            if (r0 != r1) goto L_0x0357
            byte[] r4 = r2.A1u()
            if (r4 != 0) goto L_0x0044
            byte[] r4 = new byte[r11]
        L_0x0044:
            r0 = r2
            X.1mJ r0 = (X.C30351mJ) r0
            int r1 = r0.A01
            if (r1 == 0) goto L_0x035f
            r0 = 2
            if (r1 == r0) goto L_0x035f
            java.lang.Long r1 = X.AnonymousClass0x9.A0m(r1)
            X.1wz r0 = new X.1wz
            r0.<init>(r1)
        L_0x0057:
            X.1wW r1 = new X.1wW
            r1.<init>(r0, r13, r4)
        L_0x005c:
            boolean r4 = X.C627636p.A0g(r2)
            r0 = 0
            if (r4 == 0) goto L_0x0353
            r5 = 27
            X.1wk r22 = new X.1wk
            r4 = r22
            r4.<init>((int) r5)
        L_0x006c:
            r5 = 15
            r4 = r23
            if (r4 != r5) goto L_0x0342
            r5 = 4
            X.1wl r21 = new X.1wl
            r4 = r21
            r4.<init>((int) r5)
        L_0x007a:
            r20 = r0
        L_0x007c:
            X.1wl r19 = new X.1wl
            r4 = r19
            r4.<init>((int) r11)
            r5 = 64
            int r4 = r2.A0A
            r4 = r4 & 64
            boolean r4 = X.AnonymousClass000.A1U(r4, r5)
            if (r4 != 0) goto L_0x0091
            r19 = r0
        L_0x0091:
            X.1wl r18 = new X.1wl
            r4 = r18
            r4.<init>((int) r10)
            r5 = 4
            int r4 = r2.A0A
            r4 = r4 & 4
            boolean r4 = X.AnonymousClass000.A1U(r4, r5)
            if (r4 != 0) goto L_0x00a5
            r18 = r0
        L_0x00a5:
            r5 = 2
            X.1wl r17 = new X.1wl
            r4 = r17
            r4.<init>((int) r5)
            int r4 = r2.A0A
            r4 = r4 & 2
            boolean r4 = X.AnonymousClass000.A1U(r4, r5)
            if (r4 != 0) goto L_0x00b9
            r17 = r0
        L_0x00b9:
            r5 = 8
            int r4 = r2.A0A
            r4 = r4 & 8
            boolean r4 = X.AnonymousClass000.A1U(r4, r5)
            if (r4 != 0) goto L_0x030d
            boolean r4 = r2 instanceof X.AnonymousClass4FG
            if (r4 != 0) goto L_0x030d
            boolean r4 = r2 instanceof X.C30791n7
            if (r4 != 0) goto L_0x030d
        L_0x00cd:
            r16 = r0
        L_0x00cf:
            r5 = 8
            int r4 = r2.A0A
            r4 = r4 & 8
            boolean r4 = X.AnonymousClass000.A1U(r4, r5)
            r15 = 0
            if (r4 != 0) goto L_0x0201
            boolean r4 = r2 instanceof X.AnonymousClass4FG
            if (r4 != 0) goto L_0x0201
            boolean r4 = r2 instanceof X.C30791n7
            if (r4 != 0) goto L_0x0201
            boolean r4 = X.C627636p.A0i(r2)
            if (r4 != 0) goto L_0x0201
        L_0x00ea:
            X.4uZ r5 = r2.A0n()
            if (r5 == 0) goto L_0x01fe
            boolean r4 = r5 instanceof com.whatsapp.jid.UserJid
            if (r4 == 0) goto L_0x01fe
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            r4 = 28
            X.1wk r7 = new X.1wk
            r7.<init>((com.whatsapp.jid.UserJid) r5, (int) r4)
        L_0x00fd:
            boolean r4 = r2 instanceof X.C30291mD
            r11 = 0
            if (r4 == 0) goto L_0x01a3
            X.2z0 r4 = r2.A1J
            boolean r4 = r4.A02
            if (r4 == 0) goto L_0x0197
            com.whatsapp.jid.UserJid r8 = r2.A0o()
            X.2sr r4 = r3.A00
            com.whatsapp.jid.PhoneUserJid r5 = X.C56972sr.A04(r4)
        L_0x0112:
            boolean r4 = r2 instanceof X.C30831nH
            if (r4 == 0) goto L_0x018f
            java.lang.String r4 = "request-decline"
        L_0x0119:
            X.1wf r6 = new X.1wf
            r6.<init>(r8, r5, r0, r4)
        L_0x011e:
            r5 = 24
            X.1wk r4 = new X.1wk
            r4.<init>((int) r5)
            X.1wy r8 = new X.1wy
            r8.<init>(r4, r6)
        L_0x012a:
            X.1VX r10 = r3.A06
            r3 = 5718(0x1656, float:8.013E-42)
            X.2vE r6 = X.C58422vE.A02
            boolean r3 = r10.A0Y(r6, r3)
            if (r3 == 0) goto L_0x018d
            X.2lp r3 = r2.A0g
            if (r3 == 0) goto L_0x018d
            byte[] r5 = r3.A01
            r3 = 6
            X.1wl r4 = new X.1wl
            r4.<init>((byte[]) r5, (int) r3)
            r3 = 8
            X.1wl r9 = new X.1wl
            r9.<init>((X.C35371wl) r4, (X.C35271wb) r0, (X.C35191wT) r0, (int) r3)
        L_0x0149:
            boolean r3 = X.C624134x.A0f(r2)
            if (r3 == 0) goto L_0x0155
            r3 = 5
            X.1wl r0 = new X.1wl
            r0.<init>((int) r3)
        L_0x0155:
            r3 = 6528(0x1980, float:9.148E-42)
            boolean r3 = r10.A0Y(r6, r3)
            long r5 = r2.A0K
            if (r3 == 0) goto L_0x0163
            r3 = 1000(0x3e8, float:1.401E-42)
            long r3 = (long) r3
            long r5 = r5 / r3
        L_0x0163:
            java.lang.Long r37 = java.lang.Long.valueOf(r5)
            X.2z0 r2 = r2.A1J
            java.lang.String r2 = r2.A01
            X.1wh r23 = new X.1wh
            r24 = r20
            r25 = r22
            r26 = r16
            r27 = r15
            r28 = r7
            r29 = r21
            r30 = r19
            r31 = r18
            r32 = r17
            r33 = r9
            r34 = r0
            r35 = r8
            r36 = r1
            r38 = r2
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            return r23
        L_0x018d:
            r9 = r0
            goto L_0x0149
        L_0x018f:
            boolean r4 = r2 instanceof X.AnonymousClass1nG
            if (r4 == 0) goto L_0x056f
            java.lang.String r4 = "request-cancel"
            goto L_0x0119
        L_0x0197:
            X.2sr r4 = r3.A00
            com.whatsapp.jid.PhoneUserJid r8 = X.C56972sr.A04(r4)
            com.whatsapp.jid.UserJid r5 = r2.A0o()
            goto L_0x0112
        L_0x01a3:
            X.34w r10 = r2.A0P
            if (r10 != 0) goto L_0x01bd
            if (r23 == 0) goto L_0x01b0
            r6 = 78
            r5 = 0
            r4 = r23
            if (r4 != r6) goto L_0x01b1
        L_0x01b0:
            r5 = 1
        L_0x01b1:
            X.1wq r4 = new X.1wq
            r4.<init>(r5)
            X.1wy r8 = new X.1wy
            r8.<init>(r4)
            goto L_0x012a
        L_0x01bd:
            java.lang.String r5 = r10.A0K
            boolean r4 = X.AnonymousClass36S.A07(r5)
            if (r4 == 0) goto L_0x01c6
            r11 = r5
        L_0x01c6:
            com.whatsapp.jid.UserJid r9 = r10.A0E
            com.whatsapp.jid.UserJid r8 = r10.A0D
            int r5 = r10.A03
            r4 = 5
            if (r5 != r4) goto L_0x01d8
            java.lang.String r4 = "futureproof"
        L_0x01d1:
            X.1wf r6 = new X.1wf
            r6.<init>(r9, r8, r11, r4)
            goto L_0x011e
        L_0x01d8:
            boolean r4 = r10.A0L()
            if (r4 == 0) goto L_0x01e2
            java.lang.String r4 = "request"
            goto L_0x01d1
        L_0x01e2:
            monitor-enter(r10)
            int r6 = r10.A03     // Catch:{ all -> 0x057e }
            r4 = 2
            r5 = 1
            if (r6 == r4) goto L_0x01f7
            r4 = 200(0xc8, float:2.8E-43)
            if (r6 == r4) goto L_0x01f7
            if (r6 == r5) goto L_0x01f7
            r4 = 100
            if (r6 == r4) goto L_0x01f7
            r4 = 3
            if (r6 == r4) goto L_0x01f7
            r5 = 0
        L_0x01f7:
            monitor-exit(r10)
            if (r5 == 0) goto L_0x0576
            java.lang.String r4 = "send"
            goto L_0x01d1
        L_0x01fe:
            r7 = r0
            goto L_0x00fd
        L_0x0201:
            X.2xG r14 = r3.A05
            java.lang.String r13 = X.AnonymousClass2z0.A06(r2)
            r9 = 0
            java.util.ArrayList r12 = X.AnonymousClass001.A0s()
            X.2of r4 = r14.A03     // Catch:{ Exception -> 0x0256 }
            X.3dY r4 = r4.A00     // Catch:{ Exception -> 0x0256 }
            java.lang.Object r4 = r4.get()     // Catch:{ Exception -> 0x0256 }
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4     // Catch:{ Exception -> 0x0256 }
            java.lang.String r5 = r4.getString(r13, r0)     // Catch:{ Exception -> 0x0256 }
            if (r5 == 0) goto L_0x0278
            int r4 = r5.length()     // Catch:{ Exception -> 0x0256 }
            if (r4 == 0) goto L_0x0278
            java.lang.String r4 = ","
            java.util.List r4 = X.AnonymousClass2AB.A02(r5, r4)     // Catch:{ Exception -> 0x0256 }
            java.lang.String[] r11 = X.AnonymousClass0x7.A1b(r4)     // Catch:{ Exception -> 0x0256 }
            int r10 = r11.length     // Catch:{ Exception -> 0x0256 }
            r8 = 0
        L_0x022e:
            if (r8 >= r10) goto L_0x0278
            r7 = r11[r8]     // Catch:{ Exception -> 0x0256 }
            X.3dY r4 = r14.A05     // Catch:{ Exception -> 0x0256 }
            java.lang.Object r6 = r4.get()     // Catch:{ Exception -> 0x0256 }
            X.8Ke r6 = (X.C172228Ke) r6     // Catch:{ Exception -> 0x0256 }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0l(r13)     // Catch:{ Exception -> 0x0256 }
            r4 = 58
            java.lang.String r4 = X.AnonymousClass0x2.A0e(r7, r5, r4)     // Catch:{ Exception -> 0x0256 }
            X.8KP r4 = r6.A09(r4)     // Catch:{ Exception -> 0x0256 }
            if (r4 == 0) goto L_0x0253
            java.util.LinkedList r4 = X.C59652xG.A00(r4)     // Catch:{ Exception -> 0x0256 }
            if (r4 == 0) goto L_0x0253
            r12.addAll(r4)     // Catch:{ Exception -> 0x0256 }
        L_0x0253:
            int r8 = r8 + 1
            goto L_0x022e
        L_0x0256:
            r6 = move-exception
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "ExtensionsLogger/readSessionDataForExtensionsMessageId throws exception"
            X.C18260x0.A16(r4, r5, r6)
            X.2qk r8 = r14.A00
            java.lang.String r7 = r6.getMessage()
            X.1VX r6 = r14.A04
            r5 = 3178(0xc6a, float:4.453E-42)
            X.2vE r4 = X.C58422vE.A02
            boolean r4 = r6.A0Y(r4, r5)
            if (r4 != 0) goto L_0x0273
            r7 = 0
        L_0x0273:
            java.lang.String r4 = "ExtensionsLogger/readSessionDataForExtensionsMessageId"
            r8.A0A(r4, r9, r7)
        L_0x0278:
            boolean r4 = r12.isEmpty()
            if (r4 != 0) goto L_0x02cb
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.util.Iterator r7 = r12.iterator()
        L_0x0286:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L_0x02cd
            java.lang.Object r6 = r7.next()
            java.util.Map r6 = (java.util.Map) r6
            X.C162457s7.A0J(r6, r9)
            java.lang.String r4 = "data"
            java.lang.String r25 = X.C18310x6.A0o(r4, r6)
            if (r25 == 0) goto L_0x0286
            java.lang.String r4 = "extension_id"
            java.lang.String r26 = X.C18310x6.A0o(r4, r6)
            if (r26 == 0) goto L_0x0286
            java.lang.String r4 = "session_id"
            java.lang.String r27 = X.C18310x6.A0o(r4, r6)
            if (r27 == 0) goto L_0x0286
            java.lang.String r4 = "name"
            java.lang.String r29 = X.C18310x6.A0o(r4, r6)
            if (r29 == 0) goto L_0x0286
            java.lang.String r4 = "t"
            java.lang.String r28 = X.C18310x6.A0o(r4, r6)
            if (r28 == 0) goto L_0x0286
            X.2mf r4 = new X.2mf
            r24 = r4
            r24.<init>(r25, r26, r27, r28, r29)
            r5.add(r4)
            goto L_0x0286
        L_0x02cb:
            X.3d3 r5 = X.C72023d3.A00
        L_0x02cd:
            java.util.ArrayList r6 = X.C73783g4.A0c(r5)
            java.util.Iterator r8 = r5.iterator()
        L_0x02d5:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x0300
            java.lang.Object r7 = r8.next()
            X.2mf r7 = (X.C53172mf) r7
            java.lang.String r11 = r7.A00
            java.lang.String r12 = r7.A04
            java.lang.String r4 = r7.A01
            java.lang.Long r4 = X.C829745q.A07(r4)
            long r4 = X.AnonymousClass0x2.A0D(r4)
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            java.lang.String r13 = r7.A03
            java.lang.String r14 = r7.A02
            X.1wa r9 = new X.1wa
            r9.<init>(r10, r11, r12, r13, r14)
            r6.add(r9)
            goto L_0x02d5
        L_0x0300:
            boolean r4 = X.AnonymousClass0x7.A1S(r6)
            if (r4 == 0) goto L_0x00ea
            X.1wk r15 = new X.1wk
            r15.<init>((java.util.List) r6)
            goto L_0x00ea
        L_0x030d:
            boolean r4 = X.C627636p.A0i(r2)
            if (r4 != 0) goto L_0x00cd
            X.2Y3 r4 = r3.A03
            java.lang.String r6 = r4.A00(r2)
            if (r6 == 0) goto L_0x032c
            boolean r4 = X.C175738Zn.A0V(r6)
            if (r4 != 0) goto L_0x032c
            r5 = 29
            X.1wk r16 = new X.1wk
            r4 = r16
            r4.<init>((java.lang.String) r6, (int) r5)
            goto L_0x00cf
        L_0x032c:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "Unexpected null template ID for fmsg: "
            X.2z0 r4 = X.C624134x.A08(r2, r4, r5)
            X.C18260x0.A0n(r4, r5)
            X.2e3 r5 = r3.A02
            X.22M r4 = X.AnonymousClass22M.A0T
            r5.A01(r4, r12)
            goto L_0x00cd
        L_0x0342:
            r21 = r0
            r5 = 64
            if (r4 != r5) goto L_0x007a
            r5 = 20
            X.1wk r20 = new X.1wk
            r4 = r20
            r4.<init>((int) r5)
            goto L_0x007c
        L_0x0353:
            r22 = r0
            goto L_0x006c
        L_0x0357:
            boolean r0 = X.C626635z.A09(r2)
            if (r0 == 0) goto L_0x0366
            byte[] r4 = new byte[r11]
        L_0x035f:
            X.1wz r0 = new X.1wz
            r0.<init>()
            goto L_0x0057
        L_0x0366:
            java.lang.String r1 = X.C627636p.A0D(r23)
            if (r1 == 0) goto L_0x0376
            int r0 = r1.hashCode()
            switch(r0) {
                case -1890252483: goto L_0x0509;
                case -1718548393: goto L_0x050d;
                case -1490915991: goto L_0x0510;
                case -1183699191: goto L_0x0514;
                case -1006478445: goto L_0x0517;
                case -887328209: goto L_0x051a;
                case -714971329: goto L_0x051e;
                case -622287711: goto L_0x0521;
                case -309474065: goto L_0x0524;
                case 102340: goto L_0x0528;
                case 111344: goto L_0x052b;
                case 111346: goto L_0x052f;
                case 116079: goto L_0x0533;
                case 3322014: goto L_0x0537;
                case 93166550: goto L_0x053a;
                case 100313435: goto L_0x053d;
                case 106006350: goto L_0x0540;
                case 112021638: goto L_0x0544;
                case 112202875: goto L_0x0548;
                case 555704345: goto L_0x054c;
                case 814376458: goto L_0x054f;
                case 861720859: goto L_0x0553;
                case 943481210: goto L_0x0556;
                case 1014323694: goto L_0x0559;
                case 1279485634: goto L_0x055d;
                case 1901043637: goto L_0x0560;
                default: goto L_0x0373;
            }
        L_0x0373:
            java.lang.String r13 = "unknown"
        L_0x0376:
            X.1wz r19 = new X.1wz
            r19.<init>()
            java.lang.String r0 = "media_viewer"
            boolean r0 = r0.equals(r12)
            if (r5 == 0) goto L_0x0399
            if (r0 != 0) goto L_0x0399
            r0 = r2
            X.4DU r0 = (X.AnonymousClass4DU) r0
            int r0 = r0.BEM()
            if (r0 == 0) goto L_0x0399
            byte[] r4 = new byte[r11]
        L_0x0390:
            X.1wW r1 = new X.1wW
            r0 = r19
            r1.<init>(r0, r13, r4)
            goto L_0x005c
        L_0x0399:
            X.1A4 r14 = X.C18300x5.A0R()
            X.C162457s7.A0H(r14)     // Catch:{ 24A | IllegalStateException -> 0x03bc }
            X.C162457s7.A0J(r14, r11)     // Catch:{ 24A | IllegalStateException -> 0x03bc }
            X.2cu r1 = new X.2cu     // Catch:{ 24A | IllegalStateException -> 0x03bc }
            r1.<init>(r14)     // Catch:{ 24A | IllegalStateException -> 0x03bc }
            X.3Z2 r0 = r2.A0v()     // Catch:{ 24A | IllegalStateException -> 0x03bc }
            r1.A00 = r0     // Catch:{ 24A | IllegalStateException -> 0x03bc }
            r1.A02 = r10     // Catch:{ 24A | IllegalStateException -> 0x03bc }
            r1.A06 = r10     // Catch:{ 24A | IllegalStateException -> 0x03bc }
            X.2pg r1 = r1.A01()     // Catch:{ 24A | IllegalStateException -> 0x03bc }
            X.3Le r0 = r3.A07     // Catch:{ 24A | IllegalStateException -> 0x03bc }
            r0.A01(r1, r2)     // Catch:{ 24A | IllegalStateException -> 0x03bc }
            goto L_0x03c0
        L_0x03bc:
            r0 = move-exception
            com.whatsapp.util.Log.e(r4, r0)
        L_0x03c0:
            X.30o r1 = r3.A08
            X.2w3 r0 = X.C614030o.A00(r2)
            if (r0 == 0) goto L_0x0500
            java.lang.String r9 = r1.A02(r0)
            if (r9 == 0) goto L_0x0500
            X.19p r8 = X.AnonymousClass1A4.A03(r14)
            X.6cX r1 = r8.A00
            X.1EI r1 = (X.AnonymousClass1EI) r1
            int r0 = r1.formatCase_
            r7 = 2
            if (r0 != r7) goto L_0x04af
            java.lang.Object r0 = r1.format_
            X.6cX r0 = (X.C130786cX) r0
        L_0x03df:
            X.6c9 r6 = r0.A0H()
            X.19q r6 = (X.C208719q) r6
            X.6cX r0 = r6.A00
            X.1EK r0 = (X.AnonymousClass1EK) r0
            java.lang.String r0 = r0.hydratedContentText_
            java.lang.String r5 = "<code>"
            java.lang.String r4 = r0.replace(r9, r5)
            X.6cX r1 = X.C18320x8.A0C(r6)
            X.1EK r1 = (X.AnonymousClass1EK) r1
            r4.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r1.hydratedContentText_ = r4
            X.6cX r0 = r6.A00
            X.1EK r0 = (X.AnonymousClass1EK) r0
            java.lang.String r0 = r0.hydratedFooterText_
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0429
            X.6cX r0 = r6.A00
            X.1EK r0 = (X.AnonymousClass1EK) r0
            java.lang.String r0 = r0.hydratedFooterText_
            java.lang.String r4 = r0.replace(r9, r5)
            X.6cX r1 = X.C18320x8.A0C(r6)
            X.1EK r1 = (X.AnonymousClass1EK) r1
            r4.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 64
            r1.bitField0_ = r0
            r1.hydratedFooterText_ = r4
        L_0x0429:
            X.6cX r0 = r6.A00
            X.1EK r0 = (X.AnonymousClass1EK) r0
            X.8ya r0 = r0.hydratedButtons_
            java.util.List r1 = java.util.Collections.unmodifiableList(r0)
            java.util.ArrayList r18 = X.AnonymousClass001.A0s()
            if (r1 == 0) goto L_0x04d7
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x04d7
            java.util.Iterator r17 = r1.iterator()
        L_0x0443:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x04b3
            java.lang.Object r0 = r17.next()
            X.6cX r0 = (X.C130786cX) r0
            X.6c9 r4 = r0.A0H()
            X.6cX r1 = r4.A00
            X.1EH r1 = (X.AnonymousClass1EH) r1
            int r0 = r1.hydratedButtonCase_
            if (r0 == 0) goto L_0x04ac
            if (r0 == r10) goto L_0x04a9
            if (r0 == r7) goto L_0x04a6
            r15 = 3
            if (r0 == r15) goto L_0x04a3
            r0 = 0
        L_0x0463:
            X.206 r15 = X.AnonymousClass206.URL_BUTTON
            if (r0 != r15) goto L_0x049d
            X.1Ch r0 = r1.A0M()
            X.6c9 r16 = r0.A0H()
            r0 = r16
            X.6cX r0 = r0.A00
            X.1Ch r0 = (X.C21561Ch) r0
            java.lang.String r0 = r0.url_
            java.lang.String r15 = r0.replace(r9, r5)
            X.6cX r1 = X.C18320x8.A0C(r16)
            X.1Ch r1 = (X.C21561Ch) r1
            r15.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.url_ = r15
            X.6cX r1 = r16.A06()
            X.6cX r0 = X.C18320x8.A0C(r4)
            X.1EH r0 = (X.AnonymousClass1EH) r0
            r1.getClass()
            r0.hydratedButton_ = r1
            r0.hydratedButtonCase_ = r7
        L_0x049d:
            r0 = r18
            X.C18320x8.A1B(r4, r0)
            goto L_0x0443
        L_0x04a3:
            X.206 r0 = X.AnonymousClass206.CALL_BUTTON
            goto L_0x0463
        L_0x04a6:
            X.206 r0 = X.AnonymousClass206.URL_BUTTON
            goto L_0x0463
        L_0x04a9:
            X.206 r0 = X.AnonymousClass206.QUICK_REPLY_BUTTON
            goto L_0x0463
        L_0x04ac:
            X.206 r0 = X.AnonymousClass206.HYDRATEDBUTTON_NOT_SET
            goto L_0x0463
        L_0x04af:
            X.1EK r0 = X.AnonymousClass1EK.DEFAULT_INSTANCE
            goto L_0x03df
        L_0x04b3:
            X.6cX r1 = X.C18320x8.A0C(r6)
            X.1EK r1 = (X.AnonymousClass1EK) r1
            X.6bd r0 = X.C130236bd.A02
            r1.hydratedButtons_ = r0
            X.6cX r4 = X.C18320x8.A0C(r6)
            X.1EK r4 = (X.AnonymousClass1EK) r4
            X.8ya r1 = r4.hydratedButtons_
            r0 = r1
            X.8T6 r0 = (X.AnonymousClass8T6) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x04d2
            X.8ya r1 = X.C130786cX.A07(r1)
            r4.hydratedButtons_ = r1
        L_0x04d2:
            r0 = r18
            X.C170208Ch.A05(r0, r1)
        L_0x04d7:
            X.6cX r1 = r6.A00
            X.1EK r1 = (X.AnonymousClass1EK) r1
            int r0 = r1.titleCase_
            if (r0 != r7) goto L_0x0506
            java.lang.Object r1 = r1.title_
            java.lang.String r1 = (java.lang.String) r1
        L_0x04e3:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x04fa
            java.lang.String r1 = r1.replace(r9, r5)
            X.6cX r0 = X.C18320x8.A0C(r6)
            X.1EK r0 = (X.AnonymousClass1EK) r0
            r1.getClass()
            r0.titleCase_ = r7
            r0.title_ = r1
        L_0x04fa:
            r8.A09(r6)
            r14.A0H(r8)
        L_0x0500:
            byte[] r4 = X.C18290x4.A1Z(r14)
            goto L_0x0390
        L_0x0506:
            java.lang.String r1 = ""
            goto L_0x04e3
        L_0x0509:
            java.lang.String r13 = "sticker"
            goto L_0x0562
        L_0x050d:
            java.lang.String r13 = "avatar_sticker"
            goto L_0x0562
        L_0x0510:
            java.lang.String r13 = "productlink"
            goto L_0x0562
        L_0x0514:
            java.lang.String r13 = "invite"
            goto L_0x0562
        L_0x0517:
            java.lang.String r13 = "cataloglink"
            goto L_0x0562
        L_0x051a:
            java.lang.String r13 = "system"
            goto L_0x0562
        L_0x051e:
            java.lang.String r13 = "buttons_response"
            goto L_0x0562
        L_0x0521:
            java.lang.String r13 = "livelocation"
            goto L_0x0562
        L_0x0524:
            java.lang.String r13 = "product"
            goto L_0x0562
        L_0x0528:
            java.lang.String r13 = "gif"
            goto L_0x0562
        L_0x052b:
            java.lang.String r13 = "ptt"
            goto L_0x0562
        L_0x052f:
            java.lang.String r13 = "ptv"
            goto L_0x0562
        L_0x0533:
            java.lang.String r13 = "url"
            goto L_0x0562
        L_0x0537:
            java.lang.String r13 = "list"
            goto L_0x0562
        L_0x053a:
            java.lang.String r13 = "audio"
            goto L_0x0562
        L_0x053d:
            java.lang.String r13 = "image"
            goto L_0x0562
        L_0x0540:
            java.lang.String r13 = "order"
            goto L_0x0562
        L_0x0544:
            java.lang.String r13 = "vcard"
            goto L_0x0562
        L_0x0548:
            java.lang.String r13 = "video"
            goto L_0x0562
        L_0x054c:
            java.lang.String r13 = "catalog"
            goto L_0x0562
        L_0x054f:
            java.lang.String r13 = "native_flow_response"
            goto L_0x0562
        L_0x0553:
            java.lang.String r13 = "document"
            goto L_0x0562
        L_0x0556:
            java.lang.String r13 = "contact_array"
            goto L_0x0562
        L_0x0559:
            java.lang.String r13 = "product_list"
            goto L_0x0562
        L_0x055d:
            java.lang.String r13 = "list_response"
            goto L_0x0562
        L_0x0560:
            java.lang.String r13 = "location"
        L_0x0562:
            boolean r0 = r1.equals(r13)
            if (r0 != 0) goto L_0x0376
            goto L_0x0373
        L_0x056a:
            java.lang.String r39 = "view_once_opened"
            goto L_0x002c
        L_0x056f:
            java.lang.String r0 = "This shouldn't happen as FMessagePaymentRequestResponse has only two implementations"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0576:
            java.lang.String r0 = "typeAttributeValue can't be null"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x057e:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50352i2.A01(X.34x, java.lang.String):X.1wh");
    }

    public C50352i2(C56972sr r2, C56642sK r3, C47922e3 r4, AnonymousClass2Y3 r5, C48562f6 r6, C59652xG r7, AnonymousClass1VX r8, C66383Le r9, C614030o r10) {
        C18260x0.A0d(r8, r2, r10, r3);
        C18260x0.A0W(r6, r9, r7);
        C162457s7.A0J(r5, 9);
        this.A06 = r8;
        this.A00 = r2;
        this.A02 = r4;
        this.A08 = r10;
        this.A01 = r3;
        this.A04 = r6;
        this.A07 = r9;
        this.A05 = r7;
        this.A03 = r5;
    }
}
