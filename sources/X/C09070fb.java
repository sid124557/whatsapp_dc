package X;

import android.content.Context;
import android.os.PowerManager;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.0fb  reason: invalid class name and case insensitive filesystem */
public class C09070fb implements C16740tt, C15420rJ {
    public static final String A0C = C06240Wu.A01("DelayMetCommandHandler");
    public int A00 = 0;
    public PowerManager.WakeLock A01;
    public boolean A02 = false;
    public final int A03;
    public final Context A04;
    public final C03440Kd A05;
    public final C09000fU A06;
    public final C09080fc A07;
    public final AnonymousClass0PL A08;
    public final Object A09 = AnonymousClass002.A0D();
    public final Executor A0A;
    public final Executor A0B;

    public final void A00() {
        synchronized (this.A09) {
            this.A07.reset();
            C05410Tf r0 = this.A06.A07;
            AnonymousClass0PL r4 = this.A08;
            r0.A00(r4);
            PowerManager.WakeLock wakeLock = this.A01;
            if (wakeLock != null && wakeLock.isHeld()) {
                C06240Wu A002 = C06240Wu.A00();
                String str = A0C;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Releasing wakelock ");
                A0o.append(this.A01);
                C06240Wu.A02(A002, r4, "for WorkSpec ", str, A0o);
                this.A01.release();
            }
        }
    }

    public void BMM(List list) {
        this.A0B.execute(new C11130j9(this));
    }

    public C09070fb(Context context, C03440Kd r5, C09000fU r6, int i) {
        this.A04 = context;
        this.A03 = i;
        this.A06 = r6;
        this.A08 = r5.A00;
        this.A05 = r5;
        AnonymousClass0TH r2 = r6.A05.A09;
        C09160fk r1 = (C09160fk) r6.A08;
        this.A0B = r1.A01;
        this.A0A = r1.A02;
        this.A07 = new C09080fc(this, r2);
    }

    public void BML(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (AnonymousClass0J0.A00((C06250Wv) it.next()).equals(this.A08)) {
                this.A0B.execute(new C11140jA(this));
                return;
            }
        }
    }
}
