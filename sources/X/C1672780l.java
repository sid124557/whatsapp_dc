package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.80l  reason: invalid class name and case insensitive filesystem */
public class C1672780l implements C186328v7 {
    public final C186328v7 A00;
    public final C166577yv A01;
    public final C155867fe A02;

    static {
        TimeUnit.MICROSECONDS.convert(2, TimeUnit.SECONDS);
    }

    public AnonymousClass7ZV B4U() {
        return this.A00.B4U();
    }

    public long B4a() {
        return this.A00.B4a();
    }

    public void BYk() {
        this.A00.BYk();
    }

    public void BZm() {
        this.A00.BZm();
    }

    public void Bcs() {
        this.A00.Bcs();
    }

    public void BeT(C166607yy r2, C187398x9[] r3, C187428xC[] r4) {
        this.A00.BeT(r2, r3, r4);
    }

    public boolean BkE() {
        return this.A00.BkE();
    }

    public void Bmr(long j, long j2) {
        this.A00.Bmr(j, j2);
    }

    public boolean Bo6(float f, long j, long j2, boolean z) {
        synchronized (this.A02) {
        }
        return this.A00.Bo6(f, j, j2, z);
    }

    public boolean BoZ(float f, long j, boolean z, boolean z2) {
        return this.A00.BoZ(f, j, z, z2);
    }

    public C1672780l(C186328v7 r2, C166577yv r3, C155867fe r4) {
        this.A00 = r2;
        if (r3.A0H != null) {
            this.A02 = r4;
            this.A01 = r3;
            return;
        }
        throw AnonymousClass001.A0c("video source has null video id");
    }
}
