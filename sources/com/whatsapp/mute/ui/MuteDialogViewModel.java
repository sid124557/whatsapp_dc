package com.whatsapp.mute.ui;

import X.AnonymousClass0x2;
import X.AnonymousClass1R1;
import X.AnonymousClass21R;
import X.AnonymousClass221;
import X.AnonymousClass33p;
import X.AnonymousClass4FS;
import X.C05550Ty;
import X.C162457s7;
import X.C18260x0;
import X.C18280x3;
import X.C28891hw;
import X.C29301ib;
import X.C50452iC;
import X.C56612sH;
import X.C64773Ex;
import X.C69263Wi;
import java.util.List;

public final class MuteDialogViewModel extends C05550Ty {
    public AnonymousClass21R A00;
    public AnonymousClass221 A01;
    public List A02;
    public boolean A03;
    public final C69263Wi A04;
    public final C29301ib A05;
    public final C64773Ex A06;
    public final C56612sH A07;
    public final AnonymousClass33p A08;
    public final C28891hw A09;
    public final C50452iC A0A;
    public final AnonymousClass1R1 A0B;
    public final AnonymousClass4FS A0C;

    public MuteDialogViewModel(C69263Wi r7, C29301ib r8, C64773Ex r9, C56612sH r10, AnonymousClass33p r11, C28891hw r12, C50452iC r13, AnonymousClass1R1 r14, AnonymousClass4FS r15) {
        AnonymousClass221 r1;
        C18260x0.A0f(r10, r7, r15, r13, r9);
        C18260x0.A0U(r14, r8);
        C162457s7.A0J(r11, 9);
        this.A07 = r10;
        this.A04 = r7;
        this.A0C = r15;
        this.A0A = r13;
        this.A06 = r9;
        this.A0B = r14;
        this.A05 = r8;
        this.A09 = r12;
        this.A08 = r11;
        int A022 = C18280x3.A02(AnonymousClass0x2.A0F(r11), "last_mute_selection");
        AnonymousClass221[] values = AnonymousClass221.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                r1 = AnonymousClass221.A02;
                break;
            }
            r1 = values[i];
            if (r1.id == A022) {
                break;
            }
            i++;
        }
        this.A01 = r1;
    }
}
