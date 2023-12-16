package X;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: X.4vF  reason: invalid class name and case insensitive filesystem */
public class C95964vF extends C105425Uw {
    public static Typeface A0F;
    public static Typeface A0G;
    public static Typeface A0H;
    public static Typeface A0I;
    public static Typeface A0J;
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public StaticLayout A08;
    public AnonymousClass5X6 A09;
    public String A0A;
    public final Context A0B;
    public final TextPaint A0C;
    public final C620733j A0D;
    public final AnonymousClass5Y0 A0E;

    public C95964vF(Context context, AnonymousClass5Y0 r12, JSONObject jSONObject) {
        this(context, r12);
        this.A02 = ((float) jSONObject.getInt("orig-w")) / 100.0f;
        this.A01 = ((float) jSONObject.getInt("orig-h")) / 100.0f;
        this.A03 = ((float) jSONObject.getInt("orig-l")) / 100.0f;
        this.A04 = ((float) jSONObject.getInt("orig-r")) / 100.0f;
        this.A00 = 0.0f;
        A0a(jSONObject.getString("text"), ((float) jSONObject.getInt("text-size")) / 100.0f, jSONObject.getInt("style"), jSONObject.getInt("alignment"), jSONObject.getInt("background_style"));
        String str = this.A0A;
        this.A0C.setTextSize(this.A05);
        this.A08 = A0Y(context, r12, str, ((int) this.A02) + 1);
        this.A00 = 0.0f;
        int i = 0;
        while (true) {
            int lineCount = this.A08.getLineCount();
            StaticLayout staticLayout = this.A08;
            if (i < lineCount) {
                float lineWidth = staticLayout.getLineWidth(i);
                if (lineWidth > this.A00) {
                    this.A00 = lineWidth;
                }
                i++;
            } else {
                staticLayout.getHeight();
                super.A0O(jSONObject);
                return;
            }
        }
    }

    public void A0N(AnonymousClass7N4 r7) {
        super.A0N(r7);
        C135666l3 r72 = (C135666l3) r7;
        A0a(r72.A04, this.A05, r72.A03, r72.A01, r72.A02);
    }

    public void A0M(RectF rectF, float f, float f2, float f3, float f4) {
        this.A03 = f;
        this.A04 = f3;
        this.A02 = AnonymousClass002.A00(f3, f);
        this.A01 = AnonymousClass002.A00(f4, f2);
        RectF rectF2 = this.A02;
        rectF2.set(f, f2, f3, f4);
        rectF2.sort();
        A0Z();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        return android.text.Layout.Alignment.ALIGN_NORMAL;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r2 != false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r2 != false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.text.Layout.Alignment A0X() {
        /*
            r3 = this;
            X.33j r0 = r3.A0D
            java.util.Locale r0 = X.C620733j.A02(r0)
            android.text.BidiFormatter r1 = android.text.BidiFormatter.getInstance(r0)
            java.lang.String r0 = r3.A0A
            boolean r2 = r1.isRtl(r0)
            int r1 = r3.A06
            r0 = 1
            if (r1 == r0) goto L_0x001b
            r0 = 2
            if (r1 == r0) goto L_0x0020
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_CENTER
            return r0
        L_0x001b:
            if (r2 == 0) goto L_0x0022
        L_0x001d:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r0
        L_0x0020:
            if (r2 == 0) goto L_0x001d
        L_0x0022:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95964vF.A0X():android.text.Layout$Alignment");
    }

    public final StaticLayout A0Y(Context context, AnonymousClass5Y0 r11, String str, int i) {
        TextPaint textPaint = this.A0C;
        CharSequence A032 = C107575bX.A03(C107345b9.A03(context, textPaint, r11, str));
        if (A032 == null) {
            A032 = "";
        }
        int i2 = i;
        if (Build.VERSION.SDK_INT >= 23) {
            return StaticLayout.Builder.obtain(A032, 0, A032.length(), textPaint, i).setAlignment(A0X()).setLineSpacing(0.0f, 1.3f).setIncludePad(true).build();
        }
        return new StaticLayout(A032, textPaint, i2, A0X(), 1.3f, 0.0f, true);
    }

    public final void A0Z() {
        StaticLayout staticLayout;
        if (!TextUtils.isEmpty(this.A0A)) {
            String str = this.A0A;
            TextPaint textPaint = this.A0C;
            textPaint.setTextSize(this.A05);
            textPaint.setColor(this.A09.A04);
            Context context = this.A0B;
            AnonymousClass5Y0 r1 = this.A0E;
            RectF rectF = this.A02;
            this.A08 = A0Y(context, r1, str, ((int) rectF.width()) + 1);
            this.A00 = 0.0f;
            int i = 0;
            while (true) {
                int lineCount = this.A08.getLineCount();
                staticLayout = this.A08;
                if (i >= lineCount) {
                    break;
                }
                float lineWidth = staticLayout.getLineWidth(i);
                if (lineWidth > this.A00) {
                    this.A00 = lineWidth;
                }
                i++;
            }
            float height = (float) staticLayout.getHeight();
            float f = rectF.left;
            float f2 = rectF.top;
            float f3 = rectF.right;
            float f4 = rectF.bottom;
            int i2 = this.A06;
            if (i2 == 0) {
                float f5 = f + f3;
                float f6 = this.A00;
                float f7 = f2 + f4;
                rectF.set((f5 - f6) / 2.0f, (f7 - height) / 2.0f, (f5 + f6) / 2.0f, (f7 + height) / 2.0f);
            } else {
                float f8 = f2 + f4;
                float f9 = (f8 - height) / 2.0f;
                float f10 = (f8 + height) / 2.0f;
                if ((i2 != 1 || !C620733j.A04(this.A0D)) && (this.A06 != 2 || C620733j.A04(this.A0D))) {
                    f = f3 - this.A00;
                } else {
                    f3 = this.A00 + f;
                }
                rectF.set(f, f9, f3, f10);
            }
            rectF.sort();
        }
    }

    public void A0a(String str, float f, int i, int i2, int i3) {
        if (!str.equals(this.A0A) || this.A07 != i || this.A06 != i2 || this.A09.A02 != i3) {
            this.A0A = str;
            this.A05 = f;
            this.A07 = i;
            TextPaint textPaint = this.A0C;
            textPaint.setTypeface(AnonymousClass5BF.A00(this.A0B, i));
            this.A06 = i2;
            AnonymousClass5X6 r1 = this.A09;
            r1.A02 = i3;
            r1.A01(r1.A03, i3);
            textPaint.setFakeBoldText(AnonymousClass001.A1T(i));
            if (this.A00 != 0.0f) {
                RectF rectF = this.A02;
                rectF.set(this.A03, rectF.centerY() - (this.A01 / 2.0f), this.A04, rectF.centerY() + (this.A01 / 2.0f));
                A0Z();
            }
        }
    }

    public void A0P(JSONObject jSONObject) {
        super.A0P(jSONObject);
        jSONObject.put("orig-w", (int) (this.A02 * 100.0f));
        jSONObject.put("orig-h", (int) (this.A01 * 100.0f));
        jSONObject.put("text", this.A0A);
        jSONObject.put("text-size", (int) (this.A05 * 100.0f));
        jSONObject.put("style", this.A07);
        jSONObject.put("alignment", this.A06);
        jSONObject.put("background_style", this.A09.A02);
        jSONObject.put("orig-l", (int) (this.A03 * 100.0f));
        jSONObject.put("orig-r", (int) (this.A04 * 100.0f));
    }

    public C95964vF(Context context, AnonymousClass5Y0 r4) {
        this.A0C = new TextPaint(1);
        this.A07 = 0;
        this.A06 = 0;
        this.A09 = new AnonymousClass5X6();
        this.A0B = context;
        this.A0E = r4;
        this.A0D = C64333Db.A2t(C389229y.A01(context));
        AnonymousClass001.A10(this.A01);
    }
}
