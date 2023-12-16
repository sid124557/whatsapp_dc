package X;

import com.whatsapp.jobqueue.job.DeleteAccountFromHsmServerJob;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3Tp  reason: invalid class name and case insensitive filesystem */
public class C68553Tp implements C188058yF {
    public final /* synthetic */ DeleteAccountFromHsmServerJob A00;
    public final /* synthetic */ AtomicInteger A01;

    public C68553Tp(DeleteAccountFromHsmServerJob deleteAccountFromHsmServerJob, AtomicInteger atomicInteger) {
        this.A00 = deleteAccountFromHsmServerJob;
        this.A01 = atomicInteger;
    }

    public void onSuccess() {
        Log.i("DeleteAccountFromHsmServerJob/job successful");
    }

    public void BSG(String str, int i, int i2) {
        C18260x0.A0x("DeleteAccountFromHsmServerJob/job unsuccessful with error code: ", AnonymousClass001.A0o(), i);
        this.A01.set(i);
    }
}
