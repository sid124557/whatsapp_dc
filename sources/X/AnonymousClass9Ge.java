package X;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.whatsapp.payments.ui.PaymentSettingsFragment;
import java.util.List;

/* renamed from: X.9Ge  reason: invalid class name */
public final class AnonymousClass9Ge extends AnonymousClass5ZM {
    public final C64773Ex A00;
    public final AnonymousClass36F A01;
    public final AnonymousClass9OO A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9Ge(C64773Ex r2, AnonymousClass36F r3, AnonymousClass9OO r4, PaymentSettingsFragment paymentSettingsFragment) {
        super(paymentSettingsFragment, true);
        C162457s7.A0J(r2, 2);
        C162457s7.A0J(r3, 3);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0299, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02a2, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x019b, code lost:
        if (r5 != null) goto L_0x019d;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r27) {
        /*
            r26 = this;
            r7 = r26
            X.36F r2 = r7.A01
            r3 = 4
            r4 = 60
            java.util.List r1 = r2.A0K()
            java.util.Map r0 = X.C73813g7.A0A()
            boolean r5 = r1.isEmpty()
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x01b4
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            X.3Ex r0 = r7.A00
            r0.A0h(r6)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            boolean r5 = r1.isEmpty()
            if (r5 != 0) goto L_0x0064
            java.util.HashMap r8 = X.AnonymousClass001.A0t()
            java.util.Iterator r6 = r6.iterator()
        L_0x0033:
            boolean r5 = r6.hasNext()
            if (r5 == 0) goto L_0x003d
            X.C1899593h.A1T(r8, r6)
            goto L_0x0033
        L_0x003d:
            java.util.Iterator r7 = r1.iterator()
        L_0x0041:
            boolean r5 = r7.hasNext()
            if (r5 == 0) goto L_0x0064
            java.lang.Object r5 = r7.next()
            X.3ZQ r5 = (X.AnonymousClass3ZQ) r5
            com.whatsapp.jid.UserJid r6 = r5.A04
            if (r6 == 0) goto L_0x0062
            java.lang.String r5 = r6.getRawString()
        L_0x0055:
            java.lang.Object r5 = r8.get(r5)
            if (r5 == 0) goto L_0x0041
            X.C162457s7.A0H(r6)
            r0.put(r6, r5)
            goto L_0x0041
        L_0x0062:
            r5 = 0
            goto L_0x0055
        L_0x0064:
            boolean r5 = r0.isEmpty()
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x01b4
            java.util.Set r6 = r0.keySet()
            r5 = 0
            X.C162457s7.A0J(r6, r5)
            java.util.ArrayList r10 = X.AnonymousClass002.A0J(r6)
            monitor-enter(r2)
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01b1 }
            java.lang.String r5 = "status =? AND type=? AND receiver_jid_row_id IN ("
            r9.append(r5)     // Catch:{ all -> 0x01b1 }
            int r8 = r10.size()     // Catch:{ all -> 0x01b1 }
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01b1 }
            r6 = 0
        L_0x008b:
            if (r6 >= r8) goto L_0x009e
            java.lang.String r5 = "?"
            r7.append(r5)     // Catch:{ all -> 0x01b1 }
            int r5 = r8 + -1
            if (r6 == r5) goto L_0x009b
            java.lang.String r5 = ","
            r7.append(r5)     // Catch:{ all -> 0x01b1 }
        L_0x009b:
            int r6 = r6 + 1
            goto L_0x008b
        L_0x009e:
            X.AnonymousClass000.A1B(r7, r9)     // Catch:{ all -> 0x01b1 }
            java.lang.String r5 = ") AND "
            r9.append(r5)     // Catch:{ all -> 0x01b1 }
            java.lang.String r5 = "sender_jid_row_id"
            r9.append(r5)     // Catch:{ all -> 0x01b1 }
            java.lang.String r5 = " =?"
            java.lang.String r13 = X.AnonymousClass000.A0X(r5, r9)     // Catch:{ all -> 0x01b1 }
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x01b1 }
            r5 = 405(0x195, float:5.68E-43)
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x01b1 }
            r7.add(r5)     // Catch:{ all -> 0x01b1 }
            r5 = 1
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x01b1 }
            r7.add(r5)     // Catch:{ all -> 0x01b1 }
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x01b1 }
            java.util.Iterator r8 = r10.iterator()     // Catch:{ all -> 0x01b1 }
        L_0x00ce:
            boolean r5 = r8.hasNext()     // Catch:{ all -> 0x01b1 }
            if (r5 == 0) goto L_0x00e8
            java.lang.Object r6 = r8.next()     // Catch:{ all -> 0x01b1 }
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6     // Catch:{ all -> 0x01b1 }
            X.34p r5 = r2.A03     // Catch:{ all -> 0x01b1 }
            long r5 = r5.A05(r6)     // Catch:{ all -> 0x01b1 }
            java.lang.String r5 = java.lang.Long.toString(r5)     // Catch:{ all -> 0x01b1 }
            r9.add(r5)     // Catch:{ all -> 0x01b1 }
            goto L_0x00ce
        L_0x00e8:
            r7.addAll(r9)     // Catch:{ all -> 0x01b1 }
            com.whatsapp.jid.UserJid r6 = r2.A0I()     // Catch:{ all -> 0x01b1 }
            X.34p r5 = r2.A03     // Catch:{ all -> 0x01b1 }
            long r5 = r5.A05(r6)     // Catch:{ all -> 0x01b1 }
            java.lang.String r5 = java.lang.Long.toString(r5)     // Catch:{ all -> 0x01b1 }
            r7.add(r5)     // Catch:{ all -> 0x01b1 }
            int r5 = r7.size()     // Catch:{ all -> 0x01b1 }
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ all -> 0x01b1 }
            java.lang.Object[] r14 = r7.toArray(r5)     // Catch:{ all -> 0x01b1 }
            java.lang.String[] r14 = (java.lang.String[]) r14     // Catch:{ all -> 0x01b1 }
            java.lang.String r5 = "readLatestSuccessfulP2PTransactionsForUsers/QUERY_SUCCESSFUL_TRANSACTIONS"
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0l(r5)     // Catch:{ all -> 0x01b1 }
            java.lang.String r5 = "/QUERY_PAY_TRANSACTION"
            java.lang.String r18 = X.AnonymousClass000.A0X(r5, r6)     // Catch:{ all -> 0x01b1 }
            java.lang.String[] r5 = X.AnonymousClass36F.A0A     // Catch:{ all -> 0x01b1 }
            java.util.ArrayList r6 = X.AnonymousClass0x2.A0i(r5)     // Catch:{ all -> 0x01b1 }
            java.lang.String r5 = "MAX(init_timestamp)"
            r6.add(r5)     // Catch:{ all -> 0x01b1 }
            int r5 = r6.size()     // Catch:{ all -> 0x01b1 }
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ all -> 0x01b1 }
            java.lang.Object[] r12 = r6.toArray(r5)     // Catch:{ all -> 0x01b1 }
            java.lang.String[] r12 = (java.lang.String[]) r12     // Catch:{ all -> 0x01b1 }
            X.3dV r5 = r2.A04     // Catch:{ all -> 0x01b1 }
            X.4GK r9 = r5.get()     // Catch:{ all -> 0x01b1 }
            r5 = r9
            X.3H0 r5 = (X.AnonymousClass3H0) r5     // Catch:{ all -> 0x01a7 }
            X.2sg r10 = r5.A03     // Catch:{ all -> 0x01a7 }
            java.lang.String r11 = "pay_transaction"
            java.lang.String r15 = "receiver_jid_row_id"
            r17 = 0
            java.lang.String r16 = "init_timestamp DESC"
            android.database.Cursor r8 = r10.A0F(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x01a7 }
            if (r8 == 0) goto L_0x0169
            java.lang.String r5 = "readLatestSuccessfulP2PTransactionsForUsers"
            java.util.List r11 = r2.A0O(r8, r5)     // Catch:{ all -> 0x015f }
            X.7oG r7 = r2.A09     // Catch:{ all -> 0x015f }
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x015f }
            java.lang.String r5 = "readLatestSuccessfulP2PTransactionsForUsers returned: "
            X.AnonymousClass000.A1H(r5, r6, r11)     // Catch:{ all -> 0x015f }
            X.C1899593h.A1F(r7, r6)     // Catch:{ all -> 0x015f }
            r8.close()     // Catch:{ all -> 0x01a7 }
            r9.close()     // Catch:{ all -> 0x01b1 }
            goto L_0x0170
        L_0x015f:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0164 }
            goto L_0x0168
        L_0x0164:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01a7 }
        L_0x0168:
            throw r1     // Catch:{ all -> 0x01a7 }
        L_0x0169:
            r9.close()     // Catch:{ all -> 0x01b1 }
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x01b1 }
        L_0x0170:
            monitor-exit(r2)
            java.util.Iterator r10 = r1.iterator()
        L_0x0175:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x01b4
            java.lang.Object r9 = r10.next()
            X.3ZQ r9 = (X.AnonymousClass3ZQ) r9
            com.whatsapp.jid.UserJid r8 = r9.A04
            java.util.Iterator r7 = r11.iterator()
        L_0x0187:
            boolean r5 = r7.hasNext()
            if (r5 == 0) goto L_0x01a2
            X.34w r6 = X.C1899693i.A0E(r7)
            com.whatsapp.jid.UserJid r5 = r6.A0D
            boolean r5 = X.C162457s7.A0P(r8, r5)
            if (r5 == 0) goto L_0x0187
            X.39Q r5 = r6.A08
            if (r5 == 0) goto L_0x01a2
        L_0x019d:
            monitor-enter(r9)
            r9.A02 = r5     // Catch:{ all -> 0x01a4 }
            monitor-exit(r9)
            goto L_0x0175
        L_0x01a2:
            r5 = 0
            goto L_0x019d
        L_0x01a4:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x01a7:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x01ac }
            goto L_0x01b0
        L_0x01ac:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01b1 }
        L_0x01b0:
            throw r1     // Catch:{ all -> 0x01b1 }
        L_0x01b1:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x01b4:
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            long r9 = java.lang.System.currentTimeMillis()
            long r4 = (long) r4
            r6 = 24
            long r4 = r4 * r6
            r6 = 60
            long r4 = r4 * r6
            long r4 = r4 * r6
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            long r9 = r9 - r4
            r4 = 3
            java.lang.String[] r6 = new java.lang.String[r4]
            r4 = 405(0x195, float:5.68E-43)
            java.lang.String r5 = java.lang.String.valueOf(r4)
            r4 = 0
            r6[r4] = r5
            r5 = 1
            java.lang.String r4 = java.lang.String.valueOf(r5)
            r6[r5] = r4
            r5 = 2
            java.lang.String r4 = java.lang.String.valueOf(r9)
            r6[r5] = r4
            java.lang.String r4 = "readFrequentlyPaidNonWaPaymentUsers/QUERY_SUCCESSFUL_INTEROP_TRANSACTIONS"
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0l(r4)
            java.lang.String r4 = "/QUERY_PAY_TRANSACTION"
            java.lang.String r25 = X.AnonymousClass000.A0X(r4, r5)
            X.3dV r4 = r2.A04
            X.4GK r16 = r4.get()
            r4 = r16
            X.3H0 r4 = (X.AnonymousClass3H0) r4     // Catch:{ all -> 0x02ec }
            X.2sg r4 = r4.A03     // Catch:{ all -> 0x02ec }
            java.lang.String r18 = "pay_transaction"
            r19 = 0
            java.lang.String r20 = "status =? AND type =? AND init_timestamp <=? AND receiver_jid_row_id is null"
            r23 = r19
            r24 = r19
            r17 = r4
            r21 = r6
            r22 = r19
            android.database.Cursor r9 = r17.A0F(r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x02ec }
            if (r9 == 0) goto L_0x02a3
            java.util.HashMap r10 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x0299 }
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0299 }
            java.lang.String r4 = "extractFrequentlyPaidNonWaPaymentUser"
            java.util.List r4 = r2.A0O(r9, r4)     // Catch:{ all -> 0x0299 }
            java.util.Iterator r15 = r4.iterator()     // Catch:{ all -> 0x0299 }
        L_0x0222:
            boolean r4 = r15.hasNext()     // Catch:{ all -> 0x0299 }
            if (r4 == 0) goto L_0x0283
            X.34w r13 = X.C1899693i.A0E(r15)     // Catch:{ all -> 0x0299 }
            X.1S4 r4 = r13.A0A     // Catch:{ all -> 0x0299 }
            java.lang.String r5 = r4.A0L()     // Catch:{ all -> 0x0299 }
            boolean r4 = r10.containsKey(r5)     // Catch:{ all -> 0x0299 }
            if (r4 == 0) goto L_0x025e
            java.lang.Object r14 = r10.get(r5)     // Catch:{ all -> 0x0299 }
            r12 = r14
            X.3ZQ r12 = (X.AnonymousClass3ZQ) r12     // Catch:{ all -> 0x0299 }
            monitor-enter(r14)     // Catch:{ all -> 0x0299 }
            int r4 = r12.A00     // Catch:{ all -> 0x0280 }
            monitor-exit(r14)     // Catch:{ all -> 0x0299 }
            int r4 = r4 + 1
            monitor-enter(r14)     // Catch:{ all -> 0x0299 }
            r12.A00 = r4     // Catch:{ all -> 0x0280 }
            monitor-exit(r14)     // Catch:{ all -> 0x0299 }
            monitor-enter(r14)     // Catch:{ all -> 0x0299 }
            long r6 = r12.A01     // Catch:{ all -> 0x0280 }
            monitor-exit(r14)     // Catch:{ all -> 0x0299 }
            long r4 = r13.A05     // Catch:{ all -> 0x0299 }
            int r11 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r11 >= 0) goto L_0x0222
            monitor-enter(r14)     // Catch:{ all -> 0x0299 }
            r12.A01 = r4     // Catch:{ all -> 0x0280 }
            monitor-exit(r14)     // Catch:{ all -> 0x0299 }
            X.39Q r4 = r13.A08     // Catch:{ all -> 0x0299 }
            monitor-enter(r14)     // Catch:{ all -> 0x0299 }
            r12.A02 = r4     // Catch:{ all -> 0x0280 }
            monitor-exit(r14)     // Catch:{ all -> 0x0299 }
            goto L_0x0222
        L_0x025e:
            com.whatsapp.jid.UserJid r12 = r13.A0E     // Catch:{ all -> 0x0299 }
            long r4 = r13.A05     // Catch:{ all -> 0x0299 }
            X.39Q r11 = r13.A08     // Catch:{ all -> 0x0299 }
            X.1S4 r7 = r13.A0A     // Catch:{ all -> 0x0299 }
            X.3ZQ r6 = new X.3ZQ     // Catch:{ all -> 0x0299 }
            r17 = r6
            r18 = r11
            r19 = r7
            r20 = r12
            r21 = r4
            r17.<init>((X.AnonymousClass39Q) r18, (X.AnonymousClass1S4) r19, (com.whatsapp.jid.UserJid) r20, (long) r21)     // Catch:{ all -> 0x0299 }
            java.lang.String r4 = r7.A0L()     // Catch:{ all -> 0x0299 }
            r10.put(r4, r6)     // Catch:{ all -> 0x0299 }
            r8.add(r6)     // Catch:{ all -> 0x0299 }
            goto L_0x0222
        L_0x0280:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x0299 }
            throw r0     // Catch:{ all -> 0x0299 }
        L_0x0283:
            X.7oG r5 = r2.A09     // Catch:{ all -> 0x0299 }
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0299 }
            java.lang.String r2 = "readFrequentlyPaidNonWaPaymentUsers returned: "
            r4.append(r2)     // Catch:{ all -> 0x0299 }
            int r2 = r8.size()     // Catch:{ all -> 0x0299 }
            X.C1899593h.A1K(r5, r4, r2)     // Catch:{ all -> 0x0299 }
            r9.close()     // Catch:{ all -> 0x02ec }
            goto L_0x02a3
        L_0x0299:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x029e }
            goto L_0x02a2
        L_0x029e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x02ec }
        L_0x02a2:
            throw r1     // Catch:{ all -> 0x02ec }
        L_0x02a3:
            r16.close()
            r8.addAll(r1)
            int r2 = r8.size()
            r1 = 1
            if (r2 <= r1) goto L_0x02b3
            java.util.Collections.sort(r8)
        L_0x02b3:
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.util.Iterator r4 = r8.iterator()
        L_0x02bf:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x02e6
            java.lang.Object r2 = r4.next()
            X.3ZQ r2 = (X.AnonymousClass3ZQ) r2
            int r1 = r6.size()
            if (r1 >= r3) goto L_0x02e6
            boolean r1 = r2.A06
            if (r1 != 0) goto L_0x02e2
            com.whatsapp.jid.UserJid r1 = r2.A04
            if (r1 == 0) goto L_0x02e2
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L_0x02bf
            r5.add(r1)
        L_0x02e2:
            r6.add(r2)
            goto L_0x02bf
        L_0x02e6:
            X.9OR r0 = new X.9OR
            r0.<init>(r5, r6)
            return r0
        L_0x02ec:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x02f1 }
            throw r1
        L_0x02f1:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9Ge.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass9OR r13 = (AnonymousClass9OR) obj;
        C162457s7.A0J(r13, 0);
        AnonymousClass9OO r0 = this.A02;
        PaymentSettingsFragment paymentSettingsFragment = r0.A01;
        C105365Uq r6 = r0.A00;
        List list = r13.A01;
        List list2 = r13.A00;
        int size = list2.size();
        View view = paymentSettingsFragment.A09;
        if (size == 0) {
            view.setVisibility(8);
            paymentSettingsFragment.A0G.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        paymentSettingsFragment.A0G.setVisibility(0);
        int i = ((GridLayoutManager) paymentSettingsFragment.A0J.getLayoutManager()).A00;
        paymentSettingsFragment.A0J.setAdapter(new AnonymousClass95B(paymentSettingsFragment.A0Q(), paymentSettingsFragment.A0R, r6, new AnonymousClass9OQ(paymentSettingsFragment, list2), paymentSettingsFragment.A13, list, list2, i));
    }
}
