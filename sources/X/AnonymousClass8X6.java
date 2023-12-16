package X;

import android.content.Context;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.8X6  reason: invalid class name */
public final class AnonymousClass8X6 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ WDSProfilePhoto this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8X6(Context context, WDSProfilePhoto wDSProfilePhoto) {
        super(0);
        this.$context = context;
        this.this$0 = wDSProfilePhoto;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Context context = this.$context;
        C620733j whatsAppLocale = this.this$0.getWhatsAppLocale();
        WDSProfilePhoto wDSProfilePhoto = this.this$0;
        C142556xO r5 = wDSProfilePhoto.A03;
        C142746xh r4 = wDSProfilePhoto.A02;
        boolean z = wDSProfilePhoto.A06;
        C156257gJ r6 = wDSProfilePhoto.A04;
        C18260x0.A0a(context, r5, r4, 0);
        return new C157787is(context, whatsAppLocale, new AnonymousClass84D(context, whatsAppLocale, wDSProfilePhoto, r4, r5, r6), r4, r5, z);
    }
}
