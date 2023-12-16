package X;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: X.0UL  reason: invalid class name */
public final class AnonymousClass0UL {
    public final int A00;
    public final int A01;
    public final PrecomputedText.Params A02;
    public final TextDirectionHeuristic A03;
    public final TextPaint A04;

    public boolean equals(Object obj) {
        Object textLocale;
        Object textLocale2;
        if (obj != this) {
            if (obj instanceof AnonymousClass0UL) {
                AnonymousClass0UL r8 = (AnonymousClass0UL) obj;
                int i = Build.VERSION.SDK_INT;
                if (i < 23 || (this.A00 == r8.A00() && this.A01 == r8.A01())) {
                    TextPaint textPaint = this.A04;
                    float textSize = textPaint.getTextSize();
                    TextPaint textPaint2 = r8.A04;
                    if (textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags()) {
                        if (i >= 24) {
                            textLocale = textPaint.getTextLocales();
                            textLocale2 = textPaint2.getTextLocales();
                        } else {
                            textLocale = textPaint.getTextLocale();
                            textLocale2 = textPaint2.getTextLocale();
                        }
                        if (textLocale.equals(textLocale2)) {
                            if (textPaint.getTypeface() == null) {
                                if (textPaint2.getTypeface() != null) {
                                    return false;
                                }
                            } else if (!textPaint.getTypeface().equals(textPaint2.getTypeface())) {
                                return false;
                            }
                            if (this.A03 != r8.A03) {
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int A00() {
        return this.A00;
    }

    public int A01() {
        return this.A01;
    }

    public int hashCode() {
        Object textLocale;
        int i = Build.VERSION.SDK_INT;
        Object[] objArr = new Object[11];
        TextPaint textPaint = this.A04;
        AnonymousClass001.A1P(objArr, textPaint.getTextSize(), 0);
        AnonymousClass001.A1P(objArr, textPaint.getTextScaleX(), 1);
        AnonymousClass001.A1P(objArr, textPaint.getTextSkewX(), 2);
        AnonymousClass001.A1P(objArr, textPaint.getLetterSpacing(), 3);
        int flags = textPaint.getFlags();
        if (i >= 24) {
            AnonymousClass000.A1P(objArr, flags, 4);
            textLocale = textPaint.getTextLocales();
        } else {
            AnonymousClass000.A1P(objArr, flags, 4);
            textLocale = textPaint.getTextLocale();
        }
        objArr[5] = textLocale;
        objArr[6] = textPaint.getTypeface();
        objArr[7] = Boolean.valueOf(textPaint.isElegantTextHeight());
        objArr[8] = this.A03;
        AnonymousClass000.A1P(objArr, this.A00, 9);
        AnonymousClass000.A1P(objArr, this.A01, 10);
        return C04880Ra.A00(objArr);
    }

    public String toString() {
        Object textLocale;
        StringBuilder sb = new StringBuilder("{");
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("textSize=");
        TextPaint textPaint = this.A04;
        A0o.append(textPaint.getTextSize());
        AnonymousClass000.A1B(A0o, sb);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append(", textScaleX=");
        A0o2.append(textPaint.getTextScaleX());
        AnonymousClass000.A1B(A0o2, sb);
        StringBuilder A0o3 = AnonymousClass001.A0o();
        A0o3.append(", textSkewX=");
        A0o3.append(textPaint.getTextSkewX());
        AnonymousClass000.A1B(A0o3, sb);
        int i = Build.VERSION.SDK_INT;
        StringBuilder A0o4 = AnonymousClass001.A0o();
        A0o4.append(", letterSpacing=");
        A0o4.append(textPaint.getLetterSpacing());
        AnonymousClass000.A1B(A0o4, sb);
        StringBuilder A0o5 = AnonymousClass001.A0o();
        A0o5.append(", elegantTextHeight=");
        A0o5.append(textPaint.isElegantTextHeight());
        AnonymousClass000.A1B(A0o5, sb);
        StringBuilder A0o6 = AnonymousClass001.A0o();
        if (i >= 24) {
            A0o6.append(", textLocale=");
            textLocale = textPaint.getTextLocales();
        } else {
            A0o6.append(", textLocale=");
            textLocale = textPaint.getTextLocale();
        }
        A0o6.append(textLocale);
        AnonymousClass000.A1B(A0o6, sb);
        StringBuilder A0o7 = AnonymousClass001.A0o();
        A0o7.append(", typeface=");
        A0o7.append(textPaint.getTypeface());
        AnonymousClass000.A1B(A0o7, sb);
        if (i >= 26) {
            StringBuilder A0o8 = AnonymousClass001.A0o();
            A0o8.append(", variationSettings=");
            A0o8.append(textPaint.getFontVariationSettings());
            AnonymousClass000.A1B(A0o8, sb);
        }
        StringBuilder A0o9 = AnonymousClass001.A0o();
        A0o9.append(", textDir=");
        A0o9.append(this.A03);
        AnonymousClass000.A1B(A0o9, sb);
        StringBuilder A0o10 = AnonymousClass001.A0o();
        A0o10.append(", breakStrategy=");
        A0o10.append(this.A00);
        AnonymousClass000.A1B(A0o10, sb);
        StringBuilder A0o11 = AnonymousClass001.A0o();
        A0o11.append(", hyphenationFrequency=");
        A0o11.append(this.A01);
        AnonymousClass000.A1B(A0o11, sb);
        return AnonymousClass000.A0g(sb);
    }

    public AnonymousClass0UL(TextDirectionHeuristic textDirectionHeuristic, TextPaint textPaint, int i, int i2) {
        PrecomputedText.Params params;
        if (Build.VERSION.SDK_INT >= 29) {
            params = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
        } else {
            params = null;
        }
        this.A02 = params;
        this.A04 = textPaint;
        this.A03 = textDirectionHeuristic;
        this.A00 = i;
        this.A01 = i2;
    }

    public AnonymousClass0UL(PrecomputedText.Params params) {
        this.A04 = params.getTextPaint();
        this.A03 = params.getTextDirection();
        this.A00 = params.getBreakStrategy();
        this.A01 = params.getHyphenationFrequency();
        this.A02 = Build.VERSION.SDK_INT < 29 ? null : params;
    }
}
