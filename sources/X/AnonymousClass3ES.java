package X;

import com.whatsapp.R;
import com.whatsapp.bonsai.waitlist.BonsaiWaitlistJoinBottomSheet;

/* renamed from: X.3ES  reason: invalid class name */
public final class AnonymousClass3ES implements AnonymousClass4CU {
    public final /* synthetic */ BonsaiWaitlistJoinBottomSheet A00;

    public AnonymousClass3ES(BonsaiWaitlistJoinBottomSheet bonsaiWaitlistJoinBottomSheet) {
        this.A00 = bonsaiWaitlistJoinBottomSheet;
    }

    public void BSk() {
        BonsaiWaitlistJoinBottomSheet bonsaiWaitlistJoinBottomSheet = this.A00;
        C69263Wi r0 = bonsaiWaitlistJoinBottomSheet.A00;
        if (r0 != null) {
            r0.A0D();
            C69263Wi r2 = bonsaiWaitlistJoinBottomSheet.A00;
            if (r2 != null) {
                r2.A0H(R.string.f11nameremoved, 0);
                return;
            }
            throw C18270x1.A0S("globalUI");
        }
        throw C18270x1.A0S("globalUI");
    }

    public void onSuccess() {
        BonsaiWaitlistJoinBottomSheet bonsaiWaitlistJoinBottomSheet = this.A00;
        C69263Wi r0 = bonsaiWaitlistJoinBottomSheet.A00;
        if (r0 != null) {
            r0.A0D();
            bonsaiWaitlistJoinBottomSheet.A1L();
            AnonymousClass4GP r02 = bonsaiWaitlistJoinBottomSheet.A04;
            if (r02 != null) {
                r02.invoke();
                return;
            }
            return;
        }
        throw C18270x1.A0S("globalUI");
    }
}
