package com.whatsapp.wabloks.ui;

import X.AnonymousClass001;
import X.AnonymousClass0R8;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass37G;
import X.AnonymousClass3EC;
import X.AnonymousClass49F;
import X.AnonymousClass49G;
import X.AnonymousClass49I;
import X.AnonymousClass4JL;
import X.AnonymousClass4SH;
import X.AnonymousClass8DJ;
import X.AnonymousClass9RA;
import X.C003203q;
import X.C009707r;
import X.C06560Yg;
import X.C08240dc;
import X.C08270df;
import X.C08310eF;
import X.C131266dJ;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C191959Hf;
import X.C197949e8;
import X.C197989eC;
import X.C197999eD;
import X.C43432Sc;
import X.C44052Um;
import X.C50042hX;
import X.C54522or;
import X.C60482yd;
import X.C620733j;
import X.C69263Wi;
import X.C69283Wk;
import X.C69303Wm;
import X.C69313Wn;
import X.C69333Wp;
import X.C69343Wq;
import X.C69373Wt;
import X.C69493Xf;
import X.C70073Zu;
import X.C79763x9;
import X.C835248t;
import X.C84704Dj;
import X.C84734Dm;
import X.C85744Hl;
import X.C85814Hs;
import X.C86034Io;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.extensions.phoenix.view.ExtensionsInitialLoadingView;
import com.whatsapp.extensions.phoenix.view.PhoenixExtensionsBottomSheetContainer;
import com.whatsapp.wabloks.base.FdsContentFragmentManager;

public class FcsBottomSheetBaseContainer extends Hilt_FcsBottomSheetBaseContainer implements C84734Dm {
    public int A00 = 100;
    public ViewGroup A01;
    public FrameLayout A02;
    public ImageView A03;
    public ProgressBar A04;
    public Toolbar A05;
    public C44052Um A06;
    public C69263Wi A07;
    public WaTextView A08;
    public WaTextView A09;
    public AnonymousClass49F A0A;
    public AnonymousClass49I A0B;
    public C620733j A0C;
    public C54522or A0D;
    public C60482yd A0E;
    public AnonymousClass9RA A0F;
    public FdsContentFragmentManager A0G;
    public C50042hX A0H;
    public C191959Hf A0I;
    public String A0J = "CLOSE";
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q = true;

    public static /* synthetic */ void A00(AnonymousClass49G r3, FcsBottomSheetBaseContainer fcsBottomSheetBaseContainer) {
        String A0O2;
        WaTextView waTextView;
        if (r3 instanceof AnonymousClass3EC) {
            A0O2 = ((AnonymousClass3EC) r3).A00();
        } else {
            A0O2 = r3.B3p().A0O(36);
        }
        if (!(A0O2 == null || (waTextView = fcsBottomSheetBaseContainer.A08) == null)) {
            waTextView.setText(A0O2);
            waTextView.setVisibility(0);
        }
        fcsBottomSheetBaseContainer.Bnc(false);
        C43432Sc r0 = new C43432Sc(r3.B3p().A0K(40));
        String str = r0.A01;
        C835248t r2 = r0.A00;
        if (str == null || r2 == null) {
            fcsBottomSheetBaseContainer.A1Y();
            return;
        }
        C69263Wi r1 = fcsBottomSheetBaseContainer.A07;
        if (r1 != null) {
            r1.A0S(new C70073Zu(fcsBottomSheetBaseContainer, str));
            fcsBottomSheetBaseContainer.A0B = new C86034Io(r2, 31);
            return;
        }
        throw C18270x1.A0S("globalUI");
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        this.A0N = A0H().getString("fds_state_name");
        this.A0K = A0H().getString("fds_on_back");
        this.A0M = A0H().getString("fds_on_back_params");
        this.A0L = A0H().getString("fds_observer_id");
        String string = A0H().getString("fds_button_style");
        if (string != null) {
            this.A0J = string;
        }
        C54522or r3 = this.A0D;
        if (r3 != null) {
            r3.A00(new C85744Hl(this, 10), C197999eD.class, this);
            r3.A00(new C85744Hl(this, 11), C197949e8.class, this);
            r3.A00(new C85744Hl(this, 12), C69283Wk.class, this);
            r3.A00(new C85744Hl(this, 13), C69303Wm.class, this);
            r3.A00(new C85744Hl(this, 14), C69343Wq.class, this);
            r3.A00(new C85744Hl(this, 15), C69333Wp.class, this);
        }
        Context A0G2 = A0G();
        C003203q A0Q2 = A0Q();
        C162457s7.A0K(A0Q2, "null cannot be cast to non-null type com.whatsapp.wabloks.base.BkFragmentHostSurface");
        C84704Dj r32 = (C84704Dj) A0Q2;
        C620733j r1 = this.A0C;
        if (r1 != null) {
            this.A0I = new C191959Hf(A0G2, r1, r32);
            View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
            this.A05 = (Toolbar) C06560Yg.A02(inflate, R.id.bk_bottom_sheet_toolbar);
            C003203q A0Q3 = A0Q();
            C162457s7.A0K(A0Q3, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            C009707r r12 = (C009707r) A0Q3;
            r12.setSupportActionBar(this.A05);
            AnonymousClass0R8 supportActionBar = r12.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.A0Q(false);
            }
            this.A08 = AnonymousClass0x7.A0L(inflate, R.id.toolbar_customized_title);
            this.A03 = AnonymousClass0x9.A0E(inflate, R.id.bk_branding_image);
            ProgressBar progressBar = (ProgressBar) C18280x3.A0E(inflate, R.id.bk_toolbar_loading);
            Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
            if (indeterminateDrawable != null) {
                indeterminateDrawable.setColorFilter(AnonymousClass0Y8.A04(inflate.getContext(), R.color.f5nameremoved), PorterDuff.Mode.SRC_IN);
            }
            this.A04 = progressBar;
            ViewGroup viewGroup2 = (ViewGroup) C06560Yg.A02(inflate, R.id.webview_title_container);
            this.A01 = viewGroup2;
            if (viewGroup2 != null) {
                C85814Hs.A00(viewGroup2, this, 8);
            }
            this.A09 = AnonymousClass0x7.A0L(inflate, R.id.website_url);
            A1Y();
            View A0E2 = C18280x3.A0E(inflate, R.id.wa_fcs_bottom_sheet_fragment_container);
            C08270df A0T = A0T();
            if (this.A06 != null) {
                C08240dc r33 = new C08240dc(A0T);
                FdsContentFragmentManager A002 = FdsContentFragmentManager.A00(A0H().getString("fds_observer_id"));
                r33.A0D(A002, "fds_content_manager", A0E2.getId());
                r33.A01();
                this.A0G = A002;
            }
            this.A00 = A0H().getInt("fcs_bottom_sheet_max_height_percentage");
            PercentageBasedMaxHeightLinearLayout percentageBasedMaxHeightLinearLayout = (PercentageBasedMaxHeightLinearLayout) inflate.findViewById(R.id.fcs_bottom_sheet);
            if (percentageBasedMaxHeightLinearLayout != null) {
                percentageBasedMaxHeightLinearLayout.A00 = this.A00;
            }
            this.A0O = A0H().getBoolean("fcs_show_divider_under_nav_bar");
            C18280x3.A0E(inflate, R.id.divider_under_nav_bar).setVisibility(AnonymousClass001.A08(this.A0O ? 1 : 0));
            if (this instanceof PhoenixExtensionsBottomSheetContainer) {
                PhoenixExtensionsBottomSheetContainer phoenixExtensionsBottomSheetContainer = (PhoenixExtensionsBottomSheetContainer) this;
                ExtensionsInitialLoadingView extensionsInitialLoadingView = new ExtensionsInitialLoadingView(phoenixExtensionsBottomSheetContainer.A0G());
                extensionsInitialLoadingView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                phoenixExtensionsBottomSheetContainer.A02 = extensionsInitialLoadingView;
                FrameLayout frameLayout = (FrameLayout) C18280x3.A0E(inflate, R.id.optional_loading_view_container);
                frameLayout.setVisibility(0);
                frameLayout.addView(extensionsInitialLoadingView);
                this.A02 = frameLayout;
            }
            return inflate;
        }
        throw C18270x1.A0S("whatsAppLocale");
    }

    public void A0q(Bundle bundle) {
        C162457s7.A0J(bundle, 0);
        bundle.putString("fds_state_name", this.A0N);
        bundle.putString("fds_on_back", this.A0K);
        bundle.putString("fds_on_back_params", this.A0M);
        bundle.putString("fds_button_style", this.A0J);
        bundle.putString("fds_observer_id", this.A0L);
        bundle.putInt("fcs_bottom_sheet_max_height_percentage", this.A00);
        bundle.putBoolean("fcs_show_divider_under_nav_bar", this.A0O);
        super.A0q(bundle);
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        C54522or r2 = this.A0D;
        if (r2 != null) {
            r2.A00(new C85744Hl(this, 16), C69373Wt.class, this);
        }
        A13(true);
    }

    public void A0x(Menu menu) {
        C162457s7.A0J(menu, 0);
    }

    public boolean A1B(MenuItem menuItem) {
        C162457s7.A0J(menuItem, 0);
        C191959Hf r0 = this.A0I;
        if (r0 != null && r0.BXQ(menuItem)) {
            return true;
        }
        C08310eF A0B2 = A0T().A0B(R.id.wa_fcs_bottom_sheet_fragment_container);
        if (A0B2 == null || !A0B2.A1B(menuItem)) {
            return false;
        }
        return true;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C54522or r1;
        C162457s7.A0J(dialogInterface, 0);
        if (this.A0Q && (r1 = this.A0D) != null) {
            r1.A01(new C69313Wn());
        }
        super.onDismiss(dialogInterface);
    }

    public final void A1X() {
        C131266dJ r1;
        AnonymousClass49F r0 = this.A0A;
        C835248t r2 = null;
        if (r0 != null) {
            r1 = r0.B3o();
        } else {
            r1 = null;
        }
        AnonymousClass49I r02 = this.A0B;
        if (r02 != null) {
            r2 = r02.B3r();
        }
        if (r1 == null || r2 == null) {
            C18270x1.A0p(this.A02);
            C54522or r4 = this.A0D;
            if (r4 != null) {
                r4.A01(new C197989eC(this.A0K, true, this.A0M));
                return;
            }
            return;
        }
        AnonymousClass8DJ.A07(r2, r1).run();
    }

    public final void A1Y() {
        AnonymousClass0x2.A0x(this.A05);
        this.A0B = null;
        C50042hX r0 = this.A0H;
        if (r0 != null) {
            r0.A01(A0G(), this.A05, new C69493Xf(this), this.A0N, this.A0M, this.A0J);
            return;
        }
        throw C18270x1.A0S("phoenixNavigationBarHelper");
    }

    public void Bnb(boolean z) {
    }

    public void Bnc(boolean z) {
        ProgressBar progressBar = this.A04;
        if (progressBar != null) {
            progressBar.setVisibility(AnonymousClass001.A08(z ? 1 : 0));
        }
        A13(!z);
        A0R().invalidateOptionsMenu();
    }

    public void A0a() {
        super.A0a();
        AnonymousClass9RA r0 = this.A0F;
        if (r0 != null) {
            r0.A00();
            C54522or r02 = this.A0D;
            if (r02 != null) {
                r02.A03(this);
            }
            this.A0D = null;
            return;
        }
        throw C18270x1.A0S("bkPendingScreenTransitionCallbacks");
    }

    public void A0c() {
        super.A0c();
        this.A05 = null;
        this.A03 = null;
        this.A08 = null;
        this.A04 = null;
        this.A0G = null;
        this.A0I = null;
        this.A02 = null;
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        A1M(0, R.style.f12nameremoved);
        String string = A0H().getString("fds_observer_id");
        if (string != null) {
            C60482yd r0 = this.A0E;
            if (r0 != null) {
                this.A0D = r0.A02(string);
                return;
            }
            throw C18270x1.A0S("uiObserversFactory");
        }
    }

    public void A0y(Menu menu, MenuInflater menuInflater) {
        C18260x0.A0O(menu, menuInflater);
        menu.clear();
        C191959Hf r0 = this.A0I;
        if (r0 != null) {
            r0.BQQ(menu);
        }
        C08310eF A0B2 = A0T().A0B(R.id.wa_fcs_bottom_sheet_fragment_container);
        if (A0B2 != null) {
            A0B2.A0y(menu, menuInflater);
        }
    }

    public int A1H() {
        return R.style.f12nameremoved;
    }

    public Dialog A1J(Bundle bundle) {
        Dialog A1J = super.A1J(bundle);
        C162457s7.A0K(A1J, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        AnonymousClass4SH r4 = (AnonymousClass4SH) A1J;
        C44052Um r3 = this.A06;
        if (r3 != null) {
            C003203q A0R = A0R();
            C79763x9 r1 = new C79763x9(this);
            C162457s7.A0J(r4, 1);
            r4.setOnShowListener(new AnonymousClass37G(A0R, r4, r3, r1));
            r4.setOnKeyListener(new AnonymousClass4JL(this, 4));
            return r4;
        }
        throw C18270x1.A0S("bottomSheetDragBehavior");
    }
}
