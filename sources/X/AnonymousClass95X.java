package X;

import android.text.TextUtils;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.95X  reason: invalid class name */
public class AnonymousClass95X extends C05570Ua {
    public final View A00;
    public final WaTextView A01;
    public final WaTextView A02;
    public final WaTextView A03;
    public final WaTextView A04;
    public final WaTextView A05;
    public final WaTextView A06;
    public final WaTextView A07;
    public final WaTextView A08;
    public final WaTextView A09;

    public final void A07(int i) {
        this.A00.setVisibility(i);
        WaTextView waTextView = this.A05;
        waTextView.setVisibility(i);
        waTextView.setVisibility(i);
        this.A07.setVisibility(i);
        this.A08.setVisibility(i);
        this.A01.setVisibility(i);
        this.A02.setVisibility(i);
        this.A03.setVisibility(i);
        this.A04.setVisibility(i);
    }

    public AnonymousClass95X(View view) {
        super(view);
        this.A05 = AnonymousClass0x7.A0L(view, R.id.subtotal_key);
        this.A06 = AnonymousClass0x7.A0L(view, R.id.subtotal_amount);
        this.A07 = AnonymousClass0x7.A0L(view, R.id.taxes_key);
        this.A08 = AnonymousClass0x7.A0L(view, R.id.taxes_amount);
        this.A01 = AnonymousClass0x7.A0L(view, R.id.discount_key);
        this.A02 = AnonymousClass0x7.A0L(view, R.id.discount_amount);
        this.A03 = AnonymousClass0x7.A0L(view, R.id.shipping_key);
        this.A04 = AnonymousClass0x7.A0L(view, R.id.shipping_amount);
        this.A09 = AnonymousClass0x7.A0L(view, R.id.total_charge_amount);
        this.A00 = C06560Yg.A02(view, R.id.dashed_underline2);
    }

    public final void A08(WaTextView waTextView, WaTextView waTextView2, C620733j r8, String str, String str2, int i) {
        if (TextUtils.isEmpty(str2)) {
            C86624Kv.A12(waTextView, waTextView2);
            return;
        }
        String string = this.A0H.getContext().getString(i);
        if (!TextUtils.isEmpty(str)) {
            boolean A0T = r8.A0T();
            StringBuilder A0o = AnonymousClass001.A0o();
            if (A0T) {
                C18260x0.A0p(string, " (", str, ") ", A0o);
            } else {
                C18260x0.A0p(" (", str, ") ", string, A0o);
            }
            string = A0o.toString();
        }
        waTextView.setText(string);
        waTextView.setVisibility(0);
        waTextView2.setText(str2);
        waTextView2.setVisibility(0);
        int i2 = 5;
        int i3 = 3;
        if (r8.A0U()) {
            i3 = 5;
        }
        waTextView.setGravity(i3);
        if (r8.A0U()) {
            i2 = 3;
        }
        waTextView2.setGravity(i2);
    }
}
