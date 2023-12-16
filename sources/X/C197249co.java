package X;

import java.util.Map;

/* renamed from: X.9co  reason: invalid class name and case insensitive filesystem */
public abstract class C197249co implements C182828p3 {
    public final AnonymousClass1VX A00;
    public final C153087ae A01;
    public final AnonymousClass5NB A02;
    public final C104815Sl A03;

    public void A07(Integer num, String str) {
        this.A02.A00(num, str, 2);
    }

    public Integer A00(String str) {
        AnonymousClass5NB r2 = this.A02;
        if (!r2.A00.A0X(1546)) {
            return null;
        }
        C104815Sl r22 = r2.A01;
        int A002 = r22.A00(185470120, str, "unknown");
        String A05 = C18260x0.A05(str, A002);
        Integer valueOf = Integer.valueOf(A002);
        r22.A02(valueOf, A05, "iq_action", str);
        return valueOf;
    }

    public Integer A01(String str, int i) {
        if (!this.A00.A0X(1546)) {
            return null;
        }
        if (str == null) {
            str = "unknown";
        }
        C104815Sl r6 = this.A03;
        int A002 = r6.A00(i, "p2p_flow_tag", str);
        String A05 = C18260x0.A05("p2p_flow_tag", A002);
        Integer valueOf = Integer.valueOf(A002);
        r6.A02(valueOf, A05, "entry_point", str);
        C161357pU A022 = this.A01.A02();
        if (A022 != null) {
            r6.A02(valueOf, C18260x0.A05("p2p_flow_tag", A002), "country", A022.A03);
        }
        BKh("new_payment", A002);
        return valueOf;
    }

    public void A02(int i, String str) {
        if (this.A00.A0X(1546)) {
            C104815Sl r4 = this.A03;
            Map map = r4.A03;
            AnonymousClass316 r2 = (AnonymousClass316) map.get(str);
            if (r2 == null) {
                C47122ck r1 = new C47122ck(i);
                r2 = r4.A00.A01(r1, str);
                r1.A05 = true;
                C162457s7.A0H(r2);
                map.put(str, r2);
            }
            r2.A0F("unknown", -1);
            C161357pU A022 = this.A01.A02();
            if (A022 != null) {
                r4.A02((Integer) null, str, "country", A022.A03);
            }
        }
    }

    public void A04(int i, short s) {
        Object obj;
        C104815Sl r3 = this.A03;
        Integer valueOf = Integer.valueOf(i);
        Map map = r3.A03;
        if (valueOf == null) {
            obj = map.get("p2p_flow_tag");
        } else {
            obj = map.get(AnonymousClass000.A0P(valueOf, "p2p_flow_tag", AnonymousClass001.A0o()));
        }
        AnonymousClass316 r5 = (AnonymousClass316) obj;
        if (r5 != null) {
            String A05 = C18260x0.A05("p2p_flow_tag", i);
            Map map2 = r3.A02;
            String A0o = C18310x6.A0o(A05, map2);
            if (A0o != null) {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("PaymentsPerfTrackerManager.markerFlowEnd point: ");
                A0o2.append(A0o);
                A0o2.append(", instance key: ");
                A0o2.append(i);
                C18260x0.A0w(", status: ", A0o2, s);
                r5.A03(i, A0o);
                map2.remove(A05);
            }
            r5.A07(i, s);
            map.remove(A05);
        }
    }

    public void A05(AnonymousClass34V r10, Integer num, String str) {
        int i;
        AnonymousClass5NB r2 = this.A02;
        if (r10 != null) {
            i = r10.A00;
        } else {
            i = 0;
        }
        r2.A01.A01(num, str, "error_code", (long) i);
        r2.A00(num, str, 3);
    }

    public void A06(AnonymousClass34V r8, String str) {
        if (r8 == null) {
            r8 = C1899693i.A0M();
        }
        C104815Sl r1 = this.A03;
        r1.A01((Integer) null, str, "error_code", (long) r8.A00);
        Map map = r1.A03;
        AnonymousClass316 r0 = (AnonymousClass316) map.get(str);
        if (r0 != null) {
            r0.A0E(3);
            map.remove(str);
        }
    }

    public void BKh(String str, int i) {
        Object obj;
        C104815Sl r5 = this.A03;
        C162457s7.A0J(str, 0);
        Integer valueOf = Integer.valueOf(i);
        if (valueOf == null) {
            obj = r5.A03.get("p2p_flow_tag");
        } else {
            obj = r5.A03.get(AnonymousClass000.A0P(valueOf, "p2p_flow_tag", AnonymousClass001.A0o()));
        }
        AnonymousClass316 r4 = (AnonymousClass316) obj;
        if (r4 != null) {
            String A05 = C18260x0.A05("p2p_flow_tag", i);
            Map map = r5.A02;
            String A0o = C18310x6.A0o(A05, map);
            if (A0o != null) {
                if (A0o.equals(str)) {
                    C18260x0.A0s("PaymentsPerfTrackerManager.markerFlowPoint used the same qpl flow point twice: ", str, AnonymousClass001.A0o());
                    return;
                }
                r4.A03(i, A0o);
            }
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("PaymentsPerfTrackerManager.markerFlowPoint point: ");
            A0o2.append(str);
            C18260x0.A0w(", instance key: ", A0o2, i);
            r4.A04(i, str);
            map.put(A05, str);
        }
    }

    public C197249co(AnonymousClass1VX r1, C153087ae r2, AnonymousClass5NB r3, C104815Sl r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }

    public void A03(int i, String str, long j) {
        this.A03.A01(Integer.valueOf(i), AnonymousClass000.A0Y("p2p_flow_tag", AnonymousClass001.A0o(), i), str, j);
    }

    public void A08(String str, boolean z, int i) {
        String A0Y = AnonymousClass000.A0Y("p2p_flow_tag", AnonymousClass001.A0o(), i);
        C104815Sl r3 = this.A03;
        Integer valueOf = Integer.valueOf(i);
        C162457s7.A0J(A0Y, 0);
        C201889l0 r1 = new C201889l0(valueOf, str, z);
        Object obj = r3.A03.get(A0Y);
        if (obj != null) {
            r1.invoke(obj);
        }
    }
}
