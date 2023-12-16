package X;

/* renamed from: X.2vG  reason: invalid class name and case insensitive filesystem */
public class C58442vG {
    public final C64663Ek A00;
    public final C613730l A01;

    public C58442vG(C64663Ek r1, C613730l r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static final int A00(String str) {
        switch (str.hashCode()) {
            case -849492943:
                if (str.equals("regular_low")) {
                    return 5;
                }
                break;
            case -564602779:
                if (str.equals("regular_high")) {
                    return 4;
                }
                break;
            case -498584183:
                if (str.equals("critical_unblock_low")) {
                    return 2;
                }
                break;
            case 207170541:
                if (str.equals("critical_block")) {
                    return 1;
                }
                break;
            case 1086463900:
                if (str.equals("regular")) {
                    return 3;
                }
                break;
        }
        C18260x0.A0t("SyncdAntiTamperingLoggingHelper/getShiftBit unknown collection name: ", str, AnonymousClass001.A0o());
        return 0;
    }
}
