package X;

import android.text.Spannable;

/* renamed from: X.5Vm  reason: invalid class name and case insensitive filesystem */
public class C105565Vm {
    public final CharSequence A00;

    public C105565Vm(CharSequence charSequence) {
        this.A00 = charSequence;
    }

    public static void A00(Spannable spannable, Spannable spannable2) {
        C105565Vm[] r3 = (C105565Vm[]) spannable.getSpans(0, spannable.length(), C105565Vm.class);
        if (r3 != null) {
            for (C105565Vm removeSpan : r3) {
                spannable.removeSpan(removeSpan);
            }
        }
        spannable.setSpan(new C105565Vm(spannable2), 0, spannable.length(), -16777216);
    }
}
