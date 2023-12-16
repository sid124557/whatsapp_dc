package X;

import java.io.IOException;

/* renamed from: X.3Og  reason: invalid class name and case insensitive filesystem */
public final class C67173Og implements AnonymousClass4EN {
    public final /* synthetic */ String A00;

    public C67173Og(String str) {
        this.A00 = str;
    }

    public void AyP(AnonymousClass2SI r3) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Error (");
        A0o.append(this.A00);
        C18260x0.A1L(A0o, ") has been sent to business.");
    }

    public void BQq(IOException iOException) {
        StringBuilder A0X = C18270x1.A0X(iOException);
        A0X.append("Failed to send ");
        A0X.append(this.A00);
        C18260x0.A15(" error to business.", A0X, iOException);
    }

    public void BSB(Exception exc) {
        StringBuilder A0X = C18270x1.A0X(exc);
        A0X.append("Failed to send ");
        A0X.append(this.A00);
        C18260x0.A15(" error to business.", A0X, exc);
    }
}
