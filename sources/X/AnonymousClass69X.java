package X;

import android.content.DialogInterface;
import android.net.Uri;
import com.whatsapp.DisplayExceptionDialogFactory$LoginFailedDialogFragment;
import com.whatsapp.R;
import com.whatsapp.businessdirectory.view.fragment.LocationOptionPickerFragment;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.settings.SettingsChatHistoryFragment;

/* renamed from: X.69X  reason: invalid class name */
public class AnonymousClass69X implements DialogInterface.OnClickListener {
    public Object A00;
    public boolean A01;
    public final int A02;

    public AnonymousClass69X(int i, Object obj, boolean z) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C003203q r6;
        switch (this.A02) {
            case 0:
                DisplayExceptionDialogFactory$LoginFailedDialogFragment displayExceptionDialogFactory$LoginFailedDialogFragment = (DisplayExceptionDialogFactory$LoginFailedDialogFragment) this.A00;
                boolean z = this.A01;
                PhoneUserJid A04 = C56972sr.A04(displayExceptionDialogFactory$LoginFailedDialogFragment.A03);
                if (A04 != null) {
                    AnonymousClass33p r0 = displayExceptionDialogFactory$LoginFailedDialogFragment.A08;
                    C18270x1.A0j(C18270x1.A03(r0), "saved_user_before_logout", A04.user);
                }
                r6 = displayExceptionDialogFactory$LoginFailedDialogFragment.A0R();
                String string = AnonymousClass0x2.A0F(displayExceptionDialogFactory$LoginFailedDialogFragment.A08).getString("main_button_url", (String) null);
                if (z && !C159707mK.A00(string) && string != null) {
                    displayExceptionDialogFactory$LoginFailedDialogFragment.A02.BkW(r6, Uri.parse(string), (C624134x) null);
                    break;
                } else {
                    displayExceptionDialogFactory$LoginFailedDialogFragment.A1V(r6);
                    break;
                }
                break;
            case 1:
                DisplayExceptionDialogFactory$LoginFailedDialogFragment displayExceptionDialogFactory$LoginFailedDialogFragment2 = (DisplayExceptionDialogFactory$LoginFailedDialogFragment) this.A00;
                boolean z2 = this.A01;
                r6 = displayExceptionDialogFactory$LoginFailedDialogFragment2.A0R();
                C85244Fm r2 = displayExceptionDialogFactory$LoginFailedDialogFragment2.A02;
                String A0Z = C18280x3.A0Z(AnonymousClass0x2.A0F(displayExceptionDialogFactory$LoginFailedDialogFragment2.A08), "secondary_button_url");
                if (!z2 || C159707mK.A00(A0Z)) {
                    A0Z = "https://faq.whatsapp.com";
                }
                C86604Kt.A12(r6, r2, A0Z);
                break;
            case 2:
                LocationOptionPickerFragment locationOptionPickerFragment = (LocationOptionPickerFragment) this.A00;
                if (this.A01) {
                    locationOptionPickerFragment.A08.A00((C05880Vi) null, C622534h.A09);
                    return;
                } else {
                    C107395bF.A05(locationOptionPickerFragment.A0R());
                    return;
                }
            case 3:
                C08310eF r1 = (C08310eF) this.A00;
                if (this.A01) {
                    C18300x5.A1A(r1);
                    return;
                }
                return;
            default:
                SettingsChatHistoryFragment settingsChatHistoryFragment = (SettingsChatHistoryFragment) this.A00;
                boolean z3 = this.A01;
                C89114bZ r12 = settingsChatHistoryFragment.A00;
                if (r12 != null) {
                    C621433s.A00(r12, 5);
                    C89114bZ r02 = settingsChatHistoryFragment.A00;
                    if (r02 != null) {
                        r02.BpA(R.string.f11nameremoved, R.string.f11nameremoved);
                    }
                    settingsChatHistoryFragment.A0C.BkM(new C71363bz(9, settingsChatHistoryFragment, z3));
                    return;
                }
                return;
        }
        C05680Um.A00(r6);
    }
}
