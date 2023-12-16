package X;

import android.os.Bundle;
import com.whatsapp.privacy.disclosure.ui.PrivacyDisclosureContainerActivity;
import com.whatsapp.privacy.disclosure.ui.PrivacyDisclosureContainerViewModel;
import java.util.ArrayList;

/* renamed from: X.4Kh  reason: invalid class name and case insensitive filesystem */
public class C86484Kh implements C15900s9 {
    public Object A00;
    public final int A01;

    public C86484Kh(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BTp(String str, Bundle bundle) {
        AnonymousClass66R r4;
        int i;
        switch (this.A01) {
            case 0:
                ((AnonymousClass4GP) this.A00).invoke();
                return;
            case 1:
                AnonymousClass4GQ r1 = (AnonymousClass4GQ) this.A00;
                C162457s7.A0J(bundle, 2);
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("AddMembersSuccessJidList");
                if (parcelableArrayList != null) {
                    r1.invoke(parcelableArrayList);
                    return;
                }
                return;
            default:
                PrivacyDisclosureContainerActivity privacyDisclosureContainerActivity = (PrivacyDisclosureContainerActivity) this.A00;
                C162457s7.A0J(bundle, 2);
                String string = bundle.getString("result", (String) null);
                C162457s7.A0D(string);
                int ordinal = AnonymousClass58Y.valueOf(string).ordinal();
                if (ordinal == 0) {
                    r4 = privacyDisclosureContainerActivity.A02;
                    PrivacyDisclosureContainerViewModel privacyDisclosureContainerViewModel = (PrivacyDisclosureContainerViewModel) r4.getValue();
                    int i2 = privacyDisclosureContainerViewModel.A00 + 1;
                    privacyDisclosureContainerViewModel.A00 = i2;
                    C18260x0.A0w("PrivacyDisclosureContainerViewModel: nextPrompt: newIndex=", AnonymousClass001.A0o(), i2);
                    i = 5;
                } else if (ordinal == 1) {
                    r4 = privacyDisclosureContainerActivity.A02;
                    PrivacyDisclosureContainerViewModel privacyDisclosureContainerViewModel2 = (PrivacyDisclosureContainerViewModel) r4.getValue();
                    int i3 = privacyDisclosureContainerViewModel2.A00 + 1;
                    privacyDisclosureContainerViewModel2.A00 = i3;
                    C18260x0.A0w("PrivacyDisclosureContainerViewModel: nextPrompt: newIndex=", AnonymousClass001.A0o(), i3);
                    i = 155;
                } else if (ordinal != 3) {
                    if (ordinal == 2) {
                        ((PrivacyDisclosureContainerViewModel) privacyDisclosureContainerActivity.A02.getValue()).A0D(165);
                    } else if (ordinal != 4) {
                        return;
                    }
                    privacyDisclosureContainerActivity.finish();
                    return;
                } else {
                    r4 = privacyDisclosureContainerActivity.A02;
                    PrivacyDisclosureContainerViewModel privacyDisclosureContainerViewModel3 = (PrivacyDisclosureContainerViewModel) r4.getValue();
                    int i4 = privacyDisclosureContainerViewModel3.A00 - 1;
                    privacyDisclosureContainerViewModel3.A00 = i4;
                    C18260x0.A0w("PrivacyDisclosureContainerViewModel: previousPrompt: newIndex=", AnonymousClass001.A0o(), i4);
                    i = 145;
                }
                if (!privacyDisclosureContainerActivity.A6l()) {
                    ((PrivacyDisclosureContainerViewModel) r4.getValue()).A0D(i);
                    privacyDisclosureContainerActivity.finish();
                    return;
                }
                return;
        }
    }
}
