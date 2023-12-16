package com.whatsapp.group;

import X.AnonymousClass1VX;
import X.AnonymousClass30F;
import X.AnonymousClass3ZF;
import X.AnonymousClass3ZH;
import X.AnonymousClass49R;
import X.AnonymousClass4F0;
import X.AnonymousClass4FS;
import X.AnonymousClass58W;
import X.AnonymousClass5GJ;
import X.AnonymousClass5TW;
import X.AnonymousClass6A1;
import X.AnonymousClass6A2;
import X.AnonymousClass6BQ;
import X.C1224164h;
import X.C1237769s;
import X.C1237869t;
import X.C15110qn;
import X.C185958uW;
import X.C187958y5;
import X.C27991fJ;
import X.C29111iI;
import X.C29281iZ;
import X.C33401sw;
import X.C50392i6;
import X.C53312mt;
import X.C56072rN;
import X.C56322rn;
import X.C56762sW;
import X.C56892sj;
import X.C56972sr;
import X.C56982ss;
import X.C64773Ex;
import X.C66663Mh;
import X.C84904Ee;
import X.C86614Ku;
import X.C97094xc;
import X.C990454f;

public class GroupCallButtonController implements C15110qn {
    public C990454f A00;
    public C33401sw A01;
    public C50392i6 A02;
    public AnonymousClass3ZH A03;
    public AnonymousClass58W A04 = AnonymousClass58W.NONE;
    public AnonymousClass5GJ A05;
    public C27991fJ A06;
    public C187958y5 A07;
    public AnonymousClass3ZF A08;
    public C53312mt A09;
    public final C56972sr A0A;
    public final C66663Mh A0B;
    public final C1224164h A0C = new AnonymousClass6A1(this, 1);
    public final AnonymousClass49R A0D = new AnonymousClass6A2(this, 1);
    public final AnonymousClass5TW A0E;
    public final C64773Ex A0F;
    public final C56762sW A0G;
    public final C56982ss A0H;
    public final C56892sj A0I;
    public final C56322rn A0J;
    public final AnonymousClass1VX A0K;
    public final AnonymousClass30F A0L;
    public final C84904Ee A0M = new C1237869t(this, 1);
    public final C29281iZ A0N;
    public final C56072rN A0O;
    public final AnonymousClass4FS A0P;
    public final AnonymousClass4F0 A0Q = new AnonymousClass6BQ(this, 3);
    public final C29111iI A0R;
    public final C185958uW A0S = new C1237769s(this, 6);
    public final C97094xc A0T;

    public final void A00(long j) {
        C56762sW r2 = this.A0G;
        AnonymousClass3ZF A002 = r2.A00(j);
        if (A002 != null) {
            this.A0C.BO4(A002);
        } else if (this.A00 == null) {
            C990454f r1 = new C990454f(this.A0C, r2, j);
            this.A00 = r1;
            C86614Ku.A1R(r1, this.A0P);
        }
    }

    public GroupCallButtonController(C56972sr r4, C66663Mh r5, AnonymousClass5TW r6, C64773Ex r7, C56762sW r8, C56982ss r9, C56892sj r10, C56322rn r11, AnonymousClass1VX r12, AnonymousClass30F r13, C29281iZ r14, C56072rN r15, C187958y5 r16, AnonymousClass4FS r17, C29111iI r18, C97094xc r19) {
        this.A0K = r12;
        this.A0A = r4;
        this.A0P = r17;
        this.A0H = r9;
        this.A0B = r5;
        this.A0T = r19;
        this.A0E = r6;
        this.A0F = r7;
        this.A0O = r15;
        this.A07 = r16;
        this.A0R = r18;
        this.A0G = r8;
        this.A0L = r13;
        this.A0J = r11;
        this.A0N = r14;
        this.A0I = r10;
    }
}
