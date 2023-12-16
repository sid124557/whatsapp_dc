package com.whatsapp.calling.callscreen.viewmodel;

import X.AnonymousClass0x9;
import X.AnonymousClass107;
import X.AnonymousClass1VX;
import X.AnonymousClass4L0;
import X.AnonymousClass4UC;
import X.AnonymousClass4VK;
import X.AnonymousClass5ZU;
import X.C152327Yl;
import X.C158297jk;
import X.C162457s7;
import X.C18260x0;
import X.C56572sD;
import X.C64773Ex;
import X.C66493Lq;
import X.C97174xk;
import com.whatsapp.util.Log;

public final class CallScreenViewModel extends AnonymousClass4VK {
    public final C97174xk A00;
    public final C64773Ex A01;
    public final AnonymousClass5ZU A02;
    public final AnonymousClass1VX A03;
    public final C66493Lq A04;
    public final C56572sD A05;
    public final AnonymousClass107 A06 = AnonymousClass4L0.A0O(new C158297jk((C152327Yl) null));
    public final AnonymousClass4UC A07 = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A08 = AnonymousClass0x9.A0b();

    public void A0C() {
        Log.d("CallScreenViewModel onCleared, cleaning up");
        this.A00.A07(this);
    }

    public CallScreenViewModel(C97174xk r3, C64773Ex r4, AnonymousClass5ZU r5, AnonymousClass1VX r6, C66493Lq r7, C56572sD r8) {
        C18260x0.A0f(r6, r8, r3, r4, r5);
        C162457s7.A0J(r7, 6);
        this.A03 = r6;
        this.A05 = r8;
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = r5;
        this.A04 = r7;
        r3.A06(this);
        AnonymousClass4VK.A02(r3, this);
    }
}
