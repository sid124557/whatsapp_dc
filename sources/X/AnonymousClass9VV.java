package X;

import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.9VV  reason: invalid class name */
public class AnonymousClass9VV {
    public C28251fy A00;
    public C193519Oy A01;
    public final C64393Dh A02;
    public final C66663Mh A03;
    public final C56492s4 A04;
    public final C56612sH A05;
    public final C54292oU A06;
    public final C61072zf A07;
    public final AnonymousClass1VX A08;
    public final C55002pd A09;
    public final C620933l A0A;
    public final C29011i8 A0B;

    public static C193519Oy A00(byte[] bArr, long j) {
        String str;
        long j2;
        try {
            AnonymousClass1EU A002 = AnonymousClass1EU.A00(bArr);
            if ((A002.bitField0_ & 64) != 0) {
                AnonymousClass1EB r2 = A002.documentMessage_;
                if (r2 == null) {
                    r2 = AnonymousClass1EB.DEFAULT_INSTANCE;
                }
                if ((r2.bitField0_ & 1) != 0) {
                    str = r2.url_;
                    if (TextUtils.isEmpty(str)) {
                        Log.e("dyiReportManager/create-report-info failed : url is empty");
                        return null;
                    } else if (!"https".equalsIgnoreCase(Uri.parse(str).getScheme())) {
                        C18260x0.A0r("dyiReportManager/create-report-info failed : invalid scheme; url =", str, AnonymousClass001.A0o());
                        return null;
                    }
                } else {
                    str = null;
                }
                if ((r2.bitField0_ & 16) != 0) {
                    j2 = r2.fileLength_;
                } else {
                    j2 = 0;
                }
                return new C193519Oy(j2, str, j);
            }
            Log.e("dyiReportManager/create-report-info failed : invalid e2eMessage -> no document message found");
            return null;
        } catch (AnonymousClass6u5 e) {
            Log.e("dyiReportManager/create-report-info", e);
            return null;
        }
    }

    public synchronized int A01(String str) {
        SharedPreferences A032;
        String str2;
        A032 = this.A0A.A03();
        if ("personal".equals(str)) {
            str2 = "payment_dyi_report_state";
        } else {
            str2 = "business_payment_dyi_report_state";
        }
        return A032.getInt(str2, -1);
    }

    public synchronized C193519Oy A02(String str) {
        byte[] A0K;
        String str2;
        String str3;
        if (this.A01 == null && (A0K = C627236i.A0K(A03(str))) != null) {
            C620933l r7 = this.A0A;
            SharedPreferences A032 = r7.A03();
            boolean equals = "personal".equals(str);
            if (equals) {
                str2 = "payment_dyi_report_timestamp";
            } else {
                str2 = "business_payment_dyi_report_timestamp";
            }
            long j = A032.getLong(str2, -1);
            SharedPreferences A033 = r7.A03();
            if (equals) {
                str3 = "payment_dyi_report_expiration_timestamp";
            } else {
                str3 = "business_payment_dyi_report_expiration_timestamp";
            }
            A033.getLong(str3, -1);
            this.A01 = A00(A0K, j);
        }
        return this.A01;
    }

    public synchronized void A04(String str) {
        Log.i("dyiReportManager/reset");
        this.A01 = null;
        File A032 = A03(str);
        if (A032.exists() && !A032.delete()) {
            Log.e("dyiReportManager/reset/failed-delete-report-info");
        }
        C64393Dh r2 = this.A02;
        File A0P = r2.A0P(str);
        if (A0P.exists() && !A0P.delete()) {
            Log.e("dyiReportManager/reset/failed-delete-report-file");
        }
        C627536m.A0E(r2.A0Q(str), 0);
        this.A0A.A0I(str);
    }

    public final File A03(String str) {
        String str2;
        File filesDir = this.A06.A00.getFilesDir();
        if ("personal".equals(str)) {
            str2 = "dyi.info";
        } else {
            str2 = "business_dyi.info";
        }
        return new File(filesDir, str2);
    }

    public AnonymousClass9VV(C64393Dh r1, C66663Mh r2, C56492s4 r3, C56612sH r4, C54292oU r5, C61072zf r6, AnonymousClass1VX r7, C55002pd r8, C620933l r9, C29011i8 r10) {
        this.A05 = r4;
        this.A08 = r7;
        this.A06 = r5;
        this.A04 = r3;
        this.A02 = r1;
        this.A03 = r2;
        this.A07 = r6;
        this.A0B = r10;
        this.A0A = r9;
        this.A09 = r8;
    }
}
