package X;

/* renamed from: X.3HW  reason: invalid class name */
public class AnonymousClass3HW implements AnonymousClass4ED {
    public /* synthetic */ void B3l(C56862sg r2, C41492Kl r3, C56622sI r4) {
        C56622sI.A00(r4, "message_external_ad_content");
    }

    public void B3j(C41492Kl r7, C56622sI r8) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r3 = new C59422wt[15];
        AnonymousClass220 A02 = AnonymousClass220.A02(A00);
        boolean A0o = C54912pU.A0o(A00, A02, r3);
        A00.A02 = "title";
        AnonymousClass220 r5 = AnonymousClass220.TEXT;
        C54912pU.A0b(A00, r5, r3, A0o ? 1 : 0);
        C54912pU.A0A(A00, r5, "body", r3);
        C54912pU.A0B(A00, A02, "media_type", r3);
        C54912pU.A0C(A00, r5, "thumbnail_url", r3);
        A00.A02 = "full_thumbnail";
        AnonymousClass220 r2 = AnonymousClass220.BLOB;
        r3[5] = C54912pU.A02(A00, r2);
        C54912pU.A0E(A00, r2, "micro_thumbnail", r3);
        C54912pU.A0F(A00, r5, "media_url", r3);
        C54912pU.A0G(A00, r5, "source_type", r3);
        C54912pU.A0H(A00, r5, "source_id", r3);
        C54912pU.A0I(A00, r5, "source_url", r3);
        A00.A02 = "render_larger_thumbnail";
        AnonymousClass220 r22 = AnonymousClass220.BOOLEAN;
        r3[11] = C54912pU.A02(A00, r22);
        C54912pU.A0K(A00, r22, "show_ad_attribution", r3);
        C54912pU.A0L(A00, r22, "has_icebreaker_auto_response", r3);
        C54912pU.A0M(A00, r22, "has_click_to_call_auto_response", r3);
        r8.A0E("message_external_ad_content", r3);
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
