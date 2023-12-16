package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.util.Locale;

/* renamed from: X.0hi  reason: invalid class name and case insensitive filesystem */
public class C10300hi implements C836849j {
    public final C66663Mh A00;
    public final AnonymousClass0WN A01;
    public final C54292oU A02;
    public final AnonymousClass33p A03;

    public void BYP(C134256ih r12) {
        long j;
        int i;
        int i2;
        Context A06 = this.A02.A06();
        r12.A0K = Boolean.valueOf(C159787mS.A01(A06));
        r12.A0w = Long.valueOf(AnonymousClass345.A00(A06, "com.google.android.gms"));
        r12.A02 = Boolean.valueOf(this.A00.A08(C66663Mh.A0P));
        r12.A01 = Boolean.valueOf(AnonymousClass0YV.A0F(A06));
        if (this.A01.A0G()) {
            j = 1;
        } else {
            j = 0;
        }
        r12.A0m = Long.valueOf(j);
        AnonymousClass33p r7 = this.A03;
        int A05 = r7.A05();
        if (A05 == 0) {
            i = 0;
        } else if (A05 != 1) {
            int i3 = 2;
            if (A05 != 2) {
                i3 = 3;
                if (A05 != 3) {
                    i3 = 4;
                    if (A05 != 4) {
                        Log.e(AnonymousClass000.A0Y("alarm-service/update-expensive-fieldstats/gdrive-backup/unexpected-frequency/", AnonymousClass001.A0o(), A05));
                        i = Integer.valueOf(A05);
                    }
                }
            }
            i = Integer.valueOf(i3);
        } else {
            i = 1;
        }
        r12.A0c = i;
        String A0X = r7.A0X();
        if (A0X != null) {
            long A0R = r7.A0R(A0X);
            if (!(A0R == 0 || A0R == -1)) {
                Locale locale = Locale.ENGLISH;
                Long valueOf = Long.valueOf(A0R);
                Log.i(String.format(locale, "alarm-service/update-expensive-fieldstats/last-backup-timestamp/%d", new Object[]{valueOf}));
                r12.A10 = valueOf;
            }
            int A062 = r7.A06();
            if (A062 == 0) {
                i2 = 0;
            } else if (A062 != 1) {
                Log.e(AnonymousClass000.A0Y("alarm-service/update-expensive-fieldstats/gdrive-backup/unexpected-network-setting/", AnonymousClass001.A0o(), A062));
                i2 = Integer.valueOf(A062);
            } else {
                i2 = 1;
            }
            r12.A0b = i2;
        }
    }

    public C10300hi(C66663Mh r1, AnonymousClass0WN r2, C54292oU r3, AnonymousClass33p r4) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
    }
}
