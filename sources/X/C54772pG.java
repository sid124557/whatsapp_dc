package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.2pG  reason: invalid class name and case insensitive filesystem */
public class C54772pG {
    public final C55682qk A00;
    public final C56972sr A01;
    public final C623334p A02;
    public final C72303dV A03;
    public final AnonymousClass4FS A04;

    public final void A03(C28011fL r11, String str, Collection collection) {
        C69833Yo Axl;
        C623334p r3 = this.A02;
        long A05 = r3.A05(r11);
        C85284Fq A042 = this.A03.A04();
        try {
            Axl = A042.Axl();
            C56702sQ A0G = ((AnonymousClass3H0) A042).A03.A0G(str, "UPDATE_GROUP_PARTICIPANT_DEVICES_SENT_SENDER_KEY_FOR_DEVICE_SQL");
            A0G.A06(1, 1);
            A0G.A06(3, A05);
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                DeviceJid A0R = AnonymousClass0x7.A0R(it);
                A0G.A06(2, r3.A05(A0R));
                UserJid userJid = A0R.userJid;
                C626936e.A0E(C18320x8.A1U(userJid.getRawString()), "participant-user-store/invalid-jid");
                if (this.A01.A0a(userJid)) {
                    userJid = AnonymousClass1fY.A00;
                }
                A0G.A06(4, r3.A05(userJid));
                A0G.A00();
            }
            Axl.A00();
            Axl.close();
            A042.close();
            return;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public C54772pG(C55682qk r1, C56972sr r2, C623334p r3, C72303dV r4, AnonymousClass4FS r5) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
    }

    public void A00(C129526aS r12, C28011fL r13, UserJid userJid, long j) {
        C69833Yo Axm;
        C626936e.A0E(!r12.isEmpty(), "participant-device-store/addParticipantDevices/empty devices");
        C623334p r3 = this.A02;
        long A05 = r3.A05(r13);
        C85284Fq A042 = this.A03.A04();
        try {
            Axm = A042.Axm();
            C56702sQ A0G = ((AnonymousClass3H0) A042).A03.A0G("INSERT INTO group_participant_device (group_participant_row_id, device_jid_row_id, sent_sender_key, sent_add_on_sender_key) SELECT _id, ?, ?, ? FROM group_participant_user WHERE group_jid_row_id = ? AND user_jid_row_id = ?", "INSERT_GROUP_PARTICIPANT_DEVICE_SQL");
            A0G.A06(4, A05);
            A0G.A06(5, j);
            C172878Nf it = r12.iterator();
            while (it.hasNext()) {
                C52162kz r6 = (C52162kz) it.next();
                DeviceJid deviceJid = r6.A02;
                if (!deviceJid.userJid.equals(userJid)) {
                    C55682qk r62 = this.A00;
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("incorrect device jid ");
                    A0o.append(deviceJid);
                    r62.A0A("participant-device-store/incorrect device jid", false, AnonymousClass000.A0P(userJid, " for user ", A0o));
                } else {
                    A0G.A06(1, r3.A05(deviceJid));
                    A0G.A06(2, C18290x4.A09(r6.A01 ? 1 : 0));
                    A0G.A06(3, C18290x4.A09(r6.A00 ? 1 : 0));
                    A0G.A01();
                }
            }
            Axm.A00();
            Axm.close();
            A042.close();
            return;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A01(C129526aS r9, C28011fL r10, UserJid userJid, long j) {
        C85284Fq A042;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("participant-device-store/updateParticipantDevices/");
        A0o.append(r10);
        C18310x6.A1Q(A0o, " ", userJid);
        A0o.append(j);
        C18260x0.A1R(A0o, " ", r9);
        C72303dV r2 = this.A03;
        C85284Fq A043 = r2.A04();
        try {
            C69833Yo Axm = A043.Axm();
            try {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("participant-device-store/deleteParticipantDevices/");
                A0o2.append(r10);
                C18260x0.A12(" ", A0o2, j);
                long A05 = this.A02.A05(r10);
                A042 = r2.A04();
                C56702sQ A0G = ((AnonymousClass3H0) A042).A03.A0G("DELETE FROM group_participant_device WHERE group_participant_row_id IN (SELECT _id FROM group_participant_user WHERE group_jid_row_id = ? AND user_jid_row_id = ?)", "deleteParticipantDevices/DELETE_GROUP_PARTICIPANT_DEVICES_SQL");
                String[] A1Z = AnonymousClass0x9.A1Z();
                C18260x0.A1X(A1Z, A05);
                C18270x1.A1R(A1Z, j);
                A0G.A09(A1Z);
                A0G.A00();
                A042.close();
                A00(r9, r10, userJid, j);
                Axm.A00();
                Axm.close();
                A043.close();
                return;
            } catch (Throwable th) {
                Axm.close();
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                A043.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public void A02(C28011fL r8) {
        C18260x0.A1R(AnonymousClass001.A0o(), "participant-device-store/resetSentSenderKeyForAllParticipants/", r8);
        long A05 = this.A02.A05(r8);
        C85284Fq A042 = this.A03.A04();
        try {
            C56702sQ A0G = ((AnonymousClass3H0) A042).A03.A0G("UPDATE group_participant_device SET sent_sender_key = ? WHERE group_participant_row_id IN (SELECT _id FROM group_participant_user WHERE group_jid_row_id = ?)", "resetSentSenderKeyForAllParticipants/UPDATE_GROUP_PARTICIPANT_DEVICES_SENT_SENDER_KEY_FOR_GROUP_SQL");
            String[] A1Z = AnonymousClass0x9.A1Z();
            A1Z[0] = "0";
            C18270x1.A1R(A1Z, A05);
            A0G.A09(A1Z);
            A0G.A00();
            A042.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }
}
