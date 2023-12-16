package X;

import android.os.SystemClock;
import java.io.IOException;

/* renamed from: X.82g  reason: invalid class name */
public final class AnonymousClass82g implements C187458xF {
    public long A00;
    public long A01;
    public long A02;
    public String A03;
    public boolean A04;
    public final /* synthetic */ C106075Xn A05;

    public AnonymousClass82g(C106075Xn r2) {
        this.A05 = r2;
        this.A03 = "";
    }

    public void BO0(C161387pX r22, Object obj, int i, boolean z) {
        Object obj2 = obj;
        if (z && (obj2 instanceof C09890gv)) {
            C09890gv r1 = (C09890gv) obj2;
            String str = r1.A0M.A07;
            C162457s7.A0D(str);
            this.A03 = str;
            boolean z2 = r1.A0S;
            this.A04 = z2;
            long j = r1.A03;
            this.A02 = j;
            long j2 = this.A00 + ((long) i);
            this.A00 = j2;
            long j3 = this.A01;
            if (j3 > 0 && j2 >= 131072) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j4 = elapsedRealtime - j3;
                this.A01 = elapsedRealtime;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("CompositeHeroPlayer - onBytesTransferred() - videoId: ");
                A0o.append(str);
                A0o.append(", isPrefetch: ");
                A0o.append(z2);
                A0o.append(", totalMediaBytes: ");
                A0o.append(j);
                A0o.append(", fetchedTimeMs: ");
                A0o.append(j4);
                C18260x0.A10(", bytesTransferredToReport: ", A0o, j2);
                for (AnonymousClass7RZ A002 : this.A05.A0D) {
                    A002.A00(this.A03, "", j4, this.A00, this.A02, this.A04);
                }
                this.A00 = 0;
            }
        }
    }

    public void BUa(C142646xX r1) {
    }

    public void BUb() {
    }

    public void BeW() {
    }

    public void BeX(C161387pX r13, Object obj, boolean z) {
        if (z && (obj instanceof C09890gv)) {
            C09890gv r14 = (C09890gv) obj;
            String str = r14.A0M.A07;
            C162457s7.A0D(str);
            this.A03 = str;
            this.A04 = r14.A0S;
            this.A02 = r14.A03;
            long j = this.A01;
            if (j > 0 && this.A00 > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - j;
                for (AnonymousClass7RZ A002 : this.A05.A0D) {
                    A002.A00(this.A03, "", elapsedRealtime, this.A00, this.A02, this.A04);
                }
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("CompositeHeroPlayer - onTransferEnd() - videoId: ");
            A0o.append(this.A03);
            A0o.append(", isPrefetch: ");
            A0o.append(this.A04);
            A0o.append(", totalMediaBytes: ");
            A0o.append(this.A02);
            A0o.append(", bytesTransferredToReport: ");
            A0o.append(this.A00);
            AnonymousClass0x2.A18(A0o);
        }
    }

    public void Beb(C161387pX r7, Object obj, boolean z, boolean z2) {
        if (z && (obj instanceof C09890gv)) {
            C09890gv r8 = (C09890gv) obj;
            String str = r8.A0M.A07;
            C162457s7.A0D(str);
            this.A03 = str;
            boolean z3 = r8.A0S;
            this.A04 = z3;
            long j = r8.A03;
            this.A02 = j;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("CompositeHeroPlayer - onTransferStart() - videoId: ");
            A0o.append(str);
            A0o.append(", isPrefetch: ");
            A0o.append(z3);
            C18260x0.A10(", totalMediaBytes: ", A0o, j);
            this.A01 = SystemClock.elapsedRealtime();
            this.A00 = 0;
        }
    }

    public void Bm1(long j) {
    }

    public void BTa(long j, long j2) {
    }

    public void BeY(IOException iOException) {
        C18260x0.A1P(AnonymousClass001.A0o(), "CompositeHeroPlayer - onTransferError() - exception: ", iOException);
        for (AnonymousClass7RZ A002 : this.A05.A0D) {
            A002.A00(this.A03, String.valueOf(iOException), 0, 0, this.A02, this.A04);
        }
    }

    public void BeZ(String str, Object obj) {
    }

    public void Bea(C161387pX r1, C142646xX r2) {
    }

    public void BTZ(C142646xX r1, long j, long j2, long j3) {
    }

    public AnonymousClass82g() {
    }
}
