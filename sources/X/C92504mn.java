package X;

import com.whatsapp.R;

/* renamed from: X.4mn  reason: invalid class name and case insensitive filesystem */
public final class C92504mn extends C93314oJ {
    public C50382i5 A00;
    public boolean A01;

    public void A0v() {
        if (!this.A01) {
            this.A01 = true;
            C88864av A0C = C87094Nz.A0C(this);
            C64333Db r2 = A0C.A0K;
            C87094Nz.A0W(r2, this);
            C87094Nz.A0X(r2, this);
            C87094Nz.A0Y(r2, this);
            C87094Nz.A0Z(r2, this);
            C87094Nz.A0a(r2, this, C87094Nz.A0D(r2));
            C116985rC A0A = C87094Nz.A0A(r2, this);
            C87094Nz.A0R(r2, r2.A00, this);
            C87094Nz.A0M(A0A, r2, this, r2.A4V);
            C87094Nz.A0S(r2, A0C, this);
            C87094Nz.A0b(r2, this, C87094Nz.A0E(r2));
            C87094Nz.A0I(A0A, r2, A0C, this, C86604Kt.A0i(r2));
            C87094Nz.A0L(A0A, r2, this);
            this.A00 = (C50382i5) r2.AZG.get();
        }
    }

    public int getBubbleAlpha() {
        return 191;
    }

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00de, code lost:
        r2 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x011f, code lost:
        if (r1 != 85) goto L_0x0121;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C92504mn(android.content.Context r8, X.AnonymousClass677 r9, X.C624134x r10) {
        /*
            r7 = this;
            r7.<init>(r8, r9, r10)
            r7.A0v()
            r0 = 2131431521(0x7f0b1061, float:1.8484774E38)
            com.whatsapp.TextEmojiLabel r5 = X.C86644Kx.A0M(r7, r0)
            X.1VX r0 = r7.A0O
            X.AnonymousClass0x2.A14(r0, r5)
            r4 = 0
            X.C86604Kt.A1J(r5)
            X.2sr r0 = r7.A0Z
            boolean r3 = r0.A0Y()
            X.2z0 r6 = r10.A1J
            boolean r2 = r6.A02
            boolean r0 = X.C627636p.A0i(r10)
            if (r0 != 0) goto L_0x003f
            boolean r0 = r10 instanceof X.C31901p2
            if (r0 == 0) goto L_0x00fb
            r0 = r10
            X.1p2 r0 = (X.C31901p2) r0
            X.39N r0 = r0.A00
            if (r0 == 0) goto L_0x00fb
            X.397 r0 = r0.A01
            if (r0 == 0) goto L_0x00fb
            java.lang.String r1 = "galaxy_message"
            java.lang.String r0 = r0.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00fb
        L_0x003f:
            r6 = 1
        L_0x0040:
            r1 = 0
            r0 = 0
            if (r2 == 0) goto L_0x0046
            r0 = 2097152(0x200000, float:2.938736E-39)
        L_0x0046:
            if (r3 == 0) goto L_0x004a
            r1 = 1048576(0x100000, float:1.469368E-39)
        L_0x004a:
            r0 = r0 | r6
            r0 = r0 | r1
            switch(r0) {
                case 0: goto L_0x0075;
                case 1: goto L_0x0075;
                case 2: goto L_0x00e2;
                case 3: goto L_0x00e6;
                case 4: goto L_0x00ea;
                case 5: goto L_0x00ee;
                case 6: goto L_0x00f2;
                case 7: goto L_0x00f6;
                default: goto L_0x004f;
            }
        L_0x004f:
            switch(r0) {
                case 1048576: goto L_0x00ca;
                case 1048577: goto L_0x00de;
                case 1048578: goto L_0x00ce;
                case 1048579: goto L_0x00ca;
                case 1048580: goto L_0x00ca;
                case 1048581: goto L_0x00d2;
                case 1048582: goto L_0x00d6;
                case 1048583: goto L_0x00da;
                default: goto L_0x0052;
            }
        L_0x0052:
            switch(r0) {
                case 2097152: goto L_0x00ae;
                case 2097153: goto L_0x00ae;
                case 2097154: goto L_0x00b2;
                case 2097155: goto L_0x00b6;
                case 2097156: goto L_0x00ba;
                case 2097157: goto L_0x00be;
                case 2097158: goto L_0x00c2;
                case 2097159: goto L_0x00c6;
                default: goto L_0x0055;
            }
        L_0x0055:
            switch(r0) {
                case 3145728: goto L_0x009a;
                case 3145729: goto L_0x00de;
                case 3145730: goto L_0x009e;
                case 3145731: goto L_0x009a;
                case 3145732: goto L_0x009a;
                case 3145733: goto L_0x00a2;
                case 3145734: goto L_0x00a6;
                case 3145735: goto L_0x00aa;
                default: goto L_0x0058;
            }
        L_0x0058:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ConversationRowFuture/unhandled future message type: fromMe: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "; isCompanion: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "; type: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r6)
            X.C626936e.A0D(r4, r0)
        L_0x0075:
            r2 = 2131889494(0x7f120d56, float:1.9413653E38)
        L_0x0078:
            android.content.Context r1 = r7.getContext()
            if (r3 == 0) goto L_0x008f
            java.lang.String r0 = r1.getString(r2)
        L_0x0082:
            android.text.SpannableString r1 = X.C87094Nz.A09(r7, r0)
            X.33i r0 = r7.A0L
            X.AnonymousClass0x2.A12(r5, r0)
            r5.setText(r1)
            return
        L_0x008f:
            X.2i5 r0 = r7.A00
            android.net.Uri r0 = r0.A00()
            java.lang.String r0 = X.AnonymousClass5Z5.A01(r1, r0, r2)
            goto L_0x0082
        L_0x009a:
            r2 = 2131888023(0x7f120797, float:1.941067E38)
            goto L_0x0078
        L_0x009e:
            r2 = 2131888025(0x7f120799, float:1.9410674E38)
            goto L_0x0078
        L_0x00a2:
            r2 = 2131889476(0x7f120d44, float:1.9413617E38)
            goto L_0x0078
        L_0x00a6:
            r2 = 2131889484(0x7f120d4c, float:1.9413633E38)
            goto L_0x0078
        L_0x00aa:
            r2 = 2131889488(0x7f120d50, float:1.941364E38)
            goto L_0x0078
        L_0x00ae:
            r2 = 2131889493(0x7f120d55, float:1.9413651E38)
            goto L_0x0078
        L_0x00b2:
            r2 = 2131889498(0x7f120d5a, float:1.9413661E38)
            goto L_0x0078
        L_0x00b6:
            r2 = 2131892593(0x7f121971, float:1.9419939E38)
            goto L_0x0078
        L_0x00ba:
            r2 = 2131889481(0x7f120d49, float:1.9413627E38)
            goto L_0x0078
        L_0x00be:
            r2 = 2131889477(0x7f120d45, float:1.9413619E38)
            goto L_0x0078
        L_0x00c2:
            r2 = 2131889485(0x7f120d4d, float:1.9413635E38)
            goto L_0x0078
        L_0x00c6:
            r2 = 2131889489(0x7f120d51, float:1.9413643E38)
            goto L_0x0078
        L_0x00ca:
            r2 = 2131888022(0x7f120796, float:1.9410668E38)
            goto L_0x0078
        L_0x00ce:
            r2 = 2131888024(0x7f120798, float:1.9410672E38)
            goto L_0x0078
        L_0x00d2:
            r2 = 2131889475(0x7f120d43, float:1.9413615E38)
            goto L_0x0078
        L_0x00d6:
            r2 = 2131889483(0x7f120d4b, float:1.941363E38)
            goto L_0x0078
        L_0x00da:
            r2 = 2131889487(0x7f120d4f, float:1.9413639E38)
            goto L_0x0078
        L_0x00de:
            r2 = 2131888021(0x7f120795, float:1.9410666E38)
            goto L_0x0078
        L_0x00e2:
            r2 = 2131889499(0x7f120d5b, float:1.9413663E38)
            goto L_0x0078
        L_0x00e6:
            r2 = 2131892592(0x7f121970, float:1.9419937E38)
            goto L_0x0078
        L_0x00ea:
            r2 = 2131889482(0x7f120d4a, float:1.9413629E38)
            goto L_0x0078
        L_0x00ee:
            r2 = 2131889478(0x7f120d46, float:1.941362E38)
            goto L_0x0078
        L_0x00f2:
            r2 = 2131889486(0x7f120d4e, float:1.9413637E38)
            goto L_0x0078
        L_0x00f6:
            r2 = 2131889490(0x7f120d52, float:1.9413645E38)
            goto L_0x0078
        L_0x00fb:
            X.4uZ r0 = r6.A00
            boolean r0 = r0 instanceof X.C95804uY
            if (r0 == 0) goto L_0x0104
            r6 = 2
            goto L_0x0040
        L_0x0104:
            boolean r0 = r10 instanceof X.C30351mJ
            if (r0 == 0) goto L_0x0121
            X.1mJ r10 = (X.C30351mJ) r10
            int r1 = r10.A00
            r0 = 74
            if (r1 == r0) goto L_0x012d
            r0 = 79
            if (r1 == r0) goto L_0x012a
            r0 = 81
            if (r1 == r0) goto L_0x0127
            r0 = 83
            if (r1 == r0) goto L_0x0124
            r0 = 85
            r6 = 7
            if (r1 == r0) goto L_0x0040
        L_0x0121:
            r6 = 0
            goto L_0x0040
        L_0x0124:
            r6 = 6
            goto L_0x0040
        L_0x0127:
            r6 = 5
            goto L_0x0040
        L_0x012a:
            r6 = 3
            goto L_0x0040
        L_0x012d:
            r6 = 4
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92504mn.<init>(android.content.Context, X.677, X.34x):void");
    }

    public int getCenteredLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f8nameremoved;
    }
}
