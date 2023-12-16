package X;

import com.whatsapp.migration.export.ui.ExportMigrationViewModel;

/* renamed from: X.3R2  reason: invalid class name */
public class AnonymousClass3R2 implements AnonymousClass4FE {
    public final /* synthetic */ ExportMigrationViewModel A00;

    public AnonymousClass3R2(ExportMigrationViewModel exportMigrationViewModel) {
        this.A00 = exportMigrationViewModel;
    }

    public void BOS() {
        this.A00.A0D(0);
    }

    public void BOT() {
        this.A00.A0D(5);
    }

    public void BSa() {
        this.A00.A0D(2);
    }

    public void BSb(int i) {
        ExportMigrationViewModel exportMigrationViewModel = this.A00;
        Integer valueOf = Integer.valueOf(i);
        AnonymousClass08M r1 = exportMigrationViewModel.A01;
        if (!AnonymousClass75J.A00(valueOf, r1.A07())) {
            if (i > 100) {
                i = 100;
            } else if (i < 0) {
                i = 0;
            }
            C06270Wx.A04(r1, i);
        }
    }

    public void BSc() {
        this.A00.A0D(1);
    }

    public void onError(int i) {
        ExportMigrationViewModel exportMigrationViewModel = this.A00;
        C18260x0.A0y("ExportMigrationViewModel/setErrorCode: ", AnonymousClass001.A0o(), 1);
        Integer num = 1;
        AnonymousClass08M r1 = exportMigrationViewModel.A00;
        if (!num.equals(r1.A07())) {
            r1.A0G(num);
        }
    }
}
