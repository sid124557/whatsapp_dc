package com.whatsapp.payments.phoenix.webview.fragment;

import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass1VX;
import X.AnonymousClass21V;
import X.AnonymousClass2PM;
import X.AnonymousClass3Z6;
import X.AnonymousClass4FT;
import X.AnonymousClass4G9;
import X.C003203q;
import X.C08310eF;
import X.C159127lA;
import X.C161447pg;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C18300x5;
import X.C18320x8;
import X.C19100yl;
import X.C197949e8;
import X.C44522Wj;
import X.C52632ln;
import X.C54522or;
import X.C58342v6;
import X.C60482yd;
import X.C624635d;
import X.C66433Lk;
import X.C69333Wp;
import X.C69343Wq;
import X.C72043d5;
import X.C73813g7;
import X.C84734Dm;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.extensions.phoenix.webview.FcsExtensionsWebViewFragment;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FcsWebViewFragment extends Hilt_FcsWebViewFragment implements AnonymousClass4FT {
    public int A00 = -1;
    public C19100yl A01;
    public AnonymousClass1VX A02;
    public C44522Wj A03;
    public C66433Lk A04;
    public C54522or A05;
    public C60482yd A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public HashMap A0C;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0099, code lost:
        if (r9 == null) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009f, code lost:
        if (r7.A1O(r9) != false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a1, code lost:
        com.whatsapp.util.Log.e("callback output payload doesn't have allowed types");
        r0 = "phoenix-webview-payload-definition-error";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A0K(android.os.Bundle r13, android.view.LayoutInflater r14, android.view.ViewGroup r15) {
        /*
            r12 = this;
            r5 = 0
            X.C162457s7.A0J(r14, r5)
            r0 = 2131624915(0x7f0e03d3, float:1.8877023E38)
            android.view.View r6 = r14.inflate(r0, r15, r5)
            r0 = 2131434903(0x7f0b1d97, float:1.8491633E38)
            android.view.View r0 = X.C18280x3.A0E(r6, r0)
            com.whatsapp.webview.ui.WebViewWrapperView r0 = (com.whatsapp.webview.ui.WebViewWrapperView) r0
            r0.setWebViewDelegate(r12)
            X.0yl r0 = r0.A02
            r12.A01 = r0
            java.lang.String r0 = r12.A0A
            java.lang.String r11 = "launchURL"
            if (r0 != 0) goto L_0x0026
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r11)
            throw r0
        L_0x0026:
            android.net.Uri r10 = X.C624635d.A01(r0)
            X.C162457s7.A0D(r10)
            java.util.HashMap r9 = r12.A0C
            r7 = r12
            boolean r0 = r12 instanceof com.whatsapp.extensions.phoenix.webview.FcsExtensionsWebViewFragment
            if (r0 == 0) goto L_0x00c2
            com.whatsapp.extensions.phoenix.webview.FcsExtensionsWebViewFragment r7 = (com.whatsapp.extensions.phoenix.webview.FcsExtensionsWebViewFragment) r7
            X.1VX r2 = r7.A02
            if (r2 == 0) goto L_0x00bd
            r1 = 5326(0x14ce, float:7.463E-42)
            X.2vE r0 = X.C58422vE.A02
            java.lang.String r1 = r2.A0R(r0, r1)
            X.C162457s7.A0H(r1)
            java.lang.String r0 = ","
            java.util.List r0 = X.AnonymousClass2AB.A02(r1, r0)
            java.util.ArrayList r2 = X.C73783g4.A0c(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0053:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0065
            java.lang.String r0 = X.AnonymousClass001.A0m(r1)
            java.lang.String r0 = X.AnonymousClass2AB.A00(r0)
            r2.add(r0)
            goto L_0x0053
        L_0x0065:
            boolean r0 = r2.isEmpty()
            r8 = 1
            if (r0 != 0) goto L_0x00b4
            java.util.Iterator r4 = r2.iterator()
        L_0x0070:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00b4
            java.lang.String r3 = X.AnonymousClass001.A0m(r4)
            java.lang.String r2 = r10.getHost()
            if (r2 == 0) goto L_0x00ac
            boolean r0 = r2.equals(r3)
            if (r0 != 0) goto L_0x0099
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            r0 = 46
            java.lang.String r0 = X.AnonymousClass0x2.A0e(r3, r1, r0)
            X.C162457s7.A0J(r0, r8)
            boolean r0 = r2.endsWith(r0)
            if (r0 == 0) goto L_0x0070
        L_0x0099:
            if (r9 == 0) goto L_0x00c2
            boolean r0 = r7.A1O(r9)
            if (r0 != 0) goto L_0x00c2
            java.lang.String r0 = "callback output payload doesn't have allowed types"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r0 = "phoenix-webview-payload-definition-error"
        L_0x00a9:
            r7.A1M(r0)
        L_0x00ac:
            X.3d5 r0 = X.C72043d5.A00()
            r12.A1K(r0, r5)
            return r6
        L_0x00b4:
            java.lang.String r0 = "Flows WebView cannot be loaded. Host not allowed."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r0 = "phoenix-webview-host-not-allowed-error"
            goto L_0x00a9
        L_0x00bd:
            java.lang.RuntimeException r0 = X.C18270x1.A0R()
            throw r0
        L_0x00c2:
            X.0yl r0 = r12.A01
            if (r0 == 0) goto L_0x00ce
            r1 = 1
            android.webkit.WebSettings r0 = r0.getSettings()
            r0.setJavaScriptEnabled(r1)
        L_0x00ce:
            java.lang.String r0 = r12.A0A
            r3 = 0
            if (r0 != 0) goto L_0x00d8
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r11)
            throw r0
        L_0x00d8:
            android.net.Uri r2 = X.C624635d.A01(r0)
            X.2if r1 = new X.2if
            r1.<init>()
            java.lang.String r0 = "https"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r1.A02(r0)
            java.lang.String[] r0 = X.AnonymousClass0x9.A1Y()
            if (r2 == 0) goto L_0x00f4
            java.lang.String r3 = r2.getHost()
        L_0x00f4:
            r0[r5] = r3
            r1.A01(r0)
            X.2UQ r2 = r1.A00()
            X.C162457s7.A0D(r2)
            X.2ej r1 = new X.2ej
            r1.<init>()
            java.util.List r0 = r1.A00
            r0.add(r2)
            X.2gN r1 = r1.A00()
            X.0yl r0 = r12.A01
            if (r0 == 0) goto L_0x0114
            r0.A01 = r1
        L_0x0114:
            java.lang.String r0 = ""
            r12.Bs3(r0)
            r12.Bs4(r0)
            java.lang.String r0 = r12.A0A
            if (r0 != 0) goto L_0x0125
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r11)
            throw r0
        L_0x0125:
            r12.A1J(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.phoenix.webview.fragment.FcsWebViewFragment.A0K(android.os.Bundle, android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    public void A0y(Menu menu, MenuInflater menuInflater) {
        C18270x1.A14(menu, menuInflater);
        menu.clear();
        C18290x4.A1E(menu, R.id.menuitem_webview_refresh, R.string.f11nameremoved);
        C18290x4.A1E(menu, R.id.menuitem_webview_learn_more, R.string.f11nameremoved);
        C18290x4.A1E(menu, R.id.menuitem_webview_open_in_browser, R.string.f11nameremoved);
        if (this instanceof FcsExtensionsWebViewFragment) {
            C18290x4.A1E(menu, -1, R.string.f11nameremoved);
            menu.add(0, 2, 0, C08310eF.A09(this).getString(R.string.f11nameremoved)).setShowAsAction(0);
        }
    }

    public void Bs3(String str) {
        C162457s7.A0J(str, 0);
        C54522or r1 = this.A05;
        if (r1 == null) {
            throw C18270x1.A0S("uiObserver");
        }
        r1.A01(new C197949e8(str));
    }

    public final void A1J(String str) {
        Bundle bundle = this.A06;
        if (bundle == null || !bundle.getBoolean("use_post_request")) {
            C19100yl r0 = this.A01;
            if (r0 != null) {
                r0.loadUrl(str);
                return;
            }
            return;
        }
        C19100yl r1 = this.A01;
        if (r1 != null) {
            String str2 = this.A07;
            if (str2 == null) {
                throw C18270x1.A0S("dataJson");
            }
            r1.postUrl(str, AnonymousClass0x2.A1a(str2));
        }
    }

    public final void A1K(Map map, boolean z) {
        C159127lA r1;
        AnonymousClass4G9 r0;
        Bs3("");
        Bs4("");
        if (this instanceof FcsExtensionsWebViewFragment) {
            if (z) {
                AnonymousClass3Z6[] r3 = new AnonymousClass3Z6[3];
                r3[0] = AnonymousClass3Z6.A02("action", A0H().getString("next_action"));
                AnonymousClass3Z6[] r4 = new AnonymousClass3Z6[2];
                AnonymousClass3Z6[] r8 = new AnonymousClass3Z6[2];
                AnonymousClass3Z6.A09(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A0H().getString("next_screen"), r8, 0);
                AnonymousClass3Z6.A09(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "screen", r8, 1);
                AnonymousClass3Z6.A09("next", C73813g7.A0F(r8), r4, 0);
                AnonymousClass3Z6.A09("data", map, r4, 1);
                AnonymousClass3Z6.A09("action_payload", C73813g7.A0F(r4), r3, 1);
                AnonymousClass3Z6.A09("current_screen", A0H().getString("current_screen"), r3, 2);
                map = C73813g7.A0F(r3);
            } else {
                map = C52632ln.A00(AnonymousClass21V.A02.key, A0H().getString("error_message"));
            }
        }
        AnonymousClass3Z6[] r2 = new AnonymousClass3Z6[3];
        AnonymousClass3Z6.A04("resource_output", map, r2);
        AnonymousClass3Z6.A05("status", Boolean.valueOf(z), r2);
        AnonymousClass3Z6.A06("callback_index", Integer.valueOf(this.A00), r2);
        Map A0F = C73813g7.A0F(r2);
        C44522Wj r12 = this.A03;
        if (r12 != null) {
            String str = this.A09;
            if (str == null) {
                throw C18270x1.A0S("fdsManagerId");
            }
            C161447pg A002 = r12.A00(str);
            if (A002 != null && (r1 = A002.A00) != null && (r0 = (AnonymousClass4G9) r1.A00("open_web_view")) != null) {
                r0.B3J(A0F);
                return;
            }
            return;
        }
        throw C18270x1.A0S("fdsManagerRegistry");
    }

    public /* synthetic */ boolean BHO(String str) {
        return false;
    }

    public void Bfk(String str) {
    }

    public AnonymousClass2PM Bhh() {
        AnonymousClass2PM r1 = new C58342v6().A00;
        r1.A00 = 1;
        return r1;
    }

    public void Bs4(String str) {
        if (str != null) {
            C54522or r1 = this.A05;
            if (r1 == null) {
                throw C18270x1.A0S("uiObserver");
            }
            r1.A01(new C69343Wq(str));
        }
    }

    public void A0p(Bundle bundle) {
        String str;
        String str2;
        String str3;
        Serializable serializable;
        HashMap hashMap;
        String string;
        int i;
        String string2;
        String string3;
        super.A0p(bundle);
        Bundle bundle2 = this.A06;
        if (bundle2 == null || (str = bundle2.getString("url")) == null) {
            str = "about:blank";
        }
        this.A0A = str;
        Bundle bundle3 = this.A06;
        if (bundle3 != null) {
            str2 = bundle3.getString("success_url");
        } else {
            str2 = null;
        }
        String str4 = "";
        if (str2 == null) {
            str2 = str4;
        }
        this.A0B = str2;
        Bundle bundle4 = this.A06;
        if (bundle4 == null || (str3 = bundle4.getString("failure_url")) == null) {
            str3 = str4;
        }
        this.A08 = str3;
        Bundle bundle5 = this.A06;
        if (!(bundle5 == null || (string3 = bundle5.getString("post_data")) == null)) {
            str4 = string3;
        }
        this.A07 = str4;
        Bundle bundle6 = this.A06;
        if (bundle6 != null) {
            serializable = bundle6.getSerializable("callback_url_payload");
        } else {
            serializable = null;
        }
        if (serializable instanceof HashMap) {
            hashMap = (HashMap) serializable;
        } else {
            hashMap = null;
        }
        this.A0C = hashMap;
        Bundle bundle7 = this.A06;
        if (bundle7 == null || (string = bundle7.getString("fds_manager_id")) == null) {
            throw AnonymousClass001.A0e("'fds_manager_id' parameter not passed");
        }
        this.A09 = string;
        Bundle bundle8 = this.A06;
        if (bundle8 != null) {
            i = bundle8.getInt("callback_index");
        } else {
            i = -1;
        }
        this.A00 = i;
        Bundle bundle9 = this.A06;
        if (bundle9 == null || (string2 = bundle9.getString("fds_observer_id")) == null) {
            throw C18300x5.A0X();
        }
        C60482yd r0 = this.A06;
        if (r0 != null) {
            this.A05 = r0.A02(string2);
            return;
        }
        throw C18270x1.A0S("uiObserversFactory");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0085, code lost:
        if (X.C175728Zm.A0S(X.C56952sp.A08(r1, 3063), "extensions_help", false) == false) goto L_0x0087;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A1B(android.view.MenuItem r9) {
        /*
            r8 = this;
            int r1 = X.C18290x4.A04(r9)
            r0 = 2131431499(0x7f0b104b, float:1.8484729E38)
            r3 = 1
            if (r1 != r0) goto L_0x001d
            java.lang.String r0 = ""
            r8.Bs4(r0)
            X.0yl r0 = r8.A01
            if (r0 == 0) goto L_0x001c
            java.lang.String r0 = r0.getUrl()
            if (r0 == 0) goto L_0x001c
            r8.A1J(r0)
        L_0x001c:
            return r3
        L_0x001d:
            r0 = 2131431497(0x7f0b1049, float:1.8484725E38)
            java.lang.String r2 = "android.intent.action.VIEW"
            if (r1 != r0) goto L_0x0037
            X.3Lk r1 = r8.A04
            if (r1 == 0) goto L_0x004b
            java.lang.String r0 = "182446338158487"
            android.net.Uri r1 = r1.A03(r0)
        L_0x002e:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r2, r1)
            r8.A0m(r0)
            return r3
        L_0x0037:
            r0 = 2131431498(0x7f0b104a, float:1.8484727E38)
            if (r1 != r0) goto L_0x0052
            X.0yl r0 = r8.A01
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = r0.getUrl()
            if (r0 == 0) goto L_0x0052
            android.net.Uri r1 = X.C624635d.A01(r0)
            goto L_0x002e
        L_0x004b:
            java.lang.String r0 = "faqLinkFactory"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0052:
            r4 = r8
            boolean r0 = r8 instanceof com.whatsapp.extensions.phoenix.webview.FcsExtensionsWebViewFragment
            if (r0 == 0) goto L_0x00fe
            com.whatsapp.extensions.phoenix.webview.FcsExtensionsWebViewFragment r4 = (com.whatsapp.extensions.phoenix.webview.FcsExtensionsWebViewFragment) r4
            r7 = 0
            X.1VX r1 = r4.A02
            if (r1 == 0) goto L_0x00f9
            r0 = 2069(0x815, float:2.899E-42)
            java.lang.String r6 = X.C56952sp.A08(r1, r0)
            X.1VX r2 = r4.A02
            if (r2 == 0) goto L_0x00f4
            r1 = 4393(0x1129, float:6.156E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            r3 = 0
            r5 = 2
            if (r0 == 0) goto L_0x0087
            X.1VX r1 = r4.A02
            if (r1 == 0) goto L_0x00ef
            r0 = 3063(0xbf7, float:4.292E-42)
            java.lang.String r1 = X.C56952sp.A08(r1, r0)
            java.lang.String r0 = "extensions_help"
            boolean r0 = X.C175728Zm.A0S(r1, r0, r7)
            r2 = 1
            if (r0 != 0) goto L_0x0088
        L_0x0087:
            r2 = 0
        L_0x0088:
            int r1 = r9.getItemId()
            r0 = -1
            if (r1 == r0) goto L_0x00bc
            if (r1 != r5) goto L_0x00fe
            X.03q r0 = r4.A0Q()
            if (r0 == 0) goto L_0x00ba
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L_0x00ba
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto L_0x00ba
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass32Y.A01(r0)
            if (r3 == 0) goto L_0x00ba
            X.1iB r0 = r4.A05
            if (r0 == 0) goto L_0x00da
            X.3XA r2 = r0.A08()
            r1 = 5
            X.4Jl r0 = new X.4Jl
            r0.<init>(r4, r1, r3)
            r2.A03(r0)
        L_0x00ba:
            r0 = 1
            return r0
        L_0x00bc:
            if (r2 == 0) goto L_0x00d1
            java.lang.String r0 = "whatsapp://help/extensions_help"
            android.net.Uri r2 = android.net.Uri.parse(r0)
        L_0x00c5:
            X.5hX r1 = r4.A00
            if (r1 == 0) goto L_0x00e1
            android.content.Context r0 = r4.A0G()
            r1.BkW(r0, r2, r3)
            goto L_0x00ba
        L_0x00d1:
            X.3Lk r0 = r4.A04
            if (r0 == 0) goto L_0x00e8
            android.net.Uri r2 = r0.A03(r6)
            goto L_0x00c5
        L_0x00da:
            java.lang.String r0 = "companionDeviceManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00e1:
            java.lang.String r0 = "activityUtils"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00e8:
            java.lang.String r0 = "faqLinkFactory"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00ef:
            java.lang.RuntimeException r0 = X.C18270x1.A0R()
            throw r0
        L_0x00f4:
            java.lang.RuntimeException r0 = X.C18270x1.A0R()
            throw r0
        L_0x00f9:
            java.lang.RuntimeException r0 = X.C18270x1.A0R()
            throw r0
        L_0x00fe:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.phoenix.webview.fragment.FcsWebViewFragment.A1B(android.view.MenuItem):boolean");
    }

    public final boolean A1L(String str) {
        boolean A1V;
        if (str.length() == 0) {
            return false;
        }
        BVg(true, str);
        String str2 = this.A0B;
        if (str2 == null) {
            throw C18270x1.A0S("successURL");
        }
        if (str2.length() <= 0 || !str.startsWith(str2)) {
            String str3 = this.A08;
            if (str3 == null) {
                throw C18270x1.A0S("failureURL");
            } else if (str3.length() <= 0 || !str.startsWith(str3)) {
                return false;
            }
        } else {
            Uri A012 = C624635d.A01(str);
            HashMap A0t = AnonymousClass001.A0t();
            HashMap hashMap = this.A0C;
            C162457s7.A0H(A012);
            if (this instanceof FcsExtensionsWebViewFragment) {
                FcsExtensionsWebViewFragment fcsExtensionsWebViewFragment = (FcsExtensionsWebViewFragment) this;
                A1V = C18320x8.A1V(A012);
                if (hashMap != null) {
                    A1V = fcsExtensionsWebViewFragment.A1N(A012, A0t, hashMap);
                }
            } else {
                A1V = C18320x8.A1V(A012);
                Iterator<String> it = A012.getQueryParameterNames().iterator();
                while (it.hasNext()) {
                    String A0m = AnonymousClass001.A0m(it);
                    String queryParameter = A012.getQueryParameter(A0m);
                    if (queryParameter != null) {
                        A0t.put(A0m, queryParameter);
                    }
                }
            }
            if (A1V) {
                A1K(A0t, true);
                return true;
            }
        }
        A1K(C72043d5.A00(), false);
        return true;
    }

    public void B26(String str) {
        Bs4(str);
        if (str != null) {
            A1L(str);
        }
    }

    public void BVg(boolean z, String str) {
        C003203q A0Q = A0Q();
        if (A0Q instanceof C84734Dm) {
            ((C84734Dm) A0Q).Bnc(z);
        }
    }

    public void Bfl(int i, int i2, int i3, int i4) {
        C54522or r2;
        boolean z;
        if (i2 > 0) {
            if (i4 == 0) {
                r2 = this.A05;
                if (r2 == null) {
                    throw C18270x1.A0S("uiObserver");
                }
                z = true;
            } else {
                return;
            }
        } else if (i2 == 0 && i4 > 0) {
            r2 = this.A05;
            if (r2 == null) {
                throw C18270x1.A0S("uiObserver");
            }
            z = false;
        } else {
            return;
        }
        r2.A01(new C69333Wp(z));
    }

    public boolean BoK(String str) {
        return A1L(str);
    }

    public /* synthetic */ boolean BbY(ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return false;
    }
}
