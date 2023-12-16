package com.whatsapp.xfamily.accountlinking.ui;

import X.AnonymousClass0x7;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass21S;
import X.AnonymousClass2XF;
import X.AnonymousClass31C;
import X.AnonymousClass3Z6;
import X.AnonymousClass4KX;
import X.AnonymousClass5H8;
import X.AnonymousClass5NM;
import X.C1000759i;
import X.C104745Se;
import X.C107695bk;
import X.C111135hb;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C35341wi;
import X.C35711xJ;
import X.C389129u;
import X.C41032Ir;
import X.C41952Mf;
import X.C48792fU;
import X.C56042rK;
import X.C64333Db;
import X.C69263Wi;
import X.C71453c8;
import X.C88834as;
import X.C89644eZ;
import X.C97134xg;
import android.net.Uri;
import android.os.Bundle;
import com.whatsapp.R;

public final class AccountLinkingWebAuthActivity extends C89644eZ {
    public static final AnonymousClass21S A0B = AnonymousClass21S.A03;
    public C97134xg A00;
    public C41952Mf A01;
    public AnonymousClass2XF A02;
    public AnonymousClass5H8 A03;
    public C56042rK A04;
    public C111135hb A05;
    public C104745Se A06;
    public AnonymousClass3Z6 A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;

    public final void A74(C1000759i r9, C48792fU r10, Integer num, Integer num2) {
        this.A05.A0S(new C71453c8(this, num, num2, r9, r10, 18));
    }

    public void A5r() {
        if (!this.A09) {
            this.A09 = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r3 = A0I.A4Z;
            AnonymousClass1Hf.A2G(r3, this);
            C107695bk r2 = r3.A00;
            AnonymousClass1Ha.A23(r3, r2, r2, this);
            AnonymousClass1Ha.A24(r3, this);
            this.A06 = (C104745Se) r3.Abv.get();
            this.A04 = (C56042rK) r3.AEv.get();
            this.A01 = A0I.ADO();
            this.A00 = (C97134xg) r2.A0E.get();
            this.A02 = new AnonymousClass2XF(new C389129u());
            this.A05 = (C111135hb) r3.Ac5.get();
            this.A03 = r2.AQK();
        }
    }

    public AccountLinkingWebAuthActivity(int i) {
        this.A09 = false;
        AnonymousClass1Hf.A2D(this, 116);
    }

    public void onCreate(Bundle bundle) {
        Uri data;
        Uri data2;
        super.onCreate(bundle);
        C104745Se r0 = this.A06;
        if (r0 == null) {
            throw C18270x1.A0S("xFamilyGating");
        } else if (!r0.A00() || !(((data = getIntent().getData()) == null || data.getHost() == null) && ((data2 = getIntent().getData()) == null || data2.getScheme() == null))) {
            finish();
        } else if (!this.A07.A0F()) {
            A74((C1000759i) null, (C48792fU) null, AnonymousClass0x7.A0f(), (Integer) null);
        } else {
            C69263Wi r02 = this.A05;
            C162457s7.A0C(r02);
            C48792fU r1 = new C48792fU(r02);
            r1.A01(R.string.f11nameremoved);
            AnonymousClass5H8 r03 = this.A03;
            if (r03 != null) {
                AnonymousClass5NM r2 = new AnonymousClass5NM(this, r1);
                AnonymousClass31C r3 = r03.A00;
                String A032 = r3.A03();
                C35711xJ r04 = new C35711xJ(new C35341wi(new C35341wi(A032, 2)));
                r3.A0E(new AnonymousClass4KX(r04, r2), C41032Ir.A05(r04), A032, 366, 10000);
                return;
            }
            throw C18270x1.A0S("webAuthTokensFetcher");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNewIntent(android.content.Intent r13) {
        /*
            r12 = this;
            super.onNewIntent(r13)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AccountLinkingWebAuthActivity/isValidRequest Calling pkg:"
            r1.append(r0)
            java.lang.String r0 = r12.getCallingPackage()
            X.C18270x1.A1G(r1, r0)
            X.3Z6 r0 = r12.A07
            r1 = 0
            if (r0 != 0) goto L_0x0021
            java.lang.String r0 = "Detected invalid entry point into web auth. No tokens available. Exiting early"
            X.C106245Ye.A02(r0, r1)
        L_0x001d:
            r12.finish()
        L_0x0020:
            return
        L_0x0021:
            if (r13 == 0) goto L_0x0020
            android.net.Uri r2 = r13.getData()
            if (r2 == 0) goto L_0x0020
            java.lang.String r0 = "token"
            java.lang.String r10 = r2.getQueryParameter(r0)
            java.lang.String r0 = "blob"
            java.lang.String r6 = r2.getQueryParameter(r0)
            java.lang.String r1 = r2.getScheme()
            java.lang.String r0 = "wa-xf-login"
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x0020
            java.lang.String r1 = r2.getHost()
            java.lang.String r0 = "sso"
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x0020
            if (r10 == 0) goto L_0x0020
            if (r6 == 0) goto L_0x0020
            java.lang.String r0 = "AccountLinkingWebAuthActivity/onNewIntent Received deep link redirect from login page"
            X.C106245Ye.A00(r0)
            X.5Se r0 = r12.A06
            if (r0 == 0) goto L_0x0134
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x001d
            X.2rK r1 = r12.A04
            if (r1 == 0) goto L_0x012d
            X.21S r0 = X.AnonymousClass21S.A03
            r1.A02(r0)
            r0 = 1
            r12.A08 = r0
            X.5hb r1 = r12.A05
            if (r1 == 0) goto L_0x0125
            java.lang.String r0 = "TAP_WEB_AUTH_AGREE"
            r1.A05(r0)
            X.3Wi r0 = r12.A05
            X.C162457s7.A0C(r0)
            X.2fU r3 = new X.2fU
            r3.<init>(r0)
            r0 = 2131886292(0x7f1200d4, float:1.9407159E38)
            r3.A01(r0)
            X.3Z6 r0 = r12.A07
            if (r0 == 0) goto L_0x011e
            java.lang.Object r2 = r0.first
            java.lang.String r2 = (java.lang.String) r2
            boolean r5 = X.C18290x4.A1W(r2)
            int r1 = r10.length()
            r11 = 1
            if (r1 == 0) goto L_0x0107
            int r0 = r6.length()
            if (r0 == 0) goto L_0x0107
            r0 = 16
            if (r1 == r0) goto L_0x00bc
            java.lang.String r0 = "TokensValidator/isTokenValid t1_hash length is not 16"
        L_0x00a7:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00aa:
            java.lang.String r0 = "AccountLinkingWebAuthActivity/handleRedirectUriDeepLink Invalid token hash received in Web auth redirect URI"
            r1 = 0
            X.C106245Ye.A02(r0, r1)
            r3.A00()
            X.4xg r0 = r12.A00
            if (r0 == 0) goto L_0x010a
            r0.A08(r1, r1, r1, r5)
            goto L_0x001d
        L_0x00bc:
            java.security.MessageDigest r1 = X.AnonymousClass0x7.A0t()     // Catch:{ NoSuchAlgorithmException -> 0x0100 }
            byte[] r0 = X.AnonymousClass0x2.A1a(r2)     // Catch:{ NoSuchAlgorithmException -> 0x0100 }
            byte[] r9 = r1.digest(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0100 }
            X.C162457s7.A0H(r9)     // Catch:{ NoSuchAlgorithmException -> 0x0100 }
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()     // Catch:{ NoSuchAlgorithmException -> 0x0100 }
            int r7 = r9.length     // Catch:{ NoSuchAlgorithmException -> 0x0100 }
            r4 = 0
        L_0x00d1:
            if (r4 >= r7) goto L_0x00ef
            byte r1 = r9[r4]     // Catch:{ NoSuchAlgorithmException -> 0x0100 }
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ NoSuchAlgorithmException -> 0x0100 }
            java.lang.Object[] r0 = new java.lang.Object[r11]     // Catch:{ NoSuchAlgorithmException -> 0x0100 }
            X.C18310x6.A1T(r0, r1, r5)     // Catch:{ NoSuchAlgorithmException -> 0x0100 }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r11)     // Catch:{ NoSuchAlgorithmException -> 0x0100 }
            java.lang.String r0 = "%02x"
            java.lang.String r0 = java.lang.String.format(r2, r0, r1)     // Catch:{ NoSuchAlgorithmException -> 0x0100 }
            X.C162457s7.A0D(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0100 }
            r8.append(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0100 }
            int r4 = r4 + 1
            goto L_0x00d1
        L_0x00ef:
            java.lang.String r0 = X.C18290x4.A0o(r8)     // Catch:{ NoSuchAlgorithmException -> 0x0100 }
            boolean r0 = r0.startsWith(r10)     // Catch:{ NoSuchAlgorithmException -> 0x0100 }
            if (r0 == 0) goto L_0x00fa
            goto L_0x0111
        L_0x00fa:
            java.lang.String r0 = "TokensValidator/isTokenValid hash of token1 does not match t1_hash received in deeplink"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ NoSuchAlgorithmException -> 0x0100 }
            goto L_0x00aa
        L_0x0100:
            r1 = move-exception
            java.lang.String r0 = "TokensValidator/isTokenValid error while calculating token hash"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x00aa
        L_0x0107:
            java.lang.String r0 = "TokensValidator/isTokenValid t1_hash or blob received in deeplink are empty"
            goto L_0x00a7
        L_0x010a:
            java.lang.String r0 = "accountLinkingResultObservers"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0111:
            java.lang.String r0 = "AccountLinkingWebAuthActivity/handleRedirectUriDeepLink Exchanging token and blob for access token"
            X.C106245Ye.A00(r0)
            X.4FS r1 = r12.A04
            r0 = 22
            X.C71403c3.A00(r1, r12, r3, r6, r0)
            return
        L_0x011e:
            java.lang.String r0 = "AccountLinkingWebAuthActivity/handleRedirectUriDeepLink Token pair cannot be null"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0125:
            java.lang.String r0 = "xFamilyUserFlowLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x012d:
            java.lang.String r0 = "fbAccountManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0134:
            java.lang.String r0 = "xFamilyGating"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity.onNewIntent(android.content.Intent):void");
    }

    public void onResume() {
        super.onResume();
        if (this.A0A) {
            if (!this.A08) {
                C111135hb r2 = this.A05;
                if (r2 != null) {
                    C56042rK r1 = this.A04;
                    if (r1 != null) {
                        r2.A06("is_account_linked", Boolean.valueOf(r1.A05(AnonymousClass21S.A03)));
                        C111135hb r12 = this.A05;
                        if (r12 != null) {
                            r12.A04("EXIT_WEB_AUTH");
                        } else {
                            throw C18270x1.A0S("xFamilyUserFlowLogger");
                        }
                    } else {
                        throw C18270x1.A0S("fbAccountManager");
                    }
                } else {
                    throw C18270x1.A0S("xFamilyUserFlowLogger");
                }
            }
            finish();
        }
    }

    public AccountLinkingWebAuthActivity() {
        this(0);
    }
}
