package com.whatsapp.jid;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass1fY;
import X.AnonymousClass24P;
import X.AnonymousClass3Z0;
import X.C162457s7;
import X.C18310x6;
import X.C618932r;

public abstract class DeviceJid extends Jid {
    public static final C618932r Companion = new C618932r();
    public final byte deviceByte;
    public final UserJid userJid;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeviceJid(UserJid userJid2, int i) {
        super(userJid2.user);
        byte b = (byte) i;
        this.userJid = userJid2;
        this.deviceByte = b;
        if (userJid2 == AnonymousClass1fY.A00) {
            throw new AnonymousClass24P((Jid) userJid2);
        } else if (b < 0 || b > 99) {
            throw AnonymousClass24P.A00(AnonymousClass000.A0Y("Invalid device: ", AnonymousClass001.A0o(), b));
        }
    }

    public static final DeviceJid getFromUserJidAndDeviceIdNullable(UserJid userJid2, int i) {
        Object obj;
        C618932r r1 = Companion;
        C162457s7.A0J(userJid2, 0);
        try {
            obj = r1.A01(userJid2, i);
        } catch (Throwable th) {
            obj = AnonymousClass3Z0.A01(th);
        }
        if (obj instanceof AnonymousClass3Z0) {
            obj = null;
        }
        return (DeviceJid) obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r3.length() == 0) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.whatsapp.jid.DeviceJid getNullable(java.lang.String r3) {
        /*
            X.32r r2 = Companion
            if (r3 == 0) goto L_0x000b
            int r0 = r3.length()
            r1 = 0
            if (r0 != 0) goto L_0x000c
        L_0x000b:
            r1 = 1
        L_0x000c:
            r0 = 0
            if (r1 != 0) goto L_0x0013
            com.whatsapp.jid.DeviceJid r0 = r2.A02(r3)     // Catch:{ 24P -> 0x0013 }
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jid.DeviceJid.getNullable(java.lang.String):com.whatsapp.jid.DeviceJid");
    }

    public static final DeviceJid of(Jid jid) {
        if (jid instanceof DeviceJid) {
            return (DeviceJid) jid;
        }
        if (jid instanceof UserJid) {
            return C618932r.A00((UserJid) jid);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C162457s7.A0P(getClass(), obj.getClass()) || !super.equals(obj)) {
            return false;
        }
        DeviceJid deviceJid = (DeviceJid) obj;
        if (getDevice() == deviceJid.getDevice()) {
            return C162457s7.A0P(this.userJid, deviceJid.userJid);
        }
        return false;
    }

    public String getRawString() {
        String str = this.user;
        String server = getServer();
        int agent = getAgent();
        int device = getDevice();
        StringBuilder A0l = AnonymousClass000.A0l(str);
        A0l.append('.');
        A0l.append(agent);
        A0l.append(':');
        A0l.append(device);
        return AnonymousClass0x2.A0e(server, A0l, '@');
    }

    public int getDevice() {
        return this.deviceByte;
    }

    public String getObfuscatedString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        C18310x6.A1P(A0o, this.user);
        A0o.append(':');
        A0o.append(getDevice());
        A0o.append('@');
        return AnonymousClass000.A0X(getServer(), A0o);
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.userJid, super.hashCode() * 31) + getDevice();
    }

    public final boolean isPrimary() {
        return AnonymousClass000.A1T(getDevice());
    }
}
