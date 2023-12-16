package X;

import com.whatsapp.util.Log;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.2a6  reason: invalid class name and case insensitive filesystem */
public class C45492a6 {
    public final C183538qC A00;
    public final C183538qC A01;
    public final AtomicLong A02 = new AtomicLong(-1);

    public long A00() {
        long mostSignificantBits;
        AtomicLong atomicLong = this.A02;
        long j = atomicLong.get();
        if (j == -1) {
            C183538qC r5 = this.A01;
            j = C18270x1.A05(r5).getLong("qpl_id", -1);
            if (j != -1) {
                atomicLong.set(j);
            } else {
                synchronized (C45492a6.class) {
                    if (atomicLong.get() != -1) {
                        mostSignificantBits = atomicLong.get();
                    } else {
                        mostSignificantBits = UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE;
                        Log.d("QplRuntimeImpl/getQplId created a new qpl-id");
                        atomicLong.set(mostSignificantBits);
                        C18260x0.A0M(C18320x8.A0J(r5), "qpl_id", mostSignificantBits);
                    }
                }
                return mostSignificantBits;
            }
        }
        return j;
    }

    public C45492a6(C183538qC r4, C183538qC r5) {
        this.A01 = r4;
        this.A00 = r5;
    }
}
