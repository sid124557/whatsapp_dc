package com.whatsapp.extensions.bloks.view;

import X.AnonymousClass002;
import X.AnonymousClass08M;
import X.AnonymousClass0RP;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass428;
import X.AnonymousClass429;
import X.AnonymousClass42A;
import X.AnonymousClass42B;
import X.AnonymousClass42C;
import X.AnonymousClass42D;
import X.AnonymousClass4K2;
import X.AnonymousClass6FH;
import X.C003203q;
import X.C06560Yg;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C18320x8;
import X.C29441ip;
import X.C50312hy;
import X.C53822nj;
import X.C56422rx;
import X.C59842xa;
import X.C60032xt;
import X.C635339p;
import X.C66543Lv;
import X.C88694ab;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.extensions.bloks.viewmodel.WaExtensionsNavBarViewModel;
import com.whatsapp.wabloks.commerce.ui.viewmodel.WaBkExtensionsLayoutViewModel;

public final class WaBkExtensionsScreenFragment extends Hilt_WaBkExtensionsScreenFragment {
    public FrameLayout A00;
    public FrameLayout A01;
    public ProgressBar A02;
    public C88694ab A03;
    public WaTextView A04;
    public C59842xa A05;
    public C29441ip A06;
    public C56422rx A07;
    public C60032xt A08;
    public C66543Lv A09;
    public WaExtensionsNavBarViewModel A0A;
    public C53822nj A0B;
    public C50312hy A0C;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        this.A03 = C88694ab.A01(inflate, "", 0);
        return inflate;
    }

    public void A0w(Bundle bundle, View view) {
        ViewGroup.LayoutParams layoutParams;
        C162457s7.A0J(view, 0);
        this.A02 = (ProgressBar) C06560Yg.A02(view, R.id.bloks_dialogfragment_progressbar);
        this.A00 = (FrameLayout) C06560Yg.A02(view, R.id.bloks_dialogfragment);
        this.A01 = (FrameLayout) C06560Yg.A02(view, R.id.extensions_container);
        this.A04 = AnonymousClass0x7.A0L(view, R.id.extensions_error_text);
        C18270x1.A0p(this.A00);
        AnonymousClass0x2.A0x(this.A02);
        Drawable A002 = AnonymousClass0RP.A00(A0G(), R.drawable.bloks_progress_indeterminate);
        ProgressBar progressBar = this.A02;
        if (progressBar != null) {
            layoutParams = progressBar.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = A0R().getWindowManager().getDefaultDisplay().getHeight() / 2;
            }
        } else {
            layoutParams = null;
        }
        ProgressBar progressBar2 = this.A02;
        if (progressBar2 != null) {
            progressBar2.setLayoutParams(layoutParams);
        }
        ProgressBar progressBar3 = this.A02;
        if (progressBar3 != null) {
            progressBar3.setIndeterminateDrawable(A002);
        }
        ((WaBkExtensionsLayoutViewModel) this.A06).A00 = A0H().getString("screen_params");
        AnonymousClass4K2.A00(A0V(), ((WaBkExtensionsLayoutViewModel) this.A06).A06, new AnonymousClass428(this), 110);
        AnonymousClass4K2.A00(A0V(), ((WaBkExtensionsLayoutViewModel) this.A06).A07, new AnonymousClass429(this), 111);
        AnonymousClass4K2.A00(A0V(), ((WaBkExtensionsLayoutViewModel) this.A06).A08, new AnonymousClass42A(this), 112);
        AnonymousClass4K2.A00(A0V(), ((WaBkExtensionsLayoutViewModel) this.A06).A05, new AnonymousClass42B(this), 113);
        AnonymousClass4K2.A00(A0V(), ((WaBkExtensionsLayoutViewModel) this.A06).A04, new AnonymousClass42C(this), 114);
        AnonymousClass4K2.A00(A0V(), ((WaBkExtensionsLayoutViewModel) this.A06).A09, new AnonymousClass42D(this), 115);
        super.A0w(bundle, view);
    }

    public final void A1S(String str, String str2, String str3) {
        String str4 = str;
        WaExtensionsNavBarViewModel waExtensionsNavBarViewModel = this.A0A;
        if (waExtensionsNavBarViewModel == null) {
            throw C18270x1.A0S("waExtensionsNavBarViewModel");
        }
        AnonymousClass08M r3 = waExtensionsNavBarViewModel.A04;
        boolean equals = "1".equals(waExtensionsNavBarViewModel.A01);
        boolean z = true;
        if (equals) {
            z = false;
        }
        C18320x8.A18(r3, z);
        WaTextView waTextView = this.A04;
        if (waTextView != null) {
            waTextView.setVisibility(0);
            waTextView.setText(str);
        }
        C18270x1.A0p(this.A01);
        WaExtensionsNavBarViewModel waExtensionsNavBarViewModel2 = this.A0A;
        if (waExtensionsNavBarViewModel2 == null) {
            throw C18270x1.A0S("waExtensionsNavBarViewModel");
        }
        waExtensionsNavBarViewModel2.A06.A0H(false);
        WaExtensionsNavBarViewModel waExtensionsNavBarViewModel3 = this.A0A;
        if (waExtensionsNavBarViewModel3 == null) {
            throw C18270x1.A0S("waExtensionsNavBarViewModel");
        }
        waExtensionsNavBarViewModel3.A05.A0H(false);
        String str5 = str2;
        if (str2 != null) {
            C60032xt r32 = this.A08;
            if (r32 != null) {
                C003203q A0Q = A0Q();
                if (str3 != null) {
                    str4 = str3;
                }
                C66543Lv r6 = this.A09;
                if (r6 != null) {
                    C56422rx r5 = this.A07;
                    if (r5 != null) {
                        C50312hy r7 = this.A0C;
                        if (r7 != null) {
                            r32.A01(A0Q, r5, r6, r7, str5, str4);
                        } else {
                            throw C18270x1.A0S("wamExtensionsStructuredMessageInteractionReporter");
                        }
                    } else {
                        throw C18270x1.A0S("verifiedNameManager");
                    }
                } else {
                    throw C18270x1.A0S("coreMessageStore");
                }
            } else {
                throw C18270x1.A0S("extensionsDataUtil");
            }
        }
        A1N((Exception) null);
    }

    public final void A1T(String str, String str2, String str3) {
        AnonymousClass6FH r1;
        TextView A092;
        String str4 = str;
        C88694ab r0 = this.A03;
        if (!(r0 == null || (r1 = r0.A0J) == null || (A092 = AnonymousClass002.A09(r1, R.id.snackbar_text)) == null)) {
            A092.setText(str);
        }
        C88694ab r4 = this.A03;
        if (r4 != null) {
            r4.A0E(new C635339p((Object) this, 26), R.string.f11nameremoved);
        }
        C88694ab r02 = this.A03;
        if (r02 != null) {
            r02.A05();
        }
        WaExtensionsNavBarViewModel waExtensionsNavBarViewModel = this.A0A;
        if (waExtensionsNavBarViewModel == null) {
            throw C18270x1.A0S("waExtensionsNavBarViewModel");
        }
        C18320x8.A18(waExtensionsNavBarViewModel.A06, false);
        String str5 = str2;
        if (str2 != null) {
            C60032xt r3 = this.A08;
            if (r3 != null) {
                C003203q A0Q = A0Q();
                if (str3 != null) {
                    str4 = str3;
                }
                C66543Lv r6 = this.A09;
                if (r6 != null) {
                    C56422rx r5 = this.A07;
                    if (r5 != null) {
                        C50312hy r7 = this.A0C;
                        if (r7 != null) {
                            r3.A01(A0Q, r5, r6, r7, str5, str4);
                        } else {
                            throw C18270x1.A0S("wamExtensionsStructuredMessageInteractionReporter");
                        }
                    } else {
                        throw C18270x1.A0S("verifiedNameManager");
                    }
                } else {
                    throw C18270x1.A0S("coreMessageStore");
                }
            } else {
                throw C18270x1.A0S("extensionsDataUtil");
            }
        }
        A1N((Exception) null);
    }

    public void A0c() {
        super.A0c();
        ((WaBkExtensionsLayoutViewModel) this.A06).A06.A0A(A0V());
        C53822nj r2 = this.A0B;
        if (r2 != null) {
            r2.A02("user_interrupted", true);
            return;
        }
        throw C18270x1.A0S("wamExtensionScreenProgressReporter");
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        this.A0A = (WaExtensionsNavBarViewModel) C18290x4.A0O(this).A01(WaExtensionsNavBarViewModel.class);
    }
}
