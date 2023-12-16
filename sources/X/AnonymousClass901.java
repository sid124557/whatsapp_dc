package X;

import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.group.GroupAdminPickerActivity;
import com.whatsapp.profile.ViewProfilePhoto;
import com.whatsapp.util.Log;
import java.util.Set;

/* renamed from: X.901  reason: invalid class name */
public class AnonymousClass901 extends C55702qm {
    public Object A00;
    public final int A01;

    public AnonymousClass901(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A02(C27991fJ r3) {
        if (1 - this.A01 != 0) {
            super.A02(r3);
            return;
        }
        AnonymousClass7DD r0 = ((AnonymousClass5XL) this.A00).A06;
        if (r0 != null) {
            CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r0.A00;
            if (!callsHistoryFragmentV2ViewModel.A0G) {
                Log.i("CallsHistoryViewModel/onHavingLeftGroup skip due to no active observer");
            } else if (callsHistoryFragmentV2ViewModel.A00 > 0) {
                callsHistoryFragmentV2ViewModel.A0L.A02();
            }
        }
    }

    public void A04(C27991fJ r3) {
        if (1 - this.A01 != 0) {
            super.A04(r3);
            return;
        }
        AnonymousClass7DD r0 = ((AnonymousClass5XL) this.A00).A06;
        if (r0 != null) {
            CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r0.A00;
            if (!callsHistoryFragmentV2ViewModel.A0G) {
                Log.i("CallsHistoryViewModel/onHavingLeftGroup skip due to no active observer");
            } else if (callsHistoryFragmentV2ViewModel.A00 > 0) {
                callsHistoryFragmentV2ViewModel.A0L.A02();
            }
        }
    }

    public void A05(Set set) {
        switch (this.A01) {
            case 0:
                Log.d("statusrecipients/onContactsChanged");
                ((C89104bW) this.A00).A79();
                return;
            case 2:
                ContactPickerFragment.A00((ContactPickerFragment) this.A00);
                return;
            case 3:
                ((C89884fR) this.A00).A09();
                return;
            case 4:
                ((AnonymousClass7XG) this.A00).A04.A0M(AnonymousClass002.A0J(set));
                return;
            case 5:
                ConversationsFragment.A04((ConversationsFragment) this.A00, "onGroupParticipantsChanged");
                return;
            case 6:
                GroupAdminPickerActivity groupAdminPickerActivity = (GroupAdminPickerActivity) this.A00;
                groupAdminPickerActivity.A77(groupAdminPickerActivity.A0M);
                return;
            case 7:
                ((C111445i6) this.A00).A0h.A05();
                return;
            case 8:
                ViewProfilePhoto.A0C((ViewProfilePhoto) this.A00);
                return;
            default:
                super.A05(set);
                return;
        }
    }
}
