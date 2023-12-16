package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* renamed from: X.6Z9  reason: invalid class name */
public class AnonymousClass6Z9 extends C151417Ur {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ TextPaint A01;
    public final /* synthetic */ C153517bS A02;
    public final /* synthetic */ C151417Ur A03;

    public AnonymousClass6Z9(Context context, TextPaint textPaint, C153517bS r3, C151417Ur r4) {
        this.A02 = r3;
        this.A00 = context;
        this.A01 = textPaint;
        this.A03 = r4;
    }

    public void A00(int i) {
        this.A03.A00(i);
    }

    public void A01(Typeface typeface, boolean z) {
        this.A02.A02(this.A00, typeface, this.A01);
        this.A03.A01(typeface, z);
    }
}
