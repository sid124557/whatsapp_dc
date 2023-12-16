package X;

import com.whatsapp.WaTextView;

/* renamed from: X.5BO  reason: invalid class name */
public final class AnonymousClass5BO {
    public static final void A00(WaTextView waTextView, C56612sH r13, long j) {
        long A0H = r13.A0H();
        long j2 = j;
        if (j - A0H > 0) {
            waTextView.setText(C107565bW.A04(waTextView.getContext(), waTextView.getWhatsAppLocale(), j2, A0H));
            waTextView.setVisibility(0);
            return;
        }
        waTextView.setVisibility(4);
    }
}
