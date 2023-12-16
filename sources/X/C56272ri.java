package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2ri  reason: invalid class name and case insensitive filesystem */
public class C56272ri {
    public final AnonymousClass1RE A00;

    public void A04(String str, long j) {
        C69833Yo Axl;
        long j2 = j;
        C626936e.A0C(AnonymousClass001.A1U((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        C85284Fq A0C = this.A00.A0C();
        try {
            Axl = A0C.Axl();
            String str2 = str;
            A03(str2);
            ContentValues A06 = AnonymousClass0x9.A06();
            if (((long) AnonymousClass3H0.A02(A06, A0C, "dirty_version", j2).A05(A06, "collection_versions", "collection_name = ? ", "CollectionVersionsTable.UPDATE_COLLECTION_DIRTY_VERSION", new String[]{str})) <= 0) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("SyncDbStore/updateCollectionDirtyVersion failed for collection: ");
                A0o.append(str2);
                C18260x0.A11(", dirtyVersion: ", A0o, j2);
            }
            Axl.A00();
            Axl.close();
            A0C.close();
            return;
        } catch (Throwable th) {
            try {
                A0C.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public Long A00(String str) {
        Cursor A0E;
        Long l;
        AnonymousClass4GK A0B = this.A00.get();
        try {
            A0E = ((AnonymousClass3H0) A0B).A03.A0E("SELECT * FROM collection_versions WHERE collection_name = ?", "CollectionVersionsTable.GET_COLLECTION", C18270x1.A1b(str));
            if (A0E.moveToFirst()) {
                l = Long.valueOf(AnonymousClass0x2.A0C(A0E, "version"));
            } else {
                l = null;
            }
            A0E.close();
            A0B.close();
            return l;
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

    public void A02(String str) {
        C69833Yo Axl;
        C85284Fq A0C = this.A00.A0C();
        try {
            Axl = A0C.Axl();
            ((AnonymousClass3H0) A0C).A03.A0I("UPDATE collection_versions SET dirty_version = -1 WHERE collection_name = ? AND dirty_version = 0", "CollectionVersionsTable.MARK_COLLECTION_AS_UPDATED", C18270x1.A1b(str));
            Axl.A00();
            Axl.close();
            A0C.close();
            return;
        } catch (Throwable th) {
            try {
                A0C.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public final void A03(String str) {
        C85284Fq A0C = this.A00.A0C();
        try {
            ContentValues A06 = AnonymousClass0x9.A06();
            A06.put("collection_name", str);
            C18270x1.A0b(A06, "version", 0);
            A06.putNull("lt_hash");
            AnonymousClass3H0.A01(A06, A0C, "dirty_version", -1).A08("collection_versions", "CollectionVersionsTable.INSERT_OR_IGNORE", A06);
            A0C.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A05(String str, byte[] bArr, long j) {
        C69833Yo Axl;
        C85284Fq A0C = this.A00.A0C();
        try {
            Axl = A0C.Axl();
            String str2 = str;
            A03(str2);
            ContentValues A06 = AnonymousClass0x9.A06();
            long j2 = j;
            C18270x1.A0c(A06, "version", j2);
            byte[] bArr2 = bArr;
            if (bArr != null) {
                A06.put("lt_hash", bArr2);
            } else {
                A06.putNull("lt_hash");
            }
            if (((long) ((AnonymousClass3H0) A0C).A03.A05(A06, "collection_versions", "collection_name = ? ", "CollectionVersionsTable.UPDATE_COLLECTION_VERSION", C18270x1.A1b(str2))) <= 0) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("SyncDbStore/updateCollectionVersion failed for collection: ");
                A0o.append(str2);
                A0o.append(", version: ");
                A0o.append(j2);
                A0o.append(", ltHash: ");
                C18260x0.A1K(A0o, Arrays.toString(bArr2));
            }
            Axl.A00();
            Axl.close();
            A0C.close();
            return;
        } catch (Throwable th) {
            try {
                A0C.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public boolean A06(String str) {
        Cursor A0E;
        long j;
        long j2;
        AnonymousClass4GK A0B = this.A00.get();
        try {
            A0E = ((AnonymousClass3H0) A0B).A03.A0E("SELECT * FROM collection_versions WHERE collection_name = ?", "CollectionVersionsTable.GET_COLLECTION", C18300x5.A1a(str, 1));
            if (A0E.moveToFirst()) {
                j = AnonymousClass0x2.A0C(A0E, "version");
                j2 = AnonymousClass0x2.A0C(A0E, "dirty_version");
            } else {
                j = 0;
                j2 = 0;
            }
            A0E.close();
            A0B.close();
            if (j2 == 0 || j < j2) {
                return false;
            }
            return true;
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

    public byte[] A07(String str) {
        Cursor A0E;
        byte[] bArr;
        AnonymousClass4GK A0B = this.A00.get();
        try {
            A0E = ((AnonymousClass3H0) A0B).A03.A0E("SELECT * FROM collection_versions WHERE collection_name = ?", "CollectionVersionsTable.GET_COLLECTION", C18270x1.A1b(str));
            if (A0E.moveToFirst()) {
                bArr = C18280x3.A1Z(A0E, "lt_hash");
            } else {
                bArr = null;
            }
            A0E.close();
            A0B.close();
            if (bArr == null) {
                return new byte[128];
            }
            return bArr;
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

    public C56272ri(AnonymousClass1RE r1) {
        this.A00 = r1;
    }

    public Map A01() {
        Cursor A01;
        HashMap A0t = AnonymousClass001.A0t();
        AnonymousClass4GK A0B = this.A00.get();
        try {
            A01 = C56862sg.A01(((AnonymousClass3H0) A0B).A03, "SELECT collection_name, version FROM collection_versions", "CollectionVersionsTable.GET_ALL_COLLECTION_VERSIONS");
            while (A01.moveToNext()) {
                AnonymousClass0x2.A1J(AnonymousClass0x2.A0Z(A01, "collection_name"), A0t, AnonymousClass0x2.A0C(A01, "version"));
            }
            A01.close();
            A0B.close();
            return A0t;
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
