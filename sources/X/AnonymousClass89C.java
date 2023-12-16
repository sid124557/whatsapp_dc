package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.89C  reason: invalid class name */
public final class AnonymousClass89C implements C180818lg {
    public final /* synthetic */ BasePendingResult A00;
    public final /* synthetic */ AnonymousClass7S7 A01;

    public AnonymousClass89C(BasePendingResult basePendingResult, AnonymousClass7S7 r2) {
        this.A01 = r2;
        this.A00 = basePendingResult;
    }

    public final void BPP(Status status) {
        this.A01.A00.remove(this.A00);
    }
}
