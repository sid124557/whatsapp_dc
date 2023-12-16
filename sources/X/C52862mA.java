package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;

/* renamed from: X.2mA  reason: invalid class name and case insensitive filesystem */
public class C52862mA {
    public final C56972sr A00;
    public final C56922sm A01;
    public final C72303dV A02;
    public final C56082rO A03;

    public void A01(C30361mK r7) {
        Cursor A0E;
        C624134x.A0V(r7, "LocationMessageStore/fillLocationInfo/message must have row_id set; key=", AnonymousClass001.A0o(), AnonymousClass001.A1W((r7.A1L > 0 ? 1 : (r7.A1L == 0 ? 0 : -1))));
        String[] strArr = new String[1];
        C624134x.A0X(r7, strArr);
        AnonymousClass4GK A032 = this.A02.get();
        try {
            A0E = ((AnonymousClass3H0) A032).A03.A0E("SELECT latitude, longitude, place_name, place_address, url, live_location_share_duration, live_location_sequence_number, live_location_final_latitude, live_location_final_longitude, live_location_final_timestamp, map_download_status FROM message_location WHERE message_row_id = ?", "GET_LOCATION_MESSAGE_BY_ROW_ID_SQL", strArr);
            if (A0E.moveToNext()) {
                r7.A1w(A0E, this.A00);
            }
            A0E.close();
            A032.close();
            return;
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

    /* JADX WARNING: Removed duplicated region for block: B:10:0x008d A[Catch:{ SQLiteConstraintException -> 0x00dc, all -> 0x0102 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.C30361mK r21) {
        /*
            r20 = this;
            r4 = r21
            long r7 = r4.A1L
            r5 = 0
            r3 = 0
            r2 = 1
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            boolean r5 = X.AnonymousClass001.A1W(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "LocationMessageStore/insertOrUpdateLocationMessage/message must have row_id set; key="
            X.2z0 r6 = X.C624134x.A09(r4, r0, r1, r5)
            int r0 = r4.A0l()
            boolean r5 = X.AnonymousClass000.A1U(r0, r2)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "LocationMessageStore/insertOrUpdateLocationMessage/message in main storage; key="
            X.C18260x0.A0l(r6, r0, r1, r5)
            r1 = r20
            X.3dV r0 = r1.A02
            X.4Fq r13 = r0.A04()
            android.content.ContentValues r15 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x0102 }
            X.C624134x.A0F(r15, r4)     // Catch:{ SQLiteConstraintException -> 0x00dc }
            X.2sm r1 = r1.A01     // Catch:{ SQLiteConstraintException -> 0x00dc }
            X.4uZ r0 = X.AnonymousClass2z0.A01(r6)     // Catch:{ SQLiteConstraintException -> 0x00dc }
            X.C56922sm.A00(r15, r1, r0)     // Catch:{ SQLiteConstraintException -> 0x00dc }
            double r0 = r4.A00     // Catch:{ SQLiteConstraintException -> 0x00dc }
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x00dc }
            java.lang.String r0 = "latitude"
            r15.put(r0, r1)     // Catch:{ SQLiteConstraintException -> 0x00dc }
            double r0 = r4.A01     // Catch:{ SQLiteConstraintException -> 0x00dc }
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x00dc }
            java.lang.String r0 = "longitude"
            r15.put(r0, r1)     // Catch:{ SQLiteConstraintException -> 0x00dc }
            boolean r0 = r4 instanceof X.AnonymousClass1n9     // Catch:{ SQLiteConstraintException -> 0x00dc }
            java.lang.String r9 = "live_location_sequence_number"
            java.lang.String r10 = "live_location_share_duration"
            java.lang.String r11 = "url"
            java.lang.String r12 = "place_address"
            java.lang.String r5 = "place_name"
            java.lang.String r6 = "live_location_final_timestamp"
            java.lang.String r7 = "live_location_final_longitude"
            java.lang.String r8 = "live_location_final_latitude"
            if (r0 == 0) goto L_0x008e
            r1 = r4
            X.1n9 r1 = (X.AnonymousClass1n9) r1     // Catch:{ SQLiteConstraintException -> 0x00dc }
            java.lang.String r0 = r1.A01     // Catch:{ SQLiteConstraintException -> 0x00dc }
            X.C621833x.A02(r15, r5, r0)     // Catch:{ SQLiteConstraintException -> 0x00dc }
            java.lang.String r0 = r1.A00     // Catch:{ SQLiteConstraintException -> 0x00dc }
            X.C621833x.A02(r15, r12, r0)     // Catch:{ SQLiteConstraintException -> 0x00dc }
            java.lang.String r0 = r1.A02     // Catch:{ SQLiteConstraintException -> 0x00dc }
            X.C621833x.A02(r15, r11, r0)     // Catch:{ SQLiteConstraintException -> 0x00dc }
            r15.putNull(r10)     // Catch:{ SQLiteConstraintException -> 0x00dc }
            r15.putNull(r9)     // Catch:{ SQLiteConstraintException -> 0x00dc }
        L_0x0086:
            X.C18310x6.A0w(r15, r8, r7, r6)     // Catch:{ SQLiteConstraintException -> 0x00dc }
        L_0x0089:
            int r0 = r4.A02     // Catch:{ SQLiteConstraintException -> 0x00dc }
            if (r0 != r2) goto L_0x00b7
            goto L_0x00b6
        L_0x008e:
            boolean r0 = r4 instanceof X.C30801n8     // Catch:{ SQLiteConstraintException -> 0x00dc }
            if (r0 == 0) goto L_0x0089
            X.C18310x6.A0w(r15, r5, r12, r11)     // Catch:{ SQLiteConstraintException -> 0x00dc }
            r5 = r4
            X.1n8 r5 = (X.C30801n8) r5     // Catch:{ SQLiteConstraintException -> 0x00dc }
            int r0 = r5.A00     // Catch:{ SQLiteConstraintException -> 0x00dc }
            X.C18270x1.A0b(r15, r10, r0)     // Catch:{ SQLiteConstraintException -> 0x00dc }
            long r0 = r5.A01     // Catch:{ SQLiteConstraintException -> 0x00dc }
            X.C18270x1.A0c(r15, r9, r0)     // Catch:{ SQLiteConstraintException -> 0x00dc }
            X.2pX r5 = r5.A02     // Catch:{ SQLiteConstraintException -> 0x00dc }
            if (r5 == 0) goto L_0x0086
            double r0 = r5.A00     // Catch:{ SQLiteConstraintException -> 0x00dc }
            X.C18300x5.A12(r15, r8, r0)     // Catch:{ SQLiteConstraintException -> 0x00dc }
            double r0 = r5.A01     // Catch:{ SQLiteConstraintException -> 0x00dc }
            X.C18300x5.A12(r15, r7, r0)     // Catch:{ SQLiteConstraintException -> 0x00dc }
            long r0 = r5.A05     // Catch:{ SQLiteConstraintException -> 0x00dc }
            X.C18270x1.A0c(r15, r6, r0)     // Catch:{ SQLiteConstraintException -> 0x00dc }
            goto L_0x0089
        L_0x00b6:
            r0 = 0
        L_0x00b7:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x00dc }
            java.lang.String r0 = "map_download_status"
            r15.put(r0, r1)     // Catch:{ SQLiteConstraintException -> 0x00dc }
            r0 = r13
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ SQLiteConstraintException -> 0x00dc }
            X.2sg r5 = r0.A03     // Catch:{ SQLiteConstraintException -> 0x00dc }
            java.lang.String r1 = "message_location"
            java.lang.String r0 = "INSERT_MESSAGE_LOCATION_SQL"
            long r7 = r5.A09(r1, r0, r15)     // Catch:{ SQLiteConstraintException -> 0x00dc }
            long r5 = r4.A1L     // Catch:{ SQLiteConstraintException -> 0x00dc }
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1T(r0)
            java.lang.String r0 = "LocationMessageStore/insertOrUpdateLocationMessage/inserted row should have same row_id"
            X.C626936e.A0F(r1, r0)     // Catch:{ SQLiteConstraintException -> 0x00dc }
            goto L_0x00fe
        L_0x00dc:
            r1 = move-exception
            java.lang.String r0 = "message_row_id"
            r15.remove(r0)     // Catch:{ all -> 0x0102 }
            r0 = r13
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0102 }
            X.2sg r14 = r0.A03     // Catch:{ all -> 0x0102 }
            java.lang.String r16 = "message_location"
            java.lang.String r17 = "message_row_id = ?"
            java.lang.String[] r0 = new java.lang.String[r2]     // Catch:{ all -> 0x0102 }
            X.C624134x.A0Y(r4, r0, r3)     // Catch:{ all -> 0x0102 }
            java.lang.String r18 = "UPDATE_MESSAGE_LOCATION_SQL"
            r19 = r0
            int r0 = r14.A05(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0102 }
            if (r0 == r2) goto L_0x00fe
            throw r1     // Catch:{ all -> 0x0102 }
        L_0x00fe:
            r13.close()
            return
        L_0x0102:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x0107 }
            throw r1
        L_0x0107:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52862mA.A02(X.1mK):void");
    }

    public void A03(C30361mK r18, long j) {
        ContentValues A06;
        long j2;
        C30361mK r9 = r18;
        C624134x.A0V(r9, "LocationMessageStore/insertOrUpdateQuotedLocationMessage/message in main storage; key=", AnonymousClass001.A0o(), AnonymousClass000.A1U(r9.A0l(), 2));
        C85284Fq A04 = this.A02.A04();
        try {
            A06 = AnonymousClass0x9.A06();
            j2 = j;
            C18270x1.A0a(A06, j2);
            A06.put("latitude", Double.valueOf(r9.A00));
            A06.put("longitude", Double.valueOf(r9.A01));
            if (r9 instanceof AnonymousClass1n9) {
                AnonymousClass1n9 r3 = (AnonymousClass1n9) r9;
                C621833x.A02(A06, "place_name", r3.A01);
                C621833x.A02(A06, "place_address", r3.A00);
                C621833x.A02(A06, "url", r3.A02);
            } else if (r9 instanceof C30801n8) {
                C18310x6.A0w(A06, "place_name", "place_address", "url");
            }
            C621833x.A04(A06, "thumbnail", r9.A0y().A09());
            C626936e.A0F(AnonymousClass000.A1T((((AnonymousClass3H0) A04).A03.A09("message_quoted_location", "INSERT_MESSAGE_QUOTED_LOCATION_SQL", A06) > j ? 1 : (((AnonymousClass3H0) A04).A03.A09("message_quoted_location", "INSERT_MESSAGE_QUOTED_LOCATION_SQL", A06) == j ? 0 : -1))), "LocationMessageStore/insertOrUpdateQuotedLocationMessage/inserted row should have same row_id");
        } catch (SQLiteConstraintException e) {
            A06.remove("message_row_id");
            C56862sg r11 = ((AnonymousClass3H0) A04).A03;
            String[] strArr = new String[1];
            AnonymousClass0x2.A1S(strArr, 0, j2);
            if (r11.A05(A06, "message_quoted_location", "message_row_id = ?", "UPDATE_MESSAGE_QUOTED_LOCATION_SQL", strArr) != 1) {
                throw e;
            }
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        A04.close();
    }

    public C52862mA(C56972sr r1, C56922sm r2, C72303dV r3, C56082rO r4) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
    }

    public static void A00(C183538qC r0, Object obj) {
        ((C52862mA) r0.get()).A02((C30361mK) obj);
    }
}
