package X;

/* renamed from: X.3V0  reason: invalid class name */
public final class AnonymousClass3V0 implements AnonymousClass4BS, AnonymousClass4BT, AnonymousClass4G2 {
    public final C183538qC A00;

    public AnonymousClass3V0(C183538qC r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public void B3F(C624134x r4) {
        C162457s7.A0J(r4, 0);
        ((C48002eB) this.A00.get()).A00((C30431mR) r4, "SELECT message_row_id, service, expiration_timestamp FROM message_payment_invite WHERE message_row_id = ?", "GET_PAYMENT_INVITE");
    }

    public void BGd(C624134x r9) {
        C162457s7.A0J(r9, 0);
        C30431mR r92 = (C30431mR) r9;
        ((C48002eB) this.A00.get()).A01("message_payment_invite", "INSERT_PAYMENT_INVITE", r92.A00, r92.A1L, r92.A01);
    }
}
