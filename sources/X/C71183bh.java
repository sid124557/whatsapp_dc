package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jobqueue.job.SendPeerMessageJob;

/* renamed from: X.3bh  reason: invalid class name and case insensitive filesystem */
public class C71183bh implements Runnable {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public Object A0B;
    public boolean A0C;

    public final void run() {
        C43882Tv r2 = (C43882Tv) this.A02;
        AnonymousClass39T r1 = (AnonymousClass39T) this.A03;
        AnonymousClass2z0 r7 = (AnonymousClass2z0) this.A06;
        byte[] bArr = (byte[]) this.A07;
        int i = this.A01;
        byte[] bArr2 = (byte[]) this.A08;
        byte[] bArr3 = (byte[]) this.A09;
        C42612Ov r8 = (C42612Ov) this.A0A;
        C42612Ov r9 = (C42612Ov) this.A0B;
        boolean z = this.A0C;
        DeviceJid deviceJid = (DeviceJid) this.A04;
        int i2 = this.A00;
        C30301mE r0 = (C30301mE) this.A05;
        if (bArr2 == null || r9 == null || r8 == null || r2.A06.A0C(deviceJid, bArr3, bArr2, (byte) 5, 3)) {
            byte[] A002 = r2.A0A.A00(deviceJid, r7, r8, r9, bArr, bArr2, i, i2, z);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("PeerMessageRetryHandler/onPeerMessageDecryptionFailureRetry/sending retry for msg = ");
            A0o.append(r0);
            C18260x0.A1R(A0o, " device = ", deviceJid);
            r2.A01.A02(new SendPeerMessageJob(deviceJid, r0, A002, i));
        } else {
            C18260x0.A1Q(AnonymousClass001.A0o(), "PeerMessageRetryHandler/onPeerMessageDecryptionFailureRetry/adv validation fails, key=", r1);
        }
        r2.A09.A01(r1);
    }

    public C71183bh(DeviceJid deviceJid, C43882Tv r2, AnonymousClass2z0 r3, C42612Ov r4, C42612Ov r5, AnonymousClass39T r6, C30301mE r7, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, boolean z) {
        this.A02 = r2;
        this.A03 = r6;
        this.A06 = r3;
        this.A07 = bArr;
        this.A01 = i;
        this.A08 = bArr2;
        this.A09 = bArr3;
        this.A0A = r4;
        this.A0B = r5;
        this.A0C = z;
        this.A04 = deviceJid;
        this.A00 = i2;
        this.A05 = r7;
    }
}
