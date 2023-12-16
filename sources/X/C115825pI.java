package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5pI  reason: invalid class name and case insensitive filesystem */
public class C115825pI implements AnonymousClass66F {
    public final C54292oU A00;

    public Intent BCv(List list, int i) {
        String str;
        if (!(i == 7 || i == 6)) {
            if (i == 1) {
                str = "image/png";
            } else if (i != 3) {
                str = "*/*";
            } else {
                str = "video/mp4";
            }
            String str2 = "com.facebook.lite.composer.activities.ShareIntentMultiPhotoAlphabeticalAlias";
            if (!(i == 4 || i == 1)) {
                str2 = "com.facebook.lite.composer.activities.ShareIntentVideoAlphabeticalAlias";
            }
            ArrayList A0s = AnonymousClass001.A0s();
            JSONArray A1F = AnonymousClass0x9.A1F();
            for (int i2 = 0; i2 < list.size(); i2++) {
                JSONObject A1G = AnonymousClass0x9.A1G();
                AnonymousClass5KK r11 = (AnonymousClass5KK) list.get(i2);
                Uri uri = r11.A02;
                try {
                    A1G.put("story_media_caption", r11.A04);
                    A1G.put("story_media_uri", uri.toString());
                    A1G.put("story_media_video_length_sec", r11.A01);
                    A1G.put("story_media_aspect_ratio", r11.A00);
                    A1G.put("story_media_link_url", r11.A05);
                    A1F.put(A1G.toString());
                    A0s.add(uri);
                } catch (JSONException e) {
                    Log.w("liteposter/json", e);
                }
            }
            Intent putExtra = C18320x8.A07().setType(str).setPackage("com.facebook.lite").setComponent(new ComponentName("com.facebook.lite", str2)).addFlags(268435456).putExtra("com.facebook.platform.extra.APPLICATION_ID", "994766073959253").putExtra("editing_disabled", true).putExtra("media_list", A1F.toString());
            if (list.size() == 1) {
                putExtra.setAction("android.intent.action.SEND").putExtra("android.intent.extra.STREAM", ((AnonymousClass5KK) list.get(0)).A02);
            } else if (list.size() > 1) {
                putExtra.setAction("android.intent.action.SEND_MULTIPLE").putParcelableArrayListExtra("android.intent.extra.STREAM", A0s);
            }
            List<ResolveInfo> queryIntentActivities = this.A00.A00.getPackageManager().queryIntentActivities(putExtra, 65536);
            if (queryIntentActivities == null || queryIntentActivities.size() == 0) {
                return null;
            }
            return putExtra;
        }
        return null;
    }

    public C115825pI(C54292oU r1) {
        this.A00 = r1;
    }

    public boolean BJI() {
        Intent A07 = C18320x8.A07();
        C18320x8.A10(A07.setPackage("com.facebook.lite").setType("image/png"), "com.facebook.lite", "com.facebook.lite.composer.activities.ShareIntentMultiPhotoAlphabeticalAlias");
        Context context = this.A00.A00;
        try {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(A07, 65536);
            if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
                return false;
            }
            try {
                if (Integer.parseInt(context.getPackageManager().getPackageInfo("com.facebook.lite", 0).versionName.split("\\.")[0]) >= 91) {
                    return true;
                }
                return false;
            } catch (Exception e) {
                Log.w("Cannot get FBLite version number", e);
                return false;
            }
        } catch (Exception unused) {
            return false;
        }
    }
}
