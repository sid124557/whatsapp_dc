package X;

import com.whatsapp.biz.catalog.view.AvailabilityStateImageView;

/* renamed from: X.8Yq  reason: invalid class name and case insensitive filesystem */
public final class C175508Yq extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C132236ev $displayItem;
    public final /* synthetic */ boolean $isAvailable;
    public final /* synthetic */ C125526Ij this$0;

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AvailabilityStateImageView availabilityStateImageView = (AvailabilityStateImageView) obj;
        C162457s7.A0J(availabilityStateImageView, 0);
        C148087Gw r6 = new C148087Gw(new C146957Cg(897459302), this.this$0.A02);
        availabilityStateImageView.setAvailable(this.$isAvailable);
        C125526Ij r1 = this.this$0;
        r1.A00.A01(availabilityStateImageView, this.$displayItem.A00, (C181758nH) null, r6, (C181768nI) null, r1.A01, 2);
        return C59022wD.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175508Yq(C132236ev r2, C125526Ij r3, boolean z) {
        super(1);
        this.this$0 = r3;
        this.$isAvailable = z;
        this.$displayItem = r2;
    }
}
