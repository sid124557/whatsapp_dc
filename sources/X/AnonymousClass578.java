package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.ViewOutlineProvider;
import com.whatsapp.R;

/* renamed from: X.578  reason: invalid class name */
public final class AnonymousClass578 extends C88574aD {
    public static final /* synthetic */ C188488yy[] A0K;
    public int A00;
    public ColorStateList A01;
    public AnonymousClass5GB A02;
    public AnonymousClass1VX A03;
    public C187958y5 A04;
    public C142006wU A05;
    public AnonymousClass58G A06 = AnonymousClass58G.GONE;
    public AnonymousClass5IC A07;
    public AnonymousClass5Z7 A08 = AnonymousClass5Z7.A04.A00(this);
    public C147567Eu A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final AnonymousClass66R A0E;
    public final AnonymousClass66R A0F = C154517dI.A01(new C120545yl(this));
    public final AnonymousClass66R A0G;
    public final AnonymousClass66R A0H;
    public final C188468yw A0I = new AnonymousClass8PG(0, new AnonymousClass5AQ(this, 5));
    public final C188468yw A0J = new AnonymousClass8PG(0, new AnonymousClass5AQ(this, 6));

    static {
        Class<AnonymousClass578> cls = AnonymousClass578.class;
        A0K = new C188488yy[]{new AnonymousClass8ZZ(cls, "scrolledBackgroundColor", "getScrolledBackgroundColor()I"), new AnonymousClass8ZZ(cls, "animateOnScrollTargetViewId", "getAnimateOnScrollTargetViewId()I")};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass578(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getTheme().applyStyle(R.style.f12nameremoved, true);
        this.A0G = C154517dI.A01(new C120555ym(context));
        int A042 = AnonymousClass0Y8.A04(context, R.color.f5nameremoved);
        this.A00 = A042;
        ColorStateList valueOf = ColorStateList.valueOf(A042);
        C162457s7.A0D(valueOf);
        this.A01 = valueOf;
        this.A05 = C142006wU.FILLED;
        this.A0C = true;
        AnonymousClass5GB r1 = this.A02;
        if (r1 != null && !isInEditMode()) {
            AnonymousClass0YH.A06(this, C102805Ki.A00(r1.A00) ? 1 : 0);
        }
        super.setContentInsetStartWithNavigation(0);
        super.A0I(context, R.style.f12nameremoved);
        if (attributeSet != null) {
            TypedArray A0X = C86664Kz.A0X(C18290x4.A0F(this), attributeSet, C1462679k.A0D);
            setAnimateOnScroll$wds_consumerBeta(A0X.getBoolean(0, false));
            setAnimateOnScrollTargetViewId(A0X.getResourceId(1, 0));
            if (C1001059l.A03) {
                AnonymousClass58G r3 = AnonymousClass58G.VISIBLE;
                AnonymousClass58G[] values = AnonymousClass58G.values();
                int i = A0X.getInt(2, 0);
                if (i >= 0) {
                    C162457s7.A0J(values, 0);
                    if (i <= values.length - 1) {
                        r3 = values[i];
                    }
                }
                setDividerVisibility(r3);
            }
            A0X.recycle();
        }
        setOutlineProvider((ViewOutlineProvider) null);
        A0M();
        this.A0H = C154517dI.A01(new C174978Wp(this));
        this.A0E = C154517dI.A01(new C174968Wo(this));
    }

    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        C162457s7.A0J(canvas, 0);
        super.onDraw(canvas);
        if (this.A06 == AnonymousClass58G.VISIBLE) {
            canvas2.drawLine(0.0f, C86664Kz.A02(this) - getDividerHeight(), AnonymousClass4L0.A00(this), C86664Kz.A02(this), getDividerPaint());
        }
    }

    public final void setDividerVisibility(AnonymousClass58G r2) {
        C162457s7.A0J(r2, 0);
        if (C1001059l.A03 && this.A06 != r2) {
            this.A06 = r2;
            invalidate();
        }
    }

    public final void setScrollableContentTracker(C147567Eu r2) {
        C162457s7.A0J(r2, 0);
        this.A09 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0047, code lost:
        if (r1 != false) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setViewState(X.AnonymousClass5Z7 r4) {
        /*
            r3 = this;
            r0 = 0
            X.C162457s7.A0J(r4, r0)
            r3.A08 = r4
            boolean r0 = r3.A0C
            if (r0 == 0) goto L_0x0052
            X.5IC r2 = r4.A00
            boolean r0 = X.AnonymousClass000.A1W(r2)
            r3.A0B = r0
            if (r2 == 0) goto L_0x0036
            android.content.Context r1 = X.C18290x4.A0F(r3)
            int r0 = r2.A00
            int r1 = X.AnonymousClass0Y8.A04(r1, r0)
            r3.A00 = r1
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r1)
            X.C162457s7.A0D(r0)
            r3.A01 = r0
            X.6wU r0 = r2.A01
            r3.A05 = r0
            super.setTitleTextColor((int) r1)
            super.setSubtitleTextColor((int) r1)
            super.setNavigationIconTint(r1)
        L_0x0036:
            android.content.Context r2 = r3.getContext()
            X.5Z7 r0 = r3.A08
            java.lang.CharSequence r0 = r0.A01
            if (r0 == 0) goto L_0x0049
            boolean r1 = X.C175738Zn.A0V(r0)
            r0 = 2132084228(0x7f150604, float:1.980862E38)
            if (r1 == 0) goto L_0x004c
        L_0x0049:
            r0 = 2132084226(0x7f150602, float:1.9808617E38)
        L_0x004c:
            super.A0J(r2, r0)
            r3.invalidate()
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass578.setViewState(X.5Z7):void");
    }

    private final ValueAnimator.AnimatorUpdateListener getBackgroundColorUpdateListener() {
        return (ValueAnimator.AnimatorUpdateListener) this.A0E.getValue();
    }

    private final float getDividerHeight() {
        return AnonymousClass001.A05(this.A0F.getValue());
    }

    private final Paint getDividerPaint() {
        return (Paint) this.A0G.getValue();
    }

    private final boolean getScrollAnimationEnabled() {
        return C106545Zk.A04(this.A03, (C58422vE) null, 4490);
    }

    private final C15930sC getScrollStateObserver() {
        return (C15930sC) this.A0H.getValue();
    }

    public void A0I(Context context, int i) {
    }

    public void A0J(Context context, int i) {
    }

    public final void A0L() {
        AnonymousClass5IC r0 = this.A08.A00;
        if (r0 != null) {
            super.setTitleTextColor(AnonymousClass0Y8.A04(C18290x4.A0F(this), r0.A00));
        }
    }

    public final void A0M() {
        setViewState(AnonymousClass5Z7.A04.A00(this));
    }

    public final AnonymousClass1VX getAbProps() {
        return this.A03;
    }

    public final boolean getAnimateOnScroll$wds_consumerBeta() {
        return this.A0A;
    }

    public final int getAnimateOnScrollTargetViewId() {
        return AnonymousClass001.A0K(this.A0I.BEB(this, A0K[1]));
    }

    public Drawable getBackground() {
        if (!this.A0C) {
            return AnonymousClass6D1.A00;
        }
        return super.getBackground();
    }

    public final AnonymousClass5GB getBidiToolbarDelegate() {
        return this.A02;
    }

    public final AnonymousClass58G getDividerVisibility() {
        return this.A06;
    }

    public final AnonymousClass5IC getIconSet() {
        return this.A07;
    }

    public final C147567Eu getScrollableContentTracker() {
        C147567Eu r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("scrollableContentTracker");
    }

    public final int getScrolledBackgroundColor() {
        return AnonymousClass001.A0K(this.A0J.BEB(this, A0K[0]));
    }

    public final C187958y5 getSystemFeatures() {
        return this.A04;
    }

    public final AnonymousClass5Z7 getViewState() {
        return this.A08;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r4 == false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setAnimateOnScroll$wds_consumerBeta(boolean r4) {
        /*
            r3 = this;
            X.1VX r2 = r3.A03
            r1 = 0
            r0 = 4490(0x118a, float:6.292E-42)
            boolean r0 = X.C106545Zk.A04(r2, r1, r0)
            if (r0 == 0) goto L_0x000e
            r0 = 1
            if (r4 != 0) goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            r3.A0A = r0
            r3.isAttachedToWindow()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass578.setAnimateOnScroll$wds_consumerBeta(boolean):void");
    }

    public final void setAnimateOnScrollTargetViewId(int i) {
        this.A0I.Bnj(this, Integer.valueOf(i), A0K[1]);
    }

    public void setElevation(float f) {
        if (C106545Zk.A04(this.A03, (C58422vE) null, 4490)) {
            f = 0.0f;
        }
        super.setElevation(f);
    }

    public final void setIconSet(AnonymousClass5IC r2) {
        if (!C162457s7.A0P(this.A07, r2)) {
            this.A07 = r2;
            A0M();
        }
    }

    public void setOverflowIcon(Drawable drawable) {
        if (drawable != null && this.A0B) {
            ColorStateList colorStateList = this.A01;
            C162457s7.A0J(colorStateList, 1);
            drawable = C06130Wj.A01(drawable.mutate());
            C162457s7.A0D(drawable);
            C06130Wj.A02(drawable);
            AnonymousClass0YG.A01(colorStateList, drawable);
        }
        super.setOverflowIcon(drawable);
    }

    public final void setScrolledBackgroundColor(int i) {
        this.A0J.Bnj(this, Integer.valueOf(i), A0K[0]);
    }

    public void setSubtitleTextColor(int i) {
        if (!this.A0B) {
            super.setSubtitleTextColor(i);
        }
    }

    public void setTitleTextColor(int i) {
        if (!this.A0B) {
            super.setTitleTextColor(i);
        }
    }

    public final void A0N(int i) {
        super.setTitleTextColor(C86624Kv.A02(this, i));
    }

    public Menu getMenu() {
        Menu menu = super.getMenu();
        if (!this.A0D) {
            this.A0D = true;
            if (!C06360Xi.A05(this) || isLayoutRequested()) {
                addOnLayoutChangeListener(new AnonymousClass691((Object) this, 14));
            } else {
                setOverflowIcon(getOverflowIcon());
            }
        }
        C162457s7.A0H(menu);
        return menu;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.A0D && this.A0B) {
            AnonymousClass5VV.A00(this.A01, getMenu(), this.A05, this.A00);
        }
    }

    public final void setAbProps(AnonymousClass1VX r1) {
        this.A03 = r1;
    }

    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        A0M();
    }

    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        A0M();
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        A0M();
    }

    public final void setBidiToolbarDelegate(AnonymousClass5GB r1) {
        this.A02 = r1;
    }

    public void setContentInsetStartWithNavigation(int i) {
    }

    public void setNavigationIconTint(int i) {
    }

    public void setSubtitle(int i) {
        super.setSubtitle(i);
        A0M();
    }

    public final void setSystemFeatures(C187958y5 r1) {
        this.A04 = r1;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setSubtitle(CharSequence charSequence) {
        super.setSubtitle(charSequence);
        A0M();
    }
}
