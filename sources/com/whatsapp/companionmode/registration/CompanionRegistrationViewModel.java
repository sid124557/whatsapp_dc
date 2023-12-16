package com.whatsapp.companionmode.registration;

import X.AnonymousClass08M;
import X.AnonymousClass0x9;
import X.AnonymousClass4FS;
import X.AnonymousClass4UC;
import X.C05550Ty;
import X.C06270Wx;
import X.C18260x0;
import X.C47872dy;
import X.C56242rf;
import X.C69963Zi;
import X.C91754l1;

public final class CompanionRegistrationViewModel extends C05550Ty {
    public final C06270Wx A00;
    public final C06270Wx A01;
    public final C06270Wx A02;
    public final AnonymousClass08M A03;
    public final C47872dy A04;
    public final C56242rf A05;
    public final AnonymousClass4UC A06;
    public final AnonymousClass4UC A07;
    public final AnonymousClass4FS A08;

    public void A0C() {
        C47872dy r2 = this.A04;
        r2.A00().A0E(this.A05);
        r2.A00().A0B();
    }

    public CompanionRegistrationViewModel(C47872dy r3, AnonymousClass4FS r4) {
        C18260x0.A0Q(r4, r3);
        this.A08 = r4;
        this.A04 = r3;
        AnonymousClass08M A012 = AnonymousClass08M.A01();
        this.A03 = A012;
        this.A00 = A012;
        AnonymousClass4UC A0b = AnonymousClass0x9.A0b();
        this.A06 = A0b;
        this.A01 = A0b;
        AnonymousClass4UC A0b2 = AnonymousClass0x9.A0b();
        this.A07 = A0b2;
        this.A02 = A0b2;
        C91754l1 r1 = new C91754l1(this);
        this.A05 = r1;
        r3.A00().A0D(r1);
        r4.BkP(new C69963Zi(this, 34));
    }
}
