package X;

import com.whatsapp.R;
import com.whatsapp.migration.export.ui.ExportMigrationActivity;

/* renamed from: X.3aR  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70403aR implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ ExportMigrationActivity A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public final void run() {
        ExportMigrationActivity exportMigrationActivity = this.A01;
        String str = this.A02;
        String str2 = this.A03;
        long j = this.A00;
        C19340zH A002 = AnonymousClass5V0.A00(exportMigrationActivity);
        A002.A0h(str);
        A002.A0g(str2);
        A002.A0i(false);
        C19340zH.A08(A002, exportMigrationActivity, 69, R.string.f11nameremoved);
        A002.A0W(new C107925c8(exportMigrationActivity, j), R.string.f11nameremoved);
        A002.A0S();
    }

    public /* synthetic */ C70403aR(ExportMigrationActivity exportMigrationActivity, String str, String str2, long j) {
        this.A01 = exportMigrationActivity;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = j;
    }
}
