package X;

/* renamed from: X.1cL  reason: invalid class name and case insensitive filesystem */
public final class C26571cL extends AnonymousClass3VK {
    public final C183538qC A00;

    public void B3F(C624134x r5) {
        C162457s7.A0J(r5, 0);
        super.B3F(r5);
        ((C51552k0) this.A00.get()).A03((C30821nD) r5, "SELECT message_row_id, order_id, thumbnail, order_title, item_count, status, surface, message, seller_jid, token, currency_code, total_amount_1000, message_version FROM message_order WHERE message_row_id=?", "GET_ORDER_MESSAGE_SQL", false);
    }

    public void BGd(C624134x r2) {
        C162457s7.A0J(r2, 0);
        AnonymousClass3VK.A00(this, r2);
        ((C51552k0) this.A00.get()).A01((C30821nD) r2);
    }

    public void BrV(C624134x r2) {
        C162457s7.A0J(r2, 0);
        AnonymousClass3VK.A00(this, r2);
        ((C51552k0) this.A00.get()).A01((C30821nD) r2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26571cL(C183538qC r1, C183538qC r2, C183538qC r3, C183538qC r4) {
        super(r1, r2, r3);
        C18260x0.A0c(r1, r2, r3, r4);
        this.A00 = r4;
    }
}
