package com.whatsapp.dialogs;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass64B;
import X.C06560Yg;
import X.C18290x4;
import X.C84524Cr;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public class AudioVideoBottomSheetDialogFragment extends Hilt_AudioVideoBottomSheetDialogFragment implements AnonymousClass64B {
    public C84524Cr A00;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0R = AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
        View A02 = C06560Yg.A02(A0R, R.id.audio_call_item);
        View A022 = C06560Yg.A02(A0R, R.id.video_call_item);
        C18290x4.A1G(A02, this, 47);
        C18290x4.A1G(A022, this, 48);
        return A0R;
    }

    public void A0d() {
        super.A0d();
        this.A00 = null;
    }

    public void A1G(Context context) {
        super.A1G(context);
        if (context instanceof C84524Cr) {
            this.A00 = (C84524Cr) context;
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Activity must implement ");
        throw AnonymousClass000.A0I(C84524Cr.class.getSimpleName(), A0o);
    }
}
