package X;

import android.media.MediaFormat;

/* renamed from: X.85c  reason: invalid class name and case insensitive filesystem */
public class C1683585c implements C186208uv {
    public int A00;
    public boolean A01;
    public final C140276tT A02;
    public final C186208uv A03;

    public void AzR(String str) {
        this.A03.AzR(this.A02.getCanonicalPath());
    }

    public boolean BJ1() {
        return this.A01;
    }

    public void Bll(MediaFormat mediaFormat) {
        this.A03.Bll(mediaFormat);
    }

    public void Bml(int i) {
        this.A03.Bml(i);
    }

    public void Bnl(MediaFormat mediaFormat) {
        this.A03.Bnl(mediaFormat);
    }

    public void Bse(C184848se r2) {
        this.A03.Bse(r2);
        this.A00++;
    }

    public void Bsl(C184848se r2) {
        this.A03.Bsl(r2);
        this.A00++;
    }

    public void start() {
        this.A03.start();
        this.A01 = true;
    }

    public void stop() {
        this.A03.stop();
        this.A01 = false;
        this.A02.A00();
    }

    public C1683585c(C140276tT r1, C186208uv r2) {
        this.A03 = r2;
        this.A02 = r1;
    }
}
