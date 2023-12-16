package X;

import android.content.Context;
import android.os.PowerManager;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jobqueue.job.SendPeerMessageJob;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.2gy  reason: invalid class name and case insensitive filesystem */
public class C49712gy {
    public C47282d0 A00;
    public final C55682qk A01;
    public final C54292oU A02;
    public final AnonymousClass1VX A03;
    public final C183538qC A04;

    public static void A00(C49712gy r3, DeviceJid deviceJid, C30301mE r5) {
        r3.A02(new SendPeerMessageJob(deviceJid, r5, (byte[]) null, 0));
    }

    public final synchronized C47282d0 A01() {
        C47282d0 r0;
        r0 = this.A00;
        if (r0 == null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("WaJobManager/start injected requirementProviders:");
            C183538qC r1 = this.A04;
            C18260x0.A0o(r1.get(), A0o);
            AnonymousClass7PJ r2 = new AnonymousClass7PJ(this.A02.A00);
            r2.A03 = "WhatsAppJobManager";
            r2.A04 = Arrays.asList((AnonymousClass4CA[]) ((Set) r1.get()).toArray(new AnonymousClass4CA[0]));
            r2.A02 = new AnonymousClass73V();
            AnonymousClass1VX r3 = this.A03;
            C58422vE r12 = C58422vE.A02;
            r2.A05 = r3.A0Y(r12, 476);
            r2.A01 = new C146907Cb(this);
            r2.A00 = r3.A0O(r12, 419);
            int A0O = r3.A0O(r12, 420);
            String str = r2.A03;
            if (str != null) {
                List list = r2.A04;
                if (list == null) {
                    list = AnonymousClass0x9.A18();
                    r2.A04 = list;
                }
                r0 = new C47282d0(r2.A06, r2.A01, r2.A02, str, list, r2.A00, A0O, r2.A05);
                this.A00 = r0;
            } else {
                throw AnonymousClass001.A0c("You must specify a name!");
            }
        }
        return r0;
    }

    public C49712gy(C55682qk r1, C54292oU r2, AnonymousClass1VX r3, C183538qC r4) {
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = r1;
        this.A04 = r4;
    }

    public void A02(Job job) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WaJobManager/add job: ");
        AnonymousClass000.A1A(job, A0o);
        AnonymousClass0x2.A18(A0o);
        C47282d0 A012 = A01();
        if (job.parameters.wakeLock) {
            Context context = A012.A01;
            String obj = job.toString();
            long j = job.parameters.wakeLockTimeout;
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, obj);
            if (j == 0) {
                newWakeLock.acquire();
            } else {
                newWakeLock.acquire(j);
            }
            job.A02 = newWakeLock;
        }
        C70163a3 r1 = new C70163a3(job, 20, A012);
        if (!A012.A00) {
            A012.A02.execute(r1);
        }
    }
}
