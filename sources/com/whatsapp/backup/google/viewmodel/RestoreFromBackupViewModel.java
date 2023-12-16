package com.whatsapp.backup.google.viewmodel;

import X.AnonymousClass08M;
import X.AnonymousClass0NL;
import X.AnonymousClass0QU;
import X.AnonymousClass4FS;
import X.C05550Ty;
import X.C11700k4;
import X.C11710k5;
import X.C12470lb;
import X.C625835r;
import X.C627536m;
import X.C64393Dh;
import java.io.File;
import java.util.Set;

public class RestoreFromBackupViewModel extends C05550Ty {
    public int A00 = 21;
    public final AnonymousClass08M A01 = AnonymousClass08M.A01();
    public final AnonymousClass08M A02 = new AnonymousClass08M(0L);
    public final C64393Dh A03;
    public final AnonymousClass0NL A04;
    public final C625835r A05;
    public final AnonymousClass4FS A06;

    public static long A00(File file) {
        return C627536m.A00((AnonymousClass0QU) null, file);
    }

    public void A0D() {
        this.A06.BkM(new C11710k5(this));
    }

    public void A0E() {
        this.A06.BkM(new C11700k4(this));
    }

    public RestoreFromBackupViewModel(C64393Dh r3, AnonymousClass0NL r4, C625835r r5, AnonymousClass4FS r6) {
        this.A06 = r6;
        this.A03 = r3;
        this.A04 = r4;
        this.A05 = r5;
    }

    public void A0F(Set set) {
        if (!set.isEmpty()) {
            this.A06.BkM(new C12470lb(this, set));
        }
    }
}
