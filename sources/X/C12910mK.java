package X;

import android.graphics.Typeface;
import android.widget.TextView;

/* renamed from: X.0mK  reason: invalid class name and case insensitive filesystem */
public class C12910mK implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Typeface A01;
    public final /* synthetic */ TextView A02;
    public final /* synthetic */ AnonymousClass0WJ A03;

    public C12910mK(Typeface typeface, TextView textView, AnonymousClass0WJ r3, int i) {
        this.A03 = r3;
        this.A02 = textView;
        this.A01 = typeface;
        this.A00 = i;
    }

    public void run() {
        this.A02.setTypeface(this.A01, this.A00);
    }
}
