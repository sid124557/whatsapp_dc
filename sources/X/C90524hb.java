package X;

import android.animation.ValueAnimator;
import android.view.View;
import com.whatsapp.biz.catalog.view.widgets.QuantitySelector;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4hb  reason: invalid class name and case insensitive filesystem */
public final class C90524hb extends C90574hk {
    public final C56972sr A00;
    public final C181828nP A01;
    public final C181878nU A02;
    public final AnonymousClass66R A03;
    public final AnonymousClass66R A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90524hb(View view, C56972sr r12, C146957Cg r13, C152967aS r14, C185018sv r15, C181828nP r16, C104975Tb r17, C181878nU r18, C184108rG r19, C620733j r20, UserJid userJid) {
        super(view, r13, r14, r15, r17, r20, userJid);
        C162457s7.A0J(view, 3);
        this.A00 = r12;
        this.A01 = r16;
        this.A02 = r18;
        this.A03 = C154517dI.A01(new AnonymousClass8VI(view));
        this.A04 = C154517dI.A01(new AnonymousClass8X7(view, r15, this, r19));
        C989453v.A00(view, this, 31);
    }

    public void A08(C132426fH r6) {
        C162457s7.A0J(r6, 0);
        super.A08(r6);
        C109015dw r1 = r6.A01;
        C162457s7.A0C(r1);
        ((QuantitySelector) C18300x5.A0d(this.A04)).A04(r6.A00, r1.A09);
    }

    public /* bridge */ /* synthetic */ void A07(C147037Co r1) {
        A08((C132426fH) r1);
    }

    public final void A09() {
        QuantitySelector quantitySelector = (QuantitySelector) C18300x5.A0d(this.A04);
        if (quantitySelector.A0C) {
            quantitySelector.A0E.removeCallbacksAndMessages((Object) null);
            ValueAnimator valueAnimator = quantitySelector.A02;
            if (valueAnimator != null) {
                valueAnimator.end();
                quantitySelector.A02.removeAllUpdateListeners();
                quantitySelector.A0B = false;
            }
            quantitySelector.A05 = C995857e.COLLAPSED;
            quantitySelector.A04(quantitySelector.A01, quantitySelector.A00);
        }
    }
}
