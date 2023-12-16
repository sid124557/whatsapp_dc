package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2sX  reason: invalid class name and case insensitive filesystem */
public abstract class C56772sX {
    public final AnonymousClass0U8 A00;
    public final AnonymousClass0WN A01;
    public final AnonymousClass310 A02;
    public final C42822Pq A03;
    public final C48092eK A04;

    public final File A07(AnonymousClass22O r2) {
        File A022;
        C162457s7.A0J(r2, 0);
        if (r2 == AnonymousClass22O.UNENCRYPTED) {
            C49692gw r0 = this.A04.A00;
            r0.A01();
            A022 = r0.A03;
        } else {
            A022 = this.A02.A02();
        }
        C162457s7.A0H(A022);
        return A022;
    }

    public boolean A0E(Context context, File file) {
        File file2 = (File) C73723fy.A04(A09(file));
        if (file2 == null) {
            return false;
        }
        return A0F(context, file2);
    }

    public static ArrayList A03(File file, String str, List list) {
        File file2 = new File(file, str);
        ArrayList A09 = C06550Ye.A09(file2, list);
        C06550Ye.A0M(file2, A09);
        return A09;
    }

    public final C60882zK A05() {
        AnonymousClass22O r0;
        if (this.A01.A0G()) {
            r0 = AnonymousClass22O.CRYPT15;
        } else {
            r0 = AnonymousClass22O.CRYPT14;
        }
        C162457s7.A0D(r0);
        C60882zK A06 = A06(r0);
        if (A06 == null) {
            return null;
        }
        AnonymousClass0U8 r5 = this.A00;
        String str = A06.A03;
        boolean z = A06.A04;
        if (Boolean.valueOf(z) != null) {
            C18270x1.A0l(r5.A01().edit(), AnonymousClass000.A0T(str, "_backup_success"), z);
        }
        r5.A03(Long.valueOf(A06.A00), str, "_backup_size");
        r5.A03(A06.A02, str, "_backup_media_size");
        return A06;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:144:0x03d6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:?, code lost:
        X.AnonymousClass2A8.A00(r7, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03da, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03dd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:?, code lost:
        X.AnonymousClass2A8.A00(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03e1, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x050f, code lost:
        if (((X.C105095To) r5.A0F.get()).A03() == false) goto L_0x0511;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0204, code lost:
        if (r3 == null) goto L_0x021d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        r3.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C60882zK A06(X.AnonymousClass22O r27) {
        /*
            r26 = this;
            r0 = r26
            boolean r1 = r0 instanceof X.AnonymousClass1R0
            r10 = r27
            if (r1 == 0) goto L_0x010d
            X.1R0 r0 = (X.AnonymousClass1R0) r0
            X.2s6 r6 = r0.A02
            boolean r1 = r6.A06()
            if (r1 == 0) goto L_0x0020
            java.lang.String r0 = "WaDatabaseBackupProducer/skip no media or read-only media"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "wa-db"
            X.2zK r2 = new X.2zK
            r2.<init>(r0)
            return r2
        L_0x0020:
            X.2oU r1 = r0.A03
            X.2qk r15 = r0.A00
            X.2ao r5 = r0.A07
            X.2zT r4 = r0.A06
            X.2og r3 = r0.A04
            java.lang.String r21 = "wa-backup.db"
            X.2G4 r2 = r0.A08
            X.1RI r14 = new X.1RI
            r17 = r3
            r18 = r4
            r19 = r5
            r20 = r2
            r16 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            X.1RI r2 = r0.A0B     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            boolean r2 = X.AnonymousClass1R0.A00(r2, r14)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            if (r2 != 0) goto L_0x0058
            java.lang.String r0 = "WaDatabaseBackupProducer/failed-to-copy"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            r14.A0D()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            java.lang.String r0 = "wa-db"
            X.2zK r2 = new X.2zK     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            r2.<init>(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            goto L_0x0104
        L_0x0058:
            boolean r2 = r14.A0E()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            if (r2 != 0) goto L_0x0070
            java.lang.String r0 = "WaDatabaseBackupProducer/wal checkpoint failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            r14.A0D()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            java.lang.String r0 = "wa-db"
            X.2zK r2 = new X.2zK     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            r2.<init>(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            goto L_0x0104
        L_0x0070:
            java.lang.String r2 = "WaDatabaseBackupProducer/close-backup-db"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            r14.close()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            java.lang.String r2 = "wa.db.crypt"
            java.io.File r12 = X.C23021Qz.A00(r0, r10, r2, r3)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            java.io.File r2 = r0.A07(r10)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            java.util.ArrayList r2 = r0.A09(r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            java.util.Iterator r4 = r2.iterator()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
        L_0x008f:
            boolean r2 = r4.hasNext()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            if (r2 == 0) goto L_0x00a3
            java.io.File r3 = X.AnonymousClass0x9.A0f(r4)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            boolean r2 = r3.equals(r12)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            if (r2 != 0) goto L_0x008f
            X.C18270x1.A0x(r3)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            goto L_0x008f
        L_0x00a3:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            java.lang.String r2 = "WaDatabaseBackupProducer/to "
            X.C18260x0.A1R(r3, r2, r12)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            X.34i r11 = r0.A0A     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            X.2sr r3 = r0.A01     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            X.2f0 r7 = r0.A05     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            X.0WN r5 = r0.A01     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            X.2fR r9 = r0.A09     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            X.2eK r8 = r0.A04     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            r4 = 0
            r13 = r4
            X.0UR r3 = X.AnonymousClass0S7.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            android.content.Context r1 = r1.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            boolean r1 = r3.A07(r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            if (r1 != 0) goto L_0x00d4
            java.lang.String r0 = "WaDatabaseBackupProducer/prepare for backup failed"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            java.lang.String r0 = "wa-db"
            X.2zK r2 = new X.2zK     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            r2.<init>(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            goto L_0x0104
        L_0x00d4:
            X.2oU r1 = r14.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            android.content.Context r2 = r1.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            java.lang.String r1 = r14.getDatabaseName()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            java.io.File r1 = r2.getDatabasePath(r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            r3.A06(r4, r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            java.io.File r1 = r0.A07(r10)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            long r6 = r0.A04(r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            java.lang.String r5 = "wa-db"
            r8 = 1
            X.2zK r2 = new X.2zK     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            r3 = r12
            r2.<init>(r3, r4, r5, r6, r8)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00f6 }
            goto L_0x0104
        L_0x00f6:
            r1 = move-exception
            java.lang.String r0 = "WaDatabaseBackupProducer failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0108 }
            java.lang.String r0 = "wa-db"
            X.2zK r2 = new X.2zK     // Catch:{ all -> 0x0108 }
            r2.<init>(r0)     // Catch:{ all -> 0x0108 }
        L_0x0104:
            r14.A0D()
            return r2
        L_0x0108:
            r0 = move-exception
            r14.A0D()
            throw r0
        L_0x010d:
            boolean r1 = r0 instanceof X.C23021Qz
            if (r1 == 0) goto L_0x0118
            X.1Qz r0 = (X.C23021Qz) r0
            X.2zK r0 = r0.A0G(r10)
            return r0
        L_0x0118:
            boolean r1 = r0 instanceof X.C23011Qy
            if (r1 == 0) goto L_0x0233
            X.1Qy r0 = (X.C23011Qy) r0
            X.5ZR r2 = r0.A03
            java.lang.String r1 = android.os.Environment.getExternalStorageState()
            boolean r1 = r2.A0I(r1)
            if (r1 != 0) goto L_0x0144
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "wallpaper/v2/backup/sdcard_unavailable "
            r1.append(r0)
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            X.C18260x0.A1L(r1, r0)
            java.lang.String r0 = "wallpaper-v2"
            X.2zK r6 = new X.2zK
            r6.<init>(r0)
            return r6
        L_0x0144:
            X.4Eg r1 = r0.A05
            java.util.Set r2 = r1.B4T()
            int r1 = r2.size()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>(r1)
            java.util.Iterator r3 = r2.iterator()
            r5 = 0
        L_0x0159:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0180
            java.lang.String r1 = X.AnonymousClass001.A0m(r3)
            android.net.Uri r2 = android.net.Uri.parse(r1)
            java.lang.String r1 = r2.getPath()
            if (r1 == 0) goto L_0x0159
            java.io.File r2 = X.C18310x6.A0a(r2)
            boolean r1 = r2.exists()
            if (r1 == 0) goto L_0x0159
            r4.add(r2)
            long r1 = r2.length()
            long r5 = r5 + r1
            goto L_0x0159
        L_0x0180:
            java.io.File r1 = r0.A07(r10)
            java.util.ArrayList r3 = X.C623834u.A03(r1)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "wallpapers.backup.crypt"
            java.io.File r7 = X.C23021Qz.A00(r0, r10, r1, r2)
            java.util.Iterator r3 = r3.iterator()
        L_0x0197:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x01b1
            java.io.File r2 = X.AnonymousClass0x9.A0f(r3)
            boolean r1 = r2.equals(r7)
            if (r1 != 0) goto L_0x0197
            boolean r1 = r2.exists()
            if (r1 == 0) goto L_0x0197
            X.C627536m.A0P(r2)
            goto L_0x0197
        L_0x01b1:
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L_0x01c2
            java.lang.String r0 = "wallpaper/v2/backup/no_wallpaper_to_backup"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.C627536m.A0O(r7)
            r6 = 0
            return r6
        L_0x01c2:
            X.34i r3 = r0.A07     // Catch:{ Exception -> 0x0216 }
            X.2sr r11 = r0.A00     // Catch:{ Exception -> 0x0216 }
            X.2f0 r15 = r0.A04     // Catch:{ Exception -> 0x0216 }
            X.0WN r13 = r0.A01     // Catch:{ Exception -> 0x0216 }
            X.2s6 r14 = r0.A01     // Catch:{ Exception -> 0x0216 }
            X.2fR r2 = r0.A06     // Catch:{ Exception -> 0x0216 }
            X.2eK r1 = r0.A04     // Catch:{ Exception -> 0x0216 }
            r12 = 0
            r16 = r1
            r17 = r2
            r18 = r10
            r19 = r3
            r20 = r7
            r21 = r12
            X.0UR r2 = X.AnonymousClass0S7.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x0216 }
            X.2oU r1 = r0.A02     // Catch:{ Exception -> 0x0216 }
            android.content.Context r1 = r1.A00     // Catch:{ Exception -> 0x0216 }
            X.0vU r3 = r2.A05(r1)     // Catch:{ Exception -> 0x0216 }
            java.util.Iterator r2 = r4.iterator()     // Catch:{ all -> 0x020a }
        L_0x01ed:
            boolean r1 = r2.hasNext()     // Catch:{ all -> 0x020a }
            if (r1 == 0) goto L_0x0204
            java.io.File r1 = X.AnonymousClass0x9.A0f(r2)     // Catch:{ all -> 0x020a }
            if (r3 != 0) goto L_0x0200
            java.lang.String r1 = "wallpaper/v2/backup failed to create writer"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x020a }
            goto L_0x021d
        L_0x0200:
            r3.Bsc(r1)     // Catch:{ all -> 0x020a }
            goto L_0x01ed
        L_0x0204:
            if (r3 == 0) goto L_0x021d
            r3.close()     // Catch:{ Exception -> 0x0216 }
            goto L_0x021d
        L_0x020a:
            r2 = move-exception
            if (r3 == 0) goto L_0x0215
            r3.close()     // Catch:{ all -> 0x0211 }
            goto L_0x0215
        L_0x0211:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ Exception -> 0x0216 }
        L_0x0215:
            throw r2     // Catch:{ Exception -> 0x0216 }
        L_0x0216:
            r2 = move-exception
            java.lang.String r1 = "wallpaper/v2/backup failed"
            com.whatsapp.util.Log.e(r1, r2)
        L_0x021d:
            java.io.File r1 = r0.A07(r10)
            long r10 = r0.A04(r1)
            java.lang.String r9 = "wallpaper-v2"
            r12 = 1
            java.lang.Long r8 = java.lang.Long.valueOf(r5)
            X.2zK r6 = new X.2zK
            r6.<init>(r7, r8, r9, r10, r12)
            return r6
        L_0x0233:
            boolean r1 = r0 instanceof X.C23001Qx
            if (r1 == 0) goto L_0x0319
            X.1Qx r0 = (X.C23001Qx) r0
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "wallpaper.bkup.crypt"
            java.io.File r3 = X.C23021Qz.A00(r0, r10, r1, r2)
            java.io.File r4 = r0.A07(r10)
            java.lang.String r1 = "wallpaper-manager/getbackupfiles"
            com.whatsapp.util.Log.d((java.lang.String) r1)
            X.22O r1 = X.AnonymousClass22O.CRYPT14
            java.util.List r2 = X.C06550Ye.A0A(r1)
            java.lang.String r1 = "wallpaper.bkup"
            java.util.ArrayList r1 = A03(r4, r1, r2)
            java.util.Iterator r4 = r1.iterator()
        L_0x025f:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0279
            java.io.File r2 = X.AnonymousClass0x9.A0f(r4)
            boolean r1 = r2.equals(r3)
            if (r1 != 0) goto L_0x025f
            boolean r1 = r2.exists()
            if (r1 == 0) goto L_0x025f
            X.C627536m.A0P(r2)
            goto L_0x025f
        L_0x0279:
            X.2oU r1 = r0.A02
            android.content.Context r6 = r1.A00
            java.io.File r2 = r6.getFilesDir()
            java.lang.String r1 = "wallpaper.jpg"
            java.io.File r5 = X.AnonymousClass002.A0A(r2, r1)
            boolean r1 = r5.exists()
            r12 = 0
            if (r1 == 0) goto L_0x058e
            java.io.File r1 = r3.getParentFile()
            X.C626936e.A06(r1)
            X.C18280x3.A10(r1)
            X.5ZR r2 = r0.A03
            java.lang.String r1 = android.os.Environment.getExternalStorageState()
            boolean r1 = r2.A0I(r1)
            if (r1 != 0) goto L_0x02bf
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "wallpaper/backup/sdcard_unavailable "
            r1.append(r0)
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            X.C18260x0.A1L(r1, r0)
            java.lang.String r0 = "wallpaper-v2"
            X.2zK r1 = new X.2zK
            r1.<init>(r0)
            return r1
        L_0x02bf:
            X.34i r4 = r0.A06     // Catch:{ Exception -> 0x0309 }
            X.2sr r11 = r0.A00     // Catch:{ Exception -> 0x0309 }
            X.2f0 r15 = r0.A04     // Catch:{ Exception -> 0x0309 }
            X.0WN r13 = r0.A01     // Catch:{ Exception -> 0x0309 }
            X.2s6 r14 = r0.A01     // Catch:{ Exception -> 0x0309 }
            X.2fR r2 = r0.A05     // Catch:{ Exception -> 0x0309 }
            X.2eK r1 = r0.A04     // Catch:{ Exception -> 0x0309 }
            r16 = r1
            r17 = r2
            r18 = r10
            r19 = r4
            r20 = r3
            r21 = r12
            X.0UR r2 = X.AnonymousClass0S7.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x0309 }
            boolean r1 = r2.A07(r6)     // Catch:{ Exception -> 0x0309 }
            if (r1 != 0) goto L_0x02f2
            java.lang.String r0 = "wallpaper/backup/failed to prepare for backup"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0309 }
            java.lang.String r0 = "wallpaper-v2"
            X.2zK r1 = new X.2zK     // Catch:{ Exception -> 0x0309 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0309 }
            return r1
        L_0x02f2:
            r2.A06(r12, r5)     // Catch:{ Exception -> 0x0309 }
            java.io.File r1 = r0.A07(r10)
            long r5 = r0.A04(r1)
            java.lang.String r4 = "wallpaper-v2"
            r7 = 1
            X.2zK r1 = new X.2zK
            r2 = r3
            r3 = r12
            r1.<init>(r2, r3, r4, r5, r7)
            return r1
        L_0x0309:
            r1 = move-exception
            java.lang.String r0 = "wallpaper/backup/error "
            com.whatsapp.util.Log.w(r0, r1)
            java.lang.String r0 = "wallpaper-v2"
            X.2zK r12 = new X.2zK
            r12.<init>(r0)
            return r12
        L_0x0319:
            boolean r1 = r0 instanceof X.C22991Qw
            if (r1 == 0) goto L_0x03f5
            X.1Qw r0 = (X.C22991Qw) r0
            r1 = 0
            X.C162457s7.A0J(r10, r1)
            X.2p0 r2 = r0.A04
            X.2yH r3 = r2.A00()
            r12 = 0
            if (r3 == 0) goto L_0x058e
            X.7yt r2 = r3.A05
            java.lang.Object r9 = X.C18330xA.A08(r2)
            X.C162457s7.A0D(r9)
            X.7yt r2 = r3.A04
            java.lang.String r8 = X.C18280x3.A0a(r2)
            X.2eK r5 = r0.A04
            java.lang.String r2 = "avatar_password.json"
            java.io.File r4 = r5.A01(r2)
            java.io.FileOutputStream r6 = X.AnonymousClass0x9.A0h(r4)     // Catch:{ IOException -> 0x03e2 }
            java.lang.String r2 = X.C58152un.A0B     // Catch:{ all -> 0x03db }
            java.io.OutputStreamWriter r7 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x03db }
            r7.<init>(r6, r2)     // Catch:{ all -> 0x03db }
            org.json.JSONObject r3 = X.AnonymousClass0x9.A1G()     // Catch:{ all -> 0x03d4 }
            java.lang.String r2 = "avatar_password"
            r3.put(r2, r9)     // Catch:{ all -> 0x03d4 }
            java.lang.String r2 = "avatar_fbid"
            r3.put(r2, r8)     // Catch:{ all -> 0x03d4 }
            r2 = 2
            java.lang.String r2 = r3.toString(r2)     // Catch:{ all -> 0x03d4 }
            r7.write(r2)     // Catch:{ all -> 0x03d4 }
            r7.close()     // Catch:{ all -> 0x03db }
            r6.close()     // Catch:{ IOException -> 0x03e2 }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x03c1 }
            java.lang.String r2 = "avatar-password.bkup.crypt"
            java.io.File r20 = X.C23021Qz.A00(r0, r10, r2, r3)     // Catch:{ IOException -> 0x03c1 }
            X.34i r3 = r0.A06     // Catch:{ IOException -> 0x03c1 }
            X.2sr r11 = r0.A00     // Catch:{ IOException -> 0x03c1 }
            X.2f0 r15 = r0.A03     // Catch:{ IOException -> 0x03c1 }
            X.0WN r13 = r0.A01     // Catch:{ IOException -> 0x03c1 }
            X.2s6 r14 = r0.A01     // Catch:{ IOException -> 0x03c1 }
            X.2fR r2 = r0.A05     // Catch:{ IOException -> 0x03c1 }
            r16 = r5
            r17 = r2
            r18 = r10
            r19 = r3
            r21 = r12
            X.0UR r3 = X.AnonymousClass0S7.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ IOException -> 0x03c1 }
            X.2oU r2 = r0.A02     // Catch:{ IOException -> 0x03c1 }
            android.content.Context r2 = r2.A00     // Catch:{ IOException -> 0x03c1 }
            boolean r2 = r3.A07(r2)     // Catch:{ IOException -> 0x03c1 }
            if (r2 != 0) goto L_0x03aa
            java.lang.String r0 = "AvatarBackup/backup prepare for backup failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x03c1 }
            java.lang.String r14 = "avatar-token"
            r15 = 0
            X.2zK r11 = new X.2zK     // Catch:{ IOException -> 0x03c1 }
            r13 = r12
            r17 = r1
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ IOException -> 0x03c1 }
            return r11
        L_0x03aa:
            r3.A06(r12, r4)     // Catch:{ IOException -> 0x03c1 }
            java.io.File r1 = r0.A07(r10)
            long r23 = r0.A04(r1)
            java.lang.String r22 = "avatar-token"
            r25 = 1
            X.2zK r11 = new X.2zK
            r19 = r11
            r19.<init>(r20, r21, r22, r23, r25)
            return r11
        L_0x03c1:
            r2 = move-exception
            java.lang.String r0 = "AvatarBackup/backup backup failed"
            com.whatsapp.util.Log.e(r0, r2)
            java.lang.String r14 = "avatar-token"
            r15 = 0
            X.2zK r11 = new X.2zK
            r13 = r12
            r17 = r1
            r11.<init>(r12, r13, r14, r15, r17)
            return r11
        L_0x03d4:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x03d6 }
        L_0x03d6:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r7, r2)     // Catch:{ all -> 0x03db }
            throw r0     // Catch:{ all -> 0x03db }
        L_0x03db:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x03dd }
        L_0x03dd:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r6, r2)     // Catch:{ IOException -> 0x03e2 }
            throw r0     // Catch:{ IOException -> 0x03e2 }
        L_0x03e2:
            r2 = move-exception
            java.lang.String r0 = "AvatarBackup/backup exception while writing to temp file"
            com.whatsapp.util.Log.e(r0, r2)
            java.lang.String r14 = "avatar-token"
            r15 = 0
            X.2zK r11 = new X.2zK
            r13 = r12
            r17 = r1
            r11.<init>(r12, r13, r14, r15, r17)
            return r11
        L_0x03f5:
            boolean r1 = r0 instanceof X.C22981Qv
            if (r1 == 0) goto L_0x04e8
            X.1Qv r0 = (X.C22981Qv) r0
            X.2s6 r14 = r0.A01
            boolean r1 = r14.A06()
            if (r1 == 0) goto L_0x0410
            java.lang.String r0 = "commerce_backup_store/backup/skip no media or read-only media"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "commerce-db"
            X.2zK r10 = new X.2zK
            r10.<init>(r0)
            return r10
        L_0x0410:
            X.2h8 r2 = r0.A04
            X.1RB r1 = r2.A00()
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r1.A05
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = r1.writeLock()
            r6.lock()
            java.lang.String r1 = "commerce_backup_store/backup/close-backup-db"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x04e3 }
            r2.A01()     // Catch:{ all -> 0x04e3 }
            X.2oU r1 = r2.A02     // Catch:{ Exception -> 0x04d2 }
            android.content.Context r2 = r1.A00     // Catch:{ Exception -> 0x04d2 }
            java.lang.String r1 = "commerce.db"
            java.io.File r5 = r2.getDatabasePath(r1)     // Catch:{ Exception -> 0x04d2 }
            boolean r1 = r5.exists()     // Catch:{ Exception -> 0x04d2 }
            r12 = 0
            if (r1 != 0) goto L_0x0445
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x04d2 }
            java.lang.String r0 = "commerce_backup_store/backup/db-file-not-found"
            X.C18260x0.A1R(r1, r0, r5)     // Catch:{ Exception -> 0x04d2 }
            r6.unlock()
            return r12
        L_0x0445:
            X.22O r1 = X.AnonymousClass22O.CRYPT13     // Catch:{ Exception -> 0x04d2 }
            if (r10 != r1) goto L_0x0475
            X.310 r1 = r0.A02     // Catch:{ Exception -> 0x04d2 }
            java.io.File r2 = r1.A02()     // Catch:{ Exception -> 0x04d2 }
            java.lang.String r1 = "commerce_backup.db.crypt1"
            java.io.File r3 = X.AnonymousClass002.A0A(r2, r1)     // Catch:{ Exception -> 0x04d2 }
        L_0x0455:
            java.io.File r1 = r0.A07(r10)     // Catch:{ Exception -> 0x04d2 }
            java.util.ArrayList r1 = r0.A09(r1)     // Catch:{ Exception -> 0x04d2 }
            java.util.Iterator r4 = r1.iterator()     // Catch:{ Exception -> 0x04d2 }
        L_0x0461:
            boolean r1 = r4.hasNext()     // Catch:{ Exception -> 0x04d2 }
            if (r1 == 0) goto L_0x0480
            java.io.File r2 = X.AnonymousClass0x9.A0f(r4)     // Catch:{ Exception -> 0x04d2 }
            boolean r1 = r2.equals(r3)     // Catch:{ Exception -> 0x04d2 }
            if (r1 != 0) goto L_0x0461
            X.C18270x1.A0x(r2)     // Catch:{ Exception -> 0x04d2 }
            goto L_0x0461
        L_0x0475:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x04d2 }
            java.lang.String r1 = "commerce_backup.db.crypt"
            java.io.File r3 = X.C23021Qz.A00(r0, r10, r1, r2)     // Catch:{ Exception -> 0x04d2 }
            goto L_0x0455
        L_0x0480:
            X.34i r4 = r0.A06     // Catch:{ Exception -> 0x04d2 }
            X.2sr r11 = r0.A00     // Catch:{ Exception -> 0x04d2 }
            X.2f0 r15 = r0.A03     // Catch:{ Exception -> 0x04d2 }
            X.0WN r13 = r0.A01     // Catch:{ Exception -> 0x04d2 }
            X.2fR r2 = r0.A05     // Catch:{ Exception -> 0x04d2 }
            X.2eK r1 = r0.A04     // Catch:{ Exception -> 0x04d2 }
            r16 = r1
            r17 = r2
            r18 = r10
            r19 = r4
            r20 = r3
            r21 = r12
            X.0UR r4 = X.AnonymousClass0S7.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x04d2 }
            X.2oU r1 = r0.A02     // Catch:{ Exception -> 0x04d2 }
            android.content.Context r1 = r1.A00     // Catch:{ Exception -> 0x04d2 }
            boolean r1 = r4.A07(r1)     // Catch:{ Exception -> 0x04d2 }
            if (r1 != 0) goto L_0x04b3
            java.lang.String r0 = "commerce_backup_store/backup/failed to prepare for backup"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ Exception -> 0x04d2 }
            java.lang.String r0 = "commerce-db"
            X.2zK r10 = new X.2zK     // Catch:{ Exception -> 0x04d2 }
            r10.<init>(r0)     // Catch:{ Exception -> 0x04d2 }
            goto L_0x04df
        L_0x04b3:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x04d2 }
            java.lang.String r1 = "commerce_backup_store/backup/to "
            X.C18260x0.A1R(r2, r1, r3)     // Catch:{ Exception -> 0x04d2 }
            r4.A06(r12, r5)     // Catch:{ Exception -> 0x04d2 }
            java.io.File r1 = r0.A07(r10)     // Catch:{ Exception -> 0x04d2 }
            long r14 = r0.A04(r1)     // Catch:{ Exception -> 0x04d2 }
            java.lang.String r13 = "commerce-db"
            r16 = 1
            X.2zK r10 = new X.2zK     // Catch:{ Exception -> 0x04d2 }
            r11 = r3
            r10.<init>(r11, r12, r13, r14, r16)     // Catch:{ Exception -> 0x04d2 }
            goto L_0x04df
        L_0x04d2:
            r1 = move-exception
            java.lang.String r0 = "commerce_backup_store/backup/error"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x04e3 }
            java.lang.String r0 = "commerce-db"
            X.2zK r10 = new X.2zK     // Catch:{ all -> 0x04e3 }
            r10.<init>(r0)     // Catch:{ all -> 0x04e3 }
        L_0x04df:
            r6.unlock()
            return r10
        L_0x04e3:
            r0 = move-exception
            r6.unlock()
            throw r0
        L_0x04e8:
            X.1Qu r0 = (X.C22971Qu) r0
            r1 = 0
            X.C162457s7.A0J(r10, r1)
            X.8qC r2 = r0.A06
            java.lang.Object r5 = r2.get()
            X.5aW r5 = (X.C106995aW) r5
            X.1VX r4 = r5.A04
            r3 = 5854(0x16de, float:8.203E-42)
            X.2vE r2 = X.C58422vE.A02
            boolean r2 = r4.A0Y(r2, r3)
            if (r2 == 0) goto L_0x0511
            X.8qC r2 = r5.A0F
            java.lang.Object r2 = r2.get()
            X.5To r2 = (X.C105095To) r2
            boolean r3 = r2.A03()
            r2 = 1
            if (r3 != 0) goto L_0x0512
        L_0x0511:
            r2 = 0
        L_0x0512:
            r12 = 0
            if (r2 == 0) goto L_0x058e
            X.8qC r2 = r0.A07
            java.lang.Object r2 = r2.get()
            X.5My r2 = (X.C103435My) r2
            java.io.File r4 = r2.A00()
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "chatlock_backup.bkup.crypt"
            java.io.File r20 = X.C23021Qz.A00(r0, r10, r2, r3)
            X.34i r5 = r0.A05     // Catch:{ IOException -> 0x057a }
            X.2sr r11 = r0.A00     // Catch:{ IOException -> 0x057a }
            X.2f0 r15 = r0.A03     // Catch:{ IOException -> 0x057a }
            X.0WN r13 = r0.A01     // Catch:{ IOException -> 0x057a }
            X.2s6 r14 = r0.A01     // Catch:{ IOException -> 0x057a }
            X.2fR r3 = r0.A04     // Catch:{ IOException -> 0x057a }
            X.2eK r2 = r0.A04     // Catch:{ IOException -> 0x057a }
            r16 = r2
            r17 = r3
            r18 = r10
            r19 = r5
            r21 = r12
            X.0UR r3 = X.AnonymousClass0S7.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ IOException -> 0x057a }
            X.2oU r2 = r0.A02     // Catch:{ IOException -> 0x057a }
            android.content.Context r2 = r2.A00     // Catch:{ IOException -> 0x057a }
            boolean r2 = r3.A07(r2)     // Catch:{ IOException -> 0x057a }
            if (r2 != 0) goto L_0x0563
            java.lang.String r0 = "ChatLockBackup/backup prepare for backup failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x057a }
            java.lang.String r14 = "chatlock_backup"
            r15 = 0
            X.2zK r11 = new X.2zK     // Catch:{ IOException -> 0x057a }
            r13 = r12
            r17 = r1
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ IOException -> 0x057a }
            return r11
        L_0x0563:
            r3.A06(r12, r4)     // Catch:{ IOException -> 0x057a }
            java.io.File r1 = r0.A07(r10)
            long r23 = r0.A04(r1)
            java.lang.String r22 = "chatlock_backup"
            r25 = 1
            X.2zK r11 = new X.2zK
            r19 = r11
            r19.<init>(r20, r21, r22, r23, r25)
            return r11
        L_0x057a:
            r2 = move-exception
            java.lang.String r0 = "ChatLockBackup/backup backup failed"
            com.whatsapp.util.Log.e(r0, r2)
            java.lang.String r15 = "chatlock_backup"
            r13 = 0
            r16 = 0
            X.2zK r12 = new X.2zK
            r14 = r13
            r18 = r1
            r12.<init>(r13, r14, r15, r16, r18)
            return r12
        L_0x058e:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56772sX.A06(X.22O):X.2zK");
    }

    public String A08() {
        if (this instanceof AnonymousClass1R0) {
            return "wa-db";
        }
        if (this instanceof C23021Qz) {
            return "stickers-db";
        }
        if ((this instanceof C23011Qy) || (this instanceof C23001Qx)) {
            return "wallpaper-v2";
        }
        if (this instanceof AnonymousClass1R1) {
            return "chat-settings";
        }
        if (this instanceof C22991Qw) {
            return "avatar-token";
        }
        if (this instanceof C22981Qv) {
            return "commerce-db";
        }
        return "chatlock_backup";
    }

    public ArrayList A09(File file) {
        if (this instanceof AnonymousClass1R0) {
            Log.d("WaDatabaseBackupProducer/getbackupfiles");
            return A03(file, "wa.db", C06550Ye.A0A(AnonymousClass22O.CRYPT14));
        } else if (this instanceof C23021Qz) {
            Log.d("chat-settings-store/getbackupfiles");
            List A0A = C06550Ye.A0A(AnonymousClass22O.CRYPT13);
            A0A.add(".crypt1");
            return A03(file, "stickers.db", A0A);
        } else if (this instanceof C23011Qy) {
            return C623834u.A03(file);
        } else {
            if (this instanceof C23001Qx) {
                Log.d("wallpaper-manager/getbackupfiles");
                return A03(file, "wallpaper.bkup", C06550Ye.A0A(AnonymousClass22O.CRYPT14));
            } else if (this instanceof AnonymousClass1R1) {
                Log.d("chat-settings-store/getbackupfiles");
                List A0A2 = C06550Ye.A0A(AnonymousClass22O.CRYPT13);
                A0A2.add(".crypt1");
                return A03(file, "chatsettingsbackup.db", A0A2);
            } else if (this instanceof C22991Qw) {
                C162457s7.A0J(file, 0);
                return A03(file, "avatar-password.bkup", C06550Ye.A0A(AnonymousClass22O.CRYPT14));
            } else if (this instanceof C22981Qv) {
                Log.d("chat-settings-store/getbackupfiles");
                List A0A3 = C06550Ye.A0A(AnonymousClass22O.CRYPT13);
                A0A3.add(".crypt1");
                return A03(file, "commerce_backup.db", A0A3);
            } else {
                C162457s7.A0J(file, 0);
                return A03(file, "chatlock_backup.bkup", C06550Ye.A0A(AnonymousClass22O.CRYPT14));
            }
        }
    }

    public final void A0A() {
        AnonymousClass0U8 r7 = this.A00;
        String A08 = A08();
        C162457s7.A0J(A08, 0);
        long j = r7.A01().getLong(AnonymousClass000.A0X("_backup_size", AnonymousClass000.A0l(A08)), -1);
        if (j != -1) {
            r7.A03(Long.valueOf(j), A08, "_backup_google_saved_size");
            return;
        }
        C18270x1.A0n(r7.A01(), AnonymousClass000.A0T(A08, "_backup_google_saved_size"));
    }

    public final void A0B(C26041bU r14) {
        AnonymousClass0U8 r4 = this.A00;
        String A08 = A08();
        C162457s7.A0J(A08, 0);
        boolean z = r4.A01().getBoolean(AnonymousClass000.A0X("_backup_success", AnonymousClass000.A0l(A08)), false);
        C60882zK r6 = new C60882zK((File) null, Long.valueOf(r4.A01().getLong(AnonymousClass000.A0X("_backup_media_size", AnonymousClass000.A0l(A08)), -1)), A08, r4.A01().getLong(AnonymousClass000.A0X("_backup_size", AnonymousClass000.A0l(A08)), -1), z);
        long j = r6.A00;
        if (-1 != ((int) j)) {
            double d = (double) j;
            A0C(r14, d);
            A0D(r14, d - ((double) AnonymousClass0x2.A0B(r4.A01(), AnonymousClass000.A0X("_backup_google_saved_size", AnonymousClass000.A0l(A08)))));
            Long l = r6.A02;
            if (l != null) {
                double longValue = (double) l.longValue();
                if (this instanceof C23021Qz) {
                    r14.A0M = Double.valueOf(longValue);
                } else if ((this instanceof C23011Qy) || (this instanceof C23001Qx)) {
                    r14.A0R = Double.valueOf(longValue);
                }
            }
        }
    }

    public void A0C(C26041bU r2, double d) {
        if (this instanceof AnonymousClass1R0) {
            r2.A0P = Double.valueOf(d);
        } else if (this instanceof C23021Qz) {
            r2.A0N = Double.valueOf(d);
        } else if ((this instanceof C23011Qy) || (this instanceof C23001Qx)) {
            r2.A0S = Double.valueOf(d);
        } else if (this instanceof AnonymousClass1R1) {
            r2.A0G = Double.valueOf(d);
        } else if (this instanceof C22991Qw) {
            r2.A03 = Double.valueOf(d);
        } else if (this instanceof C22981Qv) {
            r2.A0I = Double.valueOf(d);
        }
    }

    public void A0D(C26041bU r2, double d) {
        if (this instanceof AnonymousClass1R0) {
            r2.A0O = Double.valueOf(d);
        } else if (this instanceof C23021Qz) {
            r2.A0L = Double.valueOf(d);
        } else if ((this instanceof C23011Qy) || (this instanceof C23001Qx)) {
            r2.A0Q = Double.valueOf(d);
        } else if (this instanceof AnonymousClass1R1) {
            r2.A0F = Double.valueOf(d);
        } else if (this instanceof C22991Qw) {
            r2.A02 = Double.valueOf(d);
        } else if (this instanceof C22981Qv) {
            r2.A0H = Double.valueOf(d);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:167:0x037c, code lost:
        if (r13 == null) goto L_0x039f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x053a, code lost:
        if (r10 == null) goto L_0x057d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e6, code lost:
        if (r11 == null) goto L_0x0119;
     */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x057c A[Catch:{ 23v | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0583, all -> 0x058e }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:171:0x03a4=Splitter:B:171:0x03a4, B:263:0x0589=Splitter:B:263:0x0589} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0F(android.content.Context r31, java.io.File r32) {
        /*
            r30 = this;
            r0 = r30
            boolean r1 = r0 instanceof X.AnonymousClass1R0
            r15 = r32
            if (r1 == 0) goto L_0x008d
            X.1R0 r0 = (X.AnonymousClass1R0) r0
            X.2oU r2 = r0.A03
            X.2qk r7 = r0.A00
            X.2ao r6 = r0.A07
            X.2zT r5 = r0.A06
            X.2og r4 = r0.A04
            java.lang.String r13 = "wa-backup.db"
            X.2G4 r3 = r0.A08
            X.1RI r1 = new X.1RI
            r8 = r2
            r9 = r4
            r10 = r5
            r11 = r6
            r12 = r3
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r1.A05
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r5 = r3.writeLock()
            r5.lock()
            r18 = 0
            r1.A0D()     // Catch:{ Exception -> 0x007d }
            X.2oU r3 = r1.A00     // Catch:{ Exception -> 0x007d }
            android.content.Context r4 = r3.A00     // Catch:{ Exception -> 0x007d }
            java.lang.String r3 = r1.getDatabaseName()     // Catch:{ Exception -> 0x007d }
            java.io.File r17 = r4.getDatabasePath(r3)     // Catch:{ Exception -> 0x007d }
            r15.getAbsolutePath()     // Catch:{ Exception -> 0x007d }
            r17.getAbsolutePath()     // Catch:{ Exception -> 0x007d }
            java.lang.String r4 = r15.getName()     // Catch:{ Exception -> 0x007d }
            java.lang.String r3 = "wa.db"
            int r3 = X.C06550Ye.A01(r4, r3)     // Catch:{ Exception -> 0x007d }
            X.22O r13 = X.AnonymousClass22O.A02(r3)     // Catch:{ Exception -> 0x007d }
            X.34i r14 = r0.A0A     // Catch:{ Exception -> 0x007d }
            X.2sr r6 = r0.A01     // Catch:{ Exception -> 0x007d }
            X.2f0 r10 = r0.A05     // Catch:{ Exception -> 0x007d }
            X.0WN r8 = r0.A01     // Catch:{ Exception -> 0x007d }
            X.2s6 r9 = r0.A02     // Catch:{ Exception -> 0x007d }
            X.2fR r12 = r0.A09     // Catch:{ Exception -> 0x007d }
            X.2eK r11 = r0.A04     // Catch:{ Exception -> 0x007d }
            r7 = 0
            r16 = r7
            X.0UR r14 = X.AnonymousClass0S7.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x007d }
            r20 = r18
            r15 = r2
            r19 = r18
            r14.A04(r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x007d }
            r5.unlock()
            X.1RI r0 = r0.A0B     // Catch:{ Exception -> 0x05e6 }
            X.AnonymousClass1R0.A00(r1, r0)     // Catch:{ Exception -> 0x05e6 }
            r1.A0D()     // Catch:{ Exception -> 0x05e6 }
            goto L_0x05e0
        L_0x007d:
            r1 = move-exception
            java.lang.String r0 = "WaDatabaseBackupProducer/restore backup file failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0088 }
            r5.unlock()
            goto L_0x05ec
        L_0x0088:
            r1 = move-exception
            r5.unlock()
            throw r1
        L_0x008d:
            boolean r1 = r0 instanceof X.C23021Qz
            if (r1 == 0) goto L_0x0131
            r12 = r0
            X.1Qz r12 = (X.C23021Qz) r12
            monitor-enter(r0)
            X.8qC r2 = r12.A09     // Catch:{ all -> 0x0597 }
            java.lang.Object r1 = r2.get()     // Catch:{ all -> 0x0597 }
            X.1RH r1 = (X.AnonymousClass1RH) r1     // Catch:{ all -> 0x0597 }
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r1.A05     // Catch:{ all -> 0x0597 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r13 = r1.writeLock()     // Catch:{ all -> 0x0597 }
            r13.lock()     // Catch:{ all -> 0x0597 }
            java.lang.Object r1 = r2.get()     // Catch:{ all -> 0x012e }
            X.0y0 r1 = (X.C18630y0) r1     // Catch:{ all -> 0x012e }
            r1.close()     // Catch:{ all -> 0x012e }
            java.lang.Object r1 = r2.get()     // Catch:{ all -> 0x012e }
            X.1RH r1 = (X.AnonymousClass1RH) r1     // Catch:{ all -> 0x012e }
            r1.A0D()     // Catch:{ all -> 0x012e }
            X.2oU r1 = r12.A03     // Catch:{ all -> 0x012e }
            android.content.Context r1 = r1.A00     // Catch:{ all -> 0x012e }
            java.lang.String r3 = "stickers.db"
            java.io.File r10 = r1.getDatabasePath(r3)     // Catch:{ all -> 0x012e }
            X.2rq r1 = r12.A01     // Catch:{ all -> 0x012e }
            X.3Dh r1 = r1.A00     // Catch:{ all -> 0x012e }
            java.io.File r2 = X.C54292oU.A01(r1)     // Catch:{ all -> 0x012e }
            java.lang.String r1 = "Stickers"
            java.io.File r9 = X.C64393Dh.A01(r2, r1)     // Catch:{ all -> 0x012e }
            r8 = 0
            java.lang.String r1 = r15.getName()     // Catch:{ Exception -> 0x0121 }
            int r2 = X.C06550Ye.A01(r1, r3)     // Catch:{ Exception -> 0x0121 }
            if (r2 <= 0) goto L_0x0119
            X.22O r11 = X.AnonymousClass22O.CRYPT13     // Catch:{ Exception -> 0x0121 }
            int r1 = r11.version     // Catch:{ Exception -> 0x0121 }
            if (r2 < r1) goto L_0x00e8
            X.22O r11 = X.AnonymousClass22O.A02(r2)     // Catch:{ Exception -> 0x0121 }
            if (r11 == 0) goto L_0x0119
        L_0x00e8:
            X.34i r7 = r12.A08     // Catch:{ Exception -> 0x0121 }
            X.2sr r6 = r12.A00     // Catch:{ Exception -> 0x0121 }
            X.2f0 r5 = r12.A04     // Catch:{ Exception -> 0x0121 }
            X.0WN r4 = r12.A01     // Catch:{ Exception -> 0x0121 }
            X.2s6 r3 = r12.A02     // Catch:{ Exception -> 0x0121 }
            X.2fR r2 = r12.A07     // Catch:{ Exception -> 0x0121 }
            X.2eK r1 = r12.A04     // Catch:{ Exception -> 0x0121 }
            r16 = 0
            r17 = r4
            r18 = r3
            r19 = r5
            r20 = r1
            r21 = r2
            r22 = r11
            r23 = r7
            r24 = r15
            r25 = r16
            r15 = r6
            X.0UR r2 = X.AnonymousClass0S7.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ Exception -> 0x0121 }
            X.3DV r1 = new X.3DV     // Catch:{ Exception -> 0x0121 }
            r1.<init>(r10, r9)     // Catch:{ Exception -> 0x0121 }
            boolean r1 = r2.A08(r1, r8)     // Catch:{ Exception -> 0x0121 }
            goto L_0x011c
        L_0x0119:
            X.22O r11 = X.AnonymousClass22O.UNENCRYPTED     // Catch:{ Exception -> 0x0121 }
            goto L_0x00e8
        L_0x011c:
            r13.unlock()     // Catch:{ all -> 0x0597 }
            monitor-exit(r0)
            return r1
        L_0x0121:
            r2 = move-exception
            java.lang.String r1 = "sticker-db-storage/restore failed"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x012e }
            r13.unlock()     // Catch:{ all -> 0x0597 }
            monitor-exit(r0)
            goto L_0x05ec
        L_0x012e:
            r1 = move-exception
            goto L_0x0593
        L_0x0131:
            boolean r1 = r0 instanceof X.C23011Qy
            if (r1 == 0) goto L_0x0268
            X.1Qy r0 = (X.C23011Qy) r0
            java.lang.String r1 = "wallpaper/v2/restore"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r9 = 1
            X.2oU r1 = r0.A02     // Catch:{ IOException -> 0x0260 }
            java.io.File r2 = X.C54292oU.A03(r1)     // Catch:{ IOException -> 0x0260 }
            java.lang.String r1 = "Wallpapers"
            java.io.File r1 = X.AnonymousClass002.A0A(r2, r1)     // Catch:{ IOException -> 0x0260 }
            java.lang.String r4 = r1.getCanonicalPath()     // Catch:{ IOException -> 0x0260 }
            X.4Eg r1 = r0.A05     // Catch:{ IOException -> 0x0260 }
            java.util.Set r1 = r1.B4T()     // Catch:{ IOException -> 0x0260 }
            java.util.HashMap r7 = X.AnonymousClass001.A0t()     // Catch:{ IOException -> 0x0260 }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ IOException -> 0x0260 }
        L_0x015c:
            boolean r1 = r3.hasNext()     // Catch:{ IOException -> 0x0260 }
            if (r1 == 0) goto L_0x0190
            java.lang.String r1 = X.AnonymousClass001.A0m(r3)     // Catch:{ IOException -> 0x0260 }
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ IOException -> 0x0260 }
            java.lang.String r1 = r1.getPath()     // Catch:{ IOException -> 0x0260 }
            if (r1 == 0) goto L_0x015c
            X.C626936e.A06(r1)     // Catch:{ IOException -> 0x0260 }
            java.io.File r2 = X.AnonymousClass002.A0B(r1)     // Catch:{ IOException -> 0x0260 }
            java.lang.String r1 = r2.getCanonicalPath()     // Catch:{ IOException -> 0x0260 }
            boolean r1 = r1.startsWith(r4)     // Catch:{ IOException -> 0x0260 }
            if (r1 == 0) goto L_0x0189
            java.lang.String r1 = r2.getName()     // Catch:{ IOException -> 0x0260 }
            r7.put(r1, r2)     // Catch:{ IOException -> 0x0260 }
            goto L_0x015c
        L_0x0189:
            java.lang.String r1 = "wallpaper/v2/restore wallpaper file outside of the wallpaper directory"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ IOException -> 0x0260 }
            goto L_0x015c
        L_0x0190:
            boolean r1 = r7.isEmpty()     // Catch:{ IOException -> 0x0260 }
            if (r1 != 0) goto L_0x0267
            boolean r1 = r15.isDirectory()     // Catch:{ IOException -> 0x0260 }
            if (r1 == 0) goto L_0x0212
            java.io.File[] r6 = r15.listFiles()     // Catch:{ IOException -> 0x0260 }
            if (r6 == 0) goto L_0x0267
            int r5 = r6.length     // Catch:{ IOException -> 0x0260 }
            r4 = 0
            r3 = 0
        L_0x01a5:
            if (r3 >= r5) goto L_0x0267
            r8 = r6[r3]     // Catch:{ IOException -> 0x0260 }
            java.lang.String r0 = r8.getName()     // Catch:{ IOException -> 0x0260 }
            java.lang.Object r2 = r7.get(r0)     // Catch:{ IOException -> 0x0260 }
            java.io.File r2 = (java.io.File) r2     // Catch:{ IOException -> 0x0260 }
            if (r2 == 0) goto L_0x020f
            java.io.File r0 = r2.getParentFile()     // Catch:{ IOException -> 0x0260 }
            if (r0 == 0) goto L_0x01be
            X.C18280x3.A10(r0)     // Catch:{ IOException -> 0x0260 }
        L_0x01be:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0260 }
            java.lang.String r0 = "wallpaper/v2/restore/copy "
            X.C18270x1.A0y(r2, r0, r1)     // Catch:{ IOException -> 0x0260 }
            java.lang.String r0 = " "
            java.lang.String r0 = X.AnonymousClass000.A0N(r8, r0, r1)     // Catch:{ IOException -> 0x0260 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0260 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0208 }
            r0.<init>(r2, r4)     // Catch:{ IOException -> 0x0208 }
            java.nio.channels.WritableByteChannel r2 = java.nio.channels.Channels.newChannel(r0)     // Catch:{ IOException -> 0x0208 }
            java.io.FileInputStream r0 = X.AnonymousClass0x9.A0g(r8)     // Catch:{ all -> 0x01fc }
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch:{ all -> 0x01fc }
            X.C627536m.A0J(r0, r2)     // Catch:{ all -> 0x01f0 }
            if (r0 == 0) goto L_0x01ea
            r0.close()     // Catch:{ all -> 0x01fc }
        L_0x01ea:
            if (r2 == 0) goto L_0x020f
            r2.close()     // Catch:{ IOException -> 0x0208 }
            goto L_0x020f
        L_0x01f0:
            r1 = move-exception
            if (r0 == 0) goto L_0x01fb
            r0.close()     // Catch:{ all -> 0x01f7 }
            goto L_0x01fb
        L_0x01f7:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01fc }
        L_0x01fb:
            throw r1     // Catch:{ all -> 0x01fc }
        L_0x01fc:
            r1 = move-exception
            if (r2 == 0) goto L_0x0207
            r2.close()     // Catch:{ all -> 0x0203 }
            goto L_0x0207
        L_0x0203:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0208 }
        L_0x0207:
            throw r1     // Catch:{ IOException -> 0x0208 }
        L_0x0208:
            r1 = move-exception
            java.lang.String r0 = "wallpaper/v2/restore/ioerror "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ IOException -> 0x0260 }
        L_0x020f:
            int r3 = r3 + 1
            goto L_0x01a5
        L_0x0212:
            java.lang.String r2 = r15.getName()     // Catch:{ Exception -> 0x0258 }
            java.lang.String r1 = "wallpapers.backup"
            int r1 = X.C06550Ye.A01(r2, r1)     // Catch:{ Exception -> 0x0258 }
            if (r1 <= 0) goto L_0x0254
            X.22O r22 = X.AnonymousClass22O.A02(r1)     // Catch:{ Exception -> 0x0258 }
            if (r22 == 0) goto L_0x0254
        L_0x0225:
            X.34i r6 = r0.A07     // Catch:{ Exception -> 0x0258 }
            X.2sr r5 = r0.A00     // Catch:{ Exception -> 0x0258 }
            X.2f0 r4 = r0.A04     // Catch:{ Exception -> 0x0258 }
            X.0WN r3 = r0.A01     // Catch:{ Exception -> 0x0258 }
            X.2s6 r2 = r0.A01     // Catch:{ Exception -> 0x0258 }
            X.2fR r1 = r0.A06     // Catch:{ Exception -> 0x0258 }
            X.2eK r0 = r0.A04     // Catch:{ Exception -> 0x0258 }
            r16 = 0
            r17 = r3
            r18 = r2
            r19 = r4
            r20 = r0
            r21 = r1
            r23 = r6
            r24 = r15
            r25 = r16
            r15 = r5
            X.0UR r2 = X.AnonymousClass0S7.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ Exception -> 0x0258 }
            X.3DU r1 = new X.3DU     // Catch:{ Exception -> 0x0258 }
            r1.<init>(r7)     // Catch:{ Exception -> 0x0258 }
            r0 = 0
            r2.A08(r1, r0)     // Catch:{ Exception -> 0x0258 }
            goto L_0x0257
        L_0x0254:
            X.22O r22 = X.AnonymousClass22O.UNENCRYPTED     // Catch:{ Exception -> 0x0258 }
            goto L_0x0225
        L_0x0257:
            return r9
        L_0x0258:
            r1 = move-exception
            java.lang.String r0 = "wallpaper/v2/restore/failed "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ IOException -> 0x0260 }
            return r9
        L_0x0260:
            r1 = move-exception
            java.lang.String r0 = "wallpaper/v2/restore failed"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0267:
            return r9
        L_0x0268:
            boolean r1 = r0 instanceof X.C23001Qx
            r4 = r31
            if (r1 == 0) goto L_0x0324
            X.1Qx r0 = (X.C23001Qx) r0
            java.io.File r2 = r4.getFilesDir()
            java.lang.String r1 = "wallpaper.jpg"
            java.io.File r2 = X.AnonymousClass002.A0A(r2, r1)
            java.io.File r1 = r4.getFilesDir()
            java.lang.String r5 = "wallpaper.bkup"
            java.io.File r1 = X.AnonymousClass002.A0A(r1, r5)
            r17 = 0
            java.lang.String r3 = r15.getName()     // Catch:{ Exception -> 0x031b }
            int r3 = X.C06550Ye.A01(r3, r5)     // Catch:{ Exception -> 0x031b }
            if (r3 <= 0) goto L_0x0302
            X.22O r13 = X.AnonymousClass22O.A02(r3)     // Catch:{ Exception -> 0x031b }
            if (r13 == 0) goto L_0x0302
        L_0x0298:
            X.34i r14 = r0.A06     // Catch:{ Exception -> 0x031b }
            X.2sr r6 = r0.A00     // Catch:{ Exception -> 0x031b }
            X.2f0 r10 = r0.A04     // Catch:{ Exception -> 0x031b }
            X.0WN r8 = r0.A01     // Catch:{ Exception -> 0x031b }
            X.2s6 r9 = r0.A01     // Catch:{ Exception -> 0x031b }
            X.2fR r12 = r0.A05     // Catch:{ Exception -> 0x031b }
            X.2eK r11 = r0.A04     // Catch:{ Exception -> 0x031b }
            r7 = 0
            r16 = r7
            X.0UR r13 = X.AnonymousClass0S7.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x031b }
            X.2oU r14 = r0.A02     // Catch:{ Exception -> 0x031b }
            r19 = r17
            r15 = r7
            r18 = r17
            r16 = r1
            X.0NK r3 = r13.A04(r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x031b }
            int r0 = r3.A00     // Catch:{ Exception -> 0x031b }
            r6 = 1
            if (r0 == r6) goto L_0x02cf
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x031b }
            java.lang.String r0 = "wallpaper/restore/failed to restore "
            java.lang.String r0 = X.AnonymousClass000.A0P(r3, r0, r1)     // Catch:{ Exception -> 0x031b }
        L_0x02ca:
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ Exception -> 0x031b }
            goto L_0x05ec
        L_0x02cf:
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x031b }
            r3.<init>()     // Catch:{ Exception -> 0x031b }
            r3.inJustDecodeBounds = r6     // Catch:{ Exception -> 0x031b }
            java.lang.String r0 = r1.getAbsolutePath()     // Catch:{ Exception -> 0x031b }
            android.graphics.BitmapFactory.decodeFile(r0, r3)     // Catch:{ Exception -> 0x031b }
            int r5 = r3.outWidth     // Catch:{ Exception -> 0x031b }
            android.view.WindowManager r0 = X.C620633i.A01(r4)     // Catch:{ Exception -> 0x031b }
            android.graphics.Point r3 = new android.graphics.Point     // Catch:{ Exception -> 0x031b }
            r3.<init>()     // Catch:{ Exception -> 0x031b }
            android.view.Display r0 = r0.getDefaultDisplay()     // Catch:{ Exception -> 0x031b }
            r0.getSize(r3)     // Catch:{ Exception -> 0x031b }
            android.content.res.Configuration r0 = X.AnonymousClass001.A0M(r4)     // Catch:{ Exception -> 0x031b }
            int r0 = r0.orientation     // Catch:{ Exception -> 0x031b }
            if (r0 != r6) goto L_0x02fa
            int r0 = r3.x     // Catch:{ Exception -> 0x031b }
            goto L_0x02fc
        L_0x02fa:
            int r0 = r3.y     // Catch:{ Exception -> 0x031b }
        L_0x02fc:
            if (r0 == r5) goto L_0x0305
            java.lang.String r0 = "wallpaper/restore skipping final rename due to size mismatch"
            goto L_0x02ca
        L_0x0302:
            X.22O r13 = X.AnonymousClass22O.UNENCRYPTED     // Catch:{ Exception -> 0x031b }
            goto L_0x0298
        L_0x0305:
            boolean r0 = r1.renameTo(r2)     // Catch:{ Exception -> 0x031b }
            if (r0 != 0) goto L_0x0313
            java.lang.String r0 = "wallpaper/restore could not rename tmp file"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x031b }
            goto L_0x05ec
        L_0x0313:
            java.lang.String r0 = "wallpaper/restore complete"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x031b }
            goto L_0x05e0
        L_0x031b:
            r1 = move-exception
            java.lang.String r0 = "wallpaper/restore/ioerror "
            com.whatsapp.util.Log.w(r0, r1)
            r1 = 0
            return r1
        L_0x0324:
            boolean r1 = r0 instanceof X.AnonymousClass1R1
            if (r1 == 0) goto L_0x03b6
            r2 = r0
            X.1R1 r2 = (X.AnonymousClass1R1) r2
            monitor-enter(r0)
            r2.A0W()     // Catch:{ all -> 0x0597 }
            X.2oU r3 = r2.A0E     // Catch:{ all -> 0x0597 }
            android.content.Context r5 = r3.A00     // Catch:{ all -> 0x0597 }
            java.lang.String r1 = "chatsettings.db"
            java.io.File r1 = r5.getDatabasePath(r1)     // Catch:{ all -> 0x0597 }
            boolean r4 = r15.exists()     // Catch:{ all -> 0x0597 }
            r17 = 0
            if (r4 != 0) goto L_0x0366
            java.lang.String r3 = "chatsettingsbackup.db"
            java.io.File r4 = r5.getDatabasePath(r3)     // Catch:{ all -> 0x0597 }
            boolean r3 = r4.exists()     // Catch:{ all -> 0x0597 }
            if (r3 == 0) goto L_0x03b4
            java.lang.String r3 = "chat-settings-store/restore/plain text backup"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x0597 }
            X.2eK r3 = r2.A04     // Catch:{ all -> 0x0597 }
            boolean r17 = X.C627536m.A0N(r3, r4, r1)     // Catch:{ all -> 0x0597 }
            boolean r1 = r4.delete()     // Catch:{ all -> 0x0597 }
            if (r1 != 0) goto L_0x0363
            java.lang.String r1 = "chat-settings-store/restore/unable to delete temp backup file"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ all -> 0x0597 }
        L_0x0363:
            if (r17 == 0) goto L_0x03b4
            goto L_0x03a4
        L_0x0366:
            java.lang.String r5 = r15.getName()     // Catch:{ Exception -> 0x03ae }
            java.lang.String r4 = "chatsettingsbackup.db"
            int r5 = X.C06550Ye.A01(r5, r4)     // Catch:{ Exception -> 0x03ae }
            if (r5 <= 0) goto L_0x039f
            X.22O r13 = X.AnonymousClass22O.CRYPT13     // Catch:{ Exception -> 0x03ae }
            int r4 = r13.version     // Catch:{ Exception -> 0x03ae }
            if (r5 < r4) goto L_0x037e
            X.22O r13 = X.AnonymousClass22O.A02(r5)     // Catch:{ Exception -> 0x03ae }
            if (r13 == 0) goto L_0x039f
        L_0x037e:
            X.34i r14 = r2.A0T     // Catch:{ Exception -> 0x03ae }
            X.2sr r6 = r2.A05     // Catch:{ Exception -> 0x03ae }
            X.2f0 r10 = r2.A0H     // Catch:{ Exception -> 0x03ae }
            X.0WN r8 = r2.A01     // Catch:{ Exception -> 0x03ae }
            X.2s6 r9 = r2.A0B     // Catch:{ Exception -> 0x03ae }
            X.2fR r12 = r2.A0S     // Catch:{ Exception -> 0x03ae }
            X.2eK r11 = r2.A04     // Catch:{ Exception -> 0x03ae }
            r7 = 0
            r16 = r7
            X.0UR r13 = X.AnonymousClass0S7.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x03ae }
            r19 = r17
            r15 = r7
            r16 = r1
            r18 = r17
            r14 = r3
            r13.A04(r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x03ae }
            goto L_0x03a2
        L_0x039f:
            X.22O r13 = X.AnonymousClass22O.UNENCRYPTED     // Catch:{ Exception -> 0x03ae }
            goto L_0x037e
        L_0x03a2:
            r17 = 1
        L_0x03a4:
            boolean r1 = X.AnonymousClass2BF.A00     // Catch:{ all -> 0x0597 }
            if (r1 == 0) goto L_0x03b4
            X.35T r1 = r2.A01     // Catch:{ all -> 0x0597 }
            r1.A09()     // Catch:{ all -> 0x0597 }
            goto L_0x03b4
        L_0x03ae:
            r2 = move-exception
            java.lang.String r1 = "chat-settings-store/restore failed"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x0597 }
        L_0x03b4:
            monitor-exit(r0)
            return r17
        L_0x03b6:
            boolean r1 = r0 instanceof X.C22991Qw
            if (r1 == 0) goto L_0x04d2
            X.1Qw r0 = (X.C22991Qw) r0
            java.lang.String r3 = "avatar_password"
            java.lang.String r2 = "avatar_fbid"
            X.C18270x1.A14(r4, r15)
            r17 = 0
            X.2eK r11 = r0.A04     // Catch:{ IOException -> 0x04cb }
            java.lang.String r5 = "avatar_password.json"
            java.io.File r4 = r11.A01(r5)     // Catch:{ IOException -> 0x04cb }
            java.lang.String r1 = r15.getName()     // Catch:{ IOException -> 0x04cb }
            int r1 = X.C06550Ye.A01(r1, r5)     // Catch:{ IOException -> 0x04cb }
            if (r1 <= 0) goto L_0x0415
            X.22O r13 = X.AnonymousClass22O.A02(r1)     // Catch:{ IOException -> 0x04cb }
            if (r13 == 0) goto L_0x0415
        L_0x03dd:
            X.34i r14 = r0.A06     // Catch:{ IOException -> 0x04cb }
            X.2sr r6 = r0.A00     // Catch:{ IOException -> 0x04cb }
            X.2f0 r10 = r0.A03     // Catch:{ IOException -> 0x04cb }
            X.0WN r8 = r0.A01     // Catch:{ IOException -> 0x04cb }
            X.2s6 r9 = r0.A01     // Catch:{ IOException -> 0x04cb }
            X.2fR r12 = r0.A05     // Catch:{ IOException -> 0x04cb }
            r1 = 0
            r7 = r1
            r16 = r1
            X.0UR r13 = X.AnonymousClass0S7.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ IOException -> 0x04cb }
            X.2oU r14 = r0.A02     // Catch:{ IOException -> 0x04cb }
            r19 = r17
            r18 = r17
            r16 = r4
            r15 = r1
            r13.A04(r14, r15, r16, r17, r18, r19)     // Catch:{ IOException -> 0x04cb }
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x04cb }
            java.io.FileReader r6 = new java.io.FileReader     // Catch:{ IOException -> 0x04cb }
            r6.<init>(r4)     // Catch:{ IOException -> 0x04cb }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ IOException -> 0x04cb }
            r5.<init>(r6)     // Catch:{ IOException -> 0x04cb }
        L_0x040b:
            java.lang.String r4 = r5.readLine()     // Catch:{ IOException -> 0x04cb }
            if (r4 == 0) goto L_0x0418
            r7.append(r4)     // Catch:{ IOException -> 0x04cb }
            goto L_0x040b
        L_0x0415:
            X.22O r13 = X.AnonymousClass22O.UNENCRYPTED     // Catch:{ IOException -> 0x04cb }
            goto L_0x03dd
        L_0x0418:
            int r4 = r7.length()     // Catch:{ IOException -> 0x04cb }
            if (r4 <= 0) goto L_0x04c5
            java.lang.String r4 = r7.toString()     // Catch:{ IOException -> 0x04cb }
            org.json.JSONObject r5 = X.AnonymousClass0x9.A1H(r4)     // Catch:{ IOException -> 0x04cb }
            boolean r4 = r5.has(r2)     // Catch:{ IOException -> 0x04cb }
            r6 = 0
            if (r4 == 0) goto L_0x043c
            java.lang.String r7 = r5.getString(r2)     // Catch:{ IOException -> 0x04cb }
        L_0x0431:
            boolean r2 = r5.has(r3)     // Catch:{ IOException -> 0x04cb }
            if (r2 == 0) goto L_0x043e
            java.lang.String r8 = r5.getString(r3)     // Catch:{ IOException -> 0x04cb }
            goto L_0x043f
        L_0x043c:
            r7 = r6
            goto L_0x0431
        L_0x043e:
            r8 = r6
        L_0x043f:
            if (r7 == 0) goto L_0x04b3
            int r2 = r7.length()     // Catch:{ IOException -> 0x04cb }
            if (r2 == 0) goto L_0x04b3
            if (r8 == 0) goto L_0x04b3
            int r2 = r8.length()     // Catch:{ IOException -> 0x04cb }
            if (r2 == 0) goto L_0x04b3
            java.lang.String r5 = "WaFbid"
            X.3QD r4 = X.AnonymousClass3QD.A00()     // Catch:{ IOException -> 0x04cb }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ IOException -> 0x04cb }
            java.lang.Long r2 = X.C18290x4.A0h(r7)     // Catch:{ IOException -> 0x04cb }
            X.7yt r7 = new X.7yt     // Catch:{ IOException -> 0x04cb }
            r7.<init>(r4, r3, r2, r5)     // Catch:{ IOException -> 0x04cb }
            java.lang.String r5 = "WaFbPassword"
            X.3QD r4 = X.AnonymousClass3QD.A00()     // Catch:{ IOException -> 0x04cb }
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            X.7yt r2 = new X.7yt     // Catch:{ IOException -> 0x04cb }
            r2.<init>(r4, r3, r8, r5)     // Catch:{ IOException -> 0x04cb }
            X.2ke r8 = new X.2ke     // Catch:{ IOException -> 0x04cb }
            r8.<init>(r7, r2)     // Catch:{ IOException -> 0x04cb }
            X.3dJ r7 = new X.3dJ     // Catch:{ all -> 0x0497 }
            r7.<init>()     // Catch:{ all -> 0x0497 }
            X.2p0 r2 = r0.A04     // Catch:{ all -> 0x0497 }
            r0 = 1
            X.2AW r5 = new X.2AW     // Catch:{ all -> 0x0497 }
            r5.<init>(r7, r0)     // Catch:{ all -> 0x0497 }
            X.8qC r0 = r2.A02     // Catch:{ all -> 0x0497 }
            X.30P r4 = X.C18320x8.A0M(r0)     // Catch:{ all -> 0x0497 }
            X.2iy r3 = X.AnonymousClass2BB.A00     // Catch:{ all -> 0x0497 }
            r2 = 3
            X.4Ii r0 = new X.4Ii     // Catch:{ all -> 0x0497 }
            r0.<init>(r5, r2)     // Catch:{ all -> 0x0497 }
            r4.A05(r0, r3, r1, r8)     // Catch:{ all -> 0x0497 }
            java.lang.Object r1 = r7.get()     // Catch:{ all -> 0x0497 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0497 }
            goto L_0x049c
        L_0x0497:
            r0 = move-exception
            X.3Z0 r1 = X.AnonymousClass3Z0.A01(r0)     // Catch:{ IOException -> 0x04cb }
        L_0x049c:
            java.lang.Throwable r0 = X.AnonymousClass3Z9.A00(r1)     // Catch:{ IOException -> 0x04cb }
            if (r0 == 0) goto L_0x04a5
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ IOException -> 0x04cb }
        L_0x04a5:
            boolean r0 = r1 instanceof X.AnonymousClass3Z0     // Catch:{ IOException -> 0x04cb }
            if (r0 != 0) goto L_0x04aa
            r6 = r1
        L_0x04aa:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ IOException -> 0x04cb }
            if (r6 == 0) goto L_0x04d1
            boolean r17 = r6.booleanValue()     // Catch:{ IOException -> 0x04cb }
            return r17
        L_0x04b3:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x04cb }
            java.lang.String r0 = "AvatarBackup/restore is failed with fbid == "
            r1.append(r0)     // Catch:{ IOException -> 0x04cb }
            r1.append(r7)     // Catch:{ IOException -> 0x04cb }
            java.lang.String r0 = ", password == "
            X.C18260x0.A0q(r0, r8, r1)     // Catch:{ IOException -> 0x04cb }
            return r17
        L_0x04c5:
            java.lang.String r0 = "AvatarBackup/restore could not read JSON metadata from backup file"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException -> 0x04cb }
            return r17
        L_0x04cb:
            r1 = move-exception
            java.lang.String r0 = "AvatarBackup/restore failed"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x04d1:
            return r17
        L_0x04d2:
            boolean r1 = r0 instanceof X.C22981Qv
            if (r1 == 0) goto L_0x059a
            r9 = r0
            X.1Qv r9 = (X.C22981Qv) r9
            monitor-enter(r0)
            X.2h8 r2 = r9.A04     // Catch:{ all -> 0x0597 }
            X.1RB r1 = r2.A00()     // Catch:{ all -> 0x0597 }
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r1.A05     // Catch:{ all -> 0x0597 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r11 = r1.writeLock()     // Catch:{ all -> 0x0597 }
            r11.lock()     // Catch:{ all -> 0x0597 }
            r27 = 0
            r2.A01()     // Catch:{ 23v | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0583 }
            X.2oU r1 = r2.A02     // Catch:{ 23v | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0583 }
            android.content.Context r2 = r1.A00     // Catch:{ 23v | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0583 }
            java.lang.String r1 = "commerce.db"
            java.io.File r26 = r2.getDatabasePath(r1)     // Catch:{ 23v | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0583 }
            boolean r1 = r15.exists()     // Catch:{ 23v | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0583 }
            r5 = 1
            if (r1 != 0) goto L_0x050f
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ 23v | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0583 }
            java.lang.String r1 = "commerce_backup_store/backup/backup-file-not-found"
            X.C18260x0.A1R(r2, r1, r15)     // Catch:{ 23v | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0583 }
            r11.unlock()     // Catch:{ all -> 0x0597 }
            monitor-exit(r0)
            r27 = 1
            return r27
        L_0x050f:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ 23v | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0583 }
            java.lang.String r1 = "commerce_backup_store/restore/decrypting file: "
            r2.append(r1)     // Catch:{ 23v | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0583 }
            r2.append(r15)     // Catch:{ 23v | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0583 }
            java.lang.String r1 = " length: "
            java.lang.String r1 = X.AnonymousClass000.A0N(r15, r1, r2)     // Catch:{ 23v | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0583 }
            com.whatsapp.util.Log.d((java.lang.String) r1)     // Catch:{ 23v | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0583 }
            java.lang.String r2 = r15.getName()     // Catch:{ 23v | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0583 }
            java.lang.String r1 = "commerce_backup.db"
            int r2 = X.C06550Ye.A01(r2, r1)     // Catch:{ 23v | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0583 }
            if (r2 <= 0) goto L_0x057d
            X.22O r10 = X.AnonymousClass22O.CRYPT13     // Catch:{ 23v | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0583 }
            int r1 = r10.version     // Catch:{ 23v | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0583 }
            if (r2 < r1) goto L_0x053c
            X.22O r10 = X.AnonymousClass22O.A02(r2)     // Catch:{ 23v | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0583 }
            if (r10 == 0) goto L_0x057d
        L_0x053c:
            X.34i r8 = r9.A06     // Catch:{ 23v | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0583 }
            X.2sr r7 = r9.A00     // Catch:{ 23v | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0583 }
            X.2f0 r6 = r9.A03     // Catch:{ 23v | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0583 }
            X.0WN r4 = r9.A01     // Catch:{ 23v | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0583 }
            X.2s6 r3 = r9.A01     // Catch:{ 23v | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0583 }
            X.2fR r2 = r9.A05     // Catch:{ 23v | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0583 }
            X.2eK r1 = r9.A04     // Catch:{ 23v | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0583 }
            r16 = 0
            r17 = r4
            r18 = r3
            r19 = r6
            r20 = r1
            r21 = r2
            r22 = r10
            r23 = r8
            r24 = r15
            r25 = r16
            r15 = r7
            X.0UR r23 = X.AnonymousClass0S7.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ 23v | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0583 }
            X.2oU r1 = r9.A02     // Catch:{ 23v | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0583 }
            r29 = r27
            r28 = r27
            r24 = r1
            X.0NK r3 = r23.A04(r24, r25, r26, r27, r28, r29)     // Catch:{ 23v | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0583 }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ 23v | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0583 }
            java.lang.String r1 = "commerce_backup_store/restore/result "
            X.C18260x0.A1R(r2, r1, r3)     // Catch:{ 23v | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0583 }
            int r1 = r3.A00     // Catch:{ 23v | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0583 }
            if (r1 != r5) goto L_0x0589
            goto L_0x0580
        L_0x057d:
            X.22O r10 = X.AnonymousClass22O.UNENCRYPTED     // Catch:{ 23v | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0583 }
            goto L_0x053c
        L_0x0580:
            r27 = 1
            goto L_0x0589
        L_0x0583:
            r2 = move-exception
            java.lang.String r1 = "commerce_backup_store/restore/error"
            com.whatsapp.util.Log.w(r1, r2)     // Catch:{ all -> 0x058e }
        L_0x0589:
            r11.unlock()     // Catch:{ all -> 0x0597 }
            monitor-exit(r0)
            return r27
        L_0x058e:
            r1 = move-exception
            r11.unlock()     // Catch:{ all -> 0x0597 }
            goto L_0x0596
        L_0x0593:
            r13.unlock()     // Catch:{ all -> 0x0597 }
        L_0x0596:
            throw r1     // Catch:{ all -> 0x0597 }
        L_0x0597:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x059a:
            X.1Qu r0 = (X.C22971Qu) r0
            r1 = 1
            X.C162457s7.A0J(r15, r1)
            X.8qC r1 = r0.A07     // Catch:{ IOException -> 0x05e2 }
            java.lang.Object r1 = r1.get()     // Catch:{ IOException -> 0x05e2 }
            X.5My r1 = (X.C103435My) r1     // Catch:{ IOException -> 0x05e2 }
            java.io.File r5 = r1.A00()     // Catch:{ IOException -> 0x05e2 }
            java.lang.String r2 = r15.getName()     // Catch:{ IOException -> 0x05e2 }
            java.lang.String r1 = "chatlock_backup.bkup"
            int r1 = X.C06550Ye.A01(r2, r1)     // Catch:{ IOException -> 0x05e2 }
            if (r1 <= 0) goto L_0x05dd
            X.22O r13 = X.AnonymousClass22O.A02(r1)     // Catch:{ IOException -> 0x05e2 }
            if (r13 == 0) goto L_0x05dd
        L_0x05be:
            X.34i r14 = r0.A05     // Catch:{ IOException -> 0x05e2 }
            X.2sr r6 = r0.A00     // Catch:{ IOException -> 0x05e2 }
            X.2f0 r10 = r0.A03     // Catch:{ IOException -> 0x05e2 }
            X.0WN r8 = r0.A01     // Catch:{ IOException -> 0x05e2 }
            X.2s6 r9 = r0.A01     // Catch:{ IOException -> 0x05e2 }
            X.2fR r12 = r0.A04     // Catch:{ IOException -> 0x05e2 }
            X.2eK r11 = r0.A04     // Catch:{ IOException -> 0x05e2 }
            r7 = 0
            r16 = r7
            X.0UR r2 = X.AnonymousClass0S7.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ IOException -> 0x05e2 }
            X.2oU r3 = r0.A02     // Catch:{ IOException -> 0x05e2 }
            r6 = 0
            r8 = r6
            r4 = r7
            r7 = r6
            r2.A04(r3, r4, r5, r6, r7, r8)     // Catch:{ IOException -> 0x05e2 }
            goto L_0x05e0
        L_0x05dd:
            X.22O r13 = X.AnonymousClass22O.UNENCRYPTED     // Catch:{ IOException -> 0x05e2 }
            goto L_0x05be
        L_0x05e0:
            r1 = 1
            return r1
        L_0x05e2:
            r1 = move-exception
            java.lang.String r0 = "ChatLockBackup/restore failed"
            goto L_0x05e9
        L_0x05e6:
            r1 = move-exception
            java.lang.String r0 = "WaDatabaseBackupProducer/restore copy backup tables failed"
        L_0x05e9:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x05ec:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56772sX.A0F(android.content.Context, java.io.File):boolean");
    }

    public C56772sX(C42822Pq r2) {
        this.A03 = r2;
        this.A02 = r2.A02;
        this.A01 = r2.A01;
        this.A00 = r2.A00;
        this.A04 = r2.A03;
    }

    public final long A04(File file) {
        File file2;
        ArrayList A09 = A09(file);
        if (!AnonymousClass0x7.A1S(A09) || (file2 = (File) C73723fy.A05(A09)) == null) {
            return 0;
        }
        return file2.length();
    }
}
