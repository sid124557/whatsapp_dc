package com.whatsapp.migration.export.ui;

import X.AnonymousClass001;
import X.AnonymousClass08M;
import X.AnonymousClass1VX;
import X.AnonymousClass3R2;
import X.AnonymousClass75J;
import X.AnonymousClass7Q5;
import X.C05550Ty;
import X.C18260x0;
import X.C28851hs;
import X.C58422vE;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class ExportMigrationViewModel extends C05550Ty {
    public final AnonymousClass08M A00 = AnonymousClass08M.A01();
    public final AnonymousClass08M A01 = AnonymousClass08M.A01();
    public final AnonymousClass08M A02 = AnonymousClass08M.A01();
    public final C28851hs A03;
    public final AnonymousClass3R2 A04;
    public final AnonymousClass7Q5 A05 = new AnonymousClass7Q5();

    public void A0C() {
        this.A03.A07(this.A04);
    }

    public ExportMigrationViewModel(AnonymousClass1VX r3, C28851hs r4) {
        int i;
        this.A03 = r4;
        AnonymousClass3R2 r0 = new AnonymousClass3R2(this);
        this.A04 = r0;
        r4.A06(r0);
        if (r3.A0Y(C58422vE.A02, 881)) {
            Log.e("ExportMigrationViewModel/disabled: app version for platform migration is not supported");
            i = 4;
        } else {
            i = 0;
        }
        A0D(i);
    }

    public void A0D(int i) {
        String str;
        C18260x0.A0y("ExportMigrationViewModel/setScreen: ", AnonymousClass001.A0o(), i);
        Integer valueOf = Integer.valueOf(i);
        AnonymousClass08M r2 = this.A02;
        if (!AnonymousClass75J.A00(valueOf, r2.A07())) {
            AnonymousClass7Q5 r1 = this.A05;
            r1.A0A = 8;
            r1.A00 = 8;
            r1.A03 = 8;
            r1.A06 = 8;
            r1.A04 = 8;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        r1.A08 = R.string.f11nameremoved;
                        r1.A07 = R.string.f11nameremoved;
                        r1.A02 = R.string.f11nameremoved;
                        r1.A03 = 0;
                    } else if (i == 4) {
                        r1.A08 = R.string.f11nameremoved;
                        r1.A07 = R.string.f11nameremoved;
                        r1.A02 = R.string.f11nameremoved;
                        r1.A03 = 0;
                        r1.A05 = R.string.f11nameremoved;
                        r1.A06 = 0;
                        r1.A0A = 8;
                        r1.A01 = R.drawable.vec_android_to_ios_error;
                        str = "android_to_ios_error.png";
                        r1.A0B = str;
                    } else if (i == 5) {
                        r1.A08 = R.string.f11nameremoved;
                        r1.A07 = R.string.f11nameremoved;
                        r1.A06 = 8;
                        r1.A04 = 8;
                    } else {
                        return;
                    }
                    r1.A0A = 8;
                } else {
                    r1.A08 = R.string.f11nameremoved;
                    r1.A07 = R.string.f11nameremoved;
                    r1.A0A = 8;
                    r1.A06 = 0;
                    r1.A05 = R.string.f11nameremoved;
                    r1.A04 = 0;
                }
                r1.A01 = R.drawable.vec_android_to_ios_in_progress;
                r1.A0B = "android_to_ios_in_progress.png";
            } else {
                r1.A08 = R.string.f11nameremoved;
                r1.A07 = R.string.f11nameremoved;
                r1.A00 = 0;
                r1.A02 = R.string.f11nameremoved;
                r1.A03 = 0;
                r1.A09 = R.string.f11nameremoved;
                r1.A0A = 0;
                r1.A01 = R.drawable.vec_android_to_ios_start;
                str = "android_to_ios_start.png";
                r1.A0B = str;
            }
            C18260x0.A0y("ExportMigrationViewModel/setScreen/post=", AnonymousClass001.A0o(), i);
            r2.A0G(valueOf);
        }
    }
}
