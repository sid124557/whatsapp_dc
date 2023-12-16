package X;

import android.content.Intent;
import android.net.Uri;
import com.whatsapp.languageselector.LanguageSelectorBottomSheet;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment;

/* renamed from: X.9bB  reason: invalid class name and case insensitive filesystem */
public class C196589bB implements AnonymousClass65J {
    public final /* synthetic */ LanguageSelectorBottomSheet A00;
    public final /* synthetic */ IndiaUpiPaymentSettingsFragment A01;

    public C196589bB(LanguageSelectorBottomSheet languageSelectorBottomSheet, IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment) {
        this.A01 = indiaUpiPaymentSettingsFragment;
        this.A00 = languageSelectorBottomSheet;
    }

    public void BQ5(String str) {
        this.A00.A1K();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("https://youtu.be/");
        IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = this.A01;
        indiaUpiPaymentSettingsFragment.A0m(new Intent("android.intent.action.VIEW", Uri.parse(AnonymousClass000.A0X(indiaUpiPaymentSettingsFragment.A1n(str), A0o))));
    }
}
