package X;

/* renamed from: X.87i  reason: invalid class name and case insensitive filesystem */
public class C1689387i implements C187018wJ {
    public C180688lT B0a(C166527yp r4) {
        String str = r4.A0T;
        if (str != null) {
            switch (str.hashCode()) {
                case -1354451219:
                    if (str.equals("application/vnd.dvb.ait")) {
                        return new C126686Ox();
                    }
                    break;
                case -1348231605:
                    if (str.equals("application/x-icy")) {
                        return new AnonymousClass6P0();
                    }
                    break;
                case -1248341703:
                    if (str.equals("application/id3")) {
                        return new AnonymousClass6P1((C180708lV) null);
                    }
                    break;
                case 1154383568:
                    if (str.equals("application/x-emsg")) {
                        return new C126696Oy();
                    }
                    break;
                case 1652648887:
                    if (str.equals("application/x-scte35")) {
                        return new C126706Oz();
                    }
                    break;
            }
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Attempted to create decoder for unsupported MIME type: ");
        throw AnonymousClass000.A0F(str, A0o);
    }

    public boolean BqP(C166527yp r3) {
        String str = r3.A0T;
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return true;
        }
        return false;
    }
}
