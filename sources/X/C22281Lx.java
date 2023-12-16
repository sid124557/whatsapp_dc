package X;

/* renamed from: X.1Lx  reason: invalid class name and case insensitive filesystem */
public class C22281Lx extends AnonymousClass3CG {
    public final C50292hw A00;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0182, code lost:
        if (r3.equals("wa.action.bonsai.GetMsgKeyId") == false) goto L_0x0010;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0017  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object B2m(X.C157967jD r16, X.C146787Bp r17, X.C151147Tp r18) {
        /*
            r15 = this;
            r1 = r18
            X.6dJ r1 = (X.C131266dJ) r1
            r0 = r17
            java.lang.String r3 = r0.A00
            int r0 = r3.hashCode()
            r2 = -1
            switch(r0) {
                case -1780838056: goto L_0x01a3;
                case 621219906: goto L_0x0197;
                case 649612623: goto L_0x017b;
                case 1175015327: goto L_0x016f;
                case 1185711293: goto L_0x0163;
                case 1910438231: goto L_0x0142;
                default: goto L_0x0010;
            }
        L_0x0010:
            r7 = 0
            r3 = r16
            switch(r2) {
                case 0: goto L_0x00d6;
                case 1: goto L_0x004a;
                case 2: goto L_0x0186;
                case 3: goto L_0x0017;
                case 4: goto L_0x01af;
                default: goto L_0x0016;
            }
        L_0x0016:
            return r7
        L_0x0017:
            r2 = 0
            java.util.List r0 = r3.A00
            java.lang.Object r2 = r0.get(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            java.lang.Object r0 = X.AnonymousClass0x9.A0u(r0)
            if (r2 == 0) goto L_0x0016
            if (r0 == 0) goto L_0x0016
            X.7fV r0 = (X.C155787fV) r0
            X.8DF r0 = r0.A00
            X.2Jg r6 = new X.2Jg
            r6.<init>()
            r6.A00 = r1
            r6.A01 = r0
            X.2hw r3 = r15.A00
            int r2 = r2.intValue()
            r0 = 1
            if (r2 == 0) goto L_0x01cf
            if (r2 == r0) goto L_0x01cf
            r1 = 2
            if (r2 == r1) goto L_0x01cb
            r0 = 3
            if (r2 != r0) goto L_0x0016
            r3.A00(r6, r1)
            return r7
        L_0x004a:
            r0 = 0
            java.util.List r2 = r3.A00
            java.lang.String r1 = X.AnonymousClass001.A0n(r2, r0)
            java.lang.Object r3 = X.AnonymousClass0x9.A0u(r2)
            java.util.AbstractCollection r3 = (java.util.AbstractCollection) r3
            r0 = 2
            java.lang.String r12 = X.AnonymousClass001.A0n(r2, r0)
            r0 = 3
            java.lang.String r13 = X.AnonymousClass001.A0n(r2, r0)
            X.2hw r10 = r15.A00
            X.C18260x0.A0O(r1, r3)
            r14 = 2
            X.C162457s7.A0J(r12, r14)
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()
            X.4uZ r9 = X.C18310x6.A0S(r1)
            if (r9 == 0) goto L_0x0016
            X.1VX r2 = r10.A05
            X.2vE r1 = X.C58422vE.A01
            r0 = 6527(0x197f, float:9.146E-42)
            boolean r0 = r2.A0Y(r1, r0)
            if (r0 == 0) goto L_0x0016
            java.util.Iterator r2 = r3.iterator()
        L_0x0084:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01ea
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 == 0) goto L_0x0084
            int r1 = X.AnonymousClass001.A0K(r1)
            r0 = 1
            if (r1 == r0) goto L_0x00d3
            if (r1 == r14) goto L_0x00d0
            r0 = 4
            if (r1 == r0) goto L_0x00cd
            r0 = 8
            if (r1 == r0) goto L_0x00ca
            r0 = 16
            if (r1 == r0) goto L_0x00c7
            r0 = 32
            if (r1 == r0) goto L_0x00c4
            r0 = 64
            if (r1 == r0) goto L_0x00c1
            r0 = 128(0x80, float:1.794E-43)
            if (r1 == r0) goto L_0x00be
            r0 = 256(0x100, float:3.59E-43)
            if (r1 == r0) goto L_0x00bb
            r0 = 0
        L_0x00b7:
            r11.add(r0)
            goto L_0x0084
        L_0x00bb:
            X.236 r0 = X.AnonymousClass236.BOT_FEEDBACK_MULTIPLE_NEGATIVE_NOT_RELEVANT_TO_TEXT
            goto L_0x00b7
        L_0x00be:
            X.236 r0 = X.AnonymousClass236.BOT_FEEDBACK_MULTIPLE_NEGATIVE_NOT_VISUALLY_APPEALING
            goto L_0x00b7
        L_0x00c1:
            X.236 r0 = X.AnonymousClass236.BOT_FEEDBACK_MULTIPLE_NEGATIVE_REFUSED
            goto L_0x00b7
        L_0x00c4:
            X.236 r0 = X.AnonymousClass236.BOT_FEEDBACK_MULTIPLE_NEGATIVE_OTHER
            goto L_0x00b7
        L_0x00c7:
            X.236 r0 = X.AnonymousClass236.BOT_FEEDBACK_MULTIPLE_NEGATIVE_SAFE
            goto L_0x00b7
        L_0x00ca:
            X.236 r0 = X.AnonymousClass236.BOT_FEEDBACK_MULTIPLE_NEGATIVE_ACCURATE
            goto L_0x00b7
        L_0x00cd:
            X.236 r0 = X.AnonymousClass236.BOT_FEEDBACK_MULTIPLE_NEGATIVE_INTERESTING
            goto L_0x00b7
        L_0x00d0:
            X.236 r0 = X.AnonymousClass236.BOT_FEEDBACK_MULTIPLE_NEGATIVE_HELPFUL
            goto L_0x00b7
        L_0x00d3:
            X.236 r0 = X.AnonymousClass236.BOT_FEEDBACK_MULTIPLE_NEGATIVE_GENERIC
            goto L_0x00b7
        L_0x00d6:
            r2 = 0
            java.util.List r0 = r3.A00
            java.lang.Object r2 = r0.get(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r5 = r2.intValue()
            java.lang.Object r0 = X.AnonymousClass0x9.A0u(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            X.2hw r4 = r15.A00
            android.app.Activity r6 = X.AnonymousClass8DJ.A01(r1)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0136
            r3 = 2
            java.lang.Integer[] r1 = new java.lang.Integer[r3]
            X.C18270x1.A1Q(r1, r3)
            r0 = 3
            X.AnonymousClass000.A1M(r1, r0)
            java.util.List r0 = X.AnonymousClass8UF.A0o(r1)
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0136
            X.2rv r0 = r4.A08
            X.2aJ r2 = r0.A01
            java.lang.String r1 = r2.A00()
            java.lang.String r0 = "yes"
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 != 0) goto L_0x0136
            X.2Sa r0 = r2.A02
            X.66R r0 = r0.A05
            java.lang.Object r2 = r0.getValue()
            X.2oT r2 = (X.C54282oT) r2
            java.lang.String r1 = "no"
            r0 = 0
            r2.A01(r1, r0)
            if (r5 != r3) goto L_0x012e
            r3 = 1
        L_0x012e:
            X.2Z2 r2 = r4.A07
            r1 = 6
            java.lang.Integer r0 = r2.A00
            r2.A00(r0, r1, r3)
        L_0x0136:
            if (r6 == 0) goto L_0x0016
            boolean r0 = r6.isFinishing()
            if (r0 != 0) goto L_0x0016
            r6.finish()
            return r7
        L_0x0142:
            java.lang.String r0 = "wa.action.bonsai.GetChatJid"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0010
            X.2hw r0 = r15.A00
            X.2Et r0 = r0.A02
            java.lang.String r1 = "chat_jid"
            java.util.HashMap r0 = r0.A00
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L_0x015a
            r0 = 0
        L_0x015a:
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            if (r0 == 0) goto L_0x0195
            java.lang.String r7 = r0.getRawString()
            return r7
        L_0x0163:
            java.lang.String r0 = "wa.action.bonsai.SubmitFeedback"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0010
            r2 = 4
            goto L_0x0010
        L_0x016f:
            java.lang.String r0 = "wa.action.bonsai.AcceptDisclaimerV2"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0010
            r2 = 3
            goto L_0x0010
        L_0x017b:
            java.lang.String r0 = "wa.action.bonsai.GetMsgKeyId"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0186
            goto L_0x0010
        L_0x0186:
            X.2hw r0 = r15.A00
            X.2Et r0 = r0.A02
            java.lang.String r1 = "message_key_id"
            java.util.HashMap r0 = r0.A00
            java.lang.Object r7 = r0.get(r1)
            if (r7 != 0) goto L_0x0016
        L_0x0195:
            r7 = 0
            return r7
        L_0x0197:
            java.lang.String r0 = "wa.action.bonsai.SubmitNegativeFeedbackMultiple"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0010
            r2 = 1
            goto L_0x0010
        L_0x01a3:
            java.lang.String r0 = "wa.action.bot.CloseDisclaimer"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0010
            r2 = 0
            goto L_0x0010
        L_0x01af:
            r0 = 0
            java.util.List r1 = r3.A00
            java.lang.String r4 = X.AnonymousClass001.A0n(r1, r0)
            r0 = 1
            int r3 = X.AnonymousClass000.A09(r1, r0)
            r0 = 2
            java.lang.String r2 = X.AnonymousClass001.A0n(r1, r0)
            r0 = 3
            java.lang.String r1 = X.AnonymousClass001.A0n(r1, r0)
            X.2hw r0 = r15.A00
            r0.A01(r4, r2, r1, r3)
            return r7
        L_0x01cb:
            r3.A00(r6, r0)
            return r7
        L_0x01cf:
            X.2pP r5 = r3.A04
            X.2XY r4 = new X.2XY
            r4.<init>(r6, r3)
            if (r2 != 0) goto L_0x01e6
            r2 = 20230902(0x134b2f6, double:9.9953937E-317)
        L_0x01db:
            X.2Vf r1 = r5.A01
            X.3EQ r0 = new X.3EQ
            r0.<init>(r4, r5, r2)
            r1.A00(r0, r2)
            return r7
        L_0x01e6:
            r2 = 20230901(0x134b2f5, double:9.995393E-317)
            goto L_0x01db
        L_0x01ea:
            X.4FS r0 = r10.A06
            X.3ar r8 = new X.3ar
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r0.BkM(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22281Lx.B2m(X.7jD, X.7Bp, X.7Tp):java.lang.Object");
    }

    public C22281Lx(C50292hw r7) {
        super("wa.action.bonsai.AcceptDisclaimerV2", "wa.action.bonsai.GetChatJid", "wa.action.bonsai.GetMsgKeyId", "wa.action.bonsai.SubmitFeedback", "wa.action.bot.CloseDisclaimer", "wa.action.bonsai.SubmitNegativeFeedbackMultiple");
        this.A00 = r7;
    }
}
