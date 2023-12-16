package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.30a  reason: invalid class name and case insensitive filesystem */
public class C612830a {
    public final C56922sm A00;
    public final C613830m A01;
    public final C72303dV A02;

    public byte[] A05(C624134x r8) {
        Cursor A0E;
        StringBuilder A0o;
        String str;
        if (r8 == null) {
            return null;
        }
        if (r8 instanceof AnonymousClass1nE) {
            return A06(((C30471mV) r8).A04);
        }
        if (r8.A1L <= 0) {
            A0o = AnonymousClass001.A0o();
            str = "ThumbnailMessageStore/getMessageThumbnail/message must have row_id set; key=";
        } else if (r8.A0l() != 1) {
            A0o = AnonymousClass001.A0o();
            str = "ThumbnailMessageStore/getMessageThumbnail/message must be in main storage; key=";
        } else {
            C624134x.A0V(r8, "ThumbnailMessageStore/getThumbnailV2/message must have row_id set; key=", AnonymousClass001.A0o(), AnonymousClass001.A1W((r8.A1L > 0 ? 1 : (r8.A1L == 0 ? 0 : -1))));
            try {
                AnonymousClass4GK A03 = this.A02.get();
                try {
                    C56862sg r3 = ((AnonymousClass3H0) A03).A03;
                    String[] strArr = new String[1];
                    C624134x.A0X(r8, strArr);
                    A0E = r3.A0E("SELECT thumbnail FROM message_thumbnail WHERE message_row_id = ?", "GET_THUMBNAIL_BY_ROW_ID_SQL", strArr);
                    if (A0E.moveToNext()) {
                        byte[] A1Z = C18280x3.A1Z(A0E, "thumbnail");
                        A0E.close();
                        A03.close();
                        return A1Z;
                    }
                    A0E.close();
                    A03.close();
                    return null;
                } catch (Throwable th) {
                    A03.close();
                    throw th;
                }
            } catch (SQLiteException unused) {
                Log.e("ThumbnailMessageStore/getThumbnailV2/failed to read thumbnail");
                return null;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        C624134x.A0Q(r8, str, A0o);
        return null;
        throw th;
    }

    public static final void A00(C624134x r7) {
        boolean z = false;
        AnonymousClass2z0 A09 = C624134x.A09(r7, "ThumbnailMessageStore/isThumbnailV2Ready/message must have row_id set; key=", AnonymousClass001.A0o(), AnonymousClass001.A1W((r7.A1L > 0 ? 1 : (r7.A1L == 0 ? 0 : -1))));
        if (r7.A0l() == 1) {
            z = true;
        }
        C18260x0.A0l(A09, "ThumbnailMessageStore/isThumbnailV2Ready/message must be in main storage; key=", AnonymousClass001.A0o(), z);
    }

    public final void A01(long j, byte[] bArr) {
        C85284Fq A04 = this.A02.A04();
        try {
            ContentValues A06 = AnonymousClass0x9.A06();
            C18270x1.A0a(A06, j);
            A06.put("thumbnail", bArr);
            C626936e.A0F(AnonymousClass000.A1T((((AnonymousClass3H0) A04).A03.A0C("message_thumbnail", "INSERT_MESSAGE_THUMBNAIL_SQL", A06, 5) > j ? 1 : (((AnonymousClass3H0) A04).A03.A0C("message_thumbnail", "INSERT_MESSAGE_THUMBNAIL_SQL", A06, 5) == j ? 0 : -1))), "ThumbnailMessageStore/insertOrUpdateThumbnailV2/inserted row should has same row_id");
            A04.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A02(C624134x r10) {
        AnonymousClass4GK r7;
        Cursor A03;
        if (r10 instanceof AnonymousClass1nE) {
            C30471mV r102 = (C30471mV) r10;
            String str = r102.A04;
            if (!TextUtils.isEmpty(str)) {
                C613830m r4 = this.A01;
                String[] A1Z = AnonymousClass0x9.A1Z();
                boolean z = false;
                A1Z[0] = r102.A04;
                C18270x1.A1R(A1Z, r102.A1L);
                r7 = r4.A04.get();
                try {
                    A03 = C56862sg.A03(r7, "SELECT COUNT(1) as count FROM message_media WHERE file_hash = ? AND message_row_id != ?", "SELECT_REFERENCED_FILE_HASH_WITH_MESSAGE_ROW_ID_SQL", A1Z);
                    if (A03.moveToNext()) {
                        if (AnonymousClass0x2.A0C(A03, "count") == 0) {
                            z = true;
                        }
                        A03.close();
                        r7.close();
                        if (!z) {
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("thumbnailmsgstore/deleteThumbnailByMediaHash/thumbnail not deleted, hash: ");
                            C18260x0.A1J(A0o, r102.A04);
                            return;
                        }
                    } else {
                        A03.close();
                        r7.close();
                    }
                    C85284Fq A04 = this.A02.A04();
                    try {
                        ((AnonymousClass3H0) A04).A03.A07("media_hash_thumbnail", "media_hash = ?", "DELETE_MEDIA_HASH_THUMBNAIL_SQL", C18270x1.A1b(str));
                        StringBuilder A0o2 = AnonymousClass001.A0o();
                        A0o2.append("thumbnailmsgstore/deleteThumbnailByMediaHash/thumbnail deleted, hash: ");
                        C18260x0.A1J(A0o2, r102.A04);
                        A04.close();
                        return;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r7.close();
                    throw th;
                }
            } else {
                return;
            }
        } else {
            A00(r10);
            long j = r10.A1L;
            r7 = this.A02.A04();
            ((AnonymousClass3H0) r7).A03.A07("message_thumbnail", "message_row_id = ?", "DELETE_MESSAGE_THUMBNAIL_SQL", C18260x0.A1b(j));
            r7.close();
            return;
        }
        throw th;
    }

    public void A03(C624134x r6, byte[] bArr) {
        if (r6 instanceof AnonymousClass1nE) {
            C30471mV r62 = (C30471mV) r6;
            String str = r62.A04;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (A06(str) != null) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("thumbnailmsgstore/insertOrUpdateThumbnailByMediaHash/thumbnail already inserted, hash: ");
                C18260x0.A1J(A0o, r62.A04);
                return;
            }
            C85284Fq A04 = this.A02.A04();
            try {
                ContentValues A09 = C18280x3.A09();
                A09.put("media_hash", str);
                A09.put("thumbnail", bArr);
                ((AnonymousClass3H0) A04).A03.A08("media_hash_thumbnail", "INSERT_MEDIA_HASH_THUMBNAIL_SQL", A09);
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("thumbnailmsgstore/insertOrUpdateThumbnailByMediaHash/thumbnail just inserted, hash: ");
                C18260x0.A1J(A0o2, r62.A04);
                A04.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        } else {
            A00(r6);
            if (bArr != null) {
                A01(r6.A1L, bArr);
            }
        }
    }

    public void A04(Collection collection) {
        Cursor A03;
        C85284Fq A04 = this.A02.A04();
        try {
            C69833Yo Axl = A04.Axl();
            try {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    String A0m = AnonymousClass001.A0m(it);
                    C613830m r0 = this.A01;
                    boolean z = true;
                    String[] A1a = C18300x5.A1a(A0m, 1);
                    AnonymousClass4GK A032 = r0.A04.get();
                    try {
                        A03 = C56862sg.A03(A032, "SELECT COUNT(1) as count FROM message_media WHERE file_hash=?", "SELECT_REFERENCED_FILE_HASH_SQL", A1a);
                        if (A03.moveToNext() && AnonymousClass0x2.A0C(A03, "count") != 0) {
                            z = false;
                        }
                        A03.close();
                        A032.close();
                        if (!z) {
                            ((AnonymousClass3H0) A04).A03.A07("media_hash_thumbnail", "media_hash = ?", "DELETE_MEDIA_HASH_THUMBNAIL_SQL", C18270x1.A1b(A0m));
                            C18260x0.A0q("thumbnailmsgstore/deleteAllMessageThumbnailsForMediaHashes/hash deleted: ", A0m, AnonymousClass001.A0o());
                        }
                    } catch (Throwable th) {
                        A032.close();
                        throw th;
                    }
                }
                Axl.A00();
                Axl.close();
                A04.close();
                return;
                throw th;
            } catch (Throwable th2) {
                Axl.close();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                A04.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public C612830a(C56922sm r1, C613830m r2, C72303dV r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final byte[] A06(String str) {
        Cursor A0E;
        byte[] bArr = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] A1b = C18270x1.A1b(str);
        AnonymousClass4GK A03 = this.A02.get();
        try {
            A0E = ((AnonymousClass3H0) A03).A03.A0E("SELECT thumbnail FROM media_hash_thumbnail WHERE media_hash = ?", "GET_THUMBNAIL_BY_MEDIA_HASH_SQL", A1b);
            if (A0E.moveToNext()) {
                bArr = C18280x3.A1Z(A0E, "thumbnail");
            }
            A0E.close();
            A03.close();
            return bArr;
        } catch (Throwable th) {
            try {
                A03.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }
}
