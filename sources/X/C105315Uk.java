package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;

/* renamed from: X.5Uk  reason: invalid class name and case insensitive filesystem */
public class C105315Uk {
    public float A00;
    public int A01;
    public int A02 = 0;
    public ValueAnimator A03;
    public ValueAnimator A04;
    public boolean A05 = true;
    public boolean A06;
    public boolean A07 = true;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final View A0D;
    public final View A0E;
    public final View A0F;
    public final TextView A0G;
    public final AnonymousClass7XV A0H = new C1232167o(this, 3);
    public final BottomSheetBehavior A0I;
    public final C187958y5 A0J;
    public final AnonymousClass5UY A0K;
    public final AnonymousClass5UY A0L;
    public final VoipCallControlBottomSheetV2 A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;

    public final int A00() {
        int i;
        if (this.A07 || (i = this.A02) == 0) {
            return this.A0I.A0O;
        }
        return i;
    }

    public void A01() {
        long j;
        AnonymousClass5UY r0;
        if (this.A07) {
            View view = this.A0D;
            Activity A042 = C111095hX.A04(view);
            if (Build.VERSION.SDK_INT <= 24 || !A042.isInPictureInPictureMode()) {
                int A002 = C107215at.A00(A042);
                float f = 0.75f;
                if (this.A0P) {
                    f = 0.6f;
                }
                this.A00 = (float) ((int) (f * ((float) A002)));
                int dimensionPixelSize = A042.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
                AnonymousClass5UY r1 = this.A0K;
                if (r1.A03() == 0) {
                    int measuredHeight = r1.A04().getMeasuredHeight();
                    if (measuredHeight == 0) {
                        C117695sL.A01(view, this, 13);
                        return;
                    }
                    dimensionPixelSize += measuredHeight;
                }
                if (this.A0C) {
                    dimensionPixelSize = AnonymousClass4L0.A04(this.A0E, dimensionPixelSize);
                }
                if (this.A08 && (r0 = this.A0L) != null) {
                    dimensionPixelSize = AnonymousClass4L0.A04(r0.A04(), dimensionPixelSize);
                    TextView textView = this.A0G;
                    if (textView != null && textView.getVisibility() == 0) {
                        dimensionPixelSize = AnonymousClass4L0.A04(textView, dimensionPixelSize);
                    }
                }
                if (this.A09) {
                    dimensionPixelSize = C86654Ky.A02(A042.getResources(), R.dimen.f6nameremoved, dimensionPixelSize);
                }
                BottomSheetBehavior bottomSheetBehavior = this.A0I;
                if (dimensionPixelSize != bottomSheetBehavior.A0L()) {
                    if (A00() == 4 || !this.A0N) {
                        if (this.A0L != null) {
                            j = 100;
                        } else {
                            j = 500;
                        }
                        A04(j);
                    }
                    bottomSheetBehavior.A0U(dimensionPixelSize, false);
                    C103325Ml r02 = this.A0M.A0g;
                    if (r02 != null && dimensionPixelSize > 0) {
                        VoipActivityV2 voipActivityV2 = r02.A00;
                        if (voipActivityV2.A0D.A0X(4848)) {
                            voipActivityV2.A01 = dimensionPixelSize;
                            int A092 = C86664Kz.A09(voipActivityV2.getResources(), R.dimen.f6nameremoved, dimensionPixelSize);
                            C103775Oj r03 = voipActivityV2.A0q;
                            r03.A02 = A092;
                            r03.A00();
                            voipActivityV2.A7y(C86614Ku.A1W(voipActivityV2.A0s.A0p, Boolean.TRUE));
                            voipActivityV2.A7W();
                            InCallBannerViewModel inCallBannerViewModel = voipActivityV2.A0t;
                            inCallBannerViewModel.A08.A0H(new AnonymousClass7Y6(R.dimen.f6nameremoved, dimensionPixelSize));
                        }
                    }
                }
            }
        }
    }

    public void A02() {
        if (this.A07) {
            View view = this.A0D;
            view.measure(C86664Kz.A05(view.getWidth()), View.MeasureSpec.makeMeasureSpec(0, 0));
            if ((((float) view.getMeasuredHeight()) <= this.A00 && view.getHeight() != view.getMeasuredHeight()) || (((float) view.getMeasuredHeight()) > this.A00 && C86664Kz.A02(view) != this.A00)) {
                C002002f A0W = AnonymousClass001.A0W(view);
                boolean z = this.A08;
                int measuredHeight = view.getMeasuredHeight();
                if (!z) {
                    measuredHeight = Math.min(measuredHeight, (int) this.A00);
                }
                A0W.height = measuredHeight;
                A0W.A02 = 0;
                view.setLayoutParams(A0W);
            }
            this.A05 = !this.A0C;
        }
    }

    public final void A03(int i) {
        C117705sM r2 = new C117705sM((Object) this, i, 16);
        View view = this.A0D;
        ViewParent parent = view.getParent();
        if (parent == null || !parent.isLayoutRequested() || !C06360Xi.A04(view)) {
            r2.run();
        } else {
            view.post(r2);
        }
    }

    public final void A04(long j) {
        if (this.A0I.A0L() > 0) {
            AnonymousClass0A8 r1 = new AnonymousClass0A8();
            r1.A07(j);
            r1.A0B(new AnonymousClass6JD(this));
            AnonymousClass0XC.A02((ViewGroup) this.A0D, r1);
        }
    }

    public void A05(TimeInterpolator timeInterpolator, int i, int i2, int i3, int i4) {
        if (this.A07) {
            if (this.A0I.A0O != 4) {
                i = 0;
                i2 = 0;
            }
            float[] A0T = AnonymousClass4L0.A0T();
            A0T[0] = (float) i3;
            ValueAnimator A0P2 = C86664Kz.A0P(A0T, (float) i4);
            this.A04 = A0P2;
            A0P2.setInterpolator(timeInterpolator);
            this.A04.setDuration((long) i);
            this.A04.setStartDelay((long) i2);
            C86604Kt.A0w(this.A04, this, 15);
            this.A04.start();
        }
    }

    public final void A07(boolean z) {
        ValueAnimator valueAnimator = this.A03;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float A002 = C86634Kw.A00(z ? 1 : 0);
        float[] A0T = AnonymousClass4L0.A0T();
        A0T[0] = this.A0D.getAlpha();
        ValueAnimator A0P2 = C86664Kz.A0P(A0T, A002);
        this.A03 = A0P2;
        A0P2.setDuration(200);
        C86604Kt.A0w(this.A03, this, 16);
        this.A03.addListener(new AnonymousClass4L9(this, A002));
        this.A03.start();
    }

    public boolean A08() {
        if (!this.A07 || A00() != 3) {
            return false;
        }
        return true;
    }

    public C105315Uk(View view, View view2, TextView textView, AnonymousClass1VX r7, C187958y5 r8, AnonymousClass5UY r9, AnonymousClass5UY r10, VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        boolean z = true;
        this.A0P = C627436k.A0I(r7);
        this.A0D = view;
        this.A0E = view2;
        this.A0L = r9;
        this.A0G = textView;
        this.A0I = BottomSheetBehavior.A01(view);
        this.A0M = voipCallControlBottomSheetV2;
        this.A0F = C06560Yg.A02(view, R.id.bottom_sheet);
        this.A0K = r10;
        this.A0J = r8;
        boolean A0X = r7.A0X(4848);
        this.A0N = A0X;
        this.A0O = (!r7.A0X(6206) || A0X) ? false : z;
        this.A0I.A0a(this.A0H);
    }

    public final void A06(C05630Ug r5) {
        boolean A1W = AnonymousClass000.A1W(r5);
        this.A07 = A1W;
        C18260x0.A1E("CallControlBottomSheetBehaviorController setBehavior ", AnonymousClass001.A0o(), A1W);
        View view = this.A0D;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C002002f) {
            C002002f r1 = (C002002f) layoutParams;
            if (r1.A0A != r5) {
                r1.A01(r5);
                view.setLayoutParams(layoutParams);
                this.A0H.A03(view, A00());
                return;
            }
            return;
        }
        throw AnonymousClass001.A0c("The view is not a child of CoordinatorLayout");
    }
}
