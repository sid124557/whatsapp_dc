package com.whatsapp.settings;

import X.AnonymousClass0x9;
import X.AnonymousClass4FS;
import X.AnonymousClass4UC;
import X.C05550Ty;
import X.C06270Wx;
import X.C18260x0;
import X.C42712Pf;
import X.C97034xW;

public final class SettingsAccountViewModel extends C05550Ty {
    public final C06270Wx A00;
    public final C97034xW A01;
    public final C42712Pf A02;
    public final AnonymousClass4UC A03;
    public final AnonymousClass4FS A04;

    public void A0C() {
        this.A01.A07(this);
    }

    public SettingsAccountViewModel(C97034xW r2, C42712Pf r3, AnonymousClass4FS r4) {
        C18260x0.A0V(r4, r2, r3);
        this.A04 = r4;
        this.A01 = r2;
        this.A02 = r3;
        AnonymousClass4UC A0b = AnonymousClass0x9.A0b();
        this.A03 = A0b;
        this.A00 = A0b;
        r2.A06(this);
    }
}
