package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.5la  reason: invalid class name and case insensitive filesystem */
public class C113535la implements AnonymousClass4E8 {
    public final C54292oU A00;

    public String BDW() {
        return "TranslationDailyCron";
    }

    public void BQW() {
        Context context = this.A00.A00;
        File filesDir = context.getFilesDir();
        String[] list = filesDir.list(new C123866Ab(0));
        if (list != null) {
            for (String str : list) {
                String[] split = str.substring(0, str.lastIndexOf(".pack")).split("_");
                int length = split.length;
                if (length > 1) {
                    try {
                        if (Long.parseLong(split[length - 1]) != C18290x4.A0B(AnonymousClass002.A0B(context.getPackageCodePath()).lastModified())) {
                            C18260x0.A0s("translations/cleanupOldPackFiles Clearing old pack file: ", str, AnonymousClass001.A0o());
                            if (!AnonymousClass002.A0A(filesDir, str).delete()) {
                                C18260x0.A0r("translations/cleanupOldPackFiles Could not delete old pack file: ", str, AnonymousClass001.A0o());
                            }
                        }
                    } catch (NumberFormatException unused) {
                        C18260x0.A0t("translations/cleanupOldPackFiles Pack file name did not contain version info: ", str, AnonymousClass001.A0o());
                    }
                }
            }
        }
    }

    public /* synthetic */ void BQX() {
    }

    public C113535la(C54292oU r1) {
        this.A00 = r1;
    }
}
