package X;

import java.security.Signature;

/* renamed from: X.9aA  reason: invalid class name and case insensitive filesystem */
public class C196019aA implements C1229066h {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass9VE A01;
    public final /* synthetic */ C196039aC A02;
    public final /* synthetic */ C193849Qh A03;
    public final /* synthetic */ String A04;

    public C196019aA(AnonymousClass9VE r1, C196039aC r2, C193849Qh r3, String str, long j) {
        this.A01 = r1;
        this.A02 = r2;
        this.A04 = str;
        this.A03 = r3;
        this.A00 = j;
    }

    public void BMx(int i, CharSequence charSequence) {
        C160757oG r2 = this.A01.A0I;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("authenticateBiometric/onAuthenticationError/error: ");
        r2.A05(AnonymousClass000.A0X(charSequence.toString(), A0o));
        this.A02.BMx(i, charSequence);
    }

    public void BMy() {
        this.A01.A0I.A05("authenticateBiometric/onAuthenticationFailed");
        this.A02.BMy();
    }

    public void BN0(int i, CharSequence charSequence) {
        C160757oG r2 = this.A01.A0I;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("authenticateBiometric/onAuthenticationHelp/help: ");
        r2.A05(AnonymousClass000.A0X(charSequence.toString(), A0o));
        this.A02.BN0(i, charSequence);
    }

    public void BN1(byte[] bArr) {
        if (bArr != null) {
            AnonymousClass9VE r7 = this.A01;
            r7.A0I.A06("authenticateBiometric/onAuthenticationSucceeded/success");
            C196039aC r6 = this.A02;
            r6.BN1(bArr);
            AnonymousClass9VE.A00(r7, r6, this.A03.A01(AnonymousClass9V6.A00(Boolean.FALSE, bArr, "AUTH", this.A00)), this.A04);
            return;
        }
        this.A01.A0I.A05("authenticateBiometric/onAuthenticationSucceeded/null signature");
        this.A02.BMy();
    }

    public /* synthetic */ void BN2(Signature signature) {
    }
}
