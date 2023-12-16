package com.whatsapp.authentication;

import X.C08310eF;
import X.C105275Ug;
import X.C18280x3;
import X.C19340zH;
import X.C58422vE;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;

public class SetupDeviceAuthDialog extends Hilt_SetupDeviceAuthDialog {
    public C105275Ug A00;

    public Dialog A1J(Bundle bundle) {
        boolean A0Y = this.A00.A05.A0Y(C58422vE.A02, 266);
        C19340zH A0K = C18280x3.A0K(this);
        int i = R.string.f11nameremoved;
        if (A0Y) {
            i = R.string.f11nameremoved;
        }
        A0K.A0h(C08310eF.A09(this).getString(i));
        int i2 = R.string.f11nameremoved;
        if (A0Y) {
            i2 = R.string.f11nameremoved;
        }
        A0K.A0g(C08310eF.A09(this).getString(i2));
        A0K.A00.A0I((DialogInterface.OnClickListener) null, C08310eF.A09(this).getString(R.string.f11nameremoved));
        return A0K.create();
    }
}
