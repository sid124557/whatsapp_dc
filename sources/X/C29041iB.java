package X;

import android.content.ContentValues;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1iB  reason: invalid class name and case insensitive filesystem */
public class C29041iB extends C61102zi implements AnonymousClass4DA {
    public C48932fi A00;
    public DeviceJid A01;
    public Comparator A02 = new AnonymousClass4IU(13);
    public boolean A03;
    public final Handler A04 = AnonymousClass000.A0A();
    public final C116985rC A05;
    public final C55682qk A06;
    public final AnonymousClass2E9 A07;
    public final AnonymousClass2EA A08;
    public final C159027ky A09;
    public final C56972sr A0A;
    public final C613730l A0B;
    public final C50862it A0C;
    public final C56612sH A0D;
    public final C54292oU A0E;
    public final AnonymousClass33p A0F;
    public final C620733j A0G;
    public final C621133n A0H;
    public final C48972fm A0I;
    public final C53632nP A0J;
    public final C56522s7 A0K;
    public final AnonymousClass31C A0L;
    public final C66653Mg A0M;
    public final C72173dI A0N;
    public final AnonymousClass4FS A0O;
    public final Object A0P = AnonymousClass002.A0D();
    public final Map A0Q = AnonymousClass001.A0t();
    public final Set A0R = AnonymousClass002.A0K();

    public AnonymousClass33G A09(int i) {
        if (i > 0 && C66653Mg.A00(this.A0M)) {
            C172878Nf A0M2 = C18310x6.A0M(this.A0K.A04.A00());
            while (A0M2.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0M2);
                if (AnonymousClass0x9.A0R(A0w).getDevice() == i) {
                    return (AnonymousClass33G) A0w.getValue();
                }
            }
        }
        return null;
    }

    public final AnonymousClass3TN A0B(C129526aS r4, String str, boolean z, boolean z2) {
        C626936e.A0D(!AnonymousClass367.A02(new AnonymousClass4KE(0), r4), "companion-device-manager/hostedDevice present when not supported in build");
        return new AnonymousClass3TN(new AnonymousClass3H5(this, z2, z), C64333Db.A5u(this.A08.A00.A01), str);
    }

    public C29041iB(C116985rC r4, C55682qk r5, AnonymousClass2E9 r6, AnonymousClass2EA r7, C159027ky r8, C56972sr r9, C613730l r10, C50862it r11, C56612sH r12, C54292oU r13, AnonymousClass33p r14, C620733j r15, C621133n r16, C48972fm r17, C53632nP r18, C56522s7 r19, AnonymousClass31C r20, C66653Mg r21, AnonymousClass4FS r22, C183538qC r23) {
        super(r23);
        this.A0D = r12;
        this.A0C = r11;
        this.A06 = r5;
        this.A0A = r9;
        this.A0E = r13;
        AnonymousClass4FS r2 = r22;
        this.A0O = r2;
        this.A0K = r19;
        this.A0L = r20;
        this.A0I = r17;
        this.A0G = r15;
        this.A0M = r21;
        this.A0H = r16;
        this.A05 = r4;
        this.A0F = r14;
        this.A09 = r8;
        this.A0B = r10;
        this.A0J = r18;
        this.A0N = new C72173dI(r2, true);
        this.A07 = r6;
        this.A08 = r7;
    }

    public AnonymousClass3XA A08() {
        AnonymousClass3XA r3 = new AnonymousClass3XA();
        if (!C66653Mg.A00(this.A0M)) {
            r3.A05(Boolean.FALSE);
            return r3;
        }
        C18270x1.A0w(new AnonymousClass4HU(r3, 1, this), this.A0O);
        return r3;
    }

    public final AnonymousClass33G A0A(DeviceJid deviceJid) {
        if (!C66653Mg.A00(this.A0M)) {
            return null;
        }
        return (AnonymousClass33G) this.A0K.A04.A00().get(deviceJid);
    }

    public List A0C() {
        if (!C66653Mg.A00(this.A0M)) {
            return AnonymousClass001.A0s();
        }
        return AnonymousClass002.A0J(this.A0K.A04.A00().values());
    }

    public List A0D() {
        if (!C66653Mg.A00(this.A0M)) {
            return AnonymousClass001.A0s();
        }
        return AnonymousClass002.A0J(this.A0K.A00().values());
    }

    public final void A0E(Location location, AnonymousClass33G r13) {
        AnonymousClass33G r0;
        String str = null;
        try {
            List<Address> fromLocation = new Geocoder(this.A0E.A00, C620733j.A02(this.A0G)).getFromLocation(location.getLatitude(), location.getLongitude(), 1);
            if (fromLocation != null) {
                for (Address locality : fromLocation) {
                    str = locality.getLocality();
                    if (!TextUtils.isEmpty(str)) {
                        break;
                    }
                }
            }
        } catch (IOException | IllegalArgumentException unused) {
        }
        if (!TextUtils.isEmpty(str)) {
            C56522s7 r02 = this.A0K;
            DeviceJid deviceJid = r13.A07;
            C49012fq r3 = r02.A04;
            ContentValues A062 = AnonymousClass0x9.A06();
            A062.put("place_name", str);
            C85284Fq A0C2 = r3.A02.A0C();
            try {
                ((AnonymousClass3H0) A0C2).A03.A05(A062, "devices", "device_id = ?", "setDevicePlaceName/UPDATE_DEVICES", C18270x1.A1a(deviceJid));
                synchronized (r3) {
                    AnonymousClass8OQ r03 = r3.A00;
                    if (!(r03 == null || (r0 = (AnonymousClass33G) r03.get(deviceJid)) == null)) {
                        r0.A03 = str;
                    }
                }
                A0C2.close();
                A0H(r13);
            } catch (Throwable th) {
                try {
                    A0C2.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
    }

    public final void A0J(String str) {
        synchronized (this.A0P) {
            C48932fi r2 = this.A00;
            if (r2 != null) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("companion-device-manager/device login canceled: ");
                C18260x0.A0o(r2.A02.A07, A0o);
                A0I(this.A00.A02.A07, str, true, false);
                this.A00 = null;
                this.A03 = false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0086, code lost:
        if (r1 != false) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0L(X.AnonymousClass8OQ r12, boolean r13, boolean r14) {
        /*
            r11 = this;
            java.lang.String r0 = "companion-device-manager/refreshDevices"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2s7 r0 = r11.A0K
            X.8OQ r2 = r0.A00()
            r9 = r2
            java.lang.Object r6 = r11.A0P
            monitor-enter(r6)
            X.2fi r0 = r11.A00     // Catch:{ all -> 0x0197 }
            if (r0 == 0) goto L_0x0025
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x0197 }
            r1.<init>(r2)     // Catch:{ all -> 0x0197 }
            X.2fi r0 = r11.A00     // Catch:{ all -> 0x0197 }
            X.33G r0 = r0.A02     // Catch:{ all -> 0x0197 }
            com.whatsapp.jid.DeviceJid r0 = r0.A07     // Catch:{ all -> 0x0197 }
            r1.remove(r0)     // Catch:{ all -> 0x0197 }
            X.8OQ r9 = X.AnonymousClass8OQ.copyOf((java.util.Map) r1)     // Catch:{ all -> 0x0197 }
        L_0x0025:
            monitor-exit(r6)     // Catch:{ all -> 0x0197 }
            r5 = 1
            r4 = 0
            if (r12 == 0) goto L_0x0188
            X.6aP r3 = new X.6aP
            r3.<init>()
            X.8Nf r8 = X.C18310x6.A0M(r9)
        L_0x0033:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0067
            java.util.Map$Entry r7 = X.AnonymousClass001.A0w(r8)
            java.lang.Object r0 = r7.getKey()
            boolean r0 = r12.containsKey(r0)
            if (r0 == 0) goto L_0x005f
            if (r13 == 0) goto L_0x0033
            java.lang.Object r0 = r7.getKey()
            java.lang.Object r0 = r12.get(r0)
            int r1 = X.AnonymousClass001.A0K(r0)
            java.lang.Object r0 = r7.getValue()
            X.33G r0 = (X.AnonymousClass33G) r0
            int r0 = r0.A04
            if (r1 == r0) goto L_0x0033
        L_0x005f:
            java.lang.Object r0 = r7.getKey()
            r3.add((java.lang.Object) r0)
            goto L_0x0033
        L_0x0067:
            X.6aS r7 = r3.build()
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x008c
            int r1 = r7.size()
            int r0 = r9.size()
            boolean r1 = X.AnonymousClass000.A1U(r1, r0)
            X.2sr r0 = r11.A0A
            boolean r0 = r0.A0Y()
            if (r0 != 0) goto L_0x0088
            r0 = 1
            if (r1 == 0) goto L_0x0089
        L_0x0088:
            r0 = 0
        L_0x0089:
            r11.A0G(r7, r0)
        L_0x008c:
            java.util.HashMap r3 = X.AnonymousClass001.A0t()
            X.8Nf r9 = X.C18310x6.A0M(r12)
        L_0x0094:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00d0
            java.util.Map$Entry r8 = X.AnonymousClass001.A0w(r9)
            java.lang.Object r1 = r8.getKey()
            X.2sr r0 = r11.A0A
            X.6kH r0 = X.C56972sr.A03(r0)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0094
            java.lang.Object r0 = r8.getKey()
            boolean r0 = r2.containsKey(r0)
            if (r0 == 0) goto L_0x00cc
            if (r13 == 0) goto L_0x0094
            java.lang.Object r0 = r8.getKey()
            java.lang.Object r0 = r2.get(r0)
            X.33G r0 = (X.AnonymousClass33G) r0
            int r1 = r0.A04
            int r0 = X.AnonymousClass0x2.A08(r8)
            if (r1 == r0) goto L_0x0094
        L_0x00cc:
            X.C18270x1.A1N(r3, r8)
            goto L_0x0094
        L_0x00d0:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0183
            java.util.Iterator r10 = X.AnonymousClass001.A0u(r3)
        L_0x00da:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0183
            java.util.Map$Entry r8 = X.AnonymousClass001.A0w(r10)
            monitor-enter(r6)
            X.2fi r0 = r11.A00     // Catch:{ all -> 0x0180 }
            if (r0 == 0) goto L_0x011f
            X.33G r0 = r0.A02     // Catch:{ all -> 0x0180 }
            com.whatsapp.jid.DeviceJid r1 = r0.A07     // Catch:{ all -> 0x0180 }
            java.lang.Object r0 = r8.getKey()     // Catch:{ all -> 0x0180 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0180 }
            if (r0 == 0) goto L_0x011f
            if (r14 == 0) goto L_0x017d
            X.2fi r9 = r11.A00     // Catch:{ all -> 0x0180 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = "companion-device-manager/device registered: "
            r1.append(r0)     // Catch:{ all -> 0x0180 }
            X.33G r0 = r9.A02     // Catch:{ all -> 0x0180 }
            com.whatsapp.jid.DeviceJid r0 = r0.A07     // Catch:{ all -> 0x0180 }
            X.C18260x0.A0o(r0, r1)     // Catch:{ all -> 0x0180 }
            java.util.Iterator r1 = X.C61102zi.A03(r11)     // Catch:{ all -> 0x0180 }
        L_0x010f:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0180 }
            if (r0 == 0) goto L_0x0155
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0180 }
            X.4FJ r0 = (X.AnonymousClass4FJ) r0     // Catch:{ all -> 0x0180 }
            r0.BR2(r9)     // Catch:{ all -> 0x0180 }
            goto L_0x010f
        L_0x011f:
            X.2sr r0 = r11.A0A     // Catch:{ all -> 0x0180 }
            boolean r0 = r0.A0Y()     // Catch:{ all -> 0x0180 }
            if (r0 == 0) goto L_0x0131
            X.3dI r2 = r11.A0N     // Catch:{ all -> 0x0180 }
            r0 = 14
            X.3bx r1 = new X.3bx     // Catch:{ all -> 0x0180 }
            r1.<init>(r11, r0, r8)     // Catch:{ all -> 0x0180 }
            goto L_0x017a
        L_0x0131:
            com.whatsapp.jid.DeviceJid r1 = X.AnonymousClass0x9.A0Q(r8)     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = "unknown_companion"
            r11.A0I(r1, r0, r5, r4)     // Catch:{ all -> 0x0180 }
            X.2qk r8 = r11.A06     // Catch:{ all -> 0x0180 }
            java.lang.String r2 = "ContactSyncDevicesUpdater/update add unknown device of self"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = "toAdd="
            r1.append(r0)     // Catch:{ all -> 0x0180 }
            java.util.Set r0 = r3.keySet()     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = X.AnonymousClass000.A0R(r0, r1)     // Catch:{ all -> 0x0180 }
            r8.A0A(r2, r4, r0)     // Catch:{ all -> 0x0180 }
            goto L_0x017d
        L_0x0155:
            X.30l r2 = r11.A0B     // Catch:{ all -> 0x0180 }
            android.content.SharedPreferences$Editor r1 = X.C613730l.A00(r2)     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = "syncd_last_fatal_error_time"
            X.C18270x1.A0g(r1, r0)     // Catch:{ all -> 0x0180 }
            X.2sH r0 = r11.A0D     // Catch:{ all -> 0x0180 }
            long r0 = r0.A0H()     // Catch:{ all -> 0x0180 }
            android.content.SharedPreferences$Editor r8 = X.C613730l.A00(r2)     // Catch:{ all -> 0x0180 }
            java.lang.String r2 = "syncd_last_device_reg_time"
            X.C18270x1.A0i(r8, r2, r0)     // Catch:{ all -> 0x0180 }
            X.3dI r2 = r11.A0N     // Catch:{ all -> 0x0180 }
            r0 = 15
            X.3bx r1 = new X.3bx     // Catch:{ all -> 0x0180 }
            r1.<init>(r11, r0, r9)     // Catch:{ all -> 0x0180 }
        L_0x017a:
            r2.execute(r1)     // Catch:{ all -> 0x0180 }
        L_0x017d:
            monitor-exit(r6)     // Catch:{ all -> 0x0180 }
            goto L_0x00da
        L_0x0180:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0180 }
            throw r0
        L_0x0183:
            boolean r0 = X.AnonymousClass0x7.A1S(r7)
            return r0
        L_0x0188:
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0196
            X.6aS r0 = r9.keySet()
            r11.A0G(r0, r4)
            return r5
        L_0x0196:
            return r4
        L_0x0197:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0197 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29041iB.A0L(X.8OQ, boolean, boolean):boolean");
    }

    public boolean A0M(DeviceJid deviceJid) {
        boolean z;
        synchronized (this.A0P) {
            DeviceJid deviceJid2 = this.A01;
            if (deviceJid2 == null || !deviceJid2.equals(deviceJid)) {
                C48932fi r0 = this.A00;
                if (r0 == null || !r0.A02.A07.equals(deviceJid) || !this.A03) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public boolean BFA(Message message, int i) {
        long A0H2;
        if (i != 213) {
            return false;
        }
        if (message == null) {
            return true;
        }
        AnonymousClass36K r4 = (AnonymousClass36K) message.obj;
        DeviceJid deviceJid = (DeviceJid) r4.A0h(DeviceJid.class, "from");
        if (deviceJid != null) {
            if (this.A0A.A0b(deviceJid)) {
                C18260x0.A1P(AnonymousClass001.A0o(), "companion-device-manager/onReceiveDevicePresence: ", deviceJid);
                String A0L2 = AnonymousClass36K.A0L(r4, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                if (A0L2 == null || "available".equals(A0L2)) {
                    A0H2 = this.A0D.A0H();
                    this.A0R.add(deviceJid);
                } else if (!"unavailable".equals(A0L2)) {
                    return true;
                } else {
                    A0H2 = C57522tm.A00(r4);
                    this.A0R.remove(deviceJid);
                }
                if (A0H2 == 0) {
                    return true;
                }
                this.A0O.BkM(new C70283aF(this, deviceJid, 10, A0H2));
                return true;
            }
        }
        Log.d("Invalid device presence");
        return true;
    }

    public static boolean A00(C29041iB r0) {
        return !r0.A0D().isEmpty();
    }

    public final void A0F(C129526aS r3) {
        Iterator A032 = C61102zi.A03(this);
        while (A032.hasNext()) {
            ((AnonymousClass4FJ) A032.next()).BR3(r3);
        }
    }

    public void A0G(C129526aS r3, boolean z) {
        C18260x0.A1R(AnonymousClass001.A0o(), "companion-device-manager/onDeviceRemovedByServer/devices: ", r3);
        C626936e.A0D(!AnonymousClass367.A02(new AnonymousClass4KE(0), r3), "companion-device-manager/hostedDevice present when not supported in build");
        Log.i("companion-device-manager/onDeviceRemovedByServer/removing device locally");
        this.A0N.execute(new C71423c5(r3, this, z));
    }

    public final void A0H(AnonymousClass33G r3) {
        Iterator A032 = C61102zi.A03(this);
        while (A032.hasNext()) {
            ((AnonymousClass4FJ) A032.next()).BR4(r3);
        }
    }

    public void A0I(DeviceJid deviceJid, String str, boolean z, boolean z2) {
        if (C627336j.A0L(deviceJid)) {
            C18260x0.A1R(AnonymousClass001.A0o(), "companion-device-manager/logoutDeviceAndNotify: skipping LID device: ", deviceJid);
            return;
        }
        if (!(str == "user_initiated" || str == "smb_subscription_deactivated" || str == "account_sync_timeout" || str == "critical_sync_timeout" || str == "syncd_error_during_bootstrap")) {
            Map map = this.A0Q;
            if (map.containsKey(deviceJid) && this.A0D.A0H() - C18290x4.A0C(deviceJid, map) < 3600000) {
                C18260x0.A1P(AnonymousClass001.A0o(), "companion-device-manager/logoutDeviceAndNotify: recently send the logout iq, deviceJid=", deviceJid);
                return;
            }
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("companion-device-manager/logoutDeviceAndNotify: ");
        A0o.append(deviceJid);
        A0o.append(", removalReason ");
        A0o.append(str);
        C18260x0.A1E(", remove on error: ", A0o, z);
        AnonymousClass0x2.A1K(deviceJid, this.A0Q, this.A0D.A0H());
        A0B(C129526aS.of(deviceJid), str, z, z2).A00(deviceJid);
    }

    public void A0K(String str, boolean z) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("companion-device-manager/logoutAllCompanionDevicesAndNotify/remove on error: ");
        boolean z2 = z;
        A0o.append(z2);
        C18260x0.A0s(", removalReason ", str, A0o);
        C129526aS keySet = this.A0K.A04.A00().keySet();
        if (keySet.isEmpty()) {
            A0F(keySet);
            return;
        }
        AnonymousClass3TN A0B2 = A0B(keySet, str, z2, false);
        A0B2.A00 = keySet;
        AnonymousClass31C r7 = A0B2.A02;
        String A032 = r7.A03();
        String str2 = A0B2.A03;
        AnonymousClass39V[] r2 = new AnonymousClass39V[2];
        AnonymousClass39V.A0B("all", "true", r2, 0);
        boolean A0G2 = AnonymousClass39V.A0G("reason", str2, r2);
        AnonymousClass36K A0I2 = AnonymousClass36K.A0I("remove-companion-device", r2);
        AnonymousClass39V[] A1W = AnonymousClass0x9.A1W();
        AnonymousClass39V.A0E(A1W, 0);
        AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, A1W, A0G2 ? 1 : 0);
        AnonymousClass39V.A0B("xmlns", "md", A1W, 2);
        boolean A0K2 = r7.A0K(A0B2, AnonymousClass36K.A0E(A0I2, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", A1W), A032, 237, 32000);
        C18260x0.A1E("app/sendRemoveAllDevicesRequest success: ", AnonymousClass001.A0o(), A0K2);
        if (!A0K2) {
            A0B2.A01.BS2(keySet, -1);
        }
    }

    public int[] B81() {
        int[] A0E2 = C18330xA.A0E();
        A0E2[0] = 213;
        return A0E2;
    }
}
