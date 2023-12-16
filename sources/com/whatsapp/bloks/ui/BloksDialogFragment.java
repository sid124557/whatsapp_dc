package com.whatsapp.bloks.ui;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass6EP;
import X.C009707r;
import X.C105895Wv;
import X.C147077Cs;
import X.C159037kz;
import X.C18310x6;
import X.C184138rJ;
import X.C1899693i;
import X.C196289ab;
import X.C196299ac;
import X.C202069lK;
import X.C44122Ut;
import X.C47382dA;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.facebook.rendercore.RootHostView;
import com.whatsapp.R;
import java.util.HashMap;
import java.util.Map;

public class BloksDialogFragment extends Hilt_BloksDialogFragment implements C184138rJ {
    public View A00;
    public FrameLayout A01;
    public C44122Ut A02;
    public C47382dA A03;
    public C196289ab A04;
    public C147077Cs A05;
    public C202069lK A06;
    public AnonymousClass6EP A07;
    public C105895Wv A08;
    public Boolean A09;
    public Map A0A;

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        C44122Ut r3 = this.A02;
        this.A03 = C1899693i.A09((C009707r) A0R(), A0U(), r3, this.A0A);
        AnonymousClass6EP r2 = this.A07;
        C009707r r4 = (C009707r) A0Q();
        A1D();
        r2.A01(A0H(), r4, this, this.A03, this.A04, this, C18310x6.A0k(A0H(), "screen_name"), (HashMap) A0H().getSerializable("screen_params"));
    }

    public static BloksDialogFragment A00(String str, HashMap hashMap) {
        BloksDialogFragment bloksDialogFragment = new BloksDialogFragment();
        Bundle A082 = AnonymousClass002.A08();
        A082.putString("screen_name", str);
        A082.putSerializable("screen_params", hashMap);
        A082.putBoolean("hot_reload", false);
        bloksDialogFragment.A0u(A082);
        return bloksDialogFragment;
    }

    public void A0w(Bundle bundle, View view) {
        C196299ac r0 = new C196299ac(view);
        this.A06 = r0;
        this.A07.A03 = (RootHostView) r0.A00.findViewById(R.id.bloks_container);
        this.A00 = view.findViewById(R.id.bloks_dialogfragment_progressbar);
        this.A01 = (FrameLayout) view.findViewById(R.id.bloks_dialogfragment);
        this.A07.A00();
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0c() {
        super.A0c();
        AnonymousClass6EP r1 = this.A07;
        C159037kz r0 = r1.A04;
        if (r0 != null) {
            r0.A04();
            r1.A04 = null;
        }
        this.A01 = null;
        this.A06 = null;
        this.A00 = null;
    }

    public void A0e() {
        super.A0e();
        View currentFocus = A0R().getCurrentFocus();
        if (currentFocus != null) {
            this.A08.A02(currentFocus);
        }
    }

    public Dialog A1J(Bundle bundle) {
        Dialog A1J = super.A1J(bundle);
        A1J.setCanceledOnTouchOutside(false);
        Window window = A1J.getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
        return A1J;
    }

    public void BHP(Boolean bool) {
        this.A09 = bool;
    }

    public void Blo(C147077Cs r1) {
        this.A05 = r1;
    }
}
