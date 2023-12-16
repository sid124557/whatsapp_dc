package com.whatsapp.bonsai.embodiment;

import X.AnonymousClass08M;
import X.AnonymousClass107;
import X.AnonymousClass1VX;
import X.AnonymousClass4FS;
import X.AnonymousClass4L0;
import X.AnonymousClass66R;
import X.C05550Ty;
import X.C117125rQ;
import X.C117175rV;
import X.C118945wB;
import X.C118955wC;
import X.C154517dI;
import X.C18260x0;
import X.C18290x4;
import X.C183538qC;
import X.C29431io;
import X.C69263Wi;
import X.C73723fy;
import X.C86164Jb;
import X.C95814uZ;
import com.whatsapp.jid.UserJid;

public final class BotEmbodimentViewModel extends C05550Ty {
    public UserJid A00;
    public final AnonymousClass08M A01 = AnonymousClass08M.A01();
    public final AnonymousClass08M A02 = AnonymousClass08M.A01();
    public final C86164Jb A03 = new C86164Jb(this, 0);
    public final C69263Wi A04;
    public final C29431io A05;
    public final AnonymousClass1VX A06;
    public final AnonymousClass107 A07 = AnonymousClass4L0.A0O(C18290x4.A0Z());
    public final AnonymousClass4FS A08;
    public final C183538qC A09;
    public final Runnable A0A = new C117125rQ(this, 10);
    public final Runnable A0B = new C117125rQ(this, 9);
    public final AnonymousClass66R A0C = C154517dI.A01(new C118945wB(this));
    public final AnonymousClass66R A0D = C154517dI.A01(new C118955wC(this));

    public void A0C() {
        C29431io r2 = this.A05;
        Iterable A052 = r2.A05();
        C86164Jb r1 = this.A03;
        if (C73723fy.A0U(A052, r1)) {
            r2.A07(r1);
        }
    }

    public final void A0D(C95814uZ r4) {
        if (r4 instanceof UserJid) {
            C29431io r2 = this.A05;
            Iterable A052 = r2.A05();
            C86164Jb r1 = this.A03;
            if (!C73723fy.A0U(A052, r1)) {
                r2.A06(r1);
            }
            this.A00 = (UserJid) r4;
            this.A08.BkP(new C117175rV(this, 32, r4));
        }
    }

    public BotEmbodimentViewModel(C69263Wi r3, C29431io r4, AnonymousClass1VX r5, AnonymousClass4FS r6, C183538qC r7) {
        C18260x0.A0f(r5, r3, r6, r4, r7);
        this.A06 = r5;
        this.A04 = r3;
        this.A08 = r6;
        this.A05 = r4;
        this.A09 = r7;
    }
}
