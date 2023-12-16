package com.whatsapp.status;

import X.AnonymousClass0GH;
import X.AnonymousClass4FS;
import X.C15110qn;
import X.C15910sA;
import X.C18260x0;
import X.C55152pt;
import X.C620233e;
import X.C69263Wi;
import X.C71293bs;
import androidx.lifecycle.OnLifecycleEvent;

public final class StatusExpirationLifecycleOwner implements C15110qn {
    public final C69263Wi A00;
    public final C55152pt A01;
    public final C620233e A02;
    public final AnonymousClass4FS A03;
    public final Runnable A04 = new C71293bs((Object) this, 32);

    public final void A00() {
        this.A00.A0R(this.A04);
        C71293bs.A00(this.A03, this, 33);
    }

    @OnLifecycleEvent(AnonymousClass0GH.ON_DESTROY)
    public final void onDestroy() {
        this.A00.A0R(this.A04);
    }

    public StatusExpirationLifecycleOwner(C15910sA r3, C69263Wi r4, C55152pt r5, C620233e r6, AnonymousClass4FS r7) {
        C18260x0.A0e(r4, r7, r6, r5);
        this.A00 = r4;
        this.A03 = r7;
        this.A02 = r6;
        this.A01 = r5;
        r3.getLifecycle().A00(this);
    }

    @OnLifecycleEvent(AnonymousClass0GH.ON_START)
    public final void onStart() {
        A00();
    }
}
