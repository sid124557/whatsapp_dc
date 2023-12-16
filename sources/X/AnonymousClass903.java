package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.maps.GoogleMapOptions;
import com.whatsapp.R;
import com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;
import com.whatsapp.location.LocationPicker2;

/* renamed from: X.903  reason: invalid class name */
public class AnonymousClass903 extends AnonymousClass4uh {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass903(Context context, GoogleMapOptions googleMapOptions, Object obj, int i) {
        super(context, googleMapOptions);
        this.A01 = i;
        this.A00 = obj;
    }

    public void A0B(int i) {
        ImageView imageView;
        int i2;
        DirectorySetLocationMapActivity directorySetLocationMapActivity;
        ImageView imageView2;
        int i3;
        LocationPicker2 locationPicker2;
        ImageView imageView3;
        int i4;
        switch (this.A01) {
            case 0:
                if (i != 0) {
                    directorySetLocationMapActivity = (DirectorySetLocationMapActivity) this.A00;
                    imageView2 = directorySetLocationMapActivity.A0B.A04;
                    if (i != 1) {
                        i3 = R.drawable.btn_myl;
                    } else {
                        imageView2.setImageResource(R.drawable.btn_myl_active);
                        directorySetLocationMapActivity.A0B.A0F = true;
                        return;
                    }
                } else {
                    directorySetLocationMapActivity = (DirectorySetLocationMapActivity) this.A00;
                    imageView2 = directorySetLocationMapActivity.A0B.A04;
                    i3 = R.drawable.btn_compass_mode_tilt;
                }
                imageView2.setImageResource(i3);
                directorySetLocationMapActivity.A0B.A0F = false;
                return;
            case 1:
                int i5 = 8;
                GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = (GroupChatLiveLocationsActivity2) this.A00;
                if (i == 0) {
                    C111445i6 r0 = groupChatLiveLocationsActivity2.A0O;
                    r0.A0u = true;
                    r0.A0s = true;
                    View view = r0.A0U;
                    if (r0.A0m == null) {
                        i5 = 0;
                    }
                    view.setVisibility(i5);
                    imageView = groupChatLiveLocationsActivity2.A04;
                    i2 = R.drawable.btn_compass_mode_tilt;
                } else if (i != 1) {
                    groupChatLiveLocationsActivity2.A04.setImageResource(R.drawable.btn_myl);
                    groupChatLiveLocationsActivity2.A0O.A0s = false;
                    return;
                } else {
                    C111445i6 r02 = groupChatLiveLocationsActivity2.A0O;
                    r02.A0u = true;
                    r02.A0s = true;
                    View view2 = r02.A0U;
                    if (r02.A0m == null) {
                        i5 = 0;
                    }
                    view2.setVisibility(i5);
                    imageView = groupChatLiveLocationsActivity2.A04;
                    i2 = R.drawable.btn_myl_active;
                }
                imageView.setImageResource(i2);
                return;
            default:
                if (i != 0) {
                    locationPicker2 = (LocationPicker2) this.A00;
                    imageView3 = locationPicker2.A0X.A0S;
                    if (i != 1) {
                        i4 = R.drawable.btn_myl;
                    } else {
                        imageView3.setImageResource(R.drawable.btn_myl_active);
                        locationPicker2.A0X.A0s = true;
                        return;
                    }
                } else {
                    locationPicker2 = (LocationPicker2) this.A00;
                    imageView3 = locationPicker2.A0X.A0S;
                    i4 = R.drawable.btn_compass_mode_tilt;
                }
                imageView3.setImageResource(i4);
                locationPicker2.A0X.A0s = false;
                return;
        }
    }
}
