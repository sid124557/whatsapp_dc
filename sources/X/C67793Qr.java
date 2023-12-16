package X;

import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jobqueue.job.ReceiptMultiTargetProcessingJob;
import java.util.List;

/* renamed from: X.3Qr  reason: invalid class name and case insensitive filesystem */
public final class C67793Qr implements AnonymousClass4FR {
    public final int A00;
    public final Jid A01;
    public final AnonymousClass2z0 A02;
    public final AnonymousClass3ZC A03;
    public final AnonymousClass39T A04;
    public final List A05;
    public final boolean A06;

    public AnonymousClass2z0 BJV(int i) {
        return this.A02;
    }

    public DeviceJid BgX(int i) {
        return (DeviceJid) ((Pair) this.A05.get(i)).first;
    }

    public void Bkp(C49712gy r7, int i) {
        List list = this.A05;
        List subList = list.subList(i, list.size());
        AnonymousClass2z0 r2 = this.A02;
        r7.A02(new ReceiptMultiTargetProcessingJob(this.A01, r2, this.A03, subList, this.A00));
    }

    public long Bqj(int i) {
        return C18310x6.A0B(((Pair) this.A05.get(i)).second);
    }

    public int size() {
        return this.A05.size();
    }

    public C67793Qr(Jid jid, AnonymousClass2z0 r2, AnonymousClass3ZC r3, AnonymousClass39T r4, List list, int i, boolean z) {
        this.A02 = r2;
        this.A01 = jid;
        this.A00 = i;
        this.A05 = list;
        this.A04 = r4;
        this.A06 = z;
        this.A03 = r3;
    }

    public boolean BIF() {
        return this.A06;
    }

    public AnonymousClass3ZC BiQ() {
        return this.A03;
    }

    public Jid Bj1() {
        return this.A01;
    }

    public AnonymousClass39T BpU() {
        return this.A04;
    }

    public int Bq7() {
        return this.A00;
    }
}
