package com.whatsapp.expressionstray.gifs;

import X.AnonymousClass08M;
import X.AnonymousClass0IV;
import X.AnonymousClass20D;
import X.AnonymousClass2GI;
import X.AnonymousClass3OY;
import X.AnonymousClass4AL;
import X.C05550Ty;
import X.C133886i6;
import X.C162457s7;
import X.C18260x0;
import X.C18330xA;
import X.C41562Ks;
import X.C45952aq;
import X.C49872hE;
import X.C55922r8;
import X.C616131n;
import X.C84814Du;
import X.C85474Gj;
import X.C85494Gl;
import X.C85534Gq;
import java.util.concurrent.CancellationException;

public final class GifExpressionsSearchViewModel extends C05550Ty {
    public C85474Gj A00;
    public C85474Gj A01;
    public final AnonymousClass08M A02;
    public final AnonymousClass08M A03 = AnonymousClass08M.A01();
    public final C45952aq A04;
    public final C41562Ks A05;
    public final C55922r8 A06;
    public final AnonymousClass4AL A07;
    public final C85534Gq A08;

    public void A0C() {
        C49872hE r2 = (C49872hE) this.A03.A07();
        if (r2 != null) {
            AnonymousClass4AL r1 = this.A07;
            C162457s7.A0J(r1, 0);
            r2.A03.remove(r1);
        }
    }

    public final void A0D(String str) {
        this.A02.A0H(C133886i6.A00);
        C85474Gj r0 = this.A01;
        if (r0 != null) {
            r0.AyX((CancellationException) null);
        }
        this.A01 = C616131n.A02((C85494Gl) null, new GifExpressionsSearchViewModel$runSearch$1(this, str, (C84814Du) null), AnonymousClass0IV.A00(this), (AnonymousClass20D) null, 3);
    }

    public GifExpressionsSearchViewModel(AnonymousClass2GI r2, C45952aq r3, C41562Ks r4, C55922r8 r5) {
        C18260x0.A0c(r2, r5, r4, r3);
        this.A06 = r5;
        this.A05 = r4;
        this.A04 = r3;
        this.A08 = r2.A00;
        this.A02 = C18330xA.A01(C133886i6.A00);
        this.A07 = new AnonymousClass3OY(this);
    }
}
