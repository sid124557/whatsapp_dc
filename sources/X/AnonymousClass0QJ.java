package X;

import android.os.Bundle;
import android.os.Environment;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.0QJ  reason: invalid class name */
public class AnonymousClass0QJ {
    public final C10240hc A00;
    public final AnonymousClass0F1 A01;
    public final AnonymousClass33p A02;
    public final AtomicLong A03 = new AtomicLong(0);
    public final AtomicLong A04 = new AtomicLong(0);
    public final AtomicLong A05 = new AtomicLong(0);
    public final AtomicLong A06 = new AtomicLong(0);
    public final AtomicLong A07 = new AtomicLong(0);

    public void A01(C17110ua r2) {
        this.A01.A06(r2);
        A03(r2);
    }

    public void A02(C17110ua r2) {
        this.A01.A07(r2);
    }

    public final void A03(C17110ua r9) {
        AnonymousClass33p r5 = this.A02;
        if (!C06540Yd.A0J(r5)) {
            C10240hc r1 = this.A00;
            if (!r1.A0b()) {
                if (r1.A0g() || C06540Yd.A0K(r5)) {
                    if (!r1.A0k()) {
                        int A08 = r1.A08();
                        long j = this.A04.get();
                        long j2 = this.A05.get();
                        if (A08 == 0) {
                            r9.BWH(j, j2);
                        } else {
                            r9.BWD(j, j2);
                        }
                    } else if (!r1.A0d()) {
                        r9.BWE(this.A04.get(), this.A05.get());
                    } else if (!r1.A0l()) {
                        boolean equals = "unmounted".equals(Environment.getExternalStorageState());
                        long j3 = this.A04.get();
                        long j4 = this.A05.get();
                        if (equals) {
                            r9.BWG(j3, j4);
                        } else {
                            r9.BWF(j3, j4);
                        }
                    } else {
                        AtomicLong atomicLong = this.A05;
                        if (atomicLong.get() > 0) {
                            r9.BWK(this.A04.get(), atomicLong.get());
                        } else {
                            r9.BWJ();
                        }
                    }
                    this.A01.A0J(r5.A07(), A00());
                    return;
                }
                if (C06540Yd.A0L(r5)) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("gdrive-service/observer/registered/error/");
                    Log.i(AnonymousClass000.A0X(AnonymousClass0YV.A02(r5.A07()), A0o));
                    return;
                }
                this.A01.A0I(r5.A07(), A00());
            }
        }
        C10240hc r12 = this.A00;
        if (!r12.A0i()) {
            int A072 = r12.A07();
            long j5 = this.A07.get();
            long j6 = this.A06.get();
            if (A072 == 0) {
                r9.BNO(j5, j6);
            } else {
                r9.BNK(j5, j6);
            }
        } else if (!r12.A0c()) {
            r9.BNL(this.A07.get(), this.A06.get());
        } else if (!r12.A0l()) {
            boolean equals2 = "unmounted".equals(Environment.getExternalStorageState());
            long j7 = this.A07.get();
            long j8 = this.A06.get();
            if (equals2) {
                r9.BNN(j7, j8);
            } else {
                r9.BNM(j7, j8);
            }
        } else {
            AtomicLong atomicLong2 = this.A06;
            if (atomicLong2.get() > 0) {
                r9.BNR(this.A07.get(), atomicLong2.get());
            } else if (C06540Yd.A0J(r5)) {
                r9.BNQ();
            } else {
                r9.Bax();
            }
        }
        this.A01.A0I(r5.A07(), A00());
    }

    public AnonymousClass0QJ(C10240hc r4, AnonymousClass0F1 r5, AnonymousClass33p r6) {
        this.A02 = r6;
        this.A00 = r4;
        this.A01 = r5;
    }

    public Bundle A00() {
        Bundle A08 = AnonymousClass002.A08();
        A08.putLong("total_bytes_to_be_downloaded", this.A05.get());
        A08.putLong("total_bytes_downloaded", this.A04.get());
        A08.putLong("total_bytes_to_be_uploaded", this.A06.get());
        return A08;
    }
}
