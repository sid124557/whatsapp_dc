package X;

import com.whatsapp.identity.ScanQrCodeActivity;

/* renamed from: X.3vX  reason: invalid class name and case insensitive filesystem */
public final class C78763vX extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ ScanQrCodeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78763vX(ScanQrCodeActivity scanQrCodeActivity) {
        super(0);
        this.this$0 = scanQrCodeActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ScanQrCodeActivity scanQrCodeActivity = this.this$0;
        C64773Ex r1 = scanQrCodeActivity.A06;
        if (r1 != null) {
            return r1.A0A((C95814uZ) scanQrCodeActivity.A0H.getValue());
        }
        throw C18270x1.A0S("contactManager");
    }
}
