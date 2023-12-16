package X;

import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.JsonReader;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.35p  reason: invalid class name and case insensitive filesystem */
public class C625635p {
    public static final long A0L = 30000;
    public static final String A0M = "GoogleMigrateIntegrationManager/";
    public CancellationSignal A00;
    public CountDownLatch A01;
    public final C55272q5 A02;
    public final C55682qk A03;
    public final C64393Dh A04;
    public final C56612sH A05;
    public final C47322d4 A06;
    public final C56082rO A07;
    public final C55902r6 A08;
    public final AnonymousClass35S A09;
    public final C28841hr A0A;
    public final C618432m A0B;
    public final C44442Wb A0C;
    public final AnonymousClass36D A0D;
    public final AnonymousClass5BJ A0E;
    public final C50602iS A0F;
    public final AnonymousClass317 A0G;
    public final C56502s5 A0H;
    public final C104015Ph A0I;
    public final C183538qC A0J;
    public final AtomicBoolean A0K = C18280x3.A0l();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x013e A[LOOP:1: B:48:0x0138->B:50:0x013e, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09() {
        /*
            r15 = this;
            monitor-enter(r15)
            android.os.CancellationSignal r0 = r15.A00     // Catch:{ all -> 0x01e8 }
            if (r0 != 0) goto L_0x01e1
            java.util.concurrent.CountDownLatch r0 = r15.A01     // Catch:{ all -> 0x01e8 }
            if (r0 != 0) goto L_0x01e1
            android.os.CancellationSignal r0 = new android.os.CancellationSignal     // Catch:{ all -> 0x01e8 }
            r0.<init>()     // Catch:{ all -> 0x01e8 }
            r15.A00 = r0     // Catch:{ all -> 0x01e8 }
            r5 = 1
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x01e8 }
            r0.<init>(r5)     // Catch:{ all -> 0x01e8 }
            r15.A01 = r0     // Catch:{ all -> 0x01e8 }
            monitor-exit(r15)     // Catch:{ all -> 0x01e8 }
            X.2Wb r1 = r15.A0C
            monitor-enter(r1)
            java.util.Map r0 = r1.A00     // Catch:{ all -> 0x01de }
            r0.clear()     // Catch:{ all -> 0x01de }
            monitor-exit(r1)     // Catch:{ all -> 0x01de }
            X.1hr r0 = r15.A0A
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x0028:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0038
            java.lang.Object r0 = r1.next()
            X.4FM r0 = (X.AnonymousClass4FM) r0
            r0.BUS()
            goto L_0x0028
        L_0x0038:
            r2 = 0
            X.32m r3 = r15.A0B     // Catch:{ OperationCanceledException -> 0x0116, Exception -> 0x00a8 }
            X.1hr r1 = r3.A05     // Catch:{ OperationCanceledException -> 0x0116, Exception -> 0x00a8 }
            X.4FM r0 = r3.A04     // Catch:{ OperationCanceledException -> 0x0116, Exception -> 0x00a8 }
            r1.A06(r0)     // Catch:{ OperationCanceledException -> 0x0116, Exception -> 0x00a8 }
            X.1hm r1 = r3.A03     // Catch:{ OperationCanceledException -> 0x0116, Exception -> 0x00a8 }
            X.2HB r0 = r3.A06     // Catch:{ OperationCanceledException -> 0x0116, Exception -> 0x00a8 }
            r1.A06(r0)     // Catch:{ OperationCanceledException -> 0x0116, Exception -> 0x00a8 }
            X.1hn r1 = r3.A08     // Catch:{ OperationCanceledException -> 0x0116, Exception -> 0x00a8 }
            X.4Ai r0 = r3.A07     // Catch:{ OperationCanceledException -> 0x0116, Exception -> 0x00a8 }
            r1.A06(r0)     // Catch:{ OperationCanceledException -> 0x0116, Exception -> 0x00a8 }
            X.2q5 r0 = r15.A02     // Catch:{ OperationCanceledException -> 0x0116, Exception -> 0x00a8 }
            X.2xb r6 = r0.A01()     // Catch:{ OperationCanceledException -> 0x0116, Exception -> 0x00a8 }
            int r1 = r6.A00     // Catch:{ OperationCanceledException -> 0x0116, Exception -> 0x00a8 }
            r0 = 2
            if (r1 == r0) goto L_0x007b
            if (r1 == r5) goto L_0x007b
            X.2qk r4 = r15.A03     // Catch:{ OperationCanceledException -> 0x0116, Exception -> 0x00a8 }
            java.lang.String r3 = "xpm-integration-failed"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ OperationCanceledException -> 0x0116, Exception -> 0x00a8 }
            java.lang.String r0 = "failed to initialize db, result = "
            X.C18270x1.A1H(r1, r0, r6)     // Catch:{ OperationCanceledException -> 0x0116, Exception -> 0x00a8 }
            java.lang.String r0 = r1.toString()     // Catch:{ OperationCanceledException -> 0x0116, Exception -> 0x00a8 }
            r4.A0A(r3, r5, r0)     // Catch:{ OperationCanceledException -> 0x0116, Exception -> 0x00a8 }
            X.1hr r1 = r15.A0A     // Catch:{ OperationCanceledException -> 0x0116, Exception -> 0x00a8 }
            r0 = 302(0x12e, float:4.23E-43)
            r1.A09(r0)     // Catch:{ OperationCanceledException -> 0x0116, Exception -> 0x00a8 }
            goto L_0x0126
        L_0x007b:
            r15.A03()     // Catch:{ OperationCanceledException -> 0x0116, Exception -> 0x00a8 }
            r15.A0D()     // Catch:{ OperationCanceledException -> 0x0116, Exception -> 0x00a8 }
            X.35S r1 = r15.A09     // Catch:{ OperationCanceledException -> 0x0116, Exception -> 0x00a8 }
            android.os.CancellationSignal r0 = r15.A00     // Catch:{ OperationCanceledException -> 0x0116, Exception -> 0x00a8 }
            r1.A0E(r0)     // Catch:{ OperationCanceledException -> 0x0116, Exception -> 0x00a8 }
            X.36D r1 = r15.A0D     // Catch:{ OperationCanceledException -> 0x0116, Exception -> 0x00a8 }
            android.os.CancellationSignal r0 = r15.A00     // Catch:{ OperationCanceledException -> 0x0116, Exception -> 0x00a8 }
            r1.A0B(r0)     // Catch:{ OperationCanceledException -> 0x0116, Exception -> 0x00a8 }
            r15.A04(r6)     // Catch:{ OperationCanceledException -> 0x0116, Exception -> 0x00a8 }
            X.2rO r1 = r15.A07     // Catch:{ OperationCanceledException -> 0x0116, Exception -> 0x00a8 }
            java.lang.String r0 = "cross_platform_migration_completed"
            r1.A03(r0, r5)     // Catch:{ OperationCanceledException -> 0x0116, Exception -> 0x00a8 }
            X.2rO r4 = r15.A07     // Catch:{ OperationCanceledException -> 0x0116, Exception -> 0x00a8 }
            java.lang.String r3 = "cross_platform_migration_completed_timestamp"
            X.2sH r0 = r15.A05     // Catch:{ OperationCanceledException -> 0x0116, Exception -> 0x00a8 }
            long r0 = r0.A0H()     // Catch:{ OperationCanceledException -> 0x0116, Exception -> 0x00a8 }
            r4.A04(r3, r0)     // Catch:{ OperationCanceledException -> 0x0116, Exception -> 0x00a8 }
            goto L_0x0127
        L_0x00a8:
            r6 = move-exception
            java.lang.String r0 = "GoogleMigrateIntegrationManager/importData()/"
            com.whatsapp.util.Log.e(r0, r6)     // Catch:{ all -> 0x01d2 }
            boolean r0 = r6 instanceof X.C83914Ah     // Catch:{ all -> 0x01d2 }
            if (r0 == 0) goto L_0x00b9
            r0 = r6
            X.4Ah r0 = (X.C83914Ah) r0     // Catch:{ all -> 0x01d2 }
            int r5 = r0.B9k()     // Catch:{ all -> 0x01d2 }
        L_0x00b9:
            X.5Ph r0 = r15.A0I     // Catch:{ all -> 0x01d2 }
            android.content.SharedPreferences r1 = r0.A00()     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = "google_migrate_ios_funnel_id"
            r3 = 0
            java.lang.String r10 = r1.getString(r0, r3)     // Catch:{ all -> 0x01d2 }
            X.5Ph r0 = r15.A0I     // Catch:{ all -> 0x01d2 }
            android.content.SharedPreferences r1 = r0.A00()     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = "google_migrate_ios_export_duration"
            java.lang.String r11 = r1.getString(r0, r3)     // Catch:{ all -> 0x01d2 }
            X.2s5 r7 = r15.A0H     // Catch:{ all -> 0x01d2 }
            r0 = 302(0x12e, float:4.23E-43)
            r1 = 1
            if (r5 == r0) goto L_0x00ea
            r0 = 202(0xca, float:2.83E-43)
            if (r5 == r0) goto L_0x00ea
            r0 = 200(0xc8, float:2.8E-43)
            if (r5 == r0) goto L_0x00ea
            r0 = 201(0xc9, float:2.82E-43)
            if (r5 == r0) goto L_0x00ea
            if (r5 == r1) goto L_0x00ea
            java.lang.String r8 = "google_migrate_recoverable_error"
            goto L_0x00ec
        L_0x00ea:
            java.lang.String r8 = "google_migrate_unrecoverable_error"
        L_0x00ec:
            java.lang.StringBuilder r1 = X.C18320x8.A0j(r5)     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = ";"
            X.C18270x1.A1H(r1, r0, r6)     // Catch:{ all -> 0x01d2 }
            java.lang.String r9 = r1.toString()     // Catch:{ all -> 0x01d2 }
            r12 = 0
            r7.A06(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x01d2 }
            X.2qk r4 = r15.A03     // Catch:{ all -> 0x01d2 }
            java.lang.String r3 = "xpm-integration-failed"
            java.lang.StringBuilder r1 = X.C18320x8.A0j(r5)     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = "; "
            java.lang.String r0 = X.AnonymousClass000.A0P(r6, r0, r1)     // Catch:{ all -> 0x01d2 }
            r4.A09(r3, r0, r6)     // Catch:{ all -> 0x01d2 }
            X.1hr r0 = r15.A0A     // Catch:{ all -> 0x01d2 }
            r0.A09(r5)     // Catch:{ all -> 0x01d2 }
            goto L_0x011b
        L_0x0116:
            java.lang.String r0 = "GoogleMigrateIntegrationManager/importData()/canceled"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01d2 }
        L_0x011b:
            java.lang.String r0 = "GoogleMigrateIntegrationManager/importData()/finally"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.concurrent.CountDownLatch r0 = r15.A01
            r0.countDown()
            goto L_0x0132
        L_0x0126:
            r5 = 0
        L_0x0127:
            java.lang.String r0 = "GoogleMigrateIntegrationManager/importData()/finally"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.concurrent.CountDownLatch r0 = r15.A01
            r0.countDown()
            r2 = r5
        L_0x0132:
            X.1hr r0 = r15.A0A
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x0138:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0148
            java.lang.Object r0 = r1.next()
            X.4FM r0 = (X.AnonymousClass4FM) r0
            r0.BPU(r2)
            goto L_0x0138
        L_0x0148:
            r15.A01()
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GoogleMigrateIntegrationManager/importData(); stats=\n"
            r9.append(r0)
            X.2Wb r3 = r15.A0C
            java.lang.String r11 = "\n"
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "prefetched/file/success"
            int r2 = X.C44442Wb.A00(r3, r0)
            java.lang.String r0 = "prefetched/file/failed"
            int r1 = X.C44442Wb.A00(r3, r0)
            int r14 = r2 + r1
            java.lang.String r0 = "import/chat/skipped"
            int r13 = X.C44442Wb.A00(r3, r0)
            java.lang.String r0 = "import/msg/success"
            int r12 = X.C44442Wb.A00(r3, r0)
            java.lang.String r0 = "import/msg/failed"
            int r8 = X.C44442Wb.A00(r3, r0)
            java.lang.String r0 = "import/msg/skipped"
            int r7 = X.C44442Wb.A00(r3, r0)
            int r6 = r12 + r8
            int r6 = r6 + r7
            java.lang.String r0 = "import/msg/file/success"
            int r5 = X.C44442Wb.A00(r3, r0)
            java.lang.String r0 = "import/msg/file/failed"
            int r4 = X.C44442Wb.A00(r3, r0)
            int r3 = r5 + r4
            java.lang.String r0 = "Prefetched files: success="
            r10.append(r0)
            r10.append(r2)
            java.lang.String r2 = ", failed="
            r10.append(r2)
            r10.append(r1)
            java.lang.String r1 = ", total="
            X.C18270x1.A19(r1, r11, r10, r14)
            java.lang.String r0 = "Chats: skipped="
            X.C18270x1.A19(r0, r11, r10, r13)
            java.lang.String r0 = "Messages: success="
            r10.append(r0)
            r10.append(r12)
            java.lang.String r0 = ", skipped="
            X.C18270x1.A19(r0, r2, r10, r7)
            r10.append(r8)
            X.C18270x1.A19(r1, r11, r10, r6)
            java.lang.String r0 = "Message files: success="
            X.C18270x1.A19(r0, r2, r10, r5)
            r10.append(r4)
            java.lang.String r0 = X.AnonymousClass000.A0Y(r1, r10, r3)
            X.C18260x0.A1L(r9, r0)
            return
        L_0x01d2:
            r1 = move-exception
            java.lang.String r0 = "GoogleMigrateIntegrationManager/importData()/finally"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.concurrent.CountDownLatch r0 = r15.A01
            r0.countDown()
            throw r1
        L_0x01de:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01de }
            throw r0
        L_0x01e1:
            java.lang.String r0 = "GoogleMigrateIntegrationManager/Import already running, cannot start another import."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ all -> 0x01e8 }
            throw r0     // Catch:{ all -> 0x01e8 }
        L_0x01e8:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x01e8 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C625635p.A09():void");
    }

    public boolean A0G() {
        try {
            String A012 = this.A07.A01("cross_platform_migration_completed");
            if (A012 != null) {
                return C18310x6.A1W(Integer.parseInt(A012));
            }
            return false;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        if (r2.A01 == null) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0H() {
        /*
            r2 = this;
            monitor-enter(r2)
            android.os.CancellationSignal r0 = r2.A00     // Catch:{ all -> 0x000d }
            if (r0 == 0) goto L_0x000a
            java.util.concurrent.CountDownLatch r1 = r2.A01     // Catch:{ all -> 0x000d }
            r0 = 1
            if (r1 != 0) goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            monitor-exit(r2)
            return r0
        L_0x000d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C625635p.A0H():boolean");
    }

    private void A01() {
        Log.i("GoogleMigrateIntegrationManager/cleanUpAfterImportCompleted()");
        this.A07.A03("cross_migration_data_cleanup_needed", 1);
        C618432m r2 = this.A0B;
        r2.A05.A07(r2.A04);
        r2.A03.A07(r2.A06);
        r2.A08.A07(r2.A07);
        synchronized (this) {
            this.A01 = null;
            this.A00 = null;
        }
    }

    private void A02() {
        A04(this.A02.A01());
    }

    private void A03() {
        if (!this.A0G.A0G()) {
            throw new C36811zv(301, "GoogleMigrateIntegrationManager/can not find jabber Id");
        }
    }

    private void A04(C59852xb r4) {
        int i = r4.A00;
        if (i == 2 || i == 1) {
            C50602iS r0 = this.A0F;
            r0.A00();
            r0.A01();
        }
    }

    public int A05() {
        int i;
        C618432m r1 = this.A0B;
        synchronized (r1) {
            i = r1.A00;
        }
        return i;
    }

    public int A06() {
        int i;
        C618432m r2 = this.A0B;
        synchronized (r2) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("GoogleMigrate/getCurrentScreen = ");
            C18260x0.A1G(A0o, r2.A01);
            i = r2.A01;
        }
        return i;
    }

    public void A07() {
        CountDownLatch countDownLatch;
        Log.i("GoogleMigrateIntegrationManager/cancelImport()");
        boolean z = true;
        if (!this.A0K.getAndSet(true)) {
            synchronized (this) {
                if (this.A00 == null || this.A01 == null) {
                    Log.i("GoogleMigrateIntegrationManager/cancellationSignal or importCompleted is null");
                    A00();
                } else {
                    z = false;
                }
                countDownLatch = this.A01;
                if (this.A00 != null) {
                    Log.i("GoogleMigrateIntegrationManager/cancelImport()/cancellationSignal.cancel");
                    this.A00.cancel();
                }
            }
            if (z) {
                this.A0A.A08();
                A01();
                return;
            }
            try {
                Iterator A032 = C61102zi.A03(this.A0A);
                while (A032.hasNext()) {
                    ((AnonymousClass4FM) A032.next()).BOT();
                }
                if (countDownLatch != null) {
                    countDownLatch.await(A0L, TimeUnit.MILLISECONDS);
                }
            } catch (InterruptedException e) {
                this.A0A.A09(2);
                Log.e("GoogleMigrateIntegrationManager/cancelImportProcess()/InterruptedException", e);
            } catch (Throwable th) {
                A00();
                this.A0A.A08();
                A01();
                this.A0K.set(false);
                throw th;
            }
            A00();
            this.A0A.A08();
            A01();
            this.A0K.set(false);
            return;
        }
        Log.e("GoogleMigrateIntegrationManager/concurrent cancelImport requested, not supported");
        throw AnonymousClass001.A0e("Multiple concurrent operations are not supported.");
    }

    public void A08() {
        if (this.A07.A00("cross_migration_data_cleanup_needed", 0) == 1) {
            this.A09.A09();
            this.A0J.get();
            if (this.A08.A04()) {
                try {
                    this.A08.A03();
                } catch (IOException e) {
                    C55682qk r2 = this.A03;
                    StringBuilder A0o = AnonymousClass001.A0o();
                    C18270x1.A1H(A0o, "failed to delete remote data: ", e);
                    r2.A09("xpm-integration-delete-failed", A0o.toString(), e);
                    Log.e("GoogleMigrateIntegrationManager/deferredCleanup()/could not delete all data from Google Migrate");
                }
            }
            this.A07.A02("cross_migration_data_cleanup_needed");
            return;
        }
        Log.i("GoogleMigrateIntegrationManager/deferredCleanup()/does not need to cleanup");
    }

    public void A0A() {
        this.A02.A01();
    }

    public void A0B() {
        C618432m r1 = this.A0B;
        synchronized (r1) {
            r1.A01 = 0;
        }
    }

    public void A0C() {
        this.A06.A00();
        this.A02.A03();
    }

    public void A0D() {
        JsonReader A0D2;
        IOException iOException;
        Log.i("GoogleMigrateIntegrationManager/saveLoggingInfoFromiOS()");
        try {
            ParcelFileDescriptor A002 = this.A08.A00("migration/metadata.json");
            try {
                FileInputStream fileInputStream = new FileInputStream(A002.getFileDescriptor());
                try {
                    A0D2 = C18300x5.A0D(fileInputStream);
                    A0D2.beginObject();
                    String str = null;
                    String str2 = null;
                    while (A0D2.hasNext()) {
                        if ("attemptInfo".equals(A0D2.nextName())) {
                            A0D2.beginObject();
                            while (A0D2.hasNext()) {
                                String nextName = A0D2.nextName();
                                if ("attemptCompletionTime".equals(nextName)) {
                                    str2 = Double.toString(A0D2.nextDouble());
                                } else if ("attemptID".equals(nextName)) {
                                    str = A0D2.nextString();
                                }
                            }
                            A0D2.endObject();
                        } else {
                            A0D2.skipValue();
                        }
                    }
                    A0D2.endObject();
                    if (str == null) {
                        iOException = AnonymousClass002.A0C("Invalid metadata file: iOSFunnelId is missing.");
                    } else if (str2 != null) {
                        A0D2.close();
                        C18270x1.A0j(this.A0I.A00().edit(), "google_migrate_ios_export_duration", str2);
                        C18270x1.A0j(this.A0I.A00().edit(), "google_migrate_ios_funnel_id", str);
                        fileInputStream.close();
                        A002.close();
                        return;
                    } else {
                        iOException = AnonymousClass002.A0C("Invalid metadata file: iOSExportDuration is missing.");
                    }
                    throw iOException;
                } catch (Throwable th) {
                    fileInputStream.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                if (A002 != null) {
                    A002.close();
                }
                throw th2;
            }
        } catch (IOException e) {
            Log.e("GoogleMigrateIntegrationManager/saveLoggingInfoFromiOS()/", e);
            this.A03.A09("xpm-integration-no-funnel-id", "saveLoggingInfoFromiOS;", e);
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public void A0E(int r4) {
        /*
            r3 = this;
            X.1hr r0 = r3.A0A     // Catch:{ all -> 0x0030 }
            java.util.Iterator r1 = X.C61102zi.A03(r0)     // Catch:{ all -> 0x0030 }
        L_0x0006:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0030 }
            X.4FM r0 = (X.AnonymousClass4FM) r0     // Catch:{ all -> 0x0030 }
            r0.BYi()     // Catch:{ all -> 0x0030 }
            goto L_0x0006
        L_0x0016:
            r3.A0C()     // Catch:{ all -> 0x0030 }
            X.1hr r0 = r3.A0A
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x001f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002f
            java.lang.Object r0 = r1.next()
            X.4FM r0 = (X.AnonymousClass4FM) r0
            r0.BYh(r4)
            goto L_0x001f
        L_0x002f:
            return
        L_0x0030:
            r2 = move-exception
            X.1hr r0 = r3.A0A
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x0037:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0047
            java.lang.Object r0 = r1.next()
            X.4FM r0 = (X.AnonymousClass4FM) r0
            r0.BYh(r4)
            goto L_0x0037
        L_0x0047:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C625635p.A0E(int):void");
    }

    public boolean A0F() {
        return this.A08.A04();
    }

    public C625635p(C56612sH r2, C55682qk r3, C64393Dh r4, C56502s5 r5, AnonymousClass35S r6, AnonymousClass36D r7, C44442Wb r8, C56082rO r9, C183538qC r10, C55902r6 r11, AnonymousClass317 r12, C618432m r13, C28841hr r14, C50602iS r15, C47322d4 r16, C55272q5 r17, C104015Ph r18, AnonymousClass5BJ r19) {
        this.A05 = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A0H = r5;
        this.A0J = r10;
        this.A09 = r6;
        this.A0D = r7;
        this.A0C = r8;
        this.A07 = r9;
        this.A08 = r11;
        this.A0G = r12;
        this.A0B = r13;
        this.A0A = r14;
        this.A0F = r15;
        this.A06 = r16;
        this.A02 = r17;
        this.A0I = r18;
        this.A0E = r19;
    }

    private void A00() {
        A0C();
        File A0G2 = this.A04.A0G();
        C627536m.A0G(A0G2, (Set) null);
        String[] list = A0G2.list();
        if (!(list == null || list.length == 0)) {
            this.A03.A0A(A0M, false, "cancelImport/could not delete media folder");
            Log.e("GoogleMigrateIntegrationManager/cleanUpAfterCancellation()/could not delete media folder");
        }
        A02();
    }
}
