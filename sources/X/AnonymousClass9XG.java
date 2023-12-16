package X;

import android.hardware.Camera;

/* renamed from: X.9XG  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9XG implements Camera.PictureCallback {
    public final /* synthetic */ AnonymousClass9SQ A00;
    public final /* synthetic */ AnonymousClass9ZR A01;
    public final /* synthetic */ AnonymousClass9V5 A02;
    public final /* synthetic */ C194409St A03;

    public final void onPictureTaken(byte[] bArr, Camera camera) {
        AnonymousClass9ZR r1 = this.A01;
        C194409St r5 = this.A03;
        AnonymousClass9V5 r4 = this.A02;
        AnonymousClass9SQ r2 = this.A00;
        r5.A01(AnonymousClass9VN.A0b, bArr);
        C203589nz r3 = r1.A09;
        r3.getClass();
        r1.A09(r2, r3, r4, r5, (AnonymousClass9VN) null);
        C1899593h.A1U(r1.A0N.A00);
    }

    public /* synthetic */ AnonymousClass9XG(AnonymousClass9SQ r1, AnonymousClass9ZR r2, AnonymousClass9V5 r3, C194409St r4) {
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
    }
}
