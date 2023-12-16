package com.whatsapp.group;

import X.AnonymousClass3ZH;
import X.AnonymousClass4AQ;
import X.AnonymousClass4C8;
import X.AnonymousClass4HI;
import X.AnonymousClass8PR;
import X.C05550Ty;
import X.C154567dN;
import X.C18260x0;
import X.C27991fJ;
import X.C29241iV;
import X.C29441ip;
import X.C50932j0;
import X.C51712kG;
import X.C56892sj;
import X.C64773Ex;
import X.C832246p;
import X.C85504Gn;
import X.C85524Gp;
import X.C85564Gt;
import X.C85864Hx;
import com.whatsapp.grouphistory.xmpp.EnableGroupHistoryProtocolHelper;

public final class HistorySettingViewModel extends C05550Ty {
    public AnonymousClass3ZH A00;
    public C27991fJ A01;
    public final C29441ip A02;
    public final C64773Ex A03;
    public final C56892sj A04;
    public final AnonymousClass4AQ A05;
    public final C50932j0 A06;
    public final C29241iV A07;
    public final AnonymousClass4HI A08;
    public final EnableGroupHistoryProtocolHelper A09;
    public final C85504Gn A0A;
    public final AnonymousClass4C8 A0B;
    public final C85524Gp A0C;
    public final C85564Gt A0D;

    public HistorySettingViewModel(C29441ip r4, C64773Ex r5, C56892sj r6, C50932j0 r7, C29241iV r8, EnableGroupHistoryProtocolHelper enableGroupHistoryProtocolHelper) {
        C18260x0.A0Z(r4, r5, r6, 1);
        C18260x0.A0T(r7, r8);
        this.A02 = r4;
        this.A03 = r5;
        this.A04 = r6;
        this.A09 = enableGroupHistoryProtocolHelper;
        this.A06 = r7;
        this.A07 = r8;
        C832246p r0 = new C832246p(new C51712kG(false, true));
        this.A0C = r0;
        this.A0D = r0;
        AnonymousClass8PR r02 = new AnonymousClass8PR(0);
        this.A0A = r02;
        this.A0B = C154567dN.A01(r02);
        C85864Hx r2 = new C85864Hx(this, 5);
        this.A05 = r2;
        AnonymousClass4HI r03 = new AnonymousClass4HI(this, 6);
        this.A08 = r03;
        r7.A00(r2);
        r8.A06(r03);
    }

    public void A0C() {
        this.A06.A01(this.A05);
        this.A07.A07(this.A08);
    }
}
