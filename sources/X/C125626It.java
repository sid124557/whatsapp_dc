package X;

import android.text.TextUtils;
import android.view.View;
import com.whatsapp.WaTextView;

/* renamed from: X.6It  reason: invalid class name and case insensitive filesystem */
public abstract class C125626It extends C05570Ua {
    public void A07(C146937Ce r6) {
        if (this instanceof C132186eq) {
            C132186eq r2 = (C132186eq) this;
            C132156en r62 = (C132156en) r6;
            r2.A00.setText(r62.A00);
            r2.A01.A06(AnonymousClass001.A08(r62.A01 ? 1 : 0));
            return;
        }
        C132196er r4 = (C132196er) this;
        if (r6 instanceof C132126ek) {
            boolean isEmpty = TextUtils.isEmpty((CharSequence) null);
            WaTextView waTextView = r4.A01;
            if (isEmpty) {
                waTextView.setVisibility(8);
                r4.A00.setVisibility(8);
            } else {
                waTextView.setVisibility(0);
                WaTextView waTextView2 = r4.A00;
                waTextView2.setVisibility(0);
                waTextView2.setText((CharSequence) null);
            }
            boolean isEmpty2 = TextUtils.isEmpty((CharSequence) null);
            WaTextView waTextView3 = r4.A03;
            if (isEmpty2) {
                waTextView3.setVisibility(8);
                r4.A02.setVisibility(8);
                return;
            }
            waTextView3.setVisibility(0);
            WaTextView waTextView4 = r4.A02;
            waTextView4.setVisibility(0);
            waTextView4.setText((CharSequence) null);
        }
    }

    public C125626It(View view) {
        super(view);
    }
}
