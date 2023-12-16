package X;

/* renamed from: X.30B  reason: invalid class name */
public class AnonymousClass30B {
    public static final int A0E = ((int) (C58152un.A00 / 8192));
    public final AnonymousClass2VF A00;
    public final Object A01 = AnonymousClass002.A0D();
    public final Object A02 = AnonymousClass002.A0D();
    public final Object A03 = AnonymousClass002.A0D();
    public final Object A04 = AnonymousClass002.A0D();
    public final Object A05 = AnonymousClass002.A0D();
    public final Object A06 = AnonymousClass002.A0D();
    public volatile C22341Mr A07;
    public volatile C22341Mr A08;
    public volatile C22341Mr A09;
    public volatile C22341Mr A0A;
    public volatile C22341Mr A0B;
    public volatile C22341Mr A0C;
    public volatile C22341Mr A0D;

    public C33131sU A00() {
        if (this.A08 == null) {
            synchronized (this.A02) {
                if (this.A08 == null) {
                    this.A08 = this.A00.A00("composerThumbCache", A0E);
                }
            }
        }
        return this.A08;
    }

    public C33131sU A01() {
        if (this.A09 == null) {
            synchronized (this.A03) {
                if (this.A09 == null) {
                    this.A09 = this.A00.A00("contactsThumbCache", A0E);
                }
            }
        }
        return this.A09;
    }

    public C33131sU A02() {
        if (this.A0B == null) {
            synchronized (this.A04) {
                if (this.A0B == null) {
                    this.A0B = this.A00.A00("mediaThumbCache", A0E);
                }
            }
        }
        return this.A0B;
    }

    public C33131sU A03() {
        if (this.A0C == null) {
            synchronized (this.A05) {
                if (this.A0C == null) {
                    this.A0C = this.A00.A00("stickerFrameCache", A0E / 2);
                }
            }
        }
        return this.A0C;
    }

    public C33131sU A04() {
        if (this.A0D == null) {
            synchronized (this.A06) {
                if (this.A0D == null) {
                    this.A0D = this.A00.A00("stickerTrayIconCache", A0E / 2);
                }
            }
        }
        return this.A0D;
    }

    public AnonymousClass30B(AnonymousClass2VF r2) {
        this.A00 = r2;
    }
}
