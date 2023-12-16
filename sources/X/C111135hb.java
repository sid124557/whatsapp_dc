package X;

/* renamed from: X.5hb  reason: invalid class name and case insensitive filesystem */
public class C111135hb implements AnonymousClass4CD {
    public int A00 = -1;
    public long A01 = -1;
    public final C1230166s A02;
    public final AnonymousClass4FS A03;
    public final C104745Se A04;

    public void A06(String str, Object obj) {
        C1230166s r3;
        long j;
        String obj2;
        StringBuilder A0g = C18280x3.A0g(obj, 1);
        A0g.append("XFamilyUserFlowLoggerImpl/annotateUserFlow: marker=");
        C86634Kw.A1T(A0g, this.A00);
        A0g.append(", key=");
        String str2 = str;
        A0g.append(str);
        C18260x0.A1N(A0g, ", value=", obj);
        if (!this.A04.A00()) {
            return;
        }
        if (obj instanceof Long) {
            C1230166s r2 = this.A02;
            long j2 = this.A01;
            long A0B = C18310x6.A0B(obj);
            int A06 = C86664Kz.A06(j2);
            ((C115425oe) r2).A00.markerAnnotate((int) j2, A06, str2, A0B);
        } else if (obj instanceof Double) {
            C1230166s r22 = this.A02;
            long j3 = this.A01;
            double doubleValue = ((Number) obj).doubleValue();
            int A062 = C86664Kz.A06(j3);
            ((C115425oe) r22).A00.markerAnnotate((int) j3, A062, str2, doubleValue);
        } else if (obj instanceof Integer) {
            C1230166s r4 = this.A02;
            long j4 = this.A01;
            int A0K = AnonymousClass001.A0K(obj);
            ((C115425oe) r4).A00.markerAnnotate((int) j4, C86664Kz.A06(j4), str, A0K);
        } else {
            if (obj instanceof String) {
                r3 = this.A02;
                j = this.A01;
                obj2 = (String) obj;
            } else {
                boolean z = obj instanceof Boolean;
                r3 = this.A02;
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

    public void A07(String str, String str2) {
        StringBuilder A0g = C18280x3.A0g(str2, 1);
        A0g.append("XFamilyUserFlowLoggerImpl/failUserFlowWithPoint: marker=");
        C86634Kw.A1T(A0g, this.A00);
        C106245Ye.A00(AnonymousClass000.A0V(", point=", str, A0g));
        if (this.A04.A00()) {
            this.A02.flowEndFail(this.A01, str, str2);
            A02();
        }
    }

    public final void A02() {
        if (this.A04.A00()) {
            this.A01 = -1;
            this.A00 = -1;
        }
    }

    public void BMV() {
    }

    public void onAppBackgrounded() {
        this.A03.BkN(new C71303bt(this, 2), "xfam_flow_on_app_bg");
    }

    public C111135hb(C1230166s r3, AnonymousClass4FS r4, C104745Se r5) {
        C18260x0.A0V(r3, r5, r4);
        this.A02 = r3;
        this.A04 = r5;
        this.A03 = r4;
    }

    public static void A00(C56042rK r0, AnonymousClass21S r1, C111135hb r2) {
        r2.A06("is_account_linked", Boolean.valueOf(r0.A05(r1)));
    }

    public void A01() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("XFamilyUserFlowLoggerImpl/logFlowSuccess: marker=");
        C106245Ye.A00(AnonymousClass000.A0X(C379224o.A00(this.A00), A0o));
        if (this.A04.A00()) {
            this.A02.flowEndSuccess(this.A01);
            A02();
        }
    }

    public void A03(int i, String str, String str2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("XFamilyUserFlowLoggerImpl/startUserFlowWithPoint: marker=");
        C86634Kw.A1T(A0o, i);
        C106245Ye.A00(AnonymousClass000.A0V(", point=", str2, A0o));
        C104745Se r1 = this.A04;
        if (r1.A00()) {
            if (r1.A00()) {
                long j = this.A01;
                if (j != -1) {
                    C1230166s r4 = this.A02;
                    r4.flowMarkPoint(j, "FLOW_START_BEFORE_PREVIOUS_ENDED");
                    r4.flowEndFail(this.A01, "FLOW_STARTED_BEFORE_PREVIOUS_ENDED", (String) null);
                }
            }
            C1230166s r5 = this.A02;
            long j2 = ((long) i) | (((long) 0) << 32);
            this.A01 = j2;
            this.A00 = i;
            r5.B3O(new C103995Pf(str, false), j2);
            r5.flowMarkPoint(this.A01, str2);
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("Current flow is:");
            A0o2.append(this.A01);
            C18260x0.A1N(A0o2, ", ", this);
        }
    }

    public void A04(String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("XFamilyUserFlowLoggerImpl/cancelUserFlowWithPoint: marker=");
        C86634Kw.A1T(A0o, this.A00);
        C106245Ye.A00(AnonymousClass000.A0V(", point=", str, A0o));
        if (this.A04.A00()) {
            A05(str);
            C1230166s r5 = this.A02;
            long j = this.A01;
            int i = (int) j;
            int A06 = C86664Kz.A06(j);
            C186568vZ r1 = ((C115425oe) r5).A00;
            r1.markerAnnotate(i, A06, "cancel_reason", "user_cancelled");
            r1.BKf(i, A06, 4, str);
            A02();
        }
    }

    public void A05(String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("XFamilyUserFlowLoggerImpl/logPoint: marker=");
        C86634Kw.A1T(A0o, this.A00);
        C106245Ye.A00(AnonymousClass000.A0V(", point=", str, A0o));
        if (this.A04.A00()) {
            this.A02.flowMarkPoint(this.A01, str);
        }
    }
}
