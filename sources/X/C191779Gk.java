package X;

import com.whatsapp.payments.ui.PaymentTransactionHistoryActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9Gk  reason: invalid class name and case insensitive filesystem */
public class C191779Gk extends AnonymousClass5ZM {
    public final C193889Qm A00;
    public final C194459Sy A01;
    public final ArrayList A02;
    public final /* synthetic */ PaymentTransactionHistoryActivity A03;

    public C191779Gk(C193889Qm r2, PaymentTransactionHistoryActivity paymentTransactionHistoryActivity, C194459Sy r4, ArrayList arrayList) {
        ArrayList arrayList2;
        this.A03 = paymentTransactionHistoryActivity;
        if (arrayList != null) {
            arrayList2 = AnonymousClass002.A0J(arrayList);
        } else {
            arrayList2 = null;
        }
        this.A02 = arrayList2;
        this.A00 = r2;
        this.A01 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0085, code lost:
        if (X.C107155an.A05(r3.A04, r3.A0I.A0R(r7), r2, true) != false) goto L_0x0087;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r10) {
        /*
            r9 = this;
            com.whatsapp.payments.ui.PaymentTransactionHistoryActivity r3 = r9.A03
            X.4uZ r0 = r3.A07
            if (r0 != 0) goto L_0x010c
            boolean r0 = r3.A0S
            r7 = 0
            r6 = 1
            if (r0 != 0) goto L_0x00c4
            X.3Mh r1 = r3.A06
            X.1Ei r0 = X.C66663Mh.A0m
            boolean r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x00c4
            X.2T7 r1 = r3.A0W
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x002c
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x002c
            X.284 r0 = r1.A00
            if (r0 != 0) goto L_0x002c
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x002c
            X.38i r0 = r1.A01
            if (r0 == 0) goto L_0x00c4
        L_0x002c:
            r1.A05 = r7
            r1.A04 = r6
            X.9U4 r0 = r3.A0B
            X.36F r0 = X.AnonymousClass9U4.A01(r0)
            java.util.List r5 = r0.A0Q(r1)
        L_0x003a:
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.ArrayList r2 = r9.A02
            if (r2 == 0) goto L_0x00a5
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x00a5
            java.util.Iterator r8 = r5.iterator()
        L_0x004c:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0098
            X.34w r7 = X.C1899693i.A0E(r8)
            X.3Lv r0 = r3.A05
            X.34x r0 = r0.A0E(r7)
            if (r0 == 0) goto L_0x00a3
            java.lang.String r1 = r0.A13()
        L_0x0062:
            X.33j r0 = r3.A04
            r6 = 1
            boolean r0 = X.C107155an.A05(r0, r1, r2, r6)
            if (r0 != 0) goto L_0x0087
            X.9Wq r0 = r3.A0I
            java.lang.String r1 = r0.A0T(r7)
            X.33j r0 = r3.A04
            boolean r0 = X.C107155an.A05(r0, r1, r2, r6)
            if (r0 != 0) goto L_0x0087
            X.9Wq r0 = r3.A0I
            java.lang.String r1 = r0.A0R(r7)
            X.33j r0 = r3.A04
            boolean r0 = X.C107155an.A05(r0, r1, r2, r6)
            if (r0 == 0) goto L_0x008a
        L_0x0087:
            r4.add(r7)
        L_0x008a:
            X.4MC r0 = r9.A02
            boolean r0 = r0.isCancelled()
            if (r0 == 0) goto L_0x004c
            r4.clear()
            r4.addAll(r5)
        L_0x0098:
            X.9Sy r0 = r9.A01
            java.util.List r0 = r0.A02(r4)
            X.0PJ r0 = X.AnonymousClass0x9.A0G(r4, r0)
            return r0
        L_0x00a3:
            r1 = 0
            goto L_0x0062
        L_0x00a5:
            r4.addAll(r5)
            r1 = 2
            X.9pa r0 = new X.9pa
            r0.<init>(r1)
            java.util.Collections.sort(r4, r0)
            boolean r0 = r3.A0T
            if (r0 != 0) goto L_0x0098
            boolean r0 = r3.A0O
            if (r0 != 0) goto L_0x0098
            X.4FS r1 = r3.A04
            X.9iR r0 = new X.9iR
            r0.<init>(r9, r5)
            r1.BkM(r0)
            goto L_0x0098
        L_0x00c4:
            boolean r0 = r3.A0R
            r4 = -1
            if (r0 == 0) goto L_0x00f5
            java.lang.Integer[] r5 = new java.lang.Integer[r6]
            r0 = 40
            X.AnonymousClass000.A1P(r5, r0, r7)
            boolean r2 = r3.A0Q
            r0 = 2
            java.lang.Integer[] r1 = new java.lang.Integer[r0]
            if (r2 == 0) goto L_0x00ed
            r0 = 20
            X.AnonymousClass000.A1P(r1, r0, r7)
            r0 = 401(0x191, float:5.62E-43)
        L_0x00de:
            X.AnonymousClass000.A1P(r1, r0, r6)
            X.9U4 r0 = r3.A0B
            X.36F r0 = X.AnonymousClass9U4.A01(r0)
            java.util.List r5 = r0.A0V(r1, r5, r4)
            goto L_0x003a
        L_0x00ed:
            r0 = 417(0x1a1, float:5.84E-43)
            X.AnonymousClass000.A1P(r1, r0, r7)
            r0 = 418(0x1a2, float:5.86E-43)
            goto L_0x00de
        L_0x00f5:
            boolean r2 = r3.A0S
            X.9U4 r0 = r3.A0B
            X.36F r1 = X.AnonymousClass9U4.A01(r0)
            if (r2 == 0) goto L_0x0105
            java.util.List r5 = r1.A0M(r4)
            goto L_0x003a
        L_0x0105:
            r0 = 0
            java.util.List r5 = r1.A0P(r0, r4)
            goto L_0x003a
        L_0x010c:
            X.9U4 r0 = r3.A0B
            X.36F r2 = X.AnonymousClass9U4.A01(r0)
            X.4uZ r1 = r3.A07
            r0 = -1
            java.util.List r5 = r2.A0P(r1, r0)
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191779Gk.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass0PJ r6 = (AnonymousClass0PJ) obj;
        C193889Qm r4 = this.A00;
        PaymentTransactionHistoryActivity paymentTransactionHistoryActivity = this.A03;
        String str = paymentTransactionHistoryActivity.A0L;
        if (str == null) {
            str = "";
        }
        AnonymousClass2T7 r2 = paymentTransactionHistoryActivity.A0W;
        Object obj2 = r6.A00;
        C626936e.A06(obj2);
        Object obj3 = r6.A01;
        C626936e.A06(obj3);
        r4.A00(r2, str, (List) obj2, (List) obj3);
    }
}
