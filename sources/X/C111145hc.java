package X;

/* renamed from: X.5hc  reason: invalid class name and case insensitive filesystem */
public abstract class C111145hc implements AnonymousClass4CD {
    public int A00 = -1;
    public long A01 = -1;
    public final AnonymousClass33p A02;
    public final AnonymousClass1VX A03;
    public final C1230166s A04;

    public void A06(String str, Object obj) {
        C1230166s r3;
        long j;
        String obj2;
        StringBuilder A0g = C18280x3.A0g(obj, 1);
        A0g.append("XFamilyUserFlowLogger/annotateUserFlow: marker=");
        C86634Kw.A1T(A0g, this.A00);
        A0g.append(", key=");
        String str2 = str;
        A0g.append(str);
        String A0P = AnonymousClass000.A0P(obj, ", value=", A0g);
        C18260x0.A0q("[XFAM] ", A0P, C18270x1.A0X(A0P));
        if (!A07()) {
            return;
        }
        if (obj instanceof Long) {
            C1230166s r2 = this.A04;
            long j2 = this.A01;
            long A0B = C18310x6.A0B(obj);
            int A06 = C86664Kz.A06(j2);
            ((C115425oe) r2).A00.markerAnnotate((int) j2, A06, str2, A0B);
        } else if (obj instanceof Double) {
            C1230166s r22 = this.A04;
            long j3 = this.A01;
            double doubleValue = ((Number) obj).doubleValue();
            int A062 = C86664Kz.A06(j3);
            ((C115425oe) r22).A00.markerAnnotate((int) j3, A062, str2, doubleValue);
        } else if (obj instanceof Integer) {
            C1230166s r4 = this.A04;
            long j4 = this.A01;
            int A0K = AnonymousClass001.A0K(obj);
            ((C115425oe) r4).A00.markerAnnotate((int) j4, C86664Kz.A06(j4), str, A0K);
        } else {
            if (obj instanceof String) {
                r3 = this.A04;
                j = this.A01;
                obj2 = (String) obj;
            } else {
                boolean z = obj instanceof Boolean;
                r3 = this.A04;
                j = this.A01;
                if (z) {
                    r3.flowAnnotate(j, str, AnonymousClass001.A1Z(obj));
                    return;
                }
                obj2 = obj.toString();
            }
            r3.flowAnnotate(j, str, obj2);
        }
    }

    public abstract boolean A07();

    public void BMV() {
    }

    public void onAppBackgrounded() {
        A05("BACKGROUND_APP");
    }

    public C111145hc(AnonymousClass33p r3, AnonymousClass1VX r4, C1230166s r5) {
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r3;
    }

    public static void A00(C111145hc r2) {
        if (r2.A07()) {
            r2.A01 = -1;
            r2.A00 = -1;
        }
    }

    public void A01() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("XFamilyUserFlowLogger/logFlowSuccess: marker=");
        String A0X = AnonymousClass000.A0X(C379224o.A00(this.A00), A0o);
        C18260x0.A0q("[XFAM] ", A0X, C18270x1.A0X(A0X));
        if (A07()) {
            this.A04.flowEndSuccess(this.A01);
            A00(this);
        }
    }

    public void A02(int i, String str, String str2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("XFamilyUserFlowLogger/startUserFlowWithPoint: marker=");
        C86634Kw.A1T(A0o, i);
        String A0V = AnonymousClass000.A0V(", point=", str2, A0o);
        C18260x0.A0q("[XFAM] ", A0V, C18270x1.A0X(A0V));
        if (A07()) {
            if (A07()) {
                long j = this.A01;
                if (j != -1) {
                    C1230166s r4 = this.A04;
                    r4.flowMarkPoint(j, "FLOW_START_BEFORE_PREVIOUS_ENDED");
                    r4.flowEndFail(this.A01, "FLOW_STARTED_BEFORE_PREVIOUS_ENDED", (String) null);
                }
            }
            C1230166s r5 = this.A04;
            long j2 = ((long) i) | (((long) 0) << 32);
            this.A01 = j2;
            this.A00 = i;
            r5.B3O(new C103995Pf(str, false), j2);
            r5.flowMarkPoint(this.A01, str2);
            if (this.A03.A0X(6084)) {
                String A0v = AnonymousClass0x9.A0v(AnonymousClass0x2.A0F(this.A02), "encrypted_rid");
                C162457s7.A0D(A0v);
                A06("encrypted_rid", A0v);
            }
        }
    }

    public void A03(String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("XFamilyUserFlowLogger/cancelUserFlowWithPoint: marker=");
        C86634Kw.A1T(A0o, this.A00);
        String A0V = AnonymousClass000.A0V(", point=", str, A0o);
        C18260x0.A0q("[XFAM] ", A0V, C18270x1.A0X(A0V));
        if (A07()) {
            A05(str);
            C1230166s r5 = this.A04;
            long j = this.A01;
            int i = (int) j;
            int A06 = C86664Kz.A06(j);
            C186568vZ r1 = ((C115425oe) r5).A00;
            r1.markerAnnotate(i, A06, "cancel_reason", "user_cancelled");
            r1.BKf(i, A06, 4, str);
            A00(this);
        }
    }

    public void A04(String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("XFamilyUserFlowLogger/failUserFlowWithPoint: marker=");
        C86634Kw.A1T(A0o, this.A00);
        String A0V = AnonymousClass000.A0V(", point=", str, A0o);
        C18260x0.A0q("[XFAM] ", A0V, C18270x1.A0X(A0V));
        if (A07()) {
            this.A04.flowEndFail(this.A01, str, (String) null);
            A00(this);
        }
    }

    public void A05(String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("XFamilyUserFlowLogger/logPoint: marker=");
        C86634Kw.A1T(A0o, this.A00);
        String A0V = AnonymousClass000.A0V(", point=", str, A0o);
        C18260x0.A0q("[XFAM] ", A0V, C18270x1.A0X(A0V));
        if (A07()) {
            this.A04.flowMarkPoint(this.A01, str);
        }
    }
}
