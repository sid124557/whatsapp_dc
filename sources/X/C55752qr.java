package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2qr  reason: invalid class name and case insensitive filesystem */
public final class C55752qr {
    public final C380625j A00;
    public final AnonymousClass1VX A01;
    public final C174218Tk A02 = new C174218Tk(5);

    public void A02(C43072Qq r6, UserJid userJid, boolean z) {
        synchronized (this) {
            Log.d("WACC CategoryCacheManager putCategory");
            String str = r6.A01;
            C162457s7.A0C(str);
            C41322Ju A002 = A00(userJid);
            if (z) {
                Log.d("WACC CategoryCacheManager getCategory");
                C43072Qq r0 = (C43072Qq) A00(userJid).A01.get("catalog_category_dummy_root_id");
                if (r0 != null) {
                    r0.A03.add(str);
                }
            }
            A002.A01.put(str, r6);
        }
    }

    public void A03(C64553Dy r8, UserJid userJid, boolean z) {
        C162457s7.A0J(userJid, 2);
        synchronized (this) {
            Log.d("WACC CategoryCacheManager putGetCategoriesResponse");
            for (Object next : r8.A01) {
                C162457s7.A0D(next);
                AnonymousClass2XS r0 = (AnonymousClass2XS) next;
                C43072Qq r4 = r0.A00;
                List list = r4.A03;
                list.clear();
                for (Object next2 : r0.A01) {
                    C162457s7.A0D(next2);
                    C43072Qq r1 = (C43072Qq) next2;
                    list.add(r1.A01);
                    A02(r1, userJid, false);
                }
                A02(r4, userJid, z);
            }
        }
    }

    public void A04(UserJid userJid) {
        C162457s7.A0J(userJid, 0);
        synchronized (this) {
            Log.d("WACC CategoryCacheManager removeCategoryCache");
            this.A02.remove(userJid);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006c, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A05(com.whatsapp.jid.UserJid r12, java.lang.String r13) {
        /*
            r11 = this;
            r10 = r11
            r9 = 0
            X.C18270x1.A14(r13, r12)
            monitor-enter(r10)
            java.lang.String r0 = "WACC CategoryCacheManager hasSubCategories"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x006f }
            java.lang.String r0 = "catalog_category_dummy_root_id"
            boolean r0 = r0.equals(r13)     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x0048
            X.1VX r3 = r11.A01     // Catch:{ all -> 0x006f }
            r1 = 2080(0x820, float:2.915E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ all -> 0x006f }
            boolean r0 = r3.A0Y(r0, r1)     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x0048
            X.8Tk r7 = r11.A02     // Catch:{ all -> 0x006f }
            java.lang.Object r8 = r7.get(r12)     // Catch:{ all -> 0x006f }
            X.2Ju r8 = (X.C41322Ju) r8     // Catch:{ all -> 0x006f }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.HOURS     // Catch:{ all -> 0x006f }
            r0 = 2081(0x821, float:2.916E-42)
            long r0 = X.C56952sp.A06(r3, r0)     // Catch:{ all -> 0x006f }
            long r5 = r2.toMillis(r0)     // Catch:{ all -> 0x006f }
            if (r8 == 0) goto L_0x0048
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x006f }
            long r1 = r8.A00     // Catch:{ all -> 0x006f }
            long r1 = r1 + r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0048
            java.lang.String r0 = "WACC CategoryCacheManager invalidateCategoryCache on expiry time elapsed"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x006f }
            r7.remove(r12)     // Catch:{ all -> 0x006f }
        L_0x0048:
            java.lang.String r0 = "WACC CategoryCacheManager getCategory"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x006d }
            X.2Ju r0 = r11.A00(r12)     // Catch:{ all -> 0x006d }
            java.util.Map r0 = r0.A01     // Catch:{ all -> 0x006d }
            java.lang.Object r2 = r0.get(r13)     // Catch:{ all -> 0x006d }
            X.2Qq r2 = (X.C43072Qq) r2     // Catch:{ all -> 0x006d }
            r1 = 0
            if (r2 != 0) goto L_0x005e
            monitor-exit(r10)
            return r9
        L_0x005e:
            boolean r0 = r2.A04     // Catch:{ all -> 0x006f }
            if (r0 != 0) goto L_0x006b
            java.util.List r0 = r2.A03     // Catch:{ all -> 0x006f }
            boolean r0 = X.C18310x6.A1X(r0)     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x006b
            r1 = 1
        L_0x006b:
            monitor-exit(r10)
            return r1
        L_0x006d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x006f }
        L_0x006f:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55752qr.A05(com.whatsapp.jid.UserJid, java.lang.String):boolean");
    }

    public final C41322Ju A00(UserJid userJid) {
        C174218Tk r3 = this.A02;
        UserJid userJid2 = userJid;
        C41322Ju r2 = (C41322Ju) r3.get(userJid2);
        if (r2 != null) {
            return r2;
        }
        Log.d("WACC CategoryCacheManager getOrCreateCategoryCache: init root level category");
        C41322Ju r22 = new C41322Ju(System.currentTimeMillis());
        r22.A01.put("catalog_category_dummy_root_id", new C43072Qq(new C108815db("catalog_category_dummy_root_id", (String) null, (String) null, 0, 0), "catalog_category_dummy_root_id", "root", AnonymousClass001.A0s(), false));
        r3.put(userJid2, r22);
        return r22;
    }

    public C55752qr(C380625j r3, AnonymousClass1VX r4) {
        C18260x0.A0Q(r3, r4);
        this.A00 = r3;
        this.A01 = r4;
    }

    public List A01(UserJid userJid, String str) {
        ArrayList A0s;
        C18260x0.A0O(str, userJid);
        synchronized (this) {
            Log.d("WACC CategoryCacheManager getSubCategories");
            Map map = A00(userJid).A01;
            C43072Qq r1 = (C43072Qq) map.get(str);
            A0s = AnonymousClass001.A0s();
            if (r1 != null && !r1.A04) {
                Iterator it = r1.A03.iterator();
                while (it.hasNext()) {
                    C43072Qq r0 = (C43072Qq) map.get(AnonymousClass001.A0m(it));
                    if (r0 != null) {
                        Log.d("WACC CategoryCacheManager getSubCategories");
                        A0s.add(r0);
                    }
                }
            }
        }
        return A0s;
    }
}
