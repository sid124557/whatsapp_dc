package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import androidx.core.content.FileProvider;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5pL  reason: invalid class name and case insensitive filesystem */
public class C115855pL implements AnonymousClass4BK {
    public static final Set A04 = C18280x3.A0h(new String[]{"com.facebook.inspiration.shortcut.shareintent.InpirationCameraShareDefaultAlias", "com.facebook.inspiration.shortcut.shareintent.InpirationCameraShareTestAliasActionClarify", "com.facebook.inspiration.shortcut.shareintent.InpirationCameraShareTestAliasFamilyConsistency"});
    public final C69263Wi A00;
    public final C54292oU A01;
    public final AnonymousClass5PU A02;
    public final AnonymousClass3LZ A03;

    public C115855pL(C69263Wi r1, C54292oU r2, AnonymousClass5PU r3, AnonymousClass3LZ r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }

    public C102345Im BCw(Context context, String str, List list) {
        String str2;
        Intent intent;
        int i;
        Intent intent2;
        C626936e.A00();
        C102345Im r3 = new C102345Im();
        C105645Vv A002 = C105645Vv.A00(context, this.A03, list);
        int i2 = A002.A00;
        if (i2 != 0) {
            Map map = A002.A01;
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator A0v = AnonymousClass001.A0v(map);
            while (A0v.hasNext()) {
                try {
                    Uri A003 = FileProvider.A00(this.A01.A00, ((C102205Hw) A0v.next()).A00, C58152un.A07);
                    if (A003 != null) {
                        A0s.add(A003);
                    }
                } catch (IllegalArgumentException unused) {
                    C69263Wi r32 = this.A00;
                    AnonymousClass5PU r2 = this.A02;
                    C162457s7.A0J(r32, 0);
                    C18260x0.A0Q(r2, str);
                    r32.A0S(new C71373c0(12, str, r2));
                    Log.w("getSharingIntent: Attempting to share file failed");
                    return null;
                }
            }
            switch (i2) {
                case 1:
                case 4:
                    str2 = "image/png";
                    break;
                case 2:
                case 5:
                    str2 = "audio/ogg; codecs=opus";
                    break;
                case 3:
                case 6:
                    str2 = "video/mp4";
                    break;
                default:
                    str2 = "*/*";
                    break;
            }
            Intent type = C18320x8.A07().setType(str2);
            if (A0s.size() == 1) {
                type.setAction("android.intent.action.SEND").putExtra("android.intent.extra.STREAM", (Parcelable) AnonymousClass0x9.A0t(A0s));
            } else if (A0s.size() > 1) {
                type.setAction("android.intent.action.SEND_MULTIPLE").putParcelableArrayListExtra("android.intent.extra.STREAM", A0s);
            }
            ArrayList A0s2 = AnonymousClass001.A0s();
            List<ResolveInfo> queryIntentActivities = this.A01.A00.getPackageManager().queryIntentActivities(type, 65536);
            int size = queryIntentActivities.size();
            if (size != 0) {
                if (Build.VERSION.SDK_INT < 29) {
                    boolean z = false;
                    for (ResolveInfo next : queryIntentActivities) {
                        ActivityInfo activityInfo = next.activityInfo;
                        String str3 = activityInfo.name;
                        if (!str3.startsWith("com.facebook.")) {
                            Intent intent3 = new Intent(type);
                            C18320x8.A10(intent3, activityInfo.packageName, activityInfo.name);
                            A0s2.add(intent3);
                        } else if (!z && A04.contains(str3)) {
                            ActivityInfo activityInfo2 = next.activityInfo;
                            Intent intent4 = new Intent(type);
                            C18320x8.A10(intent4, activityInfo2.packageName, activityInfo2.name);
                            A0s2.add(intent4);
                            z = true;
                        }
                    }
                    if (size != A0s2.size() && z && (i = Build.VERSION.SDK_INT) < 29) {
                        if (i >= 23) {
                            intent2 = C18320x8.A07();
                        } else {
                            intent2 = (Intent) A0s2.remove(0);
                        }
                        intent = Intent.createChooser(intent2, (CharSequence) null);
                        intent.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) A0s2.toArray(new Parcelable[0]));
                        intent.addFlags(268435456);
                        r3.A02 = A0s;
                        r3.A01 = intent;
                        return r3;
                    }
                }
                intent = Intent.createChooser(type, (CharSequence) null);
                if (intent == null) {
                    return r3;
                }
                intent.addFlags(268435456);
                r3.A02 = A0s;
                r3.A01 = intent;
                return r3;
            }
        }
        return r3;
    }
}
