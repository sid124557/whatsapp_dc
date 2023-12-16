package com.whatsapp.chatlock;

import X.AnonymousClass08M;
import X.AnonymousClass31A;
import X.AnonymousClass4FS;
import X.AnonymousClass5UK;
import X.C05550Ty;
import X.C106995aW;
import X.C117665sI;
import X.C18260x0;
import X.C56522s7;
import X.C56982ss;

public final class ChatLockAuthViewModel extends C05550Ty {
    public AnonymousClass31A A00;
    public final AnonymousClass08M A01 = AnonymousClass08M.A01();
    public final AnonymousClass08M A02 = AnonymousClass08M.A01();
    public final AnonymousClass08M A03 = AnonymousClass08M.A01();
    public final C106995aW A04;
    public final AnonymousClass5UK A05;
    public final C56982ss A06;
    public final C56522s7 A07;
    public final AnonymousClass4FS A08;

    public final void A0D(boolean z) {
        AnonymousClass31A r3 = this.A00;
        if (r3 != null) {
            this.A08.BkM(new C117665sI(this, r3, 14, z));
        }
    }

    public ChatLockAuthViewModel(C106995aW r2, AnonymousClass5UK r3, C56982ss r4, C56522s7 r5, AnonymousClass4FS r6) {
        C18260x0.A0f(r6, r4, r5, r2, r3);
        this.A08 = r6;
        this.A06 = r4;
        this.A07 = r5;
        this.A04 = r2;
        this.A05 = r3;
    }
}
