package com.whatsapp.inappsupport.ui;

import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass42Z;
import X.AnonymousClass4K2;
import X.C06560Yg;
import X.C155137eL;
import X.C162457s7;
import X.C18270x1;
import X.C53602nM;
import X.C57282tO;
import X.C85244Fm;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public final class ContextualHelpBkScreenFragment extends Hilt_ContextualHelpBkScreenFragment {
    public FrameLayout A00;
    public ProgressBar A01;
    public C85244Fm A02;
    public C53602nM A03;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
    }

    public void A0w(Bundle bundle, View view) {
        String str;
        C162457s7.A0J(view, 0);
        this.A01 = (ProgressBar) C06560Yg.A02(view, R.id.bloks_dialogfragment_progressbar);
        FrameLayout frameLayout = (FrameLayout) C06560Yg.A02(view, R.id.bloks_dialogfragment);
        this.A00 = frameLayout;
        C18270x1.A0p(frameLayout);
        AnonymousClass0x2.A0x(this.A01);
        AnonymousClass4K2.A00(A0V(), ((SupportBkLayoutViewModel) this.A06).A03, new AnonymousClass42Z(this), 127);
        SupportBkLayoutViewModel supportBkLayoutViewModel = (SupportBkLayoutViewModel) this.A06;
        Bundle bundle2 = this.A06;
        if (bundle2 == null || (str = bundle2.getString("screen_name")) == null) {
            str = "";
        }
        supportBkLayoutViewModel.A01 = str;
        ((SupportBkLayoutViewModel) this.A06).A00 = A1S();
        super.A0w(bundle, view);
    }

    public void A0c() {
        super.A0c();
        this.A01 = null;
        ((SupportBkLayoutViewModel) this.A06).A03.A0A(A0V());
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        try {
            C155137eL.A00(A0R().getApplicationContext());
        } catch (IOException e) {
            Log.e("ContextualHelpBkScreenFragment/so loader init failed", e);
        }
    }

    public final String A1S() {
        Serializable serializable;
        Bundle bundle = this.A06;
        if (!(bundle == null || bundle.getSerializable("screen_params") == null)) {
            Bundle bundle2 = this.A06;
            if (bundle2 != null) {
                serializable = bundle2.getSerializable("screen_params");
            } else {
                serializable = null;
            }
            C162457s7.A0K(serializable, "null cannot be cast to non-null type kotlin.String");
            try {
                JSONObject A1H = AnonymousClass0x9.A1H((String) serializable);
                if (!A1H.has("params")) {
                    return null;
                }
                JSONObject jSONObject = A1H.getJSONObject("params");
                if (!jSONObject.has("server_params")) {
                    return null;
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("server_params");
                C162457s7.A0H(jSONObject2);
                C162457s7.A0J(jSONObject2, 0);
                return C57282tO.A00("entrypointid", jSONObject2, false);
            } catch (JSONException e) {
                Log.e("ContextualHelpBkScreenFragment/getEntryPointId", e);
            }
        }
        return null;
    }
}
