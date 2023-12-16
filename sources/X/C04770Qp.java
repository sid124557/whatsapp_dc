package X;

import android.os.Build;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0Qp  reason: invalid class name and case insensitive filesystem */
public abstract class C04770Qp {
    public C06250Wv A00;
    public UUID A01;
    public boolean A02;
    public final Set A03;

    public C04770Qp(Class cls) {
        UUID randomUUID = UUID.randomUUID();
        C162457s7.A0D(randomUUID);
        this.A01 = randomUUID;
        String obj = randomUUID.toString();
        C162457s7.A0D(obj);
        String name = cls.getName();
        C162457s7.A0D(name);
        AnonymousClass0GD r8 = AnonymousClass0GD.ENQUEUED;
        AnonymousClass0Xq r5 = AnonymousClass0Xq.A01;
        this.A00 = new C06250Wv(AnonymousClass0FN.EXPONENTIAL, AnonymousClass0XS.A08, r5, r5, AnonymousClass0FO.RUN_AS_NON_EXPEDITED_WORK_REQUEST, r8, obj, name, (String) null, 0, 0, 0, 0, 0, 0, C625635p.A0L, 0, 0, -1, false);
        this.A03 = C73833g9.A05(name);
    }

    public abstract AnonymousClass0NS A01();

    public void A02(long j, TimeUnit timeUnit) {
        C162457s7.A0J(timeUnit, 1);
        this.A00.A04 = timeUnit.toMillis(j);
        if (Long.MAX_VALUE - System.currentTimeMillis() <= this.A00.A04) {
            throw AnonymousClass001.A0c("The given initial delay is too large and will cause an overflow!");
        }
    }

    public final void A03(AnonymousClass0FN r4, TimeUnit timeUnit, long j) {
        C162457s7.A0J(r4, 0);
        C162457s7.A0J(timeUnit, 2);
        this.A02 = true;
        C06250Wv r2 = this.A00;
        r2.A09 = r4;
        r2.A03(timeUnit.toMillis(j));
    }

    public void A05(AnonymousClass0FO r3) {
        C162457s7.A0J(r3, 0);
        C06250Wv r1 = this.A00;
        r1.A0H = true;
        r1.A0D = r3;
    }

    public final void A06(String str) {
        C162457s7.A0J(str, 0);
        this.A03.add(str);
    }

    public final void A04(AnonymousClass0XS r2) {
        this.A00.A0A = r2;
    }

    public final void A07(UUID uuid) {
        UUID uuid2 = uuid;
        this.A01 = uuid2;
        String obj = uuid2.toString();
        C162457s7.A0D(obj);
        C06250Wv r13 = this.A00;
        String str = r13.A0G;
        AnonymousClass0GD r19 = r13.A0E;
        String str2 = r13.A0F;
        AnonymousClass0Xq r11 = new AnonymousClass0Xq(r13.A0B);
        AnonymousClass0Xq r10 = new AnonymousClass0Xq(r13.A0C);
        long j = r13.A04;
        long j2 = r13.A05;
        long j3 = r13.A03;
        AnonymousClass0XS r9 = new AnonymousClass0XS(r13.A0A);
        int i = r13.A01;
        AnonymousClass0FN r17 = r13.A09;
        long j4 = r13.A02;
        long j5 = r13.A06;
        long j6 = r13.A07;
        long j7 = r13.A08;
        boolean z = r13.A0H;
        this.A00 = new C06250Wv(r17, r9, r11, r10, r13.A0D, r19, obj, str, str2, i, r13.A00, 0, j, j2, j3, j4, j5, j6, j7, z);
    }

    public final AnonymousClass0NS A00() {
        boolean z;
        AnonymousClass0NS A012 = A01();
        AnonymousClass0XS r2 = this.A00.A0A;
        int i = Build.VERSION.SDK_INT;
        if ((i < 24 || !(!r2.A03.isEmpty())) && !r2.A04 && !r2.A05 && (i < 23 || !r2.A00())) {
            z = false;
        } else {
            z = true;
        }
        C06250Wv r1 = this.A00;
        if (r1.A0H) {
            if (!(!z)) {
                throw AnonymousClass001.A0c("Expedited jobs only support network and storage constraints");
            } else if (r1.A04 > 0) {
                throw AnonymousClass001.A0c("Expedited jobs cannot be delayed");
            }
        }
        UUID randomUUID = UUID.randomUUID();
        C162457s7.A0D(randomUUID);
        A07(randomUUID);
        return A012;
    }
}
