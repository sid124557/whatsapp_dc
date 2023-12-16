package X;

import java.io.File;

/* renamed from: X.5nU  reason: invalid class name and case insensitive filesystem */
public final class C114715nU implements C188138yN {
    public final int A00;
    public final C106095Xp A01;
    public final AnonymousClass65N A02;
    public final C47042cc A03;
    public final String A04;

    public void run() {
        File file;
        C106095Xp r0 = this.A01;
        String str = this.A04;
        int i = this.A00;
        C626936e.A00();
        C33151sW A012 = r0.A01();
        C56612sH r10 = r0.A0B;
        C95384tZ r3 = new C95384tZ(r0.A03, r0.A05, r0.A07, r0.A08, r0.A09, r0.A0A, r10, A012, C106095Xp.A0I, str);
        r3.A0C(r3.A0G());
        AnonymousClass2OC B3u = A012.B3u(str);
        if (B3u != null) {
            file = AnonymousClass002.A0B(B3u.A00);
        } else {
            file = null;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("MediaLoadGifJob/failed to load, name: ");
            A0o.append(str);
            C18260x0.A0x(", attribution:", A0o, i);
        }
        this.A03.A00(file, true);
    }

    public C114715nU(C106095Xp r1, AnonymousClass65N r2, C47042cc r3, String str, int i) {
        this.A01 = r1;
        this.A02 = r2;
        this.A04 = str;
        this.A00 = i;
        this.A03 = r3;
    }
}
