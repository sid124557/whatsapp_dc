package X;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.7ig  reason: invalid class name and case insensitive filesystem */
public final class C157667ig {
    public static final ConcurrentHashMap A07 = AnonymousClass0x9.A1D();
    public static final String[] A08 = {"key", "value"};
    public final ContentResolver A00;
    public final ContentObserver A01;
    public final Uri A02;
    public final Object A03 = AnonymousClass002.A0D();
    public final Object A04 = AnonymousClass002.A0D();
    public final List A05 = AnonymousClass001.A0s();
    public volatile Map A06;

    public C157667ig(ContentResolver contentResolver, Uri uri) {
        this.A00 = contentResolver;
        this.A02 = uri;
        this.A01 = new AnonymousClass6Cl(this);
    }

    public final Map A00() {
        Cursor query;
        try {
            HashMap A0t = AnonymousClass001.A0t();
            query = this.A00.query(this.A02, A08, (String) null, (String[]) null, (String) null);
            if (query == null) {
                return A0t;
            }
            while (query.moveToNext()) {
                A0t.put(query.getString(0), query.getString(1));
            }
            query.close();
            return A0t;
        } catch (SQLiteException | SecurityException unused) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }
}
