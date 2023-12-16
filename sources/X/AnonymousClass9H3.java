package X;

import android.text.TextUtils;
import java.util.List;

/* renamed from: X.9H3  reason: invalid class name */
public class AnonymousClass9H3 extends AnonymousClass5ZM {
    public final AnonymousClass2z0 A00;
    public final String A01;
    public final boolean A02;
    public final /* synthetic */ AnonymousClass94y A03;

    public AnonymousClass9H3(AnonymousClass94y r1, AnonymousClass2z0 r2, String str, boolean z) {
        this.A03 = r1;
        this.A00 = r2;
        this.A01 = str;
        this.A02 = z;
    }

    public void A09() {
        if (this.A02) {
            this.A03.A0c(false);
        }
        this.A03.A05 = null;
    }

    public void A0A() {
        if (this.A02) {
            this.A03.A0c(true);
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass1S4 r0;
        C193629Pj r02;
        C624034w r2;
        C193629Pj r13 = (C193629Pj) obj;
        AnonymousClass94y r3 = this.A03;
        C160757oG r4 = r3.A0f;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("onTransactionDetailData loaded: ");
        C1899593h.A1L(r4, A0o, AnonymousClass000.A1W(r13));
        if (r13.A01 == null) {
            r4.A06("onTransactionDetailData transactionInfo is null");
            r3.A08.A0H(AnonymousClass9QJ.A00(18));
        } else {
            if (this.A02) {
                r3.A0c(false);
            }
            if ("native".equals(r3.A0A)) {
                r3.A0l.BkM(new C200719im(this, r13));
                if (r13.A02 != null) {
                    r3.A08.A0H(AnonymousClass9QJ.A00(3));
                }
            }
            if (r3 instanceof C191669Fv) {
                C191669Fv r42 = (C191669Fv) r3;
                r42.A06 = r13;
                C624034w r22 = r13.A01;
                if (r22.A03 == 1000 || (!r22.A0L() && r42.A06.A01.A0O() && !TextUtils.isEmpty(r42.A06.A01.A0K))) {
                    r42.A0g();
                } else {
                    r42.A0K();
                    int i = r22.A03;
                    if ((i == 20 || i == 40) && (r0 = r22.A0A) != null) {
                        Boolean bool = Boolean.TRUE;
                        if (!(bool.equals(r0.A03) || (r02 = r42.A06) == null || (r2 = r02.A01) == null)) {
                            C624034w r5 = new C624034w(r2.A0G, r2.A03, r2.A04, r2.A01, r2.A05);
                            AnonymousClass1S4 r03 = r2.A0A;
                            r5.A0A = r03;
                            if (r03 != null) {
                                r03.A03 = bool;
                                r42.A0l.BkM(new C201109jX(r5, r2, r42));
                            }
                        }
                    }
                    AnonymousClass08M r23 = r42.A02;
                    List list = (List) r23.A07();
                    if (list != null) {
                        list.clear();
                    }
                    C193629Pj r04 = r42.A06;
                    if (!(r04 == null || r04.A01 == null)) {
                        r42.A0S(list);
                        r23.A0H(list);
                    }
                }
            } else {
                r3.A06 = r13;
                if (r3.A0a.A00()) {
                    r3.A0J.A06(new C196059aE(r3), C56972sr.A04(r3.A0I));
                } else {
                    r3.A0M();
                }
            }
            r3.A0L();
        }
        r3.A05 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        if (r3 == null) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C193629Pj A0G() {
        /*
            r8 = this;
            X.94y r2 = r8.A03
            X.36F r3 = r2.A0S
            java.lang.String r1 = r8.A01
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r6 = 0
            if (r0 == 0) goto L_0x006c
            X.2z0 r0 = r8.A00
            java.lang.String r0 = r0.A01
        L_0x0011:
            X.34w r4 = X.AnonymousClass36F.A05(r3, r0, r1)
            if (r4 == 0) goto L_0x006e
            int r1 = r4.A03
            r0 = 9
            if (r1 != r0) goto L_0x003c
            X.1S4 r0 = r4.A0A
            if (r0 == 0) goto L_0x003c
            X.39O r0 = r0.A00
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = r0.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x003c
            X.1S4 r0 = r4.A0A
            X.39O r0 = r0.A00
            java.lang.String r0 = r0.A03
            X.C626936e.A06(r0)
            X.34w r0 = r3.A0G(r0)
            r2.A04 = r0
        L_0x003c:
            r7 = 1
            java.lang.String r0 = r4.A0H
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x006a
            X.8EA r1 = r2.A0U
            java.lang.String r0 = r4.A0H
            X.7yw r3 = r1.A08(r0)
            if (r3 != 0) goto L_0x0071
        L_0x004f:
            java.util.ArrayList r0 = r4.A0N
            if (r0 == 0) goto L_0x0071
            java.util.Iterator r1 = r0.iterator()
        L_0x0057:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0071
            java.lang.Object r0 = r1.next()
            X.2Nx r0 = (X.C42392Nx) r0
            X.7yw r0 = r0.A01
            if (r0 == 0) goto L_0x0057
            r7 = 0
            r3 = r0
            goto L_0x0057
        L_0x006a:
            r3 = r6
            goto L_0x004f
        L_0x006c:
            r0 = r6
            goto L_0x0011
        L_0x006e:
            r3 = r6
            r7 = 1
            goto L_0x0084
        L_0x0071:
            X.1S4 r0 = r4.A0A
            if (r0 == 0) goto L_0x0084
            X.39U r0 = r0.A02
            if (r0 == 0) goto L_0x0084
            X.9Va r1 = r2.A0R
            X.C626936e.A06(r0)
            java.lang.String r0 = r0.A02
            X.1n7 r6 = r1.A00(r0)
        L_0x0084:
            X.3Lv r0 = r2.A0Q
            X.34x r5 = r0.A0E(r4)
            X.9Pj r2 = new X.9Pj
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9H3.A0G():X.9Pj");
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return A0G();
    }
}
