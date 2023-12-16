package X;

import android.database.Cursor;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Fd  reason: invalid class name and case insensitive filesystem */
public class C64823Fd implements AnonymousClass4E8 {
    public final C56612sH A00;
    public final C55672qj A01;
    public final C55062pj A02;
    public final AnonymousClass30T A03;
    public final AnonymousClass2S9 A04;
    public final C49502gd A05;
    public final C61152zn A06;
    public final C49802h7 A07;
    public final C55152pt A08;
    public final C620333f A09;
    public final C48042eF A0A;
    public final C42372Nv A0B;
    public final AnonymousClass3H1 A0C;

    public void BQW() {
        Cursor A012;
        C48042eF r1 = this.A0A;
        Log.i("SharedMediaIdsStore/deleteOutdatedRecords");
        AnonymousClass4GK A0C2 = r1.A00.A0C();
        try {
            C56862sg r5 = ((AnonymousClass3H0) A0C2).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            C18260x0.A1X(A1Y, System.currentTimeMillis());
            r5.A07("shared_media_ids", "expiration_timestamp <?", "deleteOutdatedRecords/DELETE_OUTDATED_SHARED_MEDIA", A1Y);
            A0C2.close();
            AnonymousClass3H1 r3 = this.A0C;
            List<AnonymousClass33G> A0D = r3.A01.A0D();
            HashSet A0p = C18320x8.A0p(A0D);
            for (AnonymousClass33G r0 : A0D) {
                A0p.add(r0.A07);
            }
            C56302rl r52 = r3.A02;
            C626936e.A00();
            HashSet A0K = AnonymousClass002.A0K();
            A0C2 = r52.A00.get();
            A012 = C56862sg.A01(((AnonymousClass3H0) A0C2).A03, "SELECT DISTINCT device_id FROM peer_messages", "PeerMessagesTable.SELECT_ALL_RECIPIENTS");
            while (A012.moveToNext()) {
                DeviceJid nullable = DeviceJid.getNullable(AnonymousClass0x2.A0Z(A012, "device_id"));
                if (nullable != null) {
                    A0K.add(nullable);
                }
            }
            A012.close();
            A0C2.close();
            A0K.removeAll(A0p);
            Iterator it = A0K.iterator();
            while (it.hasNext()) {
                r52.A05(AnonymousClass0x7.A0R(it));
            }
            if (!A0K.isEmpty()) {
                r3.A00.A0A("orphan-peer-messages", false, String.valueOf(A0K.size()));
                return;
            }
            return;
        } catch (Throwable th) {
            try {
                A0C2.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x041c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:?, code lost:
        X.AnonymousClass2A8.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0420, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0428, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0429, code lost:
        X.AnonymousClass2A8.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x042c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BQX() {
        /*
            r20 = this;
            r4 = r20
            X.30T r0 = r4.A03
            r0.A03()
            X.2pt r1 = r4.A08
            X.2m9 r2 = r1.A05
            r0 = 26
            X.3Zk r1 = X.C69983Zk.A00(r1, r0)
            r0 = 40
            r2.A01(r1, r0)
            X.2gd r1 = r4.A05
            X.3dV r0 = r1.A03
            X.4Fq r8 = r0.A04()
            X.2sH r0 = r1.A00     // Catch:{ all -> 0x042d }
            long r2 = r0.A0H()     // Catch:{ all -> 0x042d }
            r0 = 5184000000(0x134fd9000, double:2.561236308E-314)
            long r6 = X.C18280x3.A08(r2, r0)     // Catch:{ all -> 0x042d }
            r0 = r8
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x042d }
            X.2sg r5 = r0.A03     // Catch:{ all -> 0x042d }
            java.lang.String r3 = "receipt_orphaned"
            java.lang.String r2 = "timestamp < ?"
            java.lang.String[] r1 = X.C18260x0.A1b(r6)     // Catch:{ all -> 0x042d }
            java.lang.String r0 = "deleteOldOrphanedReceipts/DELETE_RECEIPT_ORPHANED"
            int r2 = r5.A07(r3, r2, r0, r1)     // Catch:{ all -> 0x042d }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x042d }
            java.lang.String r0 = "orphanedreceiptstore/deleteOldOrphanedReceipts/"
            r1.append(r0)     // Catch:{ all -> 0x042d }
            r1.append(r2)     // Catch:{ all -> 0x042d }
            java.lang.String r0 = " old orphaned receipts removed"
            X.C18260x0.A1J(r1, r0)     // Catch:{ all -> 0x042d }
            r8.close()
            X.2h7 r12 = r4.A07
            X.2sH r3 = r4.A00
            long r5 = r3.A0H()
            long r0 = X.AnonymousClass2BH.A00
            long r5 = r5 - r0
            r11 = 200(0xc8, float:2.8E-43)
            r10 = 1
            r19 = 500(0x1f4, float:7.0E-43)
        L_0x0067:
            r14 = 0
            X.3dV r0 = r12.A03     // Catch:{ Exception -> 0x011c }
            X.4Fq r18 = r0.A04()     // Catch:{ Exception -> 0x011c }
            X.3Yo r17 = r18.Axl()     // Catch:{ all -> 0x0112 }
            r0 = r18
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0108 }
            X.2sg r13 = r0.A03     // Catch:{ all -> 0x0108 }
            java.lang.String r2 = "SELECT message_row_id FROM message_streaming_sidecar WHERE timestamp < ? LIMIT ?"
            java.lang.String[] r1 = X.AnonymousClass0x9.A1Z()     // Catch:{ all -> 0x0108 }
            X.AnonymousClass0x2.A1S(r1, r14, r5)     // Catch:{ all -> 0x0108 }
            X.C18280x3.A1Q(r1, r11, r10)     // Catch:{ all -> 0x0108 }
            java.lang.String r0 = "GET_MESSAGE_STREAMING_SIDECAR_OLDER_THAN_SQL"
            android.database.Cursor r9 = r13.A0E(r2, r0, r1)     // Catch:{ all -> 0x0108 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00fc }
            java.lang.String r0 = "SidecarMessageStore/deleteStreamingSidecarOlderThan num messages to update:"
            int r0 = X.AnonymousClass0x9.A02(r9, r0, r1)     // Catch:{ all -> 0x00fc }
            X.C18260x0.A1G(r1, r0)     // Catch:{ all -> 0x00fc }
            int r0 = r9.getCount()     // Catch:{ all -> 0x00fc }
            boolean r16 = X.C18280x3.A1U(r0, r11)
            r8 = 0
        L_0x00a0:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x00fc }
            if (r0 == 0) goto L_0x00df
            java.lang.String r0 = "message_row_id"
            long r1 = X.AnonymousClass0x2.A0C(r9, r0)     // Catch:{ all -> 0x00fc }
            X.2qz r0 = r12.A04     // Catch:{ all -> 0x00fc }
            X.34x r7 = X.C55122pp.A00(r0, r1)     // Catch:{ all -> 0x00fc }
            boolean r0 = r7 instanceof X.C30471mV     // Catch:{ all -> 0x00fc }
            if (r0 == 0) goto L_0x00cc
            r0 = r7
            X.1mV r0 = (X.C30471mV) r0     // Catch:{ all -> 0x00fc }
            X.33C r0 = X.C30471mV.A00(r0)     // Catch:{ all -> 0x00fc }
            r0.A0N = r14     // Catch:{ all -> 0x00fc }
            X.2lK r15 = r12.A02     // Catch:{ all -> 0x00fc }
            X.2z0 r0 = r7.A1J     // Catch:{ all -> 0x00fc }
            r15.A01(r7, r0)     // Catch:{ all -> 0x00fc }
            X.30m r0 = r12.A01     // Catch:{ all -> 0x00fc }
            r0.A06(r7)     // Catch:{ all -> 0x00fc }
        L_0x00cc:
            java.lang.String r15 = "message_streaming_sidecar"
            java.lang.String r7 = "message_row_id = ?"
            java.lang.String[] r0 = new java.lang.String[r10]     // Catch:{ all -> 0x00fc }
            X.AnonymousClass0x2.A1S(r0, r14, r1)     // Catch:{ all -> 0x00fc }
            java.lang.String r1 = "deleteStreamingSidecarOlderThan/DELETE_MESSAGE_STREAMING_SIDECAR_BY_MESSAGE_ID"
            int r0 = r13.A07(r15, r7, r1, r0)     // Catch:{ all -> 0x00fc }
            int r8 = r8 + r0
            goto L_0x00a0
        L_0x00df:
            r17.A00()     // Catch:{ all -> 0x00fc }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00fc }
            java.lang.String r0 = "SidecarMessageStore/deleteStreamingSidecarOlderThan deleting rows:"
            X.C18260x0.A0y(r0, r1, r8)     // Catch:{ all -> 0x00fc }
            r9.close()     // Catch:{ all -> 0x0108 }
            r17.close()     // Catch:{ all -> 0x0112 }
            r18.close()     // Catch:{ Exception -> 0x011c }
            int r19 = r19 + -1
            if (r16 == 0) goto L_0x0122
            if (r19 <= 0) goto L_0x0122
            goto L_0x0067
        L_0x00fc:
            r1 = move-exception
            if (r9 == 0) goto L_0x0107
            r9.close()     // Catch:{ all -> 0x0103 }
            goto L_0x0107
        L_0x0103:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0108 }
        L_0x0107:
            throw r1     // Catch:{ all -> 0x0108 }
        L_0x0108:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x010d }
            goto L_0x0111
        L_0x010d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0112 }
        L_0x0111:
            throw r1     // Catch:{ all -> 0x0112 }
        L_0x0112:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x0117 }
            goto L_0x011b
        L_0x0117:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x011c }
        L_0x011b:
            throw r1     // Catch:{ Exception -> 0x011c }
        L_0x011c:
            r1 = move-exception
            java.lang.String r0 = "SidecarMessageStore/deleteStreamingSidecarOlderThan"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0122:
            X.2S9 r9 = r4.A04
            X.2sH r0 = r9.A00
            long r5 = r0.A0H()
            r0 = 2678400000(0x9fa52400, double:1.323305426E-314)
            long r5 = r5 - r0
        L_0x0130:
            X.3dV r0 = r9.A03     // Catch:{ Exception -> 0x0209 }
            X.4Fq r16 = r0.A04()     // Catch:{ Exception -> 0x0209 }
            X.3Yo r15 = r16.Axl()     // Catch:{ all -> 0x01ff }
            r7 = 200(0xc8, float:2.8E-43)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01f5 }
            java.lang.String r0 = "MmsThumbnailMetadataMessageStore/getMmsThumbnailMetadataMessageRowIdOlderThan/expirationTime: "
            X.C18260x0.A10(r0, r1, r5)     // Catch:{ all -> 0x01f5 }
            r0 = r16
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x01f5 }
            X.2sg r10 = r0.A03     // Catch:{ all -> 0x01f5 }
            java.lang.String[] r2 = X.AnonymousClass0x9.A1Z()     // Catch:{ all -> 0x01f5 }
            X.C18260x0.A1W(r2, r7, r5)     // Catch:{ all -> 0x01f5 }
            java.lang.String r1 = "GET_MMS_THUMBNAIL_METADATA_MESSAGE_ROW_ID_OLDER_THAN_SQL"
            java.lang.String r0 = "SELECT message_row_id FROM mms_thumbnail_metadata WHERE insert_timestamp < ? LIMIT ?"
            android.database.Cursor r7 = r10.A0E(r0, r1, r2)     // Catch:{ all -> 0x01f5 }
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x01e9 }
            java.lang.String r0 = "message_row_id"
            int r1 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01e9 }
        L_0x0165:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x01e9 }
            if (r0 == 0) goto L_0x016f
            X.C18260x0.A0H(r7, r2, r1)     // Catch:{ all -> 0x01e9 }
            goto L_0x0165
        L_0x016f:
            r7.close()     // Catch:{ all -> 0x01f5 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01f5 }
            java.lang.String r0 = "MmsThumbnailMetadataDeletionManager/deleteMmsThumbnailMetadataOlderThan num messages to update:"
            X.C18260x0.A1B(r0, r1, r2)     // Catch:{ all -> 0x01f5 }
            int r0 = r2.size()     // Catch:{ all -> 0x01f5 }
            boolean r14 = X.AnonymousClass001.A1W(r0)
            java.util.Iterator r13 = r2.iterator()     // Catch:{ all -> 0x01f5 }
            r8 = 0
        L_0x0188:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x01f5 }
            if (r0 == 0) goto L_0x01d0
            java.lang.Object r0 = r13.next()     // Catch:{ all -> 0x01f5 }
            long r0 = X.C18320x8.A05(r0)     // Catch:{ all -> 0x01f5 }
            X.2qz r11 = r9.A05     // Catch:{ all -> 0x01f5 }
            X.34x r7 = X.C55122pp.A00(r11, r0)     // Catch:{ all -> 0x01f5 }
            if (r7 == 0) goto L_0x01bb
            X.2gb r12 = r9.A02     // Catch:{ all -> 0x01f5 }
            X.2z0 r2 = r7.A1J     // Catch:{ all -> 0x01f5 }
            X.4uZ r2 = r2.A00     // Catch:{ all -> 0x01f5 }
            java.util.Map r12 = r12.A03     // Catch:{ all -> 0x01f5 }
            java.lang.Object r2 = r12.get(r2)     // Catch:{ all -> 0x01f5 }
            if (r2 != 0) goto L_0x0188
            r2 = 0
            java.lang.Object r2 = r12.get(r2)     // Catch:{ all -> 0x01f5 }
            if (r2 != 0) goto L_0x0188
            r2 = 0
            r7.A1W(r2)     // Catch:{ all -> 0x01f5 }
            r2 = -1
            r11.A07(r7, r2)     // Catch:{ all -> 0x01f5 }
        L_0x01bb:
            java.lang.String[] r7 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x01f5 }
            X.C18270x1.A1S(r7, r0)     // Catch:{ all -> 0x01f5 }
            java.lang.String r2 = "deleteMmsThumbnailMetadataOlderThan/DELETE_MMS_THUMBNAIL_METADATA_BY_MESSAGE_ID"
            java.lang.String r1 = "mms_thumbnail_metadata"
            java.lang.String r0 = "message_row_id = ?"
            int r0 = r10.A07(r1, r0, r2, r7)     // Catch:{ all -> 0x01f5 }
            int r8 = r8 + r0
            goto L_0x0188
        L_0x01d0:
            r15.A00()     // Catch:{ all -> 0x01f5 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01f5 }
            java.lang.String r0 = "MmsThumbnailMetadataDeletionManager/deleteMmsThumbnailMetadataOlderThan deleting rows:"
            X.C18260x0.A0y(r0, r1, r8)     // Catch:{ all -> 0x01f5 }
            if (r8 != 0) goto L_0x01df
            r14 = 0
        L_0x01df:
            r15.close()     // Catch:{ all -> 0x01ff }
            r16.close()     // Catch:{ Exception -> 0x0209 }
            if (r14 == 0) goto L_0x020f
            goto L_0x0130
        L_0x01e9:
            r1 = move-exception
            if (r7 == 0) goto L_0x01f4
            r7.close()     // Catch:{ all -> 0x01f0 }
            goto L_0x01f4
        L_0x01f0:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01f5 }
        L_0x01f4:
            throw r1     // Catch:{ all -> 0x01f5 }
        L_0x01f5:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x01fa }
            goto L_0x01fe
        L_0x01fa:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01ff }
        L_0x01fe:
            throw r1     // Catch:{ all -> 0x01ff }
        L_0x01ff:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x0204 }
            goto L_0x0208
        L_0x0204:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x0209 }
        L_0x0208:
            throw r1     // Catch:{ Exception -> 0x0209 }
        L_0x0209:
            r1 = move-exception
            java.lang.String r0 = "MmsThumbnailMetadataDeletionManager/deleteMmsThumbnailMetadataOlderThan"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x020f:
            X.33f r11 = r4.A09
            java.lang.String r0 = "MessageAddOnManager/deleteOldOrphanedMessageAddOns"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2sH r10 = r11.A06
            long r0 = r10.A0H()
            int r2 = r11.A00
            long r5 = X.AnonymousClass0x7.A0D(r2)
            long r0 = r0 - r5
            X.2SB r2 = r11.A0K
            X.3dV r2 = r2.A03
            X.4Fq r8 = r2.A04()
            r2 = 1
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch:{ all -> 0x042d }
            X.C18260x0.A1X(r6, r0)     // Catch:{ all -> 0x042d }
            java.lang.String r5 = "message_add_on_orphan.timestamp < ?"
            r0 = r8
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x042d }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x042d }
            java.lang.String r1 = "message_add_on_orphan"
            java.lang.String r0 = "MessageAddOnOrphanStore/deleteOrphanMessageAddOnsOlderThan"
            r2.A07(r1, r5, r0, r6)     // Catch:{ all -> 0x042d }
            r8.close()
            X.2qj r7 = r4.A01
            java.lang.String r0 = "EditMessageManager/deleteOldOrphanedMessageAddOns"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2sH r0 = r7.A05
            long r0 = r0.A0H()
            int r2 = r7.A00
            long r5 = X.AnonymousClass0x7.A0D(r2)
            long r0 = r0 - r5
            X.30G r2 = r7.A0C
            X.3dV r2 = r2.A0N
            X.4Fq r8 = r2.A04()
            r2 = 1
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch:{ all -> 0x042d }
            X.C18260x0.A1X(r6, r0)     // Catch:{ all -> 0x042d }
            java.lang.String r5 = "message_orphaned_edit.timestamp < ?"
            r0 = r8
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x042d }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x042d }
            java.lang.String r1 = "message_orphaned_edit"
            java.lang.String r0 = "EditMessageStore/deleteOrphanEditMessageOlderThan"
            r2.A07(r1, r5, r0, r6)     // Catch:{ all -> 0x042d }
            r8.close()
            X.2Nv r7 = r4.A0B
            java.lang.String r0 = "MessageOrphanResolverManager/deleteOldOrphanedMessages"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1VX r2 = r7.A02
            r1 = 987(0x3db, float:1.383E-42)
            X.2vE r0 = X.C58422vE.A02
            int r2 = r2.A0O(r0, r1)
            X.2sH r0 = r7.A00
            long r0 = r0.A0H()
            long r5 = X.AnonymousClass0x7.A0D(r2)
            long r0 = r0 - r5
            X.2h9 r2 = r7.A01
            X.3dV r2 = r2.A02
            X.4Fq r7 = r2.A04()
            r2 = 1
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch:{ all -> 0x0426 }
            X.C18260x0.A1X(r6, r0)     // Catch:{ all -> 0x0426 }
            java.lang.String r5 = "message_orphan.timestamp < ?"
            r0 = r7
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0426 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x0426 }
            java.lang.String r1 = "message_orphan"
            java.lang.String r0 = "MessageOrphanStore/deleteOrphanMessagesOlderThan"
            r2.A07(r1, r5, r0, r6)     // Catch:{ all -> 0x0426 }
            r7.close()
            java.lang.String r0 = "MessageAddOnManager/messageAddOnCleanUp"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            long r0 = r10.A0H()
            r5 = 2678400000(0x9fa52400, double:1.323305426E-314)
            long r0 = r0 - r5
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            X.2pk r2 = r11.A0L
            X.3dV r2 = r2.A04
            X.4GK r13 = r2.get()
            r5 = 0
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0421 }
            r2 = r13
            X.3H0 r2 = (X.AnonymousClass3H0) r2     // Catch:{ all -> 0x0421 }
            X.2sg r8 = r2.A03     // Catch:{ all -> 0x0421 }
            java.lang.String r6 = "SELECT message_add_on_row_id FROM message_add_on_pin_in_chat WHERE pin_in_chat_state = 0"
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ all -> 0x0421 }
            java.lang.String r2 = "SELECT_PIN_IN_CHAT_ROW_IDS_FOR_UNPINS"
            android.database.Cursor r6 = r8.A0E(r6, r2, r5)     // Catch:{ all -> 0x0421 }
            java.lang.String r12 = "message_add_on_row_id"
            int r5 = r6.getColumnIndexOrThrow(r12)     // Catch:{ all -> 0x041a }
        L_0x02e9:
            boolean r2 = r6.moveToNext()     // Catch:{ all -> 0x041a }
            if (r2 == 0) goto L_0x02f3
            X.C18260x0.A0H(r6, r9, r5)     // Catch:{ all -> 0x041a }
            goto L_0x02e9
        L_0x02f3:
            r6.close()     // Catch:{ all -> 0x0421 }
            r13.close()
            r7.addAll(r9)
            X.2ho r2 = r11.A0N
            X.2ux r2 = r2.A06
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            X.3dV r2 = r2.A00
            X.4GK r13 = r2.get()
            r2 = r13
            X.3H0 r2 = (X.AnonymousClass3H0) r2     // Catch:{ all -> 0x0421 }
            X.2sg r9 = r2.A03     // Catch:{ all -> 0x0421 }
            java.lang.String r6 = "SELECT message_add_on_row_id FROM message_add_on_reaction WHERE reaction = ''"
            r2 = 0
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ all -> 0x0421 }
            java.lang.String r2 = "SELECT_REACTION_ROW_IDS_FOR_EMPTY_REACTIONS"
            android.database.Cursor r6 = r9.A0E(r6, r2, r5)     // Catch:{ all -> 0x0421 }
            int r5 = r6.getColumnIndexOrThrow(r12)     // Catch:{ all -> 0x040e }
        L_0x031e:
            boolean r2 = r6.moveToNext()     // Catch:{ all -> 0x040e }
            if (r2 == 0) goto L_0x0328
            X.C18260x0.A0H(r6, r8, r5)     // Catch:{ all -> 0x040e }
            goto L_0x031e
        L_0x0328:
            r6.close()     // Catch:{ all -> 0x0421 }
            r13.close()
            r7.addAll(r8)
            X.2dS r2 = r11.A0J
            X.2Fz r2 = r2.A0A
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()
            X.3dV r2 = r2.A00
            X.4GK r13 = r2.get()
            r2 = r13
            X.3H0 r2 = (X.AnonymousClass3H0) r2     // Catch:{ all -> 0x0421 }
            X.2sg r8 = r2.A03     // Catch:{ all -> 0x0421 }
            java.lang.String r6 = "SELECT message_add_on_row_id FROM message_add_on_keep_in_chat WHERE keep_in_chat_state = 0"
            r2 = 0
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ all -> 0x0421 }
            java.lang.String r2 = "SELECT_KEEP_IN_CHAT_ROW_IDS_FOR_UNKEEPS"
            android.database.Cursor r6 = r8.A0E(r6, r2, r5)     // Catch:{ all -> 0x0421 }
            int r5 = r6.getColumnIndexOrThrow(r12)     // Catch:{ all -> 0x040e }
        L_0x0353:
            boolean r2 = r6.moveToNext()     // Catch:{ all -> 0x040e }
            if (r2 == 0) goto L_0x035d
            X.C18260x0.A0H(r6, r9, r5)     // Catch:{ all -> 0x040e }
            goto L_0x0353
        L_0x035d:
            r6.close()     // Catch:{ all -> 0x0421 }
            r13.close()
            r7.addAll(r9)
            X.3Ll r12 = r11.A0P
            long r5 = r10.A0H()
            int r2 = r7.size()
            java.lang.String[] r10 = new java.lang.String[r2]
            java.util.Iterator r11 = r7.iterator()
            r9 = 0
        L_0x0377:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x0388
            long r7 = X.C18270x1.A02(r11)
            int r2 = r9 + 1
            X.AnonymousClass0x2.A1S(r10, r9, r7)
            r9 = r2
            goto L_0x0377
        L_0x0388:
            X.3dV r2 = r12.A03
            X.4Fq r8 = r2.A04()
            r2 = 1
            android.content.ContentValues r11 = X.AnonymousClass0x9.A07(r2)     // Catch:{ all -> 0x042d }
            java.lang.String r2 = "expiry_timestamp"
            X.C18270x1.A0c(r11, r2, r5)     // Catch:{ all -> 0x042d }
            X.3ct r6 = X.C71923ct.A00(r10)     // Catch:{ all -> 0x042d }
        L_0x039c:
            boolean r2 = r6.hasNext()     // Catch:{ all -> 0x042d }
            if (r2 == 0) goto L_0x03d5
            java.lang.String[] r15 = X.C71923ct.A01(r6)     // Catch:{ all -> 0x042d }
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x042d }
            java.lang.String r2 = "_id IN "
            r5.append(r2)     // Catch:{ all -> 0x042d }
            int r2 = r15.length     // Catch:{ all -> 0x042d }
            java.lang.String r2 = X.C57212tH.A00(r2)     // Catch:{ all -> 0x042d }
            r5.append(r2)     // Catch:{ all -> 0x042d }
            java.lang.String r2 = " AND "
            r5.append(r2)     // Catch:{ all -> 0x042d }
            java.lang.String r2 = "timestamp"
            r5.append(r2)     // Catch:{ all -> 0x042d }
            java.lang.String r2 = " < "
            java.lang.String r13 = X.AnonymousClass000.A0Z(r2, r5, r0)     // Catch:{ all -> 0x042d }
            r2 = r8
            X.3H0 r2 = (X.AnonymousClass3H0) r2     // Catch:{ all -> 0x042d }
            X.2sg r10 = r2.A03     // Catch:{ all -> 0x042d }
            java.lang.String r12 = "message_add_on"
            java.lang.String r14 = "MessageAddOnStore/updateExpiryToNowForAddOnRowIds"
            r10.A05(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x042d }
            goto L_0x039c
        L_0x03d5:
            r8.close()
            X.2pj r0 = r4.A02
            r0.A00()
            X.2zn r4 = r4.A06
            long r2 = r3.A0H()
            r0 = 5184000000(0x134fd9000, double:2.561236308E-314)
            long r2 = r2 - r0
            java.lang.String[] r5 = X.AnonymousClass0x9.A1Y()
            X.C18270x1.A1S(r5, r2)
            X.3dV r0 = r4.A01
            X.4Fq r4 = r0.A04()
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0409 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x0409 }
            java.lang.String r2 = "group_past_participant_user"
            java.lang.String r1 = "timestamp < ? "
            java.lang.String r0 = "deletePastParticipantsBeforeTimestamp/DELETE_PAST_PARTICIPANT_USER"
            r3.A07(r2, r1, r0, r5)     // Catch:{ all -> 0x0409 }
            r4.close()
            return
        L_0x0409:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0432 }
            throw r1
        L_0x040e:
            r1 = move-exception
            if (r6 == 0) goto L_0x0419
            r6.close()     // Catch:{ all -> 0x0415 }
            goto L_0x0419
        L_0x0415:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0421 }
        L_0x0419:
            throw r1     // Catch:{ all -> 0x0421 }
        L_0x041a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x041c }
        L_0x041c:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r6, r1)     // Catch:{ all -> 0x0421 }
            throw r0     // Catch:{ all -> 0x0421 }
        L_0x0421:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x0432 }
            throw r1
        L_0x0426:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0428 }
        L_0x0428:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r7, r1)
            throw r0
        L_0x042d:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0432 }
            throw r1
        L_0x0432:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64823Fd.BQX():void");
    }

    public C64823Fd(C56612sH r1, C55672qj r2, C55062pj r3, AnonymousClass30T r4, AnonymousClass2S9 r5, C49502gd r6, C61152zn r7, C49802h7 r8, C55152pt r9, C620333f r10, C48042eF r11, C42372Nv r12, AnonymousClass3H1 r13) {
        this.A00 = r1;
        this.A0C = r13;
        this.A08 = r9;
        this.A09 = r10;
        this.A0A = r11;
        this.A07 = r8;
        this.A01 = r2;
        this.A03 = r4;
        this.A0B = r12;
        this.A05 = r6;
        this.A02 = r3;
        this.A06 = r7;
        this.A04 = r5;
    }

    public String BDW() {
        return "DataDailyCron";
    }
}
