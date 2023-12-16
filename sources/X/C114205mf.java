package X;

import android.database.ContentObserver;
import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.5mf  reason: invalid class name and case insensitive filesystem */
public class C114205mf implements C186308v5 {
    public int A00 = 0;
    public C86684Lb A01;
    public final AnonymousClass319 A02;
    public final AnonymousClass1VX A03;
    public final C95814uZ A04;
    public final C55832qz A05;
    public final C33141sV A06;
    public final Map A07 = AnonymousClass001.A0t();

    public final AnonymousClass8GZ A02(int i) {
        AnonymousClass8GZ r2;
        C30471mV A002;
        synchronized (this) {
            C86684Lb r0 = this.A01;
            r2 = null;
            if (r0 != null && r0.moveToPosition(i) && !this.A01.isClosed() && (A002 = this.A01.A00()) != null) {
                r2 = AnonymousClass5VD.A00(A002, this.A06);
                this.A07.put(Integer.valueOf(i), r2);
            }
        }
        return r2;
    }

    public Cursor A00() {
        String str;
        String str2;
        C95814uZ r7 = this.A04;
        C626936e.A06(r7);
        AnonymousClass319 r8 = this.A02;
        C18260x0.A1R(AnonymousClass001.A0o(), "mediamsgstore/getMediaMessagesCursor:", r7);
        AnonymousClass4GK A032 = r8.A0A.get();
        try {
            boolean A0X = r8.A0C.A0X(6550);
            if (A0X) {
                str = "GET_MEDIA_ITEMS_ORDER_BY_SORT_ID";
            } else {
                str = "GET_MEDIA_MESSAGES_SQL_ORDER_BY_SORT_ID";
            }
            if (A0X) {
                str2 = AnonymousClass2CE.A04;
            } else {
                str2 = AnonymousClass2CE.A0A;
            }
            C56862sg r3 = ((AnonymousClass3H0) A032).A03;
            String[] strArr = new String[1];
            C18260x0.A1X(strArr, r8.A04.A07(r7));
            Cursor A0E = r3.A0E(str2, str, strArr);
            A032.close();
            return A0E;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    /* renamed from: A01 */
    public AnonymousClass8GZ B9S(int i) {
        AnonymousClass8GZ r2 = (AnonymousClass8GZ) AnonymousClass001.A0i(this.A07, i);
        if (this.A01 == null || r2 != null) {
            return r2;
        }
        if (!C615631i.A02() || !this.A03.A0X(5882)) {
            return A02(i);
        }
        return r2;
    }

    public void Bjj() {
        C86684Lb r2 = this.A01;
        if (r2 != null) {
            Cursor A002 = A00();
            r2.A01.close();
            r2.A01 = A002;
            r2.A00 = -1;
            r2.moveToPosition(-1);
        }
        this.A07.clear();
        this.A00 = 0;
    }

    public void close() {
        C86684Lb r0 = this.A01;
        if (r0 != null) {
            r0.close();
        }
    }

    public int getCount() {
        C86684Lb r0 = this.A01;
        if (r0 == null) {
            return 0;
        }
        return r0.getCount() - this.A00;
    }

    public void registerContentObserver(ContentObserver contentObserver) {
        C86684Lb r0 = this.A01;
        if (r0 != null) {
            r0.registerContentObserver(contentObserver);
        }
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
        C86684Lb r0 = this.A01;
        if (r0 != null) {
            r0.unregisterContentObserver(contentObserver);
        }
    }

    public C114205mf(AnonymousClass319 r2, AnonymousClass1VX r3, C95814uZ r4, C55832qz r5, C33141sV r6) {
        this.A03 = r3;
        this.A05 = r5;
        this.A02 = r2;
        this.A06 = r6;
        this.A04 = r4;
    }

    public HashMap B4t() {
        return AnonymousClass001.A0t();
    }

    public /* bridge */ /* synthetic */ C186058ug Bhe(int i) {
        C626936e.A00();
        try {
            return A02(i);
        } catch (Exception e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("MediaGalleryList/processMediaAt/position = ");
            A0o.append(i);
            C18260x0.A1Q(A0o, " ; e = ", e);
            return null;
        }
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1T(getCount());
    }
}
