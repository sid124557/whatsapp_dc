package com.whatsapp.jid;

import X.AnonymousClass000;
import X.AnonymousClass0x9;
import X.AnonymousClass32W;
import X.AnonymousClass34X;
import X.AnonymousClass75J;
import X.C162457s7;
import android.os.Parcelable;
import java.util.Arrays;

public abstract class Jid implements Comparable, Parcelable {
    public static final AnonymousClass32W Companion = new AnonymousClass32W();
    public static final AnonymousClass34X JID_FACTORY = AnonymousClass34X.A01();
    public final String user;

    public Jid(String str) {
        C162457s7.A0J(str, 1);
        this.user = str;
    }

    public int compareTo(Jid jid) {
        C162457s7.A0J(jid, 0);
        return getRawString().compareTo(jid.getRawString());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Jid)) {
            return false;
        }
        Jid jid = (Jid) obj;
        return AnonymousClass75J.A00(this.user, jid.user) && C162457s7.A0P(getServer(), jid.getServer()) && getType() == jid.getType();
    }

    public abstract String getServer();

    public abstract int getType();

    public String getRawString() {
        return AnonymousClass32W.A02(this.user, getServer());
    }

    public int getAgent() {
        return 0;
    }

    public int getDevice() {
        return 0;
    }

    public String getObfuscatedString() {
        return getRawString();
    }

    public final String getUser() {
        return this.user;
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        A1X[0] = this.user;
        A1X[1] = getServer();
        AnonymousClass000.A1N(A1X, getType());
        return Arrays.hashCode(A1X);
    }

    public final boolean isProtocolCompliant() {
        int type = getType();
        if (type == 2 || type == 9 || type == 11 || type == 8) {
            return false;
        }
        return true;
    }

    public String toString() {
        return getObfuscatedString();
    }
}
