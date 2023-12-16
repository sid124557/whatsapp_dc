package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jobqueue.job.ReceiptProcessingJob;

/* renamed from: X.3Qs  reason: invalid class name and case insensitive filesystem */
public final class C67803Qs implements AnonymousClass4FR {
    public final int A00;
    public final long A01;
    public final DeviceJid A02;
    public final Jid A03;
    public final AnonymousClass3ZC A04;
    public final AnonymousClass39T A05;
    public final boolean A06;
    public final AnonymousClass2z0[] A07;

    public AnonymousClass2z0 BJV(int i) {
        return this.A07[i];
    }

    public DeviceJid BgX(int i) {
        return this.A02;
    }

    public void Bkp(C49712gy r9, int i) {
        AnonymousClass2z0[] r2 = this.A07;
        int length = r2.length - i;
        AnonymousClass2z0[] r4 = new AnonymousClass2z0[length];
        System.arraycopy(r2, i, r4, 0, length);
        Jid jid = this.A03;
        r9.A02(new ReceiptProcessingJob(this.A02, jid, this.A04, r4, this.A00, this.A01));
    }

    public long Bqj(int i) {
        return this.A01;
    }

    public int size() {
        return this.A07.length;
    }

    public C67803Qs(DeviceJid deviceJid, Jid jid, AnonymousClass3ZC r3, AnonymousClass39T r4, AnonymousClass2z0[] r5, int i, long j, boolean z) {
        this.A07 = r5;
        this.A03 = jid;
        this.A02 = deviceJid;
        this.A00 = i;
        this.A01 = j;
        this.A05 = r4;
        this.A06 = z;
        this.A04 = r3;
    }

    public boolean BIF() {
        return this.A06;
    }

    public AnonymousClass3ZC BiQ() {
        return this.A04;
    }

    public Jid Bj1() {
        return this.A03;
    }

    public AnonymousClass39T BpU() {
        return this.A05;
    }

    public int Bq7() {
        return this.A00;
    }
}
