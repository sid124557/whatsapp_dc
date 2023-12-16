package X;

import android.content.ContentValues;
import java.util.Map;
import java.util.concurrent.Future;

/* renamed from: X.2hO  reason: invalid class name and case insensitive filesystem */
public final class C49962hO {
    public final C56012rH A00;
    public final C55202py A01;
    public final AnonymousClass4FS A02;
    public final AnonymousClass2MX A03;
    public final C183538qC A04;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.content.Context r13, X.C30481mW r14, java.util.List r15) {
        /*
            r12 = this;
            r0 = 1
            r9 = r14
            X.C162457s7.A0J(r14, r0)
            r8 = r13
            boolean r0 = r13 instanceof android.app.Application
            r1 = r0 ^ 1
            java.lang.String r0 = "CrosspostTextStatusBurningManager/application context was passed in for scheduleTextStatusMediaPathUpdate"
            X.C626936e.A0E(r1, r0)
            r7 = r12
            X.2MX r1 = r12.A03
            java.lang.String r5 = X.AnonymousClass2z0.A06(r14)
            java.util.Map r4 = r1.A00
            boolean r0 = r4.containsKey(r5)
            if (r0 != 0) goto L_0x0044
            java.util.Set r0 = r1.A01
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x0030
            boolean r0 = r15 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0045
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L_0x0045
        L_0x0030:
            X.6bK r10 = new X.6bK
            r10.<init>()
            X.4FS r0 = r12.A02
            r11 = 26
            X.3ac r6 = new X.3ac
            r6.<init>(r7, r8, r9, r10, r11)
            r0.BkM(r6)
            r4.put(r5, r10)
        L_0x0044:
            return
        L_0x0045:
            java.util.Iterator r6 = r15.iterator()
        L_0x0049:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0030
            java.lang.Object r3 = r6.next()
            X.223 r3 = (X.AnonymousClass223) r3
            X.2rH r2 = r12.A00
            long r0 = r14.A1L
            java.lang.Integer r0 = r2.A00(r3, r0)
            if (r0 == 0) goto L_0x0044
            int r1 = r0.intValue()
            r0 = 4
            if (r0 != r1) goto L_0x0044
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49962hO.A00(android.content.Context, X.1mW, java.util.List):void");
    }

    public final void A01(C30481mW r10) {
        C162457s7.A0J(r10, 0);
        AnonymousClass2MX r8 = this.A03;
        String A06 = AnonymousClass2z0.A06(r10);
        Map map = r8.A00;
        Future future = (Future) map.get(A06);
        if (future != null) {
            String str = (String) future.get();
            C55202py r4 = this.A01;
            long j = r10.A1L;
            C18320x8.A1E(str);
            ContentValues A062 = AnonymousClass0x9.A06();
            A062.put("media_file_path", str);
            r4.A02(A062, C18280x3.A0j(j));
            map.remove(A06);
            r8.A01.add(A06);
        }
    }

    public C49962hO(C56012rH r1, C55202py r2, AnonymousClass4FS r3, AnonymousClass2MX r4, C183538qC r5) {
        C18260x0.A0f(r3, r2, r1, r4, r5);
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A04 = r5;
    }
}
