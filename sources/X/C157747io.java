package X;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;

/* renamed from: X.7io  reason: invalid class name and case insensitive filesystem */
public final class C157747io {
    public static Object A0C;
    public static Constructor A0D;
    public static boolean A0E;
    public static final int A0F = (C18280x3.A1U(Build.VERSION.SDK_INT, 23) ? 1 : 0);
    public float A00 = 0.0f;
    public float A01 = 1.0f;
    public int A02;
    public int A03 = A0F;
    public int A04 = Integer.MAX_VALUE;
    public Layout.Alignment A05 = Layout.Alignment.ALIGN_NORMAL;
    public TextUtils.TruncateAt A06 = null;
    public CharSequence A07;
    public boolean A08 = true;
    public boolean A09;
    public final int A0A;
    public final TextPaint A0B;

    public StaticLayout A00() {
        TextDirectionHeuristic textDirectionHeuristic;
        CharSequence charSequence = this.A07;
        if (charSequence == null) {
            charSequence = "";
            this.A07 = charSequence;
        }
        int max = Math.max(0, this.A0A);
        if (this.A04 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.A0B, (float) max, this.A06);
        }
        int min = Math.min(charSequence.length(), this.A02);
        this.A02 = min;
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.A09 && this.A04 == 1) {
                this.A05 = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, this.A0B, max);
            obtain.setAlignment(this.A05);
            obtain.setIncludePad(this.A08);
            if (this.A09) {
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            }
            obtain.setTextDirection(textDirectionHeuristic);
            TextUtils.TruncateAt truncateAt = this.A06;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.A04);
            float f = this.A00;
            if (!(f == 0.0f && this.A01 == 1.0f)) {
                obtain.setLineSpacing(f, this.A01);
            }
            if (this.A04 > 1) {
                obtain.setHyphenationFrequency(this.A03);
            }
            return obtain.build();
        }
        if (!A0E) {
            Class<TextDirectionHeuristic> cls = TextDirectionHeuristic.class;
            try {
                A0C = TextDirectionHeuristics.LTR;
                Class cls2 = Integer.TYPE;
                Class cls3 = Float.TYPE;
                Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(new Class[]{CharSequence.class, cls2, cls2, TextPaint.class, cls2, Layout.Alignment.class, cls, cls3, cls3, Boolean.TYPE, TextUtils.TruncateAt.class, cls2, cls2});
                A0D = declaredConstructor;
                declaredConstructor.setAccessible(true);
                A0E = true;
            } catch (Exception e) {
                throw new C143276yc(e);
            }
        }
        try {
            Constructor constructor = A0D;
            constructor.getClass();
            Object[] objArr = new Object[13];
            objArr[0] = charSequence;
            AnonymousClass000.A1P(objArr, 0, 1);
            AnonymousClass000.A1N(objArr, this.A02);
            objArr[3] = this.A0B;
            Integer valueOf = Integer.valueOf(max);
            objArr[4] = valueOf;
            objArr[5] = this.A05;
            Object obj = A0C;
            obj.getClass();
            objArr[6] = obj;
            objArr[7] = Float.valueOf(1.0f);
            objArr[8] = Float.valueOf(0.0f);
            objArr[9] = Boolean.valueOf(this.A08);
            objArr[10] = null;
            objArr[11] = valueOf;
            objArr[12] = Integer.valueOf(this.A04);
            return (StaticLayout) constructor.newInstance(objArr);
        } catch (Exception e2) {
            throw new C143276yc(e2);
        }
    }

    public C157747io(TextPaint textPaint, CharSequence charSequence, int i) {
        this.A07 = charSequence;
        this.A0B = textPaint;
        this.A0A = i;
        this.A02 = charSequence.length();
    }
}
