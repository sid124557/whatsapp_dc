package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.R;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: X.4M1  reason: invalid class name */
public class AnonymousClass4M1 extends Drawable implements C184948so {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public WeakReference A06;
    public WeakReference A07;
    public final Rect A08 = AnonymousClass001.A0N();
    public final AnonymousClass5O1 A09;
    public final C151957Wy A0A;
    public final AnonymousClass6D7 A0B = new AnonymousClass6D7();
    public final WeakReference A0C;

    public AnonymousClass4M1(Context context, C108925dn r7) {
        Context A0U;
        this.A0C = AnonymousClass0x9.A14(context);
        C161837qd.A04(context, "Theme.MaterialComponents", C161837qd.A01);
        C151957Wy r0 = new C151957Wy(this);
        this.A0A = r0;
        r0.A04.setTextAlign(Paint.Align.CENTER);
        WeakReference weakReference = this.A0C;
        Context A0U2 = C86664Kz.A0U(weakReference);
        if (A0U2 != null) {
            C153517bS r2 = new C153517bS(A0U2, R.style.f12nameremoved);
            C151957Wy r1 = this.A0A;
            if (!(r1.A01 == r2 || (A0U = C86664Kz.A0U(weakReference)) == null)) {
                r1.A01(A0U, r2);
                A07();
            }
        }
        this.A09 = new AnonymousClass5O1(context, r7);
        A06();
        C151957Wy r12 = this.A0A;
        r12.A03 = true;
        A07();
        invalidateSelf();
        TextPaint textPaint = r12.A04;
        C108925dn r13 = this.A09.A03;
        textPaint.setAlpha(r13.A00);
        invalidateSelf();
        A04();
        textPaint.setColor(r13.A0C.intValue());
        invalidateSelf();
        A05();
        A07();
        setVisible(r13.A06.booleanValue(), false);
    }

    public int A00() {
        C108925dn r2 = this.A09.A03;
        if (AnonymousClass001.A1X(r2.A05, -1)) {
            return r2.A05;
        }
        return 0;
    }

    public void A03() {
        AnonymousClass5O1 r3 = this.A09;
        C108925dn r2 = r3.A03;
        if (AnonymousClass001.A1X(r2.A05, -1)) {
            r3.A04.A05 = -1;
            r2.A05 = -1;
            this.A0A.A03 = true;
            A07();
            invalidateSelf();
        }
    }

    public final void A04() {
        ColorStateList valueOf = ColorStateList.valueOf(this.A09.A03.A0A.intValue());
        AnonymousClass6D7 r1 = this.A0B;
        if (r1.A03.A0B != valueOf) {
            r1.A06(valueOf);
            invalidateSelf();
        }
    }

    public final void A05() {
        FrameLayout frameLayout;
        WeakReference weakReference = this.A06;
        if (weakReference != null && weakReference.get() != null) {
            View A0j = C86664Kz.A0j(weakReference);
            WeakReference weakReference2 = this.A07;
            if (weakReference2 != null) {
                frameLayout = (FrameLayout) weakReference2.get();
            } else {
                frameLayout = null;
            }
            A08(A0j, frameLayout);
        }
    }

    public final void A06() {
        this.A05 = ((int) Math.pow(10.0d, ((double) this.A09.A03.A04) - 1.0d)) - 1;
        this.A0A.A03 = true;
        A07();
        invalidateSelf();
    }

    public final void A07() {
        Integer num;
        int i;
        float A002;
        Integer num2;
        float f;
        float f2;
        ViewGroup viewGroup;
        Context A0U = C86664Kz.A0U(this.A0C);
        WeakReference weakReference = this.A06;
        View view = null;
        if (weakReference != null) {
            view = C86664Kz.A0j(weakReference);
        }
        if (A0U != null && view != null) {
            Rect A0N = AnonymousClass001.A0N();
            Rect rect = this.A08;
            A0N.set(rect);
            Rect A0N2 = AnonymousClass001.A0N();
            view.getDrawingRect(A0N2);
            WeakReference weakReference2 = this.A07;
            if (!(weakReference2 == null || (viewGroup = (ViewGroup) weakReference2.get()) == null)) {
                viewGroup.offsetDescendantRectToMyCoords(view, A0N2);
            }
            AnonymousClass5O1 r5 = this.A09;
            C108925dn r9 = r5.A03;
            if (AnonymousClass001.A1X(r9.A05, -1)) {
                num = r9.A0F;
            } else {
                num = r9.A0G;
            }
            int intValue = num.intValue() + r9.A09.intValue();
            int intValue2 = r9.A0B.intValue();
            if (intValue2 == 8388691 || intValue2 == 8388693) {
                i = A0N2.bottom - intValue;
            } else {
                i = A0N2.top + intValue;
            }
            this.A01 = (float) i;
            if (A00() <= 9) {
                if (!AnonymousClass001.A1X(r9.A05, -1)) {
                    A002 = r5.A00;
                } else {
                    A002 = r5.A02;
                }
                this.A02 = A002;
                this.A03 = A002;
            } else {
                float f3 = r5.A02;
                this.A02 = f3;
                this.A03 = f3;
                A002 = (this.A0A.A00(A02()) / 2.0f) + r5.A01;
            }
            this.A04 = A002;
            Resources resources = A0U.getResources();
            boolean A1X = AnonymousClass001.A1X(r9.A05, -1);
            int i2 = R.dimen.f6nameremoved;
            if (A1X) {
                i2 = R.dimen.f6nameremoved;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i2);
            if (AnonymousClass001.A1X(r9.A05, -1)) {
                num2 = r9.A0D;
            } else {
                num2 = r9.A0E;
            }
            int intValue3 = num2.intValue() + r9.A08.intValue();
            int intValue4 = r9.A0B.intValue();
            if (intValue4 == 8388659 || intValue4 == 8388691 ? AnonymousClass0YH.A01(view) != 0 : AnonymousClass0YH.A01(view) == 0) {
                f = this.A04;
                f2 = ((((float) A0N2.right) + f) - ((float) dimensionPixelSize)) - ((float) intValue3);
            } else {
                f = this.A04;
                f2 = (((float) A0N2.left) - f) + ((float) dimensionPixelSize) + ((float) intValue3);
            }
            this.A00 = f2;
            float f4 = this.A01;
            float f5 = this.A03;
            rect.set((int) (f2 - f), (int) (f4 - f5), (int) (f2 + f), (int) (f4 + f5));
            AnonymousClass6D7 r4 = this.A0B;
            r4.setShapeAppearanceModel(C86624Kv.A0I(r4.A03.A0K, this.A02));
            if (!A0N.equals(rect)) {
                r4.setBounds(rect);
            }
        }
    }

    public void A09(boolean z) {
        AnonymousClass5O1 r2 = this.A09;
        C108925dn r0 = r2.A04;
        Boolean valueOf = Boolean.valueOf(z);
        r0.A06 = valueOf;
        r2.A03.A06 = valueOf;
        setVisible(valueOf.booleanValue(), false);
    }

    public int getAlpha() {
        return this.A09.A03.A00;
    }

    public int getIntrinsicHeight() {
        return this.A08.height();
    }

    public int getIntrinsicWidth() {
        return this.A08.width();
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isStateful() {
        return false;
    }

    public void setAlpha(int i) {
        AnonymousClass5O1 r1 = this.A09;
        r1.A04.A00 = i;
        r1.A03.A00 = i;
        this.A0A.A04.setAlpha(i);
        invalidateSelf();
    }

    public CharSequence A01() {
        Context A0U;
        if (isVisible()) {
            C108925dn r5 = this.A09.A03;
            if (!AnonymousClass001.A1X(r5.A05, -1)) {
                return r5.A07;
            }
            if (!(r5.A03 == 0 || (A0U = C86664Kz.A0U(this.A0C)) == null)) {
                int A002 = A00();
                int i = this.A05;
                if (A002 <= i) {
                    return AnonymousClass0x2.A0Y(A0U.getResources(), A00(), 0, r5.A03);
                }
                int i2 = r5.A02;
                Object[] objArr = new Object[1];
                AnonymousClass000.A1P(objArr, i, 0);
                return A0U.getString(i2, objArr);
            }
        }
        return null;
    }

    public final String A02() {
        if (A00() <= this.A05) {
            return NumberFormat.getInstance(this.A09.A03.A0H).format((long) A00());
        }
        Context A0U = C86664Kz.A0U(this.A0C);
        if (A0U == null) {
            return "";
        }
        Locale locale = this.A09.A03.A0H;
        String string = A0U.getString(R.string.f11nameremoved);
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass000.A1L(A0M, this.A05);
        A0M[1] = "+";
        return String.format(locale, string, A0M);
    }

    public void A08(View view, FrameLayout frameLayout) {
        this.A06 = AnonymousClass0x9.A14(view);
        this.A07 = AnonymousClass0x9.A14(frameLayout);
        ViewGroup A0l = C86664Kz.A0l(view);
        A0l.setClipChildren(false);
        A0l.setClipToPadding(false);
        A07();
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty()) {
            C108925dn r1 = this.A09.A03;
            if (r1.A00 != 0 && isVisible()) {
                this.A0B.draw(canvas);
                if (AnonymousClass001.A1X(r1.A05, -1)) {
                    Rect A0N = AnonymousClass001.A0N();
                    String A022 = A02();
                    TextPaint textPaint = this.A0A.A04;
                    textPaint.getTextBounds(A022, 0, A022.length(), A0N);
                    canvas.drawText(A022, this.A00, this.A01 + ((float) (A0N.height() / 2)), textPaint);
                }
            }
        }
    }

    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void Bdz() {
        invalidateSelf();
    }
}
