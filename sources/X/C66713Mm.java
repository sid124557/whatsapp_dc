package X;

import android.content.Context;
import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.3Mm  reason: invalid class name and case insensitive filesystem */
public final class C66713Mm implements AnonymousClass4FV {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final AnonymousClass33p A03;
    public final AnonymousClass1VX A04;
    public final AnonymousClass2YD A05;
    public final C66683Mj A06;
    public final AnonymousClass2O6 A07;
    public final C183538qC A08;
    public final C183538qC A09;

    public C66713Mm(AnonymousClass33p r2, AnonymousClass1VX r3, AnonymousClass2YD r4, C66683Mj r5, AnonymousClass2O6 r6, C183538qC r7, C183538qC r8) {
        C18260x0.A0a(r7, r6, r5, 1);
        C162457s7.A0J(r4, 5);
        C18260x0.A0U(r8, r2);
        this.A08 = r7;
        this.A04 = r3;
        this.A07 = r6;
        this.A06 = r5;
        this.A05 = r4;
        this.A09 = r8;
        this.A03 = r2;
    }

    public final Integer A00(AnonymousClass5ZC r9, int i, boolean z) {
        AnonymousClass5ZC r2 = r9;
        int A002 = this.A05.A00(i);
        if (A002 != 0) {
            int abs = Math.abs(A002);
            r2 = new AnonymousClass5ZC(abs, abs, abs, abs, false);
        } else {
            A002 = r9.A01;
            if (z) {
                A002 = -A002;
            }
        }
        if (r2.A00()) {
            return Integer.valueOf(A002);
        }
        return null;
    }

    public Integer AzK(AnonymousClass3ZG r3, AnonymousClass5ZC r4, boolean z) {
        C162457s7.A0J(r3, 0);
        int i = r3.code;
        if (r4 == null) {
            r4 = r3.samplingRate;
        }
        return A00(r4, i, false);
    }

    public void BFx(Context context, C40502Gq r7, AnonymousClass2L6 r8, C183538qC r9, C183538qC r10, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        C162457s7.A0J(context, 0);
        AnonymousClass1VX r2 = this.A04;
        synchronized (r2) {
            r2.A02 = this;
        }
        int A0O = r2.A0O(C58422vE.A02, 5120);
        boolean z4 = true;
        this.A01 = AnonymousClass001.A1X(A0O, 3);
        if (A0O == 2) {
            z4 = false;
        }
        this.A02 = z4;
        this.A07.A00.execute(new C70343aL(this, r8, context, 21));
        C66683Mj r3 = this.A06;
        r3.A00.A00.execute(new C71343bx(r3, 43, r7));
    }

    public void BKX() {
        BlF(true);
    }

    public void BhA(AnonymousClass3ZG r3) {
        C162457s7.A0J(r3, 0);
        Bh7(r3, (AnonymousClass5ZC) null, true);
    }

    public void BhB(AnonymousClass3ZG r5) {
        C162457s7.A0J(r5, 0);
        A01(r5, 1);
        if (r5 instanceof WamCall) {
            C18260x0.A1R(AnonymousClass000.A0m("wamruntime/printevent", ""), ": ", r5);
        }
    }

    public void BhD(AnonymousClass3ZG r3) {
        C162457s7.A0J(r3, 0);
        Bh7(r3, (AnonymousClass5ZC) null, false);
    }

    public final void A01(AnonymousClass3ZG r3, int i) {
        boolean z;
        int i2 = r3.bufferChannel;
        if (i2 == 2) {
            z = this.A02;
        } else {
            if (i2 != 2) {
                z = this.A01;
            }
            this.A07.A01.execute(new C71713cY(this, r3, i, 0));
        }
        if (!z) {
            return;
        }
        this.A07.A01.execute(new C71713cY(this, r3, i, 0));
    }

    public void BYU() {
        C66353La r4 = (C66353La) this.A09.get();
        r4.A00.A06(new C386828s(new AnonymousClass2WL(this), 1, r4));
    }

    public void Bh7(AnonymousClass3ZG r5, AnonymousClass5ZC r6, boolean z) {
        String str;
        int i = r5.code;
        if (r6 == null) {
            r6 = r5.samplingRate;
        }
        Integer A002 = A00(r6, i, z);
        if (A002 != null) {
            A01(r5, A002.intValue());
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("(sampled with weight ");
            str = C18260x0.A04(A002, A0o);
        } else {
            str = "(dropped)";
        }
        if (r5 instanceof WamCall) {
            C18260x0.A1R(AnonymousClass000.A0m("wamruntime/printevent", str), ": ", r5);
        }
    }

    public void BlF(boolean z) {
        JniBridge.jvidispatchIO(6, AnonymousClass0x9.A0r((JniBridge) this.A08.get()));
    }

    public void Bn6(int i) {
    }

    public boolean BIV() {
        return true;
    }

    public void BhC(AnonymousClass3ZG r2, AnonymousClass5ZC r3) {
        Bh7(r2, r3, C18290x4.A1W(r3));
    }

    public void BhE(AnonymousClass3ZG r5, int i) {
        A01(r5, i);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("(with weight=");
        String A092 = C18260x0.A09(A0o, i);
        if (r5 instanceof WamCall) {
            C18260x0.A1R(AnonymousClass000.A0m("wamruntime/printevent", A092), ": ", r5);
        }
    }

    public void Bpp() {
    }

    public void Bh9(AnonymousClass5ZC r1, byte[] bArr, int i, int i2, boolean z) {
    }
}
