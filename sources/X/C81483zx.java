package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.whatsapp.status.archive.StatusArchiveSettingsBottomSheetDialog;

/* renamed from: X.3zx  reason: invalid class name and case insensitive filesystem */
public final class C81483zx extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ ViewGroup $container;
    public final /* synthetic */ LayoutInflater $inflater;
    public final /* synthetic */ StatusArchiveSettingsBottomSheetDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81483zx(LayoutInflater layoutInflater, ViewGroup viewGroup, StatusArchiveSettingsBottomSheetDialog statusArchiveSettingsBottomSheetDialog) {
        super(0);
        this.this$0 = statusArchiveSettingsBottomSheetDialog;
        this.$inflater = layoutInflater;
        this.$container = viewGroup;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        StatusArchiveSettingsBottomSheetDialog statusArchiveSettingsBottomSheetDialog = this.this$0;
        AnonymousClass2D4 r2 = statusArchiveSettingsBottomSheetDialog.A00;
        if (r2 != null) {
            statusArchiveSettingsBottomSheetDialog.A02 = new C43782Tl(this.$inflater, this.$container, C64333Db.A2t(r2.A00.A04), new AnonymousClass27G(statusArchiveSettingsBottomSheetDialog.A03.getValue(), 10), new AnonymousClass27G(this.this$0, 11));
            C43782Tl r0 = this.this$0.A02;
            if (r0 != null) {
                return r0.A01;
            }
            throw AnonymousClass001.A0e("StatusArchiveSettingsViewComponent may be accessed only from onCreateView - onDestroyView");
        }
        throw C18270x1.A0S("statusArchiveSettingsViewComponentFactory");
    }
}
