package com.whatsapp.status.advertise;

import X.AnonymousClass08M;
import X.AnonymousClass0XV;
import X.AnonymousClass33p;
import X.AnonymousClass4C1;
import X.AnonymousClass4FS;
import X.AnonymousClass4FW;
import X.AnonymousClass4qA;
import X.AnonymousClass66R;
import X.C05550Ty;
import X.C06270Wx;
import X.C103445Mz;
import X.C116985rC;
import X.C120255yI;
import X.C120265yJ;
import X.C124166Bf;
import X.C154517dI;
import X.C18260x0;
import X.C72023d3;
import X.C86604Kt;
import java.util.List;

public final class AdvertiseViewModel extends C05550Ty {
    public AnonymousClass33p A00;
    public AnonymousClass4qA A01;
    public List A02 = C72023d3.A00;
    public final C06270Wx A03;
    public final AnonymousClass08M A04;
    public final AnonymousClass0XV A05;
    public final C116985rC A06;
    public final AnonymousClass4FW A07;
    public final AnonymousClass4FS A08;
    public final AnonymousClass4C1 A09;
    public final AnonymousClass66R A0A;
    public final AnonymousClass66R A0B = C154517dI.A01(new C120265yJ(this));

    public final void A0D() {
        C86604Kt.A1R(this.A01);
        AnonymousClass4qA r2 = (AnonymousClass4qA) this.A09.get();
        C103445Mz.A01(r2, (C103445Mz) this.A0A.getValue(), this, 2);
        this.A01 = r2;
    }

    public AdvertiseViewModel(AnonymousClass0XV r3, C116985rC r4, AnonymousClass33p r5, AnonymousClass4FS r6, AnonymousClass4C1 r7) {
        C18260x0.A0c(r6, r7, r5, r3);
        this.A08 = r6;
        this.A09 = r7;
        this.A00 = r5;
        this.A05 = r3;
        this.A06 = r4;
        AnonymousClass08M A012 = AnonymousClass08M.A01();
        this.A04 = A012;
        this.A03 = A012;
        this.A07 = new C124166Bf(this, 21);
        this.A0A = C154517dI.A01(new C120255yI(this));
    }
}
