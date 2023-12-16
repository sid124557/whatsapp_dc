package X;

import com.whatsapp.bonsai.onboarding.BonsaiOnboardingActivity;

/* renamed from: X.4TV  reason: invalid class name */
public final class AnonymousClass4TV extends AnonymousClass0Q4 {
    public final /* synthetic */ BonsaiOnboardingActivity A00;

    public AnonymousClass4TV(BonsaiOnboardingActivity bonsaiOnboardingActivity) {
        this.A00 = bonsaiOnboardingActivity;
    }

    public void A01(C08310eF r4, C08270df r5) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("bonsaionboarding/detached ");
        A0o.append(r4);
        A0o.append("; remaining=");
        C04760Qo r1 = r5.A0Y;
        C18260x0.A0m(r1.A05(), A0o);
        if (r1.A05().isEmpty()) {
            this.A00.finish();
        }
    }
}
