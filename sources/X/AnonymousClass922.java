package X;

import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.922  reason: invalid class name */
public class AnonymousClass922 implements C181298mX {
    public final int A00;

    public AnonymousClass922(int i) {
        this.A00 = i;
    }

    public final Object apply(Object obj) {
        switch (this.A00) {
            case 0:
                return obj;
            case 1:
                return C107245ax.A03((RectF) obj);
            default:
                Path A06 = AnonymousClass002.A06();
                A06.addOval((RectF) obj, Path.Direction.CW);
                A06.close();
                return A06;
        }
    }
}
