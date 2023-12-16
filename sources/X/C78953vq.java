package X;

import com.whatsapp.newsletter.NewsletterInfoActivity;

/* renamed from: X.3vq  reason: invalid class name and case insensitive filesystem */
public final class C78953vq extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ NewsletterInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78953vq(NewsletterInfoActivity newsletterInfoActivity) {
        super(0);
        this.this$0 = newsletterInfoActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        NewsletterInfoActivity newsletterInfoActivity = this.this$0;
        AnonymousClass48K r5 = newsletterInfoActivity.A0a;
        if (r5 != null) {
            C95804uY A7H = newsletterInfoActivity.A7H();
            AnonymousClass1RL A7G = this.this$0.A7G();
            C162457s7.A0J(A7G, 2);
            AnonymousClass0OA r2 = new AnonymousClass0OA();
            r2.A01(new AnonymousClass446(A7G, A7H, r5), AnonymousClass0x9.A1E(AnonymousClass10Y.class));
            return r2.A00();
        }
        throw C18270x1.A0S("newsletterInfoIntegrityViewModelFactory");
    }
}
