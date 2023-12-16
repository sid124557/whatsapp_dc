package X;

import com.whatsapp.biz.catalog.view.AvailabilityStateImageView;

/* renamed from: X.5yz  reason: invalid class name and case insensitive filesystem */
public final class C120685yz extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ boolean $value;
    public final /* synthetic */ AvailabilityStateImageView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120685yz(AvailabilityStateImageView availabilityStateImageView, boolean z) {
        super(0);
        this.this$0 = availabilityStateImageView;
        this.$value = z;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass4Lq r2 = this.this$0.A00;
        if (r2 == null) {
            throw C18270x1.A0S("frameDrawable");
        }
        boolean z = this.$value;
        if (r2.A00 != z) {
            r2.A00 = z;
            r2.A00(C86644Kx.A01(r2));
            r2.invalidateSelf();
        }
        return C59022wD.A00;
    }
}
