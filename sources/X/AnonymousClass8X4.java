package X;

import com.whatsapp.gallery.dialogs.GalleryPartialPermissionBottomSheetFragment;

/* renamed from: X.8X4  reason: invalid class name */
public final class AnonymousClass8X4 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C003203q $fragmentActivity;
    public final /* synthetic */ AnonymousClass5Q0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8X4(C003203q r2, AnonymousClass5Q0 r3) {
        super(0);
        this.$fragmentActivity = r2;
        this.this$0 = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        GalleryPartialPermissionBottomSheetFragment galleryPartialPermissionBottomSheetFragment = new GalleryPartialPermissionBottomSheetFragment();
        AnonymousClass5Q0 r2 = this.this$0;
        C003203q r1 = this.$fragmentActivity;
        galleryPartialPermissionBottomSheetFragment.A00 = new AnonymousClass8X2(r1, r2);
        galleryPartialPermissionBottomSheetFragment.A01 = new AnonymousClass8X3(r1, r2);
        AnonymousClass344.A00(galleryPartialPermissionBottomSheetFragment, r1.getSupportFragmentManager());
        return C59022wD.A00;
    }
}
