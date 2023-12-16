package X;

import android.content.Context;

/* renamed from: X.6KW  reason: invalid class name */
public class AnonymousClass6KW extends C126006Ki {
    public String A00 = "";
    public String A01;
    public final int A02;
    public final C150067Pa A03;

    public AnonymousClass6KW(Context context, C150067Pa r4, int i) {
        super(context, i);
        int i2 = AnonymousClass000.A0B(context).densityDpi;
        int i3 = 320;
        if (i2 <= 320) {
            i3 = 250;
            if (i2 <= 250) {
                i3 = 72;
            }
        }
        this.A02 = i3;
        this.A03 = r4;
    }
}
