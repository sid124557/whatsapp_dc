package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.R;

/* renamed from: X.2t6  reason: invalid class name and case insensitive filesystem */
public class C57112t6 {
    public static int A00(AnonymousClass33G r3) {
        String str;
        AnonymousClass23P r2 = r3.A08;
        String str2 = r3.A09;
        if (str2 != null) {
            str = AnonymousClass0x9.A0z(str2);
        } else {
            str = null;
        }
        switch (r2.ordinal()) {
            case 0:
                if ("wear os".equals(str)) {
                    return R.drawable.vec_device_list_ic_wearos;
                }
                break;
            case 1:
                return R.drawable.device_list_ic_chrome;
            case 2:
                return R.drawable.device_list_ic_firefox;
            case 3:
                return R.drawable.device_list_ic_ie;
            case 4:
                return R.drawable.device_list_ic_opera;
            case 5:
                return R.drawable.device_list_ic_safari;
            case 6:
                return R.drawable.device_list_ic_edge;
            case 7:
                if ("windows".equals(str)) {
                    return R.drawable.device_list_ic_windows;
                }
                if ("mac os".equals(str)) {
                    return R.drawable.device_list_ic_mac;
                }
                return R.drawable.device_list_ic_desktop_fallback;
            case 8:
                return R.drawable.vec_device_list_ic_ipad;
            case 9:
            case 16:
            case 17:
                return R.drawable.vec_device_list_ic_android;
            case 10:
            case 11:
            case 12:
            case 13:
                return R.drawable.device_list_ic_portal;
            case 14:
                return R.drawable.vec_device_list_ic_iphone;
            case 15:
                return R.drawable.device_list_ic_mac;
            case 18:
                return R.drawable.vec_device_list_ic_wearos;
            case 21:
                return R.drawable.device_list_ic_windows;
            case 22:
                return R.drawable.device_list_ic_meta_quest;
        }
        return R.drawable.device_list_ic_unknown_browser;
    }

    public static Intent A01(Context context, int i) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.companiondevice.LinkedDevicesActivity");
        A07.putExtra("entry_point", i);
        return A07;
    }
}
