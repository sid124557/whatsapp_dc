package X;

/* renamed from: X.6yz  reason: invalid class name and case insensitive filesystem */
public final class C143506yz extends Exception {
    public final int zza;

    public C143506yz(String str) {
        super(str);
        String str2;
        int i = 0;
        if (str != null) {
            String A0z = AnonymousClass0x9.A0z(str);
            switch (A0z.hashCode()) {
                case -1743242157:
                    if (A0z.equals("service_not_available")) {
                        i = 3;
                        break;
                    }
                    break;
                case -1290953729:
                    if (A0z.equals("toomanymessages")) {
                        i = 4;
                        break;
                    }
                    break;
                case -920906446:
                    str2 = "invalid_parameters";
                    break;
                case -617027085:
                    if (A0z.equals("messagetoobig")) {
                        i = 2;
                        break;
                    }
                    break;
                case -95047692:
                    str2 = "missing_to";
                    break;
            }
            if (A0z.equals(str2)) {
                i = 1;
            }
        }
        this.zza = i;
    }
}
