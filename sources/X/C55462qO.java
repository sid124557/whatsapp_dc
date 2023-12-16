package X;

import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.JsonWriter;
import com.whatsapp.Me;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.zip.ZipOutputStream;

/* renamed from: X.2qO  reason: invalid class name and case insensitive filesystem */
public class C55462qO {
    public final C56972sr A00;
    public final C56612sH A01;
    public final C59662xH A02;
    public final C56022rI A03;
    public final C55362qE A04;
    public final C34171uL A05;
    public final SecureRandom A06;

    public void A00() {
        C56022rI r1 = this.A03;
        AnonymousClass2SN A012 = r1.A01();
        Log.i("ExportEncryptionManager/copyPrefetchedKeyToActiveKey");
        if (A012 != null) {
            C18270x1.A0j(AnonymousClass0x2.A0E(r1.A02).putString("/export/enc/active/owner", A012.A01.getRawString()).putString("/export/enc/active/version", A012.A05).putString("/export/enc/active/account_hash", A012.A02).putString("/export/enc/active/server_salt", A012.A04).putLong("/export/enc/active/last_fetch_time", A012.A00), "/export/enc/active/seed", A012.A03);
            Log.i("ExportEncryptionManager/copiedPrefetchedKeyToActiveKey");
            return;
        }
        throw new AnonymousClass1gV(101, "Active encryption key info is missing.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        r2 = X.C18270x1.A07();
        r0 = new X.AnonymousClass0Aw(com.whatsapp.migration.export.encryption.ExportEncryptionManager$KeyPrefetchWorker.class);
        r0.A04(r2);
        X.C72333dY.A01(r4.A05).A07(X.C02320Fs.KEEP, X.AnonymousClass0x9.A0I(r0), "export-key-prefetch");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r4 = this;
            java.lang.String r2 = "ExportEncryptionManager/maybeScheduleGenerateEncryptionKey(); "
            X.2sr r1 = r4.A00
            boolean r0 = r1.A0Y()
            if (r0 == 0) goto L_0x0015
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r2)
            java.lang.String r0 = "skip scheduling, user in companion mode"
        L_0x0011:
            X.C18260x0.A1L(r1, r0)
            return
        L_0x0015:
            com.whatsapp.jid.PhoneUserJid r1 = X.C56972sr.A04(r1)
            if (r1 != 0) goto L_0x0023
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r2)
            java.lang.String r0 = "skip scheduling, no user logged in"
            goto L_0x0011
        L_0x0023:
            monitor-enter(r4)
            X.2rI r0 = r4.A03     // Catch:{ all -> 0x005f }
            X.2SN r0 = r0.A01()     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x003e
            boolean r0 = r4.A04(r1, r0)     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x003e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r2)     // Catch:{ all -> 0x005f }
            java.lang.String r0 = "skip scheduling, encryption key is already prefetched recently"
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x005f }
            monitor-exit(r4)     // Catch:{ all -> 0x005f }
            return
        L_0x003e:
            monitor-exit(r4)     // Catch:{ all -> 0x005f }
            X.0XS r2 = X.C18270x1.A07()
            java.lang.Class<com.whatsapp.migration.export.encryption.ExportEncryptionManager$KeyPrefetchWorker> r1 = com.whatsapp.migration.export.encryption.ExportEncryptionManager$KeyPrefetchWorker.class
            X.0Aw r0 = new X.0Aw
            r0.<init>(r1)
            r0.A04(r2)
            X.0Ay r3 = X.AnonymousClass0x9.A0I(r0)
            X.1uL r0 = r4.A05
            X.0Xb r2 = X.C72333dY.A01(r0)
            java.lang.String r1 = "export-key-prefetch"
            X.0Fs r0 = X.C02320Fs.KEEP
            r2.A07(r0, r3, r1)
            return
        L_0x005f:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x005f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55462qO.A01():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        r2 = new byte[32];
        r3.A06.nextBytes(r2);
        r0 = X.C18290x4.A0t(r2);
        r11 = r3.A02;
        r12 = r11.A00;
        r15 = X.C56972sr.A04(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        if (r15 == null) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0066, code lost:
        r7 = android.util.Base64.decode(r0, 2);
        r6 = X.C18290x4.A14();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007f, code lost:
        if (r11.A02.A05(X.C69963Zi.A00(r6, 25), r7, new byte[16], 2) == false) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.C59662xH.A00(r23, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0090, code lost:
        if (r6.getCount() > 0) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0092, code lost:
        r0 = X.C56972sr.A04(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0096, code lost:
        if (r0 == null) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009c, code lost:
        if (r0.equals(r15) == false) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009e, code lost:
        r5 = X.AnonymousClass001.A0s();
        r10 = X.AnonymousClass001.A0u(new java.util.HashMap(r11.A04.A00));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b3, code lost:
        if (r10.hasNext() == false) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b5, code lost:
        r0 = X.AnonymousClass001.A0w(r10);
        r2 = (X.C48572f7) r0.getKey();
        r9 = (X.AnonymousClass2ZX) r0.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00cb, code lost:
        if (java.util.Arrays.equals(r9.A01, r7) == false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00cd, code lost:
        r6 = r2.A00;
        r2 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d1, code lost:
        if (r2 != null) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d3, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d4, code lost:
        r2 = r9.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d6, code lost:
        if (r6 == null) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d8, code lost:
        if (r8 == null) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00da, code lost:
        if (r2 == null) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00dc, code lost:
        r5.add(new X.AnonymousClass2SN(r15, r6, android.util.Base64.encodeToString(r7, 2), android.util.Base64.encodeToString(r8, 2), android.util.Base64.encodeToString(r2, 2), java.lang.System.currentTimeMillis()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f8, code lost:
        r8 = java.util.Arrays.copyOf(r2, r2.length);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fe, code lost:
        X.AnonymousClass4IU.A00(r5, 26);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0107, code lost:
        if (r5.isEmpty() != false) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0109, code lost:
        r6 = (X.AnonymousClass2SN) X.AnonymousClass0x9.A0t(r5);
        r2 = X.C56972sr.A04(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0113, code lost:
        if (r2 != null) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0115, code lost:
        r1 = X.AnonymousClass000.A0l("ExportEncryptionManager/maybeGenerateEncryptionKey(); ");
        r0 = "user logged out while waiting for encryption key";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011f, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r0 = r1.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0124, code lost:
        if (r0 == null) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x012a, code lost:
        if (A04(r2, r0) == false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012c, code lost:
        X.C18260x0.A1L(X.AnonymousClass000.A0l("ExportEncryptionManager/maybeGenerateEncryptionKey(); "), "concurrent conflict, encryption key was prefetched recently");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0135, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0137, code lost:
        r2 = X.AnonymousClass000.A0l("ExportEncryptionManager/maybeGenerateEncryptionKey(); ");
        r2.append("prefetched key for current user:  user=");
        r10 = r6.A01;
        X.C18280x3.A0u(r10, r2);
        r2.append(" version=");
        r9 = r6.A05;
        r2.append(r9);
        r2.append(", account_hash=");
        r8 = r6.A02;
        r2.append(r8);
        r2.append(", server_salt=");
        r7 = r6.A04;
        r2.append(r7);
        r2.append(", last_fetched_time=");
        r4 = r6.A00;
        X.C18260x0.A1H(r2, r4);
        X.C18270x1.A0j(X.AnonymousClass0x2.A0E(r1.A02).putString("/export/enc/prefetched/owner", r10.getRawString()).putString("/export/enc/prefetched/version", r9).putString("/export/enc/prefetched/account_hash", r8).putString("/export/enc/prefetched/server_salt", r7).putLong("/export/enc/prefetched/last_fetch_time", r4), "/export/enc/prefetched/seed", r6.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x019e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01ab, code lost:
        throw new X.AnonymousClass1gV(101, "Failed to create a key.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01b3, code lost:
        throw new X.C36811zv(301, "User changed while waiting for encryption key.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01bb, code lost:
        throw new X.C36811zv(301, "User was logged out while waiting for encryption key.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01c3, code lost:
        throw new X.AnonymousClass1gV(103, "Failed to create a key, timed out.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01c4, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01cc, code lost:
        throw new X.AnonymousClass1gV("Failed to create a key, interrupted.", (java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01d6, code lost:
        throw new X.AnonymousClass1gV(102, "Not connected to server, cannot create keys.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01de, code lost:
        throw new X.C36811zv(301, "Cannot create encryption key when user is not logged in.");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.os.CancellationSignal r23) {
        /*
            r22 = this;
            java.lang.String r13 = "ExportEncryptionManager/maybeGenerateEncryptionKey(); "
            r3 = r22
            X.2sr r4 = r3.A00
            com.whatsapp.jid.PhoneUserJid r2 = X.C56972sr.A04(r4)
            if (r2 != 0) goto L_0x0017
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r13)
            java.lang.String r0 = "skipped key prefetching, no user is logged in"
        L_0x0013:
            X.C18260x0.A1L(r1, r0)
            return
        L_0x0017:
            java.lang.System.currentTimeMillis()
            monitor-enter(r3)
            X.2rI r1 = r3.A03     // Catch:{ all -> 0x01df }
            X.2SN r0 = r1.A01()     // Catch:{ all -> 0x01df }
            if (r0 == 0) goto L_0x004c
            boolean r0 = r3.A04(r2, r0)     // Catch:{ all -> 0x01df }
            if (r0 == 0) goto L_0x0036
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r13)     // Catch:{ all -> 0x01df }
            java.lang.String r0 = "skipped key prefetching, key is already prefetched recently"
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x01df }
            monitor-exit(r3)     // Catch:{ all -> 0x01df }
            goto L_0x011e
        L_0x0036:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0l(r13)     // Catch:{ all -> 0x01df }
            java.lang.String r0 = "reset prefetched key, a different user is now logged in or key is older"
            X.C18260x0.A1L(r2, r0)     // Catch:{ all -> 0x01df }
            r1.A04()     // Catch:{ all -> 0x01df }
            X.2xH r0 = r3.A02     // Catch:{ all -> 0x01df }
            X.2Vx r0 = r0.A04     // Catch:{ all -> 0x01df }
            java.util.HashMap r0 = r0.A00     // Catch:{ all -> 0x01df }
            r0.clear()     // Catch:{ all -> 0x01df }
        L_0x004c:
            monitor-exit(r3)     // Catch:{ all -> 0x01df }
            r0 = 32
            byte[] r2 = new byte[r0]
            java.security.SecureRandom r0 = r3.A06
            r0.nextBytes(r2)
            java.lang.String r0 = X.C18290x4.A0t(r2)
            X.2xH r11 = r3.A02
            X.2sr r12 = r11.A00
            com.whatsapp.jid.PhoneUserJid r15 = X.C56972sr.A04(r12)
            r2 = 301(0x12d, float:4.22E-43)
            if (r15 == 0) goto L_0x01d7
            r9 = 2
            byte[] r7 = android.util.Base64.decode(r0, r9)
            r0 = 16
            byte[] r8 = new byte[r0]
            java.util.concurrent.CountDownLatch r6 = X.C18290x4.A14()
            X.0XM r5 = r11.A02
            r0 = 25
            X.3Zi r0 = X.C69963Zi.A00(r6, r0)
            boolean r0 = r5.A05(r0, r7, r8, r9)
            if (r0 == 0) goto L_0x01cd
            r10 = 103(0x67, float:1.44E-43)
            r0 = r23
            X.C59662xH.A00(r0, r6)     // Catch:{ InterruptedException -> 0x01c4 }
            long r8 = r6.getCount()
            r5 = 0
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x01bc
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r12)
            if (r0 == 0) goto L_0x01b4
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x01ac
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            X.2Vx r0 = r11.A04
            java.util.HashMap r2 = r0.A00
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r2)
            java.util.Iterator r10 = X.AnonymousClass001.A0u(r0)
        L_0x00af:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00fe
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r10)
            java.lang.Object r2 = r0.getKey()
            X.2f7 r2 = (X.C48572f7) r2
            java.lang.Object r9 = r0.getValue()
            X.2ZX r9 = (X.AnonymousClass2ZX) r9
            byte[] r0 = r9.A01
            boolean r0 = java.util.Arrays.equals(r0, r7)
            if (r0 == 0) goto L_0x00af
            java.lang.String r6 = r2.A00
            byte[] r2 = r2.A01
            if (r2 != 0) goto L_0x00f8
            r8 = 0
        L_0x00d4:
            byte[] r2 = r9.A02
            if (r6 == 0) goto L_0x00af
            if (r8 == 0) goto L_0x00af
            if (r2 == 0) goto L_0x00af
            r0 = 2
            java.lang.String r17 = android.util.Base64.encodeToString(r7, r0)
            java.lang.String r18 = android.util.Base64.encodeToString(r8, r0)
            java.lang.String r19 = android.util.Base64.encodeToString(r2, r0)
            long r20 = java.lang.System.currentTimeMillis()
            X.2SN r14 = new X.2SN
            r16 = r6
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r5.add(r14)
            goto L_0x00af
        L_0x00f8:
            int r0 = r2.length
            byte[] r8 = java.util.Arrays.copyOf(r2, r0)
            goto L_0x00d4
        L_0x00fe:
            r0 = 26
            X.AnonymousClass4IU.A00(r5, r0)
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x01a2
            java.lang.Object r6 = X.AnonymousClass0x9.A0t(r5)
            X.2SN r6 = (X.AnonymousClass2SN) r6
            com.whatsapp.jid.PhoneUserJid r2 = X.C56972sr.A04(r4)
            if (r2 != 0) goto L_0x011f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r13)
            java.lang.String r0 = "user logged out while waiting for encryption key"
            goto L_0x0013
        L_0x011e:
            return
        L_0x011f:
            monitor-enter(r3)
            X.2SN r0 = r1.A01()     // Catch:{ all -> 0x019f }
            if (r0 == 0) goto L_0x0137
            boolean r0 = r3.A04(r2, r0)     // Catch:{ all -> 0x019f }
            if (r0 == 0) goto L_0x0137
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r13)     // Catch:{ all -> 0x019f }
            java.lang.String r0 = "concurrent conflict, encryption key was prefetched recently"
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x019f }
        L_0x0135:
            monitor-exit(r3)     // Catch:{ all -> 0x019f }
            goto L_0x019e
        L_0x0137:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0l(r13)     // Catch:{ all -> 0x019f }
            java.lang.String r0 = "prefetched key for current user:  user="
            r2.append(r0)     // Catch:{ all -> 0x019f }
            com.whatsapp.jid.UserJid r10 = r6.A01     // Catch:{ all -> 0x019f }
            X.C18280x3.A0u(r10, r2)     // Catch:{ all -> 0x019f }
            java.lang.String r0 = " version="
            r2.append(r0)     // Catch:{ all -> 0x019f }
            java.lang.String r9 = r6.A05     // Catch:{ all -> 0x019f }
            r2.append(r9)     // Catch:{ all -> 0x019f }
            java.lang.String r0 = ", account_hash="
            r2.append(r0)     // Catch:{ all -> 0x019f }
            java.lang.String r8 = r6.A02     // Catch:{ all -> 0x019f }
            r2.append(r8)     // Catch:{ all -> 0x019f }
            java.lang.String r0 = ", server_salt="
            r2.append(r0)     // Catch:{ all -> 0x019f }
            java.lang.String r7 = r6.A04     // Catch:{ all -> 0x019f }
            r2.append(r7)     // Catch:{ all -> 0x019f }
            java.lang.String r0 = ", last_fetched_time="
            r2.append(r0)     // Catch:{ all -> 0x019f }
            long r4 = r6.A00     // Catch:{ all -> 0x019f }
            X.C18260x0.A1H(r2, r4)     // Catch:{ all -> 0x019f }
            X.8qC r0 = r1.A02     // Catch:{ all -> 0x019f }
            android.content.SharedPreferences$Editor r2 = X.AnonymousClass0x2.A0E(r0)     // Catch:{ all -> 0x019f }
            java.lang.String r1 = r10.getRawString()     // Catch:{ all -> 0x019f }
            java.lang.String r0 = "/export/enc/prefetched/owner"
            android.content.SharedPreferences$Editor r1 = r2.putString(r0, r1)     // Catch:{ all -> 0x019f }
            java.lang.String r0 = "/export/enc/prefetched/version"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r9)     // Catch:{ all -> 0x019f }
            java.lang.String r0 = "/export/enc/prefetched/account_hash"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r8)     // Catch:{ all -> 0x019f }
            java.lang.String r0 = "/export/enc/prefetched/server_salt"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r7)     // Catch:{ all -> 0x019f }
            java.lang.String r0 = "/export/enc/prefetched/last_fetch_time"
            android.content.SharedPreferences$Editor r2 = r1.putLong(r0, r4)     // Catch:{ all -> 0x019f }
            java.lang.String r1 = "/export/enc/prefetched/seed"
            java.lang.String r0 = r6.A03     // Catch:{ all -> 0x019f }
            X.C18270x1.A0j(r2, r1, r0)     // Catch:{ all -> 0x019f }
            goto L_0x0135
        L_0x019e:
            return
        L_0x019f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x019f }
            throw r0
        L_0x01a2:
            r2 = 101(0x65, float:1.42E-43)
            java.lang.String r1 = "Failed to create a key."
            X.1gV r0 = new X.1gV
            r0.<init>((int) r2, (java.lang.String) r1)
            throw r0
        L_0x01ac:
            java.lang.String r1 = "User changed while waiting for encryption key."
            X.1zv r0 = new X.1zv
            r0.<init>(r2, r1)
            throw r0
        L_0x01b4:
            java.lang.String r1 = "User was logged out while waiting for encryption key."
            X.1zv r0 = new X.1zv
            r0.<init>(r2, r1)
            throw r0
        L_0x01bc:
            java.lang.String r1 = "Failed to create a key, timed out."
            X.1gV r0 = new X.1gV
            r0.<init>((int) r10, (java.lang.String) r1)
            throw r0
        L_0x01c4:
            r2 = move-exception
            java.lang.String r1 = "Failed to create a key, interrupted."
            X.1gV r0 = new X.1gV
            r0.<init>((java.lang.String) r1, (java.lang.Throwable) r2)
            throw r0
        L_0x01cd:
            r2 = 102(0x66, float:1.43E-43)
            java.lang.String r1 = "Not connected to server, cannot create keys."
            X.1gV r0 = new X.1gV
            r0.<init>((int) r2, (java.lang.String) r1)
            throw r0
        L_0x01d7:
            java.lang.String r1 = "Cannot create encryption key when user is not logged in."
            X.1zv r0 = new X.1zv
            r0.<init>(r2, r1)
            throw r0
        L_0x01df:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01df }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55462qO.A02(android.os.CancellationSignal):void");
    }

    public void A03(CancellationSignal cancellationSignal, ZipOutputStream zipOutputStream, boolean z) {
        String str;
        Throwable th;
        int i;
        AnonymousClass2SN A002 = this.A03.A00();
        if (A002 != null) {
            Log.i("ExportEncryptionManager/generateEncFileMetadata(); generating metadata with:");
            C56972sr r1 = this.A00;
            Me A003 = C56972sr.A00(r1);
            String str2 = null;
            if (A003 != null) {
                str = A003.jabber_id;
            } else {
                str = null;
            }
            Me A0E = r1.A0E();
            if (A0E != null) {
                str2 = A0E.jabber_id;
            }
            Log.i("ExportEncryptionManager/generateEncFileMetadata();    current user:");
            C18260x0.A0s("ExportEncryptionManager/generateEncFileMetadata();       current user: ", str, AnonymousClass001.A0o());
            C18260x0.A0s("ExportEncryptionManager/generateEncFileMetadata();       old user: ", str2, AnonymousClass001.A0o());
            Log.i("ExportEncryptionManager/generateEncFileMetadata();    key info:");
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("ExportEncryptionManager/generateEncFileMetadata();       user         = ");
            UserJid userJid = A002.A01;
            C18260x0.A1L(A0o, userJid.getRawString());
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("ExportEncryptionManager/generateEncFileMetadata();       version      = ");
            String str3 = A002.A05;
            C18260x0.A1L(A0o2, str3);
            StringBuilder A0o3 = AnonymousClass001.A0o();
            A0o3.append("ExportEncryptionManager/generateEncFileMetadata();       account_hash = ");
            String str4 = A002.A02;
            C18260x0.A1L(A0o3, str4);
            StringBuilder A0o4 = AnonymousClass001.A0o();
            A0o4.append("ExportEncryptionManager/generateEncFileMetadata();       server_salt  = ");
            String str5 = A002.A04;
            C18260x0.A1L(A0o4, str5);
            StringBuilder A0o5 = AnonymousClass001.A0o();
            A0o5.append("ExportEncryptionManager/generateEncFileMetadata();       last_fetched = ");
            C18260x0.A1I(A0o5, A002.A00);
            String A0Y = C18280x3.A0Y();
            try {
                String A0V = C18270x1.A0V(AnonymousClass0x7.A0t(), userJid.user.getBytes(AnonymousClass79T.A05));
                Log.i("ExportEncryptionManager/generateEncFileMetadata();   data info: ");
                C18260x0.A0s("ExportEncryptionManager/generateEncFileMetadata();       data_id      = ", A0Y, AnonymousClass001.A0o());
                C18260x0.A0s("ExportEncryptionManager/generateEncFileMetadata();       source_id    = ", A0V, AnonymousClass001.A0o());
                C69813Ym r3 = new C69813Ym(AnonymousClass001.A0t(), zipOutputStream);
                try {
                    C59552x6 r2 = new C59552x6(new C45352Zs(str3, str4, str5), "AES-GCM-v1", A0Y, A0V);
                    JsonWriter jsonWriter = r3.A01;
                    jsonWriter.name("data_id");
                    jsonWriter.value(r2.A01);
                    String str6 = r2.A03;
                    if (str6 != null) {
                        jsonWriter.name("source_id");
                        jsonWriter.value(str6);
                    }
                    jsonWriter.name("scheme");
                    jsonWriter.value("AES-GCM-v1");
                    jsonWriter.name("key_id");
                    jsonWriter.beginObject();
                    jsonWriter.name("version");
                    C45352Zs r22 = r2.A00;
                    jsonWriter.value((long) Integer.parseInt(r22.A02));
                    jsonWriter.name("account_hash");
                    jsonWriter.value(r22.A00);
                    jsonWriter.name("server_salt");
                    jsonWriter.value(r22.A01);
                    jsonWriter.endObject();
                    if (z) {
                        jsonWriter.name("files");
                        jsonWriter.beginArray();
                        int i2 = 0;
                        do {
                            try {
                                cancellationSignal.throwIfCanceled();
                                AnonymousClass4GK A012 = this.A04.A01.A00.A01();
                                try {
                                    C56862sg r5 = ((AnonymousClass3H0) A012).A03;
                                    String[] A1Z = AnonymousClass0x9.A1Z();
                                    C18260x0.A1Y(A1Z, (long) i2);
                                    C18280x3.A1T(A1Z, (long) 1000);
                                    C71933cu r52 = new C71933cu(r5.A0E("SELECT   f._id, f.local_path, f.exported_path, f.file_size, f.required, f.encryption_iv FROM exported_files_metadata AS f ORDER BY   f.required DESC , f._id ASC  LIMIT ?, ?", "XPM_EXPORT_FILE_METADATA_SELECT_INTERNAL_ALL_PAGED", A1Z), new AnonymousClass3L4());
                                    A012.close();
                                    i = 0;
                                    while (r52.hasNext()) {
                                        try {
                                            cancellationSignal.throwIfCanceled();
                                            AnonymousClass2SO r12 = (AnonymousClass2SO) r52.next();
                                            String str7 = r12.A03;
                                            if (!TextUtils.isEmpty(str7)) {
                                                String str8 = r12.A04;
                                                jsonWriter.beginObject();
                                                jsonWriter.name("path");
                                                jsonWriter.value(str8);
                                                jsonWriter.name("iv");
                                                jsonWriter.value(str7);
                                                jsonWriter.endObject();
                                            }
                                            i++;
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                    }
                                    r52.close();
                                    i2 += 1000;
                                } catch (Throwable th3) {
                                    th = th3;
                                    A012.close();
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                jsonWriter.endArray();
                                throw th4;
                            }
                        } while (i > 0);
                        jsonWriter.endArray();
                    }
                    r3.close();
                } catch (Throwable th5) {
                    try {
                        r3.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            } catch (NoSuchAlgorithmException e) {
                throw new IOException(e);
            }
        } else {
            throw new AnonymousClass1gV(101, "Active encryption key info is missing.");
        }
    }

    public C55462qO(C56972sr r1, C56612sH r2, C59662xH r3, C56022rI r4, C55362qE r5, C34171uL r6, SecureRandom secureRandom) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A05 = r6;
        this.A06 = secureRandom;
        this.A02 = r3;
        this.A04 = r5;
    }

    public boolean A04(UserJid userJid, AnonymousClass2SN r9) {
        long abs = Math.abs(System.currentTimeMillis() - r9.A00);
        boolean A1S = AnonymousClass000.A1S(userJid.equals(r9.A01) ? 1 : 0);
        boolean A1V = AnonymousClass001.A1V((abs > 604800000 ? 1 : (abs == 604800000 ? 0 : -1)));
        if (!A1S || !A1V) {
            return false;
        }
        return true;
    }
}
