package X;

import android.app.Activity;
import android.content.SharedPreferences;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.5X2  reason: invalid class name */
public class AnonymousClass5X2 {
    public final C69263Wi A00;
    public final C56612sH A01;
    public final C50232hq A02;

    public void A01(long j, long j2) {
        C104005Pg r2 = this.A02.A06;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AccountDefenceLocalDataRepository/save-original-wait-time-diffs ");
        A0o.append(j);
        C18260x0.A12(", ", A0o, j2);
        SharedPreferences.Editor A002 = C60152y5.A00(r2.A01, "AccountDefenceLocalDataRepository_prefs");
        A002.putLong("com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_original_sms_wait_time", j);
        A002.putLong("com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_original_voice_wait_time", j2);
        if (!A002.commit()) {
            Log.e("AccountDefenceLocalDataRepository/save-original-wait-time-diffs/error");
        }
    }

    public AnonymousClass5X2(C69263Wi r1, C56612sH r2, C50232hq r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public CharSequence A00(Activity activity, String str, int i) {
        int i2;
        String A0X;
        C18260x0.A0y("AccountDefenceSecondCodeViewPresenter/getAccountDefenceTopDescription for state:", AnonymousClass001.A0o(), i);
        if (i == 1 || i == 2) {
            i2 = R.string.f11nameremoved;
            A0X = AnonymousClass0x2.A0X(activity, str, 1, i2);
        } else if (i != 3) {
            A0X = activity.getString(R.string.f11nameremoved);
        } else {
            i2 = R.string.f11nameremoved;
            A0X = AnonymousClass0x2.A0X(activity, str, 1, i2);
        }
        return C57002su.A01(new C70033Zp(activity, 19), A0X, "learn-more");
    }
}
