package X;

import com.whatsapp.R;
import com.whatsapp.status.audienceselector.StatusPrivacyActivity;

/* renamed from: X.5ql  reason: invalid class name and case insensitive filesystem */
public final class C116725ql implements AnonymousClass66O {
    public final /* synthetic */ StatusPrivacyActivity A00;

    public C116725ql(StatusPrivacyActivity statusPrivacyActivity) {
        this.A00 = statusPrivacyActivity;
    }

    public void BSw(C1000759i r8, Integer num, Integer num2) {
        StatusPrivacyActivity statusPrivacyActivity = this.A00;
        statusPrivacyActivity.A75().A02(statusPrivacyActivity, r8, num, num2, "status_privacy_activity", true);
    }

    public void onSuccess() {
        StatusPrivacyActivity statusPrivacyActivity = this.A00;
        AnonymousClass5YA.A00(statusPrivacyActivity.A75()).A01((C109665ez) null, "status_privacy_activity", R.string.f11nameremoved, 0, true);
        statusPrivacyActivity.A05.BkS(new C71573cK(statusPrivacyActivity, 2, (Object) null));
        C71293bs.A00(statusPrivacyActivity.A04, statusPrivacyActivity, 43);
    }
}
