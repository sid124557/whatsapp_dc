package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.6OG  reason: invalid class name */
public final class AnonymousClass6OG extends AnonymousClass861 implements Handler.Callback {
    public int A00;
    public int A01;
    public long A02;
    public C180688lT A03;
    public boolean A04;
    public boolean A05;
    public final Handler A06;
    public final C187018wJ A07;
    public final AnonymousClass6OZ A08;
    public final C180698lU A09;
    public final long[] A0A;
    public final C166547ys[] A0B;

    public final void A0E(C166547ys r7, List list) {
        int i = 0;
        while (true) {
            C187368x6[] r5 = r7.A00;
            if (i < r5.length) {
                C166527yp BEb = r5[i].BEb();
                if (BEb != null) {
                    C187018wJ r1 = this.A07;
                    if (r1.BqP(BEb)) {
                        C180688lT B0a = r1.B0a(BEb);
                        byte[] BEa = r5[i].BEa();
                        BEa.getClass();
                        AnonymousClass6OZ r12 = this.A08;
                        r12.clear();
                        r12.A01(BEa.length);
                        r12.A01.put(BEa);
                        r12.A00();
                        C166547ys B1G = B0a.B1G(r12);
                        if (B1G != null) {
                            A0E(B1G, list);
                        }
                        i++;
                    }
                }
                list.add(r5[i]);
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6OG(Looper looper, C180698lU r5) {
        super(5);
        Handler handler;
        C187018wJ r2 = C187018wJ.A00;
        this.A09 = r5;
        if (looper == null) {
            handler = null;
        } else {
            handler = new Handler(looper, this);
        }
        this.A06 = handler;
        this.A07 = r2;
        this.A08 = new AnonymousClass6OZ();
        this.A0B = new C166547ys[5];
        this.A0A = new long[5];
    }

    public void A0B() {
        Arrays.fill(this.A0B, (Object) null);
        this.A01 = 0;
        this.A00 = 0;
        this.A03 = null;
    }

    public void A0C(long j, boolean z) {
        Arrays.fill(this.A0B, (Object) null);
        this.A01 = 0;
        this.A00 = 0;
        this.A04 = false;
        this.A05 = false;
    }

    public boolean BHW() {
        return this.A05;
    }

    public boolean BIe() {
        return true;
    }

    public void BjR(long j, long j2) {
        if (!this.A04 && this.A00 < 5) {
            AnonymousClass6OZ r7 = this.A08;
            r7.clear();
            C147807Fu r2 = this.A0A;
            r2.A01 = null;
            r2.A00 = null;
            int A052 = A05(r2, r7, false);
            if (A052 == -4) {
                if (C153567bZ.A00(r7)) {
                    this.A04 = true;
                } else {
                    r7.A00 = this.A02;
                    r7.A00();
                    C166547ys B1G = this.A03.B1G(r7);
                    if (B1G != null) {
                        ArrayList A0I = AnonymousClass002.A0I(B1G.A00.length);
                        A0E(B1G, A0I);
                        if (!A0I.isEmpty()) {
                            C166547ys r1 = new C166547ys((List) A0I);
                            int i = this.A01;
                            int i2 = this.A00;
                            int i3 = (i + i2) % 5;
                            this.A0B[i3] = r1;
                            this.A0A[i3] = r7.A00;
                            this.A00 = i2 + 1;
                        }
                    }
                }
            } else if (A052 == -5) {
                C166527yp r0 = r2.A00;
                r0.getClass();
                this.A02 = r0.A0J;
            }
        }
        int i4 = this.A00;
        if (i4 > 0) {
            long[] jArr = this.A0A;
            int i5 = this.A01;
            if (jArr[i5] <= j) {
                C166547ys[] r3 = this.A0B;
                C166547ys r22 = r3[i5];
                Handler handler = this.A06;
                if (handler != null) {
                    C18290x4.A1C(handler, r22, 0);
                } else {
                    this.A09.BWk(r22);
                }
                int i6 = this.A01;
                r3[i6] = null;
                this.A01 = (i6 + 1) % 5;
                i4 = this.A00 - 1;
                this.A00 = i4;
            }
        }
        if (this.A04 && i4 == 0) {
            this.A05 = true;
        }
    }

    public int BqO(C166527yp r3) {
        if (!this.A07.BqP(r3)) {
            return 0;
        }
        if (r3.A0N == null) {
            return 4;
        }
        return 2;
    }

    public String getName() {
        return "MetadataRenderer";
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            this.A09.BWk((C166547ys) message.obj);
            return true;
        }
        throw AnonymousClass6CA.A0O();
    }
}
