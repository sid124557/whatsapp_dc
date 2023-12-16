package X;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.CancellationSignal;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.2sE  reason: invalid class name and case insensitive filesystem */
public class C56582sE {
    public CancellationSignal A00;
    public CountDownLatch A01;
    public final C55682qk A02;
    public final C620633i A03;
    public final C56612sH A04;
    public final AnonymousClass1VX A05;
    public final AnonymousClass4FV A06;
    public final C66423Lj A07;
    public final AnonymousClass36W A08;
    public final AnonymousClass2LS A09;
    public final AnonymousClass30Q A0A;
    public final C56022rI A0B;
    public final C55462qO A0C;
    public final C48152eR A0D;
    public final AnonymousClass3R3 A0E;
    public final C28851hs A0F;
    public final AnonymousClass2OZ A0G;
    public final C55362qE A0H;
    public final AnonymousClass317 A0I;
    public final AnonymousClass33M A0J;
    public final C183538qC A0K;
    public final C183538qC A0L;
    public final C183538qC A0M;
    public final List A0N = AnonymousClass001.A0s();

    public final synchronized long A00() {
        return this.A0J.A06();
    }

    public final synchronized void A06() {
        this.A0J.A07();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        if (r1 == false) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A09() {
        /*
            r2 = this;
            monitor-enter(r2)
            android.os.CancellationSignal r0 = r2.A00     // Catch:{ all -> 0x000f }
            if (r0 == 0) goto L_0x000c
            boolean r1 = r0.isCanceled()     // Catch:{ all -> 0x000f }
            r0 = 1
            if (r1 != 0) goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            monitor-exit(r2)
            return r0
        L_0x000f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56582sE.A09():boolean");
    }

    public final C25671at A01(int i) {
        long j;
        Cursor A012;
        long j2;
        C56022rI r4 = this.A0B;
        String A022 = r4.A02();
        C25671at r8 = new C25671at();
        r8.A05 = Integer.valueOf(i);
        r8.A09 = A022;
        r8.A03 = AnonymousClass001.A0f();
        if (10 == i) {
            r8.A07 = AnonymousClass0x9.A0o(A00(), 1000);
            C59412ws r9 = (C59412ws) this.A0L.get();
            Long A002 = ((AnonymousClass2W1) this.A0K.get()).A00();
            C55362qE r0 = this.A0H;
            long A003 = r0.A00();
            AnonymousClass4GK A004 = C49112g0.A00(r0);
            try {
                A012 = C56862sg.A01(((AnonymousClass3H0) A004).A03, "SELECT  SUM(f.file_size) AS media_size FROM exported_files_metadata AS f WHERE f.required = 0", "XPM_EXPORT_TOTAL_MEDIA_SIZE");
                if (!A012.moveToFirst()) {
                    A012.close();
                    A004.close();
                    j2 = 0;
                } else {
                    j2 = AnonymousClass0x2.A0C(A012, "media_size");
                    A012.close();
                    A004.close();
                }
                long A005 = C61072zf.A00(this.A0M);
                if (A002 != null) {
                    r8.A00 = C18330xA.A07(r9.A01(A002.longValue()));
                }
                r8.A02 = C18330xA.A07(r9.A01(A003));
                r8.A01 = C18330xA.A07(r9.A01(j2));
                j = r9.A01(A005);
            } catch (Throwable th) {
                try {
                    A004.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else if (8 == i) {
            r8.A06 = Long.valueOf(((C59412ws) this.A0L.get()).A01(C61072zf.A00(this.A0M)));
            r8.A07 = AnonymousClass0x9.A0o(A00(), 1000);
            r8.A08 = AnonymousClass0x9.A0m(this.A0E.A00);
            r4.A03();
            return r8;
        } else if (3 == i) {
            C59412ws r42 = (C59412ws) this.A0L.get();
            Long A006 = ((AnonymousClass2W1) this.A0K.get()).A00();
            long A007 = C61072zf.A00(this.A0M);
            if (A006 != null) {
                r8.A00 = C18330xA.A07(r42.A01(A006.longValue()));
            }
            j = r42.A01(A007);
        } else {
            r8.A07 = AnonymousClass0x9.A0o(A00(), 1000);
            r8.A08 = AnonymousClass0x9.A0m(this.A0E.A00);
            return r8;
        }
        r8.A06 = Long.valueOf(j);
        return r8;
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x008a, code lost:
        if (r2 == false) goto L_0x00ac;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a2 A[LOOP:2: B:50:0x009c->B:52:0x00a2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f0 A[LOOP:3: B:60:0x00ea->B:62:0x00f0, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02() {
        /*
            r11 = this;
            java.lang.String r1 = "ExportFlowManager/cancelExport()"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            boolean r0 = r11.A09()
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "ExportFlowManager/cancelExport() already in progress"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0011:
            X.33M r10 = X.AnonymousClass33M.A01(r1)
            monitor-enter(r11)
            android.os.CancellationSignal r0 = r11.A00     // Catch:{ all -> 0x0124 }
            r5 = 0
            if (r0 != 0) goto L_0x0026
            java.util.concurrent.CountDownLatch r0 = r11.A01     // Catch:{ all -> 0x0124 }
            if (r0 != 0) goto L_0x0030
            java.lang.String r0 = "ExportFlowManager/cancellationSignal or exportCompleted is null"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0124 }
            r0 = 1
            goto L_0x0031
        L_0x0026:
            java.lang.String r0 = "ExportFlowManager/cancelExport()/cancellationSignal.cancel"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0124 }
            android.os.CancellationSignal r0 = r11.A00     // Catch:{ all -> 0x0124 }
            r0.cancel()     // Catch:{ all -> 0x0124 }
        L_0x0030:
            r0 = 0
        L_0x0031:
            monitor-exit(r11)     // Catch:{ all -> 0x0124 }
            r4 = 8
            if (r0 == 0) goto L_0x0040
            r11.A07(r4)
            r11.A06()
            r11.A05()
            return
        L_0x0040:
            r7 = 2
            r8 = 1000(0x3e8, double:4.94E-321)
            X.1hs r3 = r11.A0F     // Catch:{ InterruptedException -> 0x007e, all -> 0x00fa }
            java.util.Iterator r1 = X.C61102zi.A03(r3)     // Catch:{ InterruptedException -> 0x007e, all -> 0x00fa }
        L_0x0049:
            boolean r0 = r1.hasNext()     // Catch:{ InterruptedException -> 0x007e, all -> 0x00fa }
            if (r0 == 0) goto L_0x0059
            java.lang.Object r0 = r1.next()     // Catch:{ InterruptedException -> 0x007e, all -> 0x00fa }
            X.4FE r0 = (X.AnonymousClass4FE) r0     // Catch:{ InterruptedException -> 0x007e, all -> 0x00fa }
            r0.BOT()     // Catch:{ InterruptedException -> 0x007e, all -> 0x00fa }
            goto L_0x0049
        L_0x0059:
            monitor-enter(r11)     // Catch:{ InterruptedException -> 0x007e, all -> 0x00fa }
            java.util.concurrent.CountDownLatch r6 = r11.A01     // Catch:{ all -> 0x007b }
            monitor-exit(r11)     // Catch:{ all -> 0x007b }
            if (r6 == 0) goto L_0x00ac
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x007e, all -> 0x00fa }
            r0 = 300000(0x493e0, double:1.482197E-318)
            boolean r2 = r6.await(r0, r2)     // Catch:{ InterruptedException -> 0x007e, all -> 0x00fa }
            if (r2 == 0) goto L_0x0070
            java.lang.String r0 = "ExportFlowManager/cancelExport()/cancellationSignal.completed"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x0079 }
            goto L_0x008c
        L_0x0070:
            r3.A08(r7)     // Catch:{ InterruptedException -> 0x0079 }
            java.lang.String r0 = "ExportFlowManager/cancelExport()/cancellationSignal.failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x0079 }
            goto L_0x00ac
        L_0x0079:
            r1 = move-exception
            goto L_0x0080
        L_0x007b:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x007b }
            throw r0     // Catch:{ InterruptedException -> 0x007e, all -> 0x00fa }
        L_0x007e:
            r1 = move-exception
            r2 = 0
        L_0x0080:
            X.1hs r3 = r11.A0F     // Catch:{ all -> 0x00d5 }
            r3.A08(r7)     // Catch:{ all -> 0x00d5 }
            java.lang.String r0 = "ExportFlowManager/cancelExport()/InterruptedException"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00d5 }
            if (r2 == 0) goto L_0x00ac
        L_0x008c:
            r11.A05()
        L_0x008f:
            r10.A07()
            r11.A07(r4)
            r11.A06()
            java.util.Iterator r1 = X.C61102zi.A03(r3)
        L_0x009c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00cf
            java.lang.Object r0 = r1.next()
            X.4FE r0 = (X.AnonymousClass4FE) r0
            r0.BOS()
            goto L_0x009c
        L_0x00ac:
            long r0 = r10.A06()
            long r0 = r0 / r8
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ExportFlowManager/reset() was not called since cancellation did not succeed after "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " seconds"
            X.C18260x0.A1K(r1, r0)
            X.2qk r1 = r11.A02
            java.lang.String r0 = "xpm-export-cancel-failed"
            r1.A0A(r0, r5, r2)
            goto L_0x008f
        L_0x00cf:
            X.3R3 r0 = r11.A0E
            r3.A07(r0)
            return
        L_0x00d5:
            r3 = move-exception
            if (r2 == 0) goto L_0x00fb
            r11.A05()
        L_0x00db:
            r10.A07()
            r11.A07(r4)
            r11.A06()
            X.1hs r2 = r11.A0F
            java.util.Iterator r1 = X.C61102zi.A03(r2)
        L_0x00ea:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x011e
            java.lang.Object r0 = r1.next()
            X.4FE r0 = (X.AnonymousClass4FE) r0
            r0.BOS()
            goto L_0x00ea
        L_0x00fa:
            r3 = move-exception
        L_0x00fb:
            long r0 = r10.A06()
            long r0 = r0 / r8
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ExportFlowManager/reset() was not called since cancellation did not succeed after "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " seconds"
            X.C18260x0.A1K(r1, r0)
            X.2qk r1 = r11.A02
            java.lang.String r0 = "xpm-export-cancel-failed"
            r1.A0A(r0, r5, r2)
            goto L_0x00db
        L_0x011e:
            X.3R3 r0 = r11.A0E
            r2.A07(r0)
            throw r3
        L_0x0124:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0124 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56582sE.A02():void");
    }

    public void A03() {
        this.A0A.A02();
        A02();
        this.A07.A03(true);
        Log.i("ExportFlowManager/cancelExportFlowAndClearData/complete");
        C183538qC r2 = this.A0B.A02;
        C18270x1.A0g(AnonymousClass0x2.A0E(r2), "/export/start_time");
        C18270x1.A0g(AnonymousClass0x2.A0E(r2), "/export/provider_closed/timestamp");
        AnonymousClass317 r3 = this.A0I;
        if (r3.A0d.A01.getInt("registration_state", 1) == 11) {
            r3.A09();
        }
        Log.i("ExportFlowManager/disableExportProviderAndClearMigrationFlags/complete/success");
    }

    public void A04() {
        boolean A0Y = this.A05.A0Y(C58422vE.A02, 843);
        AnonymousClass2LS r0 = this.A09;
        PackageManager packageManager = r0.A01;
        ComponentName componentName = r0.A00;
        if (A0Y != AnonymousClass001.A1T(packageManager.getComponentEnabledSetting(componentName))) {
            boolean A1S = AnonymousClass000.A1S(A0Y ? 1 : 0);
            C18260x0.A0w("AB props updated to ", AnonymousClass001.A0o(), A1S ? 1 : 0);
            packageManager.setComponentEnabledSetting(componentName, A1S, 1);
            C18260x0.A1D("ExportFlowManager/setActivityEnabled/", AnonymousClass001.A0o(), A0Y);
        }
    }

    public void A05() {
        Log.i("ExportFlowManager/reset()");
        C18270x1.A0g(AnonymousClass0x2.A0E(this.A0B.A02).remove("/export/enc/active/owner").remove("/export/enc/active/version").remove("/export/enc/active/account_hash").remove("/export/enc/active/server_salt").remove("/export/enc/active/last_fetch_time"), "/export/enc/active/seed");
        this.A0H.A04();
        this.A0D.A01();
    }

    public final void A07(int i) {
        if (8 != i || C18280x3.A0Z(C18300x5.A0B(this.A0B.A02), "/export/logging/funnelId") != null) {
            this.A06.BhA(A01(i));
        }
    }

    public boolean A08() {
        AnonymousClass30Q r0 = this.A0A;
        if (AnonymousClass001.A1T(r0.A02.getComponentEnabledSetting(r0.A00)) || C18300x5.A0B(this.A0B.A02).getLong("/export/start_time", 0) > 0) {
            return true;
        }
        return false;
    }

    public C56582sE(C55682qk r2, C620633i r3, C56612sH r4, AnonymousClass1VX r5, AnonymousClass4FV r6, C66423Lj r7, AnonymousClass36W r8, AnonymousClass2LS r9, AnonymousClass30Q r10, C56022rI r11, C55462qO r12, C48152eR r13, C28851hs r14, AnonymousClass2OZ r15, C55362qE r16, AnonymousClass317 r17, C183538qC r18, C183538qC r19, C183538qC r20) {
        this.A04 = r4;
        this.A05 = r5;
        this.A02 = r2;
        this.A06 = r6;
        this.A0B = r11;
        this.A03 = r3;
        this.A08 = r8;
        this.A0M = r18;
        this.A0D = r13;
        this.A07 = r7;
        this.A0I = r17;
        this.A0G = r15;
        this.A0H = r16;
        this.A0C = r12;
        this.A09 = r9;
        this.A0F = r14;
        this.A0L = r19;
        this.A0K = r20;
        this.A0A = r10;
        AnonymousClass33M A012 = AnonymousClass33M.A01("ExportFlowManager/duration");
        this.A0J = A012;
        A012.A07();
        AnonymousClass3R3 r0 = new AnonymousClass3R3(this);
        this.A0E = r0;
        r14.A06(r0);
    }
}
