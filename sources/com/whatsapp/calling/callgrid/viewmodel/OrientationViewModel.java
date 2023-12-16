package com.whatsapp.calling.callgrid.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass08M;
import X.AnonymousClass4C1;
import X.AnonymousClass4NC;
import X.AnonymousClass75J;
import X.C05550Ty;
import X.C106155Xv;
import X.C18260x0;
import X.C54292oU;
import android.hardware.display.DisplayManager;
import com.whatsapp.util.Log;

public class OrientationViewModel extends C05550Ty {
    public DisplayManager.DisplayListener A00;
    public AnonymousClass4NC A01;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final AnonymousClass08M A05 = AnonymousClass08M.A01();
    public final C54292oU A06;
    public final AnonymousClass4C1 A07;
    public final AnonymousClass4C1 A08;

    public final void A0D(int i) {
        AnonymousClass08M r3 = this.A05;
        Object A072 = r3.A07();
        Integer valueOf = Integer.valueOf(i);
        if (!AnonymousClass75J.A00(A072, valueOf)) {
            C18260x0.A0y("voip/OrientationViewModel/setOrientation ", AnonymousClass001.A0o(), i);
            r3.A0H(valueOf);
        }
    }

    public OrientationViewModel(C106155Xv r5, C54292oU r6, AnonymousClass4C1 r7, AnonymousClass4C1 r8) {
        this.A06 = r6;
        this.A07 = r7;
        this.A08 = r8;
        int i = r5.A03().getInt("portrait_mode_threshold", 30);
        this.A04 = i;
        int i2 = r5.A03().getInt("landscape_mode_threshold", 30);
        this.A03 = i2;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("OrientationViewModel/ctor portraitModeThreshold = ");
        A0o.append(i);
        C18260x0.A0y(" landscapeModeThreshold = ", A0o, i2);
        Log.d("voip/OrientationViewModel/setInitialOrientation");
        A0D((4 - ((DisplayManager) this.A06.A00.getSystemService("display")).getDisplay(0).getRotation()) % 4);
    }
}
