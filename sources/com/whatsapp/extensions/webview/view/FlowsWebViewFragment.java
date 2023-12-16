package com.whatsapp.extensions.webview.view;

import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass1Uc;
import X.AnonymousClass1VX;
import X.AnonymousClass26o;
import X.AnonymousClass2PM;
import X.AnonymousClass2UQ;
import X.AnonymousClass42K;
import X.AnonymousClass4FT;
import X.AnonymousClass4JP;
import X.AnonymousClass4K2;
import X.C06560Yg;
import X.C08310eF;
import X.C105895Wv;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18290x4;
import X.C19100yl;
import X.C48332ej;
import X.C49342gN;
import X.C50722if;
import X.C58342v6;
import X.C624635d;
import X.C628737b;
import X.C80623yX;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import com.whatsapp.R;
import com.whatsapp.extensions.bloks.viewmodel.WaFlowsViewModel;
import com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository;
import com.whatsapp.webview.ui.WebViewWrapperView;

public final class FlowsWebViewFragment extends Hilt_FlowsWebViewFragment implements AnonymousClass4FT {
    public C19100yl A00;
    public WaFlowsViewModel A01;
    public AnonymousClass1Uc A02;
    public FlowsWebBottomSheetContainer A03;
    public AnonymousClass1VX A04;
    public C105895Wv A05;
    public WebViewWrapperView A06;
    public String A07;
    public final ViewTreeObserver.OnGlobalLayoutListener A08 = new AnonymousClass4JP(this, 1);

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FlowsWebBottomSheetContainer flowsWebBottomSheetContainer;
        C162457s7.A0J(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        C08310eF r1 = this.A0E;
        C19100yl r2 = null;
        if ((r1 instanceof FlowsWebBottomSheetContainer) && (flowsWebBottomSheetContainer = (FlowsWebBottomSheetContainer) r1) != null) {
            this.A03 = flowsWebBottomSheetContainer;
        }
        WebViewWrapperView webViewWrapperView = (WebViewWrapperView) C06560Yg.A02(inflate, R.id.webview_wrapper_view);
        this.A06 = webViewWrapperView;
        if (webViewWrapperView != null) {
            webViewWrapperView.setWebViewDelegate(this);
        }
        WebViewWrapperView webViewWrapperView2 = this.A06;
        if (webViewWrapperView2 != null) {
            r2 = webViewWrapperView2.A02;
        }
        this.A00 = r2;
        if (r2 != null) {
            r2.getSettings().setJavaScriptEnabled(true);
        }
        C19100yl r0 = this.A00;
        if (r0 != null) {
            r0.getViewTreeObserver().addOnGlobalLayoutListener(this.A08);
        }
        String str = this.A07;
        String str2 = null;
        if (str == null) {
            throw C18270x1.A0S("launchURL");
        }
        Uri A012 = C624635d.A01(str);
        C50722if r22 = new C50722if();
        r22.A02("https");
        String[] A1Y = AnonymousClass0x9.A1Y();
        if (A012 != null) {
            str2 = A012.getHost();
        }
        A1Y[0] = str2;
        r22.A01(A1Y);
        AnonymousClass2UQ A002 = r22.A00();
        C162457s7.A0D(A002);
        C48332ej r12 = new C48332ej();
        r12.A00.add(A002);
        C49342gN A003 = r12.A00();
        C19100yl r02 = this.A00;
        if (r02 != null) {
            r02.A01 = A003;
        }
        WaFlowsViewModel waFlowsViewModel = this.A01;
        if (waFlowsViewModel == null) {
            throw C18270x1.A0S("waFlowsViewModel");
        }
        AnonymousClass4K2.A00(A0V(), waFlowsViewModel.A00, new AnonymousClass42K(this), 121);
        String str3 = this.A07;
        if (str3 == null) {
            throw C18270x1.A0S("launchURL");
        }
        C19100yl r03 = this.A00;
        if (r03 != null) {
            r03.loadUrl(str3);
        }
        C162457s7.A0H(inflate);
        return inflate;
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        WebViewWrapperView webViewWrapperView = this.A06;
        if (webViewWrapperView != null) {
            C18270x1.A0p(webViewWrapperView.A01);
        }
    }

    public void A0c() {
        ViewTreeObserver viewTreeObserver;
        C19100yl r0 = this.A00;
        if (!(r0 == null || (viewTreeObserver = r0.getViewTreeObserver()) == null)) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.A08);
        }
        super.A0c();
    }

    public /* synthetic */ void B26(String str) {
    }

    public /* synthetic */ boolean BHO(String str) {
        return false;
    }

    public void Bfk(String str) {
        FlowsWebBottomSheetContainer flowsWebBottomSheetContainer = this.A03;
        if (flowsWebBottomSheetContainer != null) {
            C18260x0.A0r("ExtensionsLogger/FlowsWebBottomSheetContainer/onWebViewFatalError -- ", str, AnonymousClass001.A0o());
            flowsWebBottomSheetContainer.A1a((String) null);
        }
    }

    public AnonymousClass2PM Bhh() {
        AnonymousClass2PM r1 = new C58342v6().A00;
        r1.A01 = false;
        return r1;
    }

    public boolean BoK(String str) {
        return false;
    }

    public void Bs3(String str) {
    }

    public void Bs4(String str) {
    }

    public void A0p(Bundle bundle) {
        String str;
        super.A0p(bundle);
        this.A01 = (WaFlowsViewModel) C18290x4.A0O(this).A01(WaFlowsViewModel.class);
        Bundle bundle2 = this.A06;
        if (bundle2 == null || (str = bundle2.getString("url")) == null) {
            str = "about:blank";
        }
        this.A07 = str;
    }

    public void BVg(boolean z, String str) {
        AnonymousClass1Uc r2 = this.A02;
        if (r2 != null) {
            WaFlowsViewModel waFlowsViewModel = this.A01;
            if (z) {
                if (waFlowsViewModel == null) {
                    throw C18270x1.A0S("waFlowsViewModel");
                }
                r2.A09(Integer.valueOf(FlowsWebViewDataRepository.A00(waFlowsViewModel)), "html_start");
                C19100yl r22 = this.A00;
                if (r22 != null) {
                    WaFlowsViewModel waFlowsViewModel2 = this.A01;
                    if (waFlowsViewModel2 == null) {
                        throw C18270x1.A0S("waFlowsViewModel");
                    } else if (waFlowsViewModel2.A04.A07() != null) {
                        AnonymousClass26o.A00(new C80623yX(r22, new C628737b(this.A03)));
                    }
                }
            } else if (waFlowsViewModel == null) {
                throw C18270x1.A0S("waFlowsViewModel");
            } else {
                r2.A09(Integer.valueOf(FlowsWebViewDataRepository.A00(waFlowsViewModel)), "html_end");
            }
        } else {
            throw C18270x1.A0S("extensionsScreenNavigationLogger");
        }
    }

    public /* synthetic */ void Bfl(int i, int i2, int i3, int i4) {
    }

    public /* synthetic */ boolean BbY(ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return false;
    }
}
