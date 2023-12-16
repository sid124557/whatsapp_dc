package X;

import java.util.List;

/* renamed from: X.9Gx  reason: invalid class name and case insensitive filesystem */
public class C191909Gx extends AnonymousClass5ZM {
    public final C620733j A00;
    public final C66533Lu A01;
    public final AnonymousClass9U4 A02;
    public final AnonymousClass2T7 A03;
    public final C193889Qm A04;
    public final C194459Sy A05;
    public final C195219Wq A06;
    public final String A07;
    public final boolean A08 = true;
    public final boolean A09;

    public C191909Gx(C620733j r2, C66533Lu r3, AnonymousClass9U4 r4, AnonymousClass2T7 r5, C193889Qm r6, C194459Sy r7, C195219Wq r8, String str, boolean z) {
        this.A07 = str;
        this.A09 = z;
        this.A01 = r3;
        this.A04 = r6;
        this.A03 = r5;
        this.A02 = r4;
        this.A05 = r7;
        this.A06 = r8;
        this.A00 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x019f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r20) {
        /*
            r19 = this;
            r3 = r19
            boolean r0 = r3.A09
            r5 = 1
            X.2T7 r6 = r3.A03
            if (r0 == 0) goto L_0x0050
            r6.A05 = r5
        L_0x000b:
            X.33j r0 = r3.A00
            X.2s8 r2 = new X.2s8
            r2.<init>(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r2.A07 = r0
            r2.A05 = r6
            r0 = 100
            r2.A01 = r0
            java.lang.String r4 = r3.A07
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0029
            r2.A05(r4)
        L_0x0029:
            X.3Lu r1 = r3.A01
            r0 = 0
            android.util.Pair r0 = r1.A04(r0, r2, r0)
            java.lang.Object r0 = r0.second
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            java.util.Iterator r1 = r0.iterator()
        L_0x003c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0053
            java.lang.Object r0 = r1.next()
            X.34x r0 = (X.C624134x) r0
            X.34w r0 = r0.A0P
            if (r0 == 0) goto L_0x003c
            r2.add(r0)
            goto L_0x003c
        L_0x0050:
            r6.A04 = r5
            goto L_0x000b
        L_0x0053:
            boolean r0 = r3.A08
            if (r0 == 0) goto L_0x01a8
            X.9U4 r0 = r3.A02
            X.36F r7 = X.AnonymousClass9U4.A01(r0)
            android.util.Pair r6 = r7.A0D(r6)
            java.lang.String[] r1 = new java.lang.String[r5]
            r0 = 12
            java.lang.String r11 = java.lang.Integer.toString(r0)
            r9 = 0
            r1[r9] = r11
            java.lang.String r0 = "(status!=? AND interop_id IS NULL AND (metadata LIKE '%\"messageDeleted\":true%' ))"
            android.util.Pair r8 = android.util.Pair.create(r1, r0)
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()
            java.lang.String r10 = " )"
            java.lang.String[] r5 = new java.lang.String[r5]
            r5[r9] = r11
            java.lang.String r0 = "( status!=? AND interop_id IS NOT NULL )"
            android.util.Pair r9 = android.util.Pair.create(r5, r0)
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "(( "
            r5.append(r0)
            java.lang.Object r0 = r9.second
            java.lang.String r0 = (java.lang.String) r0
            r5.append(r0)
            java.lang.String r0 = " OR "
            r5.append(r0)
            java.lang.Object r0 = r8.second
            java.lang.String r0 = (java.lang.String) r0
            r5.append(r0)
            java.lang.String r0 = " ) AND "
            r5.append(r0)
            java.lang.Object r0 = r6.second
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r13 = X.AnonymousClass000.A0V(r0, r10, r5)
            java.lang.Object r0 = r9.first
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1.addAll(r0)
            com.whatsapp.jid.UserJid r5 = r7.A0I()
            X.34p r0 = r7.A03
            r0.A05(r5)
            r5.getRawString()
            java.lang.Object r0 = r8.first
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1.addAll(r0)
            java.lang.Object r0 = r6.first
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1.addAll(r0)
            java.lang.String r11 = "pay_transaction"
            java.lang.String[] r12 = X.AnonymousClass36F.A0A
            java.lang.String r18 = "readMessagelessPayments/QUERY_PAY_TRANSACTION"
            X.3dV r0 = r7.A04     // Catch:{ Exception -> 0x0134 }
            X.4GK r9 = r0.get()     // Catch:{ Exception -> 0x0134 }
            r0 = r9
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x012a }
            X.2sg r10 = r0.A03     // Catch:{ all -> 0x012a }
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x012a }
            java.lang.Object[] r14 = r1.toArray(r0)     // Catch:{ all -> 0x012a }
            java.lang.String[] r14 = (java.lang.String[]) r14     // Catch:{ all -> 0x012a }
            r15 = 0
            java.lang.String r16 = "init_timestamp DESC"
            r17 = r15
            android.database.Cursor r8 = r10.A0F(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x012a }
            if (r8 == 0) goto L_0x0126
            java.lang.String r0 = "readMessagelessPayments"
            java.util.List r6 = r7.A0O(r8, r0)     // Catch:{ all -> 0x011c }
            X.7oG r5 = r7.A09     // Catch:{ all -> 0x011c }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x011c }
            java.lang.String r0 = "readMessagelessPayments returned: "
            X.AnonymousClass000.A1H(r0, r1, r6)     // Catch:{ all -> 0x011c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x011c }
            r5.A07(r0)     // Catch:{ all -> 0x011c }
            r8.close()     // Catch:{ all -> 0x012a }
            r9.close()     // Catch:{ Exception -> 0x0134 }
            goto L_0x0140
        L_0x011c:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0121 }
            goto L_0x0125
        L_0x0121:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x012a }
        L_0x0125:
            throw r1     // Catch:{ all -> 0x012a }
        L_0x0126:
            r9.close()     // Catch:{ Exception -> 0x0134 }
            goto L_0x013c
        L_0x012a:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x012f }
            goto L_0x0133
        L_0x012f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x0134 }
        L_0x0133:
            throw r1     // Catch:{ Exception -> 0x0134 }
        L_0x0134:
            r5 = move-exception
            X.7oG r1 = r7.A09
            java.lang.String r0 = "PaymentTransactionStore/readMessagelessPayments "
            r1.A0A(r0, r5)
        L_0x013c:
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
        L_0x0140:
            java.util.Iterator r8 = r6.iterator()
        L_0x0144:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0199
            X.34w r5 = X.C1899693i.A0E(r8)
            X.1S4 r7 = r5.A0A
            X.C626936e.A06(r7)
            boolean r1 = r5.A0L()
            boolean r0 = r5.A0Q
            r1 = r1 ^ r0
            if (r1 == 0) goto L_0x0194
            java.lang.String r1 = r7.A0L()
        L_0x0160:
            X.C626936e.A06(r1)
            X.39Q r0 = r5.A08
            X.C626936e.A06(r0)
            X.39Q r0 = r5.A08
            java.lang.String r0 = r0.toString()
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L_0x017a
            boolean r0 = r1.contains(r4)
            if (r0 == 0) goto L_0x017d
        L_0x017a:
            r2.add(r5)
        L_0x017d:
            boolean r0 = r5.A0P
            if (r0 != 0) goto L_0x0144
            X.9Wq r1 = r3.A06
            r0 = 0
            java.lang.String r0 = r1.A0Z(r5, r0)
            if (r0 == 0) goto L_0x0144
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L_0x0144
            r2.add(r5)
            goto L_0x0144
        L_0x0194:
            java.lang.String r1 = r7.A0M()
            goto L_0x0160
        L_0x0199:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x01a8
            r1 = 3
            X.9pa r0 = new X.9pa
            r0.<init>(r1)
            java.util.Collections.sort(r2, r0)
        L_0x01a8:
            X.9Sy r0 = r3.A05
            java.util.List r0 = r0.A02(r2)
            X.0PJ r0 = X.AnonymousClass0x9.A0G(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191909Gx.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass0PJ r6 = (AnonymousClass0PJ) obj;
        C193889Qm r4 = this.A04;
        String str = this.A07;
        AnonymousClass2T7 r2 = this.A03;
        Object obj2 = r6.A00;
        C626936e.A06(obj2);
        Object obj3 = r6.A01;
        C626936e.A06(obj3);
        r4.A00(r2, str, (List) obj2, (List) obj3);
    }
}
