package com.whatsapp.privacy.disclosure.ui;

import X.AnonymousClass001;
import X.AnonymousClass08M;
import X.AnonymousClass4FS;
import X.AnonymousClass5SG;
import X.AnonymousClass5W0;
import X.AnonymousClass5WQ;
import X.C05550Ty;
import X.C06270Wx;
import X.C104625Rs;
import X.C162457s7;
import X.C18260x0;
import X.C48212eX;
import X.C55952rB;
import X.C59992xp;
import X.C69263Wi;
import X.C70273aE;
import com.whatsapp.util.Log;

public final class PrivacyDisclosureContainerViewModel extends C05550Ty {
    public int A00;
    public AnonymousClass5W0 A01 = AnonymousClass5W0.A06;
    public final C06270Wx A02;
    public final AnonymousClass08M A03;
    public final C69263Wi A04;
    public final C55952rB A05;
    public final C59992xp A06;
    public final C48212eX A07;
    public final AnonymousClass4FS A08;

    public final void A0D(int i) {
        C104625Rs r2;
        AnonymousClass5SG r0 = (AnonymousClass5SG) this.A03.A07();
        if (r0 == null || (r2 = (C104625Rs) r0.A02) == null) {
            Log.e("PrivacyDisclosureContainerViewModel: saveStage: disclosure not loaded yet");
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PrivacyDisclosureContainerViewModel: saveStage: id=");
        int i2 = r2.A00;
        A0o.append(i2);
        C18260x0.A0w(", stage=", A0o, i);
        C55952rB r3 = this.A05;
        r3.A09.BkM(new C70273aE(r3, i2, i, 4));
        C48212eX r4 = this.A07;
        AnonymousClass5W0 r32 = this.A01;
        C162457s7.A0J(r32, 3);
        int i3 = 1;
        if (i != 1) {
            i3 = 175;
            if (i != 5) {
                i3 = 100;
                if (i != 100) {
                    i3 = 105;
                    if (i != 105) {
                        i3 = 145;
                        if (i != 145) {
                            i3 = 155;
                            if (i != 155) {
                                i3 = 165;
                                if (i != 165) {
                                    switch (i) {
                                        case 111:
                                            i3 = 111;
                                            break;
                                        case 112:
                                            i3 = 112;
                                            break;
                                        case 113:
                                            i3 = 113;
                                            break;
                                        case 114:
                                            i3 = 114;
                                            break;
                                        case 115:
                                            i3 = 115;
                                            break;
                                        case 116:
                                            i3 = 116;
                                            break;
                                        case 117:
                                            i3 = 117;
                                            break;
                                        case 118:
                                            i3 = 118;
                                            break;
                                        case 119:
                                            i3 = 119;
                                            break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Integer valueOf = Integer.valueOf(i3);
        if (valueOf != null) {
            r4.A01(r32, i2, valueOf.intValue());
        }
        AnonymousClass5WQ.A01.A00(i);
    }

    public PrivacyDisclosureContainerViewModel(C69263Wi r2, C55952rB r3, C59992xp r4, C48212eX r5, AnonymousClass4FS r6) {
        C18260x0.A0f(r2, r6, r3, r5, r4);
        this.A04 = r2;
        this.A08 = r6;
        this.A05 = r3;
        this.A07 = r5;
        this.A06 = r4;
        AnonymousClass08M A012 = AnonymousClass08M.A01();
        this.A03 = A012;
        this.A02 = A012;
    }
}
