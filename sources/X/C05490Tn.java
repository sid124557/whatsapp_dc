package X;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* renamed from: X.0Tn  reason: invalid class name and case insensitive filesystem */
public class C05490Tn {
    public static final String[] A0E = {"UPDATE", "DELETE", "INSERT"};
    public final C10610iE A00;
    public final AnonymousClass0LD A01;
    public final C04120Mw A02;
    public final AnonymousClass0R5 A03;
    public final Object A04;
    public final Object A05;
    public final Runnable A06;
    public final Map A07;
    public final Map A08;
    public final Map A09;
    public final AtomicBoolean A0A = new AtomicBoolean(false);
    public final String[] A0B;
    public volatile C17320vK A0C;
    public volatile boolean A0D;

    public final void A00(C17430vW r4) {
        C162457s7.A0J(r4, 0);
        if (!((C08630en) r4).A00.inTransaction()) {
            try {
                Lock A072 = this.A03.A07();
                A072.lock();
                try {
                    synchronized (this.A04) {
                        synchronized (this.A02) {
                        }
                    }
                    A072.unlock();
                } catch (Throwable th) {
                    A072.unlock();
                    throw th;
                }
            } catch (SQLiteException | IllegalStateException e) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
            }
        }
    }

    public C05490Tn(AnonymousClass0R5 r8, Map map, Map map2, String... strArr) {
        this.A03 = r8;
        this.A07 = map;
        this.A09 = map2;
        int length = strArr.length;
        this.A02 = new C04120Mw();
        this.A01 = new AnonymousClass0LD(r8);
        this.A00 = new C10610iE();
        this.A04 = AnonymousClass002.A0D();
        this.A05 = AnonymousClass002.A0D();
        this.A08 = new LinkedHashMap();
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            C162457s7.A0F(locale);
            String lowerCase = str.toLowerCase(locale);
            C162457s7.A0D(lowerCase);
            this.A08.put(lowerCase, Integer.valueOf(i));
            String str2 = (String) this.A07.get(strArr[i]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                C162457s7.A0D(lowerCase);
            }
            strArr2[i] = lowerCase;
        }
        this.A0B = strArr2;
        Iterator A0q = AnonymousClass000.A0q(this.A07);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            Locale locale2 = Locale.US;
            C162457s7.A0F(locale2);
            String lowerCase2 = ((String) A0w.getValue()).toLowerCase(locale2);
            C162457s7.A0D(lowerCase2);
            if (this.A08.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) A0w.getKey()).toLowerCase(locale2);
                C162457s7.A0D(lowerCase3);
                Map map3 = this.A08;
                map3.put(lowerCase3, C73813g7.A07(map3, lowerCase2));
            }
        }
        this.A06 = new C13210mo(this);
    }
}
