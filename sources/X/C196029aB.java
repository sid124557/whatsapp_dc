package X;

import com.whatsapp.authentication.FingerprintBottomSheet;
import java.security.Signature;

/* renamed from: X.9aB  reason: invalid class name and case insensitive filesystem */
public class C196029aB implements C1229066h {
    public final /* synthetic */ C1229066h A00;
    public final /* synthetic */ AnonymousClass988 A01;

    public C196029aB(C1229066h r1, AnonymousClass988 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BMx(int i, CharSequence charSequence) {
        this.A00.BMx(i, charSequence);
    }

    public void BMy() {
        this.A00.BMy();
    }

    public void BN0(int i, CharSequence charSequence) {
        this.A00.BN0(i, charSequence);
    }

    public void BN1(byte[] bArr) {
        FingerprintBottomSheet fingerprintBottomSheet = this.A01.A02;
        fingerprintBottomSheet.A1P(false);
        fingerprintBottomSheet.A03.setEnabled(false);
        fingerprintBottomSheet.A02.setEnabled(false);
        this.A00.BN1(bArr);
    }

    public /* synthetic */ void BN2(Signature signature) {
    }
}
