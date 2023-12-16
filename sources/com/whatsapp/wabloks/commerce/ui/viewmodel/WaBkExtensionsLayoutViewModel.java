package com.whatsapp.wabloks.commerce.ui.viewmodel;

import X.AnonymousClass0x9;
import X.AnonymousClass10r;
import X.AnonymousClass1VX;
import X.AnonymousClass3Z6;
import X.AnonymousClass4UC;
import X.C18260x0;
import X.C18300x5;
import X.C183538qC;
import X.C27091dG;
import X.C29441ip;
import X.C52692lt;
import X.C57162tC;
import X.C73723fy;
import com.whatsapp.R;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public final class WaBkExtensionsLayoutViewModel extends AnonymousClass10r {
    public String A00;
    public final C29441ip A01;
    public final C57162tC A02;
    public final AnonymousClass1VX A03;
    public final AnonymousClass4UC A04 = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A05 = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A06 = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A07 = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A08 = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A09 = AnonymousClass0x9.A0b();

    public final void A0G(C27091dG r5, String str, String str2, String str3, boolean z) {
        int i;
        Map map;
        Set keySet;
        AnonymousClass4UC r2;
        AnonymousClass4UC r22;
        Object r1;
        Map map2;
        Collection values;
        if (str2 == null || str2.length() == 0) {
            String str4 = null;
            if (str != null) {
                r22 = this.A08;
                r1 = AnonymousClass3Z6.A02(str, "extensions-invalid-flow-token-error");
            } else {
                if (!(r5 == null || (map2 = r5.A00) == null || (values = map2.values()) == null || values.isEmpty())) {
                    str4 = C73723fy.A00(values).toString();
                }
                if (!this.A01.A0F()) {
                    i = R.string.f11nameremoved;
                    str3 = "extensions-no-network-error";
                } else if (r5 == null || (map = r5.A00) == null || (keySet = map.keySet()) == null || !C18300x5.A1X(keySet, 2498058)) {
                    i = R.string.f11nameremoved;
                } else {
                    i = R.string.f11nameremoved;
                    str3 = "extensions-timeout-error";
                }
                if (z) {
                    r2 = this.A06;
                } else {
                    r2 = this.A07;
                }
                r1 = new C52692lt(i, str3, str4);
            }
        } else {
            if (z) {
                r22 = this.A09;
            } else {
                r22 = this.A05;
            }
            r1 = AnonymousClass3Z6.A02(str2, str3);
        }
        r22.A0H(r1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaBkExtensionsLayoutViewModel(C29441ip r2, C57162tC r3, AnonymousClass1VX r4, C183538qC r5) {
        super(r5);
        C18260x0.A0c(r5, r2, r3, r4);
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }
}
