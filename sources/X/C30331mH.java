package X;

import android.database.Cursor;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.1mH  reason: invalid class name and case insensitive filesystem */
public abstract class C30331mH extends C624134x {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public C52042kn A04;
    public C52042kn A05;

    public void A1H(int i) {
        C626936e.A0D(false, "Cannot change storage type for add on messages");
    }

    public static C95814uZ A00(C30331mH r0) {
        C52042kn r02 = r0.A05;
        if (r02 == null) {
            return null;
        }
        return r02.A00;
    }

    public static C624134x A01(C30331mH r2, C55832qz r3) {
        return r3.A02.A01(r2.A02);
    }

    public static void A02(C618632o r2, C30591mh r3) {
        List A002 = r2.A09.A00(r3.A1L);
        List list = r3.A06;
        list.clear();
        list.addAll(A002);
    }

    public static void A03(C95814uZ r1, C30331mH r2, AnonymousClass2z0 r3) {
        r2.A05 = new C52042kn(r1, r3);
    }

    public static void A04(C624134x r3, C30331mH r4) {
        r4.A05 = new C52042kn(r3.A0n(), r3.A1J);
    }

    public AnonymousClass2z0 A1v() {
        C52042kn r0 = this.A05;
        if (r0 == null) {
            return null;
        }
        return r0.A01;
    }

    public final void A1w() {
        if (this instanceof C30561me) {
            int i = this.A00;
            if (i != 0) {
                long j = this.A03;
                if (j != 0) {
                    this.A01 = j + (((long) i) * 1000);
                    return;
                }
            }
            this.A01 = 0;
        }
    }

    public void A1x(long j) {
        if (this.A03 <= 0) {
            this.A03 = j;
            A1w();
        }
    }

    public void A1y(Cursor cursor, C623334p r13, HashMap hashMap) {
        long j;
        int A0K = AnonymousClass001.A0K(C18290x4.A0i("_id", hashMap));
        int A0K2 = AnonymousClass001.A0K(C18290x4.A0i("sender_jid_row_id", hashMap));
        int A0K3 = AnonymousClass001.A0K(C18290x4.A0i("parent_message_row_id", hashMap));
        int A0K4 = AnonymousClass001.A0K(C18290x4.A0i("status", hashMap));
        int A0K5 = AnonymousClass001.A0K(C18290x4.A0i("server_timestamp", hashMap));
        int A0K6 = AnonymousClass001.A0K(C18290x4.A0i("expiry_duration_in_secs", hashMap));
        long j2 = cursor.getLong(A0K);
        long j3 = cursor.getLong(A0K2);
        long j4 = cursor.getLong(A0K3);
        int i = cursor.getInt(A0K4);
        if (cursor.isNull(A0K5)) {
            j = 0;
        } else {
            j = cursor.getLong(A0K5);
        }
        int A012 = C18290x4.A01(cursor, A0K6);
        this.A1L = j2;
        this.A1M = j2;
        A1J((C95814uZ) r13.A0B(C95814uZ.class, j3));
        this.A02 = j4;
        A1G(i);
        A1x(j);
        if (this instanceof C30561me) {
            this.A00 = A012;
            A1w();
        }
    }

    public boolean A1z() {
        if ((this instanceof C30581mg) || (this instanceof C30571mf) || (this instanceof C30591mh)) {
            return true;
        }
        if ((this instanceof C30561me) || (this instanceof C30551md)) {
            return false;
        }
        if ((this instanceof C30531mb) || !(this instanceof C30541mc)) {
            return true;
        }
        return false;
    }

    public C30331mH(AnonymousClass2z0 r1, byte b, long j) {
        super(r1, b, j);
    }
}
