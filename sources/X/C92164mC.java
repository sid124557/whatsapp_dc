package X;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.newsletter.viewmodel.NewsletterViewModel;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;
import java.util.Collection;

/* renamed from: X.4mC  reason: invalid class name and case insensitive filesystem */
public final class C92164mC extends C89884fR implements AnonymousClass4FD {
    public AnonymousClass1RL A00;
    public NewsletterViewModel A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final C56612sH A05;
    public final AnonymousClass5QQ A06;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C92164mC(X.C009707r r41, X.C53582nK r42, X.AnonymousClass5DR r43, X.C69263Wi r44, X.C56972sr r45, X.AnonymousClass64J r46, X.AnonymousClass5MG r47, X.C29291ia r48, X.C29301ib r49, X.AnonymousClass5UX r50, X.C29421in r51, X.AnonymousClass5ZU r52, X.C613330g r53, X.C56612sH r54, X.C620733j r55, X.C56982ss r56, X.C66473Lo r57, X.AnonymousClass3ZH r58, X.AnonymousClass5Y0 r59, X.AnonymousClass1VX r60, X.C29241iV r61, X.C95804uY r62, X.AnonymousClass5QQ r63, X.C56072rN r64, X.C187958y5 r65, X.AnonymousClass4FS r66) {
        /*
            r40 = this;
            r1 = 1
            r16 = r41
            r0 = r16
            X.C162457s7.A0J(r0, r1)
            r0 = 3
            r6 = r62
            r8 = r60
            r10 = r58
            X.C18260x0.A0b(r6, r10, r8, r0)
            r19 = r45
            r18 = r44
            r2 = r66
            r9 = r59
            r12 = r56
            r3 = r18
            r0 = r19
            X.C18260x0.A0g(r3, r0, r2, r12, r9)
            r3 = 11
            r24 = r50
            r0 = r24
            X.C162457s7.A0J(r0, r3)
            r26 = r52
            r17 = r42
            r3 = r65
            r4 = r64
            r15 = r55
            r5 = r17
            r0 = r26
            X.C18260x0.A0h(r5, r3, r0, r15, r4)
            r25 = r51
            r23 = r49
            r5 = r25
            r0 = r23
            X.AnonymousClass0x2.A1C(r5, r0)
            r27 = r53
            r22 = r48
            r11 = r57
            r5 = r22
            r0 = r27
            X.C18290x4.A1N(r5, r0, r11)
            r20 = r46
            r14 = r43
            r7 = r61
            r0 = r20
            X.C86604Kt.A1T(r7, r14, r0)
            r0 = 25
            r13 = r54
            X.C162457s7.A0J(r13, r0)
            r0 = 26
            r5 = r63
            X.C162457s7.A0J(r5, r0)
            r29 = 0
            r0 = r40
            r21 = r47
            r28 = r15
            r30 = r12
            r31 = r11
            r32 = r10
            r33 = r9
            r34 = r8
            r35 = r7
            r36 = r6
            r37 = r4
            r38 = r3
            r39 = r2
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r0.A05 = r13
            r0.A06 = r5
            X.3ZH r2 = r0.A0L
            X.4uZ r2 = r2.A0H
            java.lang.String r3 = "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid"
            X.C162457s7.A0K(r2, r3)
            X.31A r2 = X.C56982ss.A00(r12, r2)
            if (r2 == 0) goto L_0x00bb
            X.07r r2 = r0.A0U
            X.AnonymousClass0x9.A1L(r2)
            X.4ea r2 = (X.C89654ea) r2
            X.3ZH r1 = r0.A0L
            X.4uZ r1 = r1.A0H
            X.C162457s7.A0K(r1, r3)
            X.4uY r1 = (X.C95804uY) r1
            com.whatsapp.newsletter.viewmodel.NewsletterViewModel r1 = X.AnonymousClass5BS.A00(r14, r2, r1)
            r0.A01 = r1
            r0.A0E()
            return
        L_0x00bb:
            r0.A04 = r1
            X.07r r0 = r0.A0U
            r0.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92164mC.<init>(X.07r, X.2nK, X.5DR, X.3Wi, X.2sr, X.64J, X.5MG, X.1ia, X.1ib, X.5UX, X.1in, X.5ZU, X.30g, X.2sH, X.33j, X.2ss, X.3Lo, X.3ZH, X.5Y0, X.1VX, X.1iV, X.4uY, X.5QQ, X.2rN, X.8y5, X.4FS):void");
    }

    public void BLe(C95814uZ r2, boolean z) {
        C162457s7.A0J(r2, 0);
        if (C162457s7.A0P(this.A0r, r2)) {
            A0E();
            A02();
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C162457s7.A0J(activity, 0);
        super.onActivityCreated(activity, bundle);
        if (!this.A04) {
            A02();
            A06(new C109475eg(this, 1, activity));
            C107295b4.A03(this.A06, R.string.f11nameremoved);
            A0D();
            NewsletterViewModel newsletterViewModel = this.A01;
            if (newsletterViewModel == null) {
                throw C86604Kt.A0j();
            }
            C06270Wx A0G = newsletterViewModel.A0G();
            C009707r r2 = this.A0U;
            AnonymousClass0x9.A1L(r2);
            C86604Kt.A1N(r2, A0G, new AnonymousClass619(this), 182);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        C162457s7.A0J(activity, 0);
        super.onActivityDestroyed(activity);
        C009707r r0 = this.A0U;
        AnonymousClass0x9.A1L(r0);
        AnonymousClass08A r1 = r0.A06;
        NewsletterViewModel newsletterViewModel = this.A01;
        if (newsletterViewModel == null) {
            throw C86604Kt.A0j();
        }
        r1.A01(newsletterViewModel);
    }

    public final String A0C() {
        AnonymousClass1RL r0 = this.A00;
        if (r0 == null) {
            throw C18270x1.A0S("newsletterInfo");
        }
        AnonymousClass5QQ r02 = this.A06;
        int A002 = r02.A00((int) r0.A05);
        String A012 = r02.A01(A002);
        C162457s7.A0J(A012, 1);
        String quantityString = this.A0U.getResources().getQuantityString(R.plurals.f9nameremoved, A002, new Object[]{A012});
        C162457s7.A0D(quantityString);
        return quantityString;
    }

    public final void A0D() {
        C139986sy r0;
        boolean z = true;
        int i = 0;
        if (this.A0R) {
            if (this.A0L.A02 <= 0) {
                z = false;
            }
            ImageView imageView = this.A0A;
            C162457s7.A0K(imageView, "null cannot be cast to non-null type com.whatsapp.wds.components.profilephoto.WDSProfilePhoto");
            WDSProfilePhoto wDSProfilePhoto = (WDSProfilePhoto) imageView;
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
                waImageView.setImageResource(R.drawable.ic_ephemeral_v2);
            }
        }
    }

    public final void A0E() {
        if (this.A00 == null) {
            NewsletterViewModel newsletterViewModel = this.A01;
            if (newsletterViewModel == null) {
                throw C18270x1.A0S("viewModel");
            }
            this.A00 = C104595Rp.A00(newsletterViewModel);
        }
        NewsletterViewModel newsletterViewModel2 = this.A01;
        if (newsletterViewModel2 == null) {
            throw C18270x1.A0S("viewModel");
        }
        A0G(C104595Rp.A00(newsletterViewModel2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F() {
        /*
            r3 = this;
            boolean r0 = r3.A03
            if (r0 != 0) goto L_0x0086
            com.whatsapp.TextEmojiLabel r2 = r3.A0F
            X.1RL r0 = r3.A00
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = "newsletterInfo"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0011:
            boolean r0 = r0.A0K
            if (r0 == 0) goto L_0x0035
            X.07r r1 = r3.A0U
            r0 = 2131891006(0x7f12133e, float:1.941672E38)
        L_0x001a:
            java.lang.String r0 = X.C18290x4.A0l(r1, r0)
        L_0x001e:
            r2.setText(r0)
            com.whatsapp.TextEmojiLabel r1 = r3.A0F
            X.C162457s7.A0C(r1)
            r0 = 0
            r1.setVisibility(r0)
            X.1RL r0 = r3.A00
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = "newsletterInfo"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0035:
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = r3.A0C()
            goto L_0x001e
        L_0x003e:
            X.07r r1 = r3.A0U
            r0 = 2131891176(0x7f1213e8, float:1.9417065E38)
            goto L_0x001a
        L_0x0044:
            boolean r0 = r0.A0K
            if (r0 != 0) goto L_0x0086
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x0086
            r0 = 1
            r3.A03 = r0
            r3.A02 = r0
            com.whatsapp.TextEmojiLabel r1 = r3.A0F
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            com.whatsapp.TextEmojiLabel r0 = r3.A0F
            android.view.ViewPropertyAnimator r1 = r0.animate()
            if (r1 == 0) goto L_0x0086
            r0 = 0
            android.view.ViewPropertyAnimator r2 = r1.alpha(r0)
            if (r2 == 0) goto L_0x0086
            r0 = 250(0xfa, double:1.235E-321)
            android.view.ViewPropertyAnimator r2 = r2.setDuration(r0)
            if (r2 == 0) goto L_0x0086
            r0 = 2000(0x7d0, double:9.88E-321)
            android.view.ViewPropertyAnimator r1 = r2.setStartDelay(r0)
            if (r1 == 0) goto L_0x0086
            r0 = 22
            X.5rM r0 = X.C117085rM.A00(r3, r0)
            android.view.ViewPropertyAnimator r0 = r1.withEndAction(r0)
            if (r0 == 0) goto L_0x0086
            r0.start()
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92164mC.A0F():void");
    }

    public final void A0G(AnonymousClass1RL r6) {
        AnonymousClass1RL r3 = this.A00;
        if (r3 == null) {
            throw C18270x1.A0S("newsletterInfo");
        }
        this.A00 = r6;
        if (C162457s7.A0P(r3.A0H, r6.A0H) && r3.A0C == r6.A0C) {
            long j = r3.A05;
            AnonymousClass1RL r0 = this.A00;
            if (r0 == null) {
                throw C18270x1.A0S("newsletterInfo");
            } else if (j == r0.A05) {
                return;
            }
        }
        A0F();
    }

    public void BLd() {
    }

    public void A09() {
        super.A09();
        A0E();
    }

    public void BLc(C95814uZ r1) {
    }

    public void BLg(C95814uZ r1) {
    }

    public void BLh(C95814uZ r1) {
    }

    public void BLf(C95814uZ r1, Collection collection, int i) {
    }
}
