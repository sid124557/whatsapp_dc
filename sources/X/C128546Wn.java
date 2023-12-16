package X;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* renamed from: X.6Wn  reason: invalid class name and case insensitive filesystem */
public final class C128546Wn extends C128576Wq {
    public final /* synthetic */ C152017Xf A00;

    public C128546Wn(C152017Xf r1) {
        this.A00 = r1;
    }

    public final void Btf(C127896Tt r5) {
        Status status = r5.A00;
        if (status == null) {
            this.A00.A01(new ApiException(new Status(8, "Got null status from location service")));
            return;
        }
        int i = status.A01;
        C152017Xf r1 = this.A00;
        if (i == 0) {
            r1.A00(Boolean.TRUE);
        } else {
            r1.A01(AnonymousClass72J.A00(status));
        }
    }

    public final void Btn() {
    }
}
