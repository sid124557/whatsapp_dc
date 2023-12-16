package X;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* renamed from: X.89H  reason: invalid class name */
public final class AnonymousClass89H implements C180848lj {
    public final C152017Xf A00;

    public final /* bridge */ /* synthetic */ void BnG(Object obj) {
        Exception apiException;
        C127906Tu r4 = (C127906Tu) obj;
        Status status = r4.A00;
        if (status.A01 <= 0) {
            this.A00.A00(new C127116Qr(r4));
            return;
        }
        boolean A1W = AnonymousClass000.A1W(status.A02);
        C152017Xf r0 = this.A00;
        if (A1W) {
            apiException = new AnonymousClass6QW(status);
        } else {
            apiException = new ApiException(status);
        }
        r0.A00.A03(apiException);
    }

    public AnonymousClass89H(C152017Xf r1) {
        this.A00 = r1;
    }
}
