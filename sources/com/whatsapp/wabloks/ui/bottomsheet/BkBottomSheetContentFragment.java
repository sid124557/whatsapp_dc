package com.whatsapp.wabloks.ui.bottomsheet;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass49I;
import X.AnonymousClass7r0;
import X.AnonymousClass84O;
import X.AnonymousClass9N5;
import X.C06560Yg;
import X.C162457s7;
import X.C183538qC;
import X.C204249p3;
import X.C204719po;
import X.C34261un;
import X.C55742qq;
import X.C626936e;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import com.whatsapp.wabloks.base.GenericBkLayoutViewModel;

public class BkBottomSheetContentFragment extends Hilt_BkBottomSheetContentFragment {
    public Toolbar A00;
    public AnonymousClass9N5 A01;
    public AnonymousClass49I A02;
    public C183538qC A03;
    public String A04;
    public String A05;
    public boolean A06;

    public void A0c() {
        this.A00 = null;
        super.A0c();
    }

    public void A0a() {
        AnonymousClass49I r1 = this.A02;
        if (!(r1 == null || this.A01 == null)) {
            try {
                A1L(r1);
            } catch (NullPointerException e) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append(getClass().getName());
                Log.e(AnonymousClass000.A0X("Failed to execute onContentDismiss Expression: ", A0o), e);
            }
        }
        if (this.A0i && this.A01 != null) {
            AnonymousClass9N5 r0 = this.A01;
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("bk_bottom_sheet_content_fragment");
            String A0h = AnonymousClass000.A0h(A0o2, r0.hashCode());
            C162457s7.A0J(A0h, 0);
            ((C55742qq) this.A03.get()).A04(new C34261un(A0h), "bk_bottom_sheet_content_fragment");
        }
        super.A0a();
    }

    public static BkBottomSheetContentFragment A00(AnonymousClass9N5 r4, C55742qq r5, String str, boolean z) {
        Bundle A08 = AnonymousClass002.A08();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("bk_bottom_sheet_content_fragment");
        String A0h = AnonymousClass000.A0h(A0o, r4.hashCode());
        A08.putString("bottom_sheet_fragment_tag", str);
        A08.putBoolean("bottom_sheet_back_stack", z);
        A08.putString("bk_bottom_sheet_content_fragment", A0h);
        C162457s7.A0J(A0h, 0);
        r5.A03(new C34261un(A0h), r4, "bk_bottom_sheet_content_fragment");
        BkBottomSheetContentFragment bkBottomSheetContentFragment = new BkBottomSheetContentFragment();
        bkBottomSheetContentFragment.A0u(A08);
        bkBottomSheetContentFragment.A02 = (AnonymousClass7r0) r4.A00.A04.get(35);
        return bkBottomSheetContentFragment;
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0p(Bundle bundle) {
        String string = A0H().getString("bk_bottom_sheet_content_fragment", "");
        C162457s7.A0J(string, 0);
        AnonymousClass9N5 r0 = (AnonymousClass9N5) ((C55742qq) this.A03.get()).A01(new C34261un(string), "bk_bottom_sheet_content_fragment");
        this.A01 = r0;
        if (r0 != null) {
            this.A02 = (AnonymousClass7r0) r0.A00.A04.get(35);
        }
        super.A0p(bundle);
    }

    public void A0w(Bundle bundle, View view) {
        C204719po r1;
        Bundle A0H = A0H();
        this.A00 = (Toolbar) C06560Yg.A02(view, R.id.bk_bottom_sheet_toolbar);
        this.A04 = A0H.getString("bottom_sheet_fragment_tag");
        this.A06 = A0H.getBoolean("bottom_sheet_back_stack");
        AnonymousClass9N5 r0 = this.A01;
        if (r0 != null) {
            String A07 = AnonymousClass84O.A07(r0.A00);
            this.A05 = A07;
            if (!TextUtils.isEmpty(A07)) {
                this.A00.setVisibility(0);
                this.A00.setTitle((CharSequence) this.A05);
            }
            if (this.A01.A00.A0L(38) == null) {
                r1 = null;
            } else {
                r1 = new C204719po(this, 10);
            }
            this.A02 = r1;
            boolean z = this.A06;
            Toolbar toolbar = this.A00;
            if (z) {
                toolbar.setVisibility(0);
                this.A00.getNavigationIcon().setVisible(true, true);
                this.A00.setNavigationOnClickListener(C204249p3.A00(this, 161));
            } else {
                Drawable navigationIcon = toolbar.getNavigationIcon();
                C626936e.A06(navigationIcon);
                navigationIcon.setVisible(false, false);
            }
        }
        super.A0w(bundle, view);
    }

    public int A1H() {
        return R.id.bloks_container;
    }

    public Class A1I() {
        return GenericBkLayoutViewModel.class;
    }
}
