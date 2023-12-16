package X;

import com.whatsapp.R;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;
import com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity;

/* renamed from: X.3xG  reason: invalid class name and case insensitive filesystem */
public final class C79833xG extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AccountLinkingNativeAuthActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79833xG(AccountLinkingNativeAuthActivity accountLinkingNativeAuthActivity) {
        super(0);
        this.this$0 = accountLinkingNativeAuthActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C108735dT r0 = this.this$0.A05;
        if (r0 == null) {
            throw C18270x1.A0S("fb4aUserEntityForNativeAuth");
        }
        String str = (String) r0.A02.A00("XFAM_CROSSPOSTING_NATIVE_AUTH_UI");
        WDSProfilePhoto wDSProfilePhoto = (WDSProfilePhoto) C18290x4.A0N(this.this$0, R.id.profile_picture_image);
        C54292oU r02 = this.this$0.A02;
        if (r02 != null) {
            C18290x4.A1A(r02.A00, wDSProfilePhoto, R.drawable.ic_shimmer_profile);
            if (str != null) {
                AccountLinkingNativeAuthActivity accountLinkingNativeAuthActivity = this.this$0;
                C71403c3.A00(accountLinkingNativeAuthActivity.A04, accountLinkingNativeAuthActivity, wDSProfilePhoto, str, 21);
            }
            wDSProfilePhoto.setProfileBadge(new C140006t0(new AnonymousClass7ZR(R.dimen.f6nameremoved, R.dimen.f6nameremoved, R.dimen.f6nameremoved, R.dimen.f6nameremoved), new C139936st(R.color.f5nameremoved, R.color.f5nameremoved), R.drawable.ic_pip_facebook));
            return C59022wD.A00;
        }
        throw C18270x1.A0S("waContext");
    }
}
