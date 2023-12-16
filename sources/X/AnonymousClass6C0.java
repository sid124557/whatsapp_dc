package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.search.SearchViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.6C0  reason: invalid class name */
public class AnonymousClass6C0 implements C834048g, AnonymousClass4GP {
    public Object A00;
    public final int A01;

    public AnonymousClass6C0(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final Object invoke() {
        BottomSheetBehavior bottomSheetBehavior;
        switch (this.A01) {
            case 0:
                ((C111245hm) this.A00).A01();
                break;
            case 1:
                C111215hj r3 = (C111215hj) this.A00;
                C18270x1.A0l(C18270x1.A03(r3.A04), "storage_usage_banner_dismissed", true);
                r3.A00.setVisibility(8);
                break;
            case 2:
                return Boolean.valueOf(((GroupCallParticipantPicker) this.A00).onSearchRequested());
            case 3:
                GroupCallParticipantPicker groupCallParticipantPicker = (GroupCallParticipantPicker) this.A00;
                ((AnonymousClass5PS) groupCallParticipantPicker.A03.get()).A00(6, 4);
                groupCallParticipantPicker.finish();
                return null;
            case 4:
                C95104sd r1 = ((ContactInfoActivity) this.A00).A1S;
                if (r1 == null) {
                    return null;
                }
                r1.A06 = Boolean.TRUE;
                return null;
            case 5:
                C113245l7 r2 = (C113245l7) ((C106765a8) this.A00).A00;
                ExpressionsBottomSheetView expressionsBottomSheetView = r2.A40;
                if (!(expressionsBottomSheetView == null || (bottomSheetBehavior = r2.A0t) == null)) {
                    expressionsBottomSheetView.A0C(bottomSheetBehavior.A0O);
                    r2.A1f(r2.A40);
                    break;
                }
            case 6:
                C95084sb r12 = ((GroupChatInfoActivity) this.A00).A1K;
                if (r12 == null) {
                    return null;
                }
                r12.A07 = Boolean.TRUE;
                return null;
            case 7:
                ((GroupChatInfoActivity) this.A00).A7I();
                return null;
            case 8:
                try {
                    C86654Ky.A0v((Context) ((C71533cG) this.A00).A00, "android.settings.WIFI_SETTINGS");
                    break;
                } catch (ActivityNotFoundException e) {
                    Log.w("No wifi settings", e);
                    break;
                }
            default:
                SearchViewModel searchViewModel = (SearchViewModel) this.A00;
                searchViewModel.A1H.A0G((Object) null);
                searchViewModel.A0f(false);
                break;
        }
        return C59022wD.A00;
    }
}
