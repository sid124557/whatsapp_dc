package com.whatsapp.extensions.phoenix.webview;

import X.AnonymousClass000;
import X.AnonymousClass0x2;
import X.AnonymousClass1VX;
import X.AnonymousClass4FS;
import X.C003203q;
import X.C111095hX;
import X.C162457s7;
import X.C18270x1;
import X.C29041iB;
import X.C50312hy;
import X.C53822nj;
import X.C55832qz;
import X.C56422rx;
import X.C58422vE;
import X.C60032xt;
import X.C66543Lv;
import X.C69263Wi;
import X.C73723fy;
import X.C73833g9;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class FcsExtensionsWebViewFragment extends Hilt_FcsExtensionsWebViewFragment {
    public static final Set A0A = C73833g9.A06("string", "integer", "boolean", "number");
    public C111095hX A00;
    public C69263Wi A01;
    public C56422rx A02;
    public C60032xt A03;
    public C66543Lv A04;
    public C29041iB A05;
    public C53822nj A06;
    public C50312hy A07;
    public C55832qz A08;
    public AnonymousClass4FS A09;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        C53822nj r0 = this.A06;
        if (r0 != null) {
            r0.A01(AnonymousClass0x2.A0T(), "WEBVIEW", (String) null, (String) null, (String) null);
            return super.A0K(bundle, layoutInflater, viewGroup);
        }
        throw C18270x1.A0S("wamExtensionScreenProgressReporter");
    }

    public final void A1M(String str) {
        AnonymousClass1VX r2 = this.A02;
        if (r2 == null) {
            throw C18270x1.A0R();
        } else if (r2.A0Y(C58422vE.A02, 5910)) {
            C60032xt r0 = this.A03;
            if (r0 != null) {
                C003203q A0Q = A0Q();
                C66543Lv r3 = this.A04;
                if (r3 != null) {
                    C56422rx r22 = this.A02;
                    if (r22 != null) {
                        C50312hy r4 = this.A07;
                        if (r4 != null) {
                            r0.A01(A0Q, r22, r3, r4, str, (String) null);
                            return;
                        }
                        throw C18270x1.A0S("wamExtensionsStructuredMessageInteractionReporter");
                    }
                    throw C18270x1.A0S("verifiedNameManager");
                }
                throw C18270x1.A0S("coreMessageStore");
            }
            throw C18270x1.A0S("extensionsDataUtil");
        }
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A1N(android.net.Uri r8, java.util.HashMap r9, java.util.Map r10) {
        /*
            r7 = this;
            java.util.Iterator r6 = X.AnonymousClass000.A0q(r10)
        L_0x0004:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0093
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r6)
            java.lang.String r3 = X.C18310x6.A0q(r0)
            java.lang.Object r4 = r0.getValue()
            boolean r0 = r4 instanceof java.util.Map
            r5 = 0
            java.lang.String r2 = "phoenix-webview-payload-validation-error"
            if (r0 == 0) goto L_0x003d
            java.util.HashMap r0 = X.AnonymousClass001.A0t()
            r9.put(r3, r0)
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r1 = r9.get(r3)
            java.lang.String r0 = "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Any> }"
            X.C162457s7.A0K(r1, r0)
            java.util.HashMap r1 = (java.util.HashMap) r1
            boolean r0 = r7.A1N(r8, r1, r4)
            if (r0 != 0) goto L_0x0004
        L_0x0039:
            r7.A1M(r2)
            return r5
        L_0x003d:
            java.lang.String r1 = r8.getQueryParameter(r3)
            if (r1 == 0) goto L_0x0039
            java.lang.String r0 = "integer"
            boolean r0 = X.C162457s7.A0P(r4, r0)
            if (r0 == 0) goto L_0x0052
            java.lang.Integer r1 = X.C829745q.A06(r1)
        L_0x004f:
            if (r1 != 0) goto L_0x0083
            goto L_0x0039
        L_0x0052:
            java.lang.String r0 = "number"
            boolean r0 = X.C162457s7.A0P(r4, r0)
            if (r0 == 0) goto L_0x0070
            r4 = 0
            X.5rB r0 = X.C39192Ba.A00     // Catch:{ NumberFormatException -> 0x006e }
            java.util.regex.Pattern r0 = r0.nativePattern     // Catch:{ NumberFormatException -> 0x006e }
            boolean r0 = X.C18280x3.A1X(r1, r0)     // Catch:{ NumberFormatException -> 0x006e }
            if (r0 == 0) goto L_0x0039
            double r0 = java.lang.Double.parseDouble(r1)     // Catch:{ NumberFormatException -> 0x006e }
            java.lang.Double r4 = java.lang.Double.valueOf(r0)     // Catch:{ NumberFormatException -> 0x006e }
        L_0x006e:
            r1 = r4
            goto L_0x004f
        L_0x0070:
            java.lang.String r0 = "boolean"
            boolean r0 = X.C162457s7.A0P(r4, r0)
            if (r0 == 0) goto L_0x0083
            java.lang.String r0 = "true"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0088
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
        L_0x0083:
            r9.put(r3, r1)
            goto L_0x0004
        L_0x0088:
            java.lang.String r0 = "false"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0039
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L_0x0083
        L_0x0093:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.extensions.phoenix.webview.FcsExtensionsWebViewFragment.A1N(android.net.Uri, java.util.HashMap, java.util.Map):boolean");
    }

    public final boolean A1O(Map map) {
        boolean A0U;
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Object A0W = AnonymousClass0x2.A0W(A0q);
            if (A0W instanceof Map) {
                A0U = A1O((Map) A0W);
                continue;
            } else {
                A0U = C73723fy.A0U(A0A, A0W);
                continue;
            }
            if (!A0U) {
                return false;
            }
        }
        return true;
    }
}
