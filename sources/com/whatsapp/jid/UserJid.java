package com.whatsapp.jid;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x7;
import X.AnonymousClass32Y;
import X.AnonymousClass34X;
import X.C162457s7;
import X.C18300x5;
import X.C18310x6;
import X.C95814uZ;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class UserJid extends C95814uZ implements Cloneable {
    public static final AnonymousClass32Y Companion = new AnonymousClass32Y();
    public static final AnonymousClass34X JID_FACTORY = AnonymousClass34X.A01();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserJid(String str) {
        super(str);
        C162457s7.A0J(str, 1);
    }

    public DeviceJid getPrimaryDevice() {
        return DeviceJid.Companion.A01(this, 0);
    }

    public static final List userJidsFromChatJids(Collection collection) {
        ArrayList A0r = C18300x5.A0r(collection);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            UserJid A05 = AnonymousClass32Y.A05(AnonymousClass0x7.A0S(it));
            if (A05 != null) {
                A0r.add(A05);
            }
        }
        return A0r;
    }

    public Object clone() {
        return super.clone();
    }

    public String getObfuscatedString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        C18310x6.A1P(A0o, this.user);
        A0o.append('@');
        return AnonymousClass000.A0X(getServer(), A0o);
    }
}
