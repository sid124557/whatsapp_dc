package X;

/* renamed from: X.5Zj  reason: invalid class name and case insensitive filesystem */
public class C106535Zj {
    public static final C998958p A01(int i, int i2) {
        if (i == 1) {
            return C998958p.OK;
        }
        if (i == 2) {
            return C998958p.YES;
        }
        if (i == 3) {
            switch (i2) {
                case 2:
                    return C998958p.ERROR_BLOCKED;
                case 6:
                    return C998958p.ERROR_TEMPORARILY_UNAVAILABLE;
                case 7:
                    return C998958p.ERROR_OLD_VERSION;
                case 8:
                    return C998958p.ERROR_TOO_RECENT;
                case 9:
                    return C998958p.ERROR_TOO_MANY;
                case 10:
                    return C998958p.ERROR_NEXT_METHOD;
                case 11:
                    return C998958p.ERROR_TOO_MANY_GUESSES;
                case 12:
                    return C998958p.ERROR_BAD_PARAMETER;
                case 13:
                    return C998958p.ERROR_MISSING_PARAMETER;
                case 14:
                    return C998958p.ERROR_PROVIDER_TIMEOUT;
                case 15:
                    return C998958p.ERROR_PROVIDER_UNROUTABLE;
                case 16:
                    return C998958p.ERROR_BAD_TOKEN;
                case 17:
                    return C998958p.ERROR_TOO_MANY_ALL_METHODS;
                case 18:
                    return C998958p.ERROR_NO_ROUTES;
                case 23:
                    return C998958p.SECURITY_CODE;
                case 24:
                    return C998958p.ERROR_INVALID_SKEY_SIGNATURE;
                case 26:
                    return C998958p.ERROR_LIMITED_RELEASE;
                case 29:
                    return C998958p.ERROR_FLASH_CALL_DISABLED;
                case 30:
                    return C998958p.ERROR_DEVICE_CONFIRM_OR_SECOND_OTP;
                case 31:
                    return C998958p.ERROR_SECOND_OTP;
                case 32:
                    return C998958p.ERROR_NOT_ALLOWED;
                case 34:
                    return C998958p.ERROR_CODE_CHECKPOINT;
                case 35:
                    return C998958p.ERROR_PROFILE_CHECKPONT;
                case 36:
                    return C998958p.ERROR_SEND_SMS_TO_WA;
                case 37:
                    return C998958p.ERROR_WAITING_FOR_SMS;
            }
        } else if (i == 4) {
            return C998958p.YES_WITH_CODE;
        }
        return C998958p.ERROR_UNSPECIFIED;
    }

    public static final C998658m A02(int i, int i2) {
        if (i == 1) {
            return C998658m.YES;
        }
        if (i != 3) {
            if (i == 5) {
                return C998658m.VERIFIED_STANDALONE;
            }
        } else if (i2 == 2) {
            return C998658m.FAIL_BLOCKED;
        } else {
            if (i2 == 6) {
                return C998658m.FAIL_TEMPORARILY_UNAVAILABLE;
            }
            if (i2 == 11) {
                return C998658m.FAIL_TOO_MANY_GUESSES;
            }
            if (i2 == 26) {
                return C998658m.ERROR_LIMITED_RELEASE;
            }
            switch (i2) {
                case 19:
                    return C998658m.FAIL_MISMATCH;
                case 20:
                    return C998658m.FAIL_GUESSED_TOO_FAST;
                case 21:
                    return C998658m.FAIL_MISSING;
                case 22:
                    return C998658m.FAIL_STALE;
                case 23:
                    return C998658m.SECURITY_CODE;
                default:
                    switch (i2) {
                        case 30:
                            return C998658m.DEVICE_CONFIRM_OR_SECOND_OTP;
                        case 31:
                            return C998658m.SECOND_OTP;
                        case 32:
                            return C998658m.FAIL_NOT_ALLOWED;
                    }
            }
        }
        return C998658m.ERROR_UNSPECIFIED;
    }

    public static final C998758n A00(int i) {
        if (i == 16) {
            return C998758n.ERROR_BAD_TOKEN;
        }
        if (i == 30) {
            return C998758n.DEVICE_CONFIRM_OR_SECOND_CODE;
        }
        if (i == 31) {
            return C998758n.SECOND_CODE;
        }
        if (i == 34) {
            return C998758n.CODE_CHECKPOINT;
        }
        if (i == 35) {
            return C998758n.PROFILE_CHECKPOINT;
        }
        switch (i) {
            case 1:
                return C998758n.INCORRECT;
            case 2:
                return C998758n.BLOCKED;
            case 3:
                return C998758n.LENGTH_LONG;
            case 4:
                return C998758n.LENGTH_SHORT;
            case 5:
                return C998758n.FORMAT_WRONG;
            case 6:
                return C998758n.TEMPORARILY_UNAVAILABLE;
            case 7:
                return C998758n.OLD_VERSION;
            default:
                switch (i) {
                    case 23:
                        return C998758n.SECURITY_CODE;
                    case 24:
                        return C998758n.INVALID_SKEY_SIGNATURE;
                    case 25:
                        return C998758n.BIZ_NOT_ALLOWED;
                    case 26:
                        return C998758n.LIMITED_RELEASE;
                    default:
                        return C998758n.UNKNOWN_REASON;
                }
        }
    }
}
