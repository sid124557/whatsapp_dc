package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2mk  reason: invalid class name and case insensitive filesystem */
public class C53222mk {
    public Map A00;
    public final C55682qk A01;
    public final AnonymousClass1R6 A02;
    public final AnonymousClass37O A03 = new AnonymousClass37O(this);
    public final C44432Wa A04;

    public synchronized String A00(String str) {
        String A0o;
        Throwable th;
        Map map = this.A00;
        HashMap hashMap = map;
        if (map == null) {
            HashMap A0t = AnonymousClass001.A0t();
            AnonymousClass4GK A002 = this.A04.A00.A00();
            try {
                Cursor A0E = ((AnonymousClass3H0) A002).A03.A0E("SELECT key, value FROM properties", "XPM_GET_ALL_PROPERTIES", (String[]) null);
                A002.close();
                try {
                    if (A0E.moveToFirst()) {
                        int columnIndexOrThrow = A0E.getColumnIndexOrThrow("key");
                        int columnIndexOrThrow2 = A0E.getColumnIndexOrThrow("value");
                        do {
                            A0t.put(A0E.getString(columnIndexOrThrow), A0E.getString(columnIndexOrThrow2));
                        } while (A0E.moveToNext());
                    }
                    A0E.close();
                    this.A00 = A0t;
                    hashMap = A0t;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            } catch (Throwable th3) {
                th = th3;
                A002.close();
                throw th;
            }
        }
        A0o = C18310x6.A0o(str, hashMap);
        if (A0o == null) {
            return null;
        }
        return A0o;
    }

    public synchronized void A01(String str, String str2) {
        C69833Yo Axl;
        AnonymousClass37P r5 = this.A02.A04;
        C49102fz r0 = this.A04.A00;
        C85284Fq A012 = r0.A01();
        try {
            C69833Yo Axl2 = A012.Axl();
            try {
                C85284Fq A013 = r0.A01();
                try {
                    Axl = A013.Axl();
                    C56862sg r3 = ((AnonymousClass3H0) A013).A03;
                    r3.A07("properties", "key = ?", "XPM_DELETE_PROPERTY", C18270x1.A1b(str));
                    if (str2 != null) {
                        ContentValues A06 = AnonymousClass0x9.A06();
                        A06.put("key", str);
                        A06.put("value", str2);
                        r3.A09("properties", "XPM_SET_PROPERTY", A06);
                    }
                    Axl.A00();
                    Axl.close();
                    A013.close();
                    AnonymousClass37O r2 = this.A03;
                    Object A0D = AnonymousClass002.A0D();
                    Object obj = r5.A02.get();
                    C626936e.A06(obj);
                    ((HashMap) obj).put(A0D, r2);
                    Axl2.A00();
                    Map map = this.A00;
                    if (map != null) {
                        if (str2 != null) {
                            map.put(str, str2);
                        } else {
                            map.remove(str);
                        }
                    }
                    Axl2.close();
                    A012.close();
                } catch (Throwable th) {
                    A013.close();
                    throw th;
                }
            } catch (Throwable th2) {
                Axl2.close();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                A012.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
        return;
        throw th;
    }

    public boolean A02(String str) {
        String A002 = A00(str);
        if (A002 != null) {
            String A0z = AnonymousClass0x9.A0z(A002);
            if (A0z.equals("true")) {
                return true;
            }
            if (!A0z.equals("false")) {
                C55682qk r2 = this.A01;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Malformed boolean: ");
                A0o.append(str);
                r2.A0A("xpm-file-prefetcher-properties", false, AnonymousClass000.A0V("=", A002, A0o));
            }
        }
        return false;
    }

    public C53222mk(C55682qk r2, AnonymousClass1R6 r3, C44432Wa r4) {
        this.A01 = r2;
        this.A04 = r4;
        this.A02 = r3;
    }
}
