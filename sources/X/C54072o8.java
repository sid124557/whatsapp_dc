package X;

import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.2o8  reason: invalid class name and case insensitive filesystem */
public final class C54072o8 {
    public final C89654ea A00;
    public final C69263Wi A01;
    public final C56972sr A02;
    public final AnonymousClass2ZR A03;
    public final C29441ip A04;
    public final C64773Ex A05;
    public final AnonymousClass5ZU A06;
    public final C28891hw A07;
    public final C56892sj A08;
    public final C66493Lq A09;
    public final C66503Lr A0A;
    public final C27991fJ A0B;
    public final C56072rN A0C;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r2 != 2) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(com.whatsapp.jid.UserJid r15, java.lang.Integer r16) {
        /*
            r14 = this;
            r6 = r14
            X.2sj r0 = r14.A08
            X.1fJ r8 = r14.A0B
            X.33k r0 = X.C56892sj.A01(r0, r8)
            r9 = r15
            X.2zG r0 = r0.A05(r15)
            if (r0 == 0) goto L_0x0016
            int r2 = r0.A01
            r1 = 2
            r0 = 1
            if (r2 == r1) goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            r5 = 0
            if (r0 == 0) goto L_0x007d
            X.2sr r0 = r14.A02
            boolean r0 = r0.A0a(r15)
            if (r0 == 0) goto L_0x0069
            X.2rN r0 = r14.A0C
            boolean r0 = r0.A06(r8)
            if (r0 == 0) goto L_0x0069
            r2 = 2131888580(0x7f1209c4, float:1.94118E38)
            X.4ea r1 = r14.A00
            boolean r0 = r1.BHW()
            if (r0 != 0) goto L_0x0042
            X.0zH r0 = X.AnonymousClass5V0.A00(r1)
            X.C19340zH.A01(r1, r0, r2)
            X.C19340zH.A06(r0)
            X.C18280x3.A0q(r0)
        L_0x0042:
            X.2ZR r0 = r14.A03
            if (r0 == 0) goto L_0x0068
            X.2bx r1 = r0.A02
            X.2sr r0 = r1.A02
            boolean r0 = r0.A0a(r15)
            if (r0 == 0) goto L_0x0068
            X.2jf r3 = r1.A04
            r2 = 1
            X.1Y6 r1 = X.AnonymousClass1Y6.A00(r3)
            java.lang.Integer r0 = X.C18280x3.A0S()
            r1.A02 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.A00 = r0
            X.4FV r0 = r3.A01
            r0.BhD(r1)
        L_0x0068:
            return
        L_0x0069:
            X.4ea r4 = r14.A00
            r3 = 2131889118(0x7f120bde, float:1.941289E38)
            java.lang.Object[] r2 = X.AnonymousClass002.A0L()
            X.5ZU r1 = r14.A06
            X.3Ex r0 = r14.A05
            X.C64773Ex.A01(r0, r1, r15, r2)
            r4.Box(r2, r5, r3)
            return
        L_0x007d:
            X.1ip r0 = r14.A04
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x0099
            X.3Wi r2 = r14.A01
            X.4ea r0 = r14.A00
            boolean r1 = X.C29441ip.A02(r0)
            r0 = 2131890926(0x7f1212ee, float:1.9416558E38)
            if (r1 == 0) goto L_0x0095
            r0 = 2131890927(0x7f1212ef, float:1.941656E38)
        L_0x0095:
            r2.A0H(r0, r5)
            return
        L_0x0099:
            X.4ea r2 = r14.A00
            r1 = 2131891659(0x7f1215cb, float:1.9418044E38)
            r0 = 2131892992(0x7f121b00, float:1.9420748E38)
            r2.BpA(r1, r0)
            X.3Lq r7 = r14.A09
            X.1hw r5 = r14.A07
            java.util.List r11 = java.util.Collections.singletonList(r15)
            r12 = 92
            X.1dw r4 = new X.1dw
            r10 = r16
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            X.3Lr r6 = r14.A0A
            X.8qC r1 = r6.A0A
            java.lang.Object r0 = r1.get()
            X.2rN r0 = (X.C56072rN) r0
            X.1fJ r8 = r4.A03
            boolean r13 = r0.A06(r8)
            java.lang.String r10 = "demote"
            java.util.List r11 = r4.A05
            X.C626936e.A06(r11)
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x00ea
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GroupIqResponseUtil/remove-admin/timeout; groupId="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = "; participants="
            X.C18260x0.A1Q(r1, r0, r11)
            r9 = 0
        L_0x00e2:
            X.8TE r7 = X.AnonymousClass8TE.create()
            r6.A07(r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x00ea:
            java.lang.Object r0 = r1.get()
            X.2rN r0 = (X.C56072rN) r0
            boolean r5 = r0.A06(r8)
            X.3T1 r9 = new X.3T1
            r3 = r4
            r0 = r9
            r1 = r4
            r2 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x00e2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54072o8.A01(com.whatsapp.jid.UserJid, java.lang.Integer):void");
    }

    public void A00(UserJid userJid, Integer num) {
        int A022;
        AnonymousClass4KY r12;
        if (!A02()) {
            C56892sj r3 = this.A08;
            C27991fJ r6 = this.A0B;
            if (r3.A04.A06(r6) == 1) {
                A022 = r3.A0D.A0O(C58422vE.A02, 1655);
            } else {
                A022 = r3.A02(r6) - 1;
            }
            UserJid userJid2 = userJid;
            if (A022 > C56892sj.A01(r3, r6).A0D().size()) {
                this.A00.BpA(R.string.f11nameremoved, R.string.f11nameremoved);
                C27501dv r2 = new C27501dv(this.A07, this, this.A09, r6, userJid2, num, Collections.singletonList(userJid2));
                C66503Lr r4 = this.A0A;
                C27991fJ r62 = r2.A03;
                boolean A062 = ((C56072rN) r4.A0A.get()).A06(r62);
                List list = r2.A05;
                C626936e.A06(list);
                if (r2.A00) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("GroupIqResponseUtil/add-admin/timeout; groupId=");
                    A0o.append(r62);
                    C18260x0.A1Q(A0o, "; participants=", list);
                    r12 = null;
                } else {
                    r12 = new AnonymousClass4KY((AnonymousClass1FE) r2, r4, (AnonymousClass4B6) r2, (Runnable) r2, 2);
                }
                r4.A07(AnonymousClass8TE.create(), r62, r12, "promote", list, 91, A062);
                return;
            }
            HashMap A0t = AnonymousClass001.A0t();
            AnonymousClass0x2.A1I(userJid2, A0t, 419);
            int i = 3003;
            if (this.A0C.A06(r6)) {
                i = 3019;
            }
            C18290x4.A1C(C66493Lq.A1H, A0t, i);
        }
    }

    public boolean A02() {
        if (this.A04.A0F()) {
            return false;
        }
        C69263Wi r2 = this.A01;
        boolean A022 = C29441ip.A02(this.A00.getApplicationContext());
        int i = R.string.f11nameremoved;
        if (A022) {
            i = R.string.f11nameremoved;
        }
        r2.A0H(i, 0);
        return true;
    }

    public C54072o8(C89654ea r1, C69263Wi r2, C56972sr r3, AnonymousClass2ZR r4, C29441ip r5, C64773Ex r6, AnonymousClass5ZU r7, C28891hw r8, C56892sj r9, C66493Lq r10, C66503Lr r11, C27991fJ r12, C56072rN r13) {
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = r6;
        this.A06 = r7;
        this.A0C = r13;
        this.A09 = r10;
        this.A0A = r11;
        this.A07 = r8;
        this.A08 = r9;
        this.A04 = r5;
        this.A00 = r1;
        this.A0B = r12;
        this.A03 = r4;
    }
}
