package X;

/* renamed from: X.3M0  reason: invalid class name */
public final class AnonymousClass3M0 implements C85034Er {
    public final /* synthetic */ C85034Er A00;
    public final /* synthetic */ C23401Sx A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public AnonymousClass3M0(C85034Er r1, C23401Sx r2, String str, boolean z) {
        this.A01 = r2;
        this.A02 = str;
        this.A03 = z;
        this.A00 = r1;
    }

    public void BLr() {
        C23401Sx r4 = this.A01;
        C23641Ub r3 = r4.A06;
        int hashCode = this.A02.hashCode();
        r3.A0C(hashCode, "onAbort", "Download aborted");
        r3.A09(Integer.valueOf(hashCode), "psl_network_end");
        if (this.A03) {
            r3.A06(hashCode, 105);
        }
        C85034Er r0 = this.A00;
        if (r0 != null) {
            r0.BLr();
        }
        r4.A0E();
    }

    public void onSuccess() {
        C23401Sx r4 = this.A01;
        C23641Ub r3 = r4.A06;
        int hashCode = this.A02.hashCode();
        r3.A09(Integer.valueOf(hashCode), "psl_network_end");
        if (this.A03) {
            r3.A06(hashCode, 2);
        }
        C85034Er r0 = this.A00;
        if (r0 != null) {
            r0.onSuccess();
        }
        r4.A0E();
    }

    public /* bridge */ /* synthetic */ void BSD(Integer num) {
        int intValue = num.intValue();
        C23401Sx r4 = this.A01;
        C23641Ub r3 = r4.A06;
        int hashCode = this.A02.hashCode();
        r3.A0C(hashCode, AnonymousClass000.A0Y("onError ", AnonymousClass001.A0o(), intValue), "Download failed");
        r3.A09(Integer.valueOf(hashCode), "psl_network_end");
        if (this.A03) {
            r3.A06(hashCode, 3);
        }
        C85034Er r1 = this.A00;
        if (r1 != null) {
            r1.BSD(Integer.valueOf(intValue));
        }
        r4.A0E();
    }

    public /* bridge */ /* synthetic */ void Be9(Integer num) {
        int intValue = num.intValue();
        C23401Sx r4 = this.A01;
        C23641Ub r3 = r4.A06;
        int hashCode = this.A02.hashCode();
        r3.A0C(hashCode, AnonymousClass000.A0Y("onTimeout ", AnonymousClass001.A0o(), intValue), "Download timed out");
        r3.A09(Integer.valueOf(hashCode), "psl_network_end");
        if (this.A03) {
            r3.A06(hashCode, 3);
        }
        C85034Er r1 = this.A00;
        if (r1 != null) {
            r1.Be9(Integer.valueOf(intValue));
        }
        r4.A0E();
    }
}
