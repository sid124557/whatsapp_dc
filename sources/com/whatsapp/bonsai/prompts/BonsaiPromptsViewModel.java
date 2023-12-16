package com.whatsapp.bonsai.prompts;

import X.AnonymousClass107;
import X.AnonymousClass4FS;
import X.AnonymousClass4L0;
import X.C05550Ty;
import X.C124166Bf;
import X.C18260x0;
import X.C183538qC;
import X.C29431io;
import X.C54002o1;
import X.C56382rt;
import X.C621033m;
import X.C72023d3;
import X.C73723fy;
import X.C95814uZ;

public final class BonsaiPromptsViewModel extends C05550Ty {
    public C95814uZ A00;
    public final C124166Bf A01 = new C124166Bf(this, 2);
    public final C621033m A02;
    public final C29431io A03;
    public final C56382rt A04;
    public final AnonymousClass107 A05 = AnonymousClass4L0.A0O(C72023d3.A00);
    public final AnonymousClass4FS A06;
    public final C183538qC A07;
    public volatile C54002o1 A08;

    public void A0C() {
        C29431io r2 = this.A03;
        Iterable A052 = r2.A05();
        C124166Bf r1 = this.A01;
        if (C73723fy.A0U(A052, r1)) {
            r2.A07(r1);
        }
    }

    public BonsaiPromptsViewModel(C621033m r3, C29431io r4, C56382rt r5, AnonymousClass4FS r6, C183538qC r7) {
        C18260x0.A0f(r6, r5, r3, r4, r7);
        this.A06 = r6;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
        this.A07 = r7;
    }
}
