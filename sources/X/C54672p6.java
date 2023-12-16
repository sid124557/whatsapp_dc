package X;

import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2p6  reason: invalid class name and case insensitive filesystem */
public class C54672p6 {
    public AtomicInteger A00 = new AtomicInteger();
    public boolean A01 = false;
    public final C55682qk A02;
    public final AnonymousClass1VX A03;

    public synchronized void A00() {
        if (this.A00.addAndGet(1) > 15) {
            Log.i("Disable WATLS stack.");
            this.A01 = true;
        }
    }

    public synchronized boolean A01() {
        if (this.A01) {
            return false;
        }
        return this.A03.A0Y(C58422vE.A02, 48);
    }

    public C54672p6(C55682qk r2, AnonymousClass1VX r3) {
        this.A03 = r3;
        this.A02 = r2;
    }

    public boolean A02(Throwable th) {
        Throwable th2;
        String str;
        if (th.getMessage() == null || !th.getMessage().contains("WATLS Exception")) {
            return false;
        }
        if (th.getCause() != null) {
            th2 = th.getCause();
        } else {
            th2 = th;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        if (th.getMessage() != null) {
            str = AnonymousClass000.A0V(th.getMessage(), "\n", AnonymousClass001.A0o());
        } else {
            str = "";
        }
        A0o.append(str);
        C18320x8.A1N(A0o, th2);
        A0o.append("\n");
        this.A02.A0A("WATLS Exception", true, AnonymousClass000.A0X(C615631i.A00(th2), A0o));
        return true;
    }
}
