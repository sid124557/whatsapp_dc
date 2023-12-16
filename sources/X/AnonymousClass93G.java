package X;

import android.os.Bundle;
import com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import com.whatsapp.components.MaxHeightLinearLayout;
import com.whatsapp.group.GroupPermissionsActivity;

/* renamed from: X.93G  reason: invalid class name */
public class AnonymousClass93G implements C15900s9 {
    public Object A00;
    public final int A01;

    public AnonymousClass93G(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BTp(String str, Bundle bundle) {
        switch (this.A01) {
            case 0:
                AudioChatBottomSheetDialog audioChatBottomSheetDialog = (AudioChatBottomSheetDialog) this.A00;
                MaxHeightLinearLayout maxHeightLinearLayout = audioChatBottomSheetDialog.A07;
                if (maxHeightLinearLayout != null) {
                    maxHeightLinearLayout.postDelayed(new C117695sL((Object) audioChatBottomSheetDialog, 20), 150);
                    return;
                }
                return;
            case 1:
                CatalogSearchFragment.A00(bundle, (CatalogSearchFragment) this.A00);
                return;
            case 2:
                GroupPermissionsActivity.A0X(bundle, (GroupPermissionsActivity) this.A00);
                return;
            case 3:
                GroupPermissionsActivity.A0C(bundle, (GroupPermissionsActivity) this.A00);
                return;
            default:
                GroupPermissionsActivity.A0L(bundle, (GroupPermissionsActivity) this.A00);
                return;
        }
    }
}
