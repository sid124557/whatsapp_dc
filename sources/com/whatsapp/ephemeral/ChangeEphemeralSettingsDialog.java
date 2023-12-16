package com.whatsapp.ephemeral;

import X.AnonymousClass002;
import X.AnonymousClass1VX;
import X.AnonymousClass352;
import X.AnonymousClass4I2;
import X.C06560Yg;
import X.C08270df;
import X.C08310eF;
import X.C18280x3;
import X.C18300x5;
import X.C19340zH;
import X.C57162tC;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.whatsapp.R;

public class ChangeEphemeralSettingsDialog extends Hilt_ChangeEphemeralSettingsDialog {
    public C57162tC A00;

    public static void A00(C08270df r3, int i, int i2) {
        ChangeEphemeralSettingsDialog changeEphemeralSettingsDialog = new ChangeEphemeralSettingsDialog();
        Bundle A08 = AnonymousClass002.A08();
        A08.putInt("from_settings", i);
        A08.putInt("entry_point", i2);
        changeEphemeralSettingsDialog.A0u(A08);
        changeEphemeralSettingsDialog.A1O(r3, "group_ephemeral_settings_dialog");
    }

    public Dialog A1J(Bundle bundle) {
        int i;
        View inflate = A0R().getLayoutInflater().inflate(R.layout.f8nameremoved, (ViewGroup) null, false);
        RadioGroup radioGroup = (RadioGroup) C06560Yg.A02(inflate, R.id.disappearing_messages_settings_dialog_radio_group);
        TextView A0G = C18300x5.A0G(inflate, R.id.disappearing_messages_settings_dialog_title);
        int i2 = A0H().getInt("from_settings", 0);
        int i3 = A0H().getInt("entry_point", 0);
        AnonymousClass1VX r1 = this.A02;
        if (i3 == 2) {
            AnonymousClass352.A03(radioGroup, r1, i2, true, true);
            i = R.string.f11nameremoved;
        } else {
            AnonymousClass352.A03(radioGroup, r1, i2, false, false);
            i = R.string.f11nameremoved;
        }
        A0G.setText(i);
        for (int i4 = 0; i4 < radioGroup.getChildCount(); i4++) {
            View childAt = radioGroup.getChildAt(i4);
            if (childAt instanceof RadioButton) {
                ((TextView) childAt).setTextSize(0, C08310eF.A09(this).getDimension(R.dimen.f6nameremoved));
            }
        }
        radioGroup.setOnCheckedChangeListener(new AnonymousClass4I2(this, 0));
        C19340zH A0K = C18280x3.A0K(this);
        A0K.A0a(inflate);
        return A0K.create();
    }
}
