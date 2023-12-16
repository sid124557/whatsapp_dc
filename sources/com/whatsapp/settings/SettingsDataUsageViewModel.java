package com.whatsapp.settings;

import X.AnonymousClass002;
import X.AnonymousClass08M;
import X.AnonymousClass1VX;
import X.AnonymousClass310;
import X.AnonymousClass3Ci;
import X.AnonymousClass49P;
import X.AnonymousClass4FS;
import X.C05550Ty;
import X.C18330xA;
import X.C58422vE;
import X.C69263Wi;
import android.os.Build;
import android.os.Environment;
import java.io.File;

public class SettingsDataUsageViewModel extends C05550Ty {
    public final AnonymousClass08M A00 = C18330xA.A01(Boolean.FALSE);
    public final AnonymousClass08M A01 = AnonymousClass08M.A01();
    public final C69263Wi A02;
    public final AnonymousClass49P A03;
    public final AnonymousClass310 A04;
    public final AnonymousClass1VX A05;
    public final AnonymousClass3Ci A06;
    public final AnonymousClass4FS A07;

    public static /* synthetic */ void A00(SettingsDataUsageViewModel settingsDataUsageViewModel) {
        AnonymousClass08M r1;
        Boolean bool;
        if (Build.VERSION.SDK_INT < 30 || Environment.isExternalStorageLegacy() || !settingsDataUsageViewModel.A05.A0Y(C58422vE.A02, 1235)) {
            r1 = settingsDataUsageViewModel.A00;
            bool = Boolean.FALSE;
        } else {
            File A0A = AnonymousClass002.A0A(Environment.getExternalStorageDirectory(), "WhatsApp");
            r1 = settingsDataUsageViewModel.A00;
            bool = Boolean.valueOf(A0A.exists());
        }
        r1.A0G(bool);
    }

    public void A0C() {
        AnonymousClass3Ci r1 = this.A06;
        r1.A03.A02();
        r1.A04.A02();
    }

    public SettingsDataUsageViewModel(C69263Wi r2, AnonymousClass49P r3, AnonymousClass310 r4, AnonymousClass1VX r5, AnonymousClass3Ci r6, AnonymousClass4FS r7) {
        this.A05 = r5;
        this.A02 = r2;
        this.A07 = r7;
        this.A03 = r3;
        this.A04 = r4;
        this.A06 = r6;
    }
}
