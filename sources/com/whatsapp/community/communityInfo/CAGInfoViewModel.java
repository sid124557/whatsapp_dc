package com.whatsapp.community.communityInfo;

import X.AnonymousClass08J;
import X.AnonymousClass0x9;
import X.AnonymousClass10x;
import X.AnonymousClass1NS;
import X.AnonymousClass31A;
import X.AnonymousClass3ZH;
import X.AnonymousClass4AQ;
import X.AnonymousClass4AS;
import X.AnonymousClass4FS;
import X.AnonymousClass4UC;
import X.AnonymousClass5ZU;
import X.AnonymousClass66R;
import X.C05550Ty;
import X.C106995aW;
import X.C154517dI;
import X.C18260x0;
import X.C18270x1;
import X.C18290x4;
import X.C22411Nc;
import X.C27991fJ;
import X.C28891hw;
import X.C29431io;
import X.C49882hF;
import X.C50842ir;
import X.C50932j0;
import X.C56982ss;
import X.C64773Ex;
import X.C66503Lr;
import X.C69263Wi;
import X.C77333tE;
import X.C77343tF;
import X.C77353tG;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class CAGInfoViewModel extends C05550Ty {
    public AnonymousClass3ZH A00;
    public AnonymousClass10x A01;
    public AnonymousClass1NS A02;
    public C22411Nc A03;
    public C27991fJ A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final AnonymousClass08J A08 = new AnonymousClass08J();
    public final C69263Wi A09;
    public final C106995aW A0A;
    public final C64773Ex A0B;
    public final AnonymousClass5ZU A0C;
    public final C56982ss A0D;
    public final C28891hw A0E;
    public final C29431io A0F;
    public final C50932j0 A0G;
    public final C49882hF A0H;
    public final C66503Lr A0I;
    public final AnonymousClass4AS A0J;
    public final AnonymousClass4UC A0K = AnonymousClass0x9.A0b();
    public final AnonymousClass4FS A0L;
    public final List A0M = new CopyOnWriteArrayList();
    public final AnonymousClass66R A0N = C154517dI.A01(new C77333tE(this));
    public final AnonymousClass66R A0O = C154517dI.A01(new C77343tF(this));
    public final AnonymousClass66R A0P = C154517dI.A01(new C77353tG(this));

    public void A0C() {
        if (this.A04 != null) {
            this.A0F.A07(this.A0O.getValue());
            this.A0E.A07(this.A0N.getValue());
            this.A0G.A01((AnonymousClass4AQ) this.A0P.getValue());
        }
    }

    public final void A0D() {
        List list = this.A0M;
        list.clear();
        if (this.A06) {
            C50842ir.A00(list, 7);
            C50842ir.A00(list, 10);
        }
        C50842ir.A00(list, 9);
        C50842ir.A00(list, 3);
        C50842ir.A00(list, 8);
        if (this.A07) {
            C50842ir.A00(list, 5);
        }
        C50842ir.A00(list, 11);
        C50842ir.A00(list, 1);
        if (this.A05) {
            C50842ir.A00(list, 6);
        }
        C56982ss r1 = this.A0D;
        C27991fJ r0 = this.A04;
        if (r0 == null) {
            throw C18270x1.A0S("cagJid");
        }
        AnonymousClass31A A002 = C56982ss.A00(r1, r0);
        if (this.A0A.A0J && A002 != null) {
            C50842ir.A00(list, 4);
        }
        C50842ir.A00(list, 2);
        C50842ir.A00(list, 12);
        C50842ir.A00(list, 13);
        C50842ir.A00(list, 0);
        this.A08.A0G(list);
    }

    public final void A0E() {
        AnonymousClass10x r0 = this.A01;
        if (r0 == null) {
            throw C18270x1.A0S("groupParticipantsViewModel");
        }
        r0.A0D();
        C18290x4.A1L(this.A02);
        C22411Nc r1 = this.A03;
        if (r1 == null) {
            throw C18270x1.A0S("groupChatInfoViewModel");
        }
        r1.A0E();
        AnonymousClass4AS r2 = this.A0J;
        C22411Nc r12 = this.A03;
        if (r12 == null) {
            throw C18270x1.A0S("groupChatInfoViewModel");
        }
        C27991fJ r02 = this.A04;
        if (r02 == null) {
            throw C18270x1.A0S("cagJid");
        }
        AnonymousClass1NS B01 = r2.B01(r12, r02);
        this.A02 = B01;
        C18270x1.A0w(B01, this.A0L);
    }

    public CAGInfoViewModel(C69263Wi r2, C106995aW r3, C64773Ex r4, AnonymousClass5ZU r5, C56982ss r6, C28891hw r7, C29431io r8, C50932j0 r9, C49882hF r10, C66503Lr r11, AnonymousClass4AS r12, AnonymousClass4FS r13) {
        C18260x0.A0f(r2, r13, r6, r4, r10);
        C18260x0.A0g(r5, r3, r11, r8, r7);
        C18270x1.A13(r12, r9);
        this.A09 = r2;
        this.A0L = r13;
        this.A0D = r6;
        this.A0B = r4;
        this.A0H = r10;
        this.A0C = r5;
        this.A0A = r3;
        this.A0I = r11;
        this.A0F = r8;
        this.A0E = r7;
        this.A0J = r12;
        this.A0G = r9;
    }
}
