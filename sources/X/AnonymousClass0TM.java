package X;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.Log;

/* renamed from: X.0TM  reason: invalid class name */
public class AnonymousClass0TM {
    public Paint A00;
    public Paint A01;
    public C05400Te A02;
    public C05400Te A03;
    public C10520i4 A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final /* synthetic */ AnonymousClass0YF A08;

    public AnonymousClass0TM(AnonymousClass0TM r4, AnonymousClass0YF r5) {
        this.A08 = r5;
        this.A05 = r4.A05;
        this.A06 = r4.A06;
        this.A00 = new Paint(r4.A00);
        this.A01 = new Paint(r4.A01);
        C05400Te r1 = r4.A03;
        if (r1 != null) {
            this.A03 = new C05400Te(r1);
        }
        C05400Te r12 = r4.A02;
        if (r12 != null) {
            this.A02 = new C05400Te(r12);
        }
        this.A07 = r4.A07;
        try {
            this.A04 = (C10520i4) r4.A04.clone();
        } catch (CloneNotSupportedException e) {
            Log.e("SVGAndroidRenderer", "Unexpected clone error", e);
            this.A04 = C10520i4.A00();
        }
    }

    public AnonymousClass0TM(AnonymousClass0YF r4) {
        this.A08 = r4;
        Paint paint = new Paint();
        this.A00 = paint;
        paint.setFlags(385);
        AnonymousClass001.A10(this.A00);
        Paint paint2 = this.A00;
        Typeface typeface = Typeface.DEFAULT;
        paint2.setTypeface(typeface);
        Paint paint3 = new Paint();
        this.A01 = paint3;
        paint3.setFlags(385);
        this.A01.setStyle(Paint.Style.STROKE);
        this.A01.setTypeface(typeface);
        this.A04 = C10520i4.A00();
    }
}
