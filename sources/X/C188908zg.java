package X;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* renamed from: X.8zg  reason: invalid class name and case insensitive filesystem */
public class C188908zg extends C151417Ur {
    public Object A00;
    public final int A01;

    public C188908zg(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A00(int i) {
        if (this.A01 != 0) {
            C151957Wy r1 = (C151957Wy) this.A00;
            r1.A03 = true;
            C184948so r0 = (C184948so) r1.A02.get();
            if (r0 != null) {
                r0.Bdz();
            }
        }
    }

    public void A01(Typeface typeface, boolean z) {
        CharSequence text;
        if (this.A01 == 0) {
            Chip chip = (Chip) this.A00;
            C88654aX r1 = chip.A06;
            if (r1.A0n) {
                text = r1.A0e;
            } else {
                text = chip.getText();
            }
            chip.setText(text);
            chip.requestLayout();
            chip.invalidate();
        } else if (!z) {
            C151957Wy r12 = (C151957Wy) this.A00;
            r12.A03 = true;
            C184948so r0 = (C184948so) r12.A02.get();
            if (r0 != null) {
                r0.Bdz();
            }
        }
    }
}
