package X;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel;
import com.whatsapp.calling.views.VoipCallControlRingingDotsIndicator;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.4jN  reason: invalid class name and case insensitive filesystem */
public class C91324jN extends AnonymousClass6J6 {
    public C132786fx A00;
    public final View A01;
    public final ImageView A02;
    public final ImageView A03;
    public final AnonymousClass5YB A04;
    public final VoipCallControlRingingDotsIndicator A05;
    public final AnonymousClass5ZU A06;
    public final C184288rY A07;
    public final C105365Uq A08;
    public final C620633i A09;
    public final WDSButton A0A;
    public final Runnable A0B = C117695sL.A00(this, 15);

    public boolean A06() {
        return AnonymousClass000.A1W(this.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(X.C152087Xm r19) {
        /*
            r18 = this;
            r2 = r19
            boolean r1 = r2 instanceof X.C132786fx
            java.lang.String r0 = "Unknown list item type"
            X.C626936e.A0D(r1, r0)
            if (r1 == 0) goto L_0x00ea
            r5 = r18
            com.whatsapp.calling.views.VoipCallControlRingingDotsIndicator r6 = r5.A05
            java.lang.Runnable r0 = r5.A0B
            r6.removeCallbacks(r0)
            X.6fx r2 = (X.C132786fx) r2
            r5.A00 = r2
            android.view.View r3 = r5.A0H
            r0 = 0
            X.C06560Yg.A0O(r3, r0)
            r0 = 0
            r3.setClickable(r0)
            X.6fx r4 = r5.A00
            int r2 = r4.A00
            r0 = 11
            r1 = 8
            if (r2 != r0) goto L_0x0038
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x0038
            com.whatsapp.wds.components.button.WDSButton r0 = r5.A0A
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x003d
        L_0x0038:
            com.whatsapp.wds.components.button.WDSButton r0 = r5.A0A
            r0.setVisibility(r1)
        L_0x003d:
            android.widget.ImageView r8 = r5.A03
            r8.setVisibility(r1)
            r6.setVisibility(r1)
            r5.A09()
            X.6fx r0 = r5.A00
            com.whatsapp.jid.UserJid r0 = r0.A02
            r3.setTag(r0)
            X.6fx r0 = r5.A00
            if (r0 == 0) goto L_0x005f
            X.5Uq r6 = r5.A08
            X.3ZH r4 = r0.A01
            android.widget.ImageView r2 = r5.A02
            r1 = 1
            X.8rY r0 = r5.A07
            r6.A05(r2, r0, r4, r1)
        L_0x005f:
            X.6fx r7 = r5.A00
            boolean r2 = r7.A03
            X.3ZH r4 = r7.A01
            boolean r0 = r4.A0Q()
            if (r0 != 0) goto L_0x0110
            boolean r0 = r7.A04
            if (r0 == 0) goto L_0x0110
            X.5ZU r1 = r5.A06
            boolean r0 = X.AnonymousClass5ZU.A05(r4)
            if (r0 == 0) goto L_0x0110
            X.5YB r6 = r5.A04
            java.lang.String r1 = X.AnonymousClass5ZU.A03(r1, r4)
            com.whatsapp.TextEmojiLabel r0 = r6.A02
            r0.setText(r1)
        L_0x0082:
            int r1 = r7.A00
            r4 = 0
            r14 = 1
            if (r1 != r14) goto L_0x00eb
            android.view.View r0 = r5.A01
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
            android.widget.ImageView r0 = r5.A02
            r0.setAlpha(r1)
            if (r2 != 0) goto L_0x00d4
            android.view.animation.AnimationSet r7 = new android.view.animation.AnimationSet
            r7.<init>(r4)
            r0 = 0
            r11 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.AlphaAnimation r5 = X.AnonymousClass4L0.A0C(r0, r1)
            r0 = 500(0x1f4, double:2.47E-321)
            r5.setDuration(r0)
            r10 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.ScaleAnimation r9 = new android.view.animation.ScaleAnimation
            r15 = r10
            r17 = r10
            r12 = r10
            r13 = r11
            r16 = r14
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r9.setDuration(r0)
            r2 = 1045220557(0x3e4ccccd, float:0.2)
            r1 = 1070805811(0x3fd33333, float:1.65)
            r0 = 1057803469(0x3f0ccccd, float:0.55)
            android.view.animation.PathInterpolator r0 = X.C05030Rp.A00(r2, r1, r0, r11)
            r9.setInterpolator(r0)
            r7.addAnimation(r9)
            r7.addAnimation(r5)
            r8.startAnimation(r7)
            r8.setVisibility(r4)
        L_0x00d4:
            android.content.res.Resources r5 = r3.getResources()
            r2 = 2131895319(0x7f122417, float:1.9425468E38)
        L_0x00db:
            java.lang.Object[] r1 = new java.lang.Object[r14]
            com.whatsapp.TextEmojiLabel r0 = r6.A02
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = X.C18320x8.A0b(r5, r0, r1, r4, r2)
            r3.setContentDescription(r0)
        L_0x00ea:
            return
        L_0x00eb:
            r0 = 11
            if (r1 == r0) goto L_0x00f5
            if (r2 == 0) goto L_0x00f5
            r5.A0B()
            return
        L_0x00f5:
            android.widget.ImageView r0 = r5.A02
            r1 = 1050253722(0x3e99999a, float:0.3)
            r0.setAlpha(r1)
            android.view.View r0 = r5.A01
            r0.setAlpha(r1)
            if (r2 == 0) goto L_0x0108
            r5.A0A()
            return
        L_0x0108:
            android.content.res.Resources r5 = r3.getResources()
            r2 = 2131895331(0x7f122423, float:1.9425492E38)
            goto L_0x00db
        L_0x0110:
            X.5YB r6 = r5.A04
            r6.A08(r4)
            goto L_0x0082
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91324jN.A08(X.7Xm):void");
    }

    public void A09() {
        this.A01.clearAnimation();
        this.A02.clearAnimation();
        this.A05.clearAnimation();
    }

    public final void A0A() {
        this.A02.setAlpha(0.3f);
        this.A01.setAlpha(0.3f);
        this.A05.setVisibility(8);
        View view = this.A0A;
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
            view.setAlpha(0.0f);
            view.animate().setDuration(500).alpha(1.0f).start();
        }
        if (C107295b4.A09(this.A09)) {
            view = this.A0H;
        }
        C18320x8.A13(view, this, 7);
        View view2 = this.A0H;
        C86654Ky.A1A(view2, C18320x8.A0b(view2.getResources(), this.A04.A02.getText(), AnonymousClass002.A0L(), 0, R.string.f11nameremoved), (String) null, false);
    }

    public final void A0B() {
        this.A0A.setVisibility(8);
        VoipCallControlRingingDotsIndicator voipCallControlRingingDotsIndicator = this.A05;
        voipCallControlRingingDotsIndicator.setVisibility(0);
        View view = this.A0H;
        view.setContentDescription(C18320x8.A0b(view.getResources(), this.A04.A02.getText(), AnonymousClass002.A0L(), 0, R.string.f11nameremoved));
        ParticipantsListViewModel participantsListViewModel = this.A00;
        if (!(participantsListViewModel == null || participantsListViewModel.A06.A08().A04 == null)) {
            if (C86614Ku.A1W(participantsListViewModel.A0E, Boolean.FALSE)) {
                voipCallControlRingingDotsIndicator.postDelayed(C117695sL.A00(this, 14), 2000);
            }
        }
        AnonymousClass6F5 r5 = new AnonymousClass6F5(voipCallControlRingingDotsIndicator, 0.14f, 0.66f, 800, 100, 1500);
        r5.setRepeatCount(-1);
        C86624Kv.A19(r5, this, 0);
        voipCallControlRingingDotsIndicator.startAnimation(r5);
    }

    public C91324jN(View view, AnonymousClass64J r4, ParticipantsListViewModel participantsListViewModel, AnonymousClass5ZU r6, C184288rY r7, C105365Uq r8, C620633i r9) {
        super(view, participantsListViewModel);
        this.A01 = C06560Yg.A02(view, R.id.name);
        this.A06 = r6;
        this.A09 = r9;
        this.A07 = r7;
        this.A08 = r8;
        this.A04 = AnonymousClass5YB.A00(view, r4, R.id.name);
        this.A02 = AnonymousClass0x9.A0E(view, R.id.avatar);
        this.A03 = AnonymousClass0x9.A0E(view, R.id.connect_icon);
        this.A0A = C86654Ky.A0f(view, R.id.ring_btn);
        this.A05 = (VoipCallControlRingingDotsIndicator) C06560Yg.A02(view, R.id.ringing_dots);
    }

    public static void A00(View view, float f, float f2) {
        AlphaAnimation A0C = AnonymousClass4L0.A0C(f, f2);
        A0C.setInterpolator(C05030Rp.A00(0.0f, 0.0f, 0.6f, 1.0f));
        A0C.setDuration(750);
        A0C.setRepeatCount(1);
        A0C.setRepeatMode(2);
        view.startAnimation(A0C);
    }

    public void A07() {
        A09();
        this.A00 = null;
        this.A05.removeCallbacks(this.A0B);
    }
}
