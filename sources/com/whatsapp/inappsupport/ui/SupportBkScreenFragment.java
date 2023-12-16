package com.whatsapp.inappsupport.ui;

import X.AnonymousClass0x2;
import X.AnonymousClass4FS;
import X.AnonymousClass4K2;
import X.AnonymousClass5WY;
import X.AnonymousClass5ZR;
import X.C06560Yg;
import X.C155137eL;
import X.C162457s7;
import X.C18270x1;
import X.C29441ip;
import X.C53202mi;
import X.C56912sl;
import X.C59842xa;
import X.C620633i;
import X.C820342a;
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

public final class SupportBkScreenFragment extends Hilt_SupportBkScreenFragment {
    public FrameLayout A00;
    public ProgressBar A01;
    public C85244Fm A02;
    public AnonymousClass5WY A03;
    public C59842xa A04;
    public C29441ip A05;
    public C620633i A06;
    public AnonymousClass5ZR A07;
    public C53202mi A08;
    public C56912sl A09;
    public AnonymousClass4FS A0A;

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
        AnonymousClass4K2.A00(A0V(), ((SupportBkLayoutViewModel) this.A06).A03, new C820342a(this), 128);
        SupportBkLayoutViewModel supportBkLayoutViewModel = (SupportBkLayoutViewModel) this.A06;
        Bundle bundle2 = this.A06;
        if (bundle2 == null || (str = bundle2.getString("screen_name")) == null) {
            str = "";
        }
        supportBkLayoutViewModel.A01 = str;
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
            Log.e("SupportBkScreenFragment/so loader init failed", e);
        }
    }
}
