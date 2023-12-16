package X;

import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import java.io.File;
import java.util.List;

/* renamed from: X.1mV  reason: invalid class name and case insensitive filesystem */
public abstract class C30471mV extends C624134x implements AnonymousClass4B9, AnonymousClass4BB {
    public long A00;
    public AnonymousClass33C A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public final Object A0A = AnonymousClass002.A0D();
    public volatile int A0B;
    public volatile C613030d A0C;

    public static AnonymousClass33C A00(C30471mV r0) {
        AnonymousClass33C r02 = r0.A01;
        C626936e.A06(r02);
        return r02;
    }

    public static File A01(C30471mV r0) {
        AnonymousClass33C r02 = r0.A01;
        C626936e.A06(r02);
        return r02.A0F;
    }

    public static void A02(C30471mV r1, int i) {
        if (i == 0) {
            r1.A02 = null;
        }
    }

    public C613030d A1v() {
        if (this.A0C == null && C613030d.A00(AnonymousClass36O.A02(this))) {
            synchronized (this.A0A) {
                if (this.A0C == null) {
                    this.A0C = new C613030d(this);
                }
            }
        }
        return this.A0C;
    }

    public String A1w() {
        C47142cm r0;
        if (this instanceof AnonymousClass1n0) {
            r0 = ((AnonymousClass1n0) this).A00;
        } else if (this instanceof AnonymousClass1p7) {
            r0 = ((AnonymousClass1p7) this).A00;
        } else if (!(this instanceof C30751mx)) {
            return this.A02;
        } else {
            r0 = ((C30751mx) this).A00;
        }
        return r0.A02;
    }

    public String A1x() {
        if (!(this instanceof AnonymousClass1nF)) {
            return this.A06;
        }
        String str = this.A06;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String A022 = C106695a0.A02(this.A05);
        if (TextUtils.isEmpty(A022)) {
            return A1w();
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(A1w());
        return AnonymousClass000.A0V(".", A022, A0o);
    }

    public void A1y(Cursor cursor, AnonymousClass33C r4) {
        this.A01 = r4;
        A1a(AnonymousClass0x2.A0Z(cursor, "multicast_id"));
        this.A05 = AnonymousClass0x2.A0Z(cursor, "mime_type");
        this.A07 = AnonymousClass0x2.A0Z(cursor, "message_url");
        this.A00 = AnonymousClass0x2.A0C(cursor, "file_length");
        this.A06 = AnonymousClass0x2.A0Z(cursor, "media_name");
        this.A04 = AnonymousClass0x2.A0Z(cursor, "file_hash");
        this.A0B = AnonymousClass0x2.A04(cursor, "media_duration");
        this.A03 = AnonymousClass0x2.A0Z(cursor, "enc_file_hash");
    }

    public void A1z(Cursor cursor, AnonymousClass33C r5) {
        this.A01 = r5;
        this.A05 = AnonymousClass0x2.A0Z(cursor, "mime_type");
        this.A07 = AnonymousClass0x2.A0Z(cursor, "message_url");
        this.A00 = AnonymousClass0x2.A0C(cursor, "file_length");
        this.A06 = AnonymousClass0x2.A0Z(cursor, "media_name");
        this.A04 = AnonymousClass0x2.A0Z(cursor, "file_hash");
        this.A0B = AnonymousClass0x2.A04(cursor, "media_duration");
        this.A03 = AnonymousClass0x2.A0Z(cursor, "enc_file_hash");
        C614630w A0y = A0y();
        if (A0y != null) {
            A0y.A04(C18280x3.A1Z(cursor, "thumbnail"), true);
        }
    }

    public void A20(String str) {
        AnonymousClass2z0 r1 = this.A1J;
        if (r1.A00 instanceof C95804uY) {
            return;
        }
        if (C626635z.A0A(r1, str)) {
            this.A07 = str;
            return;
        }
        throw AnonymousClass24W.A00(15);
    }

    public boolean A21() {
        File file;
        AnonymousClass33C r0 = this.A01;
        if (r0 == null || (file = r0.A0F) == null || !file.canRead()) {
            return false;
        }
        return true;
    }

    public boolean A22() {
        if (this.A07 != null) {
            return true;
        }
        AnonymousClass33C r0 = this.A01;
        if (r0 == null || r0.A0G == null) {
            return false;
        }
        return true;
    }

    public C30471mV(AnonymousClass2z0 r2, byte b, long j) {
        super(r2, b, j);
    }

    public List BDE() {
        C52042kn A022;
        C55162pu A0t = A0t();
        if (!C624134x.A0g(this) || A0t == null || (A022 = A0t.A02()) == null) {
            return null;
        }
        AnonymousClass39V[] r3 = new AnonymousClass39V[2];
        AnonymousClass39V.A04("thread_msg_id", A022.A01.A01, r3);
        r3[1] = new AnonymousClass39V((Jid) A022.A00, "thread_msg_sender_jid");
        return C624134x.A0D(r3);
    }

    public C30471mV(AnonymousClass33C r10, AnonymousClass2z0 r11, C30471mV r12, byte b, long j, boolean z) {
        super(r12, r11, b, j, z);
        this.A01 = r10;
        this.A02 = r12.A02;
        this.A0B = r12.A0B;
        this.A03 = r12.A03;
        this.A04 = r12.A04;
        this.A05 = r12.A05;
        this.A06 = r12.A06;
        this.A00 = r12.A00;
        this.A07 = r12.A07;
        this.A08 = r12.A08;
        C613030d A1v = r12.A1v();
        if (A1v == null) {
            return;
        }
        if (A1v.A05()) {
            C613030d A1v2 = A1v();
            C626936e.A06(A1v2);
            A1v2.A03(A1v.A06(), A1v.A07());
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("FMessageVideo/Cloned message should have sidecar, but original message doesn't have it: sidecar=");
        C18260x0.A0n(this.A0C, A0o);
    }
}
