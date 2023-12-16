package X;

/* renamed from: X.3Iv  reason: invalid class name and case insensitive filesystem */
public class C65783Iv implements AnonymousClass4ED {
    public void B3j(C41492Kl r7, C56622sI r8) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r3 = new C59422wt[10];
        AnonymousClass220 A02 = AnonymousClass220.A02(A00);
        boolean A0o = C54912pU.A0o(A00, A02, r3);
        A00.A02 = "description";
        AnonymousClass220 r2 = AnonymousClass220.TEXT;
        C54912pU.A0b(A00, r2, r3, A0o ? 1 : 0);
        C54912pU.A0A(A00, r2, "page_title", r3);
        C54912pU.A0B(A00, r2, "url", r3);
        C54912pU.A0C(A00, A02, "font_style", r3);
        C54912pU.A0D(A00, A02, "text_color", r3);
        C54912pU.A0E(A00, A02, "background_color", r3);
        C54912pU.A0F(A00, A02, "preview_type", r3);
        r3[8] = C54912pU.A06(A00, A02, "invite_link_group_type", A0o);
        C54912pU.A0H(A00, r2, "counter_abuse_token", r3);
        r8.A0E("message_text", r3);
    }

    public /* synthetic */ void B3l(C56862sg r2, C41492Kl r3, C56622sI r4) {
        C56622sI.A00(r4, "message_text");
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
