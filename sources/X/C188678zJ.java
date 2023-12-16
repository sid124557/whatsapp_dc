package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.view.View;
import com.whatsapp.gallerypicker.GalleryPickerFragment;
import com.whatsapp.util.Log;

/* renamed from: X.8zJ  reason: invalid class name and case insensitive filesystem */
public class C188678zJ extends BroadcastReceiver {
    public Object A00;
    public final int A01;

    public static void A00(Intent intent, C188678zJ r6) {
        String str;
        C162457s7.A0J(intent, 1);
        GalleryPickerFragment galleryPickerFragment = (GalleryPickerFragment) r6.A00;
        String action = intent.getAction();
        if (action != null) {
            switch (action.hashCode()) {
                case -1514214344:
                    if (action.equals("android.intent.action.MEDIA_MOUNTED")) {
                        Log.i("gallerypicker/receivemediabroadcast/ACTION_MEDIA_MOUNTED");
                        return;
                    }
                    return;
                case -1142424621:
                    if (action.equals("android.intent.action.MEDIA_SCANNER_FINISHED")) {
                        Log.i("gallerypicker/receivemediabroadcast/ACTION_MEDIA_SCANNER_FINISHED");
                        galleryPickerFragment.A1L(false, false);
                        return;
                    }
                    return;
                case -963871873:
                    if (action.equals("android.intent.action.MEDIA_UNMOUNTED")) {
                        str = "gallerypicker/receivemediabroadcast/ACTION_MEDIA_UNMOUNTED";
                        break;
                    } else {
                        return;
                    }
                case -625887599:
                    if (action.equals("android.intent.action.MEDIA_EJECT")) {
                        str = "gallerypicker/receivemediabroadcast/ACTION_MEDIA_EJECT";
                        break;
                    } else {
                        return;
                    }
                case 1412829408:
                    if (action.equals("android.intent.action.MEDIA_SCANNER_STARTED")) {
                        Log.i("gallerypicker/receivemediabroadcast/ACTION_MEDIA_SCANNER_STARTED");
                        galleryPickerFragment.A1L(false, true);
                        return;
                    }
                    return;
                default:
                    return;
            }
            Log.i(str);
            galleryPickerFragment.A1L(true, false);
        }
    }

    public C188678zJ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onReceive(Context context, Intent intent) {
        int type;
        switch (this.A01) {
            case 0:
                if (intent == null || !intent.getBooleanExtra("noConnectivity", false)) {
                    ((View) this.A00).invalidate();
                    return;
                }
                return;
            case 1:
                C126136Kv r2 = (C126136Kv) this.A00;
                NetworkInfo activeNetworkInfo = r2.A03.getActiveNetworkInfo();
                if (activeNetworkInfo != null && (type = activeNetworkInfo.getType()) != r2.A00) {
                    r2.A03();
                    r2.A00 = type;
                    return;
                }
                return;
            case 2:
                ((AnonymousClass5TY) this.A00).A00();
                return;
            case 3:
                if (C18280x3.A1V(intent, "android.intent.action.SCREEN_OFF")) {
                    ((C107285b3) this.A00).A27.A03();
                    Log.i("Screen is being turned off");
                    return;
                }
                return;
            case 4:
                A00(intent, this);
                return;
            default:
                if ("android.nfc.action.ADAPTER_STATE_CHANGED".equals(intent.getAction())) {
                    ((C009707r) this.A00).invalidateOptionsMenu();
                    return;
                }
                return;
        }
    }
}
