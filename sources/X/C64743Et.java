package X;

import android.database.Cursor;
import com.whatsapp.jid.DeviceJid;

/* renamed from: X.3Et  reason: invalid class name and case insensitive filesystem */
public class C64743Et implements AnonymousClass49Y {
    public final C116985rC A00;
    public final C66663Mh A01;
    public final C44762Xj A02;
    public final C44302Vn A03;
    public final C64663Ek A04;
    public final C613730l A05;
    public final AnonymousClass314 A06;
    public final C56612sH A07;
    public final C56152rV A08;
    public final C61142zm A09;
    public final C61152zn A0A;
    public final C56382rt A0B;
    public final C42322Nq A0C;
    public final C55802qw A0D;
    public final C56302rl A0E;
    public final AnonymousClass1VX A0F;
    public final AnonymousClass33S A0G;
    public final AnonymousClass2TO A0H;
    public final C614330s A0I;
    public final AnonymousClass1R1 A0J;
    public final AnonymousClass4FS A0K;

    public long A00(C59732xO r10, int i, boolean z) {
        Cursor A0E2;
        long A002 = this.A02.A00(r10, i, z);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("history-sync-manager/getOldestRowIdToSync syncType = ");
        A0o.append(i);
        C18260x0.A12(", days = ", A0o, A002);
        long j = 0;
        if (A002 >= 0) {
            C56382rt r7 = this.A0B;
            long A0H2 = this.A07.A0H() - (A002 * 86400000);
            AnonymousClass33M r6 = new AnonymousClass33M(false);
            r6.A0A("rowidstore/getRowIdByTimestampExcludeSystemMessages");
            AnonymousClass4GK A032 = r7.A05.get();
            try {
                C56862sg r3 = ((AnonymousClass3H0) A032).A03;
                String[] A1Y = AnonymousClass0x9.A1Y();
                C18280x3.A1R(A1Y, 0, A0H2);
                A0E2 = r3.A0E("SELECT _id FROM available_message_view WHERE (message_type != '7') AND timestamp > 0 AND timestamp <= ? ORDER BY sort_id DESC LIMIT 1", "GET_ROW_ID_BY_TIMESTAMP_EXCLUDE_SYSTEM_MESSAGES", A1Y);
                if (A0E2.moveToNext()) {
                    j = C18270x1.A01(A0E2);
                } else {
                    j = 0;
                }
                A0E2.close();
                StringBuilder A0f = C18280x3.A0f(A032);
                A0f.append("rowidstore/getRowIdByTimestampExcludeSystemMessages ");
                A0f.append(j);
                AnonymousClass33M.A05(r6, " | time spent:", A0f);
            } catch (Throwable th) {
                try {
                    A032.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        return j;
        throw th;
    }

    public void A01(C51442jp r36, DeviceJid deviceJid, int i, long j, long j2, long j3, long j4) {
        C85284Fq A0C2;
        C55802qw r7 = this.A0D;
        AnonymousClass1RE r0 = r7.A02;
        C85284Fq A0C3 = r0.A0C();
        try {
            C69833Yo Axl = A0C3.Axl();
            try {
                C626936e.A00();
                A0C2 = r0.A0C();
                C56862sg r5 = ((AnonymousClass3H0) A0C2).A03;
                String[] A1a = AnonymousClass0x9.A1a();
                DeviceJid deviceJid2 = deviceJid;
                C18280x3.A0v(deviceJid2, A1a);
                int i2 = i;
                C18270x1.A1P(A1a, i2);
                A1a[2] = String.valueOf(2);
                int A072 = r5.A07("msg_history_sync", "device_id=?  AND sync_type=?  AND status=?", "MessageHistorySyncStore.deleteSyncStateByDeviceAndTypeAndStatus", A1a);
                r7.A01(A0C2, deviceJid2);
                A0C2.close();
                boolean A1W = AnonymousClass001.A1W(A072);
                long j5 = j;
                long j6 = j4;
                int i3 = A1W ? 1 : 0;
                r7.A02(new C54082o9(r36, deviceJid2, i2, 0, i3, -1, j5, j2, j3, 0, 0, 0, -1, j6));
                Axl.A00();
                r7.A01(A0C3, deviceJid2);
                Axl.close();
                StringBuilder A0f = C18280x3.A0f(A0C3);
                A0f.append("history-sync-manager/addOrUpdateSyncStateWithData syncType: ");
                A0f.append(i2);
                A0f.append(", sizeLimitBytes: ");
                A0f.append(j6);
                A0f.append(", latestMsgId: ");
                A0f.append(j5);
                C18260x0.A1E(", isActivated: ", A0f, A1W);
                if (A1W) {
                    this.A03.A00();
                    return;
                }
                return;
            } catch (Throwable th) {
                Axl.close();
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                A0C3.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public void BPq(C59622xD r4) {
        if (r4.A01 && this.A0F.A0Y(C58422vE.A02, 4879)) {
            this.A0K.BkN(C69963Zi.A00(this, 8), "HistorySyncManager/onConnectivityChange");
        }
    }

    public C64743Et(C116985rC r2, C66663Mh r3, C44762Xj r4, C44302Vn r5, C64663Ek r6, C613730l r7, AnonymousClass314 r8, C56612sH r9, C56152rV r10, C61142zm r11, C61152zn r12, C56382rt r13, C42322Nq r14, C55802qw r15, C56302rl r16, AnonymousClass1VX r17, AnonymousClass33S r18, AnonymousClass2TO r19, C614330s r20, AnonymousClass1R1 r21, AnonymousClass4FS r22) {
        this.A07 = r9;
        this.A0F = r17;
        this.A0K = r22;
        this.A0B = r13;
        this.A0G = r18;
        this.A01 = r3;
        this.A0C = r14;
        this.A0H = r19;
        this.A08 = r10;
        this.A04 = r6;
        this.A0J = r21;
        this.A0E = r16;
        this.A00 = r2;
        this.A09 = r11;
        this.A06 = r8;
        this.A02 = r4;
        this.A0I = r20;
        this.A03 = r5;
        this.A05 = r7;
        this.A0D = r15;
        this.A0A = r12;
    }

    public final boolean A02(DeviceJid deviceJid) {
        if (!C57372tX.A00(deviceJid) || !this.A0F.A0Y(C58422vE.A02, 5058)) {
            return false;
        }
        return true;
    }
}
