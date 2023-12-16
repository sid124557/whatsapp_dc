package X;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.2e8  reason: invalid class name and case insensitive filesystem */
public class C47972e8 {
    public final C72303dV A00;

    public void A00(C624134x r26) {
        Cursor A0E;
        AnonymousClass4GK A03 = this.A00.get();
        try {
            C56862sg r6 = ((AnonymousClass3H0) A03).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            C624134x r1 = r26;
            C18260x0.A1X(A1Y, r1.A1L);
            A0E = r6.A0E("SELECT title, body, media_type, thumbnail_url, full_thumbnail, micro_thumbnail, media_url, source_type, source_id, source_url, render_larger_thumbnail, show_ad_attribution, has_icebreaker_auto_response, has_click_to_call_auto_response  FROM message_external_ad_content WHERE message_row_id = ?", "GET_EXTERNAL_AD_CONTENT_INFO_BY_ROW_ID_SQL", A1Y);
            if (A0E.moveToLast()) {
                String A0Z = AnonymousClass0x2.A0Z(A0E, "title");
                String A0Z2 = AnonymousClass0x2.A0Z(A0E, "body");
                int A04 = AnonymousClass0x2.A04(A0E, "media_type");
                r1.A1P(new AnonymousClass2U8(A0Z, A0Z2, AnonymousClass0x2.A0Z(A0E, "thumbnail_url"), AnonymousClass0x2.A0Z(A0E, "media_url"), AnonymousClass0x2.A0Z(A0E, "source_type"), AnonymousClass0x2.A0Z(A0E, "source_id"), AnonymousClass0x2.A0Z(A0E, "source_url"), (String) null, (String) null, C18280x3.A1Z(A0E, "micro_thumbnail"), C18280x3.A1Z(A0E, "full_thumbnail"), A04, C382426h.A00(A0E, A0E.getColumnIndex("render_larger_thumbnail")), C382426h.A00(A0E, A0E.getColumnIndex("show_ad_attribution")), C382426h.A00(A0E, A0E.getColumnIndex("has_icebreaker_auto_response")), C382426h.A00(A0E, A0E.getColumnIndex("has_click_to_call_auto_response"))));
            }
            A0E.close();
            A03.close();
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

    public void A01(C624134x r8) {
        if (AnonymousClass000.A1U(r8.A0A & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH)) {
            AnonymousClass2U8 r5 = r8.A0c;
            C85284Fq A04 = this.A00.A04();
            try {
                C56862sg r4 = ((AnonymousClass3H0) A04).A03;
                ContentValues A06 = AnonymousClass0x9.A06();
                C624134x.A0F(A06, r8);
                A06.put("title", r5.A0A);
                A06.put("body", r5.A02);
                A06.put("media_type", Integer.valueOf(r5.A01));
                A06.put("thumbnail_url", r5.A09);
                A06.put("micro_thumbnail", r5.A0F);
                A06.put("full_thumbnail", r5.A00);
                A06.put("media_url", r5.A04);
                A06.put("source_type", r5.A07);
                A06.put("source_id", r5.A06);
                A06.put("source_url", r5.A08);
                A06.put("render_larger_thumbnail", Boolean.valueOf(r5.A0D));
                A06.put("show_ad_attribution", Boolean.valueOf(r5.A0E));
                A06.put("has_icebreaker_auto_response", Boolean.valueOf(r5.A0C));
                A06.put("has_click_to_call_auto_response", Boolean.valueOf(r5.A0B));
                r4.A08("message_external_ad_content", "ExternalAdContentInfoStore/insertAdContentInfo", A06);
                A04.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
    }

    public C47972e8(C72303dV r1) {
        this.A00 = r1;
    }
}
