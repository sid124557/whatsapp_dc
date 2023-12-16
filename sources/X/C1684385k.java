package X;

import android.net.Uri;
import java.util.List;

/* renamed from: X.85k  reason: invalid class name and case insensitive filesystem */
public class C1684385k implements C186348v9 {
    public int A00;
    public long A01 = 0;
    public long A02;
    public C172258Kh A03;
    public C154787dk A04;
    public C186218uw A05;
    public AnonymousClass7QR A06;
    public C183838qk A07;
    public boolean A08;

    /* JADX INFO: finally extract failed */
    public final void A00() {
        if (!this.A08) {
            try {
                this.A05.Brb(this.A00, C172258Kh.A00(this.A03));
                C172258Kh r0 = this.A03;
                if (r0 != null) {
                    r0.close();
                    this.A03 = null;
                }
                this.A08 = true;
            } catch (Throwable th) {
                C172258Kh r02 = this.A03;
                if (r02 != null) {
                    r02.close();
                    this.A03 = null;
                }
                throw th;
            }
        }
    }

    public void AzQ(int i) {
        this.A00 = i;
        C153007aW A002 = this.A06.A05.A00(C142366x5.VIDEO, i);
        if (A002 != null) {
            List list = A002.A02;
            if (!AnonymousClass002.A0J(list).isEmpty()) {
                AnonymousClass002.A0J(list).get(0);
                AnonymousClass002.A0J(list).get(0);
                this.A02 = C1455676j.A00;
            }
        }
        this.A05 = this.A07.B0Z();
    }

    public long B6n() {
        return this.A01;
    }

    public C152527Zf B9T() {
        return null;
    }

    public boolean BHN() {
        return false;
    }

    public void cancel() {
    }

    public void release() {
        C186218uw r0 = this.A05;
        if (r0 != null) {
            r0.finish();
        }
        C172258Kh r02 = this.A03;
        if (r02 != null) {
            r02.close();
        }
    }

    public void start() {
        C172258Kh A002 = C154787dk.A00(Uri.fromFile(((C153257aw) AnonymousClass0x9.A0t(AnonymousClass002.A0J(this.A06.A05.A00(C142366x5.VIDEO, this.A00).A02))).A02));
        this.A03 = A002;
        if (A002 == null) {
            throw AnonymousClass002.A0C("Bitmap cannot be loaded");
        }
    }

    public C1684385k(C154787dk r3, AnonymousClass7QR r4, C183838qk r5) {
        if (!"PhotoDemuxDecodeWrapper".isEmpty()) {
            this.A00 = -1;
            this.A02 = C1455676j.A00;
            this.A04 = r3;
            this.A06 = r4;
            this.A07 = r5;
            return;
        }
        throw AnonymousClass001.A0c("callingClassName for the CallerContext cannot be null nor empty.");
    }

    public long B1I() {
        A00();
        long j = this.A01;
        this.A01 = this.A02 + j;
        return j;
    }

    public void B1J(long j) {
        A00();
        this.A01 = j;
    }

    public void Bl2(long j) {
        A00();
        this.A01 = j;
    }
}
