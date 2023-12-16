package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1SZ  reason: invalid class name */
public class AnonymousClass1SZ extends AnonymousClass33W implements C85294Fr {
    public final long A00;
    public final C95814uZ A01;
    public final AnonymousClass2z0 A02;
    public final boolean A03;

    public AnonymousClass1SZ(AnonymousClass33J r12, C95814uZ r13, AnonymousClass2z0 r14, String str, long j, long j2, boolean z, boolean z2) {
        super(C60642yt.A03, r12, str, "regular_high", 3, j, z2);
        this.A02 = r14;
        this.A01 = r13;
        this.A03 = z;
        this.A00 = j2;
    }

    public /* synthetic */ C95814uZ getChatJid() {
        return AnonymousClass2z0.A01(this.A02);
    }

    public AnonymousClass18L A06() {
        AnonymousClass18L A06 = super.A06();
        C626936e.A06(A06);
        C130546c9 A0G = C21271Be.DEFAULT_INSTANCE.A0G();
        boolean z = this.A03;
        C21271Be r1 = (C21271Be) C18320x8.A0C(A0G);
        r1.bitField0_ |= 1;
        r1.deleteMedia_ = z;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.A00);
        C21271Be r12 = (C21271Be) C18320x8.A0C(A0G);
        r12.bitField0_ |= 2;
        r12.messageTimestamp_ = seconds;
        AnonymousClass1EO r13 = (AnonymousClass1EO) C18320x8.A0C(A06);
        C21271Be r0 = (C21271Be) A0G.A06();
        r0.getClass();
        r13.deleteMessageForMeAction_ = r0;
        r13.bitField0_ |= DefaultCrypto.BUFFER_SIZE;
        return A06;
    }

    public AnonymousClass2z0 B9a() {
        return this.A02;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass33W.A02(this, "DeleteMessageForMeMutation{rowId=", A0o);
        A0o.append(", key=");
        A0o.append(this.A02);
        A0o.append(", participant=");
        A0o.append(this.A01);
        A0o.append(", deleteMedia=");
        A0o.append(this.A03);
        A0o.append(", timestamp=");
        A0o.append(this.A04);
        A0o.append(", messageTimestamp=");
        AnonymousClass33W.A05(this, A0o, this.A00);
        return A0o.toString();
    }
}
