package com.whatsapp.bonsai;

import X.AnonymousClass08M;
import X.AnonymousClass107;
import X.AnonymousClass4L0;
import X.C05550Ty;
import X.C06270Wx;
import X.C117125rQ;
import X.C1229766o;
import X.C124336Bw;
import X.C18260x0;
import X.C18290x4;
import X.C18310x6;
import X.C18330xA;
import X.C28871hu;
import X.C69263Wi;
import X.C73723fy;
import X.C73833g9;
import X.C996157i;
import X.C996257j;
import com.whatsapp.jid.UserJid;

public final class BonsaiConversationTitleViewModel extends C05550Ty {
    public C996157i A00;
    public UserJid A01;
    public boolean A02;
    public final AnonymousClass08M A03 = C18330xA.A01(C996257j.TAP_FOR_INFO);
    public final C124336Bw A04 = new C124336Bw(this, 0);
    public final C69263Wi A05;
    public final C1229766o A06;
    public final C28871hu A07;
    public final AnonymousClass107 A08;
    public final AnonymousClass107 A09;
    public final AnonymousClass107 A0A;
    public final AnonymousClass107 A0B;

    public void A0C() {
        C28871hu r2 = this.A07;
        Iterable A052 = r2.A05();
        C124336Bw r1 = this.A04;
        if (C73723fy.A0U(A052, r1)) {
            r2.A07(r1);
        }
    }

    public final void A0D() {
        AnonymousClass107 r0;
        boolean z = this.A02;
        Integer A0e = C18310x6.A0e();
        if (z) {
            this.A0A.A0H(A0e);
            this.A09.A0H(A0e);
            this.A0B.A0H(A0e);
            r0 = this.A08;
        } else {
            AnonymousClass107 r02 = this.A08;
            Integer A0Z = C18290x4.A0Z();
            r02.A0H(A0Z);
            boolean BH3 = this.A06.BH3(this.A01);
            AnonymousClass107 r03 = this.A0A;
            if (BH3) {
                r03.A0H(A0e);
                C996157i r1 = this.A00;
                if (r1 == C996157i.CENTER) {
                    C06270Wx.A03(this.A09, 4);
                    this.A0B.A0H(A0Z);
                    return;
                } else if (r1 == C996157i.END) {
                    this.A09.A0H(A0Z);
                    r0 = this.A0B;
                } else {
                    return;
                }
            } else {
                r03.A0H(A0Z);
                this.A09.A0H(A0Z);
                this.A0B.A0H(A0e);
                A0E(C996157i.END);
                return;
            }
        }
        r0.A0H(A0e);
    }

    public final void A0E(C996157i r5) {
        if (this.A03.A07() != C996257j.AI) {
            if (C73833g9.A06(null, C996157i.CENTER).contains(this.A00) && r5 == C996157i.END) {
                this.A05.A0T(new C117125rQ(this, 6), 3000);
            }
        }
    }

    public BonsaiConversationTitleViewModel(C69263Wi r4, C1229766o r5, C28871hu r6) {
        C18260x0.A0V(r4, r5, r6);
        this.A05 = r4;
        this.A06 = r5;
        this.A07 = r6;
        Integer A0e = C18310x6.A0e();
        this.A0A = AnonymousClass4L0.A0O(A0e);
        Integer A0Z = C18290x4.A0Z();
        this.A08 = AnonymousClass4L0.A0O(A0Z);
        this.A09 = AnonymousClass4L0.A0O(A0Z);
        this.A0B = AnonymousClass4L0.A0O(A0e);
    }
}
