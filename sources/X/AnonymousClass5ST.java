package X;

import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.5ST  reason: invalid class name */
public class AnonymousClass5ST {
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public int A02 = 0;
    public final C620733j A03;

    public float A01(Resources resources) {
        float f = this.A00;
        if (f == 0.0f) {
            f = resources.getDimension(R.dimen.f6nameremoved) / resources.getDisplayMetrics().scaledDensity;
            this.A00 = f;
        }
        int i = this.A02;
        int i2 = -2;
        if (i != -1) {
            i2 = 0;
            if (i == 1) {
                i2 = 4;
            }
        }
        return f + ((float) i2);
    }

    public float A02(Resources resources) {
        return (A03(resources, this.A02) * 24.0f) / 27.0f;
    }

    public float A03(Resources resources, int i) {
        int i2;
        if (this.A01 == 0.0f) {
            this.A01 = resources.getDimension(R.dimen.f6nameremoved) / resources.getDisplayMetrics().scaledDensity;
        }
        if (i == -1) {
            i2 = -2;
        } else {
            i2 = 0;
            if (i == 1) {
                i2 = 4;
            }
        }
        C620733j r2 = this.A03;
        if (r2.A07().equals("ar") || r2.A07().equals("fa")) {
            i2++;
        }
        return this.A01 + ((float) i2);
    }

    public AnonymousClass5ST(C620733j r2) {
        this.A03 = r2;
    }

    public static void A00(Context context, TextView textView, AnonymousClass5ST r3) {
        textView.setTextSize(r3.A03(context.getResources(), r3.A02));
    }
}
