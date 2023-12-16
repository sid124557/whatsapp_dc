package X;

import java.util.HashMap;

/* renamed from: X.3QI  reason: invalid class name */
public class AnonymousClass3QI implements AnonymousClass4EV {
    public final /* synthetic */ C620133d A00;
    public final /* synthetic */ String A01;

    public AnonymousClass3QI(C620133d r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public /* synthetic */ void BRU(long j) {
    }

    public void BRW(boolean z) {
        HashMap hashMap = this.A00.A0l;
        synchronized (hashMap) {
            hashMap.remove(this.A01);
        }
    }

    public void BRX(C625435m r3, C56902sk r4) {
        HashMap hashMap = this.A00.A0l;
        synchronized (hashMap) {
            hashMap.remove(this.A01);
        }
    }
}
