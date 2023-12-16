package com.whatsapp.calling.chatmessages;

import X.AnonymousClass0IV;
import X.AnonymousClass0XV;
import X.AnonymousClass1VX;
import X.AnonymousClass20D;
import X.AnonymousClass2C3;
import X.AnonymousClass2XH;
import X.AnonymousClass39J;
import X.AnonymousClass3ZF;
import X.AnonymousClass5Z0;
import X.AnonymousClass5ZU;
import X.C05550Ty;
import X.C1230066r;
import X.C18260x0;
import X.C18280x3;
import X.C18290x4;
import X.C54292oU;
import X.C56122rS;
import X.C56972sr;
import X.C58422vE;
import X.C616131n;
import X.C64773Ex;
import X.C72023d3;
import X.C73853gB;
import X.C832246p;
import X.C84814Du;
import X.C85494Gl;
import X.C85524Gp;
import android.content.Context;

public final class AdhocParticipantBottomSheetViewModel extends C05550Ty {
    public AnonymousClass3ZF A00;
    public boolean A01;
    public boolean A02;
    public final int A03;
    public final C56972sr A04;
    public final C1230066r A05;
    public final AnonymousClass5Z0 A06;
    public final C64773Ex A07;
    public final AnonymousClass5ZU A08;
    public final C54292oU A09;
    public final C56122rS A0A;
    public final AnonymousClass1VX A0B;
    public final AnonymousClass39J A0C;
    public final C73853gB A0D;
    public final C85524Gp A0E;
    public final C85524Gp A0F;
    public final C85524Gp A0G;
    public final C85524Gp A0H;
    public final C85524Gp A0I = new C832246p(C72023d3.A00);

    public final void A0D(Context context, boolean z) {
        AnonymousClass3ZF r5 = this.A00;
        if (r5 != null) {
            this.A01 = true;
            C616131n.A02((C85494Gl) null, new AdhocParticipantBottomSheetViewModel$clickCallButton$1$1(context, this, r5, (C84814Du) null, z), AnonymousClass0IV.A00(this), (AnonymousClass20D) null, 3);
        }
    }

    public AdhocParticipantBottomSheetViewModel(AnonymousClass0XV r6, C56972sr r7, C1230066r r8, AnonymousClass5Z0 r9, C64773Ex r10, AnonymousClass5ZU r11, C54292oU r12, C56122rS r13, AnonymousClass1VX r14, C73853gB r15) {
        C18260x0.A0d(r14, r13, r10, r11);
        C18260x0.A0U(r7, r8);
        C18280x3.A15(r12, r6);
        this.A0B = r14;
        this.A0A = r13;
        this.A0D = r15;
        this.A07 = r10;
        this.A08 = r11;
        this.A04 = r7;
        this.A05 = r8;
        this.A06 = r9;
        this.A09 = r12;
        this.A0C = (AnonymousClass39J) r6.A04("call_log_message_key");
        this.A03 = r14.A0O(C58422vE.A02, 862) - 1;
        AnonymousClass2XH r2 = AnonymousClass2C3.A01;
        this.A0G = new C832246p(r2);
        this.A0F = new C832246p(r2);
        this.A0H = new C832246p(C18290x4.A0Z());
        this.A0E = new C832246p(r2);
        C616131n.A02(this.A0D, new AdhocParticipantBottomSheetViewModel$refreshParticipants$1(this, (C84814Du) null), AnonymousClass0IV.A00(this), (AnonymousClass20D) null, 2);
    }
}
