package X;

import android.view.KeyEvent;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.payments.ui.widget.PaymentView;

/* renamed from: X.9a3  reason: invalid class name and case insensitive filesystem */
public class C195949a3 implements AnonymousClass4CE {
    public final /* synthetic */ PaymentView A00;

    public C195949a3(PaymentView paymentView) {
        this.A00 = paymentView;
    }

    public void BNH() {
        MentionableEntry mentionableEntry = this.A00.A0z.A0B;
        C626936e.A04(mentionableEntry);
        mentionableEntry.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    public void BRo(int[] iArr) {
        C107345b9.A09(this.A00.A0z.A0B, iArr, 0);
    }
}
