package X;

/* renamed from: X.6qs  reason: invalid class name and case insensitive filesystem */
public class C138716qs extends C41022Iq {
    public Object A00;
    public Object A01;
    public Object A02;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r0 = X.C626836d.A04(r12, X.C1896292a.A00(r0), new java.lang.String[r2]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0034, code lost:
        r11.A02 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C138716qs(X.AnonymousClass36K r12, int r13) {
        /*
            r11 = this;
            r4 = r12
            switch(r13) {
                case 0: goto L_0x0039;
                case 1: goto L_0x0078;
                case 2: goto L_0x00f2;
                case 3: goto L_0x013a;
                case 4: goto L_0x0162;
                case 5: goto L_0x0194;
                case 6: goto L_0x00b0;
                case 7: goto L_0x01db;
                default: goto L_0x0004;
            }
        L_0x0004:
            r11.<init>()
            java.lang.String r0 = "listing_details"
            X.AnonymousClass36K.A0N(r12, r0)
            java.lang.String r0 = "description"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            r0 = 395(0x18b, float:5.54E-43)
            java.lang.Object r0 = X.C86614Ku.A0r(r12, r1, r0)
            r11.A00 = r0
            java.lang.String r0 = "lowest_price"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            r0 = 396(0x18c, float:5.55E-43)
            java.lang.Object r0 = X.C86614Ku.A0r(r12, r1, r0)
            r11.A01 = r0
            java.lang.String r0 = "multi_price"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            r0 = 397(0x18d, float:5.56E-43)
            java.lang.Object r0 = X.C86614Ku.A0r(r12, r1, r0)
        L_0x0034:
            r11.A02 = r0
        L_0x0036:
            r11.A00 = r12
            return
        L_0x0039:
            r11.<init>()
            java.lang.String r0 = "installment"
            X.AnonymousClass36K.A0N(r12, r0)
            java.lang.String r0 = "count"
            java.lang.String[] r9 = new java.lang.String[]{r0}
            java.lang.Class<java.lang.Long> r5 = java.lang.Long.class
            r10 = 0
            r8 = 0
            java.lang.Long r6 = X.AnonymousClass0x2.A0U()
            r0 = 50
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = X.C626836d.A06(r4, r5, r6, r7, r8, r9, r10)
            r11.A00 = r0
            r0 = 20
            X.4Jp r1 = new X.4Jp
            r1.<init>(r0)
            java.lang.String r0 = "due_amount"
            java.lang.Object r0 = X.AnonymousClass6C8.A0b(r12, r1, r0)
            r11.A01 = r0
            r0 = 21
            X.4Jp r1 = new X.4Jp
            r1.<init>(r0)
            java.lang.String r0 = "interest"
            java.lang.Object r0 = X.AnonymousClass6C8.A0b(r12, r1, r0)
            goto L_0x0034
        L_0x0078:
            r11.<init>()
            java.lang.String r0 = "group"
            X.AnonymousClass36K.A0N(r12, r0)
            java.lang.String r0 = "size"
            java.lang.String[] r9 = new java.lang.String[]{r0}
            java.lang.Class<java.lang.Long> r5 = java.lang.Long.class
            r10 = 0
            r8 = 0
            java.lang.Long r6 = X.AnonymousClass0x2.A0T()
            r0 = 19999(0x4e1f, double:9.881E-320)
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = X.C626836d.A05(r4, r5, r6, r7, r8, r9, r10)
            r11.A02 = r0
            r0 = 114(0x72, float:1.6E-43)
            java.lang.Object r0 = X.C1896292a.A0L(r12, r0, r10)
            r11.A01 = r0
            r0 = 115(0x73, float:1.61E-43)
            X.92a r1 = X.C1896292a.A00(r0)
            java.lang.String[] r0 = new java.lang.String[r10]
            java.lang.Object r0 = X.C626836d.A04(r12, r1, r0)     // Catch:{ 24Y -> 0x01d6 }
            goto L_0x01d7
        L_0x00b0:
            r11.<init>()
            java.lang.String r0 = "messages"
            java.lang.String[] r9 = X.AnonymousClass6C9.A1b(r12, r0)
            java.lang.Class<X.4uY> r5 = X.C95804uY.class
            r10 = 0
            r8 = 0
            java.lang.Long r6 = X.AnonymousClass0x2.A0R()
            java.lang.Long r7 = X.AnonymousClass0x2.A0S()
            java.lang.Object r0 = X.C626836d.A05(r4, r5, r6, r7, r8, r9, r10)
            r11.A00 = r0
            java.lang.String r0 = "t"
            java.lang.String[] r9 = new java.lang.String[]{r0}
            java.lang.Class<java.lang.Long> r5 = java.lang.Long.class
            java.lang.Long r6 = X.AnonymousClass0x2.A0T()
            java.lang.Object r0 = X.C626836d.A05(r4, r5, r6, r7, r8, r9, r10)
            r11.A02 = r0
            java.lang.String r0 = "message"
            java.lang.String[] r6 = new java.lang.String[]{r0}
            r0 = 319(0x13f, float:4.47E-43)
            X.92a r5 = X.C1896292a.A00(r0)
            r7 = 0
            r9 = 300(0x12c, double:1.48E-321)
            java.util.List r0 = X.C626836d.A0B(r4, r5, r6, r7, r9)
            goto L_0x0136
        L_0x00f2:
            r11.<init>()
            java.lang.String r0 = "participant"
            java.lang.String[] r1 = X.AnonymousClass6C9.A1b(r12, r0)
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            r3 = 0
            java.lang.Object r0 = X.AnonymousClass6C7.A0c(r12, r0, r1)
            r11.A00 = r0
            r0 = 230(0xe6, float:3.22E-43)
            X.92a r1 = X.C1896292a.A00(r0)
            java.lang.String[] r0 = new java.lang.String[r3]
            java.lang.Object r0 = X.C626836d.A04(r12, r1, r0)     // Catch:{ 24Y -> 0x0111 }
            goto L_0x0112
        L_0x0111:
            r0 = 0
        L_0x0112:
            r11.A02 = r0
            r0 = 4
            X.4B7[] r1 = new X.AnonymousClass4B7[r0]
            r0 = 231(0xe7, float:3.24E-43)
            X.C1896292a.A0U(r1, r0, r3)
            r0 = 232(0xe8, float:3.25E-43)
            X.C1896292a.A0P(r1, r0)
            r0 = 233(0xe9, float:3.27E-43)
            X.C1896292a.A0Q(r1, r0)
            r0 = 234(0xea, float:3.28E-43)
            java.util.ArrayList r2 = X.C1896292a.A0M(r1, r0)
            java.lang.String[] r1 = new java.lang.String[r3]
            java.lang.String r0 = "ParticipantNotInGroup|ParticipantNotAllowed|ParticipantNotAcceptable|RemoveParticipantsLinkedGroupsServerError"
            java.lang.Object r0 = X.C626836d.A07(r12, r0, r2, r1)     // Catch:{ 24Y -> 0x0135 }
            goto L_0x0136
        L_0x0135:
            r0 = 0
        L_0x0136:
            r11.A01 = r0
            goto L_0x0036
        L_0x013a:
            r11.<init>()
            java.lang.String r0 = "sub_group_suggestion"
            X.AnonymousClass36K.A0N(r12, r0)
            r0 = 244(0xf4, float:3.42E-43)
            X.92a r0 = X.C1896292a.A00(r0)
            r2 = 0
            java.lang.Object r0 = X.C626836d.A02(r12, r0, r2)
            r11.A02 = r0
            r0 = 245(0xf5, float:3.43E-43)
            X.92a r1 = X.C1896292a.A00(r0)
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.Object r0 = X.C626836d.A04(r12, r1, r0)     // Catch:{ 24Y -> 0x015c }
            goto L_0x015d
        L_0x015c:
            r0 = 0
        L_0x015d:
            r11.A01 = r0
            r0 = 246(0xf6, float:3.45E-43)
            goto L_0x0189
        L_0x0162:
            r11.<init>()
            java.lang.String r0 = "sub_group_suggestion"
            X.AnonymousClass36K.A0N(r12, r0)
            r0 = 248(0xf8, float:3.48E-43)
            X.92a r0 = X.C1896292a.A00(r0)
            r2 = 0
            java.lang.Object r0 = X.C626836d.A02(r12, r0, r2)
            r11.A01 = r0
            r0 = 249(0xf9, float:3.49E-43)
            X.92a r1 = X.C1896292a.A00(r0)
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.Object r0 = X.C626836d.A04(r12, r1, r0)     // Catch:{ 24Y -> 0x0184 }
            goto L_0x0185
        L_0x0184:
            r0 = 0
        L_0x0185:
            r11.A02 = r0
            r0 = 250(0xfa, float:3.5E-43)
        L_0x0189:
            X.92a r1 = X.C1896292a.A00(r0)
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.Object r0 = X.C626836d.A04(r12, r1, r0)     // Catch:{ 24Y -> 0x01d6 }
            goto L_0x01d7
        L_0x0194:
            r11.<init>()
            java.lang.String r0 = "message"
            X.AnonymousClass36K.A0N(r12, r0)
            java.lang.String r0 = "server_id"
            java.lang.String[] r9 = new java.lang.String[]{r0}
            java.lang.Class<java.lang.Long> r5 = java.lang.Long.class
            r10 = 0
            r8 = 0
            r0 = 99
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            r0 = 2147476647(0x7fffe4a7, double:1.0609944365E-314)
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = X.C626836d.A06(r4, r5, r6, r7, r8, r9, r10)
            r11.A02 = r0
            r0 = 317(0x13d, float:4.44E-43)
            X.92a r1 = X.C1896292a.A00(r0)
            java.lang.String[] r0 = new java.lang.String[r10]
            java.lang.Object r0 = X.C626836d.A04(r12, r1, r0)     // Catch:{ 24Y -> 0x01c6 }
            goto L_0x01c7
        L_0x01c6:
            r0 = 0
        L_0x01c7:
            r11.A01 = r0
            r0 = 318(0x13e, float:4.46E-43)
            X.92a r1 = X.C1896292a.A00(r0)
            java.lang.String[] r0 = new java.lang.String[r10]
            java.lang.Object r0 = X.C626836d.A04(r12, r1, r0)     // Catch:{ 24Y -> 0x01d6 }
            goto L_0x01d7
        L_0x01d6:
            r0 = 0
        L_0x01d7:
            r11.A00 = r0
            goto L_0x0036
        L_0x01db:
            r11.<init>()
            java.lang.String r0 = "message"
            X.AnonymousClass36K.A0N(r12, r0)
            java.lang.String r0 = "t"
            java.lang.String r2 = "votes"
            java.lang.String[] r1 = new java.lang.String[]{r2, r0}
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            java.lang.Object r0 = X.AnonymousClass6C7.A0b(r12, r0, r1)
            r11.A01 = r0
            java.lang.String r0 = "vote"
            java.lang.String[] r6 = new java.lang.String[]{r2, r0}
            r0 = 321(0x141, float:4.5E-43)
            X.92a r5 = X.C1896292a.A00(r0)
            r7 = 0
            r9 = 1000(0x3e8, double:4.94E-321)
            java.util.List r0 = X.C626836d.A0B(r4, r5, r6, r7, r9)
            r11.A02 = r0
            r11.A00 = r12
            java.lang.String[] r1 = new java.lang.String[]{r2}
            r0 = 322(0x142, float:4.51E-43)
            java.util.List r0 = X.C1896292a.A0N(r12, r1, r0)
            java.lang.Object r0 = X.C18290x4.A0k(r0)
            r11.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C138716qs.<init>(X.36K, int):void");
    }
}
