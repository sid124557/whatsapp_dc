package X;

import android.content.Intent;
import com.whatsapp.datasharingdisclosure.ui.ConsumerDisclosureActivity;
import com.whatsapp.datasharingdisclosure.ui.ConsumerDisclosureViewModel;

/* renamed from: X.3L5  reason: invalid class name */
public final class AnonymousClass3L5 implements C84514Cq {
    public final /* synthetic */ ConsumerDisclosureActivity A00;

    public AnonymousClass3L5(ConsumerDisclosureActivity consumerDisclosureActivity) {
        this.A00 = consumerDisclosureActivity;
    }

    public void BLw() {
        ConsumerDisclosureActivity consumerDisclosureActivity = this.A00;
        ((ConsumerDisclosureViewModel) consumerDisclosureActivity.A02.getValue()).A0D((C95814uZ) null, (Boolean) null);
        C58272uz r0 = consumerDisclosureActivity.A00;
        if (r0 != null) {
            AnonymousClass4FV r2 = r0.A00;
            AnonymousClass1YF r1 = new AnonymousClass1YF();
            Integer A0f = AnonymousClass001.A0f();
            r1.A01 = A0f;
            r1.A00 = A0f;
            r1.A02 = AnonymousClass0x2.A0U();
            r2.BhD(r1);
            Intent intent = (Intent) consumerDisclosureActivity.getIntent().getParcelableExtra("extra_next_intent");
            if (intent != null) {
                consumerDisclosureActivity.startActivity(intent);
            }
            consumerDisclosureActivity.finish();
            return;
        }
        throw C18270x1.A0S("dataSharingCtwaDisclosureLogger");
    }

    public void BOQ() {
        ConsumerDisclosureActivity consumerDisclosureActivity = this.A00;
        C58272uz r0 = consumerDisclosureActivity.A00;
        if (r0 != null) {
            AnonymousClass4FV r2 = r0.A00;
            AnonymousClass1YF r1 = new AnonymousClass1YF();
            r1.A01 = AnonymousClass001.A0f();
            AnonymousClass1YF.A00(r2, r1, 2);
            consumerDisclosureActivity.finishAndRemoveTask();
            return;
        }
        throw C18270x1.A0S("dataSharingCtwaDisclosureLogger");
    }
}
