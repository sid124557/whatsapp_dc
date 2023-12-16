package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;

/* renamed from: X.51u  reason: invalid class name */
public class AnonymousClass51u extends AnonymousClass51w {
    public C992054v A00;
    public final C64773Ex A01;
    public final AnonymousClass5ZU A02;
    public final AnonymousClass4FW A03 = new C113875m8(this);
    public final C29431io A04;
    public final AnonymousClass1VX A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass51u(X.C184988ss r34, X.C111095hX r35, X.C69263Wi r36, X.AnonymousClass5Ul r37, X.C621033m r38, X.C64773Ex r39, X.AnonymousClass5ZU r40, X.C105365Uq r41, X.C620633i r42, X.C56612sH r43, X.C620733j r44, X.C66543Lv r45, X.C29431io r46, X.C114635nM r47, X.C54012o2 r48, X.C620233e r49, X.AnonymousClass36Y r50, X.AnonymousClass1VX r51, X.C28071fd r52, X.C56232re r53, X.C48132eP r54, X.C624134x r55, X.C50222hp r56, X.C45042Yl r57, X.AnonymousClass1R1 r58, X.C113995mK r59, X.AnonymousClass5X9 r60, X.C103005Lc r61, X.AnonymousClass5SJ r62, X.C55832qz r63, X.C105025Tg r64, X.AnonymousClass4FS r65, X.C105215Ua r66) {
        /*
            r33 = this;
            r27 = r61
            r26 = r60
            r25 = r59
            r24 = r58
            r23 = r57
            r8 = r41
            r9 = r42
            r10 = r43
            r11 = r44
            r12 = r45
            r28 = r62
            r2 = r33
            r29 = r63
            r3 = r34
            r7 = r38
            r30 = r64
            r4 = r35
            r31 = r65
            r5 = r36
            r32 = r66
            r6 = r37
            r13 = r47
            r14 = r48
            r15 = r49
            r16 = r50
            r1 = r51
            r18 = r52
            r19 = r53
            r20 = r54
            r21 = r55
            r22 = r56
            r17 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            X.5m8 r0 = new X.5m8
            r0.<init>(r2)
            r2.A03 = r0
            r2.A05 = r1
            r0 = r39
            r2.A01 = r0
            r0 = r40
            r2.A02 = r0
            r0 = r46
            r2.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass51u.<init>(X.8ss, X.5hX, X.3Wi, X.5Ul, X.33m, X.3Ex, X.5ZU, X.5Uq, X.33i, X.2sH, X.33j, X.3Lv, X.1io, X.5nM, X.2o2, X.33e, X.36Y, X.1VX, X.1fd, X.2re, X.2eP, X.34x, X.2hp, X.2Yl, X.1R1, X.5mK, X.5X9, X.5Lc, X.5SJ, X.2qz, X.5Tg, X.4FS, X.5Ua):void");
    }

    public final void A0R(View view) {
        C95814uZ A0n = this.A06.A0n();
        if (A0n != null) {
            String A0L = this.A02.A0L(this.A01.A0A(A0n));
            View view2 = this.A00;
            C626936e.A04(view2);
            C86614Ku.A1H(view, new C148007Go[]{new C131956eS(C86604Kt.A0m(view2.getContext(), A0L, R.string.f11nameremoved))}, 1);
        }
    }

    public void A01() {
        super.A01();
        this.A04.A07(this.A03);
    }

    public void A0A() {
        super.A0A();
        C992054v r1 = this.A00;
        if (r1 != null) {
            r1.A0D(true);
            this.A00 = null;
        }
        C624134x r12 = this.A06;
        C116595qX r4 = new C116595qX(r12, A09());
        C55832qz r3 = this.A0V;
        C105215Ua r2 = this.A0b;
        C95814uZ A0n = r12.A0n();
        C626936e.A06(A0n);
        C992054v r13 = new C992054v(A0n, r3, r4, r2);
        this.A00 = r13;
        C18270x1.A0w(r13, this.A0a);
    }

    public void A0C() {
        super.A0C();
        BottomSheetBehavior bottomSheetBehavior = this.A00;
        if (bottomSheetBehavior.A0O != 4) {
            bottomSheetBehavior.A0S(4);
        } else {
            this.A01.A06.setVisibility(8);
            this.A01.A06.setAlpha(0.0f);
        }
        boolean z = this.A03;
        AnonymousClass5LV r0 = this.A01;
        if (z) {
            r0.A0G.A06(0);
        } else {
            r0.A0E.setVisibility(0);
        }
    }

    public void A0H(int i) {
        super.A0H(i);
        if (i == 3) {
            A0Q();
        }
    }

    public void A0K(View view) {
        super.A0K(view);
        AnonymousClass5LV A09 = A09();
        A09.A08.setVisibility(C86614Ku.A01(this.A06.A0n() instanceof C135216kJ ? 1 : 0));
        boolean z = this.A03;
        AnonymousClass5UY r0 = A09.A0G;
        if (z) {
            r0.A06(0);
            A09.A0A.setVisibility(8);
            A0R(A09.A0G.A04());
            A09.A0G.A07(new AnonymousClass54E(A09, 29, this));
        } else {
            r0.A06(8);
            A09.A0A.setVisibility(0);
            C106905aM.A04(A09.A0E);
            A09.A0E.setText(R.string.f11nameremoved);
            A0R(A09.A0E);
            AnonymousClass54E.A00(A09.A0E, A09, this, 30);
        }
        A0O(false);
        A0G();
        this.A04.A06(this.A03);
    }

    public final void A0Q() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("playbackPage/reply page=");
        A0o.append(this);
        A0o.append("; host=");
        StatusPlaybackBaseFragment statusPlaybackBaseFragment = this.A0T.A01;
        C18260x0.A0o(statusPlaybackBaseFragment, A0o);
        View view = this.A00;
        C626936e.A04(view);
        C89654ea r0 = (C89654ea) C86614Ku.A0A(view);
        if (r0 == null || !r0.BHW()) {
            A0B();
            this.A01.A0E.setVisibility(8);
            this.A01.A0G.A06(8);
            View view2 = this.A00;
            C626936e.A04(view2);
            Context context = view2.getContext();
            Intent A07 = C18320x8.A07();
            A07.setClassName(context.getPackageName(), "com.whatsapp.status.playback.StatusReplyActivity");
            C107395bF.A00(A07, this.A06.A1J);
            A07.putExtra("isStatusReply", true);
            C003203q A0Q = statusPlaybackBaseFragment.A0Q();
            if (A0Q == null || A0Q.isFinishing()) {
                View view3 = this.A00;
                C626936e.A04(view3);
                C86614Ku.A14(A07, view3);
                return;
            }
            if (this.A05.A0X(1455)) {
                A0Q.getWindow().setSoftInputMode(48);
            }
            A0Q.startActivityForResult(A07, 10);
            return;
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("playbackPage/reply reply-already-ended page=");
        A0o2.append(this);
        C18260x0.A1R(A0o2, "; host=", statusPlaybackBaseFragment);
    }
}
