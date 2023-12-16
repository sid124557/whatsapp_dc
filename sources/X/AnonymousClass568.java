package X;

import android.net.Uri;
import java.io.File;

/* renamed from: X.568  reason: invalid class name */
public class AnonymousClass568 extends C1675381l {
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

    public AnonymousClass568(C89654ea r2, C69263Wi r3, C621033m r4, C29441ip r5, AnonymousClass5ZU r6, C54292oU r7, C61072zf r8, C66473Lo r9, C48132eP r10, C620133d r11, AnonymousClass1nB r12, C138356qD r13) {
        super((C183288pn) null);
        this.A05 = r7;
        this.A01 = r3;
        this.A06 = r8;
        this.A04 = r6;
        this.A08 = r10;
        this.A02 = r4;
        this.A09 = r11;
        this.A03 = r5;
        this.A07 = r9;
        this.A0A = r12;
        this.A00 = r2;
        this.A0B = r13;
    }

    public C185788uF B0X() {
        File file;
        AnonymousClass1nB r13 = this.A0A;
        AnonymousClass33C A002 = C30471mV.A00(r13);
        if (A002.A0R && (file = A002.A0F) != null && file.exists()) {
            return new C110805h4(this.A00, Uri.fromFile(A002.A0F));
        }
        C54292oU r8 = this.A05;
        C69263Wi r4 = this.A01;
        C621033m r5 = this.A02;
        C61072zf r9 = this.A06;
        AnonymousClass5ZU r7 = this.A04;
        C48132eP r11 = this.A08;
        C620133d r12 = this.A09;
        return new C1675981r(this.A00, r4, r5, this.A03, r7, r8, r9, this.A07, r11, r12, r13, this.A00, this.A0B);
    }
}
