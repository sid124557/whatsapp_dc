package X;

/* renamed from: X.3VF  reason: invalid class name */
public final class AnonymousClass3VF implements AnonymousClass4BS, AnonymousClass4BT, AnonymousClass4BU, AnonymousClass4G2 {
    public final C183538qC A00;
    public final C183538qC A01;

    public void B3F(C624134x r4) {
        C162457s7.A0J(r4, 0);
        ((AnonymousClass3V9) this.A00.get()).B3F(r4);
        ((AnonymousClass35R) this.A01.get()).A0E((C31901p2) r4, "SELECT message_row_id, element_type, reply_values, reply_description FROM message_ui_elements_reply WHERE message_row_id=?", "GET_REPLY_MESSAGE_SQL");
    }

    public void BGd(C624134x r2) {
        C162457s7.A0J(r2, 0);
        AnonymousClass3V9.A00(r2, this.A00);
        ((AnonymousClass35R) this.A01.get()).A0C((C31901p2) r2);
    }

    public void BrV(C624134x r2) {
        C162457s7.A0J(r2, 0);
        ((AnonymousClass3V9) this.A00.get()).BrV(r2);
        ((AnonymousClass35R) this.A01.get()).A0C((C31901p2) r2);
    }

    public AnonymousClass3VF(C183538qC r1, C183538qC r2) {
        C18260x0.A0Q(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
    }
}
