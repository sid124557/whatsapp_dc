package X;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: X.05p  reason: invalid class name and case insensitive filesystem */
public class C005405p extends C04570Ou {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass0WJ A02;
    public final /* synthetic */ WeakReference A03;

    public C005405p(AnonymousClass0WJ r1, WeakReference weakReference, int i, int i2) {
        this.A02 = r1;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = weakReference;
    }

    public void A02(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.A00) != -1) {
            typeface = Typeface.create(typeface, i, AnonymousClass000.A1S(this.A01 & 2));
        }
        AnonymousClass0WJ r3 = this.A02;
        WeakReference weakReference = this.A03;
        if (r3.A0A) {
            r3.A02 = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                boolean A04 = C06360Xi.A04(textView);
                int i2 = r3.A01;
                if (A04) {
                    textView.post(new C12910mK(typeface, textView, r3, i2));
                } else {
                    textView.setTypeface(typeface, i2);
                }
            }
        }
    }

    public void A01(int i) {
    }
}
