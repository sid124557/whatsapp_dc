package X;

import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3Ck  reason: invalid class name and case insensitive filesystem */
public class C64163Ck implements AnonymousClass4F2 {
    public final C55682qk A00;
    public final C29411im A01;
    public final AnonymousClass2ZJ A02;
    public final AnonymousClass33p A03;
    public final AnonymousClass1VX A04;
    public final AnonymousClass31C A05;
    public final AtomicReference A06 = new AtomicReference();

    public void A00() {
        String str = (String) this.A06.getAndSet((Object) null);
        if (str != null) {
            A01(str);
        }
    }

    public void A01(String str) {
        if (!AnonymousClass000.A1U(this.A01.A04, 2)) {
            this.A06.set(str);
            return;
        }
        AnonymousClass31C r3 = this.A05;
        String A032 = r3.A03();
        try {
            C35711xJ r1 = new C35711xJ(new C35371wl(A032, 9), str, 8);
            r3.A0D(new AnonymousClass4KZ(this, r1, str, 1), r1.A00, A032, 314, 32000);
        } catch (IllegalArgumentException unused) {
            Log.e("ClientAuthTokenManager/failed to create request for auth_token");
        }
    }

    public C64163Ck(C55682qk r2, C29411im r3, AnonymousClass2ZJ r4, AnonymousClass33p r5, AnonymousClass1VX r6, AnonymousClass31C r7) {
        this.A04 = r6;
        this.A00 = r2;
        this.A05 = r7;
        this.A01 = r3;
        this.A03 = r5;
        this.A02 = r4;
    }

    public void BUB() {
        A00();
    }

    public /* synthetic */ void BUC() {
    }

    public /* synthetic */ void BUD() {
    }

    public /* synthetic */ void BUE() {
    }

    public /* synthetic */ void BUF() {
    }
}
