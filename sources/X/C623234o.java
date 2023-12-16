package X;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.34o  reason: invalid class name and case insensitive filesystem */
public final class C623234o {
    public static final AnonymousClass66R A0D = C154517dI.A00(AnonymousClass58H.NONE, AnonymousClass40P.A00);
    public final C56972sr A00;
    public final C106155Xv A01;
    public final C47852dw A02;
    public final C54292oU A03;
    public final C620733j A04;
    public final C56762sW A05;
    public final C66543Lv A06;
    public final C56892sj A07;
    public final AnonymousClass1VX A08;
    public final C55832qz A09;
    public final C187958y5 A0A;
    public final AnonymousClass4FS A0B;
    public final AnonymousClass66R A0C = C154517dI.A00(AnonymousClass58H.NONE, new C77273t8(this));

    public static final int A00(C30401mO r3) {
        AnonymousClass3ZF r1;
        C162457s7.A0J(r3, 0);
        if (!r3.A1y() || (r1 = r3.A01) == null) {
            return 0;
        }
        if (r3.A20()) {
            return R.drawable.vec_anim_voice_chat;
        }
        if (r1.A0L) {
            return R.drawable.vec_anim_video_call;
        }
        return R.drawable.vec_anim_voice_call;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008a, code lost:
        if (A09(r2) != false) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A02(X.C30401mO r4) {
        /*
            r3 = this;
            r0 = 0
            X.C162457s7.A0J(r4, r0)
            X.3ZF r2 = r4.A01
            if (r2 != 0) goto L_0x000c
            r1 = 2131887341(0x7f1204ed, float:1.9409286E38)
        L_0x000b:
            return r1
        L_0x000c:
            boolean r0 = r4.A1w()
            if (r0 == 0) goto L_0x0016
            r1 = 2131887336(0x7f1204e8, float:1.9409276E38)
            return r1
        L_0x0016:
            boolean r0 = r4.A1v()
            if (r0 == 0) goto L_0x0035
            X.2z0 r0 = r4.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x00ad
            boolean r0 = r4.A1x()
            if (r0 == 0) goto L_0x00ad
            boolean r0 = r3.A09(r2)
            r1 = 2131887335(0x7f1204e7, float:1.9409274E38)
            if (r0 == 0) goto L_0x000b
            r1 = 2131887344(0x7f1204f0, float:1.9409292E38)
            return r1
        L_0x0035:
            X.3ZF r0 = r4.A01
            if (r0 == 0) goto L_0x0074
            com.whatsapp.jid.GroupJid r0 = r0.A05
            if (r0 == 0) goto L_0x0074
            X.2z0 r0 = r4.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x005f
            boolean r0 = r4.A1x()
            if (r0 == 0) goto L_0x005f
            boolean r1 = r3.A09(r2)
            boolean r0 = r4.A20()
            if (r1 == 0) goto L_0x0059
            if (r0 == 0) goto L_0x008c
            r1 = 2131887347(0x7f1204f3, float:1.9409299E38)
            return r1
        L_0x0059:
            if (r0 == 0) goto L_0x0097
            r1 = 2131887337(0x7f1204e9, float:1.9409278E38)
            return r1
        L_0x005f:
            boolean r0 = r4.A20()
            if (r0 == 0) goto L_0x0069
            r1 = 2131887340(0x7f1204ec, float:1.9409284E38)
            return r1
        L_0x0069:
            boolean r0 = r2.A0L
            r1 = 2131887339(0x7f1204eb, float:1.9409282E38)
            if (r0 == 0) goto L_0x000b
            r1 = 2131887338(0x7f1204ea, float:1.940928E38)
            return r1
        L_0x0074:
            boolean r0 = r4.A1z()
            if (r0 != 0) goto L_0x00a2
            X.2z0 r0 = r4.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x00a2
            boolean r0 = r4.A1x()
            if (r0 == 0) goto L_0x00a2
            boolean r0 = r3.A09(r2)
            if (r0 == 0) goto L_0x0097
        L_0x008c:
            boolean r0 = r2.A0L
            r1 = 2131887346(0x7f1204f2, float:1.9409296E38)
            if (r0 == 0) goto L_0x000b
            r1 = 2131887345(0x7f1204f1, float:1.9409294E38)
            return r1
        L_0x0097:
            boolean r0 = r2.A0L
            r1 = 2131887343(0x7f1204ef, float:1.940929E38)
            if (r0 == 0) goto L_0x000b
            r1 = 2131887342(0x7f1204ee, float:1.9409288E38)
            return r1
        L_0x00a2:
            boolean r0 = r2.A0L
            r1 = 2131887349(0x7f1204f5, float:1.9409303E38)
            if (r0 == 0) goto L_0x000b
            r1 = 2131887348(0x7f1204f4, float:1.94093E38)
            return r1
        L_0x00ad:
            r1 = 2131887334(0x7f1204e6, float:1.9409272E38)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C623234o.A02(X.1mO):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0068, code lost:
        if (r2 != null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c3, code lost:
        if (r15.A20() != false) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0101, code lost:
        if (r15.A20() != false) goto L_0x00c5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A05(android.content.res.Resources r14, X.C30401mO r15, java.lang.String r16) {
        /*
            r13 = this;
            r5 = 0
            X.C162457s7.A0J(r15, r5)
            r4 = 1
            X.3ZF r3 = r15.A01
            if (r3 != 0) goto L_0x000b
            r0 = 0
            return r0
        L_0x000b:
            boolean r0 = r15.A1w()
            if (r0 == 0) goto L_0x0019
            r0 = 2131887321(0x7f1204d9, float:1.9409246E38)
        L_0x0014:
            java.lang.String r0 = r14.getString(r0)
            return r0
        L_0x0019:
            boolean r0 = r15.A1v()
            r8 = 2
            r7 = 100
            if (r0 == 0) goto L_0x009f
            X.2z0 r1 = r15.A1J
            X.4uZ r9 = r1.A00
            com.whatsapp.jid.UserJid r2 = X.AnonymousClass32Y.A05(r9)
            if (r2 != 0) goto L_0x0044
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CallingMessageUtil/getAdHocGroupCallLogMessageText: peerjid is null. This is group jid: "
            r6.append(r0)
            boolean r0 = r9 instanceof com.whatsapp.jid.GroupJid
            r6.append(r0)
            java.lang.String r0 = " and callType is "
            r6.append(r0)
            int r0 = r3.A0H
            X.C18270x1.A1F(r6, r0)
        L_0x0044:
            boolean r0 = r15.A1z()
            if (r0 != 0) goto L_0x026b
            boolean r0 = r15.A1y()
            if (r0 == 0) goto L_0x01b4
            boolean r1 = r1.A02
            r6 = r16
            if (r1 == 0) goto L_0x0068
            if (r2 == 0) goto L_0x0086
            int r0 = r3.A04(r2)
            if (r0 != r8) goto L_0x006a
            r1 = 2131887317(0x7f1204d5, float:1.9409238E38)
        L_0x0061:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r0 = X.C18320x8.A0b(r14, r6, r0, r5, r1)
            return r0
        L_0x0068:
            if (r2 == 0) goto L_0x0086
        L_0x006a:
            int r0 = r3.A04(r2)
            if (r0 != r7) goto L_0x0086
            r2 = 2131887316(0x7f1204d4, float:1.9409236E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.util.List r0 = r3.A08()
            int r0 = r0.size()
            int r0 = r0 - r4
            X.AnonymousClass000.A1P(r1, r0, r5)
            java.lang.String r0 = X.C18320x8.A0b(r14, r6, r1, r4, r2)
            return r0
        L_0x0086:
            X.2sr r2 = r13.A00
            int r0 = r3.A03(r2)
            if (r0 != r7) goto L_0x0093
            r7 = 2131887318(0x7f1204d6, float:1.940924E38)
            goto L_0x01c1
        L_0x0093:
            if (r1 != 0) goto L_0x0266
            boolean r0 = r3.A0S(r2)
            if (r0 != 0) goto L_0x0266
            r1 = 2131887315(0x7f1204d3, float:1.9409234E38)
            goto L_0x0061
        L_0x009f:
            X.3ZF r0 = r15.A01
            r1 = 0
            if (r0 == 0) goto L_0x00a9
            com.whatsapp.jid.GroupJid r0 = r0.A05
            if (r0 == 0) goto L_0x00a9
            r1 = 1
        L_0x00a9:
            r11 = 1000(0x3e8, double:4.94E-321)
            boolean r0 = r15.A1z()
            if (r1 == 0) goto L_0x0205
            if (r0 == 0) goto L_0x00ca
            boolean r0 = r15.A20()
            if (r0 == 0) goto L_0x00bf
            X.2z0 r0 = r15.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x00ca
        L_0x00bf:
            boolean r0 = r15.A20()
            if (r0 == 0) goto L_0x026b
        L_0x00c5:
            r0 = 2131887331(0x7f1204e3, float:1.9409266E38)
            goto L_0x0014
        L_0x00ca:
            boolean r0 = r15.A1y()
            if (r0 == 0) goto L_0x0108
            X.2sr r1 = r13.A00
            int r0 = r3.A03(r1)
            if (r0 != r7) goto L_0x00f6
            r7 = 2131887326(0x7f1204de, float:1.9409256E38)
        L_0x00db:
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.util.Iterator r3 = X.AnonymousClass3ZF.A01(r3)
            r0 = 0
        L_0x00e2:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x01cc
            java.lang.Object r1 = r3.next()
            X.3ZE r1 = (X.AnonymousClass3ZE) r1
            int r2 = r1.A00
            r1 = 5
            if (r2 != r1) goto L_0x00e2
            int r0 = r0 + 1
            goto L_0x00e2
        L_0x00f6:
            int r1 = r3.A03(r1)
            r0 = 5
            if (r1 != r0) goto L_0x0104
            boolean r0 = r15.A20()
            if (r0 == 0) goto L_0x0266
            goto L_0x00c5
        L_0x0104:
            r7 = 2131887327(0x7f1204df, float:1.9409258E38)
            goto L_0x00db
        L_0x0108:
            X.2z0 r0 = r15.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x012a
            boolean r0 = r15.A1x()
            if (r0 == 0) goto L_0x0181
            boolean r0 = r15.A20()
            if (r0 == 0) goto L_0x0181
            X.3ZF r0 = r15.A01
            if (r0 == 0) goto L_0x0181
            r0.A0A()
            int r0 = r0.A02
            if (r0 != 0) goto L_0x0181
            r0 = 2131887328(0x7f1204e0, float:1.940926E38)
            goto L_0x0014
        L_0x012a:
            X.2sr r9 = r13.A00
            boolean r0 = r3.A0L()
            boolean r10 = X.AnonymousClass000.A1S(r0)
            java.util.Iterator r6 = X.AnonymousClass3ZF.A01(r3)
        L_0x0138:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x015e
            java.lang.Object r2 = r6.next()
            X.3ZE r2 = (X.AnonymousClass3ZE) r2
            com.whatsapp.jid.UserJid r0 = r2.A02
            boolean r0 = r9.A0a(r0)
            r1 = 5
            if (r0 == 0) goto L_0x0155
            if (r10 == 0) goto L_0x0181
            int r0 = r2.A00
            if (r0 != r1) goto L_0x0181
        L_0x0153:
            r10 = 1
            goto L_0x0138
        L_0x0155:
            if (r10 == 0) goto L_0x0181
            int r0 = r2.A00
            if (r0 == r1) goto L_0x0181
            if (r0 == r7) goto L_0x0181
            goto L_0x0153
        L_0x015e:
            if (r10 == 0) goto L_0x0181
            X.1VX r2 = r13.A08
            r1 = 5579(0x15cb, float:7.818E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x017c
            r7 = 2131887323(0x7f1204db, float:1.940925E38)
            java.lang.Object[] r6 = new java.lang.Object[r4]
            X.33j r2 = r13.A04
            int r0 = r3.A01
            long r0 = (long) r0
            long r0 = r0 * r11
            java.lang.String r0 = X.C107565bW.A09(r2, r0)
            goto L_0x01d0
        L_0x017c:
            r0 = 2131887324(0x7f1204dc, float:1.9409252E38)
            goto L_0x0014
        L_0x0181:
            X.1VX r2 = r13.A08
            r1 = 5579(0x15cb, float:7.818E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x01aa
            r7 = 2131887322(0x7f1204da, float:1.9409248E38)
            java.lang.Object[] r6 = new java.lang.Object[r8]
            X.33j r2 = r13.A04
            int r0 = r3.A01
            long r0 = (long) r0
            long r0 = r0 * r11
            java.lang.String r0 = X.C107565bW.A09(r2, r0)
            r6[r5] = r0
            int r0 = r3.A02()
            X.AnonymousClass000.A1P(r6, r0, r4)
            java.lang.String r0 = r14.getString(r7, r6)
            return r0
        L_0x01aa:
            r7 = 2131887325(0x7f1204dd, float:1.9409254E38)
            java.lang.Object[] r6 = new java.lang.Object[r4]
            int r0 = r3.A02()
            goto L_0x01cc
        L_0x01b4:
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x01d5
            int r0 = r3.A02()
            if (r0 != r4) goto L_0x01d5
            r7 = 2131887314(0x7f1204d2, float:1.9409232E38)
        L_0x01c1:
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.util.List r0 = r3.A08()
            int r0 = r0.size()
            int r0 = r0 - r4
        L_0x01cc:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x01d0:
            java.lang.String r0 = X.C18320x8.A0b(r14, r0, r6, r5, r7)
            return r0
        L_0x01d5:
            boolean r0 = r3.A0N()
            if (r0 == 0) goto L_0x01e8
            X.1VX r2 = r13.A08
            r1 = 1972(0x7b4, float:2.763E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x01e8
            goto L_0x023a
        L_0x01e8:
            boolean r0 = r3.A0O()
            if (r0 != 0) goto L_0x0261
            boolean r0 = r3.A0P()
            if (r0 == 0) goto L_0x0201
            X.1VX r2 = r13.A08
            r1 = 6307(0x18a3, float:8.838E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0201
            goto L_0x0257
        L_0x0201:
            r7 = 2131887313(0x7f1204d1, float:1.940923E38)
            goto L_0x01c1
        L_0x0205:
            if (r0 != 0) goto L_0x026b
            boolean r0 = r15.A1y()
            if (r0 != 0) goto L_0x0266
            int r1 = r3.A00
            r0 = 6
            if (r1 != r0) goto L_0x0217
            r0 = 2131887312(0x7f1204d0, float:1.9409228E38)
            goto L_0x0014
        L_0x0217:
            boolean r0 = r15.A1x()
            if (r0 == 0) goto L_0x0270
            X.2z0 r0 = r15.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0228
            r0 = 2131887329(0x7f1204e1, float:1.9409262E38)
            goto L_0x0014
        L_0x0228:
            boolean r0 = r3.A0N()
            if (r0 == 0) goto L_0x023f
            X.1VX r2 = r13.A08
            r1 = 1972(0x7b4, float:2.763E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x023f
        L_0x023a:
            r0 = 2131887332(0x7f1204e4, float:1.9409268E38)
            goto L_0x0014
        L_0x023f:
            boolean r0 = r3.A0O()
            if (r0 != 0) goto L_0x0261
            boolean r0 = r3.A0P()
            if (r0 == 0) goto L_0x025c
            X.1VX r2 = r13.A08
            r1 = 6307(0x18a3, float:8.838E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x025c
        L_0x0257:
            r0 = 2131887319(0x7f1204d7, float:1.9409242E38)
            goto L_0x0014
        L_0x025c:
            r0 = 2131887283(0x7f1204b3, float:1.9409169E38)
            goto L_0x0014
        L_0x0261:
            r0 = 2131887320(0x7f1204d8, float:1.9409244E38)
            goto L_0x0014
        L_0x0266:
            r0 = 2131887330(0x7f1204e2, float:1.9409264E38)
            goto L_0x0014
        L_0x026b:
            r0 = 2131887333(0x7f1204e5, float:1.940927E38)
            goto L_0x0014
        L_0x0270:
            X.33j r2 = r13.A04
            int r0 = r3.A01
            long r0 = (long) r0
            long r0 = r0 * r11
            java.lang.String r0 = X.C107565bW.A09(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C623234o.A05(android.content.res.Resources, X.1mO, java.lang.String):java.lang.String");
    }

    public final void A07(C95814uZ r9, AnonymousClass3ZF r10, Boolean bool, boolean z) {
        this.A0B.BkP(new C70643ap(r10, this, r9, bool, 0, z));
    }

    public final void A08(AnonymousClass3ZF r4, Set set, boolean z) {
        C95814uZ r1;
        C162457s7.A0J(set, 0);
        boolean z2 = !r4.A0L();
        if (set.size() > 1 || !z2) {
            GroupJid groupJid = r4.A05;
            AnonymousClass1VX r2 = this.A08;
            if (groupJid != null) {
                if (!r2.A0Y(C58422vE.A02, 4895) || (r1 = r4.A05) == null || r4.A0J != null) {
                    return;
                }
            } else if (set.size() >= 2 && r4.A05 == null && r4.A0I == null && r2.A0Y(C58422vE.A02, 4896)) {
                AnonymousClass39J r12 = r4.A0E;
                if (!r12.A03) {
                    r1 = r12.A01;
                    C162457s7.A0D(r1);
                } else {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        A07(C18300x5.A0P(it), r4, (Boolean) null, z);
                    }
                    return;
                }
            } else {
                return;
            }
            A07(r1, r4, (Boolean) null, z);
        } else if (this.A08.A0Y(C58422vE.A02, 4800)) {
            UserJid userJid = r4.A0E.A01;
            C162457s7.A0D(userJid);
            A07(userJid, r4, (Boolean) null, false);
        }
    }

    public static final boolean A01(C30401mO r4) {
        AnonymousClass3ZF r0;
        AnonymousClass2z0 r3 = r4.A1J;
        UserJid A052 = AnonymousClass32Y.A05(r3.A00);
        if (!r4.A1v() || !r3.A02 || A052 == null || (r0 = r4.A01) == null || r0.A0T(A052)) {
            return false;
        }
        return true;
    }

    public final void A06(C95814uZ r5, AnonymousClass3ZF r6) {
        C56762sW r3 = this.A05;
        AnonymousClass39J r0 = r6.A0E;
        C30401mO r1 = new C30401mO(r3.A04, AnonymousClass2z0.A05(r5, C627436k.A07(r0.A02), r0.A03), r6);
        r3.A0D.A02(r1);
        r3.A0O.put(r5, r1);
        C70093Zw.A00(r3.A0C.A02, r3, r6, 2);
    }

    public C623234o(C56972sr r3, C106155Xv r4, C47852dw r5, C54292oU r6, C620733j r7, C56762sW r8, C66543Lv r9, C56892sj r10, AnonymousClass1VX r11, C55832qz r12, C187958y5 r13, AnonymousClass4FS r14) {
        C18260x0.A0f(r11, r12, r8, r9, r10);
        C18260x0.A0g(r3, r5, r13, r4, r6);
        C18270x1.A13(r14, r7);
        this.A08 = r11;
        this.A09 = r12;
        this.A05 = r8;
        this.A06 = r9;
        this.A07 = r10;
        this.A00 = r3;
        this.A02 = r5;
        this.A0A = r13;
        this.A01 = r4;
        this.A03 = r6;
        this.A0B = r14;
        this.A04 = r7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0092, code lost:
        if (r7.A1w() != false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (X.C1001059l.A04 != false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00f5, code lost:
        if (r2 != false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00f9, code lost:
        r0 = com.whatsapp.R.drawable.call_log_bubble_voice_call_incoming;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0072 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable A03(android.content.Context r6, X.C30401mO r7, boolean r8) {
        /*
            r5 = this;
            X.C18260x0.A0O(r6, r7)
            X.3ZF r3 = r7.A01
            if (r3 != 0) goto L_0x00be
            boolean r0 = X.C1001059l.A04
            if (r0 == 0) goto L_0x00f9
        L_0x000b:
            r0 = 2131231218(0x7f0801f2, float:1.807851E38)
        L_0x000e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.3ZF r0 = r7.A01
            if (r0 == 0) goto L_0x00b9
            boolean r0 = r7.A1z()
            if (r0 != 0) goto L_0x0095
            boolean r0 = r7.A1y()
            if (r0 != 0) goto L_0x0095
            if (r8 == 0) goto L_0x002d
            X.3ZF r0 = r7.A01
            if (r0 == 0) goto L_0x0099
            int r2 = r0.A00
            r0 = 6
            if (r2 != r0) goto L_0x0099
        L_0x002d:
            X.3ZF r0 = r7.A01
            if (r0 == 0) goto L_0x0073
            int r2 = r0.A00
            r0 = 6
            if (r2 != r0) goto L_0x0073
        L_0x0036:
            r2 = 2131099965(0x7f06013d, float:1.7812298E38)
        L_0x0039:
            X.3Z6 r0 = X.AnonymousClass3Z6.A01(r1, r2)
            int r1 = X.AnonymousClass3Z6.A00(r0)
            java.lang.Object r0 = r0.second
            int r0 = X.AnonymousClass001.A0K(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.66R r0 = r5.A0C
            java.lang.Object r0 = r0.getValue()
            X.3Z1 r4 = new X.3Z1
            r4.<init>(r2, r1, r0)
            X.66R r3 = A0D
            java.lang.Object r0 = r3.getValue()
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            java.lang.Object r0 = r0.get(r4)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x00fe
            java.lang.Object r0 = r0.get()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            if (r0 == 0) goto L_0x00fe
            return r0
        L_0x0073:
            boolean r0 = A01(r7)
            if (r0 != 0) goto L_0x0036
            boolean r0 = r7.A1x()
            if (r0 == 0) goto L_0x008d
            X.2z0 r0 = r7.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0036
            X.3ZF r0 = r7.A01
            if (r0 == 0) goto L_0x0036
            com.whatsapp.jid.GroupJid r0 = r0.A05
            if (r0 == 0) goto L_0x0036
        L_0x008d:
            boolean r0 = r7.A1w()
            r2 = 0
            if (r0 == 0) goto L_0x0039
            goto L_0x0036
        L_0x0095:
            r2 = 2131099966(0x7f06013e, float:1.78123E38)
            goto L_0x0039
        L_0x0099:
            boolean r0 = r7.A1x()
            if (r0 == 0) goto L_0x00ad
            X.3ZF r0 = r7.A01
            if (r0 == 0) goto L_0x002d
            com.whatsapp.jid.GroupJid r0 = r0.A05
            if (r0 == 0) goto L_0x002d
            X.2z0 r0 = r7.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x002d
        L_0x00ad:
            boolean r0 = r7.A1v()
            if (r0 == 0) goto L_0x00b9
            boolean r0 = A01(r7)
            if (r0 != 0) goto L_0x002d
        L_0x00b9:
            r2 = 2131102351(0x7f060a8f, float:1.7817137E38)
            goto L_0x0039
        L_0x00be:
            boolean r0 = r7.A20()
            if (r0 == 0) goto L_0x00c9
            r0 = 2131231223(0x7f0801f7, float:1.807852E38)
            goto L_0x000e
        L_0x00c9:
            boolean r2 = X.C1001059l.A04
            X.2z0 r0 = r7.A1J
            boolean r1 = r0.A02
            boolean r0 = r3.A0L
            if (r1 == 0) goto L_0x00e9
            if (r0 == 0) goto L_0x00df
            r0 = 2131231214(0x7f0801ee, float:1.8078503E38)
            if (r2 == 0) goto L_0x000e
            r0 = 2131231215(0x7f0801ef, float:1.8078505E38)
            goto L_0x000e
        L_0x00df:
            r0 = 2131231220(0x7f0801f4, float:1.8078515E38)
            if (r2 == 0) goto L_0x000e
            r0 = 2131231221(0x7f0801f5, float:1.8078517E38)
            goto L_0x000e
        L_0x00e9:
            if (r0 == 0) goto L_0x00f5
            r0 = 2131231211(0x7f0801eb, float:1.8078497E38)
            if (r2 == 0) goto L_0x000e
            r0 = 2131231212(0x7f0801ec, float:1.8078499E38)
            goto L_0x000e
        L_0x00f5:
            if (r2 == 0) goto L_0x00f9
            goto L_0x000b
        L_0x00f9:
            r0 = 2131231217(0x7f0801f1, float:1.8078509E38)
            goto L_0x000e
        L_0x00fe:
            java.lang.Object r0 = r4.first
            int r1 = X.AnonymousClass001.A0K(r0)
            java.lang.Object r0 = r4.second
            int r0 = X.AnonymousClass001.A0K(r0)
            android.graphics.drawable.Drawable r2 = X.C107335b8.A04(r6, r1, r0)
            X.C162457s7.A0D(r2)
            java.lang.Object r1 = r3.getValue()
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            java.lang.ref.WeakReference r0 = X.AnonymousClass0x9.A14(r2)
            r1.put(r4, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C623234o.A03(android.content.Context, X.1mO, boolean):android.graphics.drawable.Drawable");
    }

    public final CharSequence A04(C54292oU r7, Integer num, int i, int i2) {
        Object[] objArr;
        String A042 = C54292oU.A04(r7, i2);
        if (num != null) {
            objArr = C18310x6.A1b(A042, 0);
            objArr[1] = num;
        } else {
            objArr = new Object[]{A042};
        }
        String string = C54292oU.A00(r7).getString(i, objArr);
        C162457s7.A0H(string);
        int A0G = C175728Zm.A0G(string, A042, 0, false);
        int length = A042.length() + A0G;
        int A043 = AnonymousClass0Y8.A04(r7.A00, R.color.f5nameremoved);
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new ForegroundColorSpan(A043), A0G, length, 33);
        spannableString.setSpan(new StyleSpan(1), A0G, length, 33);
        return spannableString;
    }

    public final boolean A09(AnonymousClass3ZF r4) {
        if (r4.A0O()) {
            return true;
        }
        if (r4.A0N() && this.A08.A0Y(C58422vE.A02, 1972)) {
            return true;
        }
        if (!r4.A0P()) {
            return false;
        }
        AnonymousClass1VX r2 = this.A08;
        if (!r2.A0Y(C58422vE.A02, 6307) || C627436k.A0F(r2)) {
            return false;
        }
        return true;
    }
}
