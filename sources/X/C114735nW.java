package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.5nW  reason: invalid class name and case insensitive filesystem */
public final class C114735nW implements AnonymousClass4EV {
    public final /* synthetic */ C30471mV A00;
    public final /* synthetic */ AnonymousClass5X9 A01;

    public void BRX(C625435m r6, C56902sk r7) {
        C30471mV r3;
        AnonymousClass33C r0;
        C162457s7.A0J(r6, 0);
        Log.i("statusdownload/status-completed");
        AnonymousClass5X9 r4 = this.A01;
        while (true) {
            ArrayList arrayList = r4.A04;
            r3 = null;
            if (arrayList.size() <= 0) {
                break;
            }
            Object remove = arrayList.remove(0);
            C162457s7.A0D(remove);
            r3 = (C30471mV) remove;
            C30471mV r02 = r4.A00;
            if ((r02 == null || !C162457s7.A0P(r3.A1J, r02.A1J)) && (r0 = r3.A01) != null && !r0.A0R) {
                break;
            }
        }
        r4.A00 = null;
        r4.A01 = null;
        C30471mV r2 = this.A00;
        ConcurrentHashMap concurrentHashMap = r4.A05;
        C101875Gp r03 = (C101875Gp) concurrentHashMap.get(r2);
        if (r03 != null) {
            r03.A00.A00 = r6;
            concurrentHashMap.remove(r2);
        }
        if (r3 != null) {
            int i = 0;
            if (AnonymousClass35Z.A01(r4.A02, r3)) {
                i = 3;
            }
            r4.A01(r3, i);
        }
    }

    public C114735nW(C30471mV r1, AnonymousClass5X9 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BRW(boolean z) {
        Log.i("statusdownload/status-cancelled");
        AnonymousClass5X9 r1 = this.A01;
        r1.A00 = null;
        r1.A01 = null;
        C30471mV r3 = this.A00;
        C625435m r2 = AnonymousClass5X9.A06;
        ConcurrentHashMap concurrentHashMap = r1.A05;
        C101875Gp r0 = (C101875Gp) concurrentHashMap.get(r3);
        if (r0 != null) {
            r0.A00.A00 = r2;
            concurrentHashMap.remove(r3);
        }
    }

    public /* synthetic */ void BRU(long j) {
    }
}
