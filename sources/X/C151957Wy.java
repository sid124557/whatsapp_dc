package X;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* renamed from: X.7Wy  reason: invalid class name and case insensitive filesystem */
public class C151957Wy {
    public float A00;
    public C153517bS A01;
    public WeakReference A02 = AnonymousClass0x9.A14((Object) null);
    public boolean A03 = true;
    public final TextPaint A04 = new TextPaint(1);
    public final C151417Ur A05 = new C188908zg(this, 1);

    public float A00(String str) {
        float measureText;
        if (!this.A03) {
            return this.A00;
        }
        if (str == null) {
            measureText = 0.0f;
        } else {
            measureText = this.A04.measureText(str, 0, str.length());
        }
        this.A00 = measureText;
        this.A03 = false;
        return measureText;
    }

    public void A01(Context context, C153517bS r5) {
        if (this.A01 != r5) {
            this.A01 = r5;
            if (r5 != null) {
                TextPaint textPaint = this.A04;
                C151417Ur r1 = this.A05;
                r5.A04(context, textPaint, r1);
                C184948so r0 = (C184948so) this.A02.get();
                if (r0 != null) {
                    textPaint.drawableState = r0.getState();
                }
                r5.A03(context, textPaint, r1);
                this.A03 = true;
            }
            C184948so r12 = (C184948so) this.A02.get();
            if (r12 != null) {
                r12.Bdz();
                r12.onStateChange(r12.getState());
            }
        }
    }

    public C151957Wy(C184948so r3) {
        this.A02 = AnonymousClass0x9.A14(r3);
    }
}
