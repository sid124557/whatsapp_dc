package X;

import java.io.File;
import java.util.Iterator;

/* renamed from: X.9jy  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C201379jy implements Runnable {
    public final /* synthetic */ AnonymousClass39R A00;
    public final /* synthetic */ C202649mM A01;
    public final /* synthetic */ C194589Tn A02;
    public final /* synthetic */ File A03;
    public final /* synthetic */ boolean A04;

    public final void run() {
        C194589Tn r4 = this.A02;
        C202649mM r3 = this.A01;
        AnonymousClass39R r2 = this.A00;
        File file = this.A03;
        boolean z = this.A04;
        if (r3 != null) {
            r3.BMa(r2, file);
        }
        if (!z) {
            C29341if r0 = r4.A0A;
            if (file != null) {
                r0.A08();
                return;
            }
            Iterator A032 = C61102zi.A03(r0);
            while (A032.hasNext()) {
                A032.next();
            }
        }
    }

    public /* synthetic */ C201379jy(AnonymousClass39R r1, C202649mM r2, C194589Tn r3, File file, boolean z) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = file;
        this.A04 = z;
    }
}
