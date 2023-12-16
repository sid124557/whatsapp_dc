package X;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendRetryReceiptJob;

/* renamed from: X.2dH  reason: invalid class name and case insensitive filesystem */
public final class C47452dH {
    public final int A00;
    public final C29021i9 A01;
    public final C49712gy A02;
    public final C52852m9 A03;
    public final C47532dP A04;
    public final C46472bg A05;
    public final AnonymousClass4FY A06;
    public final C42612Ov A07;
    public final C42612Ov A08;
    public final boolean A09;
    public final byte[] A0A;
    public final byte[] A0B;

    public C47452dH(C29021i9 r2, C49712gy r3, C621133n r4, C52852m9 r5, C47532dP r6, C46472bg r7, AnonymousClass4FY r8, C42612Ov r9, C42612Ov r10, byte[] bArr, byte[] bArr2, boolean z) {
        this.A05 = r7;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r5;
        this.A04 = r6;
        this.A06 = r8;
        this.A00 = r4.A07.A01();
        this.A0B = bArr;
        this.A08 = r9;
        this.A07 = r10;
        this.A0A = bArr2;
        this.A09 = z;
    }

    public void A00(int i) {
        C52852m9 r4;
        int i2;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("need to send retry receipt; message.key=");
        AnonymousClass4FY r1 = this.A06;
        A0o.append(r1.B9a());
        A0o.append(" participant = ");
        C18260x0.A0o(r1.BAb(), A0o);
        r1.BnM(true);
        int i3 = this.A00;
        byte[] A012 = AnonymousClass36A.A01(i3);
        if (r1.BCI() > 1) {
            this.A01.A0B();
        }
        if (r1 instanceof AnonymousClass3ST) {
            AnonymousClass3ST r7 = (AnonymousClass3ST) r1;
            int i4 = r7.A01;
            if (i4 == 0) {
                if (r7.A00 == 0) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("recording local placeholder for retry receipt; message.key=");
                    C18260x0.A1L(A0o2, AnonymousClass3ST.A00(r7).toString());
                    r4 = this.A03;
                    i2 = 16;
                }
            } else if (i4 == 2) {
                r4 = this.A03;
                i2 = 17;
            }
            r4.A01(new C70113Zy(this, i2, r7), 50);
        }
        StringBuilder A0o3 = AnonymousClass001.A0o();
        AnonymousClass0x2.A17(r1, "axolotl sending retry receipt; message.key=", A0o3);
        C18260x0.A0y("; localRegistrationId=", A0o3, i3);
        int i5 = i;
        if (!this.A09) {
            C46472bg r0 = this.A05;
            Jid BC2 = r1.BC2();
            String id = r1.getId();
            Jid BAb = r1.BAb();
            UserJid BBz = r1.BBz();
            long BDj = r1.BDj();
            int BCI = r1.BCI() + 1;
            byte[] bArr = this.A0B;
            C42612Ov r8 = this.A08;
            C42612Ov r9 = this.A07;
            byte[] bArr2 = this.A0A;
            long B9D = r1.B9D();
            String B5K = r1.B5K();
            if (r0.A02.A06) {
                AnonymousClass2U5 r42 = new AnonymousClass2U5(BC2, BAb, BBz, r8, r9, id, B5K, A012, bArr, bArr2, (byte) 5, BCI, i5, BDj, B9D);
                AnonymousClass1VX r6 = r0.A03;
                C55682qk r5 = r0.A00;
                if (!(r6 == null || r5 == null)) {
                    AnonymousClass36N.A0A(r5, r6, "message", "retry-receipt", r42.A03, true);
                }
                Message obtain = Message.obtain((Handler) null, 0, 11, 0, r42);
                r0.A00(r42);
                r0.A04.A0J(obtain);
                return;
            }
            return;
        }
        this.A02.A02(new SendRetryReceiptJob(r1, i3, i5));
    }
}
