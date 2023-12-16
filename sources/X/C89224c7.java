package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.widget.AbsListView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.emoji.EmojiPopupFooter;
import com.whatsapp.emoji.search.EmojiSearchProvider;

/* renamed from: X.4c7  reason: invalid class name and case insensitive filesystem */
public class C89224c7 extends AnonymousClass4Rn implements ViewTreeObserver.OnGlobalLayoutListener {
    public int A00 = R.drawable.ib_emoji;
    public int A01;
    public int A02;
    public int A03 = R.drawable.ib_keyboard;
    public int A04;
    public ViewGroup A05;
    public AnonymousClass4CE A06;
    public AnonymousClass5ZF A07;
    public EmojiPopupFooter A08;
    public C148127Ha A09 = new C148127Ha(true, true);
    public C182408oM A0A;
    public C103785Ok A0B;
    public AnonymousClass5S9 A0C;
    public C45592aG A0D;
    public Runnable A0E;
    public final View.OnClickListener A0F;
    public final View A0G;
    public final AbsListView.OnScrollListener A0H = new C107045ab(this, 7);
    public final ImageButton A0I;
    public final AnonymousClass4CE A0J = new AnonymousClass694(this, 7);
    public final WaEditText A0K;
    public final C620733j A0L;
    public final AnonymousClass5IY A0M;
    public final C27821ej A0N;
    public final AnonymousClass5Y0 A0O;
    public final EmojiSearchProvider A0P;
    public final AnonymousClass1VX A0Q;
    public final C60152y5 A0R;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C89224c7(android.app.Activity r11, android.widget.ImageButton r12, X.C55682qk r13, X.C181568my r14, com.whatsapp.WaEditText r15, X.C620633i r16, X.AnonymousClass33p r17, X.C620733j r18, X.AnonymousClass5IY r19, X.C27821ej r20, X.AnonymousClass5Y0 r21, com.whatsapp.emoji.search.EmojiSearchProvider r22, X.AnonymousClass1VX r23, X.C60152y5 r24, X.C105895Wv r25) {
        /*
            r10 = this;
            r6 = r14
            r3 = r10
            r4 = r11
            r5 = r13
            r7 = r16
            r8 = r17
            r9 = r25
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r1 = 1
            X.7Ha r0 = new X.7Ha
            r0.<init>(r1, r1)
            r10.A09 = r0
            r2 = 2131231686(0x7f0803c6, float:1.807946E38)
            r10.A00 = r2
            r0 = 2131231688(0x7f0803c8, float:1.8079464E38)
            r10.A03 = r0
            r1 = 7
            X.694 r0 = new X.694
            r0.<init>(r10, r1)
            r10.A0J = r0
            X.5ab r0 = new X.5ab
            r0.<init>(r10, r1)
            r10.A0H = r0
            r0 = 14
            X.39a r1 = new X.39a
            r1.<init>(r10, r0)
            r10.A0F = r1
            android.view.View r6 = (android.view.View) r6
            r10.A0G = r6
            r0 = r23
            r10.A0Q = r0
            r0 = r21
            r10.A0O = r0
            r0 = r20
            r10.A0N = r0
            r0 = r18
            r10.A0L = r0
            r0 = r19
            r10.A0M = r0
            r0 = r22
            r10.A0P = r0
            r0 = r24
            r10.A0R = r0
            r10.A0I = r12
            r10.A0K = r15
            X.C86644Kx.A12(r6, r10)
            if (r12 == 0) goto L_0x0069
            r0 = 2131101258(0x7f06064a, float:1.781492E38)
            X.C107335b8.A0C(r11, r12, r2, r0)
            r12.setOnClickListener(r1)
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89224c7.<init>(android.app.Activity, android.widget.ImageButton, X.2qk, X.8my, com.whatsapp.WaEditText, X.33i, X.33p, X.33j, X.5IY, X.1ej, X.5Y0, com.whatsapp.emoji.search.EmojiSearchProvider, X.1VX, X.2y5, X.5Wv):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r4.A00 != 0) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09() {
        /*
            r6 = this;
            r2 = 0
            r6.A02 = r2
            r6.A04()
            X.8my r0 = r6.A05
            r0.setKeyboardPopup(r6)
            X.5ZF r0 = r6.A07
            if (r0 != 0) goto L_0x0012
            r6.A0A()
        L_0x0012:
            r4 = r6
            boolean r0 = r6 instanceof X.C94264qq
            if (r0 == 0) goto L_0x00f5
            X.4qq r4 = (X.C94264qq) r4
            X.7Ha r0 = r4.A09
            boolean r0 = r0.A01
            r1 = 0
            if (r0 == 0) goto L_0x0025
            int r3 = r4.A00
            r0 = 1
            if (r3 == 0) goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            r4.A0D(r0)
            X.7Ha r0 = r4.A09
            boolean r0 = r0.A00
            r3 = 8
            if (r0 != 0) goto L_0x0033
            r1 = 8
        L_0x0033:
            X.5KZ r0 = r4.A0B
            X.5IW r0 = r0.A01
            android.widget.ImageView r0 = r0.A02
            r0.setVisibility(r1)
            X.5mw r0 = r4.A0C
            if (r0 == 0) goto L_0x0047
            X.5Ou r0 = r0.A01
            android.widget.ImageView r0 = r0.A09
            r0.setVisibility(r1)
        L_0x0047:
            X.5RA r0 = r4.A0D
            if (r0 == 0) goto L_0x0052
            X.5Jq r0 = r0.A02
            android.view.View r0 = r0.A02
            r0.setVisibility(r1)
        L_0x0052:
            X.5Qz r1 = r4.A0A
            if (r1 == 0) goto L_0x005f
            X.7Ha r0 = r4.A09
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x00ec
            r1.A01(r3)
        L_0x005f:
            X.5ZF r5 = r6.A07
            android.os.HandlerThread r0 = X.AnonymousClass5ZF.A0V
            if (r0 != 0) goto L_0x0091
            java.lang.String r1 = "Emoji Thread"
            android.os.HandlerThread r0 = new android.os.HandlerThread
            r0.<init>(r1)
            X.AnonymousClass5ZF.A0V = r0
            r0.start()
            android.content.Context r0 = r5.A09
            android.content.Context r4 = r0.getApplicationContext()
            X.5Y0 r3 = r5.A0P
            android.os.HandlerThread r0 = X.AnonymousClass5ZF.A0V
            android.os.Looper r1 = r0.getLooper()
            X.4MX r0 = new X.4MX
            r0.<init>(r4, r1, r3)
            X.AnonymousClass5ZF.A0X = r0
            android.os.Looper r1 = r4.getMainLooper()
            X.4MH r0 = new X.4MH
            r0.<init>(r1)
            X.AnonymousClass5ZF.A0W = r0
        L_0x0091:
            androidx.viewpager.widget.ViewPager r0 = r5.A0K
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r5.A0G
            r1.addOnGlobalLayoutListener(r0)
            r6.A0B()
            r1 = -1
            int r0 = r6.A08(r1)
            r6.A01 = r0
            r6.setHeight(r0)
            r6.setWidth(r1)
            android.view.View r3 = r6.A0G
            if (r3 == 0) goto L_0x00c8
            r1 = 1000000(0xf4240, float:1.401298E-39)
            r0 = 8388659(0x800033, float:1.1755015E-38)
            r6.showAtLocation(r3, r0, r2, r1)
            java.util.Objects.requireNonNull(r3)
            r0 = 39
            X.3Zj r2 = new X.3Zj
            r2.<init>(r3, r0)
            r0 = 60
            r3.postDelayed(r2, r0)
        L_0x00c8:
            r6.Bk0()
            com.whatsapp.WaEditText r3 = r6.A0K
            if (r3 == 0) goto L_0x00df
            r0 = 43
            X.5sG r2 = new X.5sG
            r2.<init>((java.lang.Object) r6, (int) r0)
            r1 = 1
            X.92R r0 = new X.92R
            r0.<init>(r3, r1)
            r6.A05(r0, r3, r2)
        L_0x00df:
            X.5IY r1 = r6.A0M
            java.lang.String r0 = r1.A00
            if (r0 != 0) goto L_0x00eb
            java.lang.String r0 = X.C18280x3.A0Y()
            r1.A00 = r0
        L_0x00eb:
            return
        L_0x00ec:
            int r0 = r4.A0E()
            r1.A01(r0)
            goto L_0x005f
        L_0x00f5:
            X.7Ha r0 = r6.A09
            boolean r0 = r0.A01
            r6.A0D(r0)
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89224c7.A09():void");
    }

    public void A0A() {
        EmojiSearchProvider emojiSearchProvider;
        AnonymousClass4AZ r0;
        Activity activity = this.A03;
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        activity.getLayoutInflater().inflate(R.layout.f8nameremoved, relativeLayout, true);
        ViewGroup A0J2 = C86644Kx.A0J(relativeLayout, R.id.emoji_view);
        this.A05 = A0J2;
        A0J2.getLayoutParams().height = -1;
        this.A05.setVisibility(0);
        setContentView(relativeLayout);
        relativeLayout.setLayoutDirection(3);
        AnonymousClass4Rn.A00(this);
        int i = 8;
        this.A05.findViewById(R.id.fallback_divider).setVisibility(8);
        AnonymousClass1VX r16 = this.A0Q;
        C55682qk r17 = this.A04;
        AnonymousClass5Y0 r15 = this.A0O;
        C27821ej r14 = this.A0N;
        C620733j r12 = this.A0L;
        AnonymousClass5IY r11 = this.A0M;
        AnonymousClass33p r10 = this.A07;
        C60152y5 r8 = this.A0R;
        ViewGroup viewGroup = this.A05;
        View view = this.A0G;
        C27821ej r21 = r14;
        AnonymousClass33p r18 = r10;
        C620733j r19 = r12;
        AbsListView.OnScrollListener onScrollListener = this.A0H;
        View view2 = view;
        ViewGroup viewGroup2 = viewGroup;
        AnonymousClass5ZF r122 = new AnonymousClass5ZF(activity, view2, viewGroup2, onScrollListener, r17, r18, r19, r11, r21, r15, r16, r8);
        this.A07 = r122;
        r122.A02 = this.A0J;
        EmojiPopupFooter emojiPopupFooter = (EmojiPopupFooter) this.A05.findViewById(R.id.footer_toolbar);
        this.A08 = emojiPopupFooter;
        emojiPopupFooter.setClickable(true);
        A0D(true);
        View findViewById = this.A05.findViewById(R.id.gif_tab);
        View findViewById2 = this.A05.findViewById(R.id.emoji_tab);
        View findViewById3 = this.A05.findViewById(R.id.search_button);
        findViewById.setVisibility(8);
        findViewById2.setVisibility(8);
        if (this instanceof C94264qq) {
            C94264qq r2 = (C94264qq) this;
            emojiSearchProvider = r2.A0P;
            r0 = new AnonymousClass8H4(findViewById3, r2);
        } else {
            emojiSearchProvider = this.A0P;
            r0 = new C1898993b(findViewById3, 0);
        }
        emojiSearchProvider.A00 = r0;
        EmojiSearchProvider emojiSearchProvider2 = this.A0P;
        if (emojiSearchProvider2.A02) {
            i = 0;
        }
        findViewById3.setVisibility(i);
        emojiSearchProvider2.A01((Integer) null);
        C18310x6.A18(findViewById3, this, 17);
        C86604Kt.A1F(this.A05, R.id.delete_symbol_tb, 0);
        setTouchInterceptor(new AnonymousClass5CS(this, 4));
        setFocusable(false);
    }

    public void A0B() {
        ImageButton imageButton;
        if (this.A01 != 1 && (imageButton = this.A0I) != null) {
            Activity activity = this.A03;
            C107335b8.A0C(activity, imageButton, this.A03, R.color.f5nameremoved);
            C18300x5.A13(activity, imageButton, R.string.f11nameremoved);
            imageButton.setOnClickListener(this.A0F);
            this.A01 = 1;
        }
    }

    public void A0C(AnonymousClass4CE r3) {
        this.A06 = r3;
        AnonymousClass5ZF r1 = this.A07;
        if (r1 != null) {
            r1.A02 = this.A0J;
        }
    }

    public void A0D(boolean z) {
        ImageView imageView = this.A07.A0J;
        if (imageView != null) {
            imageView.setVisibility(AnonymousClass001.A08(z ? 1 : 0));
        }
    }

    public void Bk0() {
        if (this.A08.getVisibility() != 0) {
            this.A08.setVisibility(0);
        }
        Animation animation = this.A08.getAnimation();
        if (animation instanceof AnonymousClass4O9) {
            animation.cancel();
        }
        this.A08.setTopOffset(0);
    }

    public void onGlobalLayout() {
        boolean A002;
        if (AnonymousClass001.A0M(this.A03).keyboard != 1) {
            A002 = false;
        } else {
            A002 = C105895Wv.A00(this.A0G);
        }
        this.A00 = A002 ? 1 : 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r2.A0E.A0X(3403) != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r5 = this;
            super.A03()
            com.whatsapp.emoji.search.EmojiSearchProvider r0 = r5.A0P
            r4 = 0
            r0.A00 = r4
            r2 = r5
            boolean r0 = r5 instanceof X.C94264qq
            if (r0 == 0) goto L_0x0043
            X.4qq r2 = (X.C94264qq) r2
            X.5RA r0 = r2.A0D
            if (r0 == 0) goto L_0x0024
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0024
            X.1VX r1 = r2.A0E
            r0 = 3403(0xd4b, float:4.769E-42)
            boolean r1 = r1.A0X(r0)
            r0 = 2
            if (r1 == 0) goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            r2.A0I(r0)
        L_0x0028:
            X.5ZF r2 = r5.A07
            if (r2 == 0) goto L_0x003e
            android.view.View r1 = r2.A0D
            r0 = 8
            r1.setVisibility(r0)
            androidx.viewpager.widget.ViewPager r0 = r2.A0K
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r2.A0G
            r1.removeGlobalOnLayoutListener(r0)
        L_0x003e:
            X.5IY r0 = r5.A0M
            r0.A00 = r4
            return
        L_0x0043:
            int r0 = r5.A01
            if (r0 == 0) goto L_0x0028
            android.widget.ImageButton r3 = r5.A0I
            if (r3 == 0) goto L_0x0028
            android.app.Activity r2 = r5.A03
            int r1 = r5.A00
            r0 = 2131101258(0x7f06064a, float:1.781492E38)
            X.C107335b8.A0C(r2, r3, r1, r0)
            r0 = 2131895838(0x7f12261e, float:1.942652E38)
            X.C18300x5.A13(r2, r3, r0)
            android.view.View$OnClickListener r0 = r5.A0F
            r3.setOnClickListener(r0)
            r0 = 0
            r5.A01 = r0
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89224c7.A03():void");
    }
}
