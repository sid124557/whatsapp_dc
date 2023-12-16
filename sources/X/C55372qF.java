package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2qF  reason: invalid class name and case insensitive filesystem */
public class C55372qF {
    public int A00;
    public AnonymousClass2JN A01;
    public final C56612sH A02;
    public final C46392bY A03;
    public final AnonymousClass1RJ A04;

    public int A00() {
        Cursor A0E;
        AnonymousClass4GK A0B = this.A04.get();
        try {
            A0E = ((AnonymousClass3H0) A0B).A03.A0E("SELECT next_prekey_id FROM identities WHERE recipient_id =? AND recipient_type = ? AND device_id =?", "SignalIdentityKeyStore/getNextPreKeyId", AnonymousClass0x2.A1b());
            if (A0E.moveToNext()) {
                int A042 = AnonymousClass0x2.A04(A0E, "next_prekey_id");
                A0E.close();
                A0B.close();
                return A042;
            }
            throw new SQLiteException("Missing entry for self in identities table");
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

    public int A01() {
        Cursor A0E;
        if (this.A00 == 0) {
            AnonymousClass4GK A0B = this.A04.get();
            try {
                A0E = ((AnonymousClass3H0) A0B).A03.A0E("SELECT registration_id FROM identities WHERE recipient_id =? AND recipient_type = ? AND device_id =?", "SignalIdentityKeyStore/getRegistrationId", AnonymousClass0x2.A1b());
                if (A0E.moveToNext()) {
                    this.A00 = AnonymousClass0x2.A04(A0E, "registration_id");
                    A0E.close();
                    A0B.close();
                } else {
                    throw new SQLiteException("Missing entry for self in identities table");
                }
            } catch (Throwable th) {
                try {
                    A0B.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        return this.A00;
        throw th;
    }

    public AnonymousClass2JN A02() {
        Cursor A0E;
        if (this.A01 == null) {
            AnonymousClass4GK A0B = this.A04.get();
            try {
                A0E = ((AnonymousClass3H0) A0B).A03.A0E("SELECT public_key, private_key FROM identities WHERE recipient_id =? AND recipient_type = ? AND device_id =?", "SignalIdentityKeyStore/getIdentityKeyPair", AnonymousClass0x2.A1b());
                if (A0E.moveToNext()) {
                    this.A01 = new AnonymousClass2JN(C18280x3.A1Z(A0E, "public_key"), C18280x3.A1Z(A0E, "private_key"));
                    A0E.close();
                    A0B.close();
                } else {
                    throw new SQLiteException("Missing entry for self in identities table");
                }
            } catch (Throwable th) {
                try {
                    A0B.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        return this.A01;
        throw th;
    }

    public C55372qF(C56612sH r1, C46392bY r2, AnonymousClass1RJ r3) {
        this.A02 = r1;
        this.A04 = r3;
        this.A03 = r2;
    }

    public Map A03(List list) {
        C85284Fq A0C;
        HashMap A0t = AnonymousClass001.A0t();
        AnonymousClass1RJ r6 = this.A04;
        C85284Fq A0C2 = r6.A0C();
        try {
            C69833Yo Axl = A0C2.Axl();
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C54562ov r5 = (C54562ov) it.next();
                    A0C = r6.A0C();
                    long A07 = (long) ((AnonymousClass3H0) A0C).A03.A07("identities", "recipient_id =? AND recipient_type = ? AND device_id =?", "SignalIdentityKeyStore/removeIdentity", r5.A00());
                    C18260x0.A1R(C18300x5.A0o(A07), " identities for ", r5);
                    boolean A1W = AnonymousClass001.A1W((A07 > 0 ? 1 : (A07 == 0 ? 0 : -1)));
                    A0C.close();
                    AnonymousClass000.A1C(r5, A0t, A1W);
                }
                Axl.A00();
                Axl.close();
                A0C2.close();
                return A0t;
            } catch (Throwable th) {
                Axl.close();
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                A0C2.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public Map A04(Set set) {
        Cursor A0E;
        HashMap A0t = AnonymousClass001.A0t();
        if (!set.isEmpty()) {
            Object[] array = set.toArray(new C54562ov[0]);
            AnonymousClass4GK A0B = this.A04.get();
            try {
                C71923ct r12 = new C71923ct(array, 100);
                while (r12.hasNext()) {
                    C54562ov[] r4 = (C54562ov[]) r12.next();
                    C56862sg r3 = ((AnonymousClass3H0) A0B).A03;
                    int length = r4.length;
                    StringBuilder A0A = C18330xA.A0A("SELECT public_key, timestamp, recipient_id, recipient_type, device_id FROM identities INNER JOIN (SELECT ? AS r, ? AS t, ? AS d");
                    Iterator it = C175708Zk.A02(1, length).iterator();
                    while (it.hasNext()) {
                        ((C72013d2) it).A00();
                        A0A.append(" UNION ALL SELECT ? AS r, ? AS t, ? AS d");
                    }
                    String A0X = AnonymousClass000.A0X(") AS joined ON joined.r = identities.recipient_id AND joined.t = identities.recipient_type AND joined.d = identities.device_id", A0A);
                    C162457s7.A0D(A0X);
                    A0E = r3.A0E(A0X, "SignalIdentityKeyStore/getIdentityPublicKeys", AnonymousClass261.A00(Arrays.asList(r4)));
                    int columnIndex = A0E.getColumnIndex("public_key");
                    int columnIndex2 = A0E.getColumnIndex("timestamp");
                    int columnIndex3 = A0E.getColumnIndex("recipient_id");
                    int columnIndex4 = A0E.getColumnIndex("recipient_type");
                    int columnIndex5 = A0E.getColumnIndex("device_id");
                    while (A0E.moveToNext()) {
                        C54562ov r1 = new C54562ov(A0E.getString(columnIndex3), A0E.getInt(columnIndex4), A0E.getInt(columnIndex5));
                        byte[] blob = A0E.getBlob(columnIndex);
                        A0E.getLong(columnIndex2);
                        A0t.put(r1, blob);
                    }
                    A0E.close();
                }
                A0B.close();
                for (Object A1G : set) {
                    C18320x8.A1G(A1G, (Object) null, A0t);
                }
            } catch (Throwable th) {
                try {
                    A0B.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        return A0t;
        throw th;
    }
}
