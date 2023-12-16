package X;

import android.content.Context;
import android.os.Environment;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.996  reason: invalid class name */
public class AnonymousClass996 extends C56772sX {
    public final C64393Dh A00;
    public final C56972sr A01;
    public final C56512s6 A02;
    public final C54292oU A03;
    public final AnonymousClass5ZR A04;
    public final C48502f0 A05;
    public final C55192px A06;
    public final AnonymousClass1VX A07;
    public final C194589Tn A08;
    public final C48772fR A09;
    public final C622634i A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (r11 == null) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0F(android.content.Context r15, java.io.File r16) {
        /*
            r14 = this;
            monitor-enter(r14)
            r13 = r16
            boolean r0 = r13.exists()     // Catch:{ all -> 0x006d }
            r3 = 1
            if (r0 != 0) goto L_0x0014
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x006d }
            java.lang.String r0 = "PaymentBackgroundsBackup/restore/backup-file-not-found "
            X.C18260x0.A1R(r1, r0, r13)     // Catch:{ all -> 0x006d }
            goto L_0x006b
        L_0x0014:
            X.3Dh r0 = r14.A00     // Catch:{ all -> 0x006d }
            java.io.File r4 = r0.A0F()     // Catch:{ all -> 0x006d }
            boolean r0 = r4.exists()     // Catch:{ all -> 0x006d }
            if (r0 != 0) goto L_0x002a
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x006d }
            java.lang.String r0 = "PaymentBackgroundsBackup/restore/failed to get internal payment backgrounds folder "
            X.C18260x0.A1Q(r1, r0, r4)     // Catch:{ all -> 0x006d }
            goto L_0x006b
        L_0x002a:
            r3 = 0
            java.lang.String r1 = r13.getName()     // Catch:{ Exception -> 0x0065 }
            java.lang.String r0 = "payment_backgrounds.backup"
            int r1 = X.C06550Ye.A01(r1, r0)     // Catch:{ Exception -> 0x0065 }
            if (r1 <= 0) goto L_0x0060
            X.22O r11 = X.AnonymousClass22O.CRYPT14     // Catch:{ Exception -> 0x0065 }
            int r0 = r11.version     // Catch:{ Exception -> 0x0065 }
            if (r1 < r0) goto L_0x0043
            X.22O r11 = X.AnonymousClass22O.A02(r1)     // Catch:{ Exception -> 0x0065 }
            if (r11 == 0) goto L_0x0060
        L_0x0043:
            X.34i r12 = r14.A0A     // Catch:{ Exception -> 0x0065 }
            X.2sr r5 = r14.A01     // Catch:{ Exception -> 0x0065 }
            X.2f0 r8 = r14.A05     // Catch:{ Exception -> 0x0065 }
            X.0WN r6 = r14.A01     // Catch:{ Exception -> 0x0065 }
            X.2s6 r7 = r14.A02     // Catch:{ Exception -> 0x0065 }
            X.2fR r10 = r14.A09     // Catch:{ Exception -> 0x0065 }
            X.2eK r9 = r14.A04     // Catch:{ Exception -> 0x0065 }
            X.0UR r2 = X.AnonymousClass0S7.A01(r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0065 }
            r1 = 2
            X.9pt r0 = new X.9pt     // Catch:{ Exception -> 0x0065 }
            r0.<init>(r4, r1)     // Catch:{ Exception -> 0x0065 }
            boolean r0 = r2.A08(r0, r3)     // Catch:{ Exception -> 0x0065 }
            goto L_0x0063
        L_0x0060:
            X.22O r11 = X.AnonymousClass22O.UNENCRYPTED     // Catch:{ Exception -> 0x0065 }
            goto L_0x0043
        L_0x0063:
            monitor-exit(r14)
            return r0
        L_0x0065:
            r1 = move-exception
            java.lang.String r0 = "PaymentBackgroundsBackup/restore failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x006d }
        L_0x006b:
            monitor-exit(r14)
            return r3
        L_0x006d:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass996.A0F(android.content.Context, java.io.File):boolean");
    }

    public C60882zK A06(AnonymousClass22O r19) {
        C17410vU A052;
        String str;
        if (!this.A07.A0X(1084)) {
            str = "PaymentBackgroundsBackup/backup/encrypted backgrounds not enabled";
        } else if (!this.A04.A0I(Environment.getExternalStorageState())) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("PaymentBackgroundsBackup/backup/sdcard_unavailable ");
            C18260x0.A1L(A0o, Environment.getExternalStorageState());
            return new C60882zK("payment-backgrounds");
        } else {
            C55192px r3 = this.A06;
            Log.i("PAY: PaymentBackgroundStore/getStoredPaymentBackgrounds");
            List A022 = r3.A02("SELECT payment_background.background_id, file_size, width, height, mime_type, placeholder_color, text_color, subtext_color, media_key, media_key_timestamp, file_sha256, file_enc_sha256, direct_path, fullsize_url, description, lg FROM payment_background", "payments/QUERY_PAYMENT_BACKGROUNDS");
            StringBuilder A0o2 = AnonymousClass001.A0o();
            AnonymousClass000.A1H("PAY: PaymentBackgroundStore/getStoredPaymentBackgrounds/result size=", A0o2, A022);
            C18280x3.A14(A0o2);
            if (A022.isEmpty()) {
                str = "PaymentBackgroundsBackup/backup no backgrounds to backup";
            } else {
                HashSet hashSet = new HashSet(A022.size());
                for (int i = 0; i < A022.size(); i++) {
                    AnonymousClass39R r4 = (AnonymousClass39R) A022.get(i);
                    File A023 = r4.A02(this.A08.A00.A0F());
                    if (!A023.exists()) {
                        StringBuilder A0o3 = AnonymousClass001.A0o();
                        A0o3.append("PaymentBackgroundsBackup/backup/file_not_found for:  ");
                        C18260x0.A1L(A0o3, r4.A0F);
                    } else {
                        hashSet.add(A023);
                    }
                }
                StringBuilder A0o4 = AnonymousClass001.A0o();
                A0o4.append("payment_backgrounds.backup.crypt");
                AnonymousClass22O r10 = r19;
                File file = new File(A07(r10), AnonymousClass000.A0h(A0o4, r10.version));
                Iterator it = A09(new File(A07(r10), AnonymousClass000.A0h(AnonymousClass000.A0l("payment_backgrounds.backup.crypt"), r10.version))).iterator();
                while (it.hasNext()) {
                    File file2 = (File) it.next();
                    if (!file2.equals(file) && file2.exists()) {
                        file2.delete();
                    }
                }
                if (hashSet.isEmpty()) {
                    str = "PaymentBackgroundsBackup/backup no background files found to backup";
                } else {
                    try {
                        C622634i r11 = this.A0A;
                        C56972sr r42 = this.A01;
                        C48502f0 r7 = this.A05;
                        A052 = AnonymousClass0S7.A01(r42, this.A01, this.A02, r7, this.A04, this.A09, r10, r11, file).A05(this.A03.A00);
                        if (A052 == null) {
                            Log.e("PaymentBackgroundsBackup/backup failed to create writer");
                            return new C60882zK("payment-backgrounds");
                        }
                        Iterator it2 = hashSet.iterator();
                        long j = 0;
                        while (it2.hasNext()) {
                            File file3 = (File) it2.next();
                            A052.Bsc(file3);
                            j += file3.length();
                        }
                        A052.close();
                        return new C60882zK(file, Long.valueOf(j), "payment-backgrounds", A04(A07(r10)), true);
                    } catch (Exception e) {
                        Log.e("sticker-db-storage/backup failed", e);
                        return new C60882zK("payment-backgrounds");
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            }
        }
        Log.i(str);
        return null;
        throw th;
    }

    public ArrayList A09(File file) {
        Log.d("PaymentBackgroundsBackup/getBackupFiles");
        List A0A2 = C06550Ye.A0A(AnonymousClass22O.CRYPT14);
        File file2 = new File(file, "payment_backgrounds.backup");
        ArrayList A092 = C06550Ye.A09(file2, A0A2);
        C06550Ye.A0M(file2, A092);
        return A092;
    }

    public boolean A0E(Context context, File file) {
        if (this.A07.A0X(1084)) {
            return super.A0E(context, file);
        }
        Log.i("PaymentBackgroundsBackup/restore/encrypted backgrounds not enabled");
        return true;
    }

    public AnonymousClass996(C64393Dh r1, C56972sr r2, C56512s6 r3, C54292oU r4, AnonymousClass5ZR r5, C48502f0 r6, C42822Pq r7, C55192px r8, AnonymousClass1VX r9, C194589Tn r10, C48772fR r11, C622634i r12) {
        super(r7);
        this.A07 = r9;
        this.A0A = r12;
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
        this.A05 = r6;
        this.A02 = r3;
        this.A04 = r5;
        this.A06 = r8;
        this.A09 = r11;
        this.A08 = r10;
    }

    public void A0C(C26041bU r2, double d) {
        r2.A0K = Double.valueOf(d);
    }

    public void A0D(C26041bU r2, double d) {
        r2.A0J = Double.valueOf(d);
    }

    public String A08() {
        return "payment-backgrounds";
    }
}
