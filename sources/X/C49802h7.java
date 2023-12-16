package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import com.whatsapp.util.Log;

/* renamed from: X.2h7  reason: invalid class name and case insensitive filesystem */
public class C49802h7 {
    public final C56612sH A00;
    public final C613830m A01;
    public final C52342lK A02;
    public final C72303dV A03;
    public final C55832qz A04;

    public C41832Lt A00(AnonymousClass2z0 r10) {
        C624134x A05;
        Cursor A0E;
        int[] iArr;
        int length;
        if (r10 == null || (A05 = this.A04.A05(r10)) == null) {
            return null;
        }
        long j = A05.A1L;
        AnonymousClass4GK A032 = this.A03.get();
        try {
            C56862sg r3 = ((AnonymousClass3H0) A032).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            C18260x0.A1Y(A1Y, j);
            A0E = r3.A0E("SELECT sidecar, chunk_lengths FROM message_streaming_sidecar WHERE message_row_id = ?", "GET_MESSAGE_STREAMING_SIDECAR_SQL", A1Y);
            if (A0E.moveToLast()) {
                byte[] A1Z = C18280x3.A1Z(A0E, "sidecar");
                byte[] A1Z2 = C18280x3.A1Z(A0E, "chunk_lengths");
                if (A1Z2 == null || (length = A1Z2.length) <= 0 || length % 4 != 0) {
                    iArr = null;
                } else {
                    int i = length / 4;
                    iArr = new int[i];
                    for (int i2 = 0; i2 < i; i2++) {
                        int i3 = i2 * 4;
                        iArr[i2] = C18290x4.A07(A1Z2, A1Z2[i3], i3);
                    }
                }
                C41832Lt r0 = new C41832Lt(A1Z, iArr);
                A0E.close();
                A032.close();
                return r0;
            }
            A0E.close();
            A032.close();
            return null;
        } catch (Throwable th) {
            try {
                A032.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A01(C613030d r12, long j) {
        boolean z;
        C85284Fq A042;
        byte[] bArr;
        if (r12 != null) {
            synchronized (r12) {
                z = r12.A01;
            }
            if (z) {
                byte[] A06 = r12.A06();
                int[] A07 = r12.A07();
                try {
                    A042 = this.A03.A04();
                    ContentValues A062 = AnonymousClass0x9.A06();
                    C18270x1.A0a(A062, j);
                    A062.put("sidecar", A06);
                    if (A07 == null) {
                        bArr = null;
                    } else {
                        int length = A07.length;
                        bArr = new byte[(length * 4)];
                        for (int i = 0; i < length; i++) {
                            int i2 = i * 4;
                            int i3 = A07[i];
                            bArr[i2 + 3] = (byte) i3;
                            bArr[i2 + 2] = (byte) (i3 >> 8);
                            bArr[i2 + 1] = (byte) (i3 >> 16);
                            bArr[i2] = (byte) (i3 >> 24);
                        }
                    }
                    A062.put("chunk_lengths", bArr);
                    AnonymousClass3H0.A02(A062, A042, "timestamp", this.A00.A0H()).A0C("message_streaming_sidecar", "INSERT_MESSAGE_STREAMING_SIDECAR_SQL", A062, 5);
                    A042.close();
                    synchronized (r12) {
                        r12.A01 = false;
                    }
                    return;
                } catch (SQLiteConstraintException e) {
                    Log.e("SidecarMessageStore/insertStreamingSidecar/", e);
                    throw e;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                return;
            }
        } else {
            return;
        }
        throw th;
    }

    public C49802h7(C56612sH r2, C613830m r3, C54762pF r4, C72303dV r5, C55832qz r6) {
        this.A00 = r2;
        this.A04 = r6;
        this.A03 = r5;
        this.A01 = r3;
        this.A02 = r4.A01;
    }
}
