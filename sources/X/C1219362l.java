package X;

import com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.62l  reason: invalid class name and case insensitive filesystem */
public final class C1219362l extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ int $instanceKey;
    public final /* synthetic */ AvatarProfilePhotoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1219362l(AvatarProfilePhotoViewModel avatarProfilePhotoViewModel, int i) {
        super(1);
        this.this$0 = avatarProfilePhotoViewModel;
        this.$instanceKey = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        C162457s7.A0J(th, 0);
        Log.e("AvatarProfilePhotoViewModel/init fetching poses", th);
        AnonymousClass5Z8 A0R = C86654Ky.A0R(this.this$0.A00);
        boolean z = A0R.A06;
        this.this$0.A00.A0H(new AnonymousClass5Z8(A0R.A00, A0R.A01, A0R.A03, A0R.A02, z, false, true));
        AvatarProfilePhotoViewModel avatarProfilePhotoViewModel = this.this$0;
        avatarProfilePhotoViewModel.A0A.A02(C372621o.FAIL, this.$instanceKey);
        return C59022wD.A00;
    }
}
