package X;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.provider.MediaStore;
import java.util.ArrayList;

/* renamed from: X.4Vh  reason: invalid class name and case insensitive filesystem */
public class C87724Vh extends AnonymousClass08c {
    public static final String[] A04 = {"_id", "artist", "title", "_data", "duration", "_size"};
    public Cursor A00;
    public CancellationSignal A01;
    public final AnonymousClass5UR A02;
    public final ArrayList A03;

    public /* bridge */ /* synthetic */ Object A06() {
        Cursor query;
        synchronized (this) {
            if (!AnonymousClass000.A1W(this.A01)) {
                this.A01 = new CancellationSignal();
            } else {
                throw new C13860nr();
            }
        }
        try {
            ArrayList arrayList = this.A03;
            String[] strArr = new String[(arrayList.size() * 2)];
            StringBuilder A0o = AnonymousClass001.A0o();
            for (int i = 0; i < arrayList.size(); i++) {
                A0o.append(" AND ");
                A0o.append("(");
                A0o.append("title");
                A0o.append(" LIKE ?");
                A0o.append(" OR ");
                A0o.append("artist");
                A0o.append(" LIKE ?");
                A0o.append(")");
                int i2 = i * 2;
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("%");
                strArr[i2] = AnonymousClass000.A0V(C86664Kz.A1M(arrayList, i), "%", A0o2);
                strArr[i2 + 1] = AnonymousClass000.A0V(C86664Kz.A1M(arrayList, i), "%", AnonymousClass000.A0l("%"));
            }
            AnonymousClass5UR r2 = this.A02;
            Uri uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            String[] strArr2 = A04;
            String A0P = AnonymousClass000.A0P(A0o, "(is_music!=0 OR is_podcast!=0)", AnonymousClass001.A0o());
            CancellationSignal cancellationSignal = this.A01;
            ContentResolver A002 = AnonymousClass5UR.A00(r2, uri);
            r2.A01.A00(AnonymousClass58S.QUERY, uri.getAuthority());
            query = A002.query(uri, strArr2, A0P, strArr, "date_modified DESC", cancellationSignal);
            if (query != null) {
                query.getCount();
            }
            synchronized (this) {
                this.A01 = null;
            }
            return query;
        } catch (RuntimeException e) {
            query.close();
            throw e;
        } catch (Throwable th) {
            th = th;
            synchronized (this) {
                try {
                    this.A01 = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                throw th;
            }
        }
    }

    public void A07() {
        synchronized (this) {
            CancellationSignal cancellationSignal = this.A01;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
            }
        }
    }

    public void A03() {
        Cursor cursor = this.A00;
        if (cursor != null) {
            A04(cursor);
        }
        boolean z = this.A03;
        this.A03 = false;
        this.A04 |= z;
        if (z || this.A00 == null) {
            A09();
        }
    }

    public /* bridge */ /* synthetic */ void A0B(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    /* renamed from: A0C */
    public void A04(Cursor cursor) {
        if (!this.A05) {
            Cursor cursor2 = this.A00;
            this.A00 = cursor;
            if (this.A06) {
                super.A04(cursor);
            }
            if (cursor2 != null && cursor2 != cursor && !cursor2.isClosed()) {
                cursor2.close();
            }
        } else if (cursor != null) {
            cursor.close();
        }
    }

    public C87724Vh(Context context, AnonymousClass5UR r3, ArrayList arrayList) {
        super(context);
        this.A02 = r3;
        if (arrayList == null) {
            this.A03 = AnonymousClass001.A0s();
        } else {
            this.A03 = arrayList;
        }
    }

    public void A01() {
        A00();
        Cursor cursor = this.A00;
        if (cursor != null && !cursor.isClosed()) {
            this.A00.close();
        }
        this.A00 = null;
    }

    public void A02() {
        A00();
    }
}
