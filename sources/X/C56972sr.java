package X;

import com.whatsapp.Me;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2sr  reason: invalid class name and case insensitive filesystem */
public class C56972sr {
    public Me A00;
    public AnonymousClass1RR A01;
    public C135136kB A02;
    public C27981fH A03;
    public C135196kH A04;
    public PhoneUserJid A05;
    public String A06;
    public boolean A07 = false;
    public final C28731hg A08;
    public final C44872Xu A09;
    public final C55992rF A0A = new C55992rF();
    public final C54292oU A0B;
    public final AnonymousClass33p A0C;
    public final C54412og A0D;
    public final List A0E = AnonymousClass001.A0s();

    public static boolean A0B(C56972sr r1, List list) {
        return r1.A0a((C95814uZ) list.get(0));
    }

    public synchronized C135136kB A0G() {
        A0Q();
        return this.A02;
    }

    public synchronized C27981fH A0H() {
        A0Q();
        return this.A03;
    }

    public synchronized C27981fH A0I() {
        C27981fH r0;
        A0Q();
        r0 = this.A03;
        C626936e.A06(r0);
        return r0;
    }

    public synchronized String A0L() {
        String A0v;
        A0v = AnonymousClass0x9.A0v(AnonymousClass0x2.A0F(this.A0C), "self_display_name");
        if (C107575bX.A0F(A0v)) {
            return null;
        }
        return A0v;
    }

    public final synchronized void A0Q() {
        if (!this.A07) {
            A0U(AnonymousClass32W.A00(AnonymousClass0x9.A0v(AnonymousClass0x2.A0F(this.A0C), "self_lid")));
            this.A07 = true;
        }
    }

    public synchronized void A0T(Jid jid) {
        if (!jid.equals(A0H()) && ((jid instanceof C27981fH) || (jid instanceof C135136kB))) {
            AnonymousClass33p r0 = this.A0C;
            C18270x1.A0j(C18270x1.A03(r0), "self_lid", jid.getRawString());
            A0U(jid);
        }
    }

    public final synchronized void A0U(Jid jid) {
        C135136kB r0;
        if (jid instanceof C27981fH) {
            C27981fH r3 = (C27981fH) jid;
            this.A03 = r3;
            try {
                int A022 = C18280x3.A02(this.A09.A01.A01, "registration_device_id");
                if (A022 == 99) {
                    r0 = new C28061fQ(r3, A022);
                } else {
                    r0 = new C135136kB(r3, A022);
                }
                this.A02 = r0;
            } catch (AnonymousClass24P e) {
                Log.w("memanager/setMyLidDeviceJid/invalid_jid_error", e);
            }
        } else if (jid instanceof C135136kB) {
            C135136kB r32 = (C135136kB) jid;
            UserJid userJid = r32.userJid;
            C162457s7.A0K(userJid, "null cannot be cast to non-null type com.whatsapp.jid.LidUserJid");
            this.A03 = (C27981fH) userJid;
            this.A02 = r32;
        }
    }

    public synchronized void A0X(String str) {
        C18270x1.A0j(C18270x1.A03(this.A0C), "self_display_name", str);
    }

    public static boolean A08(C56972sr r1, AnonymousClass3ZH r2) {
        return r1.A0a(r2.A0H);
    }

    public static boolean A09(C56972sr r1, DeviceJid deviceJid) {
        return r1.A0a(deviceJid.userJid);
    }

    public static boolean A0C(C65203Gp r0) {
        return r0.A06.A0Y();
    }

    public int A0D() {
        return C18280x3.A02(this.A09.A01.A01, "registration_device_id");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0042 A[SYNTHETIC, Splitter:B:26:0x0042] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.whatsapp.Me A0E() {
        /*
            r5 = this;
            java.lang.String r0 = "memanager/getoldme"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r5.A0P()
            X.2oU r0 = r5.A0B
            android.content.Context r2 = r0.A00
            java.io.File r0 = r2.getFilesDir()
            java.lang.String r1 = "me_old"
            boolean r0 = X.C18300x5.A1V(r0, r1)
            r4 = 0
            if (r0 == 0) goto L_0x005f
            java.io.FileInputStream r3 = r2.openFileInput(r1)     // Catch:{ ClassNotFoundException -> 0x0055, IOException -> 0x004b }
            X.200 r2 = new X.200     // Catch:{ all -> 0x003c }
            r2.<init>(r5, r3)     // Catch:{ all -> 0x003c }
            java.lang.Object r0 = r2.readObject()     // Catch:{ all -> 0x0032 }
            com.whatsapp.Me r0 = (com.whatsapp.Me) r0     // Catch:{ all -> 0x0032 }
            r2.close()     // Catch:{ all -> 0x003e }
            if (r3 == 0) goto L_0x0031
            r3.close()     // Catch:{ ClassNotFoundException -> 0x0057, IOException -> 0x004d }
            return r0
        L_0x0031:
            return r0
        L_0x0032:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0037 }
            goto L_0x003b
        L_0x0037:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x003c }
        L_0x003b:
            throw r1     // Catch:{ all -> 0x003c }
        L_0x003c:
            r1 = move-exception
            goto L_0x0040
        L_0x003e:
            r1 = move-exception
            r4 = r0
        L_0x0040:
            if (r3 == 0) goto L_0x004a
            r3.close()     // Catch:{ all -> 0x0046 }
            goto L_0x004a
        L_0x0046:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ ClassNotFoundException -> 0x0055, IOException -> 0x004b }
        L_0x004a:
            throw r1     // Catch:{ ClassNotFoundException -> 0x0055, IOException -> 0x004b }
        L_0x004b:
            r1 = move-exception
            goto L_0x004f
        L_0x004d:
            r1 = move-exception
            r4 = r0
        L_0x004f:
            java.lang.String r0 = "memanager/read_old_me/io_error"
            com.whatsapp.util.Log.e(r0, r1)
            return r4
        L_0x0055:
            r1 = move-exception
            goto L_0x0059
        L_0x0057:
            r1 = move-exception
            r4 = r0
        L_0x0059:
            java.lang.String r0 = "memanager/read_old_me/serialization_error"
            com.whatsapp.util.Log.w(r0, r1)
            return r4
        L_0x005f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56972sr.A0E():com.whatsapp.Me");
    }

    public String A0K() {
        String str = this.A06;
        if (str == null) {
            str = AnonymousClass0x2.A0F(this.A0C).getString("self_user_name", "");
            if (str.isEmpty()) {
                return "";
            }
            this.A06 = str;
        }
        return str;
    }

    public void A0M() {
        Log.i("memanager/clearMe");
        A0R((Me) null);
    }

    public void A0N() {
        Log.i("memanager/deleteoldme");
        A0P();
        C18310x6.A1F(C54292oU.A03(this.A0B), "me");
    }

    public void A0O() {
        Log.i("memanager/deleteoldme");
        A0P();
        C18310x6.A1F(C54292oU.A03(this.A0B), "me_old");
    }

    public void A0P() {
        C55992rF r2 = this.A0A;
        if (r2.A05()) {
            r2.A04(new AnonymousClass4IH(this, 0));
            r2.A00();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d A[Catch:{ 24P -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0015 A[Catch:{ 24P -> 0x0042 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0S(com.whatsapp.Me r6) {
        /*
            r5 = this;
            r5.A00 = r6
            r4 = 0
            r2 = 0
            if (r6 == 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            r3 = r2
            goto L_0x0011
        L_0x0009:
            java.lang.String r0 = r6.jabber_id     // Catch:{ 24P -> 0x0042 }
            if (r0 == 0) goto L_0x0007
            com.whatsapp.jid.PhoneUserJid r3 = X.AnonymousClass32X.A00(r0)     // Catch:{ 24P -> 0x0042 }
        L_0x0011:
            r5.A05 = r3     // Catch:{ 24P -> 0x0042 }
            if (r3 == 0) goto L_0x002d
            X.2Xu r0 = r5.A09     // Catch:{ 24P -> 0x0042 }
            X.2og r0 = r0.A01     // Catch:{ 24P -> 0x0042 }
            android.content.SharedPreferences r1 = r0.A01     // Catch:{ 24P -> 0x0042 }
            java.lang.String r0 = "registration_device_id"
            int r1 = r1.getInt(r0, r4)     // Catch:{ 24P -> 0x0042 }
            X.32r r0 = com.whatsapp.jid.DeviceJid.Companion     // Catch:{ 24P -> 0x0042 }
            com.whatsapp.jid.DeviceJid r0 = r0.A01(r3, r1)     // Catch:{ 24P -> 0x0042 }
            X.6kH r0 = (X.C135196kH) r0     // Catch:{ 24P -> 0x0042 }
            r5.A04 = r0     // Catch:{ 24P -> 0x0042 }
            goto L_0x005e
        L_0x002d:
            r5.A04 = r2     // Catch:{ 24P -> 0x0042 }
            X.2Xu r0 = r5.A09     // Catch:{ 24P -> 0x0042 }
            X.2og r0 = r0.A01     // Catch:{ 24P -> 0x0042 }
            android.content.SharedPreferences$Editor r1 = X.C54412og.A00(r0)     // Catch:{ 24P -> 0x0042 }
            java.lang.String r0 = "registration_device_id"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r4)     // Catch:{ 24P -> 0x0042 }
            r0.commit()     // Catch:{ 24P -> 0x0042 }
            goto L_0x005e
        L_0x0042:
            r1 = move-exception
            java.lang.String r0 = "memanager/setMe/invalid_jid_error"
            com.whatsapp.util.Log.e(r0, r1)
            r5.A05 = r2
            r5.A04 = r2
            X.2Xu r0 = r5.A09
            X.2og r0 = r0.A01
            android.content.SharedPreferences$Editor r1 = X.C54412og.A00(r0)
            java.lang.String r0 = "registration_device_id"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r4)
            r0.commit()
        L_0x005e:
            com.whatsapp.jid.PhoneUserJid r0 = r5.A05
            if (r0 != 0) goto L_0x009d
            r5.A01 = r2
        L_0x0064:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "memanager/setMe me: "
            r1.append(r0)
            com.whatsapp.Me r0 = r5.A00
            r1.append(r0)
            java.lang.String r0 = ", myUserJid: "
            r1.append(r0)
            com.whatsapp.jid.PhoneUserJid r0 = r5.A05
            r1.append(r0)
            java.lang.String r0 = ", myDeviceJid: "
            r1.append(r0)
            X.6kH r0 = r5.A04
            X.C18260x0.A0o(r0, r1)
            java.util.List r0 = r5.A0E
            java.util.Iterator r1 = r0.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c5
            r1.next()
            java.lang.String r0 = "onChange"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x009d:
            X.1RR r1 = new X.1RR
            r1.<init>(r0)
            r5.A01 = r1
            X.2og r3 = r5.A0D
            android.content.SharedPreferences r2 = r3.A01
            java.lang.String r0 = "profile_photo_thumb_id"
            int r0 = r2.getInt(r0, r4)
            r1.A06 = r0
            X.1RR r1 = r5.A01
            java.lang.String r0 = "profile_photo_full_id"
            int r0 = r2.getInt(r0, r4)
            r1.A05 = r0
            X.1RR r1 = r5.A01
            java.lang.String r0 = r3.A03()
            r1.A0b = r0
            goto L_0x0064
        L_0x00c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56972sr.A0S(com.whatsapp.Me):void");
    }

    public void A0V(String str) {
        String str2 = this.A06;
        if (!str.equals(str2)) {
            if (str2 == null) {
                str2 = "";
            }
            C18270x1.A0j(C18270x1.A03(this.A0C), "self_user_name", str);
            this.A06 = str;
            C28731hg r1 = this.A08;
            AnonymousClass1fY r2 = AnonymousClass1fY.A00;
            C162457s7.A0J(str2, 1);
            Iterator A032 = C61102zi.A03(r1);
            while (A032.hasNext()) {
                ((AnonymousClass494) A032.next()).BfB(r2, str2, str);
            }
        }
    }

    public void A0W(String str) {
        C18270x1.A0j(C54412og.A00(this.A0D), "push_name", str);
        AnonymousClass1RR A012 = A01(this);
        if (A012 != null) {
            A012.A0b = str;
        }
    }

    public boolean A0a(C95814uZ r2) {
        if (r2 == null) {
            return false;
        }
        if (r2.equals(A04(this)) || r2.equals(A0H())) {
            return true;
        }
        return false;
    }

    public boolean A0b(DeviceJid deviceJid) {
        if (deviceJid == null || !A09(this, deviceJid) || !AnonymousClass0x9.A1P(deviceJid)) {
            return false;
        }
        return true;
    }

    public C56972sr(C28731hg r2, C44872Xu r3, C54292oU r4, AnonymousClass33p r5, C54412og r6) {
        this.A0B = r4;
        this.A08 = r2;
        this.A0C = r5;
        this.A09 = r3;
        this.A0D = r6;
    }

    public static Me A00(C56972sr r0) {
        r0.A0P();
        return r0.A00;
    }

    public static AnonymousClass1RR A01(C56972sr r0) {
        r0.A0P();
        return r0.A01;
    }

    public static C135196kH A02(C56972sr r0) {
        r0.A0P();
        C135196kH r02 = r0.A04;
        C626936e.A06(r02);
        return r02;
    }

    public static C135196kH A03(C56972sr r0) {
        r0.A0P();
        return r0.A04;
    }

    public static PhoneUserJid A04(C56972sr r0) {
        r0.A0P();
        return r0.A05;
    }

    public static PhoneUserJid A05(C56972sr r0) {
        r0.A0P();
        PhoneUserJid phoneUserJid = r0.A05;
        C626936e.A06(phoneUserJid);
        return phoneUserJid;
    }

    public static String A06(C56972sr r0) {
        r0.A0P();
        PhoneUserJid phoneUserJid = r0.A05;
        C626936e.A06(phoneUserJid);
        return phoneUserJid.getRawString();
    }

    public static void A07(C56972sr r0) {
        C626936e.A0C(!r0.A0Y());
    }

    public static boolean A0A(C56972sr r1, C624134x r2) {
        return r1.A0a(r2.A0n());
    }

    public Me A0F() {
        return A00(this);
    }

    public PhoneUserJid A0J() {
        return A04(this);
    }

    public void A0R(Me me) {
        A0P();
        A0S(me);
    }

    public boolean A0Y() {
        A0P();
        return AnonymousClass001.A1W(C18280x3.A02(this.A09.A01.A01, "registration_device_id"));
    }

    public final boolean A0Z(Me me, String str) {
        StringBuilder sb;
        String str2;
        ObjectOutputStream objectOutputStream;
        C18260x0.A0s("memanager/save ", str, AnonymousClass001.A0o());
        try {
            objectOutputStream = new ObjectOutputStream(this.A0B.A00.openFileOutput(str, 0));
            objectOutputStream.writeObject(me);
            objectOutputStream.close();
            return true;
        } catch (FileNotFoundException e) {
            e = e;
            sb = AnonymousClass001.A0o();
            str2 = "memanager/save/notfounderror ";
            C18260x0.A0u(str2, str, sb, e);
            return false;
        } catch (IOException e2) {
            e = e2;
            sb = AnonymousClass001.A0o();
            str2 = "memanager/save/ioerror ";
            C18260x0.A0u(str2, str, sb, e);
            return false;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public boolean A0c(DeviceJid deviceJid) {
        if (deviceJid.equals(A03(this)) || deviceJid.equals(A0G())) {
            return true;
        }
        return false;
    }
}
