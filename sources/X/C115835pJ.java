package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5pJ  reason: invalid class name and case insensitive filesystem */
public class C115835pJ implements AnonymousClass66F {
    public final C54292oU A00;

    public Intent BCv(List list, int i) {
        String str;
        if (i == 1 || i == 4) {
            str = "image/png";
        } else {
            str = "video/mp4";
        }
        ArrayList A0s = AnonymousClass001.A0s();
        for (int i2 = 0; i2 < list.size(); i2++) {
            AnonymousClass5KK r8 = (AnonymousClass5KK) list.get(i2);
            Bundle A08 = AnonymousClass002.A08();
            A08.putString("story_media_caption", r8.A04);
            A08.putParcelable("story_media_uri", r8.A02);
            A08.putInt("story_media_video_length_sec", r8.A01);
            A08.putDouble("story_media_aspect_ratio", r8.A00);
            if (r8.A05 != null) {
                A08.putString("story_media_link_url", r8.A05);
            }
            A0s.add(A08);
        }
        Intent putParcelableArrayListExtra = C18320x8.A07().setAction("com.facebook.stories.ADD_TO_STORY").setPackage("com.facebook.katana").putExtra("com.facebook.platform.extra.APPLICATION_ID", "994766073959253").putExtra("editing_disabled", true).setType(str).putParcelableArrayListExtra("media_list", A0s);
        List<ResolveInfo> queryIntentActivities = this.A00.A00.getPackageManager().queryIntentActivities(putParcelableArrayListExtra, 65536);
        if (queryIntentActivities == null || queryIntentActivities.size() == 0) {
            return null;
        }
        return putParcelableArrayListExtra;
    }

    public boolean BJI() {
        Intent A09 = AnonymousClass0x9.A09("com.facebook.stories.ADD_TO_STORY");
        A09.setPackage("com.facebook.katana");
        A09.setType("image/png");
        Context context = this.A00.A00;
        try {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(A09, 65536);
            if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
                return false;
            }
            try {
                if (Integer.parseInt(context.getPackageManager().getPackageInfo("com.facebook.katana", 0).versionName.split("\\.")[0]) >= 227) {
                    return true;
                }
                return false;
            } catch (Exception e) {
                Log.w("Cannot get FB version number", e);
                return false;
            }
        } catch (Exception unused) {
            return false;
        }
    }

    public C115835pJ(C54292oU r1) {
        this.A00 = r1;
    }
}
