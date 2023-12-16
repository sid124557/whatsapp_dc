package com.whatsapp.calling.callgrid.viewmodel;

import X.AnonymousClass08M;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass4UC;
import X.AnonymousClass4VK;
import X.AnonymousClass5NO;
import X.AnonymousClass5ZG;
import X.AnonymousClass5ZU;
import X.AnonymousClass7HF;
import X.C18330xA;
import X.C51932kc;
import X.C56972sr;
import X.C64773Ex;
import X.C97174xk;
import com.whatsapp.jid.UserJid;

public class MenuBottomSheetViewModel extends AnonymousClass4VK {
    public int A00;
    public AnonymousClass7HF A01;
    public UserJid A02;
    public final AnonymousClass08M A03 = C18330xA.A01((Object) null);
    public final AnonymousClass08M A04 = C18330xA.A01((Object) null);
    public final C56972sr A05;
    public final AnonymousClass5NO A06;
    public final AnonymousClass5ZG A07;
    public final C97174xk A08;
    public final C64773Ex A09;
    public final AnonymousClass5ZU A0A;
    public final AnonymousClass1VX A0B;
    public final C51932kc A0C;
    public final AnonymousClass4UC A0D = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A0E = AnonymousClass0x9.A0b();

    public void A0C() {
        this.A08.A07(this);
    }

    public MenuBottomSheetViewModel(C56972sr r3, AnonymousClass5NO r4, AnonymousClass5ZG r5, C97174xk r6, C64773Ex r7, AnonymousClass5ZU r8, AnonymousClass1VX r9, C51932kc r10) {
        this.A0B = r9;
        this.A05 = r3;
        this.A08 = r6;
        this.A09 = r7;
        this.A0A = r8;
        this.A07 = r5;
        this.A06 = r4;
        this.A0C = r10;
        r6.A06(this);
        AnonymousClass4VK.A02(r6, this);
    }
}
