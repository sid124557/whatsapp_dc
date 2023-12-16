package X;

import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5XE  reason: invalid class name */
public class AnonymousClass5XE {
    public final C56972sr A00;
    public final AnonymousClass5IP A01;
    public final C64773Ex A02;
    public final AnonymousClass5ZU A03;
    public final C56612sH A04;
    public final AnonymousClass1VX A05;
    public final C66493Lq A06;
    public final C56572sD A07;
    public final List A08 = Collections.synchronizedList(AnonymousClass001.A0s());
    public final Map A09;
    public final boolean A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r6.A02 == 3) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(X.C56972sr r4, X.AnonymousClass39J r5, X.AnonymousClass3ZF r6) {
        /*
            X.2mt r0 = r6.A07
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r2 = 0
            if (r0 != 0) goto L_0x0018
            boolean r0 = r6.A0M()
            if (r0 == 0) goto L_0x0018
            r6.A0A()
            int r1 = r6.A02
            r0 = 3
            if (r1 != r0) goto L_0x0018
        L_0x0017:
            return r2
        L_0x0018:
            X.39J r0 = r6.A0E
            boolean r0 = r0.equals(r5)
            r3 = 1
            if (r0 != 0) goto L_0x005d
            boolean r0 = r6.A0L()
            if (r0 == 0) goto L_0x0065
            X.2l8 r0 = r6.A0I
            if (r0 == 0) goto L_0x0065
            java.util.List r1 = r6.A08()
            int r0 = r1.size()
            if (r0 > r3) goto L_0x0065
            int r0 = r1.size()
            if (r0 != r3) goto L_0x005d
            java.lang.Object r0 = r1.get(r2)
            X.3ZE r0 = (X.AnonymousClass3ZE) r0
            com.whatsapp.jid.UserJid r1 = r0.A02
            X.C162457s7.A0J(r1, r2)
            X.C162457s7.A0J(r4, r3)
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r4)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x005d
            X.1fH r0 = r4.A0H()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0065
        L_0x005d:
            X.2mt r0 = r6.A07
            if (r0 != 0) goto L_0x0065
            int r0 = r6.A0H
            if (r0 != r3) goto L_0x0017
        L_0x0065:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5XE.A00(X.2sr, X.39J, X.3ZF):boolean");
    }

    public void A01(AnonymousClass39J r10, ArrayList arrayList) {
        C117005rE r1;
        C117005rE r3;
        Object obj;
        if (this.A0A) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AnonymousClass3ZF r5 = (AnonymousClass3ZF) it.next();
                if (A00(this.A00, r10, r5)) {
                    boolean A1U = AnonymousClass000.A1U(r5.A0H, 2);
                    GroupJid groupJid = r5.A05;
                    C64773Ex r7 = this.A02;
                    if (AnonymousClass36T.A01(r7, this.A06, groupJid, this.A07, A1U) != null) {
                        obj = r5.A05;
                    } else {
                        if (!r5.A0L()) {
                            obj = r5.A0E.A01;
                        }
                        r3 = new C117005rE(r7, this.A03, this.A04, this.A05);
                        this.A08.add(r3);
                        r3.A04.add(r5);
                    }
                    if (obj != null) {
                        Map map = this.A09;
                        r3 = (C117005rE) map.get(obj);
                        if (r3 == null) {
                            r3 = new C117005rE(r7, this.A03, this.A04, this.A05);
                            this.A08.add(r3);
                            map.put(obj, r3);
                        }
                        r3.A04.add(r5);
                    }
                    r3 = new C117005rE(r7, this.A03, this.A04, this.A05);
                    this.A08.add(r3);
                    r3.A04.add(r5);
                }
            }
            return;
        }
        List list = this.A08;
        if (list.isEmpty()) {
            r1 = new C117005rE(this.A02, this.A03, this.A04, this.A05);
        } else {
            int A042 = AnonymousClass002.A04(list, 1);
            r1 = (C117005rE) list.get(A042);
            list.remove(A042);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AnonymousClass3ZF r52 = (AnonymousClass3ZF) it2.next();
            boolean A1U2 = AnonymousClass000.A1U(r52.A0H, 2);
            GroupJid groupJid2 = r52.A05;
            C64773Ex r6 = this.A02;
            boolean A1W = AnonymousClass000.A1W(AnonymousClass36T.A01(r6, this.A06, groupJid2, this.A07, A1U2));
            if (A00(this.A00, r10, r52)) {
                if (!r1.A06(r52, A1W)) {
                    if (!r1.A04.isEmpty()) {
                        list.add(r1);
                    }
                    r1 = new C117005rE(r6, this.A03, this.A04, this.A05);
                }
                r1.A04.add(r52);
            }
        }
        if (!r1.A04.isEmpty()) {
            list.add(r1);
        }
    }

    public AnonymousClass5XE(C56972sr r2, AnonymousClass5IP r3, C64773Ex r4, AnonymousClass5ZU r5, C56612sH r6, AnonymousClass1VX r7, C66493Lq r8, C56572sD r9) {
        HashMap hashMap;
        this.A05 = r7;
        this.A02 = r4;
        this.A06 = r8;
        this.A01 = r3;
        this.A07 = r9;
        this.A04 = r6;
        this.A03 = r5;
        this.A00 = r2;
        boolean A0X = r7.A0X(3918);
        this.A0A = A0X;
        if (A0X) {
            hashMap = AnonymousClass001.A0t();
        } else {
            hashMap = null;
        }
        this.A09 = hashMap;
    }
}
