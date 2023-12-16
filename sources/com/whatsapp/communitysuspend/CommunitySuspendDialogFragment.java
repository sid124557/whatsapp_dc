package com.whatsapp.communitysuspend;

import X.AnonymousClass4I8;
import X.AnonymousClass5V0;
import X.C003203q;
import X.C19340zH;
import X.C53602nM;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;

public class CommunitySuspendDialogFragment extends Hilt_CommunitySuspendDialogFragment {
    public C53602nM A00;

    public Dialog A1J(Bundle bundle) {
        C003203q A0R = A0R();
        C19340zH A002 = AnonymousClass5V0.A00(A0R);
        AnonymousClass4I8 r1 = new AnonymousClass4I8(A0R, 4, this);
        A002.A0A(R.string.f11nameremoved);
        A002.setNegativeButton(R.string.f11nameremoved, r1);
        A002.setPositiveButton(R.string.f11nameremoved, (DialogInterface.OnClickListener) null);
        return A002.create();
    }
}
