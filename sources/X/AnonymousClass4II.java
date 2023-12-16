package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendLiveLocationKeyJob;
import com.whatsapp.jobqueue.job.SendPeerMessageJob;
import java.util.concurrent.Callable;

/* renamed from: X.4II  reason: invalid class name */
public class AnonymousClass4II implements Callable {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass4II(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    public final Object call() {
        switch (this.A03) {
            case 0:
                DeviceJid deviceJid = (DeviceJid) this.A01;
                C621133n r2 = ((C56222rd) this.A00).A07;
                C626936e.A0D(r2.A0Z(AnonymousClass36G.A02(deviceJid)), "no session with deviceJid");
                return C381025p.A01(AnonymousClass36G.A02(deviceJid), r2, ((AnonymousClass1EU) this.A02).A0F());
            case 1:
                ((C66543Lv) this.A00).A0B.A03(((AnonymousClass33C) this.A01).A0F, ((C624134x) this.A02).A1I);
                return Boolean.TRUE;
            case 2:
                return C381025p.A01(AnonymousClass36G.A02(C618932r.A00((UserJid) this.A02)), ((SendLiveLocationKeyJob) this.A00).A02, ((AnonymousClass1EU) this.A01).A0F());
            default:
                return C381025p.A01(AnonymousClass36G.A02((DeviceJid) this.A01), ((SendPeerMessageJob) this.A00).A03, (byte[]) this.A02);
        }
    }
}
