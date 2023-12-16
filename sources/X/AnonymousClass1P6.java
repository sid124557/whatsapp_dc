package X;

import com.whatsapp.R;
import com.whatsapp.phonematching.CountryAndPhoneNumberFragment;

/* renamed from: X.1P6  reason: invalid class name */
public class AnonymousClass1P6 extends C151457Uw {
    public final /* synthetic */ CountryAndPhoneNumberFragment A00;

    public AnonymousClass1P6(CountryAndPhoneNumberFragment countryAndPhoneNumberFragment) {
        this.A00 = countryAndPhoneNumberFragment;
    }

    public void A01(String str, String str2) {
        boolean z;
        boolean equals = str.equals("");
        CountryAndPhoneNumberFragment countryAndPhoneNumberFragment = this.A00;
        if (equals) {
            countryAndPhoneNumberFragment.A06.setText(R.string.f11nameremoved);
        } else if (str2 == null) {
            countryAndPhoneNumberFragment.A06.setText(R.string.f11nameremoved);
            z = true;
            countryAndPhoneNumberFragment.A1L(z);
        } else {
            countryAndPhoneNumberFragment.A06.setText(countryAndPhoneNumberFragment.A0E.A02(countryAndPhoneNumberFragment.A0C, str2));
        }
        z = false;
        countryAndPhoneNumberFragment.A1L(z);
    }
}
