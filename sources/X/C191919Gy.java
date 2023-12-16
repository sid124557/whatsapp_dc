package X;

import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9Gy  reason: invalid class name and case insensitive filesystem */
public class C191919Gy extends AnonymousClass5ZM {
    public final AnonymousClass2z0 A00;
    public final /* synthetic */ IndiaUpiCheckOrderDetailsActivity A01;

    public C191919Gy(IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity, AnonymousClass2z0 r2) {
        this.A01 = indiaUpiCheckOrderDetailsActivity;
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass39W r0;
        AnonymousClass39S r02;
        C66543Lv r03 = this.A01.A08;
        C30791n7 r04 = (C30791n7) r03.A2D.A05(this.A00);
        if (r04 == null || (r0 = r04.A00) == null || (r02 = r0.A01) == null) {
            return null;
        }
        return r02.A0H;
    }

    public void A0A() {
        IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = this.A01;
        AtomicInteger atomicInteger = indiaUpiCheckOrderDetailsActivity.A0q;
        if (atomicInteger.get() == 0) {
            indiaUpiCheckOrderDetailsActivity.Bp9(R.string.f11nameremoved);
        }
        atomicInteger.incrementAndGet();
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        List list = (List) obj;
        IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = this.A01;
        if (indiaUpiCheckOrderDetailsActivity.A0q.decrementAndGet() == 0) {
            indiaUpiCheckOrderDetailsActivity.BjL();
        }
        indiaUpiCheckOrderDetailsActivity.A0C = list;
    }
}
