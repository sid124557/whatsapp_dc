package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/* renamed from: X.8zX  reason: invalid class name and case insensitive filesystem */
public class C188818zX extends C011209g {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C188818zX(Context context, Object obj, int i) {
        super(context);
        this.A01 = i;
        this.A00 = obj;
    }

    public float A06(DisplayMetrics displayMetrics) {
        float f;
        float f2;
        switch (this.A01) {
            case 0:
                f2 = (float) displayMetrics.densityDpi;
                f = 100.0f;
                break;
            case 1:
                f2 = (float) displayMetrics.densityDpi;
                f = 150.0f;
                break;
            case 3:
            case 4:
            case 5:
                f = 40.0f;
                f2 = TypedValue.applyDimension(1, 40.0f, displayMetrics);
                break;
            default:
                return super.A06(displayMetrics);
        }
        return f / f2;
    }

    public int A07() {
        if (3 - this.A01 != 0) {
            return super.A07();
        }
        return -1;
    }

    public int A08() {
        if (2 - this.A01 != 0) {
            return super.A08();
        }
        return -1;
    }
}
