package X;

import android.content.DialogInterface;
import com.whatsapp.migration.export.ui.ExportMigrationActivity;

/* renamed from: X.5c8  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C107925c8 implements DialogInterface.OnClickListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ ExportMigrationActivity A01;

    public final void onClick(DialogInterface dialogInterface, int i) {
        ExportMigrationActivity exportMigrationActivity = this.A01;
        long j = this.A00;
        exportMigrationActivity.A0G.A00(exportMigrationActivity.A0J, 7);
        exportMigrationActivity.A77(new C70083Zv(exportMigrationActivity, j, 17), new C70023Zo(exportMigrationActivity, 8), false);
    }

    public /* synthetic */ C107925c8(ExportMigrationActivity exportMigrationActivity, long j) {
        this.A01 = exportMigrationActivity;
        this.A00 = j;
    }
}
