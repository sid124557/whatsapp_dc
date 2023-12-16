package X;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.ExecutionException;

/* renamed from: X.8BH  reason: invalid class name */
public final class AnonymousClass8BH implements C181148mE, OnFailureListener, OnSuccessListener {
    public int A00;
    public int A01;
    public int A02;
    public Exception A03;
    public boolean A04;
    public final int A05;
    public final AnonymousClass6YV A06;
    public final Object A07 = AnonymousClass002.A0D();

    public final void A00() {
        int i = this.A00;
        int i2 = this.A01;
        int i3 = i + i2 + this.A02;
        int i4 = this.A05;
        if (i3 == i4) {
            Exception exc = this.A03;
            if (exc != null) {
                AnonymousClass6YV r2 = this.A06;
                StringBuilder A0j = C18320x8.A0j(i2);
                A0j.append(" out of ");
                A0j.append(i4);
                r2.A03(new ExecutionException(AnonymousClass000.A0X(" underlying tasks failed", A0j), exc));
                return;
            }
            boolean z = this.A04;
            AnonymousClass6YV r1 = this.A06;
            if (z) {
                r1.A00();
            } else {
                r1.A04((Object) null);
            }
        }
    }

    public final void BOR() {
        synchronized (this.A07) {
            this.A02++;
            this.A04 = true;
            A00();
        }
    }

    public final void onFailure(Exception exc) {
        synchronized (this.A07) {
            this.A01++;
            this.A03 = exc;
            A00();
        }
    }

    public final void onSuccess(Object obj) {
        synchronized (this.A07) {
            this.A00++;
            A00();
        }
    }

    public AnonymousClass8BH(AnonymousClass6YV r2, int i) {
        this.A05 = i;
        this.A06 = r2;
    }
}
