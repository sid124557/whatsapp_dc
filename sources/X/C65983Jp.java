package X;

/* renamed from: X.3Jp  reason: invalid class name and case insensitive filesystem */
public class C65983Jp implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("message_template_button_index", "CREATE INDEX IF NOT EXISTS message_template_button_index ON message_template_button (message_row_id)");
    }

    public void B3j(C41492Kl r7, C56622sI r8) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r3 = new C59422wt[12];
        AnonymousClass220 A01 = AnonymousClass220.A01(A00);
        boolean A0m = C54912pU.A0m(A00, A01, r3);
        C54912pU.A0U(A00, A01, "message_row_id", r3, A0m ? 1 : 0);
        A00.A02 = "text_data";
        AnonymousClass220 r1 = AnonymousClass220.TEXT;
        C54912pU.A0e(A00, r1, r3, A0m);
        C54912pU.A0B(A00, r1, "extra_data", r3);
        C54912pU.A0C(A00, A01, "button_type", r3);
        C54912pU.A0D(A00, A01, "used", r3);
        C54912pU.A0E(A00, A01, "selected_index", r3);
        C54912pU.A0F(A00, A01, "selected_carousel_card_index", r3);
        C54912pU.A0G(A00, A01, "otp_button_type", r3);
        C54912pU.A0H(A00, r1, "extra_consent_data", r3);
        C54912pU.A0I(A00, r1, "otp_matched_package_name", r3);
        C54912pU.A0J(A00, A01, "webview_presentation", r3);
        r8.A0E("message_template_button", r3);
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C56622sI.A05(r6, "message_template", "message_template_button", "message_row_id=old.message_row_id");
        C56622sI.A00(r6, "message_template_button");
    }
}
