package X;

import android.content.SharedPreferences;
import com.whatsapp.registration.accountdefence.AccountDefenceFetchDeviceConfirmationPoller;
import com.whatsapp.util.Log;

/* renamed from: X.2hq  reason: invalid class name and case insensitive filesystem */
public class C50232hq {
    public final C620633i A00;
    public final C56612sH A01;
    public final C54292oU A02;
    public final AnonymousClass33p A03;
    public final C56912sl A04;
    public final AccountDefenceFetchDeviceConfirmationPoller A05;
    public final C104005Pg A06;
    public final AnonymousClass4FS A07;

    public void A00() {
        Log.i("AccountDefenceDataManager/resetRegistration");
        Log.i("AccountDefenceDataManager/stopFetchingDeviceConfirmation");
        this.A05.A00();
        C104005Pg r1 = this.A06;
        Log.i("AccountDefenceLocalDataRepository/clearAllData");
        SharedPreferences.Editor A002 = C60152y5.A00(r1.A01, "AccountDefenceLocalDataRepository_prefs");
        A002.clear();
        if (!A002.commit()) {
            Log.e("AccountDefenceLocalDataRepository/clearAllData/error");
        }
    }

    public void A01(AnonymousClass4DZ r6, String str, String str2) {
        Log.i("AccountDefenceDataManager/startFetchingDeviceConfirmation");
        AnonymousClass7LJ r3 = new AnonymousClass7LJ(r6, str, str2);
        AccountDefenceFetchDeviceConfirmationPoller accountDefenceFetchDeviceConfirmationPoller = this.A05;
        synchronized (accountDefenceFetchDeviceConfirmationPoller) {
            Log.i("FetchDeviceConfirmationPoller/onRequestComplete/startPolling");
            if (accountDefenceFetchDeviceConfirmationPoller.A01 == null) {
                accountDefenceFetchDeviceConfirmationPoller.A01 = C72173dI.A00(accountDefenceFetchDeviceConfirmationPoller.A07);
            }
            accountDefenceFetchDeviceConfirmationPoller.A08.set(false);
            accountDefenceFetchDeviceConfirmationPoller.A00 = System.currentTimeMillis();
            accountDefenceFetchDeviceConfirmationPoller.A01.execute(new C70143a1(accountDefenceFetchDeviceConfirmationPoller, 15, r3));
        }
    }

    public C50232hq(C620633i r1, C56612sH r2, C54292oU r3, AnonymousClass33p r4, C56912sl r5, AccountDefenceFetchDeviceConfirmationPoller accountDefenceFetchDeviceConfirmationPoller, C104005Pg r7, AnonymousClass4FS r8) {
        this.A01 = r2;
        this.A02 = r3;
        this.A07 = r8;
        this.A00 = r1;
        this.A06 = r7;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = accountDefenceFetchDeviceConfirmationPoller;
    }
}
