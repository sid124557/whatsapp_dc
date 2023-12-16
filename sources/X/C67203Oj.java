package X;

import java.io.IOException;

/* renamed from: X.3Oj  reason: invalid class name and case insensitive filesystem */
public class C67203Oj implements AnonymousClass4EN {
    public final /* synthetic */ C50482iF A00;
    public final /* synthetic */ C84634Dc A01;
    public final /* synthetic */ String A02;

    public void AyP(AnonymousClass2SI r8) {
        AnonymousClass2SI r3 = r8;
        this.A00.A03.A0S(new C71603cN(this, r3, this.A01, this.A02, 4));
    }

    public void BSB(Exception exc) {
        Exception exc2 = exc;
        this.A00.A03.A0S(new C71603cN(this, exc2, this.A01, this.A02, 3));
    }

    public C67203Oj(C50482iF r1, C84634Dc r2, String str) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = r2;
    }

    public void BQq(IOException iOException) {
        BSB(iOException);
    }
}
