package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.ListView;
import com.whatsapp.pininchat.banner.PinInChatBannerMultiplePinsIndicator;
import com.whatsapp.pininchat.banner.PinInChatBannerViewModel;

/* renamed from: X.5rH  reason: invalid class name and case insensitive filesystem */
public abstract class C117035rH implements Comparable {
    public final int A00;
    public final AnonymousClass67A A01;

    public View A01() {
        if (this instanceof C92234mJ) {
            return ((C92234mJ) this).A00;
        }
        if (this instanceof C92194mF) {
            return ((C92194mF) this).A00;
        }
        if (this instanceof C92204mG) {
            return ((C92204mG) this).A00;
        }
        if (this instanceof C92184mE) {
            return ((C92184mE) this).A01;
        }
        if (this instanceof C92244mK) {
            return ((C92244mK) this).A01;
        }
        if (this instanceof C92214mH) {
            return ((C92214mH) this).A01;
        }
        if (this instanceof C92224mI) {
            return ((C92224mI) this).A00;
        }
        return ((C92174mD) this).A01;
    }

    /* JADX WARNING: Removed duplicated region for block: B:134:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x03f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02() {
        /*
            r13 = this;
            boolean r0 = r13 instanceof X.C92234mJ
            if (r0 == 0) goto L_0x0054
            r3 = r13
            X.4mJ r3 = (X.C92234mJ) r3
            X.1VX r0 = r3.A06
            boolean r0 = X.C106545Zk.A02(r0)
            r1 = 2131625747(0x7f0e0713, float:1.887871E38)
            if (r0 == 0) goto L_0x0015
            r1 = 2131625748(0x7f0e0714, float:1.8878713E38)
        L_0x0015:
            android.view.LayoutInflater r0 = X.C92174mD.A00(r3)
            android.view.ViewGroup r2 = r3.A02
            r0.inflate(r1, r2)
            r0 = 2131432452(0x7f0b1404, float:1.8486662E38)
            android.view.View r0 = X.C06560Yg.A02(r2, r0)
            r3.A00 = r0
            X.2eV r0 = r3.A0A
            int r1 = r0.A00()
            r0 = 1
            if (r1 <= r0) goto L_0x003b
            r0 = 2131432454(0x7f0b1406, float:1.8486666E38)
            android.view.View r0 = X.C06560Yg.A02(r2, r0)
            com.whatsapp.pininchat.banner.PinInChatBannerMultiplePinsIndicator r0 = (com.whatsapp.pininchat.banner.PinInChatBannerMultiplePinsIndicator) r0
            r3.A01 = r0
        L_0x003b:
            com.whatsapp.pininchat.banner.PinInChatBannerViewModel r1 = r3.A07
            X.08M r0 = r1.A01
            X.34x r0 = X.C86664Kz.A1H(r0)
            if (r0 == 0) goto L_0x0053
            r3.A09(r0)
            X.107 r0 = r1.A05
            java.lang.Object r0 = r0.A07()
            X.5Rr r0 = (X.C104615Rr) r0
            r3.A08(r0)
        L_0x0053:
            return
        L_0x0054:
            boolean r0 = r13 instanceof X.C92194mF
            if (r0 == 0) goto L_0x0079
            r3 = r13
            X.4mF r3 = (X.C92194mF) r3
            android.view.View r0 = r3.A00
            if (r0 != 0) goto L_0x0053
            android.view.LayoutInflater r2 = X.C92174mD.A00(r3)
            r1 = 2131625559(0x7f0e0657, float:1.887833E38)
            android.view.ViewGroup r0 = r3.A01
            android.view.View r1 = r2.inflate(r1, r0)
            r0 = 2131432364(0x7f0b13ac, float:1.8486483E38)
            android.view.View r0 = r1.findViewById(r0)
            r3.A00 = r0
            r3.A08()
            return
        L_0x0079:
            boolean r0 = r13 instanceof X.C92204mG
            if (r0 == 0) goto L_0x00ae
            r3 = r13
            X.4mG r3 = (X.C92204mG) r3
            android.view.LayoutInflater r2 = X.C92174mD.A00(r3)
            r0 = 2131625501(0x7f0e061d, float:1.8878212E38)
            android.view.ViewGroup r1 = r3.A01
            r2.inflate(r0, r1)
            r0 = 2131431651(0x7f0b10e3, float:1.8485037E38)
            android.view.View r2 = X.C06560Yg.A02(r1, r0)
            r3.A00 = r2
            if (r2 == 0) goto L_0x0053
            r0 = 2131429057(0x7f0b06c1, float:1.8479776E38)
            android.view.View r1 = X.C18280x3.A0E(r2, r0)
            r0 = 3
            X.C109345eT.A00(r1, r3, r0)
            r0 = 2131428791(0x7f0b05b7, float:1.8479236E38)
            android.view.View r1 = X.C18280x3.A0E(r2, r0)
            r0 = 4
            X.C109345eT.A00(r1, r3, r0)
            return
        L_0x00ae:
            boolean r0 = r13 instanceof X.C92184mE
            if (r0 == 0) goto L_0x00f4
            r3 = r13
            X.4mE r3 = (X.C92184mE) r3
            android.view.View r0 = r3.A01
            if (r0 != 0) goto L_0x0053
            X.67A r0 = r3.A01
            X.4eZ r1 = r0.getActivity()
            X.C162457s7.A0D(r1)
            android.content.Context r0 = r1.getApplicationContext()
            X.C162457s7.A0D(r0)
            X.3Db r0 = X.C389229y.A01(r0)
            X.1VX r0 = r0.Avy()
            boolean r0 = X.C106545Zk.A02(r0)
            r2 = 2131625422(0x7f0e05ce, float:1.8878052E38)
            if (r0 == 0) goto L_0x00dd
            r2 = 2131625423(0x7f0e05cf, float:1.8878054E38)
        L_0x00dd:
            android.view.LayoutInflater r1 = r1.getLayoutInflater()
            android.view.ViewGroup r0 = r3.A03
            android.view.View r1 = r1.inflate(r2, r0)
            r0 = 2131432378(0x7f0b13ba, float:1.8486512E38)
            android.view.View r0 = r1.findViewById(r0)
            r3.A01 = r0
            r3.A08()
            return
        L_0x00f4:
            boolean r0 = r13 instanceof X.C92244mK
            if (r0 == 0) goto L_0x0108
            r6 = r13
            X.4mK r6 = (X.C92244mK) r6
            X.3ZF r0 = r6.A08
            r8 = 0
            if (r0 != 0) goto L_0x0311
            X.2i6 r0 = r6.A07
            if (r0 != 0) goto L_0x0311
            r6.A05(r8)
            return
        L_0x0108:
            boolean r0 = r13 instanceof X.C92214mH
            if (r0 == 0) goto L_0x0134
            r3 = r13
            X.4mH r3 = (X.C92214mH) r3
            android.view.View r0 = r3.A01
            if (r0 != 0) goto L_0x0053
            boolean r0 = r3.A08
            r2 = 2131625053(0x7f0e045d, float:1.8877303E38)
            if (r0 == 0) goto L_0x011d
            r2 = 2131625054(0x7f0e045e, float:1.8877305E38)
        L_0x011d:
            android.view.LayoutInflater r1 = X.C92174mD.A00(r3)
            android.view.ViewGroup r0 = r3.A04
            android.view.View r1 = r1.inflate(r2, r0)
            r0 = 2131432374(0x7f0b13b6, float:1.8486504E38)
            android.view.View r0 = r1.findViewById(r0)
            r3.A01 = r0
            r3.A08()
            return
        L_0x0134:
            boolean r0 = r13 instanceof X.C92224mI
            if (r0 == 0) goto L_0x019a
            r3 = r13
            X.4mI r3 = (X.C92224mI) r3
            android.view.View r0 = r3.A00
            if (r0 != 0) goto L_0x0053
            X.67A r0 = r3.A01
            X.4eZ r1 = r0.getActivity()
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            android.content.Context r0 = r1.getApplicationContext()
            X.C162457s7.A0D(r0)
            X.3Db r0 = X.C389229y.A01(r0)
            X.1VX r0 = r0.Avy()
            boolean r0 = X.C106545Zk.A02(r0)
            r2 = 2131624331(0x7f0e018b, float:1.8875839E38)
            if (r0 == 0) goto L_0x0164
            r2 = 2131624332(0x7f0e018c, float:1.887584E38)
        L_0x0164:
            android.view.LayoutInflater r1 = r1.getLayoutInflater()
            android.view.ViewGroup r0 = r3.A04
            android.view.View r1 = r1.inflate(r2, r0)
            r0 = 2131428668(0x7f0b053c, float:1.8478987E38)
            android.view.View r0 = r1.findViewById(r0)
            r3.A00 = r0
            r3.A08()
            r5 = 1
            r6 = 0
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            android.view.animation.TranslateAnimation r4 = new android.view.animation.TranslateAnimation
            r9 = r5
            r11 = r5
            r12 = r6
            r7 = r5
            r8 = r6
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = 4
            X.C1232467r.A00(r4, r3, r0)
            r0 = 400(0x190, double:1.976E-321)
            r4.setDuration(r0)
            android.view.View r0 = r3.A00
            X.C626936e.A04(r0)
            r0.startAnimation(r4)
            return
        L_0x019a:
            r6 = r13
            X.4mD r6 = (X.C92174mD) r6
            android.view.ViewGroup r5 = r6.A01
            int r0 = r5.getVisibility()
            if (r0 == 0) goto L_0x0053
            int r0 = r5.getChildCount()
            r4 = 0
            boolean r9 = X.AnonymousClass001.A1W(r0)
            boolean r0 = r6 instanceof X.C92114m7
            if (r0 == 0) goto L_0x0241
            r3 = r6
            X.4m7 r3 = (X.C92114m7) r3
            android.view.ViewGroup r7 = r3.A01
            r0 = 2131430455(0x7f0b0c37, float:1.8482611E38)
            android.view.View r0 = r7.findViewById(r0)
            if (r0 != 0) goto L_0x0205
            r7.removeAllViews()
            X.67A r1 = r3.A01
            X.4eZ r0 = r1.getActivity()
            android.view.LayoutInflater r8 = r0.getLayoutInflater()
            r0 = 15
            X.54F r2 = new X.54F
            r2.<init>(r3, r0)
            X.4eZ r0 = r1.getActivity()
            X.C162457s7.A0J(r0, r4)
            android.content.Context r0 = r0.getApplicationContext()
            X.C162457s7.A0D(r0)
            X.3Db r0 = X.C389229y.A01(r0)
            X.1VX r0 = r0.Avy()
            boolean r0 = X.C106545Zk.A02(r0)
            r1 = 1
            if (r0 == 0) goto L_0x0230
            r0 = 2131624495(0x7f0e022f, float:1.8876171E38)
            r8.inflate(r0, r7, r1)
            r0 = 2131430451(0x7f0b0c33, float:1.8482603E38)
            android.view.View r0 = r7.findViewById(r0)
            com.whatsapp.wds.components.banners.WDSBannerCompact r0 = (com.whatsapp.wds.components.banners.WDSBannerCompact) r0
            r3.A01 = r0
            r0.setOnDismissListener((android.view.View.OnClickListener) r2)
        L_0x0205:
            r3.A0A()
        L_0x0208:
            X.67A r0 = r6.A01
            X.4eZ r0 = r0.getActivity()
            X.0R8 r1 = X.C86634Kw.A0R(r0)
            r0 = 0
            r1.A08(r0)
            float r0 = r6.A00
            X.AnonymousClass0YZ.A0B(r5, r0)
            r5.setVisibility(r4)
            if (r9 == 0) goto L_0x0053
            java.util.Objects.requireNonNull(r5)
            r0 = 40
            X.3Zj r2 = new X.3Zj
            r2.<init>(r5, r0)
            r0 = 10
            r5.postDelayed(r2, r0)
            return
        L_0x0230:
            r0 = 2131624494(0x7f0e022e, float:1.887617E38)
            r8.inflate(r0, r7, r1)
            r0 = 2131430452(0x7f0b0c34, float:1.8482605E38)
            android.view.View r0 = r7.findViewById(r0)
            r0.setOnClickListener(r2)
            goto L_0x0205
        L_0x0241:
            boolean r0 = r6 instanceof X.C92104m6
            if (r0 == 0) goto L_0x02b0
            r2 = r6
            X.4m6 r2 = (X.C92104m6) r2
            com.whatsapp.text.ReadMoreTextView r0 = r2.A01
            if (r0 != 0) goto L_0x0279
            android.view.ViewGroup r8 = r2.A01
            r8.removeAllViews()
            r0 = 12
            X.54F r3 = new X.54F
            r3.<init>(r2, r0)
            X.1VX r0 = r2.A09
            boolean r0 = X.C106545Zk.A02(r0)
            r7 = 1
            android.view.LayoutInflater r1 = X.C92174mD.A00(r2)
            if (r0 == 0) goto L_0x028e
            r0 = 2131624484(0x7f0e0224, float:1.887615E38)
            r1.inflate(r0, r8, r7)
            r0 = 2131428380(0x7f0b041c, float:1.8478403E38)
            android.view.View r0 = r8.findViewById(r0)
            com.whatsapp.wds.components.banners.WDSBannerCompact r0 = (com.whatsapp.wds.components.banners.WDSBannerCompact) r0
            r2.A02 = r0
            r0.setOnDismissListener((android.view.View.OnClickListener) r3)
        L_0x0279:
            r2.A09()
            java.lang.Integer r0 = X.AnonymousClass001.A0f()
            X.1Wa r1 = new X.1Wa
            r1.<init>()
            r1.A00 = r0
            X.4FV r0 = r2.A0A
            r0.BhD(r1)
            goto L_0x0208
        L_0x028e:
            r0 = 2131624483(0x7f0e0223, float:1.8876147E38)
            r1.inflate(r0, r8, r7)
            r0 = 2131428378(0x7f0b041a, float:1.8478399E38)
            android.widget.ImageView r0 = X.AnonymousClass0x9.A0F(r8, r0)
            r2.A00 = r0
            r0 = 2131428379(0x7f0b041b, float:1.84784E38)
            android.view.View r0 = r8.findViewById(r0)
            com.whatsapp.text.ReadMoreTextView r0 = (com.whatsapp.text.ReadMoreTextView) r0
            r2.A01 = r0
            android.widget.ImageView r0 = r2.A00
            if (r0 == 0) goto L_0x0279
            r0.setOnClickListener(r3)
            goto L_0x0279
        L_0x02b0:
            r7 = r6
            X.4m5 r7 = (X.C92094m5) r7
            com.whatsapp.wds.components.banners.WDSBannerCompact r0 = r7.A01
            if (r0 != 0) goto L_0x0208
            android.widget.ImageView r0 = r7.A00
            if (r0 != 0) goto L_0x0208
            android.view.ViewGroup r8 = r7.A01
            r8.removeAllViews()
            r0 = 11
            X.54F r3 = new X.54F
            r3.<init>(r7, r0)
            X.1VX r0 = r7.A03
            boolean r0 = X.C106545Zk.A02(r0)
            if (r0 == 0) goto L_0x02f6
            r2 = 2131624482(0x7f0e0222, float:1.8876145E38)
            android.view.LayoutInflater r1 = X.C92174mD.A00(r7)
            r0 = 1
            r1.inflate(r2, r8, r0)
            r0 = 2131428842(0x7f0b05ea, float:1.847934E38)
            android.view.View r1 = X.C06560Yg.A02(r8, r0)
            com.whatsapp.wds.components.banners.WDSBannerCompact r1 = (com.whatsapp.wds.components.banners.WDSBannerCompact) r1
            r7.A01 = r1
            if (r1 == 0) goto L_0x02ed
            r0 = 2131887198(0x7f12045e, float:1.9408996E38)
            r1.setText((int) r0)
        L_0x02ed:
            com.whatsapp.wds.components.banners.WDSBannerCompact r0 = r7.A01
            if (r0 == 0) goto L_0x0208
            r0.setOnDismissListener((android.view.View.OnClickListener) r3)
            goto L_0x0208
        L_0x02f6:
            r2 = 2131624481(0x7f0e0221, float:1.8876143E38)
            android.view.LayoutInflater r1 = X.C92174mD.A00(r7)
            r0 = 1
            r1.inflate(r2, r8, r0)
            r0 = 2131428841(0x7f0b05e9, float:1.8479338E38)
            android.widget.ImageView r0 = X.AnonymousClass0x9.A0E(r8, r0)
            r7.A00 = r0
            if (r0 == 0) goto L_0x0208
            r0.setOnClickListener(r3)
            goto L_0x0208
        L_0x0311:
            android.view.View r0 = r6.A01
            if (r0 != 0) goto L_0x03fb
            X.4xc r1 = r6.A0M
            X.8uW r0 = r6.A0L
            r1.A06(r0)
            android.view.LayoutInflater r2 = X.C92174mD.A00(r6)
            r0 = 2131625247(0x7f0e051f, float:1.8877697E38)
            android.view.ViewGroup r1 = r6.A0C
            r2.inflate(r0, r1)
            r0 = 2131430894(0x7f0b0dee, float:1.8483502E38)
            android.view.View r5 = X.C06560Yg.A02(r1, r0)
            r6.A01 = r5
            if (r5 == 0) goto L_0x03fb
            r0 = 2131432345(0x7f0b1399, float:1.8486445E38)
            android.view.View r3 = X.C06560Yg.A02(r5, r0)
            com.whatsapp.calling.PeerAvatarLayout r3 = (com.whatsapp.calling.PeerAvatarLayout) r3
            r6.A06 = r3
            if (r3 == 0) goto L_0x035a
            r0 = 2131166862(0x7f07068e, float:1.7947981E38)
            r3.A04 = r0
            android.content.Context r2 = r3.getContext()
            r1 = 2130968907(0x7f04014b, float:1.754648E38)
            r0 = 2131100066(0x7f0601a2, float:1.7812503E38)
            int r1 = X.AnonymousClass5Yj.A02(r2, r1, r0)
            r0 = 2131166861(0x7f07068d, float:1.794798E38)
            r3.A01 = r0
            r3.A00 = r1
        L_0x035a:
            r0 = 2131434290(0x7f0b1b32, float:1.849039E38)
            com.whatsapp.WaTextView r0 = X.AnonymousClass0x7.A0L(r5, r0)
            r6.A05 = r0
            r0 = 2131434082(0x7f0b1a62, float:1.8489968E38)
            com.whatsapp.WaTextView r0 = X.AnonymousClass0x7.A0L(r5, r0)
            r6.A04 = r0
            r0 = 2131430858(0x7f0b0dca, float:1.8483429E38)
            com.whatsapp.wds.components.button.WDSButton r0 = X.C86654Ky.A0f(r5, r0)
            r6.A0A = r0
            if (r0 == 0) goto L_0x037a
            r0.setEnabled(r8)
        L_0x037a:
            X.1VX r4 = r6.A0J
            r0 = 5460(0x1554, float:7.651E-42)
            boolean r0 = r4.A0X(r0)
            if (r0 == 0) goto L_0x0395
            r0 = 6121(0x17e9, float:8.577E-42)
            boolean r0 = r4.A0X(r0)
            if (r0 != 0) goto L_0x0395
            r0 = 2131430859(0x7f0b0dcb, float:1.848343E38)
            com.whatsapp.WaImageView r0 = X.AnonymousClass0x9.A0L(r5, r0)
            r6.A03 = r0
        L_0x0395:
            X.3ZF r0 = r6.A08
            if (r0 == 0) goto L_0x0437
            int r2 = r0.A0H
            boolean r1 = r0.A0L
        L_0x039d:
            com.whatsapp.wds.components.button.WDSButton r7 = r6.A0A
            if (r7 == 0) goto L_0x03e2
            if (r2 == 0) goto L_0x041c
            r0 = 1
            if (r2 == r0) goto L_0x041c
            r0 = 2
            if (r2 != r0) goto L_0x03e2
            r0 = 2131234233(0x7f080db9, float:1.8084626E38)
        L_0x03ac:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x03e2
            int r2 = r0.intValue()
            r0 = 6121(0x17e9, float:8.577E-42)
            boolean r0 = r4.A0X(r0)
            if (r0 == 0) goto L_0x0407
            X.66R r3 = r6.A0N
            java.lang.Object r1 = r3.getValue()
            X.2m0 r1 = (X.C52762m0) r1
            android.content.Context r0 = X.C18290x4.A0F(r7)
            X.0AR r2 = r1.A00(r0, r2, r8)
            if (r2 == 0) goto L_0x03e2
            java.lang.Object r1 = r3.getValue()
            X.2m0 r1 = (X.C52762m0) r1
            java.lang.ref.WeakReference r0 = X.AnonymousClass0x9.A14(r7)
            r1.A02 = r0
            r7.setIcon((android.graphics.drawable.Drawable) r2)
            r2.start()
        L_0x03e2:
            com.whatsapp.wds.components.button.WDSButton r1 = r6.A0A
            if (r1 == 0) goto L_0x03eb
            r0 = 48
            X.C18290x4.A1I(r1, r6, r5, r0)
        L_0x03eb:
            boolean r0 = X.C627436k.A0J(r4)
            if (r0 == 0) goto L_0x03fb
            r1 = 49
            X.5ef r0 = new X.5ef
            r0.<init>(r6, r1, r5)
            r5.setOnClickListener(r0)
        L_0x03fb:
            X.4FS r1 = r6.A0K
            r0 = 16
            X.5rM r0 = X.C117085rM.A00(r6, r0)
            r1.BkP(r0)
            return
        L_0x0407:
            X.66R r1 = r6.A0N
            boolean r0 = r1.BHk()
            if (r0 == 0) goto L_0x0418
            java.lang.Object r0 = r1.getValue()
            X.2m0 r0 = (X.C52762m0) r0
            r0.A02()
        L_0x0418:
            r7.setIcon((int) r2)
            goto L_0x03e2
        L_0x041c:
            r0 = 6121(0x17e9, float:8.577E-42)
            boolean r0 = r4.A0X(r0)
            if (r0 == 0) goto L_0x042d
            r0 = 2131233794(0x7f080c02, float:1.8083736E38)
            if (r1 == 0) goto L_0x03ac
            r0 = 2131233793(0x7f080c01, float:1.8083734E38)
            goto L_0x03ac
        L_0x042d:
            r0 = 2131231718(0x7f0803e6, float:1.8079525E38)
            if (r1 == 0) goto L_0x03ac
            r0 = 2131231803(0x7f08043b, float:1.8079697E38)
            goto L_0x03ac
        L_0x0437:
            X.2i6 r0 = r6.A07
            if (r0 == 0) goto L_0x03e2
            r2 = 1
            int r1 = r0.A00
            r0 = 2
            boolean r1 = X.AnonymousClass000.A1U(r1, r0)
            goto L_0x039d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117035rH.A02():void");
    }

    public final void A03() {
        ((C182188o0) this.A01).getConversationBanners().A01(getClass());
    }

    public void A04(C1225964z r15, boolean z) {
        View view;
        View view2;
        if (this instanceof C92234mJ) {
            C92234mJ r2 = (C92234mJ) this;
            if (r2.A07()) {
                C86644Kx.A0w(r2.A00);
                r2.A02.removeView(r2.A00);
                r2.A00 = null;
                PinInChatBannerMultiplePinsIndicator pinInChatBannerMultiplePinsIndicator = r2.A01;
                if (pinInChatBannerMultiplePinsIndicator != null) {
                    pinInChatBannerMultiplePinsIndicator.setVisibility(4);
                    r2.A01 = null;
                }
                r15.BUI();
                PinInChatBannerViewModel pinInChatBannerViewModel = r2.A07;
                Runnable runnable = pinInChatBannerViewModel.A00;
                if (runnable != null) {
                    pinInChatBannerViewModel.A02.A0R(runnable);
                }
                pinInChatBannerViewModel.A00 = null;
            }
        } else if (this instanceof C92194mF) {
            C92194mF r22 = (C92194mF) this;
            if (r22.A07() && (view2 = r22.A00) != null) {
                view2.setVisibility(8);
                r22.A01.removeView(r22.A00);
                r22.A00 = null;
            }
        } else if (this instanceof C92204mG) {
            C92204mG r23 = (C92204mG) this;
            if (r23.A07() && (view = r23.A00) != null) {
                view.setVisibility(8);
                r23.A01.removeView(view);
                r23.A00 = null;
            }
        } else if (this instanceof C92184mE) {
            C92184mE r24 = (C92184mE) this;
            if (z) {
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
                C1232367q.A00(translateAnimation, r24, r15, 3);
                translateAnimation.setDuration(400);
                View view3 = r24.A01;
                if (view3 != null) {
                    view3.startAnimation(translateAnimation);
                }
            } else {
                C18270x1.A0p(r24.A01);
                r24.A03.removeView(r24.A01);
                r24.A01 = null;
                r15.BUI();
            }
            C117085rM.A01(r24.A06, r24, 17);
        } else if (this instanceof C92244mK) {
            C92244mK r25 = (C92244mK) this;
            r25.A0M.A07(r25.A0L);
            r25.A09();
            AnonymousClass66R r1 = r25.A0N;
            if (r1.BHk()) {
                ((C52762m0) r1.getValue()).A02();
            }
            C18270x1.A0p(r25.A01);
            r25.A0C.removeView(r25.A01);
            r25.A01 = null;
            r25.A05 = null;
            r25.A04 = null;
            r25.A06 = null;
            r25.A08 = null;
            r25.A07 = null;
            r25.A00 = 9;
            r25.A03 = null;
            r25.A0A = null;
            r15.BUI();
        } else if (this instanceof C92214mH) {
            C92214mH r26 = (C92214mH) this;
            if (z) {
                TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
                C1232367q.A00(translateAnimation2, r15, r26, 2);
                translateAnimation2.setDuration(400);
                View view4 = r26.A01;
                C626936e.A04(view4);
                view4.startAnimation(translateAnimation2);
            } else {
                C86644Kx.A0w(r26.A01);
                r26.A04.removeView(r26.A01);
                r26.A01 = null;
                r15.BUI();
            }
            r26.A03 = true;
            C117085rM.A01(r26.A07, r26, 15);
        } else if (this instanceof C92224mI) {
            C92224mI r27 = (C92224mI) this;
            if (z) {
                TranslateAnimation translateAnimation3 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
                C1232367q.A00(translateAnimation3, r15, r27, 1);
                translateAnimation3.setDuration(400);
                View view5 = r27.A00;
                C626936e.A04(view5);
                view5.startAnimation(translateAnimation3);
                return;
            }
            C86644Kx.A0w(r27.A00);
            r27.A04.removeView(r27.A00);
            r27.A00 = null;
            r15.BUI();
        } else {
            C92174mD r4 = (C92174mD) this;
            if (z) {
                AnonymousClass67A r3 = r4.A01;
                if (r3.BHx()) {
                    TranslateAnimation translateAnimation4 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
                    C86624Kv.A18(translateAnimation4, 220);
                    r4.A01.startAnimation(translateAnimation4);
                } else {
                    ViewGroup viewGroup = r4.A01;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, "translationY", new float[]{0.0f, (float) (-viewGroup.getHeight())});
                    ListView listView = r3.getListView();
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(listView, "Top", new int[]{listView.getTop(), C86664Kz.A0D(viewGroup, listView.getTop())});
                    AnimatorSet A0O = C86664Kz.A0O();
                    A0O.playTogether(C86664Kz.A1b(ofFloat, ofInt, 2, 0));
                    A0O.addListener(new AnonymousClass67K(r4, 0, r15));
                    A0O.setDuration(220).start();
                    return;
                }
            }
            r4.A08(r15);
        }
    }

    public final void A05(boolean z) {
        AnonymousClass5PZ conversationBanners = ((C182188o0) this.A01).getConversationBanners();
        Class<?> cls = getClass();
        C162457s7.A0J(cls, 0);
        C117035rH A002 = conversationBanners.A00.A00(cls);
        if (A002 != null && A002.equals(conversationBanners.A00())) {
            A002.A04(new C112865kV(A002, conversationBanners), z);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001a A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A06() {
        /*
            r11 = this;
            boolean r0 = r11 instanceof X.C92234mJ
            if (r0 == 0) goto L_0x001c
            r1 = r11
            X.4mJ r1 = (X.C92234mJ) r1
            X.2eV r0 = r1.A0A
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x001a
            com.whatsapp.pininchat.banner.PinInChatBannerViewModel r0 = r1.A07
            X.08M r0 = r0.A01
            java.lang.Object r0 = r0.A07()
            r1 = 1
            if (r0 != 0) goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            return r1
        L_0x001c:
            boolean r0 = r11 instanceof X.C92194mF
            if (r0 == 0) goto L_0x0052
            r2 = r11
            X.4mF r2 = (X.C92194mF) r2
            X.2ss r1 = r2.A02
            X.3ZH r0 = r2.A04
            X.4uZ r0 = r0.A0H
            X.31A r3 = X.C56982ss.A00(r1, r0)
            if (r3 == 0) goto L_0x01b5
            X.2Oe r1 = r2.A05
            X.4uZ r0 = r3.A05()
            boolean r0 = r0 instanceof X.C95804uY
            r2 = 0
            if (r0 == 0) goto L_0x01b5
            X.1VX r1 = r1.A00
            r0 = 4219(0x107b, float:5.912E-42)
            boolean r1 = r1.A0X(r0)
            X.1RL r3 = (X.AnonymousClass1RL) r3
            boolean r0 = r3.A0K()
            if (r1 == 0) goto L_0x0051
            if (r0 == 0) goto L_0x0051
            boolean r0 = r3.A0N
            if (r0 == 0) goto L_0x0051
            r2 = 1
        L_0x0051:
            return r2
        L_0x0052:
            boolean r0 = r11 instanceof X.C92204mG
            if (r0 == 0) goto L_0x00b7
            r7 = r11
            X.4mG r7 = (X.C92204mG) r7
            X.4uZ r0 = r7.A06
            X.1fJ r6 = X.AnonymousClass34R.A03(r0)
            r4 = 0
            if (r6 == 0) goto L_0x00ab
            X.3Ex r0 = r7.A02
            X.3ZH r5 = r0.A08(r6)
            if (r5 == 0) goto L_0x00ab
            X.1VX r3 = r7.A05
            boolean r0 = X.AnonymousClass5YT.A00(r5, r3)
            if (r0 == 0) goto L_0x00ab
            java.lang.String r1 = r5.A0V
            if (r1 == 0) goto L_0x00ab
            X.2sH r0 = r7.A03
            long r9 = r0.A0H()
            long r0 = java.lang.Long.parseLong(r1)
            long r9 = r9 - r0
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
            r0 = 5016(0x1398, float:7.029E-42)
            long r0 = X.C56952sp.A06(r3, r0)
            long r1 = r8.toMillis(r0)
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00ab
            r0 = 5119(0x13ff, float:7.173E-42)
            long r0 = X.C56952sp.A06(r3, r0)
            long r1 = r8.toMillis(r0)
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00ab
            boolean r0 = r5.A14
            if (r0 == 0) goto L_0x00ac
            X.2sj r0 = r7.A04
            boolean r0 = r0.A0D(r6)
            if (r0 != 0) goto L_0x00ac
        L_0x00ab:
            return r4
        L_0x00ac:
            boolean r0 = r5.A11
            if (r0 != 0) goto L_0x00ab
            r0 = 5002(0x138a, float:7.009E-42)
            boolean r4 = X.C56952sp.A0K(r3, r0, r4)
            return r4
        L_0x00b7:
            boolean r0 = r11 instanceof X.C92184mE
            if (r0 == 0) goto L_0x00d3
            r2 = r11
            X.4mE r2 = (X.C92184mE) r2
            X.3Ex r1 = r2.A05
            X.1fJ r0 = r2.A02
            X.3ZH r0 = r1.A06(r0)
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.A0w
            if (r0 != 0) goto L_0x001a
            int r0 = r2.A00
        L_0x00ce:
            r1 = 1
            if (r0 > 0) goto L_0x001b
            goto L_0x001a
        L_0x00d3:
            boolean r0 = r11 instanceof X.C92244mK
            if (r0 == 0) goto L_0x00e5
            r1 = r11
            X.4mK r1 = (X.C92244mK) r1
            X.3ZF r0 = r1.A08
            if (r0 != 0) goto L_0x00e3
            X.2i6 r0 = r1.A07
            r1 = 0
            if (r0 == 0) goto L_0x001b
        L_0x00e3:
            r1 = 1
            return r1
        L_0x00e5:
            boolean r0 = r11 instanceof X.C92214mH
            if (r0 == 0) goto L_0x00f7
            r1 = r11
            X.4mH r1 = (X.C92214mH) r1
            X.1fJ r0 = r1.A02
            if (r0 == 0) goto L_0x001a
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x001a
            int r0 = r1.A00
            goto L_0x00ce
        L_0x00f7:
            boolean r0 = r11 instanceof X.C92114m7
            if (r0 == 0) goto L_0x012f
            r2 = r11
            X.4m7 r2 = (X.C92114m7) r2
            boolean r0 = r2.A0A
            if (r0 == 0) goto L_0x001a
            X.3Mh r1 = r2.A02
            X.1Ek r0 = X.C66663Mh.A1A
            int r0 = r1.A03(r0)
            if (r0 <= 0) goto L_0x001a
            X.2ss r1 = r2.A05
            X.3ZH r0 = r2.A00
            com.whatsapp.jid.Jid r0 = X.AnonymousClass4L0.A0M(r0)
            X.31A r0 = X.C56982ss.A01(r1, r0)
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.A0p
            if (r0 == 0) goto L_0x001a
            X.3ZH r0 = r2.A00
            X.2zN r0 = r0.A0K
            if (r0 == 0) goto L_0x001a
            java.lang.String r0 = r0.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            if (r0 == 0) goto L_0x001b
            goto L_0x001a
        L_0x012f:
            boolean r0 = r11 instanceof X.C92104m6
            if (r0 == 0) goto L_0x0145
            r0 = r11
            X.4m6 r0 = (X.C92104m6) r0
            X.33p r0 = r0.A08
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "pnh_cag_future_proof_banner_closed"
            boolean r0 = X.C18280x3.A1W(r1, r0)
            r1 = r0 ^ 1
            return r1
        L_0x0145:
            boolean r0 = r11 instanceof X.C92094m5
            if (r0 == 0) goto L_0x016f
            r2 = r11
            X.4m5 r2 = (X.C92094m5) r2
            X.33p r0 = r2.A02
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "cag_replies_promotion_banner_closed"
            boolean r0 = X.C18280x3.A1W(r1, r0)
            if (r0 != 0) goto L_0x001a
            X.1VX r1 = r2.A03
            r0 = 5656(0x1618, float:7.926E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x001a
            r0 = 4727(0x1277, float:6.624E-42)
            boolean r0 = r1.A0X(r0)
            r1 = 1
            if (r0 != 0) goto L_0x001b
            goto L_0x001a
        L_0x016f:
            r5 = r11
            X.4mI r5 = (X.C92224mI) r5
            boolean r0 = r5.A0B
            if (r0 != 0) goto L_0x001a
            boolean r0 = r5.A0C
            if (r0 != 0) goto L_0x001a
            X.2h6 r2 = r5.A08
            X.3ZH r0 = r5.A01
            java.lang.Class<com.whatsapp.jid.UserJid> r6 = com.whatsapp.jid.UserJid.class
            X.4uZ r1 = X.AnonymousClass3ZH.A02(r0, r6)
            X.2ss r0 = r2.A02
            X.31A r0 = X.C56982ss.A00(r0, r1)
            if (r0 == 0) goto L_0x001a
            long r3 = r0.A0C
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x001a
            com.whatsapp.jid.UserJid r0 = r5.A02
            if (r0 == 0) goto L_0x001a
            X.3ZH r0 = r5.A01
            com.whatsapp.jid.Jid r1 = X.AnonymousClass3ZH.A05(r0, r6)
            com.whatsapp.jid.UserJid r0 = r5.A02
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x001a
            X.3Ex r1 = r5.A06
            com.whatsapp.jid.UserJid r0 = r5.A02
            X.3ZH r0 = r1.A0A(r0)
            X.2k5 r0 = r0.A0F
            r1 = 1
            if (r0 == 0) goto L_0x001b
            goto L_0x001a
        L_0x01b5:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117035rH.A06():boolean");
    }

    public final boolean A07() {
        return AnonymousClass000.A1Y(((C182188o0) this.A01).getConversationBanners().A00(), this);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.A00, ((C117035rH) obj).A00);
    }

    public C117035rH(AnonymousClass67A r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }
}
