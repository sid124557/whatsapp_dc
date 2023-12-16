package com.whatsapp.newsletter.ui.delete;

import X.AnonymousClass043;
import X.AnonymousClass0x2;
import X.AnonymousClass4FN;
import X.AnonymousClass5V0;
import X.C003203q;
import X.C08310eF;
import X.C107195ar;
import X.C18290x4;
import X.C18300x5;
import X.C18310x6;
import X.C19340zH;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import com.whatsapp.R;
import com.whatsapp.phonematching.CountryAndPhoneNumberFragment;
import com.whatsapp.phonematching.MatchPhoneNumberFragment;

public final class DeleteConfirmationDialogFragment extends Hilt_DeleteConfirmationDialogFragment {
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = r0.A0T();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDismiss(android.content.DialogInterface r4) {
        /*
            r3 = this;
            X.0eF r0 = r3.A0E
            if (r0 == 0) goto L_0x001c
            X.0df r2 = r0.A0T()
            r0 = 2131432399(0x7f0b13cf, float:1.8486554E38)
            X.0eF r1 = r2.A0B(r0)
            if (r1 == 0) goto L_0x001c
            X.0dc r0 = new X.0dc
            r0.<init>(r2)
            r0.A07(r1)
            r0.A01()
        L_0x001c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.ui.delete.DeleteConfirmationDialogFragment.onDismiss(android.content.DialogInterface):void");
    }

    public void A0g() {
        AnonymousClass043 r1;
        super.A0g();
        Dialog dialog = this.A03;
        if ((dialog instanceof AnonymousClass043) && (r1 = (AnonymousClass043) dialog) != null) {
            Button button = r1.A00.A0G;
            AnonymousClass0x2.A0q(r1.getContext(), button, R.color.f5nameremoved);
            C18300x5.A19(button, this, 29);
        }
        A1V();
    }

    public Dialog A1J(Bundle bundle) {
        C003203q A0R = A0R();
        View A0H = C18310x6.A0H(LayoutInflater.from(A0R), R.layout.f8nameremoved);
        C19340zH A00 = AnonymousClass5V0.A00(A0R);
        A00.A0T(R.string.f11nameremoved);
        A00.A0a(A0H);
        A00.A0i(false);
        C19340zH.A07(A00, this, 73, R.string.f11nameremoved);
        C19340zH.A08(A00, this, 74, R.string.f11nameremoved);
        return C18300x5.A0H(A00);
    }

    public final MatchPhoneNumberFragment A1V() {
        C08310eF r1;
        C003203q A0Q = A0Q();
        if (A0Q != null) {
            r1 = A0Q.getSupportFragmentManager().A0B(R.id.phone_matching_container);
        } else {
            r1 = null;
        }
        if (r1 instanceof MatchPhoneNumberFragment) {
            return (MatchPhoneNumberFragment) r1;
        }
        return null;
    }

    public final void A1W() {
        AnonymousClass4FN r4;
        DeleteNewsletterActivity deleteNewsletterActivity;
        String str;
        boolean z;
        CountryAndPhoneNumberFragment countryAndPhoneNumberFragment;
        MatchPhoneNumberFragment A1V = A1V();
        if (A1V != null) {
            int A00 = C107195ar.A00(A1V.A08, C18290x4.A0m(A1V.A02).trim(), C18290x4.A0m(A1V.A03));
            if (A00 == 1) {
                MatchPhoneNumberFragment A1V2 = A1V();
                if (A1V2 != null) {
                    A1V2.A1K();
                    return;
                }
                return;
            }
            C003203q A0Q = A0Q();
            if (A0Q instanceof AnonymousClass4FN) {
                r4 = (AnonymousClass4FN) A0Q;
            } else {
                r4 = null;
            }
            if ((r4 instanceof DeleteNewsletterActivity) && (deleteNewsletterActivity = (DeleteNewsletterActivity) r4) != null) {
                C08310eF A0B = deleteNewsletterActivity.getSupportFragmentManager().A0B(R.id.phone_matching_container);
                if (!(A0B instanceof MatchPhoneNumberFragment) || (countryAndPhoneNumberFragment = (CountryAndPhoneNumberFragment) A0B) == null) {
                    str = null;
                } else {
                    str = countryAndPhoneNumberFragment.A1J(A00);
                }
                boolean z2 = false;
                switch (A00) {
                    case 2:
                    case 3:
                        z = false;
                        break;
                    default:
                        z = true;
                        break;
                }
                if (A00 == 2) {
                    z2 = true;
                }
                if (str == null) {
                    deleteNewsletterActivity.A75(C18290x4.A0l(deleteNewsletterActivity, R.string.f11nameremoved), z, z2);
                } else {
                    deleteNewsletterActivity.A75(str, z, z2);
                }
            }
        }
    }
}
