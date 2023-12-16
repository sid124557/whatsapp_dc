package X;

import com.whatsapp.R;
import java.util.Map;

/* renamed from: X.3CF  reason: invalid class name */
public class AnonymousClass3CF implements AnonymousClass8r1 {
    public final AnonymousClass2MR A00;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.AnonymousClass20B r9, java.lang.String r10, java.lang.String r11, java.util.Map r12) {
        /*
            r8 = this;
            X.2MR r4 = r8.A00
            monitor-enter(r4)
            java.util.Map r1 = r4.A00     // Catch:{ all -> 0x006f }
            java.lang.Object r5 = r1.get(r10)     // Catch:{ all -> 0x006f }
            X.2aK r5 = (X.C45632aK) r5     // Catch:{ all -> 0x006f }
            if (r5 != 0) goto L_0x0018
            X.4C1 r0 = r4.A01     // Catch:{ all -> 0x006f }
            java.lang.Object r5 = r0.get()     // Catch:{ all -> 0x006f }
            X.2aK r5 = (X.C45632aK) r5     // Catch:{ all -> 0x006f }
            r1.put(r10, r5)     // Catch:{ all -> 0x006f }
        L_0x0018:
            monitor-enter(r5)     // Catch:{ all -> 0x006f }
            int r1 = r9.ordinal()     // Catch:{ all -> 0x006c }
            r0 = 0
            if (r1 == r0) goto L_0x0055
            java.util.Map r0 = r5.A00     // Catch:{ all -> 0x006c }
        L_0x0022:
            r0.putAll(r12)     // Catch:{ all -> 0x006c }
        L_0x0025:
            java.util.Map r7 = r5.A00(r11)     // Catch:{ all -> 0x006c }
            java.util.Map r6 = r5.A02     // Catch:{ all -> 0x006c }
            java.lang.Object r0 = r6.get(r11)     // Catch:{ all -> 0x006c }
            X.0PJ r0 = (X.AnonymousClass0PJ) r0     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x0069
            java.lang.Object r3 = r0.A00     // Catch:{ all -> 0x006c }
            r3.getClass()     // Catch:{ all -> 0x006c }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x006c }
            java.lang.Object r2 = r0.A01     // Catch:{ all -> 0x006c }
            r2.getClass()     // Catch:{ all -> 0x006c }
            X.2MS r2 = (X.AnonymousClass2MS) r2     // Catch:{ all -> 0x006c }
            java.lang.ref.WeakReference r0 = r2.A01     // Catch:{ all -> 0x006c }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x006c }
            X.7oM r1 = (X.C160817oM) r1     // Catch:{ all -> 0x006c }
            if (r1 == 0) goto L_0x0066
            X.3Za r0 = r2.A00     // Catch:{ all -> 0x006c }
            boolean r0 = r0.A00     // Catch:{ all -> 0x006c }
            if (r0 != 0) goto L_0x0066
            r1.A0B(r3, r7)     // Catch:{ all -> 0x006c }
            goto L_0x0069
        L_0x0055:
            java.util.Map r1 = r5.A01     // Catch:{ all -> 0x006c }
            java.util.Map r0 = X.AnonymousClass0x9.A1B(r11, r1)     // Catch:{ all -> 0x006c }
            if (r0 != 0) goto L_0x0022
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x006c }
            r0.<init>(r12)     // Catch:{ all -> 0x006c }
            r1.put(r11, r0)     // Catch:{ all -> 0x006c }
            goto L_0x0025
        L_0x0066:
            r6.remove(r11)     // Catch:{ all -> 0x006c }
        L_0x0069:
            monitor-exit(r5)     // Catch:{ all -> 0x006f }
            monitor-exit(r4)
            return
        L_0x006c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x006f }
            throw r0     // Catch:{ all -> 0x006f }
        L_0x006f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3CF.A00(X.20B, java.lang.String, java.lang.String, java.util.Map):void");
    }

    public C147927Gg Bnh(C153427bI r8, C160817oM r9, C155007e8 r10, C156387gX r11, C151147Tp r12) {
        C147927Gg r1;
        Map map = r11.A02;
        if (map != null) {
            AnonymousClass2MQ r2 = (AnonymousClass2MQ) r8.A02.A00().get(R.id.bloks_data_module_namespace_manager);
            r2.getClass();
            if (!"fetch".equals(map.get("mode"))) {
                return new C147927Gg((Runnable) null, (Object) null);
            }
            AnonymousClass2MR r5 = this.A00;
            String str = r2.A00;
            String str2 = r2.A01;
            String str3 = r11.A00;
            synchronized (r5) {
                Map map2 = r5.A00;
                C45632aK r4 = (C45632aK) map2.get(str);
                if (r4 == null) {
                    r4 = (C45632aK) r5.A01.get();
                    map2.put(str, r4);
                }
                synchronized (r4) {
                    AnonymousClass2MS r3 = new AnonymousClass2MS(r9);
                    r4.A02.put(str2, AnonymousClass0x9.A0G(str3, r3));
                    r1 = new C147927Gg(r3.A00, r4.A00(str2));
                }
            }
            return r1;
        }
        throw AnonymousClass001.A0e("Manifest entry is null");
    }

    public AnonymousClass3CF(AnonymousClass2MR r1) {
        this.A00 = r1;
    }

    public void Bsd(C153427bI r1, C156387gX r2, C151147Tp r3, Object obj) {
    }
}
