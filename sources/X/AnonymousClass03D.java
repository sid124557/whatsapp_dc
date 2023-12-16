package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Arrays;

/* renamed from: X.03D  reason: invalid class name */
public class AnonymousClass03D extends FrameLayout {
    public FrameLayout A00;
    public AnonymousClass02V A01;
    public AnonymousClass017 A02;
    public AnonymousClass017 A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final AnonymousClass017 A0A;
    public final AnonymousClass03C A0B;
    public final C142916y0 A0C;
    public final C142906xz A0D;
    public final boolean A0E;

    public static void A00(AnonymousClass017 r1, float f) {
        Arrays.fill(r1.A04, f);
        r1.A00 = true;
        r1.invalidateSelf();
    }

    public final void A02(Context context, C153427bI r4, C166217yK r5) {
        FrameLayout frameLayout;
        AnonymousClass017 r0;
        AnonymousClass017 r1 = new AnonymousClass017();
        this.A02 = r1;
        A00(r1, (float) this.A05);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.A00 = frameLayout2;
        addView(frameLayout2);
        if (r5 != null) {
            int A002 = r5.A00(C153867c9.A01(context, r4));
            AnonymousClass017 r02 = this.A02;
            if (r02 == null) {
                frameLayout = this.A00;
                r0 = null;
            } else {
                r02.A00(A002);
                frameLayout = this.A00;
                r0 = this.A02;
            }
            frameLayout.setForeground(r0);
        }
    }

    public final void A03(Context context, C153427bI r4, C142316x0 r5) {
        AnonymousClass017 r1 = new AnonymousClass017();
        this.A03 = r1;
        A00(r1, (float) this.A05);
        Color.alpha(C161937qr.A04(C142186wm.BACKGROUND_DIMMER, r5).A00(C153867c9.A01(context, r4)));
        if (this.A03 != null) {
            setForeground((Drawable) null);
        }
    }

    public final void A04(Context context, C153427bI r10, C142316x0 r11) {
        AnonymousClass017 r1;
        float f;
        Context context2 = context;
        C153427bI r4 = r10;
        C142316x0 r5 = r11;
        if (this.A0C.equals(C142916y0.DISABLED)) {
            int A002 = C161937qr.A04(C142186wm.BACKGROUND_BLOBS_DISABLED, r11).A00(C153867c9.A01(context, r10));
            r1 = new AnonymousClass017();
            r1.A00(A002);
            f = (float) this.A05;
        } else {
            int i = this.A04;
            int i2 = this.A05;
            AnonymousClass02V r2 = new AnonymousClass02V(context2, r4, r5, i, i2);
            this.A01 = r2;
            r2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            addView(this.A01, 0);
            r1 = new AnonymousClass017();
            r1.A00(i);
            f = (float) i2;
        }
        A00(r1, f);
        setBackground(r1);
    }

    public void A05(C142316x0 r6, int i) {
        if (this.A01 != null) {
            C161937qr.A06(r6, C141206vC.A01);
            C142916y0 r4 = this.A0C;
            if (r4.equals(C142916y0.ANIMATED_WHILE_LOADING)) {
                if (!(i == 1 || i == 0)) {
                    if (i != 7) {
                        return;
                    }
                }
                this.A01.setIsSwirlAnimating(true);
                return;
            } else if (!r4.equals(C142916y0.ANIMATED_WHILE_LOADED)) {
                return;
            } else {
                if (!(i == 1 || i == 0)) {
                    if (i != 7) {
                        return;
                    }
                    this.A01.setIsSwirlAnimating(true);
                    return;
                }
            }
            this.A01.setIsSwirlAnimating(false);
        }
    }

    public AnonymousClass03D(Context context, AnonymousClass03C r5, C153427bI r6, C161887qm r7, C142316x0 r8) {
        super(context);
        int A002;
        this.A0B = r5;
        C142906xz r2 = r7.A08;
        this.A0D = r2;
        this.A0C = r7.A04;
        this.A04 = C161937qr.A04(C142186wm.BACKGROUND_BLOBS_ENABLED, r8).A00(C153867c9.A01(context, r6));
        if (r2 == C142906xz.FULL_SCREEN) {
            A002 = 0;
            this.A05 = 0;
            this.A06 = 0;
            this.A08 = 0;
            this.A07 = 0;
            this.A0E = false;
            this.A0A = null;
        } else {
            this.A05 = (int) AnonymousClass0J7.A00(context, (float) C161937qr.A00(C141476vd.BOTTOM_SHEET, r8));
            this.A06 = (int) AnonymousClass0J7.A00(context, 18.0f);
            this.A08 = (int) AnonymousClass0J7.A00(context, 6.0f);
            this.A07 = (int) AnonymousClass0J7.A00(context, 10.0f);
            this.A0E = !r7.A05();
            AnonymousClass017 r1 = new AnonymousClass017();
            this.A0A = r1;
            r1.A00(C153867c9.A00(context, C142696xc.BOTTOM_SHEET_HANDLE, r6));
            A00(r1, (float) ((int) AnonymousClass0J7.A00(context, 2.0f)));
            A002 = (int) AnonymousClass0J7.A00(context, 16.0f);
        }
        this.A09 = A002;
        A01(context, r5, r6, r7, r8);
    }

    public final void A01(Context context, AnonymousClass03C r5, C153427bI r6, C161887qm r7, C142316x0 r8) {
        A04(context, r6, r8);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        marginLayoutParams.setMargins(0, this.A09, 0, 0);
        addView(r5, marginLayoutParams);
        A03(context, r6, r8);
        A02(context, r6, r7.A09);
    }

    public void dispatchDraw(Canvas canvas) {
        AnonymousClass017 r4;
        super.dispatchDraw(canvas);
        if (this.A0D != C142906xz.FULL_SCREEN && (r4 = this.A0A) != null && this.A0E) {
            int width = (int) (((float) getWidth()) / 2.0f);
            int i = this.A06;
            r4.setBounds(width - i, this.A08, width + i, this.A07);
            r4.draw(canvas);
        }
    }

    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        int size = View.MeasureSpec.getSize(i2);
        if (this.A0D == C142906xz.FLEXIBLE_SHEET) {
            i3 = Integer.MIN_VALUE;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(size, i3));
        AnonymousClass03H r0 = this.A0B.A01;
        int measuredWidth = r0.getMeasuredWidth();
        int measuredHeight = r0.getMeasuredHeight() + this.A09;
        AnonymousClass02V r02 = this.A01;
        if (r02 != null) {
            r02.A00(measuredWidth, measuredHeight);
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
    }
}
