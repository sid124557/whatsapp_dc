package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2rV  reason: invalid class name and case insensitive filesystem */
public class C56152rV {
    public final C56612sH A00;
    public final C56922sm A01;
    public final C56982ss A02;
    public final C49472ga A03;
    public final C54762pF A04;
    public final C55272q5 A05;
    public final C72303dV A06;
    public final AnonymousClass1VX A07;
    public final C44632Ww A08;
    public final C55832qz A09;
    public final AnonymousClass2MN A0A;

    public C624134x A00(C95814uZ r10) {
        C624134x r4;
        C624134x r2 = null;
        if (r10 == null) {
            Log.e("msgstore/last/message/jid is null");
        } else {
            C56982ss r1 = this.A02;
            AnonymousClass31A A0A2 = r1.A0A(r10, false);
            if (A0A2 == null) {
                C18260x0.A1S(AnonymousClass001.A0o(), "msgstore/last/message/no chat for ", r10);
                return null;
            }
            r2 = A0A2.A0d;
            if (r2 == null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                AnonymousClass31A A0A3 = r1.A0A(r10, false);
                if (A0A3 != null) {
                    long j = A0A3.A0U;
                    if (j != 1) {
                        r4 = A01(r10, j, true);
                        this.A03.A02("LastMessageStore/getLastChatsListDisplayedMessageFromDb", C18310x6.A0A(uptimeMillis));
                        A0A2.A0d = r4;
                        return r4;
                    }
                }
                r4 = null;
                A0A2.A0d = r4;
                return r4;
            }
        }
        return r2;
    }

    public C624134x A02(C95814uZ r7, boolean z) {
        if (r7 == null) {
            Log.e("msgstore/last/message/jid is null");
            return null;
        }
        C56982ss r1 = this.A02;
        if (C56982ss.A00(r1, r7) == null) {
            C18260x0.A1S(AnonymousClass001.A0o(), "msgstore/last/message/no chat for ", r7);
            return null;
        }
        AnonymousClass31A A002 = C56982ss.A00(r1, r7);
        if (A002 == null) {
            return null;
        }
        long j = A002.A0N;
        if (j == 1) {
            return null;
        }
        C624134x r0 = A002.A0c;
        if (r0 != null) {
            return r0;
        }
        C624134x A012 = A01(r7, j, z);
        A002.A0c = A012;
        return A012;
    }

    public boolean A06(C95814uZ r7, long j) {
        Cursor A0E;
        boolean z = false;
        String[] A1Z = AnonymousClass0x9.A1Z();
        C56922sm.A02(this.A01, r7, A1Z, 0);
        C18270x1.A1R(A1Z, j);
        AnonymousClass4GK A032 = this.A06.get();
        try {
            A0E = ((AnonymousClass3H0) A032).A03.A0E("SELECT  1  FROM available_message_view WHERE chat_row_id = ? AND timestamp >= ? AND message_type NOT IN ('7') AND from_me = 1 LIMIT 1", "OUTGOING_MESSAGE_EXISTS_SINCE_TIMESTAMP_RAW_SQL", A1Z);
            if (A0E == null) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("msgstore/get/no outgoing message for: ");
                A0o.append(r7);
                C18260x0.A12(" after ", A0o, j);
            } else {
                if (A0E.getCount() > 0) {
                    z = true;
                }
                A0E.close();
            }
            A032.close();
            return z;
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

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0089, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        X.AnonymousClass2A8.A00(r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0090, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        X.AnonymousClass2A8.A00(r8, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0094, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C624134x A01(X.C95814uZ r13, long r14, boolean r16) {
        /*
            r12 = this;
            X.2qz r0 = r12.A09
            if (r16 == 0) goto L_0x003c
            X.34x r11 = X.C55122pp.A00(r0, r14)
        L_0x0008:
            boolean r0 = r13 instanceof X.C28001fK
            if (r0 == 0) goto L_0x003b
            boolean r0 = r11 instanceof X.C30341mI
            if (r0 == 0) goto L_0x003b
            r4 = r11
            X.1mI r4 = (X.C30341mI) r4
            int r1 = r4.A00
            r0 = 2
            if (r1 != r0) goto L_0x003b
            java.lang.String r0 = "msgstore/initialize/update-group-create-failed-msg"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3 = r4
            X.1p1 r3 = (X.C31891p1) r3
            X.2z0 r2 = r4.A1J
            long r0 = r4.A0K
            X.1oQ r11 = new X.1oQ
            r11.<init>(r2, r0)
            java.lang.String r0 = r4.A13()
            r11.A1Z(r0)
            java.util.List r0 = r3.A01
            r11.A1h(r0)
            X.2pF r0 = r12.A04
            r0.A02(r11)
        L_0x003b:
            return r11
        L_0x003c:
            X.2pp r7 = r0.A02
            java.lang.String r4 = "CachedMessageStore/getMessageWithoutComments/rowId"
            r10 = 0
            long r1 = android.os.SystemClock.uptimeMillis()
            X.3dV r0 = r7.A08     // Catch:{ all -> 0x0095 }
            X.4GK r8 = r0.get()     // Catch:{ all -> 0x0095 }
            r0 = r8
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x008e }
            X.2sg r9 = r0.A03     // Catch:{ all -> 0x008e }
            java.lang.String r6 = X.C58162uo.A0D     // Catch:{ all -> 0x008e }
            java.lang.String[] r5 = X.AnonymousClass0x9.A1Z()     // Catch:{ all -> 0x008e }
            X.2sm r3 = r7.A03     // Catch:{ all -> 0x008e }
            X.C56922sm.A02(r3, r13, r5, r10)     // Catch:{ all -> 0x008e }
            X.C18270x1.A1R(r5, r14)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "GET_MESSAGE_BY_ROW_ID_WITHOUT_COMMENTS_SQL"
            android.database.Cursor r9 = r9.A0E(r6, r0, r5)     // Catch:{ all -> 0x008e }
            boolean r0 = r9.moveToLast()     // Catch:{ all -> 0x0087 }
            r11 = 0
            if (r0 == 0) goto L_0x007b
            java.lang.String r0 = "chat_row_id"
            long r5 = X.AnonymousClass0x2.A0C(r9, r0)     // Catch:{ all -> 0x0087 }
            X.4uZ r0 = r3.A0B(r5)     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x007b
            X.34x r11 = r7.A02(r9, r0, r10)     // Catch:{ all -> 0x0087 }
        L_0x007b:
            r9.close()     // Catch:{ all -> 0x008e }
            r8.close()     // Catch:{ all -> 0x0095 }
            X.2ga r0 = r7.A05
            X.C49472ga.A00(r0, r4, r1)
            goto L_0x0008
        L_0x0087:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0089 }
        L_0x0089:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r9, r3)     // Catch:{ all -> 0x008e }
            throw r0     // Catch:{ all -> 0x008e }
        L_0x008e:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0090 }
        L_0x0090:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r8, r3)     // Catch:{ all -> 0x0095 }
            throw r0     // Catch:{ all -> 0x0095 }
        L_0x0095:
            r3 = move-exception
            X.2ga r0 = r7.A05
            X.C49472ga.A00(r0, r4, r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56152rV.A01(X.4uZ, long, boolean):X.34x");
    }

    public final void A05(Cursor cursor, C95814uZ r5, ArrayList arrayList, boolean z) {
        if (cursor != null) {
            while (cursor.moveToNext()) {
                try {
                    C624134x A042 = this.A09.A04(cursor, r5);
                    if (A042 != null) {
                        if ((A042 instanceof C30721mu) && A042.A09 == 1) {
                            AnonymousClass33C r0 = ((C30721mu) A042).A01;
                            if (r0 == null || !r0.A0R) {
                                if (z) {
                                    Log.d("lastmessagestore/populatenotificationmessages/not transferred");
                                }
                            }
                        } else if (!(A042 instanceof C30441mS)) {
                        }
                        arrayList.add(A042);
                    } else if (z) {
                        Log.d("lastmessagestore/populatenotificationmessages/null");
                    }
                } catch (SQLiteDatabaseCorruptException e) {
                    Log.e((Throwable) e);
                    this.A05.A04();
                } catch (IllegalStateException e2) {
                    Log.i("msgstore/getlastmessagesfornotification/IllegalStateException ", e2);
                } catch (Throwable th) {
                    cursor.close();
                    throw th;
                }
            }
            cursor.close();
        }
    }

    public C56152rV(C56612sH r1, C56922sm r2, C56982ss r3, C49472ga r4, C54762pF r5, C55272q5 r6, C72303dV r7, AnonymousClass1VX r8, C44632Ww r9, C55832qz r10, AnonymousClass2MN r11) {
        this.A00 = r1;
        this.A07 = r8;
        this.A01 = r2;
        this.A02 = r3;
        this.A09 = r10;
        this.A08 = r9;
        this.A03 = r4;
        this.A04 = r5;
        this.A06 = r7;
        this.A05 = r6;
        this.A0A = r11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r0 != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A03(X.C95814uZ r11, int r12) {
        /*
            r10 = this;
            long r8 = android.os.SystemClock.uptimeMillis()
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            r7 = 1
            if (r12 != r7) goto L_0x0063
            X.34x r2 = r10.A00(r11)
            if (r2 == 0) goto L_0x0056
            X.2z0 r0 = r2.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0026
            X.2Ww r0 = r10.A08
            boolean r0 = r0.A00(r2)
            if (r0 != 0) goto L_0x0026
            boolean r0 = r2 instanceof X.C30341mI
            if (r0 != 0) goto L_0x0057
            r0 = 0
        L_0x0024:
            if (r0 == 0) goto L_0x0063
        L_0x0026:
            boolean r0 = r2 instanceof X.C30691mr
            if (r0 != 0) goto L_0x0063
            boolean r0 = r2 instanceof X.C30351mJ
            if (r0 != 0) goto L_0x0063
            boolean r0 = r2 instanceof X.C30441mS
            if (r0 != 0) goto L_0x0063
            boolean r0 = r2 instanceof X.C30521ma
            if (r0 != 0) goto L_0x0063
            boolean r0 = r2 instanceof X.C30311mF
            if (r0 != 0) goto L_0x0063
            byte r1 = r2.A1I
            r0 = 90
            if (r1 == r0) goto L_0x0063
            boolean r0 = r2 instanceof X.C30721mu
            if (r0 == 0) goto L_0x0053
            int r0 = r2.A09
            if (r0 != r7) goto L_0x0053
            r0 = r2
            X.1mV r0 = (X.C30471mV) r0
            X.33C r0 = r0.A01
            if (r0 == 0) goto L_0x0056
            boolean r0 = r0.A0R
            if (r0 == 0) goto L_0x0056
        L_0x0053:
            r6.add(r2)
        L_0x0056:
            return r6
        L_0x0057:
            r0 = r2
            X.1mI r0 = (X.C30341mI) r0
            int r1 = r0.A00
            java.util.Set r0 = X.AnonymousClass34J.A01
            boolean r0 = X.C18300x5.A1X(r0, r1)
            goto L_0x0024
        L_0x0063:
            X.3dV r0 = r10.A06
            X.4GK r5 = r0.get()
            java.lang.String r4 = X.C58122uk.A04     // Catch:{ all -> 0x00a5 }
            java.lang.String r3 = "GET_NOTIFICATION_MESSAGES_SQL"
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00a5 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x00a5 }
            java.lang.String[] r1 = X.AnonymousClass0x9.A1Z()     // Catch:{ all -> 0x00a5 }
            X.2sm r0 = r10.A01     // Catch:{ all -> 0x00a5 }
            X.C56922sm.A01(r0, r11, r1)     // Catch:{ all -> 0x00a5 }
            X.C18280x3.A1Q(r1, r12, r7)     // Catch:{ all -> 0x00a5 }
            android.database.Cursor r0 = r2.A0E(r4, r3, r1)     // Catch:{ all -> 0x00a5 }
            r10.A05(r0, r11, r6, r7)     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x008a
            r0.close()     // Catch:{ all -> 0x00a5 }
        L_0x008a:
            r5.close()
            X.2ga r3 = r10.A03
            long r1 = X.C18310x6.A0A(r8)
            java.lang.String r0 = "LastMessageStore/getLastMessagesForNotification"
            r3.A02(r0, r1)
            return r6
        L_0x0099:
            r1 = move-exception
            if (r0 == 0) goto L_0x00a4
            r0.close()     // Catch:{ all -> 0x00a0 }
            goto L_0x00a4
        L_0x00a0:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00a5 }
        L_0x00a4:
            throw r1     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x00aa }
            throw r1
        L_0x00aa:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56152rV.A03(X.4uZ, int):java.util.ArrayList");
    }

    public final List A04(C95814uZ r7, int i, boolean z, boolean z2) {
        String str;
        Cursor A0E;
        ArrayList A0s = AnonymousClass001.A0s();
        if (z && z2) {
            str = C58162uo.A07;
        } else if (z) {
            str = C58162uo.A06;
        } else {
            str = C58162uo.A05;
        }
        try {
            AnonymousClass4GK A032 = this.A06.get();
            try {
                C56862sg r3 = ((AnonymousClass3H0) A032).A03;
                String[] A1Z = AnonymousClass0x9.A1Z();
                C56922sm.A01(this.A01, r7, A1Z);
                C18270x1.A1P(A1Z, i);
                A0E = r3.A0E(str, "GET_LAST_SIGNIFICANT_INCOMING_MESSAGES_SQL", A1Z);
                while (A0E.moveToNext()) {
                    C624134x A042 = this.A09.A04(A0E, r7);
                    if (A042 != null) {
                        A0s.add(A042);
                    }
                }
                A0E.close();
                A032.close();
                return A0s;
            } catch (Throwable th) {
                A032.close();
                throw th;
            }
            throw th;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e((Throwable) e);
            this.A05.A04();
            return A0s;
        } catch (IllegalStateException e2) {
            Log.i("msgstore/getlastsignificantincomingmessages/IllegalStateException ", e2);
            return A0s;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }
}
