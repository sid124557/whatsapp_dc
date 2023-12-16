package X;

import com.whatsapp.location.GroupChatLiveLocationsActivity;
import com.whatsapp.location.LocationPicker;

/* renamed from: X.90x  reason: invalid class name and case insensitive filesystem */
public class C1893390x implements C180258kk {
    public Object A00;
    public final int A01;

    public C1893390x(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BOD(C166477yk r6) {
        switch (this.A01) {
            case 0:
                AnonymousClass5UT r0 = (AnonymousClass5UT) this.A00;
                C162457s7.A0H(r6);
                r0.A03(r6);
                r0.A08.A0R.invalidate();
                return;
            case 1:
                GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = (GroupChatLiveLocationsActivity) this.A00;
                C626936e.A06(groupChatLiveLocationsActivity.A05);
                if (((int) (groupChatLiveLocationsActivity.A00 * 5.0f)) != ((int) (groupChatLiveLocationsActivity.A05.A02().A02 * 5.0f))) {
                    groupChatLiveLocationsActivity.A00 = groupChatLiveLocationsActivity.A05.A02().A02;
                    groupChatLiveLocationsActivity.A76();
                    return;
                }
                return;
            default:
                C108145cU r4 = ((LocationPicker) this.A00).A0P;
                C108975ds r02 = r6.A03;
                r4.A0E(r02.A00, r02.A01);
                return;
        }
    }
}
