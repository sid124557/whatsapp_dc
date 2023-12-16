package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;

/* renamed from: X.7bS  reason: invalid class name and case insensitive filesystem */
public class C153517bS {
    public float A00;
    public ColorStateList A01;
    public Typeface A02;
    public boolean A03 = false;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final ColorStateList A0B;
    public final ColorStateList A0C;
    public final ColorStateList A0D;
    public final String A0E;
    public final boolean A0F;

    public void A05(Context context, C151417Ur r13) {
        Context context2 = context;
        if (A06(context)) {
            A00(context);
        } else {
            A01();
        }
        int i = this.A08;
        if (i == 0) {
            this.A03 = true;
        }
        if (this.A03) {
            r13.A01(this.A02, true);
            return;
        }
        try {
            AnonymousClass6GO r6 = new AnonymousClass6GO(this, r13);
            if (context.isRestricted()) {
                r6.A00(-4);
            } else {
                C06400Xn.A03(context2, new TypedValue(), r6, i, 0, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.A03 = true;
            r13.A00(1);
        } catch (Exception e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Error loading font ");
            Log.d("TextAppearance", AnonymousClass000.A0X(this.A0E, A0o), e);
            this.A03 = true;
            r13.A00(-3);
        }
    }

    public final boolean A06(Context context) {
        int i = this.A08;
        if (i == 0) {
            return false;
        }
        return !context.isRestricted() && C06400Xn.A03(context, new TypedValue(), (C04570Ou) null, i, 0, false, true) != null;
    }

    public Typeface A00(Context context) {
        if (this.A03) {
            return this.A02;
        }
        if (!context.isRestricted()) {
            try {
                Typeface A022 = C06400Xn.A02(context, this.A08);
                this.A02 = A022;
                if (A022 != null) {
                    this.A02 = Typeface.create(A022, this.A09);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Error loading font ");
                Log.d("TextAppearance", AnonymousClass000.A0X(this.A0E, A0o), e);
            }
        }
        A01();
        this.A03 = true;
        return this.A02;
    }

    public final void A01() {
        Typeface typeface;
        if (this.A02 == null) {
            String str = this.A0E;
            if (str != null) {
                Typeface create = Typeface.create(str, this.A09);
                this.A02 = create;
                if (create != null) {
                    return;
                }
            }
            int i = this.A0A;
            if (i == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i == 2) {
                typeface = Typeface.SERIF;
            } else if (i != 3) {
                typeface = Typeface.DEFAULT;
            } else {
                typeface = Typeface.MONOSPACE;
            }
            this.A02 = typeface;
            this.A02 = Typeface.create(typeface, this.A09);
        }
    }

    public C153517bS(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C1463179t.A0d);
        this.A00 = obtainStyledAttributes.getDimension(0, 0.0f);
        this.A01 = C160917of.A00(context, obtainStyledAttributes, 3);
        this.A0C = C160917of.A00(context, obtainStyledAttributes, 4);
        this.A0D = C160917of.A00(context, obtainStyledAttributes, 5);
        this.A09 = obtainStyledAttributes.getInt(2, 0);
        this.A0A = obtainStyledAttributes.getInt(1, 1);
        int i2 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.A08 = obtainStyledAttributes.getResourceId(i2, 0);
        this.A0E = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.A0B = C160917of.A00(context, obtainStyledAttributes, 6);
        this.A05 = obtainStyledAttributes.getFloat(7, 0.0f);
        this.A06 = obtainStyledAttributes.getFloat(8, 0.0f);
        this.A07 = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, C1463179t.A0Q);
        this.A0F = obtainStyledAttributes2.hasValue(0);
        this.A04 = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public void A02(Context context, Typeface typeface, TextPaint textPaint) {
        Typeface A002 = C1446572k.A00(AnonymousClass001.A0M(context), typeface);
        if (A002 != null) {
            typeface = A002;
        }
        textPaint.setTypeface(typeface);
        int i = this.A09 & (~typeface.getStyle());
        textPaint.setFakeBoldText(AnonymousClass000.A1S(i & 1));
        float f = 0.0f;
        if ((i & 2) != 0) {
            f = -0.25f;
        }
        textPaint.setTextSkewX(f);
        textPaint.setTextSize(this.A00);
        if (this.A0F) {
            textPaint.setLetterSpacing(this.A04);
        }
    }

    public void A03(Context context, TextPaint textPaint, C151417Ur r9) {
        int i;
        int i2;
        A04(context, textPaint, r9);
        ColorStateList colorStateList = this.A01;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i = -16777216;
        }
        textPaint.setColor(i);
        float f = this.A07;
        float f2 = this.A05;
        float f3 = this.A06;
        ColorStateList colorStateList2 = this.A0B;
        if (colorStateList2 != null) {
            i2 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i2 = 0;
        }
        textPaint.setShadowLayer(f, f2, f3, i2);
    }

    public void A04(Context context, TextPaint textPaint, C151417Ur r4) {
        if (A06(context)) {
            A02(context, A00(context), textPaint);
            return;
        }
        A01();
        A02(context, this.A02, textPaint);
        A05(context, new AnonymousClass6Z9(context, textPaint, this, r4));
    }
}
