package com.whatsapp.conversation;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass043;
import X.C18280x3;
import X.C19340zH;
import X.C84454Ck;
import X.C85804Hr;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.whatsapp.R;

public final class CapturePictureOrVideoDialogFragment extends Hilt_CapturePictureOrVideoDialogFragment {
    public static final int[] A01 = {R.string.f11nameremoved, R.string.f11nameremoved};
    public C84454Ck A00;

    public void A1G(Context context) {
        super.A1G(context);
        try {
            this.A00 = (C84454Ck) context;
        } catch (ClassCastException unused) {
            StringBuilder A0o = AnonymousClass001.A0o();
            AnonymousClass000.A1B(context, A0o);
            throw new ClassCastException(AnonymousClass000.A0X(" must implement CapturePictureOrVideoDialogClickListener", A0o));
        }
    }

    public Dialog A1J(Bundle bundle) {
        C19340zH A0K = C18280x3.A0K(this);
        A0K.A0J(new C85804Hr(this, 51), this.A01.A0V(A01));
        AnonymousClass043 create = A0K.create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }
}
