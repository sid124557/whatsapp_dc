package X;

/* renamed from: X.3WH  reason: invalid class name */
public final class AnonymousClass3WH implements C84944Ei {
    public final AnonymousClass2ZB A00;

    public AnonymousClass3WH(AnonymousClass2ZB r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public void BK1(String str) {
        C162457s7.A0J(str, 0);
        C615631i.A01();
        StringBuilder A0l = AnonymousClass000.A0l(str);
        A0l.append("/unique_xpost_id: ");
        String str2 = "";
        String string = this.A00.A00().getString("pref_debug_session_id", str2);
        if (string != null) {
            str2 = string;
        }
        C18260x0.A1L(A0l, str2);
    }

    public /* synthetic */ void BK5(AnonymousClass2P4 r1) {
    }

    public /* synthetic */ void BKL(String str) {
    }
}
