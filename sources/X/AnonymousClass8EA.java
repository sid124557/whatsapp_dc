package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8EA  reason: invalid class name */
public class AnonymousClass8EA implements C833347v {
    public AnonymousClass1RD A00;
    public C85024Eq A01;
    public final C55682qk A02;
    public final C56612sH A03;
    public final C54292oU A04;
    public final C617332a A05;
    public final C60972zT A06;
    public final C45932ao A07;
    public final AnonymousClass1VX A08;
    public volatile boolean A09;

    public static boolean A04(List list) {
        int A082;
        if (list != null && list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C166587yw r2 = (C166587yw) it.next();
                if (r2 != null) {
                    if (TextUtils.isEmpty(r2.A0A) || (A082 = r2.A08()) == 0) {
                        Log.w("PAY: PaymentsHelper sanitizePaymentMethods got empty credential id or account type");
                        return false;
                    } else if (C161527pr.A02(r2.A09)) {
                        r2.A0D(C166587yw.A06(A082));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public synchronized C133676hl A05(UserJid userJid) {
        C133676hl r6;
        Cursor A0E;
        r6 = null;
        C186298v4 BCs = this.A01.BCs(A02(userJid), (String) null);
        if (!(BCs == null || (r6 = BCs.BG1()) == null)) {
            AnonymousClass4GK A0B = this.A00.get();
            try {
                A0E = ((AnonymousClass3H0) A0B).A03.A0E(C57812uF.A00, "readContactInfo/QUERY_SCHEMA_PAY_CONTACTS", new String[]{userJid.getRawString()});
                while (A0E.moveToNext()) {
                    A03(A0E, r6, userJid);
                }
                A0E.close();
                A0B.close();
            } catch (Throwable th) {
                try {
                    A0B.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        C18260x0.A1R(AnonymousClass001.A0o(), "PAY: PaymentStore readContactInfo returned: ", r6);
        return r6;
        throw th;
    }

    public synchronized List A0C() {
        return A0E((int[]) null, 0);
    }

    public synchronized List A0D() {
        List emptyList;
        AnonymousClass4GK A0B = this.A00.get();
        try {
            emptyList = Collections.emptyList();
            C18260x0.A1P(AnonymousClass001.A0o(), "PAY: PaymentStore readPayoutMethods returned: ", emptyList);
            A0B.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        return emptyList;
        throw th;
    }

    public synchronized List A0E(int[] iArr, int i) {
        ArrayList A0s;
        Cursor A0E;
        C133676hl r0;
        A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        if (iArr != null) {
            for (int i2 : iArr) {
                A0s2.add(Long.toString((long) (i2 << (i * 4))));
            }
        }
        AnonymousClass4GK A0B = this.A00.get();
        try {
            C56862sg r5 = ((AnonymousClass3H0) A0B).A03;
            long j = 15 << (i * 4);
            boolean A1T = AnonymousClass000.A1T(i);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("SELECT ");
            A0o.append(C379324p.A00(", ", C39172Ay.A00));
            A0o.append(" FROM ");
            A0o.append("contacts");
            ArrayList arrayList = null;
            A0E = r5.A0E(AnonymousClass000.A0X(C57812uF.A00(A0s2, j, A1T), A0o), "readAllContactInfos/QUERY_SCHEMA_PAY_CONTACTS", (String[]) null);
            while (A0E.moveToNext()) {
                UserJid A0E2 = UserJid.Companion.A0E(AnonymousClass0x2.A0Z(A0E, "jid"));
                if (A0E2 == null) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("PAY: PaymentTransactionStore/readContactInfos: Skipping Jid because it is not valid: ");
                    C18260x0.A1L(A0o2, AnonymousClass0x2.A0Z(A0E, "jid"));
                } else {
                    C186298v4 BCs = this.A01.BCs(A02(A0E2), (String) null);
                    if (BCs != null) {
                        r0 = BCs.BG1();
                    } else {
                        r0 = null;
                    }
                    if (r0 != null) {
                        A03(A0E, r0, A0E2);
                        A0s.add(r0);
                    }
                }
            }
            A0E.close();
            A0B.close();
            if (iArr != null) {
                arrayList = AnonymousClass001.A0s();
                for (int A1K : iArr) {
                    C18270x1.A1K(arrayList, A1K);
                }
            }
            StringBuilder A0o3 = AnonymousClass001.A0o();
            A0o3.append("PAY: PaymentStore readContactInfos/paymentService=");
            A0o3.append(i);
            A0o3.append("/ statuses: ");
            A0o3.append(arrayList);
            C18260x0.A1P(A0o3, "/ returned: ", A0s);
        } catch (Throwable th) {
            try {
                A0B.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
        return A0s;
        throw th;
    }

    public synchronized void A0F() {
        AnonymousClass1RD r0 = this.A00;
        if (r0 != null) {
            r0.A0D();
        }
        this.A09 = false;
    }

    public synchronized void A0H(UserJid userJid) {
        C133676hl A052;
        if (this.A01 != null) {
            String A022 = A02(userJid);
            if (!TextUtils.isEmpty(A022) && !A022.equals("UNSET") && (A052 = A05(userJid)) != null && A052.A05 != null) {
                A052.A01 = this.A03.A0H() + TimeUnit.DAYS.toMillis(1);
                A0K(A052);
            }
        }
    }

    public synchronized void A0I(UserJid userJid, Boolean bool, String str, HashMap hashMap) {
        synchronized (this) {
            A0L(userJid, bool, str, hashMap, (HashMap) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (r4 != null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fa, code lost:
        if (r1 != false) goto L_0x00fc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0L(com.whatsapp.jid.UserJid r13, java.lang.Boolean r14, java.lang.String r15, java.util.HashMap r16, java.util.HashMap r17) {
        /*
            r12 = this;
            monitor-enter(r12)
            java.lang.String r1 = A02(r13)     // Catch:{ all -> 0x0101 }
            X.4Eq r0 = r12.A01     // Catch:{ all -> 0x0101 }
            r11 = 0
            if (r0 == 0) goto L_0x00ff
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0101 }
            if (r0 != 0) goto L_0x00ff
            java.lang.String r0 = "UNSET"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0101 }
            if (r0 != 0) goto L_0x00ff
            X.6hl r4 = r12.A05(r13)     // Catch:{ all -> 0x0101 }
            if (r4 == 0) goto L_0x0022
            com.whatsapp.jid.UserJid r0 = r4.A05     // Catch:{ all -> 0x0101 }
            if (r0 != 0) goto L_0x003a
        L_0x0022:
            X.4Eq r2 = r12.A01     // Catch:{ all -> 0x0101 }
            java.lang.String r1 = A02(r13)     // Catch:{ all -> 0x0101 }
            r0 = 0
            X.8v4 r0 = r2.BCs(r1, r0)     // Catch:{ all -> 0x0101 }
            if (r0 == 0) goto L_0x0038
            X.6hl r4 = r0.BG1()     // Catch:{ all -> 0x0101 }
            if (r4 == 0) goto L_0x00ff
            r4.A05 = r13     // Catch:{ all -> 0x0101 }
            goto L_0x003a
        L_0x0038:
            if (r4 == 0) goto L_0x00ff
        L_0x003a:
            r11 = 1
            if (r14 == 0) goto L_0x005a
            boolean r0 = r4.A07     // Catch:{ all -> 0x0101 }
            boolean r1 = r14.booleanValue()     // Catch:{ all -> 0x0101 }
            if (r0 != r1) goto L_0x004d
            java.lang.String r0 = r4.A06     // Catch:{ all -> 0x0101 }
            boolean r0 = X.AnonymousClass75J.A00(r0, r15)     // Catch:{ all -> 0x0101 }
            if (r0 != 0) goto L_0x005a
        L_0x004d:
            r4.A0C(r1)     // Catch:{ all -> 0x0101 }
            boolean r0 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x0101 }
            if (r0 != 0) goto L_0x0058
            r4.A06 = r15     // Catch:{ all -> 0x0101 }
        L_0x0058:
            r1 = 1
            goto L_0x005b
        L_0x005a:
            r1 = 0
        L_0x005b:
            if (r16 == 0) goto L_0x00ac
            boolean r0 = r16.isEmpty()     // Catch:{ all -> 0x0101 }
            if (r0 != 0) goto L_0x00ac
            java.util.Iterator r10 = X.AnonymousClass001.A0u(r16)     // Catch:{ all -> 0x0101 }
        L_0x0067:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0101 }
            if (r0 == 0) goto L_0x00ab
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r10)     // Catch:{ all -> 0x0101 }
            java.lang.Object r6 = r0.getKey()     // Catch:{ all -> 0x0101 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x0101 }
            int r1 = r6.intValue()     // Catch:{ all -> 0x0101 }
            java.lang.Object r9 = r0.getValue()     // Catch:{ all -> 0x0101 }
            X.0PJ r9 = (X.AnonymousClass0PJ) r9     // Catch:{ all -> 0x0101 }
            java.lang.Object r0 = r9.A00     // Catch:{ all -> 0x0101 }
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0101 }
            int r8 = X.C133676hl.A01(r0)     // Catch:{ all -> 0x0101 }
            X.7g1 r7 = r4.A08()     // Catch:{ all -> 0x0101 }
            int r5 = r1 * 4
            r0 = 15
            long r0 = r0 << r5
            long r2 = ~r0     // Catch:{ all -> 0x0101 }
            long r0 = r7.A00     // Catch:{ all -> 0x0101 }
            long r2 = r2 & r0
            int r8 = r8 << r5
            long r0 = (long) r8     // Catch:{ all -> 0x0101 }
            long r0 = r0 | r2
            r7.A00 = r0     // Catch:{ all -> 0x0101 }
            java.lang.Object r1 = r9.A01     // Catch:{ all -> 0x0101 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0101 }
            X.7g1 r0 = r4.A08()     // Catch:{ all -> 0x0101 }
            java.util.Map r0 = r0.A01     // Catch:{ all -> 0x0101 }
            r0.put(r6, r1)     // Catch:{ all -> 0x0101 }
            goto L_0x0067
        L_0x00ab:
            r1 = 1
        L_0x00ac:
            if (r17 == 0) goto L_0x00f9
            boolean r0 = r17.isEmpty()     // Catch:{ all -> 0x0101 }
            if (r0 != 0) goto L_0x00f9
            java.util.Iterator r5 = X.AnonymousClass001.A0u(r17)     // Catch:{ all -> 0x0101 }
        L_0x00b8:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0101 }
            if (r0 == 0) goto L_0x00fc
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r5)     // Catch:{ all -> 0x0101 }
            java.lang.Object r3 = r0.getKey()     // Catch:{ all -> 0x0101 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0101 }
            java.lang.Object r2 = r0.getValue()     // Catch:{ all -> 0x0101 }
            X.0PJ r2 = (X.AnonymousClass0PJ) r2     // Catch:{ all -> 0x0101 }
            java.lang.Object r1 = r2.A00     // Catch:{ all -> 0x0101 }
            if (r1 == 0) goto L_0x00b8
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0101 }
            X.7g2 r0 = r4.A03     // Catch:{ all -> 0x0101 }
            if (r0 != 0) goto L_0x00df
            X.7g2 r0 = new X.7g2     // Catch:{ all -> 0x0101 }
            r0.<init>()     // Catch:{ all -> 0x0101 }
            r4.A03 = r0     // Catch:{ all -> 0x0101 }
        L_0x00df:
            java.util.Map r0 = r0.A00     // Catch:{ all -> 0x0101 }
            r0.put(r3, r1)     // Catch:{ all -> 0x0101 }
            java.lang.Object r1 = r2.A01     // Catch:{ all -> 0x0101 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0101 }
            X.7g2 r0 = r4.A03     // Catch:{ all -> 0x0101 }
            if (r0 != 0) goto L_0x00f3
            X.7g2 r0 = new X.7g2     // Catch:{ all -> 0x0101 }
            r0.<init>()     // Catch:{ all -> 0x0101 }
            r4.A03 = r0     // Catch:{ all -> 0x0101 }
        L_0x00f3:
            java.util.Map r0 = r0.A01     // Catch:{ all -> 0x0101 }
            r0.put(r3, r1)     // Catch:{ all -> 0x0101 }
            goto L_0x00b8
        L_0x00f9:
            r11 = r1
            if (r1 == 0) goto L_0x00ff
        L_0x00fc:
            r12.A0K(r4)     // Catch:{ all -> 0x0101 }
        L_0x00ff:
            monitor-exit(r12)
            return r11
        L_0x0101:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8EA.A0L(com.whatsapp.jid.UserJid, java.lang.Boolean, java.lang.String, java.util.HashMap, java.util.HashMap):boolean");
    }

    public static final void A03(Cursor cursor, C133676hl r4, UserJid userJid) {
        r4.A05 = userJid;
        r4.A0C(AnonymousClass001.A1T(AnonymousClass0x2.A04(cursor, "merchant")));
        r4.A08().A00 = cursor.getLong(cursor.getColumnIndexOrThrow("consumer_status"));
        r4.A0A(AnonymousClass0x2.A04(cursor, "default_payment_type"));
        r4.A05(AnonymousClass0x2.A0Z(cursor, "country_data"));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: X.6hr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.util.LinkedHashSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: X.6hp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: X.6hr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: X.6hr} */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v12, types: [X.6hx] */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: type inference failed for: r4v23 */
    /* JADX WARNING: type inference failed for: r4v25 */
    /* JADX WARNING: type inference failed for: r4v26 */
    /* JADX WARNING: type inference failed for: r4v27 */
    /* JADX WARNING: type inference failed for: r4v28 */
    /* JADX WARNING: type inference failed for: r4v30 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C166587yw A07(android.database.Cursor r25) {
        /*
            r24 = this;
            java.lang.String r0 = "country"
            r9 = r25
            java.lang.String r13 = X.AnonymousClass0x2.A0Z(r9, r0)
            java.lang.String r0 = "type"
            int r17 = X.AnonymousClass0x2.A04(r9, r0)
            java.lang.String r0 = "credential_id"
            java.lang.String r11 = X.AnonymousClass0x2.A0Z(r9, r0)
            X.7pU r10 = X.C161357pU.A00(r13)
            java.lang.String r0 = "country_data"
            java.lang.String r8 = X.AnonymousClass0x2.A0Z(r9, r0)
            java.lang.String r0 = "readable_name"
            java.lang.String r7 = X.AnonymousClass0x2.A0Z(r9, r0)
            java.lang.String r0 = "issuer_name"
            java.lang.String r6 = X.AnonymousClass0x2.A0Z(r9, r0)
            java.lang.String r0 = "subtype"
            int r22 = X.AnonymousClass0x2.A04(r9, r0)
            java.lang.String r0 = "creation_ts"
            int r0 = X.AnonymousClass0x2.A04(r9, r0)
            long r0 = (long) r0
            r4 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r4
            java.lang.String r2 = "updated_ts"
            int r2 = X.AnonymousClass0x2.A04(r9, r2)
            long r2 = (long) r2
            long r2 = r2 * r4
            java.lang.String r4 = "debit_mode"
            int r15 = X.AnonymousClass0x2.A04(r9, r4)
            java.lang.String r4 = "credit_mode"
            int r14 = X.AnonymousClass0x2.A04(r9, r4)
            java.lang.String r4 = "p2m_debit_mode"
            int r20 = X.AnonymousClass0x2.A04(r9, r4)
            java.lang.String r4 = "p2m_credit_mode"
            int r21 = X.AnonymousClass0x2.A04(r9, r4)
            java.lang.String r4 = "icon"
            int r4 = r9.getColumnIndexOrThrow(r4)
            byte[] r5 = r9.getBlob(r4)
            r16 = r24
            r4 = r16
            X.4Eq r12 = r4.A01
            r4 = 0
            X.8v4 r12 = r12.BCs(r13, r4)
            switch(r17) {
                case 1: goto L_0x0138;
                case 2: goto L_0x0110;
                case 3: goto L_0x00cd;
                case 4: goto L_0x0138;
                case 5: goto L_0x008f;
                case 6: goto L_0x0138;
                case 7: goto L_0x0138;
                case 8: goto L_0x0138;
                case 9: goto L_0x0073;
                default: goto L_0x0072;
            }
        L_0x0072:
            return r4
        L_0x0073:
            if (r12 == 0) goto L_0x008c
            X.6ht r4 = r12.BG2()
            if (r4 == 0) goto L_0x008c
            r4.A05(r8)
            java.lang.String r0 = r4.A02
        L_0x0080:
            X.6hq r12 = new X.6hq
            r1 = r12
            r2 = r10
            r3 = r4
            r4 = r0
            r5 = r11
            r6 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return r12
        L_0x008c:
            java.lang.String r0 = ""
            goto L_0x0080
        L_0x008f:
            if (r12 == 0) goto L_0x00c7
            X.6hv r5 = r12.BG3()
            if (r5 == 0) goto L_0x00c5
            r5.A05(r8)
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L_0x00a6
            java.util.List r0 = r16.A0D()
            r5.A0D = r0
        L_0x00a6:
            java.lang.String r3 = r5.A09
            boolean r2 = r5.A0E
            boolean r1 = r5.A0F
            java.lang.String r4 = r5.A08
            int r0 = r5.A00
        L_0x00b0:
            X.6ho r12 = new X.6ho
            r13 = r10
            r14 = r5
            r15 = r11
            r16 = r4
            r17 = r3
            r18 = r7
            r19 = r0
            r20 = r2
            r21 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r12
        L_0x00c5:
            r3 = r4
            goto L_0x00c9
        L_0x00c7:
            r3 = r4
            r5 = r4
        L_0x00c9:
            r2 = 0
            r1 = 0
            r0 = 0
            goto L_0x00b0
        L_0x00cd:
            java.lang.String r0 = "balance_1000"
            int r0 = r9.getColumnIndexOrThrow(r0)
            long r0 = r9.getLong(r0)
            java.math.BigDecimal r2 = new java.math.BigDecimal
            r2.<init>(r0)
            r0 = -3
            java.math.BigDecimal r2 = r2.scaleByPowerOfTen(r0)
            java.lang.String r0 = "balance_ts"
            int r1 = X.AnonymousClass0x2.A04(r9, r0)
            if (r12 == 0) goto L_0x010e
            X.6hs r0 = r12.BG5()
            if (r0 == 0) goto L_0x00f6
            r0.A05(r8)
            java.util.LinkedHashSet r4 = r0.A0A()
        L_0x00f6:
            X.6hp r12 = new X.6hp
            r12.<init>(r10, r4, r15, r14)
            r12.A0A = r11
            r12.A0D(r7)
            r12.A0E(r10, r2)
            r12.A08 = r0
            r12.A0B = r6
            long r0 = X.C18290x4.A0A(r1)
            r12.A00 = r0
            goto L_0x015c
        L_0x010e:
            r0 = r4
            goto L_0x00f6
        L_0x0110:
            if (r12 == 0) goto L_0x011b
            X.6hu r4 = r12.BFz()
            if (r4 == 0) goto L_0x011b
            r4.A05(r8)
        L_0x011b:
            X.6hm r12 = new X.6hm
            r16 = r12
            r17 = r10
            r18 = r15
            r19 = r14
            r20 = r0
            r22 = r2
            r16.<init>(r17, r18, r19, r20, r22)
            r12.A0A = r11
            r12.A0D(r7)
            r12.A0B = r6
            r12.A0D = r5
            r12.A08 = r4
            return r12
        L_0x0138:
            if (r12 == 0) goto L_0x0162
            X.6hw r4 = r12.BG0()
            if (r4 == 0) goto L_0x0162
            r4.A05(r8)
            X.7yt r2 = r4.A08
            if (r2 != 0) goto L_0x015f
            r2 = 0
        L_0x0148:
            java.lang.String r2 = (java.lang.String) r2
        L_0x014a:
            X.6hr r12 = new X.6hr
            r18 = r15
            r19 = r14
            r15 = r2
            r16 = r7
            r14 = r11
            r13 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r12.A05 = r0
            r12.A08 = r4
        L_0x015c:
            r12.A0D = r5
            return r12
        L_0x015f:
            java.lang.Object r2 = r2.A00
            goto L_0x0148
        L_0x0162:
            r2 = 0
            goto L_0x014a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8EA.A07(android.database.Cursor):X.7yw");
    }

    public C166587yw A08(String str) {
        Cursor A0E;
        C166587yw r2;
        AnonymousClass4GK A0B = this.A00.get();
        try {
            boolean z = true;
            A0E = ((AnonymousClass3H0) A0B).A03.A0E(AnonymousClass79I.A00, "readPaymentMethodByCredId/QUERY_SCHEMA_PAY_METHODS", new String[]{str});
            if (A0E.moveToLast()) {
                r2 = A07(A0E);
            } else {
                r2 = null;
            }
            A0E.close();
            StringBuilder A0f = C18280x3.A0f(A0B);
            A0f.append("PAY: PaymentStore readPaymentMethodByCredId/");
            A0f.append(str);
            A0f.append("/");
            if (r2 == null) {
                z = false;
            }
            C18260x0.A1U(A0f, z);
            return r2;
        } catch (Throwable th) {
            try {
                A0B.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A0G(AnonymousClass1S4 r8, String str) {
        Cursor A0E;
        AnonymousClass4GK A0B = this.A00.get();
        try {
            A0E = ((AnonymousClass3H0) A0B).A03.A0E(C39182Az.A00, "readPaymentTransactionTmpInfo/QUERY_SCHEMA_PAY_TRANSACTIONS_TMP", C18270x1.A1b(str));
            while (A0E.moveToNext()) {
                String A0Z = AnonymousClass0x2.A0Z(A0E, "tmp_metadata");
                long A0A = C18290x4.A0A(AnonymousClass0x2.A04(A0E, "tmp_ts"));
                r8.A0Y(str);
                r8.A05(A0Z);
                if (A0A > -1) {
                    r8.A0T(A0A);
                }
            }
            A0E.close();
            C18260x0.A1P(C18280x3.A0f(A0B), "PAY: PaymentStore readPaymentTransactionTmpInfo returned: ", r8);
            return;
        } catch (Throwable th) {
            try {
                A0B.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public boolean A0J() {
        C85284Fq A0C = this.A00.A0C();
        try {
            int A072 = ((AnonymousClass3H0) A0C).A03.A07("methods", (String) null, "removeAllPaymentMethods/DELETE_SCHEMA_PAY_METHODS", (String[]) null);
            if (A072 >= 0) {
                C18260x0.A0y("PAY: PaymentStore removeAllPaymentMethods deleted num rows: ", AnonymousClass001.A0o(), A072);
            } else {
                C18260x0.A0z("PAY: PaymentStore removeAllPaymentMethods could not delete all rows: ", AnonymousClass001.A0o(), A072);
            }
            C18260x0.A0y("PAY: PaymentStore removeAllPaymentMethods deleted num payout rows: ", AnonymousClass001.A0o(), 0);
            boolean A1U = AnonymousClass001.A1U(A072);
            A0C.close();
            return A1U;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public synchronized boolean A0K(C133676hl r18) {
        C69833Yo Axl;
        boolean z;
        long j;
        synchronized (this) {
            ArrayList A0s = C18300x5.A0s(r18);
            C85284Fq A0C = this.A00.A0C();
            try {
                Axl = A0C.Axl();
                Iterator it = A0s.iterator();
                long j2 = 0;
                while (true) {
                    z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    C133676hl r11 = (C133676hl) it.next();
                    UserJid userJid = r11.A05;
                    if (userJid != null) {
                        C133676hl A052 = A05(userJid);
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("jid", userJid.getRawString());
                        contentValues.put("country_data", r11.A03());
                        C18270x1.A0b(contentValues, "merchant", AnonymousClass000.A1S(r11.A0D() ? 1 : 0) ? 1 : 0);
                        contentValues.put("consumer_status", Long.valueOf(r11.A08().A00));
                        C18270x1.A0b(contentValues, "default_payment_type", r11.A07());
                        if (A052 == null || A052.A05 == null) {
                            j = ((AnonymousClass3H0) A0C).A03.A08("contacts", "storeContacts/INSERT_SCHEMA_PAY_CONTACTS_TABLE", contentValues);
                        } else {
                            C56862sg r2 = ((AnonymousClass3H0) A0C).A03;
                            C56862sg r7 = r2;
                            j = (long) r7.A05(contentValues, "contacts", "jid=?", "storeContacts/UPDATE_SCHEMA_PAY_CONTACTS", new String[]{userJid.getRawString()});
                        }
                        if (j < 0) {
                            z = false;
                        }
                        j2 += z ? 1 : 0;
                    }
                }
                Axl.A00();
                Axl.close();
                StringBuilder A0f = C18280x3.A0f(A0C);
                A0f.append("PAY: PaymentStore storeContacts stored: ");
                A0f.append(j2);
                A0f.append(" rows with contacts size: ");
                C18260x0.A1G(A0f, A0s.size());
                if (j2 != ((long) A0s.size())) {
                    z = false;
                }
            } catch (Throwable th) {
                try {
                    A0C.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return z;
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b8 A[Catch:{ all -> 0x01e1, all -> 0x01e6, all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c7 A[Catch:{ all -> 0x01e1, all -> 0x01e6, all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0119 A[Catch:{ all -> 0x01e1, all -> 0x01e6, all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0138 A[Catch:{ all -> 0x01e1, all -> 0x01e6, all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0141 A[Catch:{ all -> 0x01e1, all -> 0x01e6, all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0148 A[Catch:{ all -> 0x01e1, all -> 0x01e6, all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0160 A[Catch:{ all -> 0x01e1, all -> 0x01e6, all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0172 A[Catch:{ all -> 0x01e1, all -> 0x01e6, all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x018d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0M(java.util.List r31) {
        /*
            r30 = this;
            r24 = 0
            r29 = r31
            int r0 = r29.size()
            if (r0 > 0) goto L_0x0016
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "PAY: PaymentStore storePaymentMethods got newMethods: "
            r0 = r29
            X.C18260x0.A1S(r2, r1, r0)
            return r24
        L_0x0016:
            r0 = r30
            java.util.List r23 = r0.A0A()
            X.1RD r0 = r0.A00
            X.4Fq r22 = r0.A0C()
            X.3Yo r21 = r22.Axl()     // Catch:{ all -> 0x01eb }
            java.util.Iterator r20 = r29.iterator()     // Catch:{ all -> 0x01e1 }
            r19 = 0
        L_0x002c:
            boolean r0 = r20.hasNext()     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x019d
            java.lang.Object r10 = r20.next()     // Catch:{ all -> 0x01e1 }
            X.7yw r10 = (X.C166587yw) r10     // Catch:{ all -> 0x01e1 }
            java.lang.String r8 = r10.A0A     // Catch:{ all -> 0x01e1 }
            X.7pU r0 = r10.A07     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x01e1 }
            r28 = r0
            X.7yt r14 = r10.A09     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = r10.A0B     // Catch:{ all -> 0x01e1 }
            r27 = r0
            long r5 = r10.A05     // Catch:{ all -> 0x01e1 }
            long r3 = r10.A06     // Catch:{ all -> 0x01e1 }
            X.6hx r0 = r10.A08     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x0053
            java.lang.String r11 = r0.A03()     // Catch:{ all -> 0x01e1 }
            goto L_0x0054
        L_0x0053:
            r11 = 0
        L_0x0054:
            if (r8 == 0) goto L_0x0173
            if (r14 == 0) goto L_0x0173
            int r7 = r10.A08()     // Catch:{ all -> 0x01e1 }
            int r0 = r10.A01     // Catch:{ all -> 0x01e1 }
            r26 = r0
            int r0 = r10.A00     // Catch:{ all -> 0x01e1 }
            r25 = r0
            r1 = 3
            r17 = 0
            r0 = 1
            if (r7 == r0) goto L_0x006b
            goto L_0x0073
        L_0x006b:
            r0 = r10
            X.6hr r0 = (X.C133736hr) r0     // Catch:{ all -> 0x01e1 }
            int r13 = r0.A01     // Catch:{ all -> 0x01e1 }
            r1 = 0
            goto L_0x0085
        L_0x0073:
            if (r7 == r1) goto L_0x0087
            r0 = 4
            if (r7 == r0) goto L_0x006b
            r0 = 6
            if (r7 == r0) goto L_0x006b
            r0 = 7
            if (r7 == r0) goto L_0x006b
            r0 = 8
            if (r7 == r0) goto L_0x006b
            r1 = 0
            r13 = 0
        L_0x0085:
            r12 = 0
            goto L_0x009b
        L_0x0087:
            r1 = r10
            X.6hp r1 = (X.C133716hp) r1     // Catch:{ all -> 0x01e1 }
            X.39Q r0 = r1.A01     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x0115
            boolean r0 = r0.A02()     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x0115
            X.39Q r0 = r1.A01     // Catch:{ all -> 0x01e1 }
            java.math.BigDecimal r12 = r0.A00     // Catch:{ all -> 0x01e1 }
        L_0x0098:
            long r1 = r1.A00     // Catch:{ all -> 0x01e1 }
            r13 = 0
        L_0x009b:
            r0 = r23
            X.7yw r16 = A00(r8, r0)     // Catch:{ all -> 0x01e1 }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x01e1 }
            r9.<init>()     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "credential_id"
            r9.put(r0, r8)     // Catch:{ all -> 0x01e1 }
            java.lang.String r15 = "country"
            r0 = r28
            r9.put(r15, r0)     // Catch:{ all -> 0x01e1 }
            boolean r0 = X.C161527pr.A02(r14)     // Catch:{ all -> 0x01e1 }
            if (r0 != 0) goto L_0x00c1
            java.lang.Object r14 = r14.A00     // Catch:{ all -> 0x01e1 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "readable_name"
            r9.put(r0, r14)     // Catch:{ all -> 0x01e1 }
        L_0x00c1:
            boolean r0 = android.text.TextUtils.isEmpty(r27)     // Catch:{ all -> 0x01e1 }
            if (r0 != 0) goto L_0x00ce
            java.lang.String r14 = "issuer_name"
            r0 = r27
            r9.put(r14, r0)     // Catch:{ all -> 0x01e1 }
        L_0x00ce:
            java.lang.String r0 = "type"
            X.C18270x1.A0b(r9, r0, r7)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "subtype"
            X.C18270x1.A0b(r9, r0, r13)     // Catch:{ all -> 0x01e1 }
            r13 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r13
            int r0 = (int) r5     // Catch:{ all -> 0x01e1 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "creation_ts"
            r9.put(r0, r5)     // Catch:{ all -> 0x01e1 }
            long r3 = r3 / r13
            int r0 = (int) r3     // Catch:{ all -> 0x01e1 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "updated_ts"
            r9.put(r0, r3)     // Catch:{ all -> 0x01e1 }
            java.lang.String r3 = "debit_mode"
            r0 = r26
            X.C18270x1.A0b(r9, r3, r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r3 = "credit_mode"
            r0 = r25
            X.C18270x1.A0b(r9, r3, r0)     // Catch:{ all -> 0x01e1 }
            int r0 = r10.A03     // Catch:{ all -> 0x01e1 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "p2m_debit_mode"
            r9.put(r0, r3)     // Catch:{ all -> 0x01e1 }
            int r0 = r10.A02     // Catch:{ all -> 0x01e1 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "p2m_credit_mode"
            r9.put(r0, r3)     // Catch:{ all -> 0x01e1 }
            goto L_0x0117
        L_0x0115:
            r12 = 0
            goto L_0x0098
        L_0x0117:
            if (r12 == 0) goto L_0x0136
            r0 = 3
            java.math.BigDecimal r0 = r12.scaleByPowerOfTen(r0)     // Catch:{ all -> 0x01e1 }
            long r3 = r0.longValue()     // Catch:{ all -> 0x01e1 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "balance_1000"
            r9.put(r0, r3)     // Catch:{ all -> 0x01e1 }
            long r1 = r1 / r13
            int r0 = (int) r1     // Catch:{ all -> 0x01e1 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "balance_ts"
            r9.put(r0, r1)     // Catch:{ all -> 0x01e1 }
        L_0x0136:
            if (r11 == 0) goto L_0x013d
            java.lang.String r0 = "country_data"
            r9.put(r0, r11)     // Catch:{ all -> 0x01e1 }
        L_0x013d:
            byte[] r1 = r10.A0D     // Catch:{ all -> 0x01e1 }
            if (r1 == 0) goto L_0x0146
            java.lang.String r0 = "icon"
            r9.put(r0, r1)     // Catch:{ all -> 0x01e1 }
        L_0x0146:
            if (r16 == 0) goto L_0x0160
            r0 = r22
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x01e1 }
            X.2sg r1 = r0.A03     // Catch:{ all -> 0x01e1 }
            java.lang.String r3 = "methods"
            java.lang.String r4 = "credential_id=?"
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x01e1 }
            r0[r24] = r8     // Catch:{ all -> 0x01e1 }
            java.lang.String r5 = "storePaymentMethods/UPDATE_SCHEMA_PAY_METHODS"
            r2 = r9
            r6 = r0
            int r2 = r1.A05(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x01e1 }
            goto L_0x0170
        L_0x0160:
            r0 = r22
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x01e1 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x01e1 }
            java.lang.String r1 = "methods"
            java.lang.String r0 = "storePaymentMethods/INSERT_SCHEMA_PAY_METHODS_TABLE"
            long r0 = r2.A08(r1, r0, r9)     // Catch:{ all -> 0x01e1 }
            int r2 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
        L_0x0170:
            if (r2 < 0) goto L_0x018d
            goto L_0x0175
        L_0x0173:
            r2 = 0
            goto L_0x017f
        L_0x0175:
            r2 = 1
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "PAY: PaymentStore storePaymentMethods stored account type: "
            X.C18260x0.A0y(r0, r1, r7)     // Catch:{ all -> 0x01e1 }
        L_0x017f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x0196
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01e1 }
            r19 = r19 | r0
            goto L_0x002c
        L_0x018d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "PAY: PaymentStore storePaymentMethods could not store: "
            X.C18260x0.A0z(r0, r1, r7)     // Catch:{ all -> 0x01e1 }
        L_0x0196:
            r21.close()     // Catch:{ all -> 0x01eb }
            r22.close()
            return r24
        L_0x019d:
            java.util.Iterator r5 = r23.iterator()     // Catch:{ all -> 0x01e1 }
        L_0x01a1:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x01d7
            java.lang.Object r2 = r5.next()     // Catch:{ all -> 0x01e1 }
            X.7yw r2 = (X.C166587yw) r2     // Catch:{ all -> 0x01e1 }
            java.lang.String r1 = r2.A0A     // Catch:{ all -> 0x01e1 }
            r0 = r29
            X.7yw r0 = A00(r1, r0)     // Catch:{ all -> 0x01e1 }
            if (r0 != 0) goto L_0x01a1
            java.lang.String r1 = r2.A0A     // Catch:{ all -> 0x01e1 }
            java.lang.String r4 = "storePaymentMethods/DELETE_SCHEMA_PAY_METHODS"
            r0 = r22
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x01e1 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x01e1 }
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x01e1 }
            r2[r24] = r1     // Catch:{ all -> 0x01e1 }
            java.lang.String r1 = "methods"
            java.lang.String r0 = "credential_id=?"
            int r0 = r3.A07(r1, r0, r4, r2)     // Catch:{ all -> 0x01e1 }
            boolean r0 = X.AnonymousClass001.A1W(r0)
            r0 = r0 | r19
            r19 = r0
            goto L_0x01a1
        L_0x01d7:
            r21.A00()     // Catch:{ all -> 0x01e1 }
            r21.close()     // Catch:{ all -> 0x01eb }
            r22.close()
            return r19
        L_0x01e1:
            r1 = move-exception
            r21.close()     // Catch:{ all -> 0x01e6 }
            goto L_0x01ea
        L_0x01e6:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01eb }
        L_0x01ea:
            throw r1     // Catch:{ all -> 0x01eb }
        L_0x01eb:
            r1 = move-exception
            r22.close()     // Catch:{ all -> 0x01f0 }
            throw r1
        L_0x01f0:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8EA.A0M(java.util.List):boolean");
    }

    public AnonymousClass8EA(C55682qk r1, C56612sH r2, C54292oU r3, C617332a r4, C60972zT r5, C45932ao r6, AnonymousClass1VX r7) {
        C626936e.A06(r3);
        this.A04 = r3;
        this.A08 = r7;
        this.A02 = r1;
        C626936e.A06(r2);
        this.A03 = r2;
        this.A07 = r6;
        this.A06 = r5;
        this.A05 = r4;
    }

    public static C166587yw A00(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C166587yw r1 = (C166587yw) it.next();
            if (str.equals(r1.A0A)) {
                return r1;
            }
        }
        return null;
    }

    public static C166587yw A01(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C166587yw r2 = (C166587yw) it.next();
            if (r2.A01 == 2) {
                return r2;
            }
        }
        return null;
    }

    public static String A02(C95814uZ r0) {
        return C161357pU.A01(C621333r.A02(AnonymousClass36P.A06(r0))).A03;
    }

    public C166587yw A06() {
        for (C166587yw r2 : A0B()) {
            if (r2.A01 == 2) {
                return r2;
            }
        }
        return null;
    }

    public List A09() {
        Cursor A0E;
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass4GK A0B = this.A00.get();
        try {
            A0E = ((AnonymousClass3H0) A0B).A03.A0E(AnonymousClass79I.A01, "readMerchantMethods/QUERY_SCHEMA_PAY_METHODS", new String[]{String.valueOf(5)});
            while (A0E.moveToNext()) {
                C166587yw A072 = A07(A0E);
                if (A072 != null) {
                    A0s.add((C133706ho) A072);
                }
            }
            A0E.close();
            C18260x0.A1P(C18280x3.A0f(A0B), "PAY: PaymentStore readMerchantMethods returned: ", A0s);
            return A0s;
        } catch (Throwable th) {
            try {
                A0B.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public List A0A() {
        Cursor A0E;
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass4GK A0B = this.A00.get();
        try {
            A0E = ((AnonymousClass3H0) A0B).A03.A0E(AnonymousClass79I.A03, "readPaymentAndMerchantMethods/QUERY_SCHEMA_PAY_METHODS", (String[]) null);
            while (A0E.moveToNext()) {
                C166587yw A072 = A07(A0E);
                if (A072 != null) {
                    A0s.add(A072);
                }
            }
            A0E.close();
            C18260x0.A1P(C18280x3.A0f(A0B), "PAY: PaymentStore readPaymentAndMerchantMethods returned: ", A0s);
            return A0s;
        } catch (Throwable th) {
            try {
                A0B.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public List A0B() {
        Cursor A0E;
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass4GK A0B = this.A00.get();
        try {
            A0E = ((AnonymousClass3H0) A0B).A03.A0E(AnonymousClass79I.A02, "readPaymentMethods/QUERY_SCHEMA_PAY_METHODS", new String[]{String.valueOf(5), String.valueOf(9)});
            while (A0E.moveToNext()) {
                C166587yw A072 = A07(A0E);
                if (A072 != null) {
                    A0s.add(A072);
                }
            }
            A0E.close();
            C18260x0.A1P(C18280x3.A0f(A0B), "PAY: PaymentStore readPaymentMethods returned: ", A0s);
            return A0s;
        } catch (Throwable th) {
            try {
                A0B.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }
}
