package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5bF  reason: invalid class name and case insensitive filesystem */
public class C107395bF {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.content.Intent[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent A01(android.content.IntentSender r6, java.lang.CharSequence r7, java.util.List r8) {
        /*
            r5 = 0
            java.lang.Object r2 = r8.get(r5)
            android.content.Intent r2 = (android.content.Intent) r2
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 22
            if (r1 < r0) goto L_0x002c
            if (r6 == 0) goto L_0x002c
            android.content.Intent r4 = android.content.Intent.createChooser(r2, r7, r6)
        L_0x0013:
            int r3 = X.AnonymousClass002.A03(r8)
            if (r3 <= 0) goto L_0x002b
            android.content.Intent[] r2 = new android.content.Intent[r3]
        L_0x001b:
            int r1 = r5 + 1
            java.lang.Object r0 = r8.get(r1)
            r2[r5] = r0
            r5 = r1
            if (r1 < r3) goto L_0x001b
            java.lang.String r0 = "android.intent.extra.INITIAL_INTENTS"
            r4.putExtra(r0, r2)
        L_0x002b:
            return r4
        L_0x002c:
            android.content.Intent r4 = android.content.Intent.createChooser(r2, r7)
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107395bF.A01(android.content.IntentSender, java.lang.CharSequence, java.util.List):android.content.Intent");
    }

    public static Intent A00(Intent intent, AnonymousClass2z0 r5) {
        if (!intent.hasExtra("fMessageKeyJid") && !intent.hasExtra("fMessageKeyFromMe") && !intent.hasExtra("fMessageKeyId")) {
            return intent.putExtra("fMessageKeyId", r5.A01).putExtra("fMessageKeyFromMe", r5.A02).putExtra("fMessageKeyJid", C627336j.A07(r5.A00));
        }
        throw AnonymousClass001.A0c("Intent already contains key.");
    }

    public static AnonymousClass2z0 A02(Intent intent) {
        if (!intent.hasExtra("fMessageKeyJid") || !intent.hasExtra("fMessageKeyFromMe") || !intent.hasExtra("fMessageKeyId")) {
            return null;
        }
        return new AnonymousClass2z0(C106405Yw.A01(intent, "fMessageKeyJid"), intent.getStringExtra("fMessageKeyId"), AnonymousClass0x9.A1N(intent, "fMessageKeyFromMe"));
    }

    public static List A04(Bundle bundle) {
        if (!bundle.containsKey("fMessageKeyJidArray") || !bundle.containsKey("fMessageKeyFromMeArray") || !bundle.containsKey("fMessageKeyIdArray")) {
            return null;
        }
        String[] stringArray = bundle.getStringArray("fMessageKeyIdArray");
        C626936e.A06(stringArray);
        boolean[] booleanArray = bundle.getBooleanArray("fMessageKeyFromMeArray");
        C626936e.A06(booleanArray);
        String[] stringArray2 = bundle.getStringArray("fMessageKeyJidArray");
        C626936e.A06(stringArray2);
        int length = stringArray.length;
        ArrayList A0I = AnonymousClass002.A0I(length);
        for (int i = 0; i < length; i++) {
            A0I.add(new AnonymousClass2z0(C18310x6.A0S(stringArray2[i]), stringArray[i], booleanArray[i]));
        }
        return A0I;
    }

    public static void A05(Activity activity) {
        try {
            Intent A09 = AnonymousClass0x9.A09("android.settings.APPLICATION_DETAILS_SETTINGS");
            A09.setData(Uri.fromParts("package", "com.whatsapp", (String) null));
            activity.startActivity(A09);
        } catch (ActivityNotFoundException unused) {
            C86654Ky.A0v(activity, "android.settings.SETTINGS");
        }
    }

    public static void A06(Activity activity) {
        try {
            Intent A09 = AnonymousClass0x9.A09("android.settings.APP_NOTIFICATION_SETTINGS");
            A09.putExtra("android.provider.extra.APP_PACKAGE", "com.whatsapp");
            activity.startActivity(A09);
        } catch (ActivityNotFoundException unused) {
            C86654Ky.A0v(activity, "android.settings.SETTINGS");
        }
    }

    public static void A07(Bundle bundle, AnonymousClass2z0 r2) {
        A08(bundle, r2, "");
    }

    public static void A09(Bundle bundle, Collection collection) {
        if (bundle.containsKey("fMessageKeyJidArray") || bundle.containsKey("fMessageKeyFromMeArray") || bundle.containsKey("fMessageKeyIdArray")) {
            throw AnonymousClass001.A0c("Bundle already contains list of keys.");
        }
        String[] strArr = new String[collection.size()];
        boolean[] zArr = new boolean[collection.size()];
        String[] strArr2 = new String[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            AnonymousClass2z0 r1 = (AnonymousClass2z0) it.next();
            strArr[i] = r1.A01;
            zArr[i] = r1.A02;
            strArr2[i] = C627336j.A07(r1.A00);
            i++;
        }
        bundle.putStringArray("fMessageKeyIdArray", strArr);
        bundle.putBooleanArray("fMessageKeyFromMeArray", zArr);
        bundle.putStringArray("fMessageKeyJidArray", strArr2);
    }

    public static AnonymousClass2z0 A03(Bundle bundle, String str) {
        String A0X = AnonymousClass000.A0X("fMessageKeyJid", AnonymousClass000.A0l(str));
        String A0X2 = AnonymousClass000.A0X("fMessageKeyFromMe", AnonymousClass000.A0l(str));
        String A0X3 = AnonymousClass000.A0X("fMessageKeyId", AnonymousClass000.A0l(str));
        if (!bundle.containsKey(A0X) || !bundle.containsKey(A0X2) || !bundle.containsKey(A0X3)) {
            return null;
        }
        return new AnonymousClass2z0(C106405Yw.A02(bundle, A0X), bundle.getString(A0X3), bundle.getBoolean(A0X2, false));
    }

    public static void A08(Bundle bundle, AnonymousClass2z0 r5, String str) {
        String A0X = AnonymousClass000.A0X("fMessageKeyJid", AnonymousClass000.A0l(str));
        String A0X2 = AnonymousClass000.A0X("fMessageKeyFromMe", AnonymousClass000.A0l(str));
        String A0X3 = AnonymousClass000.A0X("fMessageKeyId", AnonymousClass000.A0l(str));
        if (bundle.containsKey(A0X3) || bundle.containsKey(A0X2) || bundle.containsKey(A0X3)) {
            throw AnonymousClass001.A0c("Bundle already contains key.");
        }
        bundle.putString(A0X3, r5.A01);
        bundle.putBoolean(A0X2, r5.A02);
        bundle.putString(A0X, C627336j.A07(r5.A00));
    }
}
