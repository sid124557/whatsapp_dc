package com.whatsapp.wabloks.base;

import X.AnonymousClass001;
import X.AnonymousClass7UQ;
import X.AnonymousClass9HE;
import X.AnonymousClass9HF;
import X.C009707r;
import X.C155137eL;
import X.C183538qC;
import X.C1899693i;
import X.C198139eR;
import X.C205049qL;
import X.C44122Ut;
import X.C47382dA;
import X.C48412er;
import X.C59842xa;
import X.C84704Dj;
import X.C86654Ky;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.R;
import java.io.IOException;
import java.util.Map;

public class BkScreenFragmentWithCustomPreloadScreens extends Hilt_BkScreenFragmentWithCustomPreloadScreens implements C84704Dj {
    public FrameLayout A00;
    public FrameLayout A01;
    public C44122Ut A02;
    public C48412er A03;
    public C59842xa A04;
    public AnonymousClass7UQ A05;
    public Map A06;
    public Map A07;
    public final C183538qC A08 = new C198139eR();

    public void A1J() {
        ((GenericBkLayoutViewModelWithReload) this.A06).A01.A0H(AnonymousClass9HF.A00);
        Bundle bundle = this.A06;
        if (bundle != null) {
            this.A04.A01(bundle.getString("qpl_params"));
        }
    }

    public void A1O(Integer num, Integer num2, String str, String str2) {
        C48412er r1 = this.A03;
        if (r1 != null) {
            r1.A01(str2, num2.intValue());
        }
    }

    public C47382dA BEP() {
        C44122Ut r3 = this.A02;
        return C1899693i.A09((C009707r) A0Q(), A0U(), r3, this.A06);
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0c() {
        super.A0c();
        ((GenericBkLayoutViewModelWithReload) this.A06).A01.A0A(A0V());
        this.A01 = null;
        this.A00 = null;
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        try {
            C155137eL.A00(A0R().getApplicationContext());
        } catch (IOException unused) {
        }
    }

    public void A0w(Bundle bundle, View view) {
        this.A01 = C86654Ky.A0L(view, R.id.pre_load_container);
        this.A00 = C86654Ky.A0L(view, R.id.bloks_dialogfragment);
        ((GenericBkLayoutViewModelWithReload) this.A06).A01.A0H(AnonymousClass9HE.A00);
        C205049qL.A03(A0V(), ((GenericBkLayoutViewModelWithReload) this.A06).A01, this, 72);
        super.A0w(bundle, view);
    }

    public int A1H() {
        return R.id.bloks_container;
    }

    public Class A1I() {
        return GenericBkLayoutViewModelWithReload.class;
    }

    public AnonymousClass7UQ B4k() {
        return this.A05;
    }
}
