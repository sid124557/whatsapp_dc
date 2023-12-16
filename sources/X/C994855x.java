package X;

import android.net.Uri;
import java.io.File;

/* renamed from: X.55x  reason: invalid class name and case insensitive filesystem */
public class C994855x extends AnonymousClass88V {
    public final C89654ea A00;
    public final C69263Wi A01;
    public final C621033m A02;
    public final C29441ip A03;
    public final AnonymousClass5ZU A04;
    public final C54292oU A05;
    public final C61072zf A06;
    public final C66473Lo A07;
    public final C48132eP A08;
    public final C620133d A09;
    public final AnonymousClass1nB A0A;
    public final C138356qD A0B;

    public C187668xc B0Y() {
        File file;
        AnonymousClass1nB r13 = this.A0A;
        AnonymousClass33C A002 = C30471mV.A00(r13);
        if (A002.A0R && (file = A002.A0F) != null && file.exists()) {
            return new C110955hJ(this.A00, Uri.fromFile(A002.A0F));
        }
        C54292oU r8 = this.A05;
        C69263Wi r4 = this.A01;
        C621033m r5 = this.A02;
        C61072zf r9 = this.A06;
        AnonymousClass5ZU r7 = this.A04;
        C48132eP r11 = this.A08;
        C620133d r12 = this.A09;
        return new C1691588f(this.A00, r4, r5, this.A03, r7, r8, r9, this.A07, r11, r12, r13, this.A00, this.A0B);
    }

    public C994855x(C89654ea r1, C69263Wi r2, C621033m r3, C29441ip r4, AnonymousClass5ZU r5, C54292oU r6, C61072zf r7, C66473Lo r8, C48132eP r9, C620133d r10, AnonymousClass1nB r11, C138356qD r12) {
        this.A05 = r6;
        this.A01 = r2;
        this.A06 = r7;
        this.A04 = r5;
        this.A08 = r9;
        this.A02 = r3;
        this.A09 = r10;
        this.A03 = r4;
        this.A07 = r8;
        this.A0A = r11;
        this.A00 = r1;
        this.A0B = r12;
    }
}
