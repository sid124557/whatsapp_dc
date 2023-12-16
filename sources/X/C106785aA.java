package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.jid.Jid;

/* renamed from: X.5aA  reason: invalid class name and case insensitive filesystem */
public class C106785aA {
    public static void A02(Bundle bundle, AnonymousClass5XZ r4, C105245Ud r5) {
        if (bundle != null) {
            String string = bundle.getString("contact_data_first_name");
            if (!TextUtils.isEmpty(string)) {
                C162457s7.A0J(string, 0);
                r4.A00 = AnonymousClass5XZ.A00(string);
                r4.A04.setText(string);
            }
            String string2 = bundle.getString("contact_data_last_name");
            if (!TextUtils.isEmpty(string2)) {
                C162457s7.A0J(string2, 0);
                r4.A01 = AnonymousClass5XZ.A00(string2);
                r4.A05.setText(string2);
            }
            String string3 = bundle.getString("contact_data_business_name");
            if (!TextUtils.isEmpty(string3)) {
                C162457s7.A0J(string3, 0);
                r4.A03.setText(string3);
                r4.A06.setVisibility(0);
                r4.A07.setVisibility(0);
            }
            String string4 = bundle.getString("contact_data_phone");
            if (!TextUtils.isEmpty(string4)) {
                try {
                    AnonymousClass8LC A0F = C162167rN.A00().A0F(string4, (String) null);
                    String num = Integer.toString(A0F.countryCode_);
                    String A01 = C162167rN.A01(A0F);
                    String A00 = C106675Zy.A00(num);
                    if (!TextUtils.isEmpty(A00)) {
                        r5.A05(A00);
                        r5.A03.setText(AnonymousClass000.A0V(" +", num, AnonymousClass000.A0l(A00)));
                    }
                    r5.A08.setText(A01);
                    r5.A01 = AnonymousClass000.A0T(num, A01.replaceAll("[^0-9]", ""));
                } catch (C143616zC e) {
                    C18260x0.A16("Error while parsing phoneNumber, message: ", AnonymousClass001.A0o(), e);
                }
            }
        }
    }

    public static void A03(View view, boolean z) {
        if (!z) {
            C06560Yg.A02(view, R.id.sync_to_phone_icon).setVisibility(0);
            C86604Kt.A1E(view, R.id.sync_to_phone_toggle_text, 0);
            C86604Kt.A1E(view, R.id.sync_to_device, 0);
        }
        C06560Yg.A02(view, R.id.add_information).setVisibility(8);
        C86604Kt.A1E(view, R.id.save_to_icon, 8);
        C86604Kt.A1E(view, R.id.contacts_storage_options_selector, 8);
    }

    public static boolean A04(C44772Xk r1, AnonymousClass5ZR r2) {
        if (r2.A02("android.permission.GET_ACCOUNTS") != 0 || !r1.A00()) {
            return false;
        }
        return true;
    }

    public static Intent A00(C104195Qa r3, AnonymousClass5XZ r4, C105245Ud r5, AnonymousClass7DW r6, boolean z, boolean z2) {
        Jid A03;
        Intent A07 = C18320x8.A07();
        if (z2) {
            A07.putExtra("contact_updated", true);
        }
        if (r3.A01) {
            String A02 = r4.A02();
            if (TextUtils.isEmpty(A02)) {
                A02 = r5.A02();
            }
            A07.putExtra("newly_added_contact_name_key", A02);
            if (z) {
                A07.putExtra("newly_added_contact_wa_only", !r6.A00.isChecked());
            }
            A07.putExtra("newly_added_contact_phone_number_key", r5.A02());
            AnonymousClass3ZH r0 = r3.A00;
            if (!(r0 == null || (A03 = AnonymousClass3ZH.A03(r0)) == null)) {
                AnonymousClass0x2.A0u(A07, A03, "newly_added_contact_jid_key");
            }
        }
        return A07;
    }

    public static void A01(Activity activity, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, int i, int i2, int i3) {
        C19340zH A00 = AnonymousClass5V0.A00(activity);
        A00.A0Q(activity.getString(i));
        A00.A0G(onClickListener, activity.getString(i2));
        A00.A0I(onClickListener2, activity.getString(i3));
        if (!activity.isFinishing()) {
            C18280x3.A0q(A00);
        }
    }
}
