package X;

/* renamed from: X.1cJ  reason: invalid class name and case insensitive filesystem */
public final class C26551cJ extends AnonymousClass3VK {
    public final C183538qC A00;

    public void B3F(C624134x r4) {
        C162457s7.A0J(r4, 0);
        super.B3F(r4);
        ((C54432oi) this.A00.get()).A03((C30761my) r4, "SELECT message_row_id, business_owner_jid, title, description FROM message_product WHERE message_row_id=?", "GET_CATALOG_MESSAGE_SQL");
    }

    public void BGd(C624134x r2) {
        C162457s7.A0J(r2, 0);
        AnonymousClass3VK.A00(this, r2);
        ((C54432oi) this.A00.get()).A01((C30761my) r2);
    }

    public void BrV(C624134x r2) {
        C162457s7.A0J(r2, 0);
        AnonymousClass3VK.A00(this, r2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26551cJ(C183538qC r1, C183538qC r2, C183538qC r3, C183538qC r4) {
        super(r1, r2, r3);
        C18260x0.A0c(r1, r2, r3, r4);
        this.A00 = r4;
    }
}
