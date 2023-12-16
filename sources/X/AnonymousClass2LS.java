package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.whatsapp.migration.export.ui.ExportMigrationActivity;

/* renamed from: X.2LS  reason: invalid class name */
public class AnonymousClass2LS {
    public final ComponentName A00;
    public final PackageManager A01;

    public AnonymousClass2LS(Context context) {
        this.A01 = context.getPackageManager();
        this.A00 = new ComponentName(context, ExportMigrationActivity.class);
    }
}
