package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.99g  reason: invalid class name and case insensitive filesystem */
public class C1906499g extends AnonymousClass1g3 implements AnonymousClass4EV {
    public final AnonymousClass39R A00;
    public final AnonymousClass1VX A01;
    public final C620133d A02;
    public final C72183dJ A03 = new C72183dJ();
    public final File A04;

    public C1906499g(C69263Wi r10, C56492s4 r11, C56612sH r12, C61072zf r13, AnonymousClass39R r14, AnonymousClass1VX r15, C55002pd r16, C620133d r17, C29011i8 r18, File file) {
        super(r11, r12, r13, r15, r16, r18, r10.A08);
        this.A02 = r17;
        this.A01 = r15;
        this.A00 = r14;
        this.A04 = file;
    }

    public C56902sk A01(C625435m r2) {
        return new C56902sk();
    }

    public /* bridge */ /* synthetic */ Object A03() {
        String str = this.A00.A05;
        C626936e.A06(str);
        return new C156847hJ(C633138t.A0C, new AnonymousClass3UO(str), this.A04);
    }

    public void BRW(boolean z) {
        Log.d(AnonymousClass000.A0b("PaymentBackgroundAssetNetworkFetcher/cancelled transferred = ", AnonymousClass001.A0o(), z));
    }

    public void BRX(C625435m r3, C56902sk r4) {
        StringBuilder A0o = AnonymousClass001.A0o();
        C18270x1.A1H(A0o, "PaymentBackgroundAssetNetworkFetcher/completed result = ", r3);
        AnonymousClass0x2.A18(A0o);
    }

    public /* synthetic */ void BRU(long j) {
    }
}
