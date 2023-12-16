package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.2oZ  reason: invalid class name and case insensitive filesystem */
public class C54342oZ {
    public final /* synthetic */ C18970yY A00;

    public C54342oZ(C18970yY r1) {
        this.A00 = r1;
    }

    public void A00(C624134x r6) {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass2z0 A08 = C624134x.A08(r6, "WriterThread/before/write/message-received; message.key=", A0o);
        C18260x0.A0m(A08, A0o);
        C18260x0.A1R(AnonymousClass30X.A01(AnonymousClass36Z.A05(r6), this.A00.A00, r6.A1O), "WriterThread/write/message-received; message.key=", A08);
    }

    public void A01(AnonymousClass36K r5, int i, long j) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("loggableStanzaId=");
        A0o.append(j);
        A0o.append(", id=");
        String A0X = AnonymousClass000.A0X(AnonymousClass36K.A0L(r5, PublicKeyCredentialControllerUtility.JSON_KEY_ID), A0o);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("WriterThread/before/write/type=");
        A0o2.append(i);
        C18260x0.A0q(", ", A0X, A0o2);
        StringBuilder A01 = AnonymousClass30X.A01(r5, this.A00.A00, j);
        A01.append("WriterThread/write/type=");
        A01.append(i);
        C18260x0.A0s(", ", A0X, A01);
    }

    public void A02(AnonymousClass39T r3) {
        C18260x0.A1P(AnonymousClass001.A0o(), "WriterThread/before/write/send-stanza-received; stanzaKey=", r3);
        this.A00.A00.A06(r3);
        C18260x0.A1R(AnonymousClass001.A0o(), "WriterThread/write/send-stanza-received; stanzaKey=", r3);
    }

    public void A03(AnonymousClass39T r7, boolean z) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WriterThread/before/write/read-receipt-received; stanzaKey=");
        A0o.append(r7);
        C18260x0.A1D("; disable=", A0o, z);
        AnonymousClass30X r5 = this.A00.A00;
        AnonymousClass36K r3 = null;
        if (z) {
            AnonymousClass39V r2 = new AnonymousClass39V("readreceipts", "disable");
            AnonymousClass39V[] A1V = AnonymousClass0x9.A1V();
            A1V[0] = r2;
            r3 = AnonymousClass36K.A0J("features", A1V, (AnonymousClass36K[]) null);
        }
        StringBuilder A01 = AnonymousClass30X.A01(AnonymousClass36Z.A06(r3, r7), r5, r7.A00);
        A01.append("WriterThread/write/read-receipt-received; stanzaKey=");
        A01.append(r7);
        C18260x0.A1E("; disable=", A01, z);
    }
}
