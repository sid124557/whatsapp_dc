package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.search.verification.client.SearchActionVerificationClientUtil;

/* renamed from: X.7jh  reason: invalid class name and case insensitive filesystem */
public class C158267jh {
    public static final C158267jh A00 = new C158267jh();

    public Intent A05(Context context, String str, int i) {
        if (i == 1 || i == 2) {
            if (context == null || !C155557f6.A00(context)) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("gcore_");
                A0o.append(12451000);
                A0o.append("-");
                if (!TextUtils.isEmpty(str)) {
                    A0o.append(str);
                }
                A0o.append("-");
                if (context != null) {
                    A0o.append(context.getPackageName());
                }
                A0o.append("-");
                if (context != null) {
                    try {
                        AnonymousClass7BQ A002 = C159987mq.A00(context);
                        A0o.append(A002.A00.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                String obj = A0o.toString();
                Intent A09 = AnonymousClass0x9.A09("android.intent.action.VIEW");
                Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "com.google.android.gms");
                if (!TextUtils.isEmpty(obj)) {
                    appendQueryParameter.appendQueryParameter("pcampaignid", obj);
                }
                A09.setData(appendQueryParameter.build());
                A09.setPackage("com.android.vending");
                A09.addFlags(524288);
                return A09;
            }
            Intent A092 = AnonymousClass0x9.A09("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            A092.setPackage(SearchActionVerificationClientUtil.ANDROID_WEAR_PACKAGE);
            return A092;
        } else if (i != 3) {
            return null;
        } else {
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", (String) null);
            Intent A093 = AnonymousClass0x9.A09("android.settings.APPLICATION_DETAILS_SETTINGS");
            A093.setData(fromParts);
            return A093;
        }
    }

    public int A03(Context context) {
        return A04(context, 12451000);
    }

    public int A04(Context context, int i) {
        int A002 = C162117rH.A00(context, i);
        if (A002 != 1 || !C162117rH.A05(context)) {
            return A002;
        }
        return 18;
    }
}
