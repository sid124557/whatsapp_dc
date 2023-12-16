package X;

/* renamed from: X.3W6  reason: invalid class name */
public final class AnonymousClass3W6 implements AnonymousClass4BV {
    public final C183538qC A00;
    public final C183538qC A01;
    public final C183538qC A02;

    public void BhY(C624134x r5, C378824k r6, int i) {
        C162457s7.A0J(r5, 0);
        byte[] bArr = r5.A1a;
        if (r5.A1n() && bArr != null) {
            ((C47992eA) this.A01.get()).A00(r5.A1L, bArr);
            if (r6 != null) {
                throw C18260x0.A02(AnonymousClass3W6.class);
            }
        } else if (C57632tx.A00(r5)) {
            C59882xe.A00((AnonymousClass4FV) this.A02.get(), "msgstore/updateMessageOnCurrentThread", AnonymousClass29K.A00((AnonymousClass36E) this.A00.get(), r5));
        }
    }

    public AnonymousClass3W6(C183538qC r1, C183538qC r2, C183538qC r3) {
        C18260x0.A0V(r1, r2, r3);
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }
}
