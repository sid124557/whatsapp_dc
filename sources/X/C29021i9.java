package X;

import android.os.SystemClock;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1i9  reason: invalid class name and case insensitive filesystem */
public class C29021i9 extends C61102zi implements AnonymousClass485 {
    public long A00 = 0;
    public long A01 = 0;
    public boolean A02;
    public boolean A03;
    public C42612Ov[] A04;
    public final C116985rC A05;
    public final C116985rC A06;
    public final C116985rC A07;
    public final C69263Wi A08;
    public final C56972sr A09;
    public final C29411im A0A;
    public final C46642by A0B;
    public final C56612sH A0C;
    public final AnonymousClass33p A0D;
    public final C621133n A0E;
    public final C48972fm A0F;
    public final C614730x A0G;
    public final AnonymousClass31C A0H;
    public final C54832pM A0I = new C54832pM(10, 610);
    public final AnonymousClass4FS A0J;

    public synchronized void A0A() {
        this.A00 = 0;
    }

    public synchronized void A0B() {
        if (this.A0A.A06) {
            long j = this.A00;
            if (j == 0 || C18310x6.A0A(j) > 60000) {
                this.A0H.A0J(AnonymousClass0x7.A0G(88));
                this.A00 = SystemClock.uptimeMillis();
            }
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MyPreKeysManager/send-get-pre-key-digest/skip-digest-check last:");
        C18260x0.A1I(A0o, this.A00);
    }

    public synchronized void A0C() {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.A0A.A06) {
            long j = this.A01;
            if (j == 0 || uptimeMillis - j > 180000) {
                A0E(uptimeMillis);
                A0F(true);
            }
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MyPreKeysManager/sendSetPreKey/skip last:");
        C18260x0.A1I(A0o, this.A01);
    }

    public final synchronized void A0D() {
        if (this.A03) {
            this.A03 = false;
            this.A0I.A02();
        }
    }

    public final synchronized void A0E(long j) {
        this.A01 = j;
    }

    public void A08() {
        C73523fe A032 = this.A0G.A03();
        try {
            this.A0E.A0K();
            A0C();
            if (A032 != null) {
                A032.close();
            }
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A09() {
        if (this.A0D.A2K()) {
            C48972fm r2 = this.A0F;
            r2.A00.submit(new C117645sG((Object) this, 48)).get();
        }
    }

    public final void A0F(boolean z) {
        C73523fe A032 = this.A0G.A03();
        try {
            C621133n r3 = this.A0E;
            int A012 = r3.A07.A01();
            byte[] A0d = r3.A0d();
            C73523fe A033 = r3.A0K.A03();
            try {
                List<AnonymousClass2JO> A013 = r3.A00.A02.A04.A01();
                ArrayList A0s = AnonymousClass001.A0s();
                for (AnonymousClass2JO r7 : A013) {
                    int i = r7.A00;
                    byte[] A002 = new C59162wS(r7.A01).A00().A01.A00();
                    int length = A002.length - 1;
                    byte[] bArr = new byte[length];
                    System.arraycopy(A002, 1, bArr, 0, length);
                    A0s.add(new C42612Ov(AnonymousClass36A.A02(i), bArr, (byte[]) null));
                }
                StringBuilder A0o = AnonymousClass001.A0o();
                C18260x0.A19("axolotl reporting back ", A0o, A0s);
                C18260x0.A1L(A0o, " prekeys for sending to the server");
                C42612Ov[] r1 = (C42612Ov[]) A0s.toArray(new C42612Ov[0]);
                if (A033 != null) {
                    A033.close();
                }
                C42612Ov A0D2 = r3.A0D();
                this.A08.A0S(new C70773b2(this, AnonymousClass36A.A01(A012), r1, A0D2, A0d, 2, z));
                if (A032 != null) {
                    A032.close();
                }
            } catch (IOException e) {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("error reading prekey ");
                A0o2.append(r7.A00);
                C18280x3.A1C(A0o2, e);
            } catch (Throwable th) {
                if (A033 != null) {
                    A033.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (A032 != null) {
                try {
                    A032.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
            throw th2;
        }
    }

    public C29021i9(C116985rC r6, C116985rC r7, C116985rC r8, C69263Wi r9, C56972sr r10, C29411im r11, C46642by r12, C56612sH r13, AnonymousClass33p r14, C621133n r15, C48972fm r16, C614730x r17, AnonymousClass31C r18, AnonymousClass4FS r19) {
        this.A0C = r13;
        this.A08 = r9;
        this.A09 = r10;
        this.A0J = r19;
        this.A0G = r17;
        this.A0H = r18;
        this.A0F = r16;
        this.A0A = r11;
        this.A0E = r15;
        this.A0D = r14;
        this.A05 = r6;
        this.A07 = r7;
        this.A0B = r12;
        this.A06 = r8;
    }
}
