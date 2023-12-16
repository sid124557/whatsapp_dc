package X;

import com.whatsapp.newsletter.ui.profilephoto.ViewNewsletterProfilePhoto;

/* renamed from: X.5xs  reason: invalid class name and case insensitive filesystem */
public final class C119995xs extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ ViewNewsletterProfilePhoto this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119995xs(ViewNewsletterProfilePhoto viewNewsletterProfilePhoto) {
        super(0);
        this.this$0 = viewNewsletterProfilePhoto;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        this.this$0.setResult(-1);
        ViewNewsletterProfilePhoto viewNewsletterProfilePhoto = this.this$0;
        viewNewsletterProfilePhoto.A7A(viewNewsletterProfilePhoto.getIntent().getBooleanExtra("open_pic_selection_sheet", false));
        if (this.this$0.getIntent().getBooleanExtra("open_pic_selection_sheet", false)) {
            AnonymousClass0X0.A00(this.this$0);
        }
        return C59022wD.A00;
    }
}
