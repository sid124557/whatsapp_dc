package X;

import com.whatsapp.R;
import com.whatsapp.migration.android.integration.service.GoogleMigrateService;
import com.whatsapp.util.Log;

/* renamed from: X.3Qw  reason: invalid class name and case insensitive filesystem */
public class C67843Qw implements AnonymousClass4FM {
    public final /* synthetic */ GoogleMigrateService A00;

    public C67843Qw(GoogleMigrateService googleMigrateService) {
        this.A00 = googleMigrateService;
    }

    public void BOS() {
        C52572lh r2 = this.A00.A04;
        Log.i("GoogleMigrateNotificationManager/onCancellationComplete()");
        r2.A02(C54292oU.A00(r2.A00).getString(R.string.f11nameremoved), (String) null, -1, true, true);
    }

    public void BOT() {
        C52572lh r2 = this.A00.A04;
        Log.i("GoogleMigrateNotificationManager/onCancelling()");
        r2.A02(C54292oU.A00(r2.A00).getString(R.string.f11nameremoved), (String) null, -1, false, false);
    }

    public void BUS() {
        this.A00.A04.A01(0);
    }

    public void BYh(int i) {
        if (i != 301 && i != 104 && i != 101) {
            this.A00.A04.A01(0);
        }
    }

    public void BYi() {
        C52572lh r2 = this.A00.A04;
        r2.A02(C54292oU.A00(r2.A00).getString(R.string.f11nameremoved), (String) null, -1, true, false);
    }

    public void BPU(boolean z) {
        C18260x0.A1E("GoogleMigrateService/onComplete/success = ", AnonymousClass001.A0o(), z);
        if (z) {
            GoogleMigrateService googleMigrateService = this.A00;
            C52572lh r3 = googleMigrateService.A04;
            Log.i("GoogleMigrateNotificationManager/onComplete()");
            r3.A02(C54292oU.A00(r3.A00).getString(R.string.f11nameremoved), (String) null, -1, true, false);
            Log.i("GoogleMigrateService/onComplete/sent import complete logging");
            googleMigrateService.A05.A03("google_migrate_import_complete", "google_migrate_import_complete_next");
        }
    }

    public void BYz(int i) {
        C18260x0.A0y("GoogleMigrateService/onProgress; progress=", AnonymousClass001.A0o(), i);
        this.A00.A04.A01(i);
    }

    public void onError(int i) {
        C18260x0.A0y("GoogleMigrateService/onError/errorCode = ", AnonymousClass001.A0o(), i);
        C52572lh r3 = this.A00.A04;
        C54292oU r2 = r3.A00;
        r3.A02(C54292oU.A00(r2).getString(R.string.f11nameremoved), C54292oU.A00(r2).getString(R.string.f11nameremoved), -1, true, false);
    }
}
