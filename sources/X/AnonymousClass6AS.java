package X;

import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity;
import com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel;
import com.whatsapp.gallery.MediaGalleryActivity;
import java.util.ArrayList;

/* renamed from: X.6AS  reason: invalid class name */
public class AnonymousClass6AS implements MenuItem.OnActionExpandListener {
    public Object A00;
    public final int A01;

    public AnonymousClass6AS(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        switch (this.A01) {
            case 0:
                ((C93544ok) this.A00).A0I = null;
                return true;
            case 1:
                MediaGalleryActivity mediaGalleryActivity = (MediaGalleryActivity) this.A00;
                mediaGalleryActivity.A0j = null;
                ((C125086Fc) mediaGalleryActivity.findViewById(R.id.toolbar).getLayoutParams()).A00 = 21;
                return true;
            default:
                InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel = ((InviteNonWhatsAppContactPickerActivity) ((C179638jT) this.A00)).A0I;
                if (inviteNonWhatsAppContactPickerViewModel == null) {
                    throw C86604Kt.A0j();
                }
                inviteNonWhatsAppContactPickerViewModel.A00 = null;
                ArrayList A03 = C107155an.A03(inviteNonWhatsAppContactPickerViewModel.A0B, (String) null);
                C06270Wx.A03(inviteNonWhatsAppContactPickerViewModel.A08, 0);
                inviteNonWhatsAppContactPickerViewModel.A06.A0H(A03);
                return true;
        }
    }

    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        if (1 - this.A01 != 0) {
            return true;
        }
        ((C125086Fc) ((C009707r) this.A00).findViewById(R.id.toolbar).getLayoutParams()).A00 = 0;
        return true;
    }
}
