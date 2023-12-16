package X;

import com.whatsapp.biz.catalog.view.AvailabilityStateTextView;

/* renamed from: X.8Yg  reason: invalid class name and case insensitive filesystem */
public final class C175408Yg extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C132226eu $displayItem;
    public final /* synthetic */ boolean $isAvailable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175408Yg(C132226eu r2, boolean z) {
        super(1);
        this.$displayItem = r2;
        this.$isAvailable = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AvailabilityStateTextView availabilityStateTextView = (AvailabilityStateTextView) obj;
        C162457s7.A0J(availabilityStateTextView, 0);
        availabilityStateTextView.setText(this.$displayItem.A00);
        availabilityStateTextView.setAvailable(this.$isAvailable);
        return C59022wD.A00;
    }
}
