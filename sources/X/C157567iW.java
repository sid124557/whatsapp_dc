package X;

import android.content.Context;
import android.graphics.Color;
import com.whatsapp.R;

/* renamed from: X.7iW  reason: invalid class name and case insensitive filesystem */
public class C157567iW {
    public static final int A05 = ((int) Math.round(5.1000000000000005d));
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final boolean A04;

    public int A00(int i, float f) {
        float f2;
        int i2;
        if (!this.A04 || AnonymousClass0YI.A06(i, 255) != this.A01) {
            return i;
        }
        float f3 = this.A00;
        if (f3 <= 0.0f || f <= 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = Math.min(((((float) Math.log1p((double) (f / f3))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        }
        int alpha = Color.alpha(i);
        int A002 = AnonymousClass5ZV.A00(f2, AnonymousClass0YI.A06(i, 255), this.A03);
        if (f2 > 0.0f && (i2 = this.A02) != 0) {
            A002 = AnonymousClass0YI.A05(AnonymousClass0YI.A06(i2, A05), A002);
        }
        return AnonymousClass0YI.A06(A002, alpha);
    }

    public C157567iW(Context context) {
        boolean A032 = C160907oe.A03(context, R.attr.f3nameremoved, false);
        int A012 = AnonymousClass5ZV.A01(context, R.attr.f3nameremoved, 0);
        int A013 = AnonymousClass5ZV.A01(context, R.attr.f3nameremoved, 0);
        int A014 = AnonymousClass5ZV.A01(context, R.attr.f3nameremoved, 0);
        float A002 = C86604Kt.A00(context);
        this.A04 = A032;
        this.A03 = A012;
        this.A02 = A013;
        this.A01 = A014;
        this.A00 = A002;
    }
}
