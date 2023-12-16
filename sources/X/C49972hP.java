package X;

import android.app.Application;
import android.content.ContentValues;
import android.content.Context;
import java.util.Map;
import java.util.concurrent.Future;

/* renamed from: X.2hP  reason: invalid class name and case insensitive filesystem */
public final class C49972hP {
    public final C54592oy A00;
    public final AnonymousClass30J A01;
    public final AnonymousClass4FS A02;
    public final C41972Mh A03;
    public final C183538qC A04;

    public final void A00(Context context, C30481mW r14) {
        Integer num;
        C30481mW r9 = r14;
        C162457s7.A0J(r14, 1);
        Context context2 = context;
        C626936e.A0E(!(context instanceof Application), "XFamilyTextStatusBurningManager/application context was passed in for scheduleTextStatusMediaPathUpdate");
        C41972Mh r1 = this.A03;
        String A06 = AnonymousClass2z0.A06(r14);
        Map map = r1.A00;
        if (!map.containsKey(A06)) {
            if (r1.A01.contains(A06)) {
                C54592oy r0 = this.A00;
                long j = r14.A1L;
                r0.A01();
                C10550i7 r3 = r0.A00;
                synchronized (r3) {
                    num = (Integer) r3.A05(j, (Object) null);
                }
                if (num == null || 4 != num.intValue()) {
                    return;
                }
            }
            C130066bK r10 = new C130066bK();
            this.A02.BkM(new C70513ac(this, context2, r9, r10, 30));
            map.put(A06, r10);
        }
    }

    public final void A01(C30481mW r10) {
        C162457s7.A0J(r10, 0);
        C41972Mh r8 = this.A03;
        String A06 = AnonymousClass2z0.A06(r10);
        Map map = r8.A00;
        Future future = (Future) map.get(A06);
        if (future != null) {
            String str = (String) future.get();
            AnonymousClass30J r4 = this.A01;
            long j = r10.A1L;
            C162457s7.A0H(str);
            C162457s7.A0J(str, 1);
            ContentValues A062 = AnonymousClass0x9.A06();
            A062.put("media_path", str);
            r4.A02(A062, C18280x3.A0j(j));
            map.remove(A06);
            r8.A01.add(A06);
        }
    }

    public C49972hP(C54592oy r1, AnonymousClass30J r2, AnonymousClass4FS r3, C41972Mh r4, C183538qC r5) {
        C18260x0.A0f(r3, r5, r2, r1, r4);
        this.A02 = r3;
        this.A04 = r5;
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
    }
}
