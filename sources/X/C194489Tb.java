package X;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9Tb  reason: invalid class name and case insensitive filesystem */
public class C194489Tb {
    public final C54292oU A00;
    public final AnonymousClass33T A01;
    public final C620733j A02;
    public final C72303dV A03;
    public final C56082rO A04;
    public final AnonymousClass8EA A05;
    public final C1907099n A06;
    public final AnonymousClass9U4 A07;
    public final C160757oG A08 = C160757oG.A00("PaymentMethodUpdateNotification", "notification", "COMMON");
    public final AnonymousClass1R1 A09;
    public final AnonymousClass4FS A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x023b, code lost:
        r1 = X.AnonymousClass002.A0F(r14, r10, r1, 0, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0261, code lost:
        r2.A0C(r1);
        r2.A0A(r1);
        X.C18270x1.A0r(r2, r1);
        r2.A09 = r8.A00(r5, r6, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0274, code lost:
        if (android.text.TextUtils.isEmpty((java.lang.CharSequence) null) != false) goto L_0x0280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0276, code lost:
        r2.A04(com.whatsapp.R.drawable.ic_fab_check, (java.lang.CharSequence) null, r8.A00(r5, r6, r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x017c, code lost:
        r1 = r8.A00.getResources().getQuantityString(com.whatsapp.R.plurals.f9nameremoved, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x018d, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x018f, code lost:
        r15.A08.A06("no available payment notification text");
        A02(r6.A0A);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x019b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01c3, code lost:
        if (r12.equals(r0) == false) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c7, code lost:
        if ((r6 instanceof X.C133706ho) == false) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01c9, code lost:
        r0 = (X.C133776hv) r6.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01cd, code lost:
        if (r0 == null) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01cf, code lost:
        r1 = r0.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01d5, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01d7, code lost:
        r1 = r8.A03.A0D.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01df, code lost:
        r0 = r6.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01e1, code lost:
        if (r0 == null) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01e3, code lost:
        r10 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01eb, code lost:
        if ("MERCHANT_VERIFIED".equals(r12) == false) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ed, code lost:
        r14 = r8.A00;
        r13 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01f2, code lost:
        r0 = new java.lang.Object[]{r10};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01f6, code lost:
        r1 = r14.getString(r13, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0201, code lost:
        if ("MERCHANT_VERIFICATION_FAILURE".equals(r12) == false) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0203, code lost:
        r14 = r8.A00;
        r13 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x020f, code lost:
        if ("MERCHANT_DISABLED".equals(r12) == false) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0211, code lost:
        r14 = r8.A00;
        r13 = com.whatsapp.R.string.f11nameremoved;
        r0 = new java.lang.Object[]{r1};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x021b, code lost:
        r1 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x021e, code lost:
        r1 = "";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r15 = this;
            r11 = r15
            X.99n r0 = r15.A06
            boolean r0 = X.C1899693i.A0x(r0)
            if (r0 == 0) goto L_0x0019
            X.3dV r0 = r15.A03
            r0.A05()
            boolean r0 = r0.A09
            if (r0 != 0) goto L_0x001a
            X.7oG r1 = r15.A08
            java.lang.String r0 = "message store not yet ready"
        L_0x0016:
            r1.A06(r0)
        L_0x0019:
            return
        L_0x001a:
            monitor-enter(r11)
            X.2rO r10 = r15.A04     // Catch:{ all -> 0x0331 }
            java.lang.String r1 = "unread_payment_method_credential_ids"
            java.lang.String r4 = r10.A01(r1)     // Catch:{ all -> 0x0331 }
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0331 }
            if (r0 == 0) goto L_0x002f
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0331 }
            goto L_0x0103
        L_0x002f:
            java.lang.String r0 = ";"
            java.lang.String[] r0 = android.text.TextUtils.split(r4, r0)     // Catch:{ all -> 0x0331 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x0331 }
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0331 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0331 }
        L_0x0041:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0331 }
            if (r0 == 0) goto L_0x0058
            java.lang.String r2 = X.AnonymousClass001.A0m(r3)     // Catch:{ all -> 0x0331 }
            java.lang.String r0 = ":"
            java.lang.String[] r2 = android.text.TextUtils.split(r2, r0)     // Catch:{ all -> 0x0331 }
            r0 = 0
            r0 = r2[r0]     // Catch:{ all -> 0x0331 }
            r8.add(r0)     // Catch:{ all -> 0x0331 }
            goto L_0x0041
        L_0x0058:
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0331 }
            if (r0 != 0) goto L_0x00ff
            X.8EA r5 = r15.A05     // Catch:{ all -> 0x0331 }
            boolean r0 = r5.A09     // Catch:{ all -> 0x0331 }
            if (r0 == 0) goto L_0x00ff
            X.1RD r0 = r5.A00     // Catch:{ all -> 0x0331 }
            X.4GK r9 = r0.get()     // Catch:{ all -> 0x0331 }
            r0 = r9
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0326 }
            X.2sg r6 = r0.A03     // Catch:{ all -> 0x0326 }
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0326 }
            java.lang.String r0 = "SELECT "
            r7.append(r0)     // Catch:{ all -> 0x0326 }
            java.lang.String r2 = ", "
            java.lang.String[] r0 = X.C1457277b.A00     // Catch:{ all -> 0x0326 }
            java.lang.String r0 = X.C379324p.A00(r2, r0)     // Catch:{ all -> 0x0326 }
            r7.append(r0)     // Catch:{ all -> 0x0326 }
            java.lang.String r0 = " FROM "
            r7.append(r0)     // Catch:{ all -> 0x0326 }
            java.lang.String r0 = "methods"
            r7.append(r0)     // Catch:{ all -> 0x0326 }
            java.lang.String r0 = " WHERE "
            r7.append(r0)     // Catch:{ all -> 0x0326 }
            java.lang.String r0 = "credential_id IN (\""
            r7.append(r0)     // Catch:{ all -> 0x0326 }
            java.lang.String r4 = "\", \""
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0326 }
            java.util.Iterator r2 = r8.iterator()     // Catch:{ all -> 0x0326 }
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0326 }
            if (r0 == 0) goto L_0x00ba
        L_0x00a7:
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x0326 }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ all -> 0x0326 }
            r3.append(r0)     // Catch:{ all -> 0x0326 }
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0326 }
            if (r0 == 0) goto L_0x00ba
            r3.append(r4)     // Catch:{ all -> 0x0326 }
            goto L_0x00a7
        L_0x00ba:
            X.AnonymousClass000.A1B(r3, r7)     // Catch:{ all -> 0x0326 }
            java.lang.String r0 = "\")"
            r7.append(r0)     // Catch:{ all -> 0x0326 }
            java.lang.String r0 = " LIMIT 100"
            java.lang.String r3 = X.AnonymousClass000.A0X(r0, r7)     // Catch:{ all -> 0x0326 }
            java.lang.String r2 = "readPaymentMethodByCredentialIds/QUERY_SCHEMA_PAY_METHODS"
            r0 = 0
            android.database.Cursor r3 = r6.A0E(r3, r2, r0)     // Catch:{ all -> 0x0326 }
            int r0 = r3.getCount()     // Catch:{ all -> 0x031a }
            java.util.ArrayList r4 = X.AnonymousClass002.A0I(r0)     // Catch:{ all -> 0x031a }
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x031a }
            if (r0 == 0) goto L_0x00f4
            X.7yw r0 = r5.A07(r3)     // Catch:{ all -> 0x031a }
            r4.add(r0)     // Catch:{ all -> 0x031a }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x031a }
            java.lang.String r0 = "PAY: PaymentTransactionStore readPaymentMethodByCredentialIds returned: "
            X.C18260x0.A1B(r0, r2, r4)     // Catch:{ all -> 0x031a }
            r3.close()     // Catch:{ all -> 0x0326 }
            r9.close()     // Catch:{ all -> 0x0331 }
            goto L_0x0103
        L_0x00f4:
            r3.close()     // Catch:{ all -> 0x0326 }
            r9.close()     // Catch:{ all -> 0x0331 }
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0331 }
            goto L_0x0103
        L_0x00ff:
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0331 }
        L_0x0103:
            monitor-exit(r11)
            X.2oU r0 = r15.A00
            android.content.Context r5 = r0.A00
            X.9U4 r0 = r15.A07
            X.9oC r0 = r0.A0G()
            X.9Ri r8 = r0.BB2()
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x030b
            if (r8 == 0) goto L_0x030b
            X.0Ue r2 = X.C66553Lw.A01(r5)
            java.lang.String r11 = "status"
            r2.A0J = r11
            r9 = 1
            r2.A03 = r9
            r2.A0E(r9)
            r0 = 4
            r2.A02(r0)
            r0 = 2131233341(0x7f080a3d, float:1.8082817E38)
            X.AnonymousClass33T.A02(r2, r0)
            int r0 = r4.size()
            r3 = 0
            r7 = 0
            if (r0 != r9) goto L_0x0244
            java.lang.Object r6 = r4.get(r3)
            X.7yw r6 = (X.C166587yw) r6
            java.lang.String r12 = r6.A0A
            java.lang.String r1 = r10.A01(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r10 = 0
            if (r0 != 0) goto L_0x0241
            java.lang.String r0 = ";"
            java.lang.String[] r0 = android.text.TextUtils.split(r1, r0)
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.Iterator r13 = r0.iterator()
        L_0x015b:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0241
            java.lang.String r1 = X.AnonymousClass001.A0m(r13)
            java.lang.String r0 = ":"
            java.lang.String[] r1 = android.text.TextUtils.split(r1, r0)
            r0 = r1[r3]
            boolean r0 = android.text.TextUtils.equals(r0, r12)
            if (r0 == 0) goto L_0x015b
            r12 = r1[r9]
        L_0x0175:
            int r0 = r12.hashCode()
            switch(r0) {
                case -1573204880: goto L_0x0222;
                case -945151213: goto L_0x01bd;
                case -863506419: goto L_0x01a2;
                case -188177059: goto L_0x019f;
                case 1084491615: goto L_0x019c;
                default: goto L_0x017c;
            }
        L_0x017c:
            android.content.Context r0 = r8.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131755237(0x7f1000e5, float:1.9141348E38)
            java.lang.String r1 = r1.getQuantityString(r0, r9)
        L_0x0189:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0261
            X.7oG r1 = r15.A08
            java.lang.String r0 = "no available payment notification text"
            r1.A06(r0)
            java.lang.String r0 = r6.A0A
            r15.A02(r0)
            return
        L_0x019c:
            java.lang.String r0 = "MERCHANT_VERIFIED"
            goto L_0x01bf
        L_0x019f:
            java.lang.String r0 = "MERCHANT_VERIFICATION_FAILURE"
            goto L_0x01bf
        L_0x01a2:
            java.lang.String r0 = "PAYMENT_METHOD_VERIFIED"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x017c
            boolean r0 = r6 instanceof X.C133736hr
            if (r0 == 0) goto L_0x017c
            r0 = r6
            X.6hr r0 = (X.C133736hr) r0
            android.content.Context r14 = r8.A00
            r13 = 2131887030(0x7f1203b6, float:1.9408656E38)
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.String r10 = X.C195169Wk.A02(r14, r0)
            goto L_0x023b
        L_0x01bd:
            java.lang.String r0 = "MERCHANT_DISABLED"
        L_0x01bf:
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x017c
            boolean r0 = r6 instanceof X.C133706ho
            if (r0 == 0) goto L_0x017c
            X.6hx r0 = r6.A08
            X.6hv r0 = (X.C133776hv) r0
            if (r0 == 0) goto L_0x021b
            java.lang.String r1 = r0.A03
        L_0x01d1:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x01df
            X.2sr r0 = r8.A03
            X.2og r0 = r0.A0D
            java.lang.String r1 = r0.A03()
        L_0x01df:
            X.7yt r0 = r6.A09
            if (r0 == 0) goto L_0x01e5
            java.lang.Object r10 = r0.A00
        L_0x01e5:
            java.lang.String r0 = "MERCHANT_VERIFIED"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x01fb
            android.content.Context r14 = r8.A00
            r13 = 2131887029(0x7f1203b5, float:1.9408654E38)
        L_0x01f2:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r3] = r10
        L_0x01f6:
            java.lang.String r1 = r14.getString(r13, r0)
            goto L_0x0189
        L_0x01fb:
            java.lang.String r0 = "MERCHANT_VERIFICATION_FAILURE"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0209
            android.content.Context r14 = r8.A00
            r13 = 2131887028(0x7f1203b4, float:1.9408652E38)
            goto L_0x01f2
        L_0x0209:
            java.lang.String r0 = "MERCHANT_DISABLED"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x021e
            android.content.Context r14 = r8.A00
            r13 = 2131887026(0x7f1203b2, float:1.9408647E38)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r3] = r1
            goto L_0x01f6
        L_0x021b:
            java.lang.String r1 = ""
            goto L_0x01d1
        L_0x021e:
            java.lang.String r1 = ""
            goto L_0x0189
        L_0x0222:
            java.lang.String r0 = "MERCHANT_LINKED"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x017c
            boolean r0 = r6 instanceof X.C133706ho
            if (r0 == 0) goto L_0x017c
            X.7yt r0 = r6.A09
            android.content.Context r14 = r8.A00
            r13 = 2131887027(0x7f1203b3, float:1.940865E38)
            java.lang.Object[] r1 = new java.lang.Object[r9]
            if (r0 == 0) goto L_0x023b
            java.lang.Object r10 = r0.A00
        L_0x023b:
            java.lang.String r1 = X.AnonymousClass002.A0F(r14, r10, r1, r3, r13)
            goto L_0x0189
        L_0x0241:
            r12 = r7
            goto L_0x0175
        L_0x0244:
            int r13 = r4.size()
            X.33j r12 = r15.A02
            r10 = 2131755237(0x7f1000e5, float:1.9141348E38)
            long r0 = (long) r13
            java.lang.Object[] r6 = new java.lang.Object[r9]
            X.AnonymousClass000.A1P(r6, r13, r3)
            java.lang.String r0 = r12.A0L(r6, r10, r0)
            r2.A0A(r0)
            android.app.PendingIntent r0 = r8.A00(r5, r7, r7)
            r2.A09 = r0
            goto L_0x0280
        L_0x0261:
            r2.A0C(r1)
            r2.A0A(r1)
            X.C18270x1.A0r(r2, r1)
            android.app.PendingIntent r0 = r8.A00(r5, r6, r12)
            r2.A09 = r0
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x0280
            r1 = 2131232215(0x7f0805d7, float:1.8080533E38)
            android.app.PendingIntent r0 = r8.A00(r5, r6, r12)
            r2.A04(r1, r7, r0)
        L_0x0280:
            X.0Ue r6 = X.C66553Lw.A01(r5)
            r6.A0J = r11
            r6.A03 = r9
            X.33j r11 = r15.A02
            r10 = 2131755237(0x7f1000e5, float:1.9141348E38)
            int r0 = r4.size()
            long r0 = (long) r0
            java.lang.Object[] r9 = new java.lang.Object[r9]
            int r4 = r4.size()
            X.AnonymousClass000.A1P(r9, r4, r3)
            java.lang.String r0 = r11.A0L(r9, r10, r0)
            r6.A0A(r0)
            r4 = 2131232215(0x7f0805d7, float:1.8080533E38)
            android.content.Context r1 = r8.A00
            r0 = 2131895042(0x7f122302, float:1.9424906E38)
            java.lang.String r1 = r1.getString(r0)
            android.app.PendingIntent r0 = r8.A00(r5, r7, r7)
            r6.A04(r4, r1, r0)
            android.app.Notification r0 = r6.A01()
            r6.A08 = r0
            r0 = 2131233341(0x7f080a3d, float:1.8082817E38)
            X.AnonymousClass33T.A02(r6, r0)
            java.lang.Class<X.93n> r0 = X.C1900193n.class
            android.content.Intent r1 = X.AnonymousClass0x9.A08(r5, r0)
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r4 = 22
            android.app.PendingIntent r1 = X.C624735e.A01(r5, r4, r1, r0)
            android.app.Notification r0 = r2.A07
            r0.deleteIntent = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x02e7
            X.1R1 r0 = r15.A09
            X.2sa r0 = r0.A0I()
            X.1qy r0 = (X.C32501qy) r0
            java.lang.String r0 = r0.A0C()
            r2.A0K = r0
        L_0x02e7:
            android.app.Notification r2 = r2.A01()
            X.7oG r1 = r15.A08     // Catch:{ SecurityException -> 0x02f8 }
            java.lang.String r0 = "NotificationManager/notify"
            r1.A06(r0)     // Catch:{ SecurityException -> 0x02f8 }
            X.33T r0 = r15.A01     // Catch:{ SecurityException -> 0x02f8 }
            r0.A04(r4, r2)     // Catch:{ SecurityException -> 0x02f8 }
            goto L_0x0330
        L_0x02f8:
            r2 = move-exception
            java.lang.String r1 = r2.toString()
            java.lang.String r0 = "permission issue with UPDATE_APP_OPS_STATS should only occur in Android 4.3 or earlier"
            X.C626936e.A0D(r3, r0)
            java.lang.String r0 = "android.permission.UPDATE_APP_OPS_STATS"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0019
            throw r2
        L_0x030b:
            X.33T r2 = r15.A01
            java.lang.String r1 = "PaymentMethodUpdateNotification1"
            r0 = 22
            r2.A05(r0, r1)
            X.7oG r1 = r15.A08
            java.lang.String r0 = "no unread payment notifications"
            goto L_0x0016
        L_0x031a:
            r1 = move-exception
            if (r3 == 0) goto L_0x0325
            r3.close()     // Catch:{ all -> 0x0321 }
            goto L_0x0325
        L_0x0321:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0326 }
        L_0x0325:
            throw r1     // Catch:{ all -> 0x0326 }
        L_0x0326:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x032b }
            goto L_0x032f
        L_0x032b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0331 }
        L_0x032f:
            throw r1     // Catch:{ all -> 0x0331 }
        L_0x0330:
            return
        L_0x0331:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194489Tb.A01():void");
    }

    public final synchronized void A02(String str) {
        if (TextUtils.isEmpty(str)) {
            this.A08.A05("removeUnreadPaymentMethodUpdate empty credentialId");
        } else {
            C56082rO r8 = this.A04;
            String A012 = r8.A01("unread_payment_method_credential_ids");
            if (A012 == null) {
                A012 = "";
            }
            String[] split = TextUtils.split(A012, ";");
            HashSet A0K = AnonymousClass002.A0K();
            for (String str2 : split) {
                if (!TextUtils.equals(TextUtils.split(str2, ":")[0], str)) {
                    A0K.add(str2);
                } else {
                    C160757oG r2 = this.A08;
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("removeUnreadPaymentMethodUpdate/removed credentialId:");
                    C1899593h.A1J(r2, str, A0o);
                }
            }
            r8.A05("unread_payment_method_credential_ids", TextUtils.join(";", A0K));
        }
    }

    public synchronized void A03(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A02(AnonymousClass001.A0m(it));
        }
        if (TextUtils.isEmpty(this.A04.A01("unread_payment_method_credential_ids"))) {
            this.A01.A05(22, "PaymentMethodUpdateNotification4");
        }
    }

    public void A00() {
        C56082rO r2 = this.A04;
        if (!TextUtils.isEmpty(r2.A01("unread_payment_method_credential_ids"))) {
            r2.A05("unread_payment_method_credential_ids", "");
            this.A01.A05(22, "PaymentMethodUpdateNotification3");
        }
    }

    public C194489Tb(C54292oU r4, AnonymousClass33T r5, C620733j r6, C72303dV r7, C56082rO r8, AnonymousClass8EA r9, C1907099n r10, AnonymousClass9U4 r11, AnonymousClass1R1 r12, AnonymousClass4FS r13) {
        this.A00 = r4;
        this.A0A = r13;
        this.A05 = r9;
        this.A02 = r6;
        this.A07 = r11;
        this.A09 = r12;
        this.A04 = r8;
        this.A03 = r7;
        this.A06 = r10;
        this.A01 = r5;
    }
}
