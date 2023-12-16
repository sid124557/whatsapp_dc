package com.facebook.common.util;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C18300x5;

public enum TriState {
    YES,
    NO,
    UNSET;

    public static TriState fromDbValue(int i) {
        if (i == 1) {
            return YES;
        }
        if (i != 2) {
            return UNSET;
        }
        return NO;
    }

    public static TriState valueOf(Boolean bool) {
        if (bool != null) {
            return valueOf(bool.booleanValue());
        }
        return UNSET;
    }

    public boolean isSet() {
        return C18300x5.A1W(this, UNSET);
    }

    public boolean asBoolean(boolean z) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 1) {
            return false;
        }
        if (ordinal == 2) {
            return z;
        }
        throw AnonymousClass000.A0H(this, "Unrecognized TriState value: ", AnonymousClass001.A0o());
    }

    public Boolean asBooleanObject() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return Boolean.TRUE;
        }
        if (ordinal == 1) {
            return Boolean.FALSE;
        }
        if (ordinal == 2) {
            return null;
        }
        throw AnonymousClass000.A0H(this, "Unrecognized TriState value: ", AnonymousClass001.A0o());
    }

    public int getDbValue() {
        int ordinal = ordinal();
        int i = 1;
        if (ordinal != 0) {
            i = 2;
            if (ordinal != 1) {
                return 3;
            }
        }
        return i;
    }

    public boolean asBoolean() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 1) {
            return false;
        }
        if (ordinal != 2) {
            throw AnonymousClass000.A0H(this, "Unrecognized TriState value: ", AnonymousClass001.A0o());
        }
        throw AnonymousClass001.A0e("No boolean equivalent for UNSET");
    }

    public static TriState valueOf(boolean z) {
        if (z) {
            return YES;
        }
        return NO;
    }
}
