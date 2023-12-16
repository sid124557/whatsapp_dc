package com.whatsapp.bonsai.discovery;

import X.AnonymousClass08J;
import X.AnonymousClass08M;
import X.AnonymousClass0x7;
import X.AnonymousClass33R;
import X.AnonymousClass40M;
import X.AnonymousClass4FS;
import X.AnonymousClass4FV;
import X.AnonymousClass4K2;
import X.AnonymousClass66R;
import X.C05550Ty;
import X.C154517dI;
import X.C18260x0;
import X.C183538qC;
import X.C383026z;
import X.C64773Ex;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

public final class BonsaiDiscoveryViewModel extends C05550Ty {
    public final AnonymousClass08J A00;
    public final AnonymousClass08M A01 = AnonymousClass08M.A01();
    public final AnonymousClass08M A02 = AnonymousClass08M.A01();
    public final AnonymousClass33R A03;
    public final C64773Ex A04;
    public final AnonymousClass4FV A05;
    public final AnonymousClass4FS A06;
    public final C183538qC A07;
    public final AtomicInteger A08 = new AtomicInteger(0);
    public final AnonymousClass66R A09 = C154517dI.A01(AnonymousClass40M.A00);

    public final void A0D() {
        AtomicInteger atomicInteger = this.A08;
        if (atomicInteger.get() >= 3 || atomicInteger.getAndIncrement() >= 3) {
            Log.d("bonsaidiscoveryviewmodel/scheduleprewarm/give up");
            AnonymousClass0x7.A18(this.A01);
            return;
        }
        this.A03.A03();
    }

    public BonsaiDiscoveryViewModel(AnonymousClass33R r5, C64773Ex r6, AnonymousClass4FV r7, AnonymousClass4FS r8, C183538qC r9) {
        C18260x0.A0f(r8, r7, r6, r5, r9);
        this.A06 = r8;
        this.A05 = r7;
        this.A04 = r6;
        this.A03 = r5;
        this.A07 = r9;
        AnonymousClass08J r3 = new AnonymousClass08J();
        this.A00 = r3;
        AnonymousClass4K2.A01(r5.A00, r3, new C383026z(this, 1), 11);
    }
}
