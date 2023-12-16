package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import com.whatsapp.util.Log;

/* renamed from: X.2fo  reason: invalid class name and case insensitive filesystem */
public class C48992fo {
    public final C56612sH A00;
    public final C72303dV A01;
    public final AnonymousClass1VX A02;

    public void A00(C624134x r8) {
        Cursor A0E;
        C55592qb r1;
        long j = r8.A1L;
        AnonymousClass4GK A03 = this.A01.get();
        try {
            C56862sg r5 = ((AnonymousClass3H0) A03).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            C18260x0.A1Y(A1Y, j);
            A0E = r5.A0E("SELECT message_row_id, direct_path, media_key, media_key_timestamp, enc_thumb_hash, thumb_hash, thumb_width, thumb_height, transferred, micro_thumbnail, insert_timestamp, handle FROM mms_thumbnail_metadata WHERE message_row_id = ?", "GET_MMS_THUMBNAIL_METADATA_SQL", A1Y);
            if (A0E.moveToLast()) {
                r1 = new C55592qb();
                r1.A04 = AnonymousClass0x2.A0Z(A0E, "direct_path");
                r1.A0A = C18280x3.A1Z(A0E, "media_key");
                r1.A02 = AnonymousClass0x2.A0C(A0E, "media_key_timestamp");
                r1.A05 = AnonymousClass0x2.A0Z(A0E, "enc_thumb_hash");
                r1.A08 = AnonymousClass0x2.A0Z(A0E, "thumb_hash");
                r1.A01 = AnonymousClass0x2.A04(A0E, "thumb_width");
                r1.A00 = AnonymousClass0x2.A04(A0E, "thumb_height");
                r1.A09 = C626135u.A05(A0E, "transferred");
                r1.A0B = C18280x3.A1Z(A0E, "micro_thumbnail");
                r1.A06 = AnonymousClass0x2.A0Z(A0E, "handle");
                A0E.close();
                A03.close();
            } else {
                A0E.close();
                A03.close();
                r1 = null;
            }
            r8.A1W(r1);
            if (r1 != null && C624234y.A02(this.A02, r8)) {
                r1.A0C = true;
                return;
            }
            return;
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

    public void A01(C55592qb r7, long j) {
        C85284Fq A04;
        try {
            A04 = this.A01.A04();
            ContentValues A07 = AnonymousClass0x9.A07(10);
            C18270x1.A0a(A07, j);
            C621833x.A02(A07, "direct_path", r7.A04);
            C621833x.A04(A07, "media_key", r7.A0A);
            C18270x1.A0c(A07, "media_key_timestamp", r7.A02);
            C621833x.A02(A07, "enc_thumb_hash", r7.A05);
            C621833x.A02(A07, "thumb_hash", r7.A08);
            C18270x1.A0b(A07, "thumb_width", r7.A01);
            C18270x1.A0b(A07, "thumb_height", r7.A00);
            C621833x.A03(A07, "transferred", r7.A09);
            C621833x.A04(A07, "micro_thumbnail", r7.A0B);
            C18270x1.A0c(A07, "insert_timestamp", this.A00.A0H());
            AnonymousClass3H0.A03(A07, A04, "handle", r7.A06).A0C("mms_thumbnail_metadata", "INSERT_MMS_THUMBNAIL_METADATA_SQL", A07, 5);
            A04.close();
            return;
        } catch (SQLiteConstraintException e) {
            Log.e("MmsThumbnailMetadataMessageStore/insertMmsThumbnailMetadata/", e);
            throw e;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public C48992fo(C56612sH r1, C72303dV r2, AnonymousClass1VX r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
