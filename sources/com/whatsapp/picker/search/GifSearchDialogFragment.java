package com.whatsapp.picker.search;

import X.AnonymousClass4AK;
import X.C003203q;
import X.C115975pX;
import X.C162457s7;
import X.C166177yG;
import X.C179348j0;
import X.C18270x1;
import X.C55922r8;
import X.C86644Kx;
import X.C94294qu;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.gifsearch.GifSearchContainer;

public final class GifSearchDialogFragment extends Hilt_GifSearchDialogFragment implements AnonymousClass4AK, C179348j0 {
    public C55922r8 A00;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        super.A0K(bundle, layoutInflater, viewGroup);
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        C162457s7.A0K(inflate, "null cannot be cast to non-null type com.whatsapp.gifsearch.GifSearchContainer");
        GifSearchContainer gifSearchContainer = (GifSearchContainer) inflate;
        gifSearchContainer.A00 = 48;
        C003203q A0R = A0R();
        C55922r8 r1 = this.A00;
        if (r1 != null) {
            gifSearchContainer.A01(A0R, (C94294qu) null, r1, this);
            gifSearchContainer.A0F = this;
            return gifSearchContainer;
        }
        throw C18270x1.A0S("gifSearchProvider");
    }

    public void BU5(C166177yG r2) {
        WaEditText waEditText;
        C162457s7.A0J(r2, 0);
        GifSearchContainer gifSearchContainer = (GifSearchContainer) this.A0B;
        if (!(gifSearchContainer == null || (waEditText = gifSearchContainer.A07) == null)) {
            waEditText.A05();
        }
        C115975pX r0 = this.A00;
        if (r0 != null) {
            r0.BU5(r2);
        }
    }

    public void A0g() {
        GifSearchContainer gifSearchContainer;
        super.A0g();
        View view = this.A0B;
        if ((view instanceof GifSearchContainer) && (gifSearchContainer = (GifSearchContainer) view) != null) {
            C86644Kx.A1J(gifSearchContainer.A07);
        }
    }
}
