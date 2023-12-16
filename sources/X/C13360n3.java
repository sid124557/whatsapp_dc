package X;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.Collection;
import java.util.List;

/* renamed from: X.0n3  reason: invalid class name and case insensitive filesystem */
public class C13360n3 implements Runnable {
    public static final String A02 = C06240Wu.A01("EnqueueRunnable");
    public final C08960fQ A00;
    public final AnonymousClass0XO A01;

    public static final C06250Wv A01(C06250Wv r3, List list) {
        C162457s7.A0J(list, 0);
        int i = Build.VERSION.SDK_INT;
        if (23 > i) {
            try {
                Class<?> cls = Class.forName("androidx.work.impl.background.gcm.GcmScheduler");
                if ((list instanceof Collection) && list.isEmpty()) {
                    return r3;
                }
                for (Object obj : list) {
                    if (cls.isAssignableFrom(obj.getClass())) {
                    }
                }
                return r3;
            } catch (ClassNotFoundException unused) {
                return r3;
            }
        } else if (i >= 26) {
            return r3;
        }
        return A00(r3);
    }

    public C13360n3(AnonymousClass0XO r2) {
        C08960fQ r0 = new C08960fQ();
        this.A01 = r2;
        this.A00 = r0;
    }

    public static final C06250Wv A00(C06250Wv r44) {
        C06250Wv r14 = r44;
        AnonymousClass0XS r1 = r14.A0A;
        String str = r14.A0G;
        String name = ConstraintTrackingWorker.class.getName();
        if (C162457s7.A0P(str, name)) {
            return r14;
        }
        if (!r1.A04 && !r1.A07) {
            return r14;
        }
        AnonymousClass0Q9 r2 = new AnonymousClass0Q9();
        r2.A03(r14.A0B.A00);
        r2.A00.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
        AnonymousClass0Xq A002 = r2.A00();
        C162457s7.A0D(name);
        String str2 = r14.A0J;
        AnonymousClass0GD r21 = r14.A0E;
        String str3 = r14.A0F;
        AnonymousClass0Xq r442 = r14.A0C;
        long j = r14.A04;
        long j2 = r14.A05;
        long j3 = r14.A03;
        AnonymousClass0XS r43 = r14.A0A;
        int i = r14.A01;
        AnonymousClass0FN r42 = r14.A09;
        long j4 = r14.A02;
        long j5 = r14.A06;
        long j6 = r14.A07;
        long j7 = r14.A08;
        boolean z = r14.A0H;
        boolean z2 = z;
        long j8 = j;
        return C06250Wv.A00(r42, r43, A002, r442, r14.A0D, r21, str2, name, str3, i, r14.A00, r14.A0I, j8, j2, j3, j4, j5, j6, j7, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0189, code lost:
        if (r21 != false) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x018b, code lost:
        r2 = r6.A0J();
        r1 = r2.BEY(r7).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x019b, code lost:
        if (r1.hasNext() == false) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x019d, code lost:
        r2.B1L(((X.AnonymousClass0PM) r1.next()).A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01a9, code lost:
        r22 = false;
        r21 = false;
        r13 = java.util.Collections.emptyList();
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A02(X.AnonymousClass0XO r24) {
        /*
            r10 = r24
            java.util.List r0 = r10.A07
            r24 = 0
            if (r0 == 0) goto L_0x0042
            java.util.Iterator r5 = r0.iterator()
        L_0x000c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0042
            java.lang.Object r4 = r5.next()
            X.0XO r4 = (X.AnonymousClass0XO) r4
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x0023
            boolean r0 = A02(r4)
            r24 = r24 | r0
            goto L_0x000c
        L_0x0023:
            X.C06240Wu.A00()
            java.lang.String r3 = A02
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Already enqueued work ids ("
            r2.append(r0)
            java.lang.String r1 = ", "
            java.util.List r0 = r4.A06
            java.lang.String r0 = android.text.TextUtils.join(r1, r0)
            r2.append(r0)
            java.lang.String r0 = ")"
            X.AnonymousClass000.A1F(r0, r3, r2)
            goto L_0x000c
        L_0x0042:
            java.util.Set r1 = X.AnonymousClass0XO.A00(r10)
            X.0Xb r9 = r10.A03
            java.util.List r11 = r10.A08
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r8 = r1.toArray(r0)
            java.lang.String[] r8 = (java.lang.String[]) r8
            java.lang.String r7 = r10.A04
            X.0Fs r12 = r10.A02
            long r3 = java.lang.System.currentTimeMillis()
            androidx.work.impl.WorkDatabase r6 = r9.A04
            r5 = 1
            r2 = 0
            if (r8 == 0) goto L_0x00b2
            int r14 = r8.length
            if (r14 <= 0) goto L_0x00b2
            r16 = 1
            r13 = 0
            r23 = 1
            r22 = 0
            r21 = 0
        L_0x006d:
            r15 = r8[r13]
            X.0uV r0 = r6.A0J()
            X.0Wv r0 = r0.BEX(r15)
            if (r0 != 0) goto L_0x0096
            X.C06240Wu.A00()
            java.lang.String r2 = A02
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Prerequisite "
            r1.append(r0)
            r1.append(r15)
            java.lang.String r0 = " doesn't exist; not enqueuing"
            X.AnonymousClass000.A1D(r0, r2, r1)
        L_0x008f:
            r5 = 0
        L_0x0090:
            r0 = 1
            r10.A01 = r0
            r5 = r5 | r24
            return r5
        L_0x0096:
            X.0GD r1 = r0.A0E
            X.0GD r0 = X.AnonymousClass0GD.SUCCEEDED
            boolean r0 = X.AnonymousClass000.A1Y(r1, r0)
            r23 = r23 & r0
            X.0GD r0 = X.AnonymousClass0GD.FAILED
            if (r1 != r0) goto L_0x00ab
            r21 = 1
        L_0x00a6:
            int r13 = r13 + 1
            if (r13 >= r14) goto L_0x00ba
            goto L_0x006d
        L_0x00ab:
            X.0GD r0 = X.AnonymousClass0GD.CANCELLED
            if (r1 != r0) goto L_0x00a6
            r22 = 1
            goto L_0x00a6
        L_0x00b2:
            r16 = 0
            r23 = 1
            r22 = 0
            r21 = 0
        L_0x00ba:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r20 = r0 ^ 1
            if (r20 == 0) goto L_0x01bc
            if (r16 != 0) goto L_0x01bc
            X.0uV r0 = r6.A0J()
            java.util.List r14 = r0.BEY(r7)
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x01bc
            X.0Fs r0 = X.C02320Fs.APPEND
            if (r12 == r0) goto L_0x011b
            X.0Fs r0 = X.C02320Fs.APPEND_OR_REPLACE
            if (r12 == r0) goto L_0x011b
            X.0Fs r0 = X.C02320Fs.KEEP
            if (r12 != r0) goto L_0x00f9
            java.util.Iterator r12 = r14.iterator()
        L_0x00e2:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00f9
            java.lang.Object r0 = r12.next()
            X.0PM r0 = (X.AnonymousClass0PM) r0
            X.0GD r1 = r0.A00
            X.0GD r0 = X.AnonymousClass0GD.ENQUEUED
            if (r1 == r0) goto L_0x008f
            X.0GD r0 = X.AnonymousClass0GD.RUNNING
            if (r1 != r0) goto L_0x00e2
            goto L_0x008f
        L_0x00f9:
            X.0BQ r0 = new X.0BQ
            r0.<init>(r9, r7, r2)
            r0.run()
            X.0uV r2 = r6.A0J()
            java.util.Iterator r1 = r14.iterator()
        L_0x0109:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01bd
            java.lang.Object r0 = r1.next()
            X.0PM r0 = (X.AnonymousClass0PM) r0
            java.lang.String r0 = r0.A01
            r2.B1L(r0)
            goto L_0x0109
        L_0x011b:
            X.0sZ r19 = r6.A0E()
            java.util.ArrayList r13 = X.AnonymousClass001.A0s()
            java.util.Iterator r18 = r14.iterator()
        L_0x0127:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x0183
            java.lang.Object r15 = r18.next()
            X.0PM r15 = (X.AnonymousClass0PM) r15
            java.lang.String r14 = r15.A01
            r0 = r19
            X.0fd r0 = (X.C09090fd) r0
            java.lang.String r1 = "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?"
            r17 = 1
            X.0eu r2 = X.C02920Ic.A00(r1, r5)
            r2.Axu(r5, r14)
            X.0R5 r1 = r0.A01
            r1.A09()
            r0 = 0
            android.database.Cursor r1 = X.C02930Id.A00(r1, r2, r0)
            boolean r16 = r1.moveToFirst()     // Catch:{ all -> 0x0294 }
            if (r16 == 0) goto L_0x015e
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0294 }
            if (r0 != 0) goto L_0x015c
            r17 = 0
        L_0x015c:
            r0 = r17
        L_0x015e:
            r1.close()
            r2.A01()
            if (r0 != 0) goto L_0x0127
            X.0GD r2 = r15.A00
            X.0GD r0 = X.AnonymousClass0GD.SUCCEEDED
            boolean r1 = X.AnonymousClass000.A1Y(r2, r0)
            r1 = r1 & r23
            X.0GD r0 = X.AnonymousClass0GD.FAILED
            if (r2 != r0) goto L_0x017c
            r21 = 1
        L_0x0176:
            r13.add(r14)
            r23 = r1
            goto L_0x0127
        L_0x017c:
            X.0GD r0 = X.AnonymousClass0GD.CANCELLED
            if (r2 != r0) goto L_0x0176
            r22 = 1
            goto L_0x0176
        L_0x0183:
            X.0Fs r0 = X.C02320Fs.APPEND_OR_REPLACE
            if (r12 != r0) goto L_0x01b1
            if (r22 != 0) goto L_0x018b
            if (r21 == 0) goto L_0x01b1
        L_0x018b:
            X.0uV r2 = r6.A0J()
            java.util.List r0 = r2.BEY(r7)
            java.util.Iterator r1 = r0.iterator()
        L_0x0197:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01a9
            java.lang.Object r0 = r1.next()
            X.0PM r0 = (X.AnonymousClass0PM) r0
            java.lang.String r0 = r0.A01
            r2.B1L(r0)
            goto L_0x0197
        L_0x01a9:
            java.util.List r13 = java.util.Collections.emptyList()
            r22 = 0
            r21 = 0
        L_0x01b1:
            java.lang.Object[] r8 = r13.toArray(r8)
            java.lang.String[] r8 = (java.lang.String[]) r8
            int r0 = r8.length
            boolean r16 = X.AnonymousClass001.A1W(r0)
        L_0x01bc:
            r5 = 0
        L_0x01bd:
            java.util.Iterator r15 = r11.iterator()
        L_0x01c1:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0090
            java.lang.Object r12 = r15.next()
            X.0NS r12 = (X.AnonymousClass0NS) r12
            X.0Wv r11 = r12.A00
            if (r16 == 0) goto L_0x0290
            if (r23 != 0) goto L_0x0290
            if (r21 == 0) goto L_0x0286
            X.0GD r0 = X.AnonymousClass0GD.FAILED
        L_0x01d7:
            r11.A0E = r0
        L_0x01d9:
            X.0GD r1 = r11.A0E
            X.0GD r0 = X.AnonymousClass0GD.ENQUEUED
            if (r1 != r0) goto L_0x01e0
            r5 = 1
        L_0x01e0:
            X.0uV r2 = r6.A0J()
            java.util.List r0 = r9.A07
            X.0Wv r1 = A01(r11, r0)
            X.0fi r2 = (X.C09140fi) r2
            X.0R5 r11 = r2.A02
            r11.A09()
            r11.A0A()
            X.09r r0 = r2.A00     // Catch:{ all -> 0x029c }
            r0.A05(r1)     // Catch:{ all -> 0x029c }
            r11.A0B()     // Catch:{ all -> 0x029c }
            r11.A0C()
            if (r16 == 0) goto L_0x022c
            int r13 = r8.length
            r2 = 0
        L_0x0203:
            if (r2 >= r13) goto L_0x022c
            r11 = r8[r2]
            java.lang.String r0 = r12.A00()
            X.0LF r1 = new X.0LF
            r1.<init>(r0, r11)
            X.0sZ r0 = r6.A0E()
            X.0fd r0 = (X.C09090fd) r0
            X.0R5 r11 = r0.A01
            r11.A09()
            r11.A0A()
            X.09r r0 = r0.A00     // Catch:{ all -> 0x029c }
            r0.A05(r1)     // Catch:{ all -> 0x029c }
            r11.A0B()     // Catch:{ all -> 0x029c }
            r11.A0C()
            int r2 = r2 + 1
            goto L_0x0203
        L_0x022c:
            X.0sa r14 = r6.A0K()
            java.lang.String r2 = r12.A00()
            java.util.Set r0 = r12.A01
            java.util.Iterator r13 = r0.iterator()
        L_0x023a:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0260
            java.lang.String r0 = X.AnonymousClass001.A0m(r13)
            X.0LH r1 = new X.0LH
            r1.<init>(r0, r2)
            r0 = r14
            X.0fj r0 = (X.C09150fj) r0
            X.0R5 r11 = r0.A01
            r11.A09()
            r11.A0A()
            X.09r r0 = r0.A00     // Catch:{ all -> 0x029c }
            r0.A05(r1)     // Catch:{ all -> 0x029c }
            r11.A0B()     // Catch:{ all -> 0x029c }
            r11.A0C()
            goto L_0x023a
        L_0x0260:
            if (r20 == 0) goto L_0x01c1
            X.0rH r2 = r6.A0H()
            java.lang.String r0 = r12.A00()
            X.0LG r1 = new X.0LG
            r1.<init>(r7, r0)
            X.0fg r2 = (X.C09120fg) r2
            X.0R5 r11 = r2.A01
            r11.A09()
            r11.A0A()
            X.09r r0 = r2.A00     // Catch:{ all -> 0x029c }
            r0.A05(r1)     // Catch:{ all -> 0x029c }
            r11.A0B()     // Catch:{ all -> 0x029c }
            r11.A0C()
            goto L_0x01c1
        L_0x0286:
            if (r22 == 0) goto L_0x028c
            X.0GD r0 = X.AnonymousClass0GD.CANCELLED
            goto L_0x01d7
        L_0x028c:
            X.0GD r0 = X.AnonymousClass0GD.BLOCKED
            goto L_0x01d7
        L_0x0290:
            r11.A06 = r3
            goto L_0x01d9
        L_0x0294:
            r0 = move-exception
            r1.close()
            r2.A01()
            throw r0
        L_0x029c:
            r0 = move-exception
            r11.A0C()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13360n3.A02(X.0XO):boolean");
    }

    public void run() {
        IllegalStateException th;
        WorkDatabase workDatabase;
        try {
            AnonymousClass0XO r2 = this.A01;
            if (!AnonymousClass0XO.A01(r2, AnonymousClass002.A0K())) {
                C06310Xb r4 = r2.A03;
                workDatabase = r4.A04;
                workDatabase.A0A();
                boolean A022 = A02(r2);
                workDatabase.A0B();
                workDatabase.A0C();
                if (A022) {
                    AnonymousClass0SG.A00(r4.A01, RescheduleReceiver.class, true);
                    AnonymousClass0VJ.A01(r4.A02, workDatabase, r4.A07);
                }
                this.A00.A00(C17140ud.A01);
                return;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("WorkContinuation has cycles (");
            A0o.append(r2);
            th = AnonymousClass000.A0I(")", A0o);
            throw th;
        } catch (Throwable th2) {
            this.A00.A00(new C01440Av(th2));
        }
    }
}
