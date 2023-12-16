package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.community.SubgroupPileView;
import com.whatsapp.conversation.viewmodel.ConversationTitleViewModel;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.4mB  reason: invalid class name and case insensitive filesystem */
public class C92154mB extends C89884fR {
    public int A00;
    public long A01;
    public Activity A02;
    public Handler A03;
    public View A04;
    public ConversationTitleViewModel A05;
    public AnonymousClass3ZH A06;
    public AnonymousClass5UY A07;
    public Runnable A08;
    public boolean A09;
    public final C15910sA A0A;
    public final C15940sD A0B;
    public final C44272Vj A0C;
    public final C56942so A0D;
    public final AnonymousClass67D A0E;
    public final C64773Ex A0F;
    public final C105365Uq A0G;
    public final C49992hS A0H;
    public final C56612sH A0I;
    public final C56982ss A0J;
    public final C56892sj A0K;
    public final C66493Lq A0L;
    public final AnonymousClass4AQ A0M = new AnonymousClass697(this, 5);
    public final C50932j0 A0N;
    public final C52472lX A0O;
    public final C27991fJ A0P;
    public final C56072rN A0Q;

    public final synchronized void A0D(C15790rw r3) {
        AnonymousClass3ZH r0 = this.A06;
        if (r0 != null) {
            r3.AwB(r0);
        } else {
            C71333bw.A00(this.A0u, this, r3, 3);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C92154mB(X.C009707r r33, X.C15910sA r34, X.C15940sD r35, X.C53582nK r36, X.C69263Wi r37, X.C56972sr r38, X.AnonymousClass64J r39, X.AnonymousClass5MG r40, X.C29291ia r41, X.C29301ib r42, X.C44272Vj r43, X.C56942so r44, X.C64653Ej r45, X.AnonymousClass5UX r46, X.C64773Ex r47, X.C29421in r48, X.AnonymousClass5ZU r49, X.C105365Uq r50, X.C613330g r51, X.C56612sH r52, X.C620733j r53, X.C56982ss r54, X.C66473Lo r55, X.C56892sj r56, X.AnonymousClass3ZH r57, X.AnonymousClass5Y0 r58, X.AnonymousClass1VX r59, X.C66493Lq r60, X.C50932j0 r61, X.C29241iV r62, X.C52472lX r63, X.C27991fJ r64, X.C56072rN r65, X.C187958y5 r66, X.AnonymousClass4FS r67) {
        /*
            r32 = this;
            r21 = 0
            r7 = r32
            r26 = r59
            r25 = r58
            r24 = r57
            r15 = r42
            r27 = r62
            r8 = r33
            r4 = r64
            r12 = r39
            r3 = r65
            r9 = r36
            r13 = r40
            r30 = r66
            r10 = r37
            r14 = r41
            r2 = r67
            r11 = r38
            r16 = r46
            r17 = r48
            r6 = r49
            r19 = r51
            r20 = r53
            r5 = r54
            r23 = r55
            r22 = r5
            r28 = r4
            r29 = r3
            r31 = r2
            r18 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r1 = 5
            X.697 r0 = new X.697
            r0.<init>(r7, r1)
            r7.A0M = r0
            r0 = r52
            r7.A0I = r0
            r0 = r47
            r7.A0F = r0
            r0 = r43
            r7.A0C = r0
            r0 = r45
            r7.A0E = r0
            r0 = r44
            r7.A0D = r0
            r0 = r61
            r7.A0N = r0
            r0 = r56
            r7.A0K = r0
            r7.A0P = r4
            r7.A0J = r5
            r7.A0Q = r3
            r0 = r63
            r7.A0O = r0
            r0 = r60
            r7.A0L = r0
            r0 = r50
            r7.A0G = r0
            r0 = r35
            r7.A0B = r0
            r0 = r34
            r7.A0A = r0
            r0 = 0
            X.92b r1 = new X.92b
            r1.<init>(r7, r0)
            X.2hS r0 = new X.2hS
            r0.<init>(r6, r1, r4, r2)
            r7.A0H = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92154mB.<init>(X.07r, X.0sA, X.0sD, X.2nK, X.3Wi, X.2sr, X.64J, X.5MG, X.1ia, X.1ib, X.2Vj, X.2so, X.3Ej, X.5UX, X.3Ex, X.1in, X.5ZU, X.5Uq, X.30g, X.2sH, X.33j, X.2ss, X.3Lo, X.2sj, X.3ZH, X.5Y0, X.1VX, X.3Lq, X.2j0, X.1iV, X.2lX, X.1fJ, X.2rN, X.8y5, X.4FS):void");
    }

    public ViewGroup A08(Context context) {
        boolean A0J2 = this.A0D.A0J(this.A0P, this.A00);
        this.A09 = A0J2;
        if (A0J2) {
            return (ViewGroup) C86604Kt.A0F(LayoutInflater.from(context), R.layout.f8nameremoved);
        }
        return super.A08(context);
    }

    public void A09() {
        C56982ss r0 = this.A0J;
        C27991fJ r2 = this.A0P;
        int A062 = r0.A06(r2);
        this.A00 = A062;
        if (this.A09 != this.A0D.A0J(r2, A062)) {
            A0A(this.A02);
        }
        super.A09();
        this.A0H.A01();
        A0C();
    }

    public void A0B(AnonymousClass3ZH r5) {
        C56892sj r0 = this.A0K;
        C27991fJ r2 = this.A0P;
        if (r0.A0C(r2) && this.A00 == 3) {
            A0D(new AnonymousClass91U(this, 3));
        } else if (this.A0D.A0J(r2, this.A00)) {
            this.A07.A06(0);
            ((SubgroupPileView) this.A07.A04()).setSubgroupProfilePhoto(r5, this.A00, true, this.A0G);
            View view = (View) this.A07.A04().getParent();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = -2;
            view.setLayoutParams(layoutParams);
            this.A0A.setVisibility(8);
        } else {
            super.A0B(r5);
        }
    }

    public final void A0C() {
        C139986sy r0;
        boolean z = true;
        int i = 0;
        if (this.A0R) {
            if (this.A0L.A02 <= 0) {
                z = false;
            }
            WDSProfilePhoto wDSProfilePhoto = (WDSProfilePhoto) this.A0A;
            if (z) {
                r0 = new C139986sy();
            } else {
                r0 = null;
            }
            wDSProfilePhoto.setProfileBadge(r0);
            return;
        }
        WaImageView waImageView = this.A0I;
        if (waImageView != null) {
            if (this.A0L.A02 <= 0) {
                z = false;
                i = 8;
            }
            waImageView.setVisibility(i);
            if (z) {
                this.A0I.setImageResource(R.drawable.ic_ephemeral_v2);
            }
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.A00 = this.A0J.A06(this.A0P);
        super.onActivityCreated(activity, bundle);
        this.A02 = activity;
        this.A0N.A00(this.A0M);
    }

    public void A0A(Activity activity) {
        super.A0A(activity);
        if (this.A00 == 3) {
            C107555bV.A05(this.A06, this.A0j, this.A0U.getResources().getDimensionPixelOffset(R.dimen.f6nameremoved), 0);
        }
        this.A07 = AnonymousClass5UY.A01(activity, R.id.subgroup_facepile_toolbar_photo);
        ConversationTitleViewModel conversationTitleViewModel = (ConversationTitleViewModel) AnonymousClass0x9.A0H(this.A0B).A01(ConversationTitleViewModel.class);
        this.A05 = conversationTitleViewModel;
        AnonymousClass6C6.A02(this.A0A, conversationTitleViewModel.A01, this, 173);
        this.A05.A01.A0H(new AnonymousClass74O());
        if (this.A0D.A0J(this.A0P, this.A00)) {
            this.A04 = C06560Yg.A02(this.A05, R.id.icon_layout_anchor);
            A0D(new AnonymousClass6A7(activity, 1, this));
        }
        A06(new C109465ef(this, 47, activity));
        C107295b4.A03(this.A06, R.string.f11nameremoved);
        A0C();
    }

    public void onActivityDestroyed(Activity activity) {
        Runnable runnable;
        super.onActivityDestroyed(activity);
        Handler handler = this.A03;
        if (!(handler == null || (runnable = this.A08) == null)) {
            handler.removeCallbacks(runnable);
        }
        this.A0N.A01(this.A0M);
        this.A0H.A00();
    }
}
