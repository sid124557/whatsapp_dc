package X;

import android.net.Uri;

/* renamed from: X.81r  reason: invalid class name and case insensitive filesystem */
public class C1675981r implements C185788uF {
    public boolean A00;
    public final C89654ea A01;
    public final C69263Wi A02;
    public final AnonymousClass49Y A03;
    public final C29441ip A04;
    public final AnonymousClass5ZU A05;
    public final C56742sU A06;
    public final C183288pn A07;
    public final C138446qN A08;

    public void Awq(C184768sU r1) {
    }

    public Uri BE6() {
        return this.A08.BE6();
    }

    public long Bfw(C161387pX r3) {
        C117105rO.A00(this.A02, this, 10);
        return this.A08.Bfw(r3);
    }

    public /* synthetic */ void cancel() {
    }

    public void close() {
        C117105rO.A00(this.A02, this, 11);
        this.A08.close();
    }

    public int read(byte[] bArr, int i, int i2) {
        return this.A08.read(bArr, i, i2);
    }

    public C1675981r(C89654ea r12, C69263Wi r13, C621033m r14, C29441ip r15, AnonymousClass5ZU r16, C54292oU r17, C61072zf r18, C66473Lo r19, C48132eP r20, C620133d r21, AnonymousClass1nB r22, C183288pn r23, C138356qD r24) {
        C56742sU r9;
        C183288pn r10 = r23;
        this.A07 = r10;
        this.A03 = new AnonymousClass91E(this, 2);
        this.A02 = r13;
        AnonymousClass5ZU r4 = r16;
        this.A05 = r4;
        this.A04 = r15;
        this.A01 = r12;
        AnonymousClass1nB r8 = r22;
        AnonymousClass33C r1 = r8.A01;
        C626936e.A06(r1);
        C48132eP r2 = r20;
        if (r2.A00(r1) == null) {
            r14.A07(r12, r8, false);
        }
        AnonymousClass1I7 A002 = r2.A00(r1);
        if (A002 == null || (r9 = A002.A0o) == null) {
            throw AnonymousClass001.A0e("download file is null");
        }
        this.A06 = r9;
        r9.A0D = true;
        r9.A0E = true;
        C56852sf r25 = A002.A0h;
        C138356qD r3 = r24;
        if (r3.A04 == null) {
            r3.A02 = r25.A06();
        }
        r3.A04 = r25;
        C66473Lo r7 = r19;
        this.A08 = new C138446qN(r4, r17, r18, r7, r8, r9, r10);
        if (r9.A00() == 4) {
            String A003 = AnonymousClass29T.A00(r12, r4, r7, r8, r9);
            boolean A0A = r9.A0A();
            C162457s7.A0J(A003, 0);
            C183288pn r0 = this.A07;
            if (r0 != null) {
                r0.BcQ(A003, A0A, 1);
            }
        }
        r21.A0C(r8);
    }

    public C1675981r() {
        this.A07 = null;
    }
}
