package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.4m9  reason: invalid class name and case insensitive filesystem */
public final class C92134m9 extends C89884fR {
    public View A00;
    public final C1229766o A01;
    public final AnonymousClass66R A02 = C154517dI.A01(new C118885w5(this));
    public final AnonymousClass66R A03;
    public final AnonymousClass66R A04 = C154517dI.A01(new C118895w6(this));
    public final AnonymousClass66R A05 = C154517dI.A01(new C118925w9(this));

    public ViewGroup A08(Context context) {
        C162457s7.A0J(context, 0);
        boolean A042 = C106545Zk.A04(this.A0o, C58422vE.A01, 6218);
        this.A0R = A042;
        int i = R.layout.f8nameremoved;
        if (A042) {
            i = R.layout.f8nameremoved;
        }
        View A0g = C86664Kz.A0g(LayoutInflater.from(context), i);
        C162457s7.A0K(A0g, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) A0g;
        this.A00 = viewGroup.findViewById(R.id.bot_information_icon);
        return viewGroup;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C162457s7.A0J(activity, 0);
        super.onActivityCreated(activity, bundle);
        C109705f3 r1 = new C109705f3((Object) activity, 22, (Object) this);
        A06(r1);
        View view = this.A00;
        if (view != null) {
            view.setOnClickListener(r1);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C92134m9(X.C009707r r41, X.C53582nK r42, X.C69263Wi r43, X.C56972sr r44, X.AnonymousClass64J r45, X.AnonymousClass5MG r46, X.C29291ia r47, X.C1229766o r48, X.C29301ib r49, X.AnonymousClass5UX r50, X.C29421in r51, X.AnonymousClass5ZU r52, X.C613330g r53, X.C620733j r54, X.C56982ss r55, X.C66473Lo r56, X.AnonymousClass3ZH r57, X.AnonymousClass5Y0 r58, X.AnonymousClass1VX r59, X.C29241iV r60, X.C95814uZ r61, X.C56072rN r62, X.C187958y5 r63, X.AnonymousClass4FS r64) {
        /*
            r40 = this;
            r19 = r44
            r18 = r43
            r3 = r61
            r0 = r64
            r5 = r59
            r8 = r55
            r2 = r18
            r1 = r19
            X.C18260x0.A0f(r5, r2, r1, r0, r8)
            r16 = r50
            r1 = r63
            r2 = r62
            r6 = r58
            r17 = r42
            r7 = r17
            r4 = r16
            X.C18260x0.A0g(r6, r4, r7, r2, r1)
            r4 = 11
            r11 = r52
            X.C162457s7.A0J(r11, r4)
            r14 = r51
            r23 = r49
            r12 = r48
            r22 = r47
            r9 = r54
            r7 = r23
            r4 = r22
            X.C18260x0.A0h(r9, r14, r12, r7, r4)
            r10 = r53
            r7 = r56
            X.AnonymousClass0x2.A1C(r10, r7)
            r13 = 19
            r4 = r60
            X.C162457s7.A0J(r4, r13)
            r15 = 20
            r20 = r45
            r13 = r20
            X.C162457s7.A0J(r13, r15)
            r29 = 0
            r15 = r40
            r21 = r46
            r32 = r57
            r13 = r41
            r26 = r11
            r27 = r10
            r28 = r9
            r30 = r8
            r31 = r7
            r33 = r6
            r34 = r5
            r35 = r4
            r36 = r3
            r37 = r2
            r38 = r1
            r39 = r0
            r24 = r16
            r25 = r14
            r16 = r13
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r15.A01 = r12
            X.5w7 r5 = new X.5w7
            r5.<init>(r13)
            java.lang.Class<com.whatsapp.bonsai.BonsaiConversationTitleViewModel> r0 = com.whatsapp.bonsai.BonsaiConversationTitleViewModel.class
            X.8PJ r4 = new X.8PJ
            r4.<init>(r0)
            X.5w8 r2 = new X.5w8
            r2.<init>(r13)
            X.5z0 r1 = new X.5z0
            r1.<init>(r13)
            X.0ng r0 = new X.0ng
            r0.<init>(r2, r5, r1, r4)
            r15.A03 = r0
            X.5w5 r0 = new X.5w5
            r0.<init>(r15)
            X.66R r0 = X.C154517dI.A01(r0)
            r15.A02 = r0
            X.5w9 r0 = new X.5w9
            r0.<init>(r15)
            X.66R r0 = X.C154517dI.A01(r0)
            r15.A05 = r0
            X.5w6 r0 = new X.5w6
            r0.<init>(r15)
            X.66R r0 = X.C154517dI.A01(r0)
            r15.A04 = r0
            com.whatsapp.bonsai.BonsaiConversationTitleViewModel r1 = X.C89884fR.A00(r15)
            boolean r0 = r3 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x00de
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            r1.A01 = r3
            r1.A0D()
            X.1hu r2 = r1.A07
            java.lang.Iterable r0 = r2.A05()
            X.6Bw r1 = r1.A04
            boolean r0 = X.C73723fy.A0U(r0, r1)
            if (r0 != 0) goto L_0x00de
            r2.A06(r1)
        L_0x00de:
            com.whatsapp.bonsai.BonsaiConversationTitleViewModel r0 = X.C89884fR.A00(r15)
            X.08M r2 = r0.A03
            r0 = 2
            X.59q r1 = X.C1001359q.A00(r15, r0)
            r0 = 50
            X.C86604Kt.A1N(r13, r2, r1, r0)
            com.whatsapp.bonsai.BonsaiConversationTitleViewModel r0 = X.C89884fR.A00(r15)
            X.107 r2 = r0.A0A
            r0 = 3
            X.59q r1 = X.C1001359q.A00(r15, r0)
            r0 = 51
            X.C86604Kt.A1N(r13, r2, r1, r0)
            com.whatsapp.bonsai.BonsaiConversationTitleViewModel r0 = X.C89884fR.A00(r15)
            X.107 r2 = r0.A09
            r0 = 4
            X.59q r1 = X.C1001359q.A00(r15, r0)
            r0 = 52
            X.C86604Kt.A1N(r13, r2, r1, r0)
            com.whatsapp.bonsai.BonsaiConversationTitleViewModel r0 = X.C89884fR.A00(r15)
            X.107 r2 = r0.A0B
            r0 = 5
            X.59q r1 = X.C1001359q.A00(r15, r0)
            r0 = 53
            X.C86604Kt.A1N(r13, r2, r1, r0)
            com.whatsapp.bonsai.BonsaiConversationTitleViewModel r0 = X.C89884fR.A00(r15)
            X.107 r2 = r0.A08
            r0 = 6
            X.59q r1 = X.C1001359q.A00(r15, r0)
            r0 = 54
            X.C86604Kt.A1N(r13, r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92134m9.<init>(X.07r, X.2nK, X.3Wi, X.2sr, X.64J, X.5MG, X.1ia, X.66o, X.1ib, X.5UX, X.1in, X.5ZU, X.30g, X.33j, X.2ss, X.3Lo, X.3ZH, X.5Y0, X.1VX, X.1iV, X.4uZ, X.2rN, X.8y5, X.4FS):void");
    }

    public void A03() {
        if (this.A0R) {
            super.A03();
            return;
        }
        View findViewById = this.A05.findViewById(R.id.whatsapp_toolbar_home);
        if (findViewById != null) {
            C107295b4.A02(findViewById);
            findViewById.setOnClickListener(this.A0T);
            this.A01 = findViewById;
        }
    }

    public void A0B(AnonymousClass3ZH r4) {
        super.A0B(r4);
        if (this.A00.orientation == 2) {
            this.A06.post(new C117125rQ(this, 5));
        }
        AnonymousClass107 r1 = C89884fR.A00(this).A0A;
        r1.A0H(r1.A07());
        if (!this.A0R) {
            this.A0A.setOnClickListener(this.A0T);
        }
    }
}
