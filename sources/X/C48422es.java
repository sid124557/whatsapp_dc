package X;

/* renamed from: X.2es  reason: invalid class name and case insensitive filesystem */
public final class C48422es {
    public boolean A00 = true;
    public final C186568vZ A01;

    public C48422es(C186568vZ r2) {
        C162457s7.A0J(r2, 1);
        this.A01 = r2;
    }

    public final void A00(String str) {
        C186568vZ r1;
        String str2;
        if (C162457s7.A0P(str, "fb")) {
            r1 = this.A01;
            str2 = "fetch_auth_fb_error";
        } else if (C162457s7.A0P(str, "ig")) {
            r1 = this.A01;
            str2 = "fetch_auth_ig_error";
        } else {
            return;
        }
        r1.markerPoint(551497305, str2);
    }

    public final void A01(String str) {
        this.A01.markerAnnotate(551497305, "fetch_source", str);
    }
}
