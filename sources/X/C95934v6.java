package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.whatsapp.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONObject;

/* renamed from: X.4v6  reason: invalid class name and case insensitive filesystem */
public class C95934v6 extends C135676l4 {
    public float A00;
    public Boolean A01;
    public String A02;
    public String A03;
    public SimpleDateFormat A04;
    public SimpleDateFormat A05;
    public SimpleDateFormat A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final Context A0A;
    public final Paint A0B;
    public final Paint A0C;
    public final Paint A0D;
    public final Paint A0E;
    public final Paint A0F;
    public final Paint A0G;
    public final Paint A0H;
    public final Paint A0I;
    public final Rect A0J;
    public final C620733j A0K;
    public final C151687Vx A0L;
    public final C103105Lo A0M;
    public final AnonymousClass5QJ A0N;
    public final boolean A0O;
    public final AnonymousClass7N3[] A0P;
    public final AnonymousClass7N3[] A0Q;

    public void A0I(float f, int i) {
        A0H(f, 2);
        this.A0N.A00(f);
    }

    public String A0B() {
        return "digital-clock";
    }

    public void A0D() {
        float f = (C105425Uw.A03 * this.A00) / 116.0f;
        RectF rectF = this.A02;
        if (rectF.height() < C105425Uw.A03 || rectF.width() < f) {
            float f2 = f / 2.0f;
            rectF.set(rectF.centerX() - f2, rectF.centerY() - (C105425Uw.A03 / 2.0f), rectF.centerX() + f2, rectF.centerY() + (C105425Uw.A03 / 2.0f));
        }
    }

    public void A0E() {
        this.A0N.A00 = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0K(android.graphics.Canvas r10) {
        /*
            r9 = this;
            X.7Vx r1 = r9.A0L
            float r5 = r1.A00()
            java.lang.Boolean r0 = r9.A01
            boolean r8 = r0.booleanValue()
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x0019
            float r1 = r1.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0019
            r8 = r8 ^ 1
        L_0x0019:
            r10.save()
            android.graphics.RectF r2 = r9.A02
            r2.sort()
            float r0 = r9.A00
            X.C86604Kt.A16(r10, r2, r0)
            float r4 = r2.width()
            float r0 = r9.A00
            float r4 = r4 / r0
            float r3 = r2.height()
            r0 = 1122500608(0x42e80000, float:116.0)
            float r3 = r3 / r0
            float r1 = r2.left
            float r0 = r2.top
            r10.scale(r4, r3, r1, r0)
            float r1 = r2.left
            float r0 = r2.top
            r10.translate(r1, r0)
            float r1 = r9.A00
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            r0 = 1114112000(0x42680000, float:58.0)
            r10.scale(r5, r5, r1, r0)
            if (r8 == 0) goto L_0x0064
            X.7N3[] r7 = r9.A0P
        L_0x0050:
            int r6 = r7.length
            r5 = 0
        L_0x0052:
            if (r5 >= r6) goto L_0x0067
            r0 = r7[r5]
            android.graphics.RectF r4 = r0.A03
            float r3 = r0.A00
            float r1 = r0.A01
            android.graphics.Paint r0 = r0.A02
            r10.drawRoundRect(r4, r3, r1, r0)
            int r5 = r5 + 1
            goto L_0x0052
        L_0x0064:
            X.7N3[] r7 = r9.A0Q
            goto L_0x0050
        L_0x0067:
            if (r8 == 0) goto L_0x00d0
            android.graphics.Paint r5 = r9.A0E
            android.graphics.Paint r4 = r9.A0C
        L_0x006d:
            java.lang.String r3 = r9.A03
            int r1 = r3.length()
            android.graphics.Rect r7 = r9.A0J
            r0 = 0
            r5.getTextBounds(r3, r0, r1, r7)
            float r3 = r9.A00
            r6 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r6
            java.lang.String r0 = r9.A03
            float r1 = r5.measureText(r0)
            java.lang.String r0 = r9.A02
            float r0 = r4.measureText(r0)
            float r1 = r1 + r0
            float r1 = r1 / r6
            float r3 = r3 - r1
            int r0 = r7.height()
            int r0 = r0 / 2
            int r0 = r0 + 58
            float r1 = (float) r0
            boolean r0 = r9.A07
            if (r0 != 0) goto L_0x00ca
            boolean r0 = r9.A09
            if (r0 == 0) goto L_0x00be
            java.lang.String r0 = r9.A03
            r10.drawText(r0, r3, r1, r5)
            java.lang.String r0 = r9.A03
            float r0 = r5.measureText(r0)
            float r3 = r3 + r0
            java.lang.String r0 = r9.A02
            r10.drawText(r0, r3, r1, r4)
        L_0x00af:
            r10.restore()
            boolean r0 = r9.A0O
            if (r0 != 0) goto L_0x00bd
            X.5QJ r1 = r9.A0N
            float r0 = r9.A00
            r1.A01(r10, r2, r0)
        L_0x00bd:
            return
        L_0x00be:
            java.lang.String r0 = r9.A02
            r10.drawText(r0, r3, r1, r4)
            java.lang.String r0 = r9.A02
            float r0 = r4.measureText(r0)
            float r3 = r3 + r0
        L_0x00ca:
            java.lang.String r0 = r9.A03
            r10.drawText(r0, r3, r1, r5)
            goto L_0x00af
        L_0x00d0:
            android.graphics.Paint r5 = r9.A0I
            android.graphics.Paint r4 = r9.A0G
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95934v6.A0K(android.graphics.Canvas):void");
    }

    public boolean A0Q() {
        return false;
    }

    public boolean A0R() {
        return false;
    }

    public boolean A0S() {
        return true;
    }

    public boolean A0U() {
        return this.A0L.A01;
    }

    public boolean A0V() {
        String str = this.A03;
        A0Z();
        boolean z = !str.equals(this.A03);
        if (z) {
            A0Y();
        }
        return z;
    }

    public boolean A0W() {
        this.A0M.A00(this.A0L);
        return true;
    }

    public float A0X() {
        return this.A00 / 116.0f;
    }

    public final void A0Y() {
        float f;
        if (this.A08) {
            float measureText = this.A0I.measureText(this.A03);
            if (!this.A07) {
                f = this.A0G.measureText(this.A02);
            } else {
                f = 0.0f;
            }
            float f2 = measureText + f + 100.0f;
            this.A00 = f2;
            AnonymousClass7N3[] r1 = this.A0P;
            r1[0] = new AnonymousClass7N3(0.0f, 0.0f, f2, 116.0f, 58.0f, 58.0f, this.A0D);
            r1[1] = new AnonymousClass7N3(2.0f, 2.0f, this.A00 - 2.0f, 114.0f, 58.0f, 58.0f, this.A0B);
            AnonymousClass7N3[] r12 = this.A0Q;
            r12[0] = new AnonymousClass7N3(0.0f, 0.0f, this.A00, 116.0f, 29.0f, 29.0f, this.A0H);
            r12[1] = new AnonymousClass7N3(12.0f, 12.0f, this.A00 - 12.0f, 104.0f, 17.0f, 17.0f, this.A0F);
        }
    }

    public final void A0Z() {
        String format;
        Date date = new Date();
        boolean z = this.A0K.A05().A00;
        this.A07 = z;
        if (z) {
            this.A03 = this.A06.format(date);
            format = "";
        } else {
            this.A03 = this.A05.format(date);
            format = this.A04.format(date);
        }
        this.A02 = format;
        A0Y();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C95934v6(android.content.Context r11, X.C620733j r12, boolean r13) {
        /*
            r10 = this;
            r10.<init>()
            r1 = 1
            android.graphics.Paint r0 = X.C86664Kz.A0a(r1)
            r10.A0D = r0
            android.graphics.Paint r0 = X.C86664Kz.A0a(r1)
            r10.A0B = r0
            android.text.TextPaint r0 = new android.text.TextPaint
            r0.<init>(r1)
            r10.A0E = r0
            android.text.TextPaint r0 = new android.text.TextPaint
            r0.<init>(r1)
            r10.A0C = r0
            android.graphics.Paint r0 = X.C86664Kz.A0a(r1)
            r10.A0H = r0
            android.graphics.Paint r0 = X.C86664Kz.A0a(r1)
            r10.A0F = r0
            android.text.TextPaint r0 = new android.text.TextPaint
            r0.<init>(r1)
            r10.A0I = r0
            android.text.TextPaint r0 = new android.text.TextPaint
            r0.<init>(r1)
            r10.A0G = r0
            r1 = 2
            X.7N3[] r0 = new X.AnonymousClass7N3[r1]
            r10.A0P = r0
            X.7N3[] r0 = new X.AnonymousClass7N3[r1]
            r10.A0Q = r0
            android.graphics.Rect r0 = X.AnonymousClass001.A0N()
            r10.A0J = r0
            r7 = 1
            X.905 r0 = new X.905
            r0.<init>(r10, r7)
            r10.A0L = r0
            r10.A0A = r11
            r10.A0K = r12
            java.util.Locale r6 = X.C620733j.A02(r12)
            r0 = 225(0xe1, float:3.15E-43)
            java.lang.String r1 = r12.A0A(r0)
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            r0.<init>(r1, r6)
            r10.A06 = r0
            r0 = 224(0xe0, float:3.14E-43)
            java.lang.String r5 = r12.A0A(r0)
            int r9 = r5.length()
            r2 = 0
            r3 = 0
        L_0x0070:
            if (r2 >= r9) goto L_0x019e
            char r1 = r5.charAt(r2)
            r0 = 39
            if (r1 != r0) goto L_0x007c
            r3 = r3 ^ 1
        L_0x007c:
            if (r3 != 0) goto L_0x019a
            r0 = 97
            if (r1 != r0) goto L_0x019a
        L_0x0082:
            r0 = -1
            java.lang.String r4 = ""
            r3 = 0
            if (r2 != r0) goto L_0x0150
            java.lang.String r0 = "12-hour formats must contain AM/PM marker."
        L_0x008a:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x008d:
            r8 = 1
        L_0x008e:
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            r0.<init>(r5, r6)
            r10.A05 = r0
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            r0.<init>(r4, r6)
            r10.A04 = r0
            boolean r0 = X.C620733j.A04(r12)
            if (r0 != 0) goto L_0x014c
            java.text.SimpleDateFormat r0 = r10.A04
            java.text.DateFormatSymbols r0 = r0.getDateFormatSymbols()
            java.lang.String[] r0 = r0.getAmPmStrings()
            r2 = r0[r3]
            X.0ru r1 = X.AnonymousClass0K7.A02
            int r0 = r2.length()
            boolean r0 = r1.BIl(r2, r3, r0)
            if (r0 == 0) goto L_0x014c
            r0 = r8 ^ 1
            r10.A09 = r0
        L_0x00be:
            r10.A0O = r13
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r10.A01 = r0
            android.graphics.Paint r1 = r10.A0H
            r0 = -1
            X.C86604Kt.A0u(r0, r1)
            r0 = 242(0xf2, float:3.39E-43)
            r1.setAlpha(r0)
            android.graphics.Paint r1 = r10.A0F
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            X.C86624Kv.A0e(r3, r1)
            r0 = 153(0x99, float:2.14E-43)
            r1.setAlpha(r0)
            r0 = 1084227584(0x40a00000, float:5.0)
            r1.setStrokeWidth(r0)
            android.graphics.Paint r1 = r10.A0I
            r1.setColor(r3)
            r2 = 179(0xb3, float:2.51E-43)
            r1.setAlpha(r2)
            r0 = 1115160576(0x42780000, float:62.0)
            r1.setTextSize(r0)
            android.graphics.Typeface r0 = X.C106905aM.A02()
            r1.setTypeface(r0)
            android.graphics.Paint r1 = r10.A0G
            r1.setColor(r3)
            r1.setAlpha(r2)
            r0 = 1109393408(0x42200000, float:40.0)
            r1.setTextSize(r0)
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT_BOLD
            r1.setTypeface(r0)
            r10.A08 = r7
            android.graphics.Paint r1 = r10.A0D
            X.C86604Kt.A0u(r3, r1)
            r0 = 90
            r1.setAlpha(r0)
            android.graphics.Paint r1 = r10.A0B
            r2 = -1
            X.C86624Kv.A0e(r2, r1)
            r0 = 1084227584(0x40a00000, float:5.0)
            r1.setStrokeWidth(r0)
            android.graphics.Paint r1 = r10.A0E
            r1.setColor(r2)
            r0 = 1115160576(0x42780000, float:62.0)
            r1.setTextSize(r0)
            android.graphics.Paint r1 = r10.A0C
            r1.setColor(r2)
            r0 = 1109393408(0x42200000, float:40.0)
            r1.setTextSize(r0)
            android.graphics.Typeface r0 = X.C106905aM.A02()
            r1.setTypeface(r0)
            r10.A0Z()
            X.5QJ r0 = new X.5QJ
            r0.<init>(r11, r12)
            r10.A0N = r0
            X.5Lo r0 = new X.5Lo
            r0.<init>()
            r10.A0M = r0
            return
        L_0x014c:
            r10.A09 = r8
            goto L_0x00be
        L_0x0150:
            r8 = r2
        L_0x0151:
            if (r8 <= 0) goto L_0x0163
            int r1 = r5.codePointBefore(r8)
            boolean r0 = java.lang.Character.isSpaceChar(r1)
            if (r0 == 0) goto L_0x0163
            int r0 = java.lang.Character.charCount(r1)
            int r8 = r8 - r0
            goto L_0x0151
        L_0x0163:
            int r2 = r2 + 1
        L_0x0165:
            if (r2 >= r9) goto L_0x017b
            int r1 = r5.codePointAt(r2)
            r0 = 97
            if (r1 == r0) goto L_0x0175
            boolean r0 = java.lang.Character.isSpaceChar(r1)
            if (r0 == 0) goto L_0x017b
        L_0x0175:
            int r0 = java.lang.Character.charCount(r1)
            int r2 = r2 + r0
            goto L_0x0165
        L_0x017b:
            if (r8 != 0) goto L_0x0189
            java.lang.String r0 = r5.substring(r2)
            java.lang.String r4 = r5.substring(r3, r2)
            r5 = r0
            r8 = 0
            goto L_0x008e
        L_0x0189:
            if (r2 != r9) goto L_0x0196
            java.lang.String r0 = r5.substring(r3, r8)
            java.lang.String r4 = r5.substring(r8)
            r5 = r0
            goto L_0x008d
        L_0x0196:
            java.lang.String r0 = "AM/PM markers in 12-hour formats should be at one end."
            goto L_0x008a
        L_0x019a:
            int r2 = r2 + 1
            goto L_0x0070
        L_0x019e:
            r2 = -1
            goto L_0x0082
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95934v6.<init>(android.content.Context, X.33j, boolean):void");
    }

    public String A0C(Context context) {
        return context.getString(R.string.f11nameremoved);
    }

    public void A0L(Canvas canvas) {
        A0K(canvas);
    }

    public void A0P(JSONObject jSONObject) {
        super.A0P(jSONObject);
        jSONObject.put("theme", this.A01);
        jSONObject.put("time", this.A03);
        jSONObject.put("period", this.A02);
    }

    public C95934v6(Context context, C620733j r3, JSONObject jSONObject) {
        this(context, r3, false);
        this.A01 = Boolean.valueOf(jSONObject.getBoolean("theme"));
        this.A03 = jSONObject.getString("time");
        this.A02 = jSONObject.getString("period");
        A0Y();
        super.A0O(jSONObject);
    }
}
