package X;

import com.google.android.play.core.integrity.IntegrityServiceException;
import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* renamed from: X.6Zp  reason: invalid class name and case insensitive filesystem */
public final class C129196Zp extends C172698Mi {
    public final /* synthetic */ C152017Xf A00;
    public final /* synthetic */ IntegrityTokenRequest A01;
    public final /* synthetic */ AnonymousClass7K1 A02;
    public final /* synthetic */ Long A03;
    public final /* synthetic */ byte[] A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C129196Zp(C152017Xf r1, C152017Xf r2, IntegrityTokenRequest integrityTokenRequest, AnonymousClass7K1 r4, Long l, byte[] bArr) {
        super(r1);
        this.A02 = r4;
        this.A04 = bArr;
        this.A03 = l;
        this.A00 = r2;
        this.A01 = integrityTokenRequest;
    }

    public final void A01(Exception exc) {
        if (exc instanceof AnonymousClass8RL) {
            super.A01(new IntegrityServiceException(exc, -9));
        } else {
            super.A01(exc);
        }
    }
}
