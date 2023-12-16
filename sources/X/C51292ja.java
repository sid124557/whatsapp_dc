package X;

import android.net.Uri;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

/* renamed from: X.2ja  reason: invalid class name and case insensitive filesystem */
public final class C51292ja {
    public AnonymousClass33T A00;
    public AnonymousClass1VX A01;

    public final String A00(AnonymousClass3ZH r2, AnonymousClass1R1 r3) {
        C56802sa r0;
        C162457s7.A0J(r3, 0);
        Jid A0I = r2.A0I(C95814uZ.class);
        if (A0I != null) {
            r0 = AnonymousClass1R1.A00(A0I, r3);
        } else {
            r0 = null;
        }
        C32501qy r02 = (C32501qy) r0;
        if (r02 != null) {
            return r02.A0C();
        }
        return null;
    }

    public final String A01(AnonymousClass3ZH r2, AnonymousClass1R1 r3) {
        C56802sa r0;
        C162457s7.A0J(r3, 0);
        Jid A0I = r2.A0I(C95814uZ.class);
        if (A0I != null) {
            r0 = AnonymousClass1R1.A00(A0I, r3);
        } else {
            r0 = null;
        }
        C32501qy r02 = (C32501qy) r0;
        if (r02 != null) {
            return r02.A0D();
        }
        return null;
    }

    public final String A02(AnonymousClass3ZH r15, AnonymousClass1R1 r16) {
        C56802sa r4;
        String str;
        AnonymousClass1R1 r1 = r16;
        C162457s7.A0J(r1, 0);
        Jid A0I = r15.A0I(C95814uZ.class);
        if (A0I != null) {
            r4 = AnonymousClass1R1.A00(A0I, r1);
        } else {
            r4 = null;
        }
        C32501qy r42 = (C32501qy) r4;
        if (this.A01.A0Y(C58422vE.A02, 6307)) {
            if (r42 == null) {
                return null;
            }
            str = "voip_notification";
            String A002 = AnonymousClass35T.A0L.A00(str);
            if (A002 != null) {
                return A002;
            }
        } else if (r42 == null) {
            return null;
        } else {
            C55222q0 r0 = AnonymousClass35T.A0L;
            str = "voip_notification";
            String A003 = r0.A00(str);
            if (A003 != null) {
                AnonymousClass35T r6 = r42.A00;
                String A012 = r0.A01(A003);
                if (!r6.A0K(A003)) {
                    return A003;
                }
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("chat-settings-store/repairVoIPNotificationChannel repairing channel:");
                C18260x0.A1L(A0o, C627336j.A08(A012));
                try {
                    r6.A0I(A012);
                    return r6.A07((Uri) null, r6.A06(str), str, (String) null, (String) null, (String) null, 4);
                } catch (SecurityException unused) {
                    Log.w("chat-settings-store/repairVoIPNotificationChannel SecurityException in deleteNotificationChannel");
                    return A003;
                }
            }
        }
        AnonymousClass35T r2 = r42.A00;
        return r2.A07((Uri) null, r2.A06(str), str, (String) null, (String) null, (String) null, 4);
    }

    public C51292ja(AnonymousClass33T r1, AnonymousClass1VX r2) {
        C18260x0.A0Q(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
