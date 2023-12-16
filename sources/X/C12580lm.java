package X;

import android.graphics.Typeface;

/* renamed from: X.0lm  reason: invalid class name and case insensitive filesystem */
public class C12580lm implements Runnable {
    public final /* synthetic */ Typeface A00;
    public final /* synthetic */ C05280Ss A01;
    public final /* synthetic */ AnonymousClass0NA A02;

    public C12580lm(Typeface typeface, C05280Ss r2, AnonymousClass0NA r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = typeface;
    }

    public void run() {
        C05280Ss r0 = this.A01;
        Typeface typeface = this.A00;
        C04570Ou r02 = r0.A00;
        if (r02 != null) {
            r02.A02(typeface);
        }
    }
}
