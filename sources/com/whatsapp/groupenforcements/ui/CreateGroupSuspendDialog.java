package com.whatsapp.groupenforcements.ui;

import X.AnonymousClass002;
import X.AnonymousClass0x7;
import X.AnonymousClass4I8;
import X.AnonymousClass5V0;
import X.C003203q;
import X.C106715a2;
import X.C18270x1;
import X.C19340zH;
import X.C27991fJ;
import X.C45242Zg;
import X.C70103Zx;
import X.C85834Hu;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextView;
import com.whatsapp.R;

public class CreateGroupSuspendDialog extends Hilt_CreateGroupSuspendDialog {
    public C45242Zg A00;
    public C106715a2 A01;

    public static CreateGroupSuspendDialog A00(C27991fJ r2, boolean z) {
        Bundle A08 = AnonymousClass002.A08();
        A08.putBoolean("hasMe", z);
        A08.putParcelable("suspendedEntityId", r2);
        CreateGroupSuspendDialog createGroupSuspendDialog = new CreateGroupSuspendDialog();
        createGroupSuspendDialog.A0u(A08);
        return createGroupSuspendDialog;
    }

    public void A0g() {
        super.A0g();
        TextView textView = (TextView) A1I().findViewById(16908299);
        if (textView != null) {
            C18270x1.A0q(textView, this.A02);
        }
    }

    public Dialog A1J(Bundle bundle) {
        C003203q A0R = A0R();
        boolean z = A0H().getBoolean("hasMe");
        Parcelable parcelable = A0H().getParcelable("suspendedEntityId");
        C19340zH A002 = AnonymousClass5V0.A00(A0R);
        C85834Hu r6 = new C85834Hu(parcelable, A0R, this, 3);
        AnonymousClass4I8 r1 = new AnonymousClass4I8(A0R, 15, this);
        if (z) {
            A002.A0Q(this.A01.A05(A0R, new C70103Zx(this, 39, A0R), AnonymousClass0x7.A0n(this, "learn-more", AnonymousClass002.A0L(), 0, R.string.f11nameremoved), "learn-more"));
            A002.setNegativeButton(R.string.f11nameremoved, r6);
        } else {
            A002.A0A(R.string.f11nameremoved);
            A002.setNegativeButton(R.string.f11nameremoved, r1);
        }
        A002.setPositiveButton(R.string.f11nameremoved, (DialogInterface.OnClickListener) null);
        return A002.create();
    }
}
