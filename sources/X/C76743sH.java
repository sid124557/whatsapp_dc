package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* renamed from: X.3sH  reason: invalid class name and case insensitive filesystem */
public final class C76743sH extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass35Q this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76743sH(AnonymousClass35Q r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ApplicationInfo applicationInfo;
        String str;
        Context context = this.this$0.A04.A00;
        PackageInfo A01 = AnonymousClass345.A01(context, context.getPackageName());
        if (A01 != null && (applicationInfo = A01.applicationInfo) != null && (str = applicationInfo.dataDir) != null) {
            return str;
        }
        throw AnonymousClass001.A0e("AccountSwitchingFileManager/getApplicationDataDir/unable to get application path");
    }
}
