package com.whatsapp.calling.views;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0Y8;
import X.AnonymousClass5SP;
import X.AnonymousClass5Yj;
import X.AnonymousClass6BC;
import X.C08240dc;
import X.C101745Fy;
import X.C107215at;
import X.C107385bE;
import X.C107405bG;
import X.C107625bc;
import X.C166087y7;
import X.C183538qC;
import X.C627336j;
import X.C72333dY;
import X.C97174xk;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.whatsapp.R;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.contact.picker.VoipContactPickerFragment;

public class VoipContactPickerDialogFragment extends Hilt_VoipContactPickerDialogFragment {
    public C97174xk A00;
    public C101745Fy A01;
    public final ContactPickerFragment A02 = new VoipContactPickerFragment();
    public final C183538qC A03 = C72333dY.A06(new C107625bc(this, 0));

    public void A0w(Bundle bundle, View view) {
        Dialog dialog;
        if (this.A02.A0X(5411) && (dialog = this.A03) != null) {
            dialog.getWindow().setSoftInputMode(16);
        }
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0R = AnonymousClass001.A0R(LayoutInflater.from(A0Q()), viewGroup, R.layout.f8nameremoved);
        AnonymousClass5SP r5 = (AnonymousClass5SP) this.A03.get();
        Bundle A08 = AnonymousClass002.A08();
        A08.putBoolean("for_group_call", true);
        A08.putStringArrayList("contacts_to_exclude", C627336j.A0A(r5.A02));
        C166087y7 A032 = C107215at.A03(A0G(), r5.A01, r5.A03);
        if (A032 != null) {
            A08.putParcelable("share_sheet_data", A032);
        }
        Integer num = r5.A00;
        if (num != null) {
            A08.putBoolean("use_custom_multiselect_limit", true);
            A08.putInt("custom_multiselect_limit", num.intValue());
        }
        ContactPickerFragment contactPickerFragment = this.A02;
        Bundle A082 = AnonymousClass002.A08();
        A082.putBundle("extras", A08);
        contactPickerFragment.A0u(A082);
        C08240dc r1 = new C08240dc(A0T());
        r1.A09(contactPickerFragment, R.id.fragment_container);
        r1.A04();
        return A0R;
    }

    public void A0f() {
        super.A0f();
        Dialog dialog = this.A03;
        if (dialog != null) {
            dialog.setOnKeyListener(new AnonymousClass6BC(this, 0));
        }
    }

    public void A0g() {
        int i;
        super.A0g();
        Dialog dialog = this.A03;
        if (dialog != null && dialog.getWindow() != null) {
            Window window = this.A03.getWindow();
            if (!C107385bE.A05() || !this.A02.A0X(5411)) {
                if (((AnonymousClass5SP) this.A03.get()).A03) {
                    i = AnonymousClass5Yj.A02(window.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved);
                } else {
                    i = R.color.f5nameremoved;
                }
                window.setNavigationBarColor(AnonymousClass0Y8.A04(window.getContext(), i));
                return;
            }
            C107405bG.A0B(window, AnonymousClass5Yj.A02(window.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved), 1);
        }
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        A1M(0, R.style.f12nameremoved);
    }
}
