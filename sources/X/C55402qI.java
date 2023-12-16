package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: X.2qI  reason: invalid class name and case insensitive filesystem */
public class C55402qI {
    public C165887xn A00;
    public final C64393Dh A01;
    public final C56612sH A02;
    public final AnonymousClass33p A03;
    public final C28131fk A04;

    public synchronized int A00() {
        return C18280x3.A02(AnonymousClass0x2.A0F(this.A03), "business_activity_report_state");
    }

    public synchronized void A02() {
        Log.i("BusinessActivityReportManager/reset");
        this.A00 = null;
        C64393Dh r2 = this.A01;
        File A09 = r2.A09();
        if (A09.exists() && !A09.delete()) {
            Log.e("BusinessActivityReportManager/reset/failed-delete-report-file");
        }
        C627536m.A0E(C64393Dh.A02(C54292oU.A02(r2.A01), "export_business_activity"), 0);
        this.A03.A0s();
    }

    public synchronized void A03(C165887xn r6) {
        this.A00 = r6;
        AnonymousClass33p r3 = this.A03;
        C18270x1.A0j(C18270x1.A03(r3), "business_activity_report_url", r6.A08);
        C18270x1.A0j(C18270x1.A03(r3), "business_activity_report_name", r6.A06);
        C18270x1.A0i(C18270x1.A03(r3), "business_activity_report_size", r6.A02);
        C18270x1.A0i(C18270x1.A03(r3), "business_activity_report_expiration_timestamp", r6.A01);
        C18270x1.A0j(C18270x1.A03(r3), "business_activity_report_direct_url", r6.A03);
        C18270x1.A0j(C18270x1.A03(r3), "business_activity_report_media_key", r6.A07);
        C18270x1.A0j(C18270x1.A03(r3), "business_activity_report_file_sha", r6.A05);
        C18270x1.A0j(C18270x1.A03(r3), "business_activity_report_file_enc_sha", r6.A04);
        C18260x0.A0M(r3, "business_activity_report_timestamp", r6.A00);
        C18270x1.A0h(C18270x1.A03(r3), "business_activity_report_state", 2);
    }

    public synchronized void A04(AnonymousClass66E r7, String str) {
        FileOutputStream A0h;
        C64393Dh r4 = this.A01;
        C54292oU r5 = r4.A01;
        C627536m.A0E(C64393Dh.A02(C54292oU.A02(r5), "export_business_activity"), 0);
        File A09 = r4.A09();
        File A05 = C64393Dh.A05(C64393Dh.A02(C54292oU.A02(r5), "export_business_activity"), ".zip", AnonymousClass000.A0l(str));
        try {
            FileInputStream A0g = AnonymousClass0x9.A0g(A09);
            try {
                A0h = AnonymousClass0x9.A0h(A05);
                C627536m.A0I(A0g, A0h);
                A0h.close();
                A0g.close();
                if (!A05.setLastModified(this.A02.A0H())) {
                    Log.e("BusinessActivityReportManager/prepare-report-for-export/failed to update report file");
                    r7.BRy();
                } else {
                    r7.BZT(str);
                }
            } catch (Throwable th) {
                A0g.close();
                throw th;
            }
        } catch (IOException e) {
            Log.e("BusinessActivityReportManager/prepare-report-for-export/can't prepare report file", e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        return;
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0079, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized X.C165887xn A01() {
        /*
            r19 = this;
            r1 = r19
            monitor-enter(r1)
            X.7xn r6 = r1.A00     // Catch:{ all -> 0x007a }
            if (r6 != 0) goto L_0x0078
            X.33p r6 = r1.A03     // Catch:{ all -> 0x007a }
            X.8qC r0 = r6.A01     // Catch:{ all -> 0x007a }
            android.content.SharedPreferences r4 = X.C18300x5.A0B(r0)     // Catch:{ all -> 0x007a }
            java.lang.String r2 = "business_activity_report_url"
            r3 = 0
            java.lang.String r7 = r4.getString(r2, r3)     // Catch:{ all -> 0x007a }
            boolean r2 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x007a }
            if (r2 == 0) goto L_0x001e
            monitor-exit(r1)
            return r3
        L_0x001e:
            android.content.SharedPreferences r5 = X.C18300x5.A0B(r0)     // Catch:{ all -> 0x007a }
            java.lang.String r4 = "business_activity_report_size"
            r2 = 0
            long r13 = r5.getLong(r4, r2)     // Catch:{ all -> 0x007a }
            java.lang.String r5 = "business_activity_report_timestamp"
            android.content.SharedPreferences r4 = X.AnonymousClass0x2.A0F(r6)     // Catch:{ all -> 0x007a }
            long r15 = X.AnonymousClass0x2.A0A(r4, r5)     // Catch:{ all -> 0x007a }
            android.content.SharedPreferences r5 = X.C18300x5.A0B(r0)     // Catch:{ all -> 0x007a }
            java.lang.String r4 = "business_activity_report_expiration_timestamp"
            long r17 = r5.getLong(r4, r2)     // Catch:{ all -> 0x007a }
            android.content.SharedPreferences r4 = X.C18300x5.A0B(r0)     // Catch:{ all -> 0x007a }
            java.lang.String r2 = "business_activity_report_direct_url"
            r3 = 0
            java.lang.String r8 = r4.getString(r2, r3)     // Catch:{ all -> 0x007a }
            android.content.SharedPreferences r4 = X.C18300x5.A0B(r0)     // Catch:{ all -> 0x007a }
            java.lang.String r2 = "business_activity_report_name"
            java.lang.String r9 = r4.getString(r2, r3)     // Catch:{ all -> 0x007a }
            android.content.SharedPreferences r4 = X.C18300x5.A0B(r0)     // Catch:{ all -> 0x007a }
            java.lang.String r2 = "business_activity_report_media_key"
            java.lang.String r10 = r4.getString(r2, r3)     // Catch:{ all -> 0x007a }
            android.content.SharedPreferences r4 = X.C18300x5.A0B(r0)     // Catch:{ all -> 0x007a }
            java.lang.String r2 = "business_activity_report_file_sha"
            java.lang.String r11 = r4.getString(r2, r3)     // Catch:{ all -> 0x007a }
            android.content.SharedPreferences r2 = X.C18300x5.A0B(r0)     // Catch:{ all -> 0x007a }
            java.lang.String r0 = "business_activity_report_file_enc_sha"
            java.lang.String r12 = r2.getString(r0, r3)     // Catch:{ all -> 0x007a }
            X.7xn r6 = new X.7xn     // Catch:{ all -> 0x007a }
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r15, r17)     // Catch:{ all -> 0x007a }
            r1.A00 = r6     // Catch:{ all -> 0x007a }
        L_0x0078:
            monitor-exit(r1)
            return r6
        L_0x007a:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55402qI.A01():X.7xn");
    }

    public C55402qI(C64393Dh r1, C56612sH r2, AnonymousClass33p r3, C28131fk r4) {
        this.A02 = r2;
        this.A01 = r1;
        this.A04 = r4;
        this.A03 = r3;
    }
}
