package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5Z4  reason: invalid class name */
public class AnonymousClass5Z4 {
    public static final int[] A03 = {1, 2, 3};
    public final AnonymousClass5XU A00;
    public final C56612sH A01;
    public final AnonymousClass33p A02;

    public int A01() {
        AnonymousClass33p r9 = this.A02;
        long A0B = AnonymousClass0x2.A0B(AnonymousClass0x2.A0F(r9), "software_expiration_last_warned");
        long A0H = this.A01.A0H();
        if (A0B > A0H) {
            A0B = 0;
        }
        if (86400000 + A0B > A0H) {
            Log.i("software/expiration/suppress/24h");
        } else {
            Date A012 = this.A00.A01();
            int A002 = A00(A012, A0H);
            int A003 = A00(A012, A0B);
            int[] iArr = A03;
            int length = iArr.length;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                if (A002 > i2 || A003 <= i2) {
                    i++;
                } else {
                    C18260x0.A0M(r9, "software_expiration_last_warned", A0H);
                    return A002;
                }
            }
        }
        return -1;
    }

    public AnonymousClass5Z4(AnonymousClass5XU r1, C56612sH r2, AnonymousClass33p r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public static int A00(Date date, long j) {
        long time = date.getTime() - j;
        C18260x0.A10("software/expiration/ms ", AnonymousClass001.A0o(), time);
        int i = ((int) (time / 86400000)) + 1;
        C18260x0.A0w("software/expiration/days ", AnonymousClass001.A0o(), i);
        return i;
    }

    public void A02(long j) {
        SharedPreferences.Editor editor;
        if (1706416694000L >= j) {
            AnonymousClass33p r7 = this.A02;
            long j2 = AnonymousClass0x2.A0F(r7).getLong("client_expiration_time", 0);
            long A0H = this.A01.A0H() + TimeUnit.DAYS.toMillis(3);
            int i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
            if (i == 0 || (j < j2 && j2 > A0H)) {
                long max = Math.max(j, A0H);
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("wa-shared-prefs/set-client-expiration-time/");
                A0o.append(max);
                A0o.append(" ");
                SimpleDateFormat A0u = AnonymousClass0x7.A0u("yyyy-MM-dd");
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(max);
                C18260x0.A1L(A0o, A0u.format(instance.getTime()));
                editor = C18270x1.A03(r7).putLong("client_expiration_time", max);
            } else if (i > 0 && j == -1) {
                Log.i("wa-shared-prefs/clear-client-expiration-time");
                editor = C18270x1.A03(r7).remove("client_expiration_time");
            } else {
                return;
            }
            editor.apply();
        }
    }
}
