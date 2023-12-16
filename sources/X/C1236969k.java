package X;

/* renamed from: X.69k  reason: invalid class name and case insensitive filesystem */
public class C1236969k implements C183288pn {
    public Object A00;
    public final int A01;

    public C1236969k(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BcQ(String str, boolean z, int i) {
        boolean z2;
        int i2;
        AnonymousClass562 r3;
        int i3 = this.A01;
        Object obj = this.A00;
        if (i3 != 0) {
            AnonymousClass567 r6 = (AnonymousClass567) obj;
            z2 = false;
            i2 = 1;
            if (i == 1) {
                Integer A0c = C18290x4.A0c();
                C18260x0.A0r("ExoPlayerVideoPlayer/onError=", str, AnonymousClass001.A0o());
                r6.A0Y(str, z, "download_failed");
                C153387bE r0 = r6.A0B;
                if (r0 != null) {
                    r0.A04(A0c, z);
                }
            } else if (i == 2) {
                AnonymousClass561 r02 = r6.A0D;
                if (r02 != null) {
                    r02.setPlayControlVisibility(0);
                }
                r6.A0G();
                r6.A0F();
            }
            r3 = r6.A0U;
        } else {
            C138386qG r62 = (C138386qG) obj;
            z2 = false;
            i2 = 1;
            if (i == 1) {
                Integer A0c2 = C18290x4.A0c();
                C18260x0.A0r("ExoPlayerVideoPlayer/onError=", str, AnonymousClass001.A0o());
                r62.A0Y(str, z, "download_failed");
                C153387bE r03 = r62.A08;
                if (r03 != null) {
                    r03.A04(A0c2, z);
                }
            } else if (i == 2) {
                AnonymousClass561 r04 = r62.A09;
                if (r04 != null) {
                    r04.setPlayControlVisibility(0);
                }
                r62.A0G();
                r62.A0F();
            }
            r3 = r62.A0O;
        }
        if (i == i2) {
            z2 = true;
        }
        r3.A04 = str;
        C53302ms r2 = r3.A01;
        if (r2 != null && r3.A05 != z2) {
            int i4 = r3.A00;
            if (z2) {
                if (i4 == 2) {
                    r2.A02(str);
                }
            } else if (i4 == 2) {
                r2.A01();
            }
            r3.A05 = z2;
        }
    }
}
