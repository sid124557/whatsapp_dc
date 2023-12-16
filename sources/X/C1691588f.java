package X;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.88f  reason: invalid class name and case insensitive filesystem */
public class C1691588f implements C187668xc {
    public boolean A00;
    public final C89654ea A01;
    public final C69263Wi A02;
    public final AnonymousClass49Y A03;
    public final C29441ip A04;
    public final AnonymousClass5ZU A05;
    public final C56742sU A06;
    public final C183288pn A07;
    public final C138456qO A08;

    public void Awr(C178288hI r1) {
    }

    public Uri BE6() {
        return this.A08.BE6();
    }

    public long Bfx(C157677ih r3) {
        C117105rO.A00(this.A02, this, 8);
        return this.A08.Bfx(r3);
    }

    public void close() {
        C117105rO.A00(this.A02, this, 9);
        this.A08.close();
    }

    public int read(byte[] bArr, int i, int i2) {
        return this.A08.read(bArr, i, i2);
    }

    public C1691588f(C89654ea r13, C69263Wi r14, C621033m r15, C29441ip r16, AnonymousClass5ZU r17, C54292oU r18, C61072zf r19, C66473Lo r20, C48132eP r21, C620133d r22, AnonymousClass1nB r23, C183288pn r24, C138356qD r25) {
        C56742sU r10;
        C183288pn r11 = r24;
        this.A07 = r11;
        this.A03 = new AnonymousClass91E(this, 1);
        this.A02 = r14;
        AnonymousClass5ZU r5 = r17;
        this.A05 = r5;
        this.A04 = r16;
        this.A01 = r13;
        AnonymousClass1nB r9 = r23;
        AnonymousClass33C r1 = r9.A01;
        C626936e.A06(r1);
        C48132eP r3 = r21;
        if (r3.A00(r1) == null) {
            r15.A07(r13, r9, false);
        }
        AnonymousClass1I7 A002 = r3.A00(r1);
        if (A002 == null || (r10 = A002.A0o) == null) {
            throw AnonymousClass001.A0e("download file is null");
        }
        this.A06 = r10;
        r10.A0D = true;
        r10.A0E = true;
        C56852sf r32 = A002.A0h;
        C138356qD r4 = r25;
        if (r4.A04 == null) {
            r4.A02 = r32.A06();
        }
        r4.A04 = r32;
        C66473Lo r8 = r20;
        this.A08 = new C138456qO(r5, r18, r19, r8, r9, r10, r11);
        if (r10.A00() == 4) {
            String A003 = AnonymousClass29T.A00(r13, r5, r8, r9, r10);
            boolean A0A = r10.A0A();
            C162457s7.A0J(A003, 0);
            C183288pn r0 = this.A07;
            if (r0 != null) {
                r0.BcQ(A003, A0A, 1);
            }
        }
        r22.A0C(r9);
    }

    public /* synthetic */ Map BCF() {
        return Collections.emptyMap();
    }

    public C1691588f() {
        this.A07 = null;
    }
}
