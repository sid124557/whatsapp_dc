package X;

/* renamed from: X.3PY  reason: invalid class name */
public final class AnonymousClass3PY implements AnonymousClass4D2 {
    public static final Integer A01(AnonymousClass1ES r5) {
        int i;
        AnonymousClass23G A00 = AnonymousClass23G.A00(r5.status_);
        if (A00 == null) {
            A00 = AnonymousClass23G.PENDING;
        }
        AnonymousClass1ET r0 = r5.key_;
        if (r0 == null) {
            r0 = AnonymousClass1ET.DEFAULT_INSTANCE;
        }
        if (r0.fromMe_) {
            if (A00 != null) {
                int ordinal = A00.ordinal();
                if (ordinal != 5) {
                    i = 7;
                    if (ordinal != 0) {
                        if (ordinal == 2) {
                            return 4;
                        }
                        i = 5;
                        if (ordinal != 3) {
                            if (ordinal == 4) {
                                i = 13;
                            }
                        }
                    }
                } else {
                    i = 8;
                }
                return Integer.valueOf(i);
            }
            return 0;
        } else if (A00 == null || A00.ordinal() != 5) {
            return null;
        } else {
            return C18300x5.A0Y();
        }
    }

    public static final AnonymousClass23G A00(C624134x r2) {
        int i = r2.A0D;
        if (r2.A1J.A02) {
            if (i != 0) {
                if (i == 13) {
                    return AnonymousClass23G.READ;
                }
                if (i != 21) {
                    if (i == 4) {
                        return AnonymousClass23G.SERVER_ACK;
                    }
                    if (i == 5) {
                        return AnonymousClass23G.DELIVERY_ACK;
                    }
                    if (i != 7) {
                        if (i != 8) {
                            return AnonymousClass23G.PENDING;
                        }
                    }
                }
            }
            return AnonymousClass23G.ERROR;
        } else if (!(i == 9 || i == 10)) {
            return null;
        }
        return AnonymousClass23G.PLAYED;
    }

    public void BYV(C52952mJ r3, AnonymousClass1A3 r4, C624134x r5) {
        AnonymousClass23G A00;
        C18260x0.A0O(r5, r4);
        if (!AnonymousClass27M.A00(r4, r5) && (A00 = A00(r5)) != null) {
            AnonymousClass1ES A0O = C18280x3.A0O(r4);
            A0O.status_ = A00.value;
            A0O.bitField0_ |= 8;
        }
    }

    public void BYW(C50972j4 r2, AnonymousClass1ES r3, C624134x r4) {
        Integer A01;
        C18260x0.A0O(r3, r4);
        if (r4.A0D == 0 && (A01 = A01(r3)) != null) {
            r4.A1G(A01.intValue());
        }
    }
}
