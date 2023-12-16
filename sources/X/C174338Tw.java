package X;

import java.util.TimerTask;
import org.npci.upi.security.pinactivitycomponent.s;
import org.npci.upi.security.pinactivitycomponent.u;

/* renamed from: X.8Tw  reason: invalid class name and case insensitive filesystem */
public class C174338Tw extends TimerTask {
    public long A00 = (System.currentTimeMillis() - 45000);
    public final /* synthetic */ int A01;
    public final /* synthetic */ s A02;
    public final /* synthetic */ u A03;

    public C174338Tw(s sVar, u uVar, int i) {
        this.A02 = sVar;
        this.A03 = uVar;
        this.A01 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0133, code lost:
        if (r6 == null) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0135, code lost:
        r6.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r15 = this;
            org.npci.upi.security.pinactivitycomponent.u r5 = r15.A03
            int r8 = r15.A01
            long r0 = r15.A00
            r2 = 2000(0x7d0, double:9.88E-321)
            long r0 = r0 - r2
            java.lang.String r2 = "content://sms/inbox"
            android.net.Uri r10 = android.net.Uri.parse(r2)
            java.lang.String r4 = "body"
            java.lang.String r3 = "date"
            java.lang.String r7 = "_id"
            java.lang.String r2 = "address"
            java.lang.String[] r11 = new java.lang.String[]{r7, r2, r4, r3}
            r4 = 0
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r2 = "date > ?"
            java.lang.String r12 = java.lang.String.format(r2, r3)
            java.lang.String r14 = "date DESC"
            android.content.Context r2 = r5.A00     // Catch:{ Exception | SecurityException -> 0x0138, all -> 0x013f }
            android.content.ContentResolver r9 = r2.getContentResolver()     // Catch:{ Exception | SecurityException -> 0x0138, all -> 0x013f }
            r3 = 1
            java.lang.String[] r13 = new java.lang.String[r3]     // Catch:{ Exception | SecurityException -> 0x0138, all -> 0x013f }
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ Exception | SecurityException -> 0x0138, all -> 0x013f }
            java.lang.String r2 = ""
            java.lang.String r0 = X.AnonymousClass000.A0Z(r2, r6, r0)     // Catch:{ Exception | SecurityException -> 0x0138, all -> 0x013f }
            r13[r4] = r0     // Catch:{ Exception | SecurityException -> 0x0138, all -> 0x013f }
            android.database.Cursor r6 = r9.query(r10, r11, r12, r13, r14)     // Catch:{ Exception | SecurityException -> 0x0138, all -> 0x013f }
        L_0x003f:
            boolean r0 = r6.moveToNext()     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            if (r0 == 0) goto L_0x0135
            java.lang.String r1 = r6.getString(r3)     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            r0 = 2
            java.lang.String r0 = r6.getString(r0)     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            X.7TF r4 = r5.A01(r1, r0, r8)     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            if (r4 == 0) goto L_0x003f
            int r0 = r6.getColumnIndex(r7)     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            long r0 = r6.getLong(r0)     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            java.lang.String r9 = java.lang.String.valueOf(r0)     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            r4.A02 = r9     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            java.util.List r0 = r5.A01     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            if (r0 != 0) goto L_0x0080
            X.7Ew r0 = r5.A03     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            java.lang.String r1 = "msgID"
            android.content.SharedPreferences r0 = r0.A00     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            java.lang.String r1 = r0.getString(r1, r2)     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            java.lang.String r0 = ","
            java.lang.String[] r0 = r1.split(r0)     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            r5.A01 = r0     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
        L_0x0080:
            boolean r0 = r0.contains(r9)     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            if (r0 != 0) goto L_0x003f
            java.lang.String r0 = r4.A00     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            java.lang.String r9 = org.npci.upi.security.pinactivitycomponent.u.A00(r0)     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            java.util.List r0 = r5.A01     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            if (r0 != 0) goto L_0x00a6
            X.7Ew r0 = r5.A03     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            java.lang.String r1 = "msgID"
            android.content.SharedPreferences r0 = r0.A00     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            java.lang.String r1 = r0.getString(r1, r2)     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            java.lang.String r0 = ","
            java.lang.String[] r0 = r1.split(r0)     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            r5.A01 = r0     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
        L_0x00a6:
            boolean r0 = r0.contains(r9)     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            if (r0 != 0) goto L_0x003f
            java.lang.String r9 = r4.A02     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            if (r9 != 0) goto L_0x00b9
            java.lang.String r0 = r4.A00     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            java.lang.String r9 = org.npci.upi.security.pinactivitycomponent.u.A00(r0)     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            if (r9 != 0) goto L_0x00b9
            goto L_0x011a
        L_0x00b9:
            X.7Ew r0 = r5.A03     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            java.lang.String r7 = "msgID"
            android.content.SharedPreferences r8 = r0.A00     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            java.lang.String r0 = r8.getString(r7, r2)     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            java.lang.String r5 = ","
            java.lang.String[] r0 = r0.split(r5)     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            java.util.ArrayList r3 = X.AnonymousClass0x2.A0i(r0)     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            boolean r0 = r3.contains(r9)     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            if (r0 != 0) goto L_0x011a
            int r1 = r3.size()     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            r0 = 10
            if (r1 < r0) goto L_0x00df
            r0 = 0
            r3.remove(r0)     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
        L_0x00df:
            r3.add(r9)     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            int r0 = r3.size()     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            if (r0 > 0) goto L_0x00ea
            r1 = 0
            goto L_0x0110
        L_0x00ea:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r2)     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            java.lang.Object r0 = X.AnonymousClass0x9.A0t(r3)     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            r2 = 1
        L_0x00f9:
            int r0 = r3.size()     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            if (r2 >= r0) goto L_0x0110
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r1, r5)     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            java.lang.Object r0 = r3.get(r2)     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            int r2 = r2 + 1
            goto L_0x00f9
        L_0x0110:
            android.content.SharedPreferences$Editor r0 = r8.edit()     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            r0.putString(r7, r1)     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
            r0.commit()     // Catch:{ Exception | SecurityException -> 0x0133, all -> 0x012c }
        L_0x011a:
            r6.close()
            android.os.Handler r2 = X.AnonymousClass000.A0A()
            r1 = 14
            X.3a3 r0 = new X.3a3
            r0.<init>(r15, r1, r4)
            r2.post(r0)
            goto L_0x0138
        L_0x012c:
            r0 = move-exception
            if (r6 == 0) goto L_0x0140
            r6.close()
            throw r0
        L_0x0133:
            if (r6 == 0) goto L_0x0138
        L_0x0135:
            r6.close()
        L_0x0138:
            long r0 = java.lang.System.currentTimeMillis()
            r15.A00 = r0
            return
        L_0x013f:
            r0 = move-exception
        L_0x0140:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C174338Tw.run():void");
    }
}
