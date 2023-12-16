package X;

import android.text.TextUtils;
import com.whatsapp.Me;
import java.math.BigDecimal;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* renamed from: X.7ae  reason: invalid class name and case insensitive filesystem */
public class C153087ae {
    public C161357pU A00;
    public boolean A01;
    public final C56972sr A02;
    public final C617332a A03;
    public final AnonymousClass1VX A04;
    public final C85134Fb A05;
    public final C385127z A06;
    public final C160757oG A07 = C160757oG.A00("PaymentsCountryManager", "infra", "COMMON");

    public synchronized C85204Fi A01() {
        C85204Fi r0;
        if (!this.A01) {
            A03();
        }
        C161357pU r02 = this.A00;
        if (r02 != null) {
            r0 = r02.A02;
        } else {
            r0 = null;
        }
        return r0;
    }

    public synchronized C161357pU A02() {
        if (!this.A01) {
            A03();
        }
        return this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        if (r1 == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A04() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.A01     // Catch:{ all -> 0x0014 }
            if (r0 != 0) goto L_0x0008
            r2.A03()     // Catch:{ all -> 0x0014 }
        L_0x0008:
            X.7pU r0 = r2.A00     // Catch:{ all -> 0x0014 }
            if (r0 == 0) goto L_0x0011
            boolean r1 = r0.A06     // Catch:{ all -> 0x0014 }
            r0 = 1
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            monitor-exit(r2)
            return r0
        L_0x0014:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153087ae.A04():boolean");
    }

    public static void A00(String str, String str2, AbstractMap abstractMap, int i) {
        abstractMap.put(str, new AnonymousClass1S3(str, str2, "@", "@", BigDecimal.valueOf(10000000), AnonymousClass1S3.A07, 0, 100, i, 55));
    }

    public final synchronized void A03() {
        String str;
        String str2;
        String A002;
        String[] strArr;
        synchronized (this) {
            C160757oG r2 = this.A07;
            r2.A03((String) null, "tryInitFromMock: no mockedCountry");
            C56972sr r5 = this.A02;
            r5.A0P();
            Me me = r5.A00;
            if (me != null) {
                str = me.number;
                str2 = me.cc;
            } else {
                str = null;
                str2 = null;
            }
            r5.A0P();
            if (r5.A05 == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("phoneNumber:");
                A0o.append(str);
                r2.A06(AnonymousClass000.A0V(" countryCode:", str2, A0o));
            } else {
                C161357pU A012 = C161357pU.A01(str2);
                C161357pU r0 = C161357pU.A0G;
                if (A012 == r0) {
                    if (!(str2 == null || (A002 = C106675Zy.A00(str2)) == null || (strArr = (String[]) AnonymousClass797.A00.A01(A002)) == null || strArr.length <= 0)) {
                        String str3 = strArr[0];
                        HashMap hashMap = C155067eE.A00;
                        if (hashMap.isEmpty()) {
                            hashMap.put("USD", new AnonymousClass1S3("USD", "$", "D", "d", BigDecimal.valueOf(10000000), AnonymousClass1S3.A07, 0, 100, 2, 55));
                            A00("PEN", "S/", hashMap, 2);
                            A00("MXN", "Mex$", hashMap, 2);
                            A00("COP", "Col$", hashMap, 2);
                            A00("ARS", "Arg$", hashMap, 2);
                            A00("CLP", "$", hashMap, 0);
                            A00("IDR", "Rp", hashMap, 2);
                            A00("ILS", "₪", hashMap, 2);
                            A00("AED", "د.إ", hashMap, 2);
                            A00("TRY", "₺", hashMap, 2);
                            A00("HKD", "HK$", hashMap, 2);
                        }
                        if (hashMap.containsKey(str3)) {
                            C85204Fi r12 = (C85204Fi) hashMap.get(str3);
                            A012 = new C161357pU(r12, A002, str2, new LinkedHashSet(Collections.singletonList(r12)), (int[]) null, (int[]) null, (C151007Tb[]) null, (C151007Tb[]) null, new C151007Tb[0], 0, 0, false, true, false);
                        }
                    }
                    A012 = r0;
                }
                if (A012 == r0) {
                    r2.A04(AnonymousClass000.A0V("not enabled with unsupported country code: ", str2, AnonymousClass001.A0o()));
                    this.A00 = null;
                } else {
                    this.A00 = A012;
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("init enabled for country: ");
                    A0o2.append(A012.A03);
                    A0o2.append(" and default currency: ");
                    r2.A06(AnonymousClass000.A0X(((AnonymousClass1S3) A012.A02).A04, A0o2));
                }
                this.A01 = true;
            }
        }
    }

    public C153087ae(C56972sr r4, C617332a r5, AnonymousClass1VX r6, C85134Fb r7, C385127z r8) {
        this.A04 = r6;
        this.A02 = r4;
        this.A06 = r8;
        this.A05 = r7;
        this.A03 = r5;
    }
}
