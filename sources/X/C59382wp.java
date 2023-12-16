package X;

import android.database.Cursor;

/* renamed from: X.2wp  reason: invalid class name and case insensitive filesystem */
public class C59382wp {
    public final C56612sH A00;
    public final C46392bY A01;
    public final AnonymousClass1RJ A02;

    public C59382wp(C56612sH r1, C46392bY r2, AnonymousClass1RJ r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public static String A00(String str, boolean z) {
        String str2;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("sender_id = ? AND sender_type = ? AND device_id = ? AND group_id");
        if (z) {
            str2 = " = '";
        } else {
            str2 = " != '";
        }
        A0o.append(str2);
        A0o.append(str);
        A0o.append("' AND ");
        A0o.append("timestamp");
        return AnonymousClass000.A0X(" < ?", A0o);
    }

    public AnonymousClass2JP A01(C54422oh r16) {
        Cursor A0F;
        C54422oh r4 = r16;
        C18260x0.A1R(AnonymousClass001.A0o(), "SenderKeyStore/getSenderKey/", r4);
        AnonymousClass4GK A0B = this.A02.get();
        try {
            A0F = ((AnonymousClass3H0) A0B).A03.A0F("sender_keys", new String[]{"record", "timestamp"}, "group_id = ? AND sender_id = ? AND sender_type = ? AND device_id = ?", r4.A01(), (String) null, (String) null, (String) null, "SignalSenderKeyStore/getSenderKey");
            if (!A0F.moveToNext()) {
                A0F.close();
                A0B.close();
                return null;
            }
            AnonymousClass2JP r0 = new AnonymousClass2JP(C18280x3.A1Z(A0F, "record"), AnonymousClass0x2.A0C(A0F, "timestamp"));
            A0F.close();
            A0B.close();
            return r0;
        } catch (Throwable th) {
            try {
                A0B.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }
}
