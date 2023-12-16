package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.3TP  reason: invalid class name */
public class AnonymousClass3TP implements AnonymousClass4EZ {
    public final int A00;
    public final C55682qk A01;
    public final AnonymousClass1VX A02;
    public final C66493Lq A03;
    public final C49052fu A04;
    public final AnonymousClass31C A05;

    public final void A00(AnonymousClass4EZ r15) {
        Log.i("GroupRequestProtocolHelper/sendGetGroups/get-groups");
        AnonymousClass31C r7 = this.A05;
        String A032 = r7.A03();
        ArrayList A0s = AnonymousClass001.A0s();
        int i = this.A00;
        if ((i & 1) != 0) {
            AnonymousClass36K.A0R("participants", A0s, (AnonymousClass39V[]) null);
        }
        if ((i & 2) != 0) {
            AnonymousClass36K.A0R("description", A0s, (AnonymousClass39V[]) null);
        }
        AnonymousClass36K A0J = AnonymousClass36K.A0J("participating", (AnonymousClass39V[]) null, C18280x3.A1a(A0s, 0));
        AnonymousClass39V[] A0H = AnonymousClass39V.A0H(A032, 0);
        AnonymousClass39V.A0C("xmlns", "w:g2", A0H, 1, 2);
        A0H[3] = new AnonymousClass39V((Jid) C28041fO.A00, "to");
        AnonymousClass4EZ r8 = r15;
        r7.A0E(r8, AnonymousClass36K.A0J("iq", A0H, new AnonymousClass36K[]{A0J}), A032, 19, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b2, code lost:
        if (r7.equals("false") == false) goto L_0x00b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BdM(X.AnonymousClass36K r46, java.lang.String r47) {
        /*
            r45 = this;
            r1 = r45
            X.1VX r3 = r1.A02
            r2 = 6350(0x18ce, float:8.898E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r3.A0Y(r0, r2)
            r2 = r46
            if (r0 == 0) goto L_0x005b
            X.36J r7 = X.AnonymousClass36J.A00     // Catch:{ 24P -> 0x0191 }
            int r5 = r1.A00     // Catch:{ 24P -> 0x0191 }
            r0 = 12
            X.4Jv r6 = new X.4Jv     // Catch:{ 24P -> 0x0191 }
            r6.<init>(r1, r0)     // Catch:{ 24P -> 0x0191 }
            r0 = 13
            X.4Jv r4 = new X.4Jv     // Catch:{ 24P -> 0x0191 }
            r4.<init>(r1, r0)     // Catch:{ 24P -> 0x0191 }
            r0 = 1
            X.C162457s7.A0J(r2, r0)     // Catch:{ 24P -> 0x0191 }
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()     // Catch:{ 24P -> 0x0191 }
            java.lang.String r0 = "groups"
            X.36K r2 = r2.A0l(r0)     // Catch:{ 24P -> 0x0191 }
            if (r2 == 0) goto L_0x0054
            java.lang.String r0 = "group"
            java.util.List r0 = r2.A0s(r0)     // Catch:{ 24P -> 0x0191 }
            X.C162457s7.A0D(r0)     // Catch:{ 24P -> 0x0191 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ 24P -> 0x0191 }
        L_0x003f:
            boolean r0 = r2.hasNext()     // Catch:{ 24P -> 0x0191 }
            if (r0 == 0) goto L_0x0054
            X.36K r0 = X.C18310x6.A0Y(r2)     // Catch:{ 24P -> 0x0191 }
            X.C162457s7.A0H(r0)     // Catch:{ 24P -> 0x0191 }
            X.2zA r0 = r7.A0A(r0, r6, r4, r5)     // Catch:{ 24P -> 0x0191 }
            r3.add(r0)     // Catch:{ 24P -> 0x0191 }
            goto L_0x003f
        L_0x0054:
            X.2fu r2 = r1.A04     // Catch:{ 24P -> 0x0191 }
            r0 = 0
            r2.A00(r3, r0, r5)     // Catch:{ 24P -> 0x0191 }
            return
        L_0x005b:
            X.3Lq r10 = r1.A03
            java.lang.String r0 = "groups"
            X.36K r2 = r2.A0l(r0)
            java.util.HashSet r6 = X.AnonymousClass002.A0K()     // Catch:{ 24P -> 0x0191 }
            if (r2 == 0) goto L_0x018b
            java.lang.String r0 = "group"
            java.util.Iterator r9 = X.AnonymousClass36K.A0M(r2, r0)     // Catch:{ 24P -> 0x0191 }
        L_0x006f:
            boolean r0 = r9.hasNext()     // Catch:{ 24P -> 0x0191 }
            if (r0 == 0) goto L_0x018b
            X.36K r0 = X.C18310x6.A0Y(r9)     // Catch:{ 24P -> 0x0191 }
            r4 = 0
            X.1fJ r12 = X.AnonymousClass36K.A08(r0)     // Catch:{ 24P -> 0x0191 }
            com.whatsapp.jid.UserJid r14 = X.AnonymousClass36K.A09(r0)     // Catch:{ 24P -> 0x0191 }
            java.lang.String r2 = "creation"
            java.lang.String r5 = r0.A0r(r2, r4)     // Catch:{ 24P -> 0x0191 }
            r2 = 0
            long r25 = X.C615531h.A04(r5, r2)     // Catch:{ 24P -> 0x0191 }
            r7 = 1000(0x3e8, double:4.94E-321)
            long r25 = r25 * r7
            r10.A0Y(r14, r0)     // Catch:{ 24P -> 0x0191 }
            java.lang.String r5 = "subject"
            java.lang.String r18 = r0.A0r(r5, r4)     // Catch:{ 24P -> 0x0191 }
            long r27 = X.C615531h.A02(r0)     // Catch:{ 24P -> 0x0191 }
            long r27 = r27 * r7
            java.lang.String r5 = "ack"
            java.lang.String r7 = r0.A0r(r5, r4)     // Catch:{ 24P -> 0x0191 }
            if (r7 == 0) goto L_0x00b4
            java.lang.String r5 = "false"
            boolean r5 = r7.equals(r5)     // Catch:{ 24P -> 0x0191 }
            r40 = 0
            if (r5 != 0) goto L_0x00b6
        L_0x00b4:
            r40 = 1
        L_0x00b6:
            java.lang.String r5 = "type"
            r0.A0r(r5, r4)     // Catch:{ 24P -> 0x0191 }
            java.lang.String r5 = "locked"
            X.36K r5 = r0.A0l(r5)     // Catch:{ 24P -> 0x0191 }
            boolean r34 = X.AnonymousClass000.A1W(r5)
            java.lang.String r5 = "announcement"
            X.36K r5 = r0.A0l(r5)     // Catch:{ 24P -> 0x0191 }
            boolean r35 = X.AnonymousClass000.A1W(r5)
            java.lang.String r5 = "incognito"
            X.36K r5 = r0.A0l(r5)     // Catch:{ 24P -> 0x0191 }
            boolean r38 = X.AnonymousClass000.A1W(r5)
            java.lang.String r5 = "no_frequently_forwarded"
            X.36K r5 = r0.A0l(r5)     // Catch:{ 24P -> 0x0191 }
            boolean r36 = X.AnonymousClass000.A1W(r5)
            java.lang.String r5 = "suspended"
            X.36K r5 = r0.A0l(r5)     // Catch:{ 24P -> 0x0191 }
            boolean r37 = X.AnonymousClass000.A1W(r5)
            java.lang.String r5 = "support"
            X.36K r5 = r0.A0l(r5)     // Catch:{ 24P -> 0x0191 }
            boolean r33 = X.AnonymousClass000.A1W(r5)
            java.lang.String r5 = "p_v_id"
            long r29 = r0.A0e(r5, r2)     // Catch:{ 24P -> 0x0191 }
            java.lang.String r5 = "a_v_id"
            long r31 = r0.A0e(r5, r2)     // Catch:{ 24P -> 0x0191 }
            java.lang.String r2 = "addressing_mode"
            java.lang.String r7 = r0.A0r(r2, r4)     // Catch:{ 24P -> 0x0191 }
            java.lang.String r2 = "allow_admin_reports"
            X.36K r2 = r0.A0l(r2)     // Catch:{ 24P -> 0x0191 }
            boolean r41 = X.AnonymousClass000.A1W(r2)
            java.lang.String r2 = "allow_non_admin_sub_group_creation"
            X.36K r2 = r0.A0l(r2)     // Catch:{ 24P -> 0x0191 }
            boolean r42 = X.AnonymousClass000.A1W(r2)
            int r2 = r1.A00     // Catch:{ 24P -> 0x0191 }
            r3 = r2 & 1
            if (r3 == 0) goto L_0x0139
            X.2qk r3 = r1.A01     // Catch:{ 24P -> 0x0191 }
            java.util.Map r5 = X.AnonymousClass36J.A06(r0, r3)     // Catch:{ 24P -> 0x0191 }
            int r3 = X.C615531h.A00(r0, r5)     // Catch:{ 24P -> 0x0191 }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r3)     // Catch:{ 24P -> 0x0191 }
        L_0x0136:
            X.2zN r15 = X.C60912zN.A05     // Catch:{ 24P -> 0x0191 }
            goto L_0x013d
        L_0x0139:
            r17 = r4
            r5 = r4
            goto L_0x0136
        L_0x013d:
            r2 = r2 & 2
            if (r2 == 0) goto L_0x0145
            X.2zN r15 = X.AnonymousClass36J.A04(r0)     // Catch:{ 24P -> 0x0191 }
        L_0x0145:
            X.36J r2 = X.AnonymousClass36J.A00     // Catch:{ 24P -> 0x0191 }
            int r21 = X.AnonymousClass36J.A00(r0)     // Catch:{ 24P -> 0x0191 }
            X.2fO r16 = r2.A0B(r0)     // Catch:{ 24P -> 0x0191 }
            java.lang.String r3 = "group_history"
            X.36K r3 = r0.A0l(r3)     // Catch:{ 24P -> 0x0191 }
            boolean r43 = X.AnonymousClass000.A1W(r3)
            java.lang.String r3 = "auto_add_disabled"
            X.36K r3 = r0.A0l(r3)     // Catch:{ 24P -> 0x0191 }
            boolean r44 = X.AnonymousClass000.A1W(r3)
            r3 = 3
            X.334 r11 = new X.334     // Catch:{ 24P -> 0x0191 }
            r11.<init>((java.lang.String) r4, (int) r3)     // Catch:{ 24P -> 0x0191 }
            int r22 = X.AnonymousClass36J.A02(r0)     // Catch:{ 24P -> 0x0191 }
            X.1fJ r13 = X.AnonymousClass36J.A03(r0)     // Catch:{ 24P -> 0x0191 }
            boolean r39 = X.AnonymousClass36J.A08(r0)     // Catch:{ 24P -> 0x0191 }
            int r23 = r2.A09(r0)     // Catch:{ 24P -> 0x0191 }
            java.lang.String r19 = X.C381125t.A00(r7)     // Catch:{ 24P -> 0x0191 }
            int r24 = X.AnonymousClass36J.A01(r0)     // Catch:{ 24P -> 0x0191 }
            r20 = r5
            r10.A0I(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r29, r31, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)     // Catch:{ 24P -> 0x0191 }
            r6.add(r12)     // Catch:{ 24P -> 0x0191 }
            goto L_0x006f
        L_0x018b:
            int r0 = r1.A00     // Catch:{ 24P -> 0x0191 }
            r10.A0d(r6, r0)     // Catch:{ 24P -> 0x0191 }
            return
        L_0x0191:
            r2 = move-exception
            java.lang.String r0 = "GroupRequestProtocolHelper/error/groupInitFailed"
            com.whatsapp.util.Log.e(r0, r2)
            X.2qk r3 = r1.A01
            java.lang.String r2 = "invalid-jid-received"
            r1 = 1
            java.lang.String r0 = "GroupRequestProtocolHelper/handleInvalidJidReceived"
            r3.A0A(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3TP.BdM(X.36K, java.lang.String):void");
    }

    public AnonymousClass3TP(C55682qk r1, AnonymousClass1VX r2, C66493Lq r3, C49052fu r4, AnonymousClass31C r5, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A05 = r5;
        this.A03 = r3;
        this.A04 = r4;
        this.A00 = i;
    }

    public void BQs(String str) {
        C18260x0.A0r("GroupRequestProtocolHelper/onDeliveryFailure/iqId=", str, AnonymousClass001.A0o());
        this.A03.A0A(this.A00);
    }

    public void BSN(AnonymousClass36K r3, String str) {
        C18260x0.A0r("GroupRequestProtocolHelper/onError/iqId=", str, AnonymousClass001.A0o());
        this.A03.A0A(this.A00);
    }
}
