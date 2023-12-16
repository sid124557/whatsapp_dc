package com.whatsapp.extensions.webview.view;

import X.AnonymousClass0R8;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass1VX;
import X.AnonymousClass32Y;
import X.AnonymousClass37G;
import X.AnonymousClass42H;
import X.AnonymousClass42I;
import X.AnonymousClass42J;
import X.AnonymousClass4JL;
import X.AnonymousClass4K2;
import X.AnonymousClass4SH;
import X.C003203q;
import X.C009707r;
import X.C06560Yg;
import X.C08310eF;
import X.C111095hX;
import X.C162457s7;
import X.C175728Zm;
import X.C18270x1;
import X.C18290x4;
import X.C18310x6;
import X.C29041iB;
import X.C29441ip;
import X.C44052Um;
import X.C50312hy;
import X.C53602nM;
import X.C56422rx;
import X.C56952sp;
import X.C58422vE;
import X.C60032xt;
import X.C620733j;
import X.C624134x;
import X.C635339p;
import X.C66433Lk;
import X.C66543Lv;
import X.C78403ux;
import X.C86264Jl;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.extensions.bloks.viewmodel.WaFlowsViewModel;
import com.whatsapp.extensions.phoenix.view.ExtensionsInitialLoadingView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wabloks.ui.PercentageBasedMaxHeightLinearLayout;

public final class FlowsWebBottomSheetContainer extends Hilt_FlowsWebBottomSheetContainer {
    public LinearLayout A00;
    public RelativeLayout A01;
    public Toolbar A02;
    public C111095hX A03;
    public C44052Um A04;
    public C29441ip A05;
    public C56422rx A06;
    public C53602nM A07;
    public C60032xt A08;
    public C620733j A09;
    public C66543Lv A0A;
    public C29041iB A0B;
    public WaFlowsViewModel A0C;
    public C50312hy A0D;
    public ExtensionsInitialLoadingView A0E;
    public AnonymousClass1VX A0F;
    public UserJid A0G;
    public C66433Lk A0H;
    public String A0I;
    public boolean A0J = true;
    public boolean A0K;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        View A0I2 = C18310x6.A0I(layoutInflater, viewGroup, R.layout.f8nameremoved, false);
        A1I().setOnKeyListener(new AnonymousClass4JL(this, 2));
        this.A01 = (RelativeLayout) C06560Yg.A02(A0I2, R.id.toolbar_layout);
        this.A02 = (Toolbar) C06560Yg.A02(A0I2, R.id.flows_bottom_sheet_toolbar);
        C003203q A0Q = A0Q();
        C162457s7.A0K(A0Q, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        C009707r r1 = (C009707r) A0Q;
        r1.setSupportActionBar(this.A02);
        AnonymousClass0R8 supportActionBar = r1.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0Q(false);
        }
        Toolbar toolbar = this.A02;
        if (toolbar != null) {
            C620733j r2 = this.A09;
            if (r2 != null) {
                toolbar.setNavigationIcon((Drawable) AnonymousClass0x7.A0J(A0G(), r2, R.drawable.vec_ic_close_24));
            } else {
                throw C18270x1.A0S("whatsAppLocale");
            }
        }
        Toolbar toolbar2 = this.A02;
        if (toolbar2 != null) {
            toolbar2.setNavigationOnClickListener(new C635339p((Object) this, 27));
        }
        this.A00 = (LinearLayout) C06560Yg.A02(A0I2, R.id.flows_web_view_container);
        this.A0E = (ExtensionsInitialLoadingView) C06560Yg.A02(A0I2, R.id.flows_initial_view);
        AnonymousClass0x2.A0x(this.A02);
        Toolbar toolbar3 = this.A02;
        if (toolbar3 != null) {
            toolbar3.setNavigationOnClickListener(new C635339p((Object) this, 28));
        }
        WaFlowsViewModel waFlowsViewModel = this.A0C;
        if (waFlowsViewModel == null) {
            throw C18270x1.A0S("waFlowsViewModel");
        }
        AnonymousClass4K2.A00(this, waFlowsViewModel.A03, new AnonymousClass42H(this), 120);
        Window window = A1I().getWindow();
        if (window != null) {
            window.setSoftInputMode(16);
        }
        return A0I2;
    }

    public void A0w(Bundle bundle, View view) {
        String str;
        ExtensionsInitialLoadingView extensionsInitialLoadingView;
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        UserJid userJid = this.A0G;
        if (!(userJid == null || (str = this.A0I) == null || (extensionsInitialLoadingView = this.A0E) == null)) {
            extensionsInitialLoadingView.setupFooter(userJid, str);
        }
        WaFlowsViewModel waFlowsViewModel = this.A0C;
        if (waFlowsViewModel == null) {
            throw C18270x1.A0S("waFlowsViewModel");
        }
        AnonymousClass4K2.A00(this, waFlowsViewModel.A04, new AnonymousClass42I(this), 118);
        WaFlowsViewModel waFlowsViewModel2 = this.A0C;
        if (waFlowsViewModel2 == null) {
            throw C18270x1.A0S("waFlowsViewModel");
        }
        AnonymousClass4K2.A00(this, waFlowsViewModel2.A02, new AnonymousClass42J(this), 119);
    }

    public void A0y(Menu menu, MenuInflater menuInflater) {
        boolean A1Y = AnonymousClass0x2.A1Y(menu, menuInflater);
        boolean z = this.A0K;
        int i = R.string.f11nameremoved;
        if (z) {
            i = R.string.f11nameremoved;
        }
        C18290x4.A1E(menu, A1Y ? 1 : 0, i);
        menu.add(0, 2, 0, C08310eF.A09(this).getString(R.string.f11nameremoved)).setShowAsAction(0);
    }

    public boolean A1B(MenuItem menuItem) {
        C162457s7.A0J(menuItem, 0);
        int itemId = menuItem.getItemId();
        if (itemId != 1) {
            if (itemId == 2) {
                A1Y();
            }
            return false;
        }
        A1b("extensions_help");
        return false;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C162457s7.A0J(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        C18310x6.A1A(this);
    }

    public void A0g() {
        AnonymousClass1VX r2 = this.A0F;
        if (r2 != null) {
            ((PercentageBasedMaxHeightLinearLayout) C06560Yg.A02(A0J(), R.id.flows_bottom_sheet)).A00 = r2.A0O(C58422vE.A02, 3319);
            super.A0g();
            return;
        }
        throw C18270x1.A0R();
    }

    public final void A1Y() {
        UserJid A012;
        Bundle bundle = this.A06;
        if (bundle != null && (A012 = AnonymousClass32Y.A01(bundle)) != null) {
            C29041iB r0 = this.A0B;
            if (r0 != null) {
                r0.A08().A03(new C86264Jl(this, 6, A012));
                return;
            }
            throw C18270x1.A0S("companionDeviceManager");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        A1b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1Z(android.webkit.WebMessagePort r5, org.json.JSONObject r6) {
        /*
            r4 = this;
            java.lang.String r0 = "ExtensionsLogger/FlowsWebBottomSheetContainer/onWebBridgeAPICallback()"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            java.lang.String r0 = "method"
            java.lang.String r2 = r6.optString(r0)
            java.lang.String r0 = "data"
            org.json.JSONObject r1 = r6.optJSONObject(r0)
            if (r2 == 0) goto L_0x001b
            int r0 = r2.hashCode()
            switch(r0) {
                case -1245310213: goto L_0x002a;
                case -1169841072: goto L_0x0036;
                case -111710694: goto L_0x0041;
                case -17437989: goto L_0x004d;
                case 1004141592: goto L_0x005b;
                case 1911526633: goto L_0x0094;
                default: goto L_0x001b;
            }
        L_0x001b:
            X.0ni r3 = X.AnonymousClass0IT.A00(r4)
            r2 = 0
            com.whatsapp.extensions.webview.view.FlowsWebBottomSheetContainer$onWebBridgeAPICallback$1 r1 = new com.whatsapp.extensions.webview.view.FlowsWebBottomSheetContainer$onWebBridgeAPICallback$1
            r1.<init>(r5, r4, r2, r6)
            r0 = 3
            X.C616131n.A02(r2, r1, r3, r2, r0)
        L_0x0029:
            return
        L_0x002a:
            java.lang.String r0 = "WAExtensionsSpamReport"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x001b
            r4.A1Y()
            return
        L_0x0036:
            java.lang.String r0 = "WAExtensionsContextualHelp"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x001b
            java.lang.String r0 = "extensions_help"
            goto L_0x0057
        L_0x0041:
            java.lang.String r0 = "WAExtensionsClose"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x001b
            X.C18310x6.A1A(r4)
            return
        L_0x004d:
            java.lang.String r0 = "WAExtensionsLearnMore"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x001b
            java.lang.String r0 = "extensions_learn_more"
        L_0x0057:
            r4.A1b(r0)
            return
        L_0x005b:
            java.lang.String r0 = "WAExtensionsConfigureNavBar"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x001b
            if (r1 == 0) goto L_0x0092
            java.lang.String r0 = "is_hidden"
            boolean r3 = r1.optBoolean(r0)
        L_0x006b:
            android.widget.RelativeLayout r1 = r4.A01
            r2 = 0
            if (r1 == 0) goto L_0x0079
            r0 = r3 ^ 1
            int r0 = X.AnonymousClass001.A08(r0)
            r1.setVisibility(r0)
        L_0x0079:
            com.whatsapp.extensions.phoenix.view.ExtensionsInitialLoadingView r1 = r4.A0E
            if (r1 == 0) goto L_0x0086
            r0 = r3 ^ 1
            int r0 = X.AnonymousClass001.A08(r0)
            r1.setVisibility(r0)
        L_0x0086:
            android.widget.LinearLayout r0 = r4.A00
            if (r0 == 0) goto L_0x0029
            if (r3 != 0) goto L_0x008e
            r2 = 8
        L_0x008e:
            r0.setVisibility(r2)
            return
        L_0x0092:
            r3 = 0
            goto L_0x006b
        L_0x0094:
            java.lang.String r0 = "WAExtensionsSetDraggable"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x001b
            if (r1 == 0) goto L_0x00a7
            java.lang.String r0 = "is_draggable"
            boolean r0 = r1.optBoolean(r0)
        L_0x00a4:
            r4.A0J = r0
            return
        L_0x00a7:
            r0 = 1
            goto L_0x00a4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.extensions.webview.view.FlowsWebBottomSheetContainer.A1Z(android.webkit.WebMessagePort, org.json.JSONObject):void");
    }

    public final void A1a(String str) {
        ExtensionsInitialLoadingView extensionsInitialLoadingView = this.A0E;
        if (extensionsInitialLoadingView != null) {
            if (str == null) {
                str = C08310eF.A09(this).getString(R.string.f11nameremoved);
                C162457s7.A0D(str);
            }
            extensionsInitialLoadingView.setErrorMessage(str);
        }
        AnonymousClass0x2.A0x(this.A01);
        C18270x1.A0p(this.A00);
    }

    public final void A1b(String str) {
        if (this.A0K) {
            C53602nM r1 = this.A07;
            if (r1 != null) {
                r1.A01(A0R(), str);
                return;
            }
            throw C18270x1.A0S("contextualHelpHandler");
        }
        String str2 = this.A0I;
        if (str2 != null) {
            C111095hX r3 = this.A03;
            if (r3 != null) {
                Context A0G2 = A0G();
                C66433Lk r0 = this.A0H;
                if (r0 != null) {
                    r3.BkW(A0G2, r0.A03(str2), (C624134x) null);
                    return;
                }
                throw C18270x1.A0S("faqLinkFactory");
            }
            throw C18270x1.A0S("activityUtils");
        }
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        this.A0C = (WaFlowsViewModel) C18290x4.A0O(this).A01(WaFlowsViewModel.class);
        Bundle bundle2 = this.A06;
        UserJid userJid = null;
        if (bundle2 != null) {
            userJid = AnonymousClass32Y.A01(bundle2);
        }
        this.A0G = userJid;
        AnonymousClass1VX r1 = this.A0F;
        if (r1 != null) {
            C58422vE r2 = C58422vE.A02;
            this.A0I = r1.A0R(r2, 2069);
            AnonymousClass1VX r12 = this.A0F;
            if (r12 != null) {
                boolean A0Y = r12.A0Y(r2, 4393);
                boolean z = false;
                if (A0Y) {
                    AnonymousClass1VX r13 = this.A0F;
                    if (r13 == null) {
                        throw C18270x1.A0R();
                    } else if (C175728Zm.A0S(C56952sp.A08(r13, 3063), "extensions_help", false)) {
                        z = true;
                    }
                }
                this.A0K = z;
                A13(true);
                return;
            }
            throw C18270x1.A0R();
        }
        throw C18270x1.A0R();
    }

    public int A1H() {
        return R.style.f12nameremoved;
    }

    public Dialog A1J(Bundle bundle) {
        Dialog A1J = super.A1J(bundle);
        C162457s7.A0K(A1J, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        AnonymousClass4SH r4 = (AnonymousClass4SH) A1J;
        C44052Um r3 = this.A04;
        if (r3 != null) {
            C003203q A0R = A0R();
            C78403ux r1 = new C78403ux(this);
            C162457s7.A0J(r4, 1);
            r4.setOnShowListener(new AnonymousClass37G(A0R, r4, r3, r1));
            return r4;
        }
        throw C18270x1.A0S("bottomSheetDragBehavior");
    }
}
