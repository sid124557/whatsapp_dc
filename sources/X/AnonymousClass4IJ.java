package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob;
import com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob;
import com.whatsapp.jobqueue.job.SendLiveLocationKeyJob;
import java.util.concurrent.Callable;

/* renamed from: X.4IJ  reason: invalid class name */
public class AnonymousClass4IJ implements Callable {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4IJ(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final Object call() {
        int i = this.A02;
        Object obj = this.A00;
        switch (i) {
            case 0:
                return ((AnonymousClass312) obj).A02((DeviceJid) this.A01);
            case 1:
                return ((SendFinalLiveLocationNotificationJob) obj).A08((AnonymousClass1EU) this.A01);
            case 2:
                SendFinalLiveLocationRetryJob sendFinalLiveLocationRetryJob = (SendFinalLiveLocationRetryJob) obj;
                return C381025p.A01(AnonymousClass36G.A02(DeviceJid.getNullable(sendFinalLiveLocationRetryJob.rawDeviceJid)), sendFinalLiveLocationRetryJob.A02, ((AnonymousClass1EU) this.A01).A0F());
            case 3:
                return ((SendLiveLocationKeyJob) obj).A08((Jid) this.A01);
            default:
                return ((C621233o) obj).A07((AnonymousClass1EU) this.A01);
        }
    }
}
