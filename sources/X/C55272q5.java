package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.2q5  reason: invalid class name and case insensitive filesystem */
public class C55272q5 {
    public final C54292oU A00;
    public final AnonymousClass3DM A01;
    public final C72303dV A02;

    public void A02() {
        synchronized (this) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("msgstore-manager/finish/db-is-ready ");
            C72303dV r1 = this.A02;
            C18260x0.A1V(A0o, C72303dV.A00(r1));
            if (!C72303dV.A00(r1)) {
                Log.w("msgstore-manager/finish/db is not ready yet", new Throwable());
            } else {
                r1.A08 = true;
            }
        }
    }

    public C59852xb A01() {
        C59852xb r1;
        C72303dV r3 = this.A02;
        r3.A05();
        ReentrantReadWriteLock.WriteLock writeLock = r3.A06;
        writeLock.lock();
        try {
            Log.i("msgstore-manager/initialize");
            synchronized (r3) {
                if (!r3.A09) {
                    r3.A06();
                    r3.A07();
                    r1 = new C59852xb(2);
                } else {
                    r1 = new C59852xb(0);
                }
            }
            writeLock.unlock();
            return r1;
        } catch (Throwable th) {
            writeLock.unlock();
            throw th;
        }
    }

    public void A03() {
        C72303dV r0 = this.A02;
        r0.A05();
        r0.A06();
    }

    public void A04() {
        C72303dV r0 = this.A02;
        r0.A05();
        r0.A04.A03 = true;
        A03();
        try {
            Context context = this.A00.A00;
            Intent A08 = AnonymousClass0x9.A08(context, Class.forName("com.whatsapp.Main"));
            A08.setFlags(268468224);
            context.startActivity(A08);
            this.A01.A03("MessageStoreLifecycleManager");
        } catch (ClassNotFoundException e) {
            Log.e((Throwable) e);
        }
    }

    public boolean A05() {
        return this.A02.A0A((C84474Cm) null, false);
    }

    public C55272q5(C54292oU r1, AnonymousClass3DM r2, C72303dV r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public static void A00(C56632sJ r0, Throwable th) {
        Log.e(th);
        r0.A03.A04();
    }
}
