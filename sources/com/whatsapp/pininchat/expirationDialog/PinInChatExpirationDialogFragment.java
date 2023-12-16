package com.whatsapp.pininchat.expirationDialog;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass226;
import X.AnonymousClass2NV;
import X.AnonymousClass4K6;
import X.C08310eF;
import X.C107565bW;
import X.C18280x3;
import X.C18300x5;
import X.C18310x6;
import X.C19340zH;
import X.C58422vE;
import X.C85794Hq;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;

public final class PinInChatExpirationDialogFragment extends Hilt_PinInChatExpirationDialogFragment {
    public static final AnonymousClass226 A02 = AnonymousClass226.SEVEN_DAYS;
    public AnonymousClass2NV A00;
    public AnonymousClass226 A01 = A02;

    public Dialog A1J(Bundle bundle) {
        AnonymousClass226[] values = AnonymousClass226.values();
        ArrayList A0s = AnonymousClass001.A0s();
        for (AnonymousClass226 r4 : values) {
            if (this.A02.A0Y(C58422vE.A02, 4432) || !r4.debugMenuOnlyField) {
                A0s.add(r4);
            }
        }
        C19340zH A0K = C18280x3.A0K(this);
        A0K.A0U(R.string.f11nameremoved);
        C19340zH.A04(this, A0K, 161, R.string.f11nameremoved);
        A0K.A0c(this, new AnonymousClass4K6(4), R.string.f11nameremoved);
        View A0I = C18310x6.A0I(A0R().getLayoutInflater(), (ViewGroup) null, R.layout.f8nameremoved, false);
        RadioGroup radioGroup = (RadioGroup) C18280x3.A0E(A0I, R.id.expiration_options_radio_group);
        int dimension = (int) C08310eF.A09(this).getDimension(R.dimen.f6nameremoved);
        int dimension2 = (int) C08310eF.A09(this).getDimension(R.dimen.f6nameremoved);
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            AnonymousClass226 r2 = (AnonymousClass226) it.next();
            RadioButton radioButton = new RadioButton(A1D());
            radioGroup.addView(radioButton);
            radioButton.setTag(r2.name());
            String A05 = C107565bW.A05(this.A01, r2.durationInDisplayUnit, r2.displayUnit);
            if (r2.debugMenuOnlyField) {
                A05 = AnonymousClass000.A0X(" [Internal Only]", AnonymousClass000.A0l(A05));
            }
            radioButton.setText(A05);
            radioButton.setChecked(AnonymousClass000.A1Y(r2, this.A01));
            RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
            layoutParams.setMargins(0, dimension, 0, dimension);
            radioButton.setLayoutParams(layoutParams);
            radioButton.setPaddingRelative(dimension2, 0, 0, 0);
        }
        radioGroup.setOnCheckedChangeListener(new C85794Hq(this, 3, radioGroup));
        A0K.setView(A0I);
        return C18300x5.A0H(A0K);
    }
}
