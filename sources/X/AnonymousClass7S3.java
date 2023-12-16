package X;

/* renamed from: X.7S3  reason: invalid class name */
public class AnonymousClass7S3 {
    public int A00;
    public final AnonymousClass8Kx A01;

    public void A00(C142066wa r5) {
        int i;
        if (r5 != null) {
            AnonymousClass8Kx r2 = this.A01;
            if (r2.useNetworkQuality) {
                int ordinal = r5.ordinal();
                if (ordinal == 4) {
                    i = r2.excellentValue;
                } else if (ordinal == 3) {
                    i = r2.goodValue;
                } else if (ordinal == 2) {
                    i = r2.moderateValue;
                } else if (ordinal == 1) {
                    i = r2.poorValue;
                } else if (ordinal != 0) {
                    i = r2.defaultValue;
                } else {
                    i = r2.degradedValue;
                }
                this.A00 = i;
            }
        }
    }

    public AnonymousClass7S3(AnonymousClass8Kx r2) {
        this.A01 = r2;
        this.A00 = r2.defaultValue;
    }
}
