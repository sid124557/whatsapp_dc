package X;

import android.content.Context;
import android.location.Location;
import com.whatsapp.location.GroupChatLiveLocationsActivity;

/* renamed from: X.4ub  reason: invalid class name and case insensitive filesystem */
public class C95824ub extends C95874ug {
    public final /* synthetic */ GroupChatLiveLocationsActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95824ub(Context context, C150067Pa r2, GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        super(context, r2);
        this.A00 = groupChatLiveLocationsActivity;
    }

    public Location getMyLocation() {
        Location location;
        C111445i6 r0 = this.A00.A0N;
        if (r0 == null || (location = r0.A0J) == null) {
            return super.getMyLocation();
        }
        return location;
    }
}
