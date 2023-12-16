package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.Date;
import java.util.Random;

/* renamed from: X.30N  reason: invalid class name */
public class AnonymousClass30N {
    public SharedPreferences A00;
    public final C56612sH A01;
    public final C60152y5 A02;

    public synchronized long A02() {
        return AnonymousClass0x2.A0B(A00(this), "start_time_ms");
    }

    public synchronized long A03(Random random) {
        long A022;
        A022 = A02();
        if (A022 == 0) {
            A022 = this.A01.A0H() - ((long) random.nextInt(86400000));
            A05(A022);
        }
        return A022;
    }

    public synchronized void A05(long j) {
        C18270x1.A0i(A00(this).edit(), "start_time_ms", j);
        C18260x0.A10("WamThreadIdManager/setStartTimeMs/", AnonymousClass001.A0o(), j);
    }

    public synchronized byte[] A06(Random random) {
        SharedPreferences A002;
        A002 = A00(this);
        if (!A002.contains("thread_user_secret")) {
            byte[] bArr = new byte[32];
            random.nextBytes(bArr);
            C18270x1.A0j(A00(this).edit(), "thread_user_secret", C18290x4.A0t(bArr));
        }
        return AnonymousClass0x7.A1X(AnonymousClass0x9.A0v(A002, "thread_user_secret"));
    }

    public static SharedPreferences A00(AnonymousClass30N r2) {
        String str;
        SharedPreferences sharedPreferences = r2.A00;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        C60152y5 r1 = r2.A02;
        if (r2 instanceof C26161bg) {
            str = "bizIntegrityTelemetry";
        } else {
            str = "chatCounts";
        }
        SharedPreferences A03 = r1.A03(str);
        r2.A00 = A03;
        return A03;
    }

    public AnonymousClass30N(C56612sH r1, C60152y5 r2) {
        this.A01 = r1;
        this.A02 = r2;
    }

    public static final String A01(byte[] bArr, String str) {
        byte[] bArr2;
        try {
            bArr2 = C380825n.A00(new String(str.getBytes(), C58152un.A0D).getBytes(), bArr);
        } catch (Exception e) {
            Log.e("WamThreadIdManager/computeHash failed to compute hmac", e);
            bArr2 = null;
        }
        if (bArr2 != null) {
            return C18290x4.A0t(bArr2);
        }
        return null;
    }

    public String A04(String str) {
        return A01(A06(AnonymousClass0x9.A1C()), AnonymousClass000.A0T(str, AnonymousClass0x7.A0u("yyyy/MM/dd").format(new Date(A03(AnonymousClass0x9.A1C()) - 28800000))));
    }
}
