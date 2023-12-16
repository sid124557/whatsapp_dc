package X;

/* renamed from: X.3Js  reason: invalid class name and case insensitive filesystem */
public class C66013Js implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("message_template_index", "CREATE INDEX IF NOT EXISTS message_template_index ON message_template (message_row_id)");
    }

    public void B3j(C41492Kl r7, C56622sI r8) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r4 = new C59422wt[8];
        AnonymousClass220 A02 = AnonymousClass220.A02(A00);
        boolean A0o = C54912pU.A0o(A00, A02, r4);
        A00.A02 = "content_text_data";
        AnonymousClass220 r1 = AnonymousClass220.TEXT;
        C54912pU.A0c(A00, r1, r4, A0o);
        C54912pU.A0A(A00, r1, "footer_text_data", r4);
        C54912pU.A0B(A00, r1, "template_id", r4);
        C54912pU.A0C(A00, A02, "csat_trigger_expiration_ts", r4);
        C54912pU.A0D(A00, r1, "category", r4);
        C54912pU.A0E(A00, r1, "tag", r4);
        C54912pU.A0F(A00, A02, "mask_linked_devices", r4);
        r8.A0E("message_template", r4);
    }

    public /* synthetic */ void B3l(C56862sg r2, C41492Kl r3, C56622sI r4) {
        C56622sI.A00(r4, "message_template");
    }
}
