package com.whatsapp.chatinfo;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C08310eF;
import X.C18280x3;
import X.C19340zH;
import X.C84364Cb;
import X.C85804Hr;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.whatsapp.R;

public class ViewPhotoOrStatusDialogFragment extends Hilt_ViewPhotoOrStatusDialogFragment {
    public C84364Cb A00;

    public void A0d() {
        super.A0d();
        this.A00 = null;
    }

    public void A1G(Context context) {
        super.A1G(context);
        if (context instanceof C84364Cb) {
            this.A00 = (C84364Cb) context;
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1B(context, A0o);
        throw new ClassCastException(AnonymousClass000.A0X(" must implement ViewPhotoOrStatusDialogClickListener", A0o));
    }

    public Dialog A1J(Bundle bundle) {
        String[] stringArray = C08310eF.A09(this).getStringArray(R.array.f2nameremoved);
        C19340zH A0K = C18280x3.A0K(this);
        A0K.A0J(new C85804Hr(this, 33), stringArray);
        return A0K.create();
    }
}
