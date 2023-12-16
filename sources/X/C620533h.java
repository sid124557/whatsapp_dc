package X;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.33h  reason: invalid class name and case insensitive filesystem */
public class C620533h {
    public final C55682qk A00;
    public final C56972sr A01;
    public final C42112Mv A02;
    public final C64773Ex A03;
    public final C56612sH A04;
    public final C56982ss A05;
    public final C49472ga A06;
    public final AnonymousClass484 A07 = new AnonymousClass4KC(this, 1);
    public final C46412ba A08;
    public final C623334p A09;
    public final C72303dV A0A;
    public final C54772pG A0B;
    public final C56662sM A0C;
    public final AnonymousClass318 A0D;
    public final C54932pW A0E;
    public final AnonymousClass4FS A0F;
    public final C183538qC A0G;

    public final void A0H(C620833k r8, UserJid userJid, boolean z) {
        UserJid userJid2 = userJid;
        C60842zG A052 = r8.A05(userJid);
        C28011fL r3 = r8.A05;
        if (A052 != null) {
            this.A0B.A01(C129526aS.copyOf(A052.A04.values()), r3, userJid2, A05(userJid));
        }
        if (z) {
            this.A0B.A02(r3);
        }
    }

    public boolean A0L(AnonymousClass3ZH r6, C28011fL r7) {
        GroupJid groupJid;
        if (!(r7 == null || r6 == null || !(r7 instanceof C27991fJ) || r6.A0J() == null || (groupJid = (GroupJid) r6.A0I(GroupJid.class)) == null)) {
            C56982ss r2 = this.A05;
            return r2.A07(groupJid) != 1 && (!r2.A0P(groupJid) || ((C106995aW) this.A0G.get()).A01);
        }
    }

    public boolean A0P(UserJid userJid, String str) {
        Cursor A0E2;
        if (userJid == null) {
            return false;
        }
        String valueOf = String.valueOf(A05(userJid));
        AnonymousClass4GK A032 = this.A0A.get();
        try {
            C56862sg r3 = ((AnonymousClass3H0) A032).A03;
            String[] A1Z = AnonymousClass0x9.A1Z();
            C18280x3.A19(str, valueOf, A1Z);
            A0E2 = r3.A0E("SELECT _id FROM group_participant_user WHERE group_jid_row_id = ? AND user_jid_row_id = ?", "CHECK_USER_IS_IN_GROUP_SQL", A1Z);
            boolean moveToNext = A0E2.moveToNext();
            A0E2.close();
            A032.close();
            return moveToNext;
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

    public static C85284Fq A02(C620533h r0) {
        return r0.A0A.A04();
    }

    public final C60842zG A06(C60842zG r8, UserJid userJid) {
        C129526aS copyOf = C129526aS.copyOf(r8.A04.values());
        HashSet A0K = AnonymousClass002.A0K();
        C172878Nf it = copyOf.iterator();
        while (it.hasNext()) {
            C52162kz r4 = (C52162kz) it.next();
            try {
                A0K.add(new C52162kz(DeviceJid.Companion.A01(userJid, r4.A02.getDevice()), r4.A01, r4.A00));
            } catch (AnonymousClass24P unused) {
                Log.e("participant-user-store/generateDevicesForJid/invalid device jid");
            }
        }
        return new C60842zG(userJid, A0K, r8.A01, r8.A02);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:190:0x049e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x049f, code lost:
        X.AnonymousClass2A8.A00(r26, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x04a4, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0216, code lost:
        if (r13 != null) goto L_0x0218;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C620833k A07(X.C28011fL r41) {
        /*
            r40 = this;
            r0 = r40
            X.2ba r6 = r0.A08
            X.484 r3 = r0.A07
            r5 = r41
            X.C18260x0.A0O(r5, r3)
            java.util.Map r0 = r6.A04
            r39 = r0
            java.lang.Object r4 = r0.get(r5)
            X.33k r4 = (X.C620833k) r4
            if (r4 != 0) goto L_0x04a8
            X.3dV r0 = r6.A02
            X.4GK r26 = r0.get()
            X.2F6 r1 = r6.A00     // Catch:{ all -> 0x049c }
            int r0 = r5.hashCode()     // Catch:{ all -> 0x049c }
            int r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x049c }
            int r0 = r0 % 128
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x049c }
            java.util.concurrent.ConcurrentHashMap r1 = r1.A00     // Catch:{ all -> 0x049c }
            boolean r0 = r1.containsKey(r2)     // Catch:{ all -> 0x049c }
            if (r0 != 0) goto L_0x003c
            java.lang.Object r0 = X.AnonymousClass002.A0D()     // Catch:{ all -> 0x049c }
            r1.putIfAbsent(r2, r0)     // Catch:{ all -> 0x049c }
        L_0x003c:
            java.lang.Object r25 = X.C18290x4.A0i(r2, r1)     // Catch:{ all -> 0x049c }
            X.C162457s7.A0D(r25)     // Catch:{ all -> 0x049c }
            monitor-enter(r25)     // Catch:{ all -> 0x049c }
            r0 = r39
            java.lang.Object r4 = r0.get(r5)     // Catch:{ all -> 0x0499 }
            X.33k r4 = (X.C620833k) r4     // Catch:{ all -> 0x0499 }
            if (r4 != 0) goto L_0x0497
            X.2sM r0 = r6.A03     // Catch:{ all -> 0x0499 }
            r38 = r0
            X.4KC r3 = (X.AnonymousClass4KC) r3     // Catch:{ all -> 0x0499 }
            java.lang.Object r3 = r3.A00     // Catch:{ all -> 0x0499 }
            X.33h r3 = (X.C620533h) r3     // Catch:{ all -> 0x0499 }
            X.2pW r0 = r3.A0E     // Catch:{ all -> 0x0499 }
            r37 = r0
            int r0 = r0.A00(r5)     // Catch:{ all -> 0x0499 }
            X.33k r4 = new X.33k     // Catch:{ all -> 0x0499 }
            r4.<init>(r5, r0)     // Catch:{ all -> 0x0499 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0495 }
            java.lang.String r0 = "participant-user-store/migrated="
            r1.append(r0)     // Catch:{ all -> 0x0495 }
            r0 = 1
            X.C18260x0.A1V(r1, r0)     // Catch:{ all -> 0x0495 }
            X.1fL r7 = r4.A05     // Catch:{ all -> 0x0495 }
            long r16 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0495 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0495 }
            java.lang.String r0 = "participant-user-store/getGroupParticipantsOptimized/"
            X.C18260x0.A1R(r1, r0, r7)     // Catch:{ all -> 0x0495 }
            java.util.concurrent.ConcurrentHashMap r2 = X.AnonymousClass0x9.A1D()     // Catch:{ all -> 0x0495 }
            X.34p r10 = r3.A09     // Catch:{ all -> 0x0495 }
            java.lang.String r1 = X.C623334p.A04(r10, r7)     // Catch:{ all -> 0x0495 }
            X.3dV r0 = r3.A0A     // Catch:{ all -> 0x0495 }
            X.4GK r24 = r0.get()     // Catch:{ all -> 0x0495 }
            r0 = r24
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x048b }
            X.2sg r8 = r0.A03     // Catch:{ all -> 0x048b }
            java.lang.String r6 = "SELECT user_jid_row_id, pending, rank, device_jid_row_id, sent_sender_key, sent_add_on_sender_key FROM group_participant_user JOIN group_participant_device ON group_participant_row_id = group_participant_user._id WHERE group_jid_row_id = ?"
            java.lang.String[] r1 = X.C18270x1.A1b(r1)     // Catch:{ all -> 0x048b }
            java.lang.String r0 = "GET_GROUP_PARTICIPANT_USERS_SQL_OPTIMIZED"
            android.database.Cursor r6 = r8.A0E(r6, r0, r1)     // Catch:{ all -> 0x048b }
            java.lang.String r0 = "user_jid_row_id"
            int r23 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x047f }
            java.lang.String r0 = "device_jid_row_id"
            int r22 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x047f }
            java.lang.String r0 = "rank"
            int r21 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x047f }
            java.lang.String r0 = "pending"
            int r20 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x047f }
            java.lang.String r0 = "sent_sender_key"
            int r19 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x047f }
            java.lang.String r0 = "sent_add_on_sender_key"
            int r9 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x047f }
            java.util.ArrayList r18 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x047f }
            java.util.HashSet r8 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x047f }
            java.util.HashSet r1 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x047f }
        L_0x00da:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x047f }
            if (r0 == 0) goto L_0x012e
            r0 = r23
            long r14 = r6.getLong(r0)     // Catch:{ all -> 0x047f }
            r0 = r22
            long r12 = r6.getLong(r0)     // Catch:{ all -> 0x047f }
            r0 = r21
            int r28 = r6.getInt(r0)     // Catch:{ all -> 0x047f }
            r0 = r20
            int r0 = r6.getInt(r0)     // Catch:{ all -> 0x047f }
            r11 = 1
            boolean r33 = X.AnonymousClass000.A1U(r0, r11)
            r0 = r19
            int r0 = r6.getInt(r0)     // Catch:{ all -> 0x047f }
            boolean r34 = X.AnonymousClass000.A1U(r0, r11)
            boolean r0 = r6.isNull(r9)     // Catch:{ all -> 0x047f }
            if (r0 != 0) goto L_0x0115
            int r0 = r6.getInt(r9)     // Catch:{ all -> 0x047f }
            r35 = 1
            if (r0 == r11) goto L_0x0117
        L_0x0115:
            r35 = 0
        L_0x0117:
            X.AnonymousClass0x2.A1Q(r8, r14)     // Catch:{ all -> 0x047f }
            X.AnonymousClass0x2.A1Q(r1, r12)     // Catch:{ all -> 0x047f }
            X.2SA r0 = new X.2SA     // Catch:{ all -> 0x047f }
            r27 = r0
            r29 = r14
            r31 = r12
            r27.<init>(r28, r29, r31, r33, r34, r35)     // Catch:{ all -> 0x047f }
            r11 = r18
            r11.add(r0)     // Catch:{ all -> 0x047f }
            goto L_0x00da
        L_0x012e:
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            java.util.Map r20 = r10.A0D(r0, r8)     // Catch:{ all -> 0x047f }
            java.lang.Class<com.whatsapp.jid.DeviceJid> r0 = com.whatsapp.jid.DeviceJid.class
            java.util.Map r19 = r10.A0D(r0, r1)     // Catch:{ all -> 0x047f }
            java.util.Iterator r18 = r18.iterator()     // Catch:{ all -> 0x047f }
            r8 = 0
        L_0x013f:
            boolean r0 = r18.hasNext()     // Catch:{ all -> 0x047f }
            if (r0 == 0) goto L_0x0244
            java.lang.Object r10 = r18.next()     // Catch:{ all -> 0x047f }
            X.2SA r10 = (X.AnonymousClass2SA) r10     // Catch:{ all -> 0x047f }
            long r0 = r10.A02     // Catch:{ all -> 0x047f }
            r35 = r0
            r9 = r20
            java.lang.Object r11 = X.C18280x3.A0W(r9, r0)     // Catch:{ all -> 0x047f }
            com.whatsapp.jid.UserJid r11 = (com.whatsapp.jid.UserJid) r11     // Catch:{ all -> 0x047f }
            long r0 = r10.A01     // Catch:{ all -> 0x047f }
            r9 = r19
            java.lang.Object r13 = X.C18280x3.A0W(r9, r0)     // Catch:{ all -> 0x047f }
            com.whatsapp.jid.DeviceJid r13 = (com.whatsapp.jid.DeviceJid) r13     // Catch:{ all -> 0x047f }
            if (r11 != 0) goto L_0x016a
            java.lang.String r0 = "participant-user-store/getGroupParticipants invalid jid from db"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x047f }
            goto L_0x013f
        L_0x016a:
            com.whatsapp.jid.UserJid r12 = r3.A08(r11)     // Catch:{ all -> 0x047f }
            X.2sr r0 = r3.A01     // Catch:{ all -> 0x047f }
            boolean r0 = r0.A0a(r11)     // Catch:{ all -> 0x047f }
            if (r0 == 0) goto L_0x019f
            if (r8 != 0) goto L_0x019c
            java.lang.String r0 = "participant-user-store/getGroupParticipants/found orphaned me participant"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x047f }
            X.2qk r9 = r3.A00     // Catch:{ all -> 0x047f }
            java.lang.String r8 = "participant-user-orphaned-me"
            java.lang.Class r0 = r7.getClass()     // Catch:{ all -> 0x047f }
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x047f }
            r0 = 0
            r9.A0A(r8, r0, r1)     // Catch:{ all -> 0x047f }
            java.util.HashSet r9 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x047f }
            int r1 = r10.A00     // Catch:{ all -> 0x047f }
            boolean r0 = r10.A03     // Catch:{ all -> 0x047f }
            X.2zG r8 = new X.2zG     // Catch:{ all -> 0x047f }
            r8.<init>(r12, r9, r1, r0)     // Catch:{ all -> 0x047f }
        L_0x019c:
            r22 = r8
            goto L_0x01c5
        L_0x019f:
            boolean r0 = r2.containsKey(r12)     // Catch:{ all -> 0x047f }
            if (r0 == 0) goto L_0x01b4
            java.lang.Object r11 = r2.get(r12)     // Catch:{ all -> 0x047f }
            X.2zG r11 = (X.C60842zG) r11     // Catch:{ all -> 0x047f }
        L_0x01ab:
            X.C626936e.A06(r11)     // Catch:{ all -> 0x047f }
            com.whatsapp.jid.UserJid r0 = r11.A03     // Catch:{ all -> 0x047f }
            r2.put(r0, r11)     // Catch:{ all -> 0x047f }
            goto L_0x01c2
        L_0x01b4:
            java.util.HashSet r9 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x047f }
            int r1 = r10.A00     // Catch:{ all -> 0x047f }
            boolean r0 = r10.A03     // Catch:{ all -> 0x047f }
            X.2zG r11 = new X.2zG     // Catch:{ all -> 0x047f }
            r11.<init>(r12, r9, r1, r0)     // Catch:{ all -> 0x047f }
            goto L_0x01ab
        L_0x01c2:
            r22 = r8
            r8 = r11
        L_0x01c5:
            X.2pG r11 = r3.A0B     // Catch:{ all -> 0x047f }
            boolean r0 = r10.A05     // Catch:{ all -> 0x047f }
            r21 = r0
            boolean r1 = r10.A04     // Catch:{ all -> 0x047f }
            r10 = 0
            if (r13 == 0) goto L_0x0240
            X.2sr r9 = r11.A01     // Catch:{ all -> 0x047f }
            boolean r0 = r9.A0a(r12)     // Catch:{ all -> 0x047f }
            if (r0 == 0) goto L_0x0218
            boolean r0 = X.C56972sr.A09(r9, r13)     // Catch:{ all -> 0x047f }
            if (r0 != 0) goto L_0x0218
            java.lang.StringBuilder r14 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x047f }
            java.lang.String r0 = "participant-device-store/getParticipantDevices/invalid self device: "
            X.C18260x0.A1S(r14, r0, r13)     // Catch:{ all -> 0x047f }
            X.2qk r15 = r11.A00     // Catch:{ all -> 0x047f }
            int r0 = r13.getDevice()     // Catch:{ all -> 0x047f }
            boolean r0 = X.AnonymousClass000.A1T(r0)     // Catch:{ all -> 0x047f }
            java.lang.String r14 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x047f }
            java.lang.String r0 = "participant-devices-invalid-self-devices"
            r15.A0A(r0, r10, r14)     // Catch:{ all -> 0x047f }
            int r0 = r13.getDevice()     // Catch:{ all -> 0x047f }
            boolean r0 = X.AnonymousClass000.A1T(r0)     // Catch:{ all -> 0x047f }
            if (r0 == 0) goto L_0x0240
            boolean r0 = X.C627336j.A0L(r12)     // Catch:{ all -> 0x047f }
            if (r0 == 0) goto L_0x0211
            X.6kB r13 = r9.A0G()     // Catch:{ all -> 0x047f }
            goto L_0x0215
        L_0x0211:
            X.6kH r13 = X.C56972sr.A03(r9)     // Catch:{ all -> 0x047f }
        L_0x0215:
            r10 = 1
            if (r13 == 0) goto L_0x0240
        L_0x0218:
            X.2kz r9 = new X.2kz     // Catch:{ all -> 0x047f }
            r0 = r21
            r9.<init>(r13, r0, r1)     // Catch:{ all -> 0x047f }
            if (r10 == 0) goto L_0x0239
            X.4FS r1 = r11.A04     // Catch:{ all -> 0x047f }
            r32 = 4
            X.3am r0 = new X.3am     // Catch:{ all -> 0x047f }
            r27 = r0
            r28 = r12
            r29 = r11
            r30 = r9
            r31 = r7
            r33 = r35
            r27.<init>(r28, r29, r30, r31, r32, r33)     // Catch:{ all -> 0x047f }
            r1.BkM(r0)     // Catch:{ all -> 0x047f }
        L_0x0239:
            java.util.concurrent.ConcurrentHashMap r1 = r8.A04     // Catch:{ all -> 0x047f }
            com.whatsapp.jid.DeviceJid r0 = r9.A02     // Catch:{ all -> 0x047f }
            X.C18320x8.A1G(r0, r9, r1)     // Catch:{ all -> 0x047f }
        L_0x0240:
            r8 = r22
            goto L_0x013f
        L_0x0244:
            if (r8 == 0) goto L_0x0281
            com.whatsapp.jid.UserJid r9 = r8.A03     // Catch:{ all -> 0x047f }
            X.2sr r1 = r3.A01     // Catch:{ all -> 0x047f }
            X.1fH r0 = r1.A0H()     // Catch:{ all -> 0x047f }
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x047f }
            if (r0 == 0) goto L_0x025f
            X.1fH r0 = r1.A0H()     // Catch:{ all -> 0x047f }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ all -> 0x047f }
            X.2zG r0 = (X.C60842zG) r0     // Catch:{ all -> 0x047f }
            goto L_0x0269
        L_0x025f:
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A05(r1)     // Catch:{ all -> 0x047f }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ all -> 0x047f }
            X.2zG r0 = (X.C60842zG) r0     // Catch:{ all -> 0x047f }
        L_0x0269:
            if (r0 != 0) goto L_0x0270
            r2.put(r9, r8)     // Catch:{ all -> 0x047f }
            r14 = 1
            goto L_0x0271
        L_0x0270:
            r14 = 0
        L_0x0271:
            X.4FS r1 = r3.A0F     // Catch:{ all -> 0x047f }
            r13 = 18
            X.3cR r0 = new X.3cR     // Catch:{ all -> 0x047f }
            r9 = r0
            r10 = r3
            r11 = r7
            r12 = r8
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x047f }
            r1.BkM(r0)     // Catch:{ all -> 0x047f }
        L_0x0281:
            r6.close()     // Catch:{ all -> 0x048b }
            r24.close()     // Catch:{ all -> 0x0495 }
            X.2ga r8 = r3.A06     // Catch:{ all -> 0x0495 }
            long r0 = X.C18310x6.A0A(r16)     // Catch:{ all -> 0x0495 }
            java.lang.String r6 = "ParticipantUserStore/getGroupParticipantsOptimized"
            r8.A02(r6, r0)     // Catch:{ all -> 0x0495 }
            r0 = r37
            boolean r15 = r0.A02(r7)     // Catch:{ all -> 0x0495 }
            r6 = 0
            if (r15 == 0) goto L_0x03f6
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0495 }
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0495 }
            java.util.Iterator r10 = X.C18290x4.A11(r2)     // Catch:{ all -> 0x0495 }
        L_0x02a7:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0495 }
            if (r0 == 0) goto L_0x02b9
            com.whatsapp.jid.UserJid r1 = X.C18310x6.A0T(r10)     // Catch:{ all -> 0x0495 }
            boolean r0 = r1 instanceof com.whatsapp.jid.PhoneUserJid     // Catch:{ all -> 0x0495 }
            if (r0 == 0) goto L_0x02a7
            r9.add(r1)     // Catch:{ all -> 0x0495 }
            goto L_0x02a7
        L_0x02b9:
            r0 = r38
            java.util.Map r11 = r0.A06(r9)     // Catch:{ all -> 0x0495 }
            java.util.Iterator r12 = r9.iterator()     // Catch:{ all -> 0x0495 }
        L_0x02c3:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0495 }
            if (r0 == 0) goto L_0x02f9
            java.lang.Object r10 = r12.next()     // Catch:{ all -> 0x0495 }
            java.lang.Object r1 = r11.get(r10)     // Catch:{ all -> 0x0495 }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x0495 }
            if (r1 != 0) goto L_0x02e5
            java.lang.String r0 = "participant-user-store/substitutePhoneJidsWithLids/could not find lid for jid"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0495 }
            X.2qk r10 = r3.A00     // Catch:{ all -> 0x0495 }
            r1 = 0
            java.lang.String r0 = "participant-cag-lid-not-found"
            r10.A0A(r0, r6, r1)     // Catch:{ all -> 0x0495 }
            goto L_0x02c3
        L_0x02e5:
            java.lang.Object r0 = X.C18290x4.A0i(r10, r2)     // Catch:{ all -> 0x0495 }
            X.2zG r0 = (X.C60842zG) r0     // Catch:{ all -> 0x0495 }
            X.2zG r0 = r3.A06(r0, r1)     // Catch:{ all -> 0x0495 }
            r8.add(r0)     // Catch:{ all -> 0x0495 }
            r2.remove(r10)     // Catch:{ all -> 0x0495 }
            r2.put(r1, r0)     // Catch:{ all -> 0x0495 }
            goto L_0x02c3
        L_0x02f9:
            X.4FS r1 = r3.A0F     // Catch:{ all -> 0x0495 }
            r21 = 44
            X.3cM r0 = new X.3cM     // Catch:{ all -> 0x0495 }
            r16 = r0
            r17 = r3
            r18 = r7
            r19 = r8
            r20 = r9
            r16.<init>((java.lang.Object) r17, (java.lang.Object) r18, (java.lang.Object) r19, (java.lang.Object) r20, (int) r21)     // Catch:{ all -> 0x0495 }
            r1.BkM(r0)     // Catch:{ all -> 0x0495 }
            java.util.concurrent.ConcurrentHashMap r8 = X.AnonymousClass0x9.A1D()     // Catch:{ all -> 0x0495 }
            java.util.concurrent.ConcurrentHashMap r9 = X.AnonymousClass0x9.A1D()     // Catch:{ all -> 0x0495 }
            X.2sr r10 = r3.A01     // Catch:{ all -> 0x0495 }
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A05(r10)     // Catch:{ all -> 0x0495 }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ all -> 0x0495 }
            X.2zG r0 = (X.C60842zG) r0     // Catch:{ all -> 0x0495 }
            r14 = 1
            if (r0 == 0) goto L_0x037e
            int r0 = r0.A01     // Catch:{ all -> 0x0495 }
            if (r0 == 0) goto L_0x037e
        L_0x032a:
            java.util.Iterator r13 = X.AnonymousClass001.A0u(r2)     // Catch:{ all -> 0x0495 }
        L_0x032e:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0495 }
            if (r0 == 0) goto L_0x0394
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r13)     // Catch:{ all -> 0x0495 }
            com.whatsapp.jid.UserJid r11 = X.C18320x8.A0P(r0)     // Catch:{ all -> 0x0495 }
            java.lang.Object r2 = r0.getValue()     // Catch:{ all -> 0x0495 }
            X.2zG r2 = (X.C60842zG) r2     // Catch:{ all -> 0x0495 }
            boolean r0 = r11 instanceof com.whatsapp.jid.PhoneUserJid     // Catch:{ all -> 0x0495 }
            r12 = 0
            if (r0 == 0) goto L_0x0356
            java.lang.String r0 = "participant-user-store/initParticipantsFromStorage/unexpectedly found jid in CAG"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0495 }
            X.2qk r1 = r3.A00     // Catch:{ all -> 0x0495 }
            java.lang.String r0 = "participant-cag-has-jid"
            r1.A0A(r0, r6, r12)     // Catch:{ all -> 0x0495 }
            goto L_0x032e
        L_0x0356:
            if (r14 != 0) goto L_0x035c
            int r0 = r2.A01     // Catch:{ all -> 0x0495 }
            if (r0 == 0) goto L_0x0372
        L_0x035c:
            r0 = r38
            com.whatsapp.jid.PhoneUserJid r1 = X.C56662sM.A00(r0, r11)     // Catch:{ all -> 0x0495 }
            if (r1 != 0) goto L_0x0376
            java.lang.String r0 = "participant-user-store/initParticipantsFromStorage/could not find jid for lid"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0495 }
            X.2qk r1 = r3.A00     // Catch:{ all -> 0x0495 }
            java.lang.String r0 = "participant-cag-jid-not-found"
            r1.A0A(r0, r6, r12)     // Catch:{ all -> 0x0495 }
        L_0x0372:
            r8.put(r11, r2)     // Catch:{ all -> 0x0495 }
            goto L_0x032e
        L_0x0376:
            X.2zG r0 = r3.A06(r2, r1)     // Catch:{ all -> 0x0495 }
            r9.put(r1, r0)     // Catch:{ all -> 0x0495 }
            goto L_0x0372
        L_0x037e:
            X.1fH r0 = r10.A0H()     // Catch:{ all -> 0x0495 }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x0495 }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ all -> 0x0495 }
            X.2zG r0 = (X.C60842zG) r0     // Catch:{ all -> 0x0495 }
            if (r0 == 0) goto L_0x0392
            int r0 = r0.A01     // Catch:{ all -> 0x0495 }
            if (r0 == 0) goto L_0x0392
            goto L_0x032a
        L_0x0392:
            r14 = 0
            goto L_0x032a
        L_0x0394:
            X.1fH r1 = r10.A0I()     // Catch:{ all -> 0x0495 }
            if (r14 != 0) goto L_0x03b4
            boolean r0 = r8.containsKey(r1)     // Catch:{ all -> 0x0495 }
            if (r0 == 0) goto L_0x03b4
            java.lang.Object r0 = r8.get(r1)     // Catch:{ all -> 0x0495 }
            X.2zG r0 = (X.C60842zG) r0     // Catch:{ all -> 0x0495 }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x0495 }
            com.whatsapp.jid.PhoneUserJid r1 = X.C56972sr.A05(r10)     // Catch:{ all -> 0x0495 }
            X.2zG r0 = r3.A06(r0, r1)     // Catch:{ all -> 0x0495 }
            r9.put(r1, r0)     // Catch:{ all -> 0x0495 }
        L_0x03b4:
            r4.A0M(r9)     // Catch:{ all -> 0x0495 }
            int r0 = r4.A00     // Catch:{ all -> 0x0495 }
            if (r0 == 0) goto L_0x03f9
            java.util.Map r9 = r4.A08     // Catch:{ all -> 0x0495 }
            r9.clear()     // Catch:{ all -> 0x0495 }
            java.util.Iterator r8 = X.AnonymousClass001.A0u(r8)     // Catch:{ all -> 0x0495 }
        L_0x03c4:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0495 }
            if (r0 == 0) goto L_0x03f9
            java.util.Map$Entry r2 = X.AnonymousClass001.A0w(r8)     // Catch:{ all -> 0x0495 }
            com.whatsapp.jid.Jid r0 = X.AnonymousClass0x9.A0R(r2)     // Catch:{ all -> 0x0495 }
            boolean r0 = X.C627336j.A0L(r0)     // Catch:{ all -> 0x0495 }
            if (r0 == 0) goto L_0x03e4
            java.lang.Object r1 = r2.getKey()     // Catch:{ all -> 0x0495 }
            java.lang.Object r0 = r2.getValue()     // Catch:{ all -> 0x0495 }
            r9.put(r1, r0)     // Catch:{ all -> 0x0495 }
            goto L_0x03c4
        L_0x03e4:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0495 }
            java.lang.String r0 = "trying to add a non lid number participant into the lid participant list "
            r1.append(r0)     // Catch:{ all -> 0x0495 }
            java.lang.Object r0 = r2.getKey()     // Catch:{ all -> 0x0495 }
            X.C18260x0.A0m(r0, r1)     // Catch:{ all -> 0x0495 }
            goto L_0x03c4
        L_0x03f6:
            r4.A0M(r2)     // Catch:{ all -> 0x0495 }
        L_0x03f9:
            r4.A0H()     // Catch:{ all -> 0x0495 }
            X.6aS r0 = r4.A04()     // Catch:{ all -> 0x0495 }
            X.8Nf r1 = r0.iterator()     // Catch:{ all -> 0x0495 }
        L_0x0404:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0495 }
            if (r0 == 0) goto L_0x0413
            X.2zG r0 = X.C18320x8.A0G(r1)     // Catch:{ all -> 0x0495 }
            r0.A00 = r6     // Catch:{ all -> 0x0495 }
            int r6 = r6 + 1
            goto L_0x0404
        L_0x0413:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0495 }
            java.lang.String r0 = "participant-user-store/syncParticipantDevicesWithDeviceStore/"
            X.C18260x0.A1R(r1, r0, r7)     // Catch:{ all -> 0x0495 }
            java.util.HashMap r6 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x0495 }
            if (r15 == 0) goto L_0x0467
            java.util.Map r0 = r4.A08     // Catch:{ all -> 0x0495 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x0495 }
            X.6aS r1 = X.C129526aS.copyOf((java.util.Collection) r0)     // Catch:{ all -> 0x0495 }
        L_0x042d:
            X.318 r0 = r3.A0D     // Catch:{ all -> 0x0495 }
            java.util.Map r0 = r0.A0A(r1)     // Catch:{ all -> 0x0495 }
            java.util.Iterator r7 = X.AnonymousClass000.A0q(r0)     // Catch:{ all -> 0x0495 }
        L_0x0437:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0495 }
            if (r0 == 0) goto L_0x046c
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r7)     // Catch:{ all -> 0x0495 }
            com.whatsapp.jid.UserJid r2 = X.C18320x8.A0P(r0)     // Catch:{ all -> 0x0495 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x0495 }
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ all -> 0x0495 }
            boolean r0 = r4.A0Q(r2)     // Catch:{ all -> 0x0495 }
            if (r0 == 0) goto L_0x0437
            X.6aS r0 = X.C129526aS.copyOf((java.util.Collection) r1)     // Catch:{ all -> 0x0495 }
            X.2Mp r1 = r4.A08(r0, r2)     // Catch:{ all -> 0x0495 }
            boolean r0 = r1.A00     // Catch:{ all -> 0x0495 }
            if (r0 != 0) goto L_0x0461
            boolean r0 = r1.A01     // Catch:{ all -> 0x0495 }
            if (r0 == 0) goto L_0x0437
        L_0x0461:
            boolean r0 = r1.A02     // Catch:{ all -> 0x0495 }
            X.AnonymousClass000.A1C(r2, r6, r0)     // Catch:{ all -> 0x0495 }
            goto L_0x0437
        L_0x0467:
            X.6aS r1 = r4.A03()     // Catch:{ all -> 0x0495 }
            goto L_0x042d
        L_0x046c:
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x0495 }
            if (r0 != 0) goto L_0x0479
            X.4FS r1 = r3.A0F     // Catch:{ all -> 0x0495 }
            r0 = 10
            X.C70343aL.A01(r1, r3, r4, r6, r0)     // Catch:{ all -> 0x0495 }
        L_0x0479:
            r0 = r39
            r0.put(r5, r4)     // Catch:{ all -> 0x0499 }
            goto L_0x0497
        L_0x047f:
            r1 = move-exception
            if (r6 == 0) goto L_0x048a
            r6.close()     // Catch:{ all -> 0x0486 }
            goto L_0x048a
        L_0x0486:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x048b }
        L_0x048a:
            throw r1     // Catch:{ all -> 0x048b }
        L_0x048b:
            r1 = move-exception
            r24.close()     // Catch:{ all -> 0x0490 }
            goto L_0x0494
        L_0x0490:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0495 }
        L_0x0494:
            throw r1     // Catch:{ all -> 0x0495 }
        L_0x0495:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0499 }
        L_0x0497:
            monitor-exit(r25)     // Catch:{ all -> 0x049c }
            goto L_0x04a5
        L_0x0499:
            r0 = move-exception
            monitor-exit(r25)     // Catch:{ all -> 0x049c }
            throw r0     // Catch:{ all -> 0x049c }
        L_0x049c:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x049e }
        L_0x049e:
            r1 = move-exception
            r0 = r26
            X.AnonymousClass2A8.A00(r0, r2)
            throw r1
        L_0x04a5:
            r26.close()
        L_0x04a8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C620533h.A07(X.1fL):X.33k");
    }

    public final UserJid A08(UserJid userJid) {
        if (userJid.equals(AnonymousClass1fY.A00)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("participant-user-store/sanitizeParticipantJid/my jid = ");
            C56972sr r1 = this.A01;
            C18260x0.A0o(C56972sr.A04(r1), A0o);
            return C56972sr.A05(r1);
        } else if (!userJid.equals(AnonymousClass1fX.A00)) {
            return userJid;
        } else {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("participant-user-store/sanitizeParticipantJid/my lid jid = ");
            C56972sr r12 = this.A01;
            C18260x0.A0o(r12.A0H(), A0o2);
            return r12.A0H();
        }
    }

    public boolean A0M(C95814uZ r4) {
        if (!(r4 instanceof GroupJid) || A07((C28011fL) r4).A09.size() <= 2) {
            return false;
        }
        return true;
    }

    public C620533h(C55682qk r3, C56972sr r4, C42112Mv r5, C64773Ex r6, C56612sH r7, C56982ss r8, C49472ga r9, C46412ba r10, C623334p r11, C72303dV r12, C54772pG r13, C56662sM r14, AnonymousClass318 r15, C54932pW r16, AnonymousClass4FS r17, C183538qC r18) {
        this.A04 = r7;
        this.A09 = r11;
        this.A00 = r3;
        this.A01 = r4;
        this.A0F = r17;
        this.A05 = r8;
        this.A0E = r16;
        this.A03 = r6;
        this.A0C = r14;
        this.A0D = r15;
        this.A02 = r5;
        this.A06 = r9;
        this.A0A = r12;
        this.A0G = r18;
        this.A08 = r10;
        this.A0B = r13;
    }

    public static final C129526aS A00(C129526aS r4, UserJid userJid) {
        HashSet A0K = AnonymousClass002.A0K();
        try {
            C172878Nf it = r4.iterator();
            while (it.hasNext()) {
                A0K.add(DeviceJid.Companion.A01(userJid, AnonymousClass0x7.A0S(it).getDevice()));
            }
        } catch (AnonymousClass24P e) {
            Log.e((Throwable) e);
        }
        return C129526aS.copyOf((Collection) A0K);
    }

    public static C172878Nf A01(C620533h r0, C28011fL r1) {
        return r0.A07(r1).A04().iterator();
    }

    public int A03(C28011fL r8) {
        Cursor A0E2;
        C18260x0.A1R(AnonymousClass001.A0o(), "participant-user-store/getGroupParticipantsCount/", r8);
        int A042 = A04(r8);
        if (A042 != -1) {
            return A042;
        }
        String A043 = C623334p.A04(this.A09, r8);
        AnonymousClass4GK A032 = this.A0A.get();
        try {
            C56862sg r3 = ((AnonymousClass3H0) A032).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            A1Y[0] = A043;
            A0E2 = r3.A0E("SELECT COUNT(1) as count FROM group_participant_user WHERE group_jid_row_id = ?", "GET_GROUP_PARTICIPANTS_COUNT_SQL", A1Y);
            if (A0E2.moveToFirst()) {
                int A033 = AnonymousClass0x2.A03(A0E2);
                A0E2.close();
                A032.close();
                return A033;
            }
            A0E2.close();
            A032.close();
            return 0;
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

    public int A04(C28011fL r3) {
        C620833k A002;
        C18260x0.A1R(AnonymousClass001.A0o(), "participant-user-store/getGroupParticipantsCountFromCacheIfAvailable/", r3);
        C46412ba r1 = this.A08;
        C162457s7.A0J(r3, 0);
        if (!r1.A04.containsKey(r3) || (A002 = r1.A00(r3)) == null) {
            return -1;
        }
        return A002.A09.size();
    }

    public final long A05(UserJid userJid) {
        C626936e.A0E(C18320x8.A1U(userJid.getRawString()), "participant-user-store/invalid-jid");
        C56972sr r1 = this.A01;
        if (C56972sr.A05(r1).equals(userJid)) {
            userJid = AnonymousClass1fY.A00;
        } else if (r1.A0H() != null && r1.A0H().equals(userJid)) {
            userJid = AnonymousClass1fX.A00;
        }
        return this.A09.A05(userJid);
    }

    public HashMap A09(UserJid userJid, Set set, int i) {
        Cursor A0E2;
        HashMap A0t = AnonymousClass001.A0t();
        if (set.isEmpty()) {
            return A0t;
        }
        HashMap A0t2 = AnonymousClass001.A0t();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            UserJid A0T = C18310x6.A0T(it);
            A0t2.put(String.valueOf(A05(A0T)), A0T);
        }
        String valueOf = String.valueOf(A05(userJid));
        Object[] array = A0t2.keySet().toArray(C58152un.A0N);
        HashMap A0t3 = AnonymousClass001.A0t();
        AnonymousClass4GK A032 = this.A0A.get();
        try {
            C71923ct r12 = new C71923ct(array, 974);
            while (r12.hasNext()) {
                String[] A012 = C71923ct.A01(r12);
                int length = A012.length;
                String[] strArr = new String[(length + 1)];
                System.arraycopy(A012, 0, strArr, 1, length);
                A0E2 = AnonymousClass3H0.A04(valueOf, A032, strArr, 0).A0E(AnonymousClass263.A00(length), "GET_GROUPS_BY_USER_JIDS_SQL", strArr);
                int columnIndexOrThrow = A0E2.getColumnIndexOrThrow("group_jid_row_id");
                int columnIndexOrThrow2 = A0E2.getColumnIndexOrThrow("user_jid_row_id");
                while (A0E2.moveToNext()) {
                    long j = A0E2.getLong(columnIndexOrThrow);
                    long j2 = A0E2.getLong(columnIndexOrThrow2);
                    Long valueOf2 = Long.valueOf(j);
                    Set set2 = (Set) A0t3.get(valueOf2);
                    if (set2 == null) {
                        set2 = AnonymousClass002.A0K();
                    }
                    set2.add(Long.valueOf(j2));
                    A0t3.put(valueOf2, set2);
                }
                A0E2.close();
            }
            Map A0D2 = this.A09.A0D(C28011fL.class, A0t3.keySet());
            Map A0I = this.A03.A0I(A0D2.values());
            Iterator A0u = AnonymousClass001.A0u(A0t3);
            while (A0u.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0u);
                C28011fL r8 = (C28011fL) AnonymousClass0x7.A0k(A0w, A0D2);
                if (A0L((AnonymousClass3ZH) A0I.get(r8), r8)) {
                    HashSet A0K = AnonymousClass002.A0K();
                    for (Long valueOf3 : (Set) A0w.getValue()) {
                        UserJid userJid2 = (UserJid) A0t2.get(String.valueOf(valueOf3));
                        if (userJid2 != null) {
                            A0K.add(userJid2);
                        }
                    }
                    A0t.put((C27991fJ) r8, A0K);
                    int i2 = i;
                    if (i2 > -1 && A0t.size() >= i2) {
                        break;
                    }
                }
            }
            A032.close();
            return A0t;
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

    public Set A0A(C28011fL r19) {
        Cursor A0E2;
        UserJid userJid;
        HashSet A0K = AnonymousClass002.A0K();
        C623334p r6 = this.A09;
        String A042 = C623334p.A04(r6, r19);
        AnonymousClass4GK A032 = this.A0A.get();
        try {
            A0E2 = ((AnonymousClass3H0) A032).A03.A0E("SELECT user, server, agent, device, type, raw_string, user_jid_row_id FROM group_participant_user JOIN jid ON user_jid_row_id = jid._id WHERE group_jid_row_id = ?", "GET_GROUP_PARTICIPANT_USER_JIDS_SQL", C18270x1.A1b(A042));
            int columnIndexOrThrow = A0E2.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            int columnIndexOrThrow2 = A0E2.getColumnIndexOrThrow("server");
            int columnIndexOrThrow3 = A0E2.getColumnIndexOrThrow("agent");
            int columnIndexOrThrow4 = A0E2.getColumnIndexOrThrow("device");
            int columnIndexOrThrow5 = A0E2.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            int columnIndexOrThrow6 = A0E2.getColumnIndexOrThrow("raw_string");
            int columnIndexOrThrow7 = A0E2.getColumnIndexOrThrow("user_jid_row_id");
            while (A0E2.moveToNext()) {
                UserJid userJid2 = (UserJid) r6.A0A(A0E2, A032, UserJid.class, columnIndexOrThrow, columnIndexOrThrow2, columnIndexOrThrow3, columnIndexOrThrow4, columnIndexOrThrow5, columnIndexOrThrow6, A0E2.getLong(columnIndexOrThrow7));
                if (userJid2 == null) {
                    userJid = null;
                } else {
                    userJid = A08(userJid2);
                }
                if (userJid != null) {
                    A0K.add(userJid);
                }
            }
            A0E2.close();
            A032.close();
            return A0K;
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

    public Set A0B(UserJid userJid) {
        Cursor A0E2;
        HashSet A0K = AnonymousClass002.A0K();
        AnonymousClass4GK A032 = this.A0A.get();
        try {
            C56862sg r4 = ((AnonymousClass3H0) A032).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            C18260x0.A1X(A1Y, A05(userJid));
            A0E2 = r4.A0E("SELECT group_jid_row_id FROM group_participant_user WHERE user_jid_row_id = ?", "GET_PARTICIPANT_GROUPS_BY_USER_JID_SQL", A1Y);
            while (A0E2.moveToNext()) {
                C28011fL r0 = (C28011fL) this.A09.A0B(C28011fL.class, AnonymousClass0x2.A0C(A0E2, "group_jid_row_id"));
                if (r0 != null) {
                    A0K.add(r0);
                }
            }
            A0E2.close();
            A032.close();
            return A0K;
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

    public Set A0C(Set set) {
        Cursor A0E2;
        HashSet A0K = AnonymousClass002.A0K();
        if (set.isEmpty()) {
            return A0K;
        }
        AnonymousClass4GK A032 = this.A0A.get();
        try {
            C71923ct A002 = C71923ct.A00((DeviceJid[]) set.toArray(new DeviceJid[0]));
            while (A002.hasNext()) {
                DeviceJid[] deviceJidArr = (DeviceJid[]) A002.next();
                C56862sg r7 = ((AnonymousClass3H0) A032).A03;
                int length = deviceJidArr.length;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("SELECT DISTINCT(group_jid_row_id) FROM group_participant_user AS user JOIN group_participant_device AS device ON  user._id =  device.group_participant_row_id WHERE ");
                C57212tH.A02("device_jid_row_id IN ", A0o, length);
                A0o.append(" AND ");
                String A0X = AnonymousClass000.A0X("sent_sender_key = 1", A0o);
                String[] strArr = new String[length];
                for (int i = 0; i < length; i++) {
                    AnonymousClass0x2.A1S(strArr, i, this.A09.A05(deviceJidArr[i]));
                }
                A0E2 = r7.A0E(A0X, "GET_PARTICIPANT_GROUPS_WITH_SENDER_KEY_SENT_SQL", strArr);
                int columnIndexOrThrow = A0E2.getColumnIndexOrThrow("group_jid_row_id");
                HashSet A0K2 = AnonymousClass002.A0K();
                while (A0E2.moveToNext()) {
                    C18260x0.A0H(A0E2, A0K2, columnIndexOrThrow);
                }
                Iterator A0v = AnonymousClass001.A0v(this.A09.A0D(C28011fL.class, A0K2));
                while (A0v.hasNext()) {
                    C28011fL r0 = (C28011fL) A0v.next();
                    if (r0 != null) {
                        A0K.add(r0);
                    }
                }
                A0E2.close();
            }
            A032.close();
            return A0K;
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

    public final void A0D(C129526aS r8, C620833k r9, UserJid userJid) {
        boolean z;
        C172878Nf it = r8.iterator();
        while (true) {
            if (it.hasNext()) {
                if (C627336j.A0L(AnonymousClass0x7.A0R(it).userJid)) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z && r9.A00 == 0) {
            this.A00.A0A("addDevice/group with lid", false, "trying to add a lid device for a non lid based group");
        }
        boolean A0L = C627336j.A0L(userJid);
        if (!A0L && z) {
            this.A00.A0A("addDevice/group with lid", false, "a non lid participant and is trying to add a lid device");
        }
        C60842zG A052 = r9.A05(userJid);
        if (A052 == null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("GroupParticipants/addDevices/participant ");
            A0o.append(userJid);
            C18260x0.A1M(A0o, " doesn't exist");
            return;
        }
        r9.A0A = true;
        C172878Nf it2 = r8.iterator();
        while (it2.hasNext()) {
            DeviceJid A0R = AnonymousClass0x7.A0R(it2);
            if ((!A0L && !C627336j.A0L(A0R)) || r9.A00 != 0) {
                C52162kz r2 = new C52162kz(A0R, false, false);
                C18320x8.A1G(r2.A02, r2, A052.A04);
            }
        }
        if (!r8.isEmpty()) {
            r9.A0J();
        }
    }

    public void A0E(C60842zG r15, C28011fL r16) {
        C69833Yo Axl;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("participant-user-store/updateGroupParticipant/");
        C28011fL r10 = r16;
        A0o.append(r10);
        C18260x0.A1R(A0o, " ", r15);
        UserJid userJid = r15.A03;
        long A052 = A05(userJid);
        String A042 = C623334p.A04(this.A09, r10);
        String valueOf = String.valueOf(A052);
        ContentValues A062 = C18300x5.A06();
        A062.put("group_jid_row_id", A042);
        A062.put("user_jid_row_id", valueOf);
        A062.put("rank", Integer.valueOf(r15.A01));
        A062.put("pending", Integer.valueOf(r15.A02 ? 1 : 0));
        String[] A1Z = AnonymousClass0x9.A1Z();
        AnonymousClass000.A16(A042, valueOf, A1Z);
        C85284Fq A022 = A02(this);
        try {
            Axl = A022.Axl();
            C56862sg r4 = ((AnonymousClass3H0) A022).A03;
            if (r4.A05(A062, "group_participant_user", "group_jid_row_id = ? AND user_jid_row_id = ?", "insertOrUpdateGroupParticipant/UPDATE_GROUP_PARTICIPANT_USER", A1Z) != 0) {
                this.A0B.A01(C129526aS.copyOf(r15.A04.values()), r10, userJid, A052);
            } else {
                r4.A08("group_participant_user", "insertOrUpdateGroupParticipant/INSERT_GROUP_PARTICIPANT_USER", A062);
                this.A0B.A00(C129526aS.copyOf(r15.A04.values()), r10, userJid, A052);
            }
            Axl.A00();
            Axl.close();
            A022.close();
            return;
        } catch (Throwable th) {
            try {
                A022.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A0F(C620833k r6) {
        C69833Yo Axl;
        C18260x0.A1R(AnonymousClass001.A0o(), "participant-user-store/resetSentSenderKeyForAllParticipants/", r6);
        C28011fL r4 = r6.A05;
        C85284Fq A022 = A02(this);
        try {
            Axl = A022.Axl();
            this.A0B.A02(r4);
            A0G(r6);
            Axl.A00();
            Axl.close();
            A022.close();
            C42112Mv r1 = this.A02;
            new AnonymousClass2VY(r4);
            r1.A01.A00();
            return;
        } catch (Throwable th) {
            try {
                A022.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public final void A0G(C620833k r5) {
        C172878Nf it = r5.A04().iterator();
        while (it.hasNext()) {
            C172878Nf A002 = C60842zG.A00(C18320x8.A0G(it));
            while (A002.hasNext()) {
                ((C52162kz) A002.next()).A01 = false;
            }
        }
    }

    public void A0I(C28011fL r6, Collection collection) {
        C69833Yo Axl;
        C620833k A072 = A07(r6);
        if (!this.A0E.A02(A072.A05)) {
            C85284Fq A022 = A02(this);
            try {
                Axl = A022.Axl();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    C60842zG A052 = A072.A05(C18310x6.A0T(it));
                    if (A052 != null) {
                        A0E(A052, r6);
                    }
                }
                Axl.A00();
                Axl.close();
                A022.close();
                return;
            } catch (Throwable th) {
                try {
                    A022.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else {
            return;
        }
        throw th;
    }

    public void A0J(C28011fL r7, List list) {
        C69833Yo Axl;
        C85284Fq A022 = A02(this);
        try {
            Axl = A022.Axl();
            Iterator it = list.iterator();
            boolean z = false;
            while (it.hasNext()) {
                C95814uZ A0P = C18300x5.A0P(it);
                if ((A0P instanceof UserJid) && A0O(r7, (UserJid) A0P)) {
                    z = true;
                }
            }
            if (z) {
                this.A0B.A02(r7);
            }
            Axl.A00();
            Axl.close();
            A022.close();
            return;
        } catch (Throwable th) {
            try {
                A022.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public final void A0K(UserJid userJid, Set set, boolean z) {
        C69833Yo Axl;
        C85284Fq A022 = A02(this);
        try {
            Axl = A022.Axl();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                A0H((C620833k) it.next(), userJid, z);
            }
            Axl.A00();
            Axl.close();
            A022.close();
            return;
        } catch (Throwable th) {
            try {
                A022.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public final boolean A0N(C28011fL r9, long j) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("participant-user-store/removeGroupParticipant/");
        A0o.append(r9);
        C18260x0.A12(" ", A0o, j);
        String A042 = C623334p.A04(this.A09, r9);
        C85284Fq A022 = A02(this);
        try {
            C56862sg r5 = ((AnonymousClass3H0) A022).A03;
            String[] A1Z = AnonymousClass0x9.A1Z();
            boolean z = false;
            A1Z[0] = A042;
            C18270x1.A1R(A1Z, j);
            if (r5.A07("group_participant_user", "group_jid_row_id = ? AND user_jid_row_id = ?", "removeGroupParticipant/DELETE_GROUP_PARTICIPANT_USER", A1Z) != 0) {
                z = true;
            }
            A022.close();
            return z;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public boolean A0O(C28011fL r3, UserJid userJid) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("participant-user-store/removeGroupParticipant/");
        A0o.append(r3);
        C18260x0.A1R(A0o, " ", userJid);
        return A0N(r3, A05(userJid));
    }
}
