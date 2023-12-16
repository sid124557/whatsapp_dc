package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import com.whatsapp.util.Log;

/* renamed from: X.2eL  reason: invalid class name and case insensitive filesystem */
public class C48102eL {
    public final C72303dV A00;

    public void A00(C60072xx r7, long j) {
        C85284Fq A04;
        try {
            A04 = this.A00.A04();
            ContentValues A06 = AnonymousClass0x9.A06();
            C18270x1.A0a(A06, j);
            A06.put("waveform", r7.A02);
            AnonymousClass3H0.A01(A06, A04, "background_color", r7.A01).A0C("audio_data", "INSERT_AUDIO_DATA_SQL", A06, 5);
            A04.close();
            return;
        } catch (SQLiteConstraintException e) {
            Log.e("WaveformMessageStore/insertWaveform/", e);
            throw e;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public void A01(C30721mu r8) {
        Cursor A0E;
        C60072xx r0;
        long j = r8.A1L;
        AnonymousClass4GK A03 = this.A00.get();
        try {
            C56862sg r5 = ((AnonymousClass3H0) A03).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            C18260x0.A1Y(A1Y, j);
            A0E = r5.A0E("SELECT message_row_id, waveform, background_color FROM audio_data WHERE message_row_id = ?", "GET_AUDIO_DATA_SQL", A1Y);
            if (A0E.moveToLast()) {
                r0 = new C60072xx(C18280x3.A1Z(A0E, "waveform"), AnonymousClass0x2.A04(A0E, "background_color"));
                A0E.close();
                A03.close();
            } else {
                A0E.close();
                A03.close();
                r0 = null;
            }
            r8.A23(r0);
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

    public C48102eL(C72303dV r1) {
        this.A00 = r1;
    }
}
