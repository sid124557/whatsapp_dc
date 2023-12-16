package com.whatsapp.jobqueue.job;

import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass1EU;
import X.AnonymousClass1VX;
import X.AnonymousClass25r;
import X.AnonymousClass2GF;
import X.AnonymousClass2JG;
import X.AnonymousClass2MM;
import X.AnonymousClass2OO;
import X.AnonymousClass2R4;
import X.AnonymousClass2WW;
import X.AnonymousClass2Y0;
import X.AnonymousClass2YF;
import X.AnonymousClass300;
import X.AnonymousClass31C;
import X.AnonymousClass32W;
import X.AnonymousClass33Z;
import X.AnonymousClass36E;
import X.AnonymousClass36Y;
import X.AnonymousClass9U4;
import X.C106685Zz;
import X.C107695bk;
import X.C116985rC;
import X.C1228065u;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C183538qC;
import X.C29431io;
import X.C389229y;
import X.C45042Yl;
import X.C45502a7;
import X.C45612aI;
import X.C46412ba;
import X.C47002cY;
import X.C48122eO;
import X.C48972fm;
import X.C50222hp;
import X.C51072jE;
import X.C52552lf;
import X.C54602oz;
import X.C54932pW;
import X.C55332qB;
import X.C55492qR;
import X.C55672qj;
import X.C55682qk;
import X.C55832qz;
import X.C56402rv;
import X.C56422rx;
import X.C56612sH;
import X.C56892sj;
import X.C56972sr;
import X.C56982ss;
import X.C60102y0;
import X.C620333f;
import X.C620433g;
import X.C621133n;
import X.C621233o;
import X.C622434g;
import X.C624134x;
import X.C627336j;
import X.C64333Db;
import X.C66483Lp;
import X.C66543Lv;
import X.C69263Wi;
import X.C72343dZ;
import X.C88744aj;
import android.content.Context;
import android.os.SystemClock;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.wamsys.JniBridge;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import org.whispersystems.jobqueue.Job;

public final class SendE2EMessageJob extends Job implements C1228065u {
    public static final ConcurrentHashMap A19 = AnonymousClass0x9.A1D();
    public static final long serialVersionUID = 1;
    public transient int A00;
    public transient int A01;
    public transient long A02;
    public transient long A03;
    public transient long A04;
    public transient long A05;
    public transient C116985rC A06;
    public transient C116985rC A07;
    public transient C116985rC A08;
    public transient C116985rC A09;
    public transient C116985rC A0A;
    public transient C55682qk A0B;
    public transient C69263Wi A0C;
    public transient C56972sr A0D;
    public transient AnonymousClass36E A0E;
    public transient C55492qR A0F;
    public transient C620433g A0G;
    public transient C56422rx A0H;
    public transient C56612sH A0I;
    public transient C621133n A0J;
    public transient C48972fm A0K;
    public transient AnonymousClass25r A0L;
    public transient AnonymousClass2Y0 A0M;
    public transient AnonymousClass2R4 A0N;
    public transient C56982ss A0O;
    public transient C66543Lv A0P;
    public transient C55672qj A0Q;
    public transient C46412ba A0R;
    public transient C56892sj A0S;
    public transient C66483Lp A0T;
    public transient C29431io A0U;
    public transient AnonymousClass300 A0V;
    public transient C55332qB A0W;
    public transient C620333f A0X;
    public transient AnonymousClass33Z A0Y;
    public transient AnonymousClass2GF A0Z;
    public transient AnonymousClass1VX A0a;
    public transient AnonymousClass2YF A0b;
    public transient C54602oz A0c;
    public transient C54932pW A0d;
    public transient DeviceJid A0e;
    public transient C48122eO A0f;
    public transient C622434g A0g;
    public transient C47002cY A0h;
    public transient AnonymousClass2OO A0i;
    public transient C106685Zz A0j;
    public transient C621233o A0k;
    public transient AnonymousClass2WW A0l;
    public transient C60102y0 A0m;
    public transient C52552lf A0n;
    public transient AnonymousClass31C A0o;
    public transient AnonymousClass9U4 A0p;
    public transient AnonymousClass1EU A0q;
    public transient C624134x A0r;
    public transient C50222hp A0s;
    public transient C45042Yl A0t;
    public transient C51072jE A0u;
    public transient C45502a7 A0v;
    public transient C55832qz A0w;
    public transient AnonymousClass2MM A0x;
    public transient C45612aI A0y;
    public transient C56402rv A0z;
    public transient JniBridge A10;
    public transient C183538qC A11;
    public transient C183538qC A12;
    public transient C183538qC A13;
    public transient boolean A14;
    public transient boolean A15;
    public transient boolean A16;
    public transient boolean A17;
    public transient boolean A18;
    public final String botInvokeRawJid;
    public final String broadcastListName;
    public final HashMap broadcastParticipantEphemeralSettings;
    public boolean duplicate;
    public final int editVersion;
    public final HashMap encryptionRetryCounts;
    public final byte[] ephemeralSharedSecret;
    public final long expireTimeMs;
    public final boolean forceSenderKeyDistribution;
    public final String groupParticipantHash;
    public final String groupParticipantUserHash;
    public final String id;
    public final boolean includeSenderKeysInMessage;
    public final String jid;
    public final Integer liveLocationDuration;
    public final long messageSendStartTime;
    public final byte messageType;
    public final boolean multiDeviceFanOut;
    public final long originalTimestamp;
    public final int originationFlags;
    public final String participant;
    public final String recipientRawJid;
    public final int retryCount;
    public final HashSet targetDeviceRawJids;
    public final boolean useLidForEncryption;
    public final boolean useOneOneEncryptionOnPHashMismatch;
    public final boolean useParticipantUserHash;

    public class OutOfMemoryException extends Exception {
        public final int messageDistributionType;

        public OutOfMemoryException(int i) {
            super("OutOfMemoryError");
            this.messageDistributionType = i;
        }
    }

    public final String A08() {
        String A092;
        String A082 = C627336j.A08(this.jid);
        String A083 = C627336j.A08(this.participant);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("; id=");
        A0o2.append(this.id);
        A0o2.append("; jid=");
        A0o2.append(A082);
        A0o2.append("; participant=");
        A0o2.append(A083);
        A0o2.append("; retryCount=");
        A0o2.append(this.retryCount);
        A0o2.append("; targetDevices=");
        HashSet hashSet = this.targetDeviceRawJids;
        if (hashSet == null) {
            A092 = "null";
        } else {
            A092 = C627336j.A09(C18280x3.A1b(hashSet));
        }
        A0o2.append(A092);
        A0o2.append("; groupParticipantHash=");
        A0o2.append(this.groupParticipantHash);
        A0o2.append("; includeSenderKeysInMessage=");
        A0o2.append(this.includeSenderKeysInMessage);
        A0o2.append("; useOneOneEncryptionOnPHashMismatch=");
        A0o2.append(this.useOneOneEncryptionOnPHashMismatch);
        A0o2.append("; forceSenderKeyDistribution=");
        A0o2.append(this.forceSenderKeyDistribution);
        A0o2.append("; useParticipantUserHash=");
        A0o2.append(this.useParticipantUserHash);
        C18270x1.A1I(A0o2, this);
        return A0o2.toString();
    }

    public final void A09(int i, int i2) {
        AnonymousClass36E r1 = this.A0E;
        C624134x r2 = this.A0r;
        int i3 = i2;
        r1.A0N(r2, (Integer) null, 9, r2.A1d, this.A0r.A0B, this.A0h.A00().size(), i3, i, 0, !A0D(), false, A0D(), this.A18);
        this.A0V.A01((AnonymousClass2JG) null, this.A0r.A1J, 20);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r8 != null) goto L_0x0007;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(com.whatsapp.jid.DeviceJid r8, com.whatsapp.jid.Jid r9) {
        /*
            r7 = this;
            boolean r3 = r9 instanceof X.C28011fL
            if (r3 == 0) goto L_0x0007
            r2 = 1
            if (r8 == 0) goto L_0x0019
        L_0x0007:
            r2 = 0
            if (r8 == 0) goto L_0x0019
            r6 = 0
            if (r3 != 0) goto L_0x001a
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "participant cannot be set if the primary jid is not a group or broadcast list"
            java.lang.IllegalArgumentException r0 = X.C18260x0.A01(r7, r0, r1)
            throw r0
        L_0x0019:
            r6 = 1
        L_0x001a:
            int r0 = r7.retryCount
            if (r0 < 0) goto L_0x0156
            java.lang.String r0 = r7.groupParticipantHash
            if (r0 == 0) goto L_0x0033
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0033
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "groupParticipantHash cannot be set to an empty string"
            java.lang.IllegalArgumentException r0 = X.C18260x0.A01(r7, r0, r1)
            throw r0
        L_0x0033:
            java.lang.String r1 = r7.groupParticipantHash
            if (r1 == 0) goto L_0x0051
            if (r3 == 0) goto L_0x0046
            if (r8 == 0) goto L_0x0051
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "groupParticipantHash cannot be set if participant is set"
            java.lang.IllegalArgumentException r0 = X.C18260x0.A01(r7, r0, r1)
            throw r0
        L_0x0046:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "groupParticipantHash cannot be set if the primary jid is not a group or broadcast list"
            java.lang.IllegalArgumentException r0 = X.C18260x0.A01(r7, r0, r1)
            throw r0
        L_0x0051:
            boolean r0 = r7.includeSenderKeysInMessage
            if (r0 == 0) goto L_0x0062
            if (r3 != 0) goto L_0x0062
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "includeSenderKeysInMessage cannot be set if the primary jid is not a group or broadcast list"
            java.lang.IllegalArgumentException r0 = X.C18260x0.A01(r7, r0, r1)
            throw r0
        L_0x0062:
            if (r2 == 0) goto L_0x007b
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x007b
            boolean r0 = r7.A0C()
            if (r0 != 0) goto L_0x007b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "cannot send e2e message to a group without a participant hash"
            java.lang.IllegalArgumentException r0 = X.C18260x0.A01(r7, r0, r1)
            throw r0
        L_0x007b:
            long r1 = r7.expireTimeMs
            r4 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x008e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "expireTimeMs must be non-negative"
            java.lang.IllegalArgumentException r0 = X.C18260x0.A01(r7, r0, r1)
            throw r0
        L_0x008e:
            if (r3 != 0) goto L_0x00a1
            com.whatsapp.jid.DeviceJid r0 = r7.A0e     // Catch:{ IllegalArgumentException -> 0x0096 }
            X.AnonymousClass36G.A02(r0)     // Catch:{ IllegalArgumentException -> 0x0096 }
            goto L_0x00a1
        L_0x0096:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "jid is not a valid axolotl address"
            java.lang.IllegalArgumentException r0 = X.C18260x0.A01(r7, r0, r1)
            throw r0
        L_0x00a1:
            if (r6 != 0) goto L_0x00b3
            X.AnonymousClass36G.A02(r8)     // Catch:{ IllegalArgumentException -> 0x00a7 }
            goto L_0x00b3
        L_0x00a7:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "participant is not a valid axolotl address"
            java.lang.IllegalArgumentException r0 = X.C18260x0.A01(r7, r0, r1)
            throw r0
        L_0x00b3:
            boolean r0 = r9 instanceof X.AnonymousClass1fI
            byte[] r1 = r7.ephemeralSharedSecret
            if (r0 != 0) goto L_0x00e4
            if (r1 != 0) goto L_0x00d9
            java.util.HashMap r0 = r7.broadcastParticipantEphemeralSettings
            if (r0 != 0) goto L_0x00ce
            java.lang.String r0 = r7.broadcastListName
            if (r0 == 0) goto L_0x00ea
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "broadcastListName should only be set for a broadcast list jid"
            java.lang.IllegalArgumentException r0 = X.C18260x0.A01(r7, r0, r1)
            throw r0
        L_0x00ce:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "broadcastParticipantEphemeralSettings should only be set for a broadcast list jid"
            java.lang.IllegalArgumentException r0 = X.C18260x0.A01(r7, r0, r1)
            throw r0
        L_0x00d9:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ephemeralSharedSecret should only be set for a broadcast list jid"
            java.lang.IllegalArgumentException r0 = X.C18260x0.A01(r7, r0, r1)
            throw r0
        L_0x00e4:
            java.util.HashMap r0 = r7.broadcastParticipantEphemeralSettings
            if (r1 != 0) goto L_0x00fb
            if (r0 != 0) goto L_0x014b
        L_0x00ea:
            boolean r0 = r7.forceSenderKeyDistribution
            if (r0 == 0) goto L_0x0113
            if (r3 != 0) goto L_0x0102
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "forced sender key distribution can only be used with target devices "
            java.lang.IllegalArgumentException r0 = X.C18260x0.A01(r7, r0, r1)
            throw r0
        L_0x00fb:
            if (r0 != 0) goto L_0x00ea
            int r0 = r7.retryCount
            if (r0 == 0) goto L_0x014b
            goto L_0x00ea
        L_0x0102:
            boolean r0 = r7.A0C()
            if (r0 != 0) goto L_0x0113
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "forced sender key distribution can only be used with target devices "
            java.lang.IllegalArgumentException r0 = X.C18260x0.A01(r7, r0, r1)
            throw r0
        L_0x0113:
            boolean r0 = r7.forceSenderKeyDistribution
            if (r0 == 0) goto L_0x012b
            X.1EU r0 = r7.A0q
            int r0 = r0.bitField0_
            r0 = r0 & 2
            if (r0 != 0) goto L_0x012b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "missing sender key distribution message "
            java.lang.IllegalArgumentException r0 = X.C18260x0.A01(r7, r0, r1)
            throw r0
        L_0x012b:
            java.lang.String r4 = r7.jid
            java.lang.String r3 = r7.id
            int r1 = r7.editVersion
            java.lang.String r0 = r7.participant
            X.2gl r2 = new X.2gl
            r2.<init>(r4, r3, r0, r1)
            java.util.concurrent.ConcurrentHashMap r1 = A19
            monitor-enter(r1)
            boolean r0 = r1.containsKey(r2)     // Catch:{ all -> 0x0148 }
            r7.duplicate = r0     // Catch:{ all -> 0x0148 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0148 }
            r1.put(r2, r0)     // Catch:{ all -> 0x0148 }
            monitor-exit(r1)     // Catch:{ all -> 0x0148 }
            return
        L_0x0148:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0148 }
            throw r0
        L_0x014b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "both or neither ephemeral parameter should be set for a broadcast list jid"
            java.lang.IllegalArgumentException r0 = X.C18260x0.A01(r7, r0, r1)
            throw r0
        L_0x0156:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "retryCount cannot be negative"
            java.lang.IllegalArgumentException r0 = X.C18260x0.A01(r7, r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendE2EMessageJob.A0A(com.whatsapp.jid.DeviceJid, com.whatsapp.jid.Jid):void");
    }

    public void A0B(C624134x r28, Collection collection, int i, int i2, int i3, int i4, boolean z) {
        long j;
        C624134x r6 = r28;
        if (r28 != null) {
            if (this.messageSendStartTime != 0 && this.A05 != 0) {
                C56612sH r0 = this.A0I;
                long uptimeMillis = SystemClock.uptimeMillis();
                long A0H2 = r0.A0H() - this.messageSendStartTime;
                int i5 = i;
                if (i5 == 6) {
                    j = this.A05;
                } else {
                    j = r6.A1Q;
                }
                AnonymousClass36E r5 = this.A0E;
                int i6 = this.retryCount;
                boolean z2 = this.A18;
                boolean z3 = this.A15;
                int i7 = this.A01;
                Collection collection2 = collection;
                int i8 = i2;
                int i9 = i3;
                int i10 = i4;
                r5.A0O(r6, collection2, i5, i8, i6, i7, i10, 0, 0, i9, uptimeMillis - j, A0H2, A0H2, z2, z3, this.A14, A0D(), z);
            }
        }
    }

    public final boolean A0C() {
        HashSet hashSet = this.targetDeviceRawJids;
        if (hashSet == null || hashSet.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean A0D() {
        byte b = this.messageType;
        if (b == 58 || b == 69 || b == 77 || !A0C()) {
            return false;
        }
        return true;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        try {
            this.A0q = AnonymousClass1EU.A00((byte[]) objectInputStream.readObject());
        } catch (OptionalDataException unused) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            C18260x0.A1K(A0o2, AnonymousClass0x9.A0x(this, "SendE2EMessageJob/e2e missing message bytes ", A0o2));
        }
        if (this.A0q == null) {
            StringBuilder A0o3 = AnonymousClass001.A0o();
            throw C18270x1.A0C(AnonymousClass0x9.A0x(this, "message must not be null", A0o3), A0o3);
        } else if (this.id != null) {
            Jid A002 = AnonymousClass32W.A00(this.jid);
            if (A002 != null) {
                this.A0e = DeviceJid.getNullable(this.jid);
                DeviceJid nullable = DeviceJid.getNullable(this.participant);
                this.A14 = true;
                this.A05 = SystemClock.uptimeMillis();
                A0A(nullable, A002);
                StringBuilder A0o4 = AnonymousClass001.A0o();
                C18260x0.A1L(A0o4, AnonymousClass0x9.A0x(this, "SendE2EMessageJob/readObject done: ", A0o4));
                return;
            }
            StringBuilder A0o5 = AnonymousClass001.A0o();
            throw C18270x1.A0C(AnonymousClass0x9.A0x(this, "jid must not be null", A0o5), A0o5);
        } else {
            StringBuilder A0o6 = AnonymousClass001.A0o();
            throw C18270x1.A0C(AnonymousClass0x9.A0x(this, "id must not be null", A0o6), A0o6);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.A0q.A0F());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: com.whatsapp.jid.UserJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.util.LinkedList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: java.util.LinkedList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v75, resolved type: com.whatsapp.jid.DeviceJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v18, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v20, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v21, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v22, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v23, resolved type: java.util.LinkedList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v24, resolved type: java.util.LinkedList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v28, resolved type: java.util.LinkedList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v29, resolved type: java.util.LinkedList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v30, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v31, resolved type: java.util.List} */
    /* JADX WARNING: type inference failed for: r5v51, types: [com.whatsapp.jid.Jid] */
    /* JADX WARNING: type inference failed for: r5v52 */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01cb, code lost:
        if (r3.A0Y(X.C58422vE.A02, 4164) != false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1047:0x1475, code lost:
        if (r2.includeSenderKeysInMessage == false) goto L_0x1477;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x046d, code lost:
        if (((X.C30551md) r1).A01 != 0) goto L_0x046f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0498, code lost:
        if (r3 == 68) goto L_0x04b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x04bc, code lost:
        if ((!r0.A0P(r7)) != false) goto L_0x0516;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0514, code lost:
        if ((!r1.equals(r0)) != false) goto L_0x0516;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x051e, code lost:
        if (r20 != null) goto L_0x0520;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x070e, code lost:
        if (r7.A0b(r3) == false) goto L_0x0710;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d0, code lost:
        if ((r0.bitField0_ & 2) != 0) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0850, code lost:
        if (X.C18320x8.A0I(r2.A11).A03(r30, r2.messageType) == false) goto L_0x0852;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:601:0x0bcf, code lost:
        if ((r1 instanceof X.C30601mi) != false) goto L_0x0bd1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:603:0x0bd9, code lost:
        if (r3.A0Y(X.C58422vE.A02, 6822) == false) goto L_0x0bdb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:794:0x102e, code lost:
        if (r4 != null) goto L_0x1030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:881:0x116f, code lost:
        if (X.C627336j.A0K(r30) != false) goto L_0x1171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x018c, code lost:
        if (r1 == X.AnonymousClass23B.A02) goto L_0x018e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x051c  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x053d A[Catch:{ Exception -> 0x13d2, OutOfMemoryError -> 0x13f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0545 A[Catch:{ Exception -> 0x13d2, OutOfMemoryError -> 0x13f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0553 A[Catch:{ Exception -> 0x13d2, OutOfMemoryError -> 0x13f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x07fe A[Catch:{ Exception -> 0x13d2, OutOfMemoryError -> 0x13f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:437:0x0907 A[Catch:{ Exception -> 0x13d2, OutOfMemoryError -> 0x13f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:438:0x090f A[Catch:{ Exception -> 0x13d2, OutOfMemoryError -> 0x13f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x0913 A[Catch:{ Exception -> 0x13d2, OutOfMemoryError -> 0x13f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:456:0x0956 A[ADDED_TO_REGION, Catch:{ Exception -> 0x13d2, OutOfMemoryError -> 0x13f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:469:0x097d A[Catch:{ Exception -> 0x13d2, OutOfMemoryError -> 0x13f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:498:0x09c1 A[Catch:{ Exception -> 0x13d2, OutOfMemoryError -> 0x13f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:549:0x0a7a A[Catch:{ Exception -> 0x13d2, OutOfMemoryError -> 0x13f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:552:0x0a82 A[Catch:{ Exception -> 0x13d2, OutOfMemoryError -> 0x13f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:572:0x0ac5 A[Catch:{ Exception -> 0x13d2, OutOfMemoryError -> 0x13f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:583:0x0aed A[Catch:{ Exception -> 0x13d2, OutOfMemoryError -> 0x13f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:586:0x0af8 A[Catch:{ Exception -> 0x13d2, OutOfMemoryError -> 0x13f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:594:0x0baf A[Catch:{ Exception -> 0x13d2, OutOfMemoryError -> 0x13f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:596:0x0bb9 A[Catch:{ Exception -> 0x13d2, OutOfMemoryError -> 0x13f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:682:0x0d83 A[Catch:{ Exception -> 0x13d2, OutOfMemoryError -> 0x13f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:684:0x0d8b A[Catch:{ Exception -> 0x13d2, OutOfMemoryError -> 0x13f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:723:0x0ec2 A[Catch:{ Exception -> 0x13d2, OutOfMemoryError -> 0x13f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:736:0x0ef5 A[Catch:{ Exception -> 0x13d2, OutOfMemoryError -> 0x13f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:739:0x0f18 A[Catch:{ Exception -> 0x13d2, OutOfMemoryError -> 0x13f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:741:0x0f58 A[Catch:{ Exception -> 0x13d2, OutOfMemoryError -> 0x13f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:770:0x0fba A[Catch:{ Exception -> 0x13d2, OutOfMemoryError -> 0x13f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:773:0x0fc2 A[Catch:{ Exception -> 0x13d2, OutOfMemoryError -> 0x13f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:780:0x0fe2 A[Catch:{ Exception -> 0x13d2, OutOfMemoryError -> 0x13f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:782:0x0ffc A[Catch:{ Exception -> 0x13d2, OutOfMemoryError -> 0x13f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:824:0x109d A[Catch:{ Exception -> 0x13d2, OutOfMemoryError -> 0x13f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:829:0x10a6 A[Catch:{ Exception -> 0x13d2, OutOfMemoryError -> 0x13f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:843:0x10cd A[Catch:{ Exception -> 0x13d2, OutOfMemoryError -> 0x13f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:846:0x10d3 A[Catch:{ Exception -> 0x13d2, OutOfMemoryError -> 0x13f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:889:0x11c9 A[Catch:{ Exception -> 0x13d2, OutOfMemoryError -> 0x13f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:899:0x1211 A[Catch:{ Exception -> 0x13d2, OutOfMemoryError -> 0x13f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:902:0x1233 A[Catch:{ Exception -> 0x13d2, OutOfMemoryError -> 0x13f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:907:0x124d A[Catch:{ Exception -> 0x13d2, OutOfMemoryError -> 0x13f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:963:0x135e A[Catch:{ Exception -> 0x13d2, OutOfMemoryError -> 0x13f7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07() {
        /*
            r93 = this;
            long r17 = android.os.SystemClock.uptimeMillis()
            r2 = r93
            long r5 = r2.A05
            r3 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0012
            r0 = r17
            r2.A05 = r0
        L_0x0012:
            java.lang.String r32 = r2.A08()
            boolean r0 = r2.duplicate
            if (r0 == 0) goto L_0x0026
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "SendE2EMessageJob/e2e messasge job is duplicate skipping"
        L_0x0020:
            r0 = r32
            X.C18260x0.A0t(r1, r0, r2)
        L_0x0025:
            return
        L_0x0026:
            java.lang.String r0 = r2.jid
            com.whatsapp.jid.Jid r30 = X.AnonymousClass32W.A01(r0)
            X.4uZ r15 = X.C627336j.A02(r30)
            X.C626936e.A06(r15)
            boolean r0 = r15 instanceof X.C95804uY
            r4 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0041
            X.2qk r1 = r2.A0B
            java.lang.String r0 = "cant use sende2emessagejob for this jid"
            r1.A0A(r0, r4, r3)
            return
        L_0x0041:
            java.lang.String r0 = r2.participant
            com.whatsapp.jid.DeviceJid r20 = com.whatsapp.jid.DeviceJid.getNullable(r0)
            java.lang.String r0 = r2.recipientRawJid
            com.whatsapp.jid.UserJid r22 = X.AnonymousClass32Y.A08(r0)
            java.lang.String r0 = r2.participant
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x137d
            com.whatsapp.jid.DeviceJid r0 = r2.A0e
            r46 = r0
        L_0x0059:
            r3 = 1
            if (r22 == 0) goto L_0x0085
            com.whatsapp.jid.DeviceJid r0 = r2.A0e
            X.C626936e.A06(r0)
            com.whatsapp.jid.UserJid r1 = r0.userJid
            X.2sr r0 = r2.A0D
            boolean r0 = r0.A0a(r1)
            if (r0 != 0) goto L_0x007c
            X.8qC r0 = r2.A11
            r0.get()
            boolean r0 = X.C155477ey.A00(r15)
            if (r0 != 0) goto L_0x007c
            java.lang.String r0 = "SendE2EMessageJob/cannot send e2e message with recipient other than own devices"
        L_0x0078:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x007c:
            java.lang.String r1 = r2.id
            r0 = r22
            X.2z0 r27 = X.AnonymousClass2z0.A05(r0, r1, r3)
            goto L_0x0093
        L_0x0085:
            int r1 = r2.editVersion
            r0 = 8
            boolean r1 = X.AnonymousClass001.A1X(r1, r0)
            java.lang.String r0 = r2.id
            X.2z0 r27 = X.AnonymousClass2z0.A05(r15, r0, r1)
        L_0x0093:
            X.8qC r6 = r2.A11
            X.2qB r5 = r2.A0W
            X.3Lp r4 = r2.A0T
            byte r3 = r2.messageType
            java.util.HashSet r1 = r2.targetDeviceRawJids
            X.2cY r0 = new X.2cY
            r7 = r0
            r8 = r4
            r9 = r5
            r10 = r30
            r11 = r27
            r12 = r6
            r13 = r1
            r14 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r2.A0h = r0
            X.1EU r4 = r2.A0q
            X.1VX r3 = r2.A0a
            if (r4 == 0) goto L_0x01cf
            int r1 = r4.bitField1_
            r0 = r1 & 16
            if (r0 != 0) goto L_0x00d2
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            if (r0 != 0) goto L_0x00d2
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x00d2
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x01be
            X.1Cn r0 = r4.pollUpdateMessage_
            if (r0 != 0) goto L_0x00cc
            X.1Cn r0 = X.C21621Cn.DEFAULT_INSTANCE
        L_0x00cc:
            int r0 = r0.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x01be
        L_0x00d2:
            X.33f r1 = r2.A0X
            X.1mH r3 = r1.A08(r11)
            if (r3 != 0) goto L_0x01f5
            byte r5 = r2.messageType
            r0 = 58
            if (r5 == r0) goto L_0x00e8
            r0 = 69
            if (r5 == r0) goto L_0x00e8
            r0 = 77
            if (r5 != r0) goto L_0x01f5
        L_0x00e8:
            X.2YF r4 = r2.A0b
            long r0 = r2.messageSendStartTime
            X.34x r3 = r4.A00(r11, r5, r0)
        L_0x00f0:
            if (r3 == 0) goto L_0x0120
            X.1VX r4 = r2.A0a
            r1 = 5623(0x15f7, float:7.88E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r4.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0120
            X.2z0 r0 = r3.A1J
            X.4uZ r1 = r0.A00
            boolean r0 = X.C627336j.A0L(r1)
            if (r0 == 0) goto L_0x0120
            X.2ss r0 = r2.A0O
            X.31A r0 = X.C56982ss.A00(r0, r1)
            if (r0 == 0) goto L_0x0114
            X.21b r0 = r0.A0Z
            r3.A0N = r0
        L_0x0114:
            X.21b r0 = r3.A0N
            if (r0 != 0) goto L_0x0120
            X.2Y0 r0 = r2.A0M
            X.21b r0 = r0.A00(r1)
            r3.A0N = r0
        L_0x0120:
            r2.A0r = r3
            X.2MM r4 = r2.A0x
            r1 = r10
            boolean r0 = r10 instanceof X.C27981fH
            if (r0 != 0) goto L_0x0137
            boolean r0 = r10 instanceof X.C135136kB
            if (r0 == 0) goto L_0x01bb
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1
            com.whatsapp.jid.UserJid r1 = r1.userJid
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.LidUserJid"
            X.C162457s7.A0K(r1, r0)
        L_0x0137:
            X.1fH r1 = (X.C27981fH) r1
        L_0x0139:
            r38 = 0
            if (r1 == 0) goto L_0x014b
            if (r3 == 0) goto L_0x01a4
            byte r5 = r3.A1I
            r0 = 73
            if (r5 == r0) goto L_0x014b
            X.21b r3 = r3.A0N
            X.21b r0 = X.C371321b.USERNAME
            if (r3 != r0) goto L_0x01a4
        L_0x014b:
            X.2aI r4 = r2.A0y
            X.34x r3 = r2.A0r
            java.lang.String r50 = r4.A00(r10, r3, r11)
            X.1EU r0 = r2.A0q
            int r0 = r0.bitField0_
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 != 0) goto L_0x0227
            X.34x r0 = r2.A0r
            if (r0 != 0) goto L_0x0227
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "SendE2EMessageJob/e2e message was deleted from message store"
            r0 = r32
            X.C18260x0.A0s(r1, r0, r3)
            X.1EU r1 = r2.A0q
            int r0 = r1.bitField1_
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0025
            X.1CA r1 = r1.keepInChatMessage_
            if (r1 != 0) goto L_0x017a
            X.1CA r1 = X.AnonymousClass1CA.DEFAULT_INSTANCE
            if (r1 == 0) goto L_0x018e
        L_0x017a:
            int r0 = r1.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x01a2
            int r0 = r1.keepType_
            X.23B r1 = X.AnonymousClass23B.A00(r0)
            if (r1 != 0) goto L_0x018a
            X.23B r1 = X.AnonymousClass23B.UNKNOWN
        L_0x018a:
            X.23B r0 = X.AnonymousClass23B.UNDO_KEEP_FOR_ALL
            if (r1 != r0) goto L_0x01a2
        L_0x018e:
            r4 = 1
        L_0x018f:
            X.2qk r3 = r2.A0B
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "isUnkeep? "
            java.lang.String r2 = X.AnonymousClass000.A0b(r0, r1, r4)
            java.lang.String r1 = "SendE2EMessageJob/unkeep-failed-msg-deleted"
            r0 = 0
            r3.A0A(r1, r0, r2)
            return
        L_0x01a2:
            r4 = 0
            goto L_0x018f
        L_0x01a4:
            boolean r0 = r11.A02
            if (r0 == 0) goto L_0x014b
            X.311 r0 = r4.A01
            java.lang.Boolean r0 = r0.A01(r1)
            boolean r0 = X.AnonymousClass0x9.A1Q(r0)
            if (r0 != 0) goto L_0x014b
            X.2sM r0 = r4.A00
            com.whatsapp.jid.PhoneUserJid r38 = r0.A02(r1)
            goto L_0x014b
        L_0x01bb:
            r1 = 0
            goto L_0x0139
        L_0x01be:
            r0 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x01cf
            r1 = 4164(0x1044, float:5.835E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r3.A0Y(r0, r1)
            if (r0 == 0) goto L_0x01cf
            goto L_0x00d2
        L_0x01cf:
            X.2qz r1 = r2.A0w
            X.34x r3 = r1.A05(r11)
            if (r3 == 0) goto L_0x00d2
            boolean r0 = X.C624134x.A0g(r3)
            if (r0 == 0) goto L_0x01f5
            X.2pu r0 = r3.A0t()
            if (r0 != 0) goto L_0x01f5
            java.lang.String r0 = "SendE2EMessageJob/comment missing parent info/loading"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2oz r5 = r2.A0c
            r4 = 0
            X.3d7 r1 = X.C72063d7.A00
            X.2kE r0 = new X.2kE
            r0.<init>(r1, r4)
            r5.A00(r0, r3)
        L_0x01f5:
            boolean r0 = r3 instanceof X.C30531mb
            if (r0 == 0) goto L_0x00f0
            java.lang.String r0 = "SendE2EMessageJob/getFMessage/retrying an original message that was edited"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2qj r0 = r2.A0Q
            X.1mb r3 = (X.C30531mb) r3
            X.2qz r0 = r0.A0Z
            X.34x r1 = X.C30331mH.A01(r3, r0)
            if (r1 == 0) goto L_0x0220
            X.2z0 r0 = r3.A1v()
            if (r0 == 0) goto L_0x0220
            X.4B9 r1 = (X.AnonymousClass4B9) r1
            X.34x r3 = r1.Az3(r0)
            r0 = 131072(0x20000, float:1.83671E-40)
            r3.A1C(r0)
        L_0x021b:
            r0 = 1
            r2.A17 = r0
            goto L_0x00f0
        L_0x0220:
            java.lang.String r0 = "EditMessageManager/getOriginalMessage invalid current edit message"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r3 = 0
            goto L_0x021b
        L_0x0227:
            X.2sH r0 = r2.A0I
            long r4 = r0.A0H()
            long r0 = r2.expireTimeMs
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 < 0) goto L_0x0267
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "SendE2EMessageJob/e2e message send job expired"
            r0 = r32
            X.C18260x0.A0s(r1, r0, r3)
            X.34x r0 = r2.A0r
            if (r0 == 0) goto L_0x0025
            boolean r15 = r2.A0D()
            X.36E r3 = r2.A0E
            X.34x r4 = r2.A0r
            int r8 = r4.A0B
            X.2cY r0 = r2.A0h
            java.util.Collection r0 = r0.A00()
            int r9 = r0.size()
            r13 = r15 ^ 1
            boolean r0 = r2.A18
            r6 = 5
            r7 = 1
            r10 = 0
            r5 = 0
            r12 = r10
            r14 = r10
            r11 = r10
            r16 = r0
            r3.A0N(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0267:
            X.34x r3 = r2.A0r
            if (r3 == 0) goto L_0x0283
            X.2sH r0 = r2.A0I
            long r0 = r0.A0H()
            boolean r0 = X.C627636p.A0u(r3, r0)
            if (r0 == 0) goto L_0x0283
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "SendE2EMessageJob/e2e message is ephemerally expired"
        L_0x027d:
            r0 = r32
            X.C18260x0.A0s(r1, r0, r2)
            return
        L_0x0283:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "SendE2EMessageJob/running e2e message send job"
            r0 = r32
            X.C18260x0.A0s(r1, r0, r3)
            int r1 = r2.retryCount
            r0 = 4
            if (r1 <= r0) goto L_0x029b
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "SendE2EMessageJob/aborting e2e message send job due to high retry count"
            goto L_0x0020
        L_0x029b:
            X.2cY r0 = r2.A0h
            java.util.Collection r31 = r0.A00()
            boolean r0 = r2.A0C()
            if (r0 == 0) goto L_0x02b5
            boolean r0 = r31.isEmpty()
            if (r0 == 0) goto L_0x02b5
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "SendE2EMessageJob/aborting e2e message send job due to empty target devices"
            goto L_0x0020
        L_0x02b5:
            X.2sr r1 = r2.A0D
            com.whatsapp.jid.DeviceJid r0 = com.whatsapp.jid.DeviceJid.of(r15)
            if (r0 == 0) goto L_0x02d1
            boolean r0 = X.C56972sr.A09(r1, r0)
            if (r0 == 0) goto L_0x02d1
            boolean r0 = r31.isEmpty()
            if (r0 == 0) goto L_0x02d1
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "SendE2EMessageJob/aborting e2e message send job due to empty deviceEncryptedMessages for self-thread"
            goto L_0x0020
        L_0x02d1:
            boolean r0 = X.C57372tX.A01(r15)
            r1 = 0
            if (r0 == 0) goto L_0x030d
            r0 = r31
            X.C162457s7.A0J(r0, r1)
            r0 = 3
            X.4KE r3 = new X.4KE
            r3.<init>(r0)
            r0 = r31
            boolean r0 = X.AnonymousClass367.A02(r3, r0)
            if (r0 == 0) goto L_0x030d
            X.2qk r3 = r2.A0B
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "jid_type_"
            r2.append(r0)
            int r0 = r15.getType()
            r2.append(r0)
            java.lang.String r0 = "_message_send"
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r2)
            java.lang.String r0 = "unsupp-hosted-op"
            r3.A0A(r0, r1, r2)
            java.lang.String r0 = "SendE2EMessageJob/unsupp-hosted-op: unexpected leak for host device"
            goto L_0x0078
        L_0x030d:
            boolean r0 = r2.A15
            if (r0 == 0) goto L_0x031e
            X.36E r3 = r2.A0E
            java.lang.String r0 = r2.id
            int r1 = r0.hashCode()
            r0 = 8
            r3.A0C(r1, r0)
        L_0x031e:
            X.36E r1 = r2.A0E
            java.lang.String r0 = r2.id
            int r5 = r0.hashCode()
            X.34x r0 = r2.A0r
            if (r0 == 0) goto L_0x04e1
            byte r4 = r0.A1I
        L_0x032c:
            r3 = 7
            boolean r0 = r1.A0d
            if (r0 == 0) goto L_0x0337
            X.30L r1 = r1.A0O
            r0 = -1
            r1.A05(r5, r3, r0, r4)
        L_0x0337:
            r4 = r10
            r5 = r22
            java.lang.String r0 = r11.A01
            r45 = r0
            int r0 = r2.editVersion
            if (r0 == 0) goto L_0x04de
            java.lang.String r3 = java.lang.Integer.toString(r0)
        L_0x0346:
            X.8qC r0 = r2.A11
            r0.get()
            int r1 = r2.retryCount
            r0 = 1
            X.C162457s7.A0J(r15, r0)
            if (r1 <= 0) goto L_0x04db
            if (r22 == 0) goto L_0x035b
            boolean r0 = X.C155477ey.A00(r15)
            if (r0 != 0) goto L_0x0367
        L_0x035b:
            if (r20 == 0) goto L_0x04db
            r0 = r20
            com.whatsapp.jid.UserJid r0 = r0.userJid
            boolean r0 = X.C155477ey.A00(r0)
            if (r0 == 0) goto L_0x04db
        L_0x0367:
            r1 = 1
        L_0x0368:
            java.lang.String r0 = "message"
            if (r1 == 0) goto L_0x04c7
            X.4uZ r1 = r11.A00
            boolean r1 = X.C627336j.A0K(r1)
            if (r1 == 0) goto L_0x0377
            r5 = r10
            r4 = r20
        L_0x0377:
            X.2i8 r1 = X.C50412i8.A00(r5)
            r1.A05 = r0
            r0 = r45
            r1.A07 = r0
            r1.A06 = r3
            r1.A01 = r4
        L_0x0385:
            X.39T r29 = r1.A01()
            X.1VX r0 = r2.A0a
            r39 = r0
            X.2qk r0 = r2.A0B
            r37 = r0
            X.2sr r0 = r2.A0D
            r36 = r0
            X.2pW r0 = r2.A0d
            r35 = r0
            X.36E r0 = r2.A0E
            r34 = r0
            X.2fm r0 = r2.A0K
            r33 = r0
            X.8qC r0 = r2.A11
            r28 = r0
            X.2qz r0 = r2.A0w
            r26 = r0
            X.34g r0 = r2.A0g
            r25 = r0
            X.33n r0 = r2.A0J
            r24 = r0
            X.33Z r0 = r2.A0Y
            r23 = r0
            X.2GF r0 = r2.A0Z
            r21 = r0
            X.2sj r0 = r2.A0S
            r19 = r0
            X.5rC r0 = r2.A06
            r16 = r0
            X.5rC r14 = r2.A08
            X.2cY r13 = r2.A0h
            X.5rC r12 = r2.A07
            java.lang.String r10 = r2.jid
            java.lang.String r9 = r2.recipientRawJid
            X.34x r8 = r2.A0r
            X.1EU r7 = r2.A0q
            byte[] r6 = r2.ephemeralSharedSecret
            java.util.HashMap r5 = r2.broadcastParticipantEphemeralSettings
            X.2eO r4 = r2.A0f
            int r3 = r2.retryCount
            int r1 = r2.editVersion
            boolean r0 = r2.useLidForEncryption
            X.312 r11 = new X.312
            r51 = r11
            r52 = r16
            r53 = r14
            r54 = r12
            r55 = r37
            r56 = r36
            r57 = r34
            r58 = r24
            r59 = r33
            r60 = r19
            r61 = r23
            r62 = r21
            r63 = r39
            r64 = r35
            r65 = r4
            r66 = r25
            r67 = r13
            r68 = r7
            r69 = r8
            r70 = r27
            r71 = r26
            r72 = r28
            r73 = r10
            r74 = r9
            r75 = r32
            r76 = r5
            r77 = r6
            r78 = r3
            r79 = r1
            r80 = r0
            r51.<init>(r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80)
            X.2OO r0 = r2.A0i
            if (r0 == 0) goto L_0x042b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SendE2EMessageJob/reusing encrypted payloads from previous run for job:"
            r3 = r32
            X.C18260x0.A0s(r0, r3, r1)
        L_0x042b:
            X.34x r1 = r2.A0r
            if (r1 == 0) goto L_0x04bf
            boolean r0 = r2.A17
            if (r0 != 0) goto L_0x04bf
            boolean r0 = r1 instanceof X.C30331mH
            if (r0 != 0) goto L_0x04bf
            boolean r0 = r1 instanceof X.AnonymousClass48R
            if (r0 != 0) goto L_0x04bf
            X.3Lv r0 = r2.A0P
            X.2wf r0 = r0.A1S
            int r75 = r0.A01(r1)
            X.3Lv r6 = r2.A0P
            X.34x r5 = r2.A0r
            int r4 = r75 + 1
            r5.A1d = r4
            X.2m9 r3 = r6.A0O
            r1 = 40
            X.3ca r0 = new X.3ca
            r0.<init>((java.lang.Object) r5, (java.lang.Object) r6, (int) r4, (int) r1)
            r1 = 24
            r3.A01(r0, r1)
        L_0x0459:
            X.1VX r8 = r2.A0a
            X.2sr r7 = r2.A0D
            X.2ss r6 = r2.A0O
            X.2ba r5 = r2.A0R
            X.34x r1 = r2.A0r
            boolean r0 = r1 instanceof X.C30551md
            if (r0 == 0) goto L_0x046f
            r0 = r1
            X.1md r0 = (X.C30551md) r0
            int r0 = r0.A01
            r3 = 1
            if (r0 == 0) goto L_0x0470
        L_0x046f:
            r3 = 0
        L_0x0470:
            boolean r0 = r1 instanceof X.C30951nU
            if (r0 != 0) goto L_0x0476
            if (r3 == 0) goto L_0x049a
        L_0x0476:
            X.2z0 r0 = r1.A1J
            X.4uZ r4 = r0.A00
            boolean r0 = r4 instanceof X.C28011fL
            if (r0 == 0) goto L_0x049a
            X.1fL r4 = (X.C28011fL) r4
            byte r3 = r1.A1I
            r1 = 3069(0xbfd, float:4.3E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r8.A0Y(r0, r1)
            if (r0 == 0) goto L_0x049a
            boolean r0 = r6.A0N(r4)
            if (r0 == 0) goto L_0x049a
            r0 = 15
            if (r3 == r0) goto L_0x04b0
            r0 = 68
            if (r3 == r0) goto L_0x04b0
        L_0x049a:
            boolean r0 = r2.useOneOneEncryptionOnPHashMismatch
            if (r0 == 0) goto L_0x0536
            X.5rC r0 = r2.A08
            boolean r1 = r0.A07()
            if (r1 == 0) goto L_0x04e5
            r0.A04()
            java.lang.String r0 = "isPremiumMessageBroadcast"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x04b0:
            X.33k r0 = r5.A00(r4)
            if (r0 == 0) goto L_0x049a
            boolean r0 = r0.A0P(r7)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0516
            goto L_0x049a
        L_0x04bf:
            java.lang.String r0 = "SendE2EMessageJob/onRun: Not saving to count store. FMessage is null or doesn't support counter."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r75 = 0
            goto L_0x0459
        L_0x04c7:
            X.2i8 r1 = X.C50412i8.A00(r30)
            r1.A05 = r0
            r0 = r45
            r1.A07 = r0
            r0 = r20
            r1.A01 = r0
            r1.A03 = r5
            r1.A06 = r3
            goto L_0x0385
        L_0x04db:
            r1 = 0
            goto L_0x0368
        L_0x04de:
            r3 = 0
            goto L_0x0346
        L_0x04e1:
            byte r4 = r2.messageType
            goto L_0x032c
        L_0x04e5:
            boolean r0 = r15 instanceof X.C28011fL
            if (r0 == 0) goto L_0x0536
            java.lang.String r0 = r2.participant
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0536
            boolean r0 = r2.A0C()
            if (r0 != 0) goto L_0x0516
            r4 = r15
            X.1fL r4 = (X.C28011fL) r4
            boolean r3 = r2.useParticipantUserHash
            X.2sj r1 = r2.A0S
            boolean r0 = r2.useLidForEncryption
            X.33k r1 = X.C56892sj.A01(r1, r4)
            if (r3 == 0) goto L_0x0528
            if (r0 == 0) goto L_0x0523
            java.lang.String r1 = r1.A0A()
        L_0x050c:
            java.lang.String r0 = r2.groupParticipantUserHash
        L_0x050e:
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0536
        L_0x0516:
            r16 = 1
        L_0x0518:
            boolean r0 = r15 instanceof X.C28011fL
            if (r0 == 0) goto L_0x0520
            r19 = 1
            if (r20 == 0) goto L_0x0539
        L_0x0520:
            r19 = 0
            goto L_0x0539
        L_0x0523:
            java.lang.String r1 = r1.A0C()
            goto L_0x050c
        L_0x0528:
            if (r0 == 0) goto L_0x0531
            java.lang.String r1 = r1.A09()
        L_0x052e:
            java.lang.String r0 = r2.groupParticipantHash
            goto L_0x050e
        L_0x0531:
            java.lang.String r1 = r1.A0B()
            goto L_0x052e
        L_0x0536:
            r16 = 0
            goto L_0x0518
        L_0x0539:
            X.2OO r0 = r2.A0i     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x07fe
            java.util.Map r0 = r0.A02     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r24 = r0
        L_0x0541:
            X.2OO r0 = r2.A0i     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0553
            X.2ON r12 = r0.A00     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x0547:
            java.util.Map r0 = r12.A02     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r26 = r0
            if (r19 == 0) goto L_0x090f
            boolean r0 = r2.includeSenderKeysInMessage     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x090f
            goto L_0x0905
        L_0x0553:
            boolean r1 = r2.includeSenderKeysInMessage     // Catch:{ OutOfMemoryError -> 0x13f7 }
            com.whatsapp.jid.Jid r12 = r11.A0F     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r0 = r12 instanceof X.C28011fL     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x055e
            X.1fL r12 = (X.C28011fL) r12     // Catch:{ OutOfMemoryError -> 0x13f7 }
            goto L_0x055f
        L_0x055e:
            r12 = 0
        L_0x055f:
            if (r16 == 0) goto L_0x0670
            X.C626936e.A06(r12)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.util.HashMap r8 = X.AnonymousClass001.A0t()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r12 != 0) goto L_0x056b
            goto L_0x0572
        L_0x056b:
            X.2cY r0 = r11.A0I     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.util.Collection r0 = r0.A00()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            goto L_0x0573
        L_0x0572:
            r0 = 0
        L_0x0573:
            r7 = 0
            if (r0 != 0) goto L_0x058b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r0 = "sende2emessagejob/unable to retrieve participants for one time message"
            r1.append(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r0 = r11.A0O     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.C18260x0.A1M(r1, r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.2ON r12 = new X.2ON     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r12.<init>(r7, r8, r7)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            goto L_0x0547
        L_0x058b:
            boolean r1 = r12 instanceof X.AnonymousClass1fI     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r1 == 0) goto L_0x059f
            byte[] r1 = r11.A0U     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r1 == 0) goto L_0x059f
            java.util.Map r1 = r11.A0R     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r1 == 0) goto L_0x059f
            X.1fI r12 = (X.AnonymousClass1fI) r12     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.C626936e.A06(r12)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r11.A0A(r12, r0, r8)     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x059f:
            java.lang.String r1 = "E2eMessageEncryptor/getParticipantsDataForForceOneOneEncryption"
            X.33M r10 = X.AnonymousClass33M.A01(r1)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r10.A09()     // Catch:{ all -> 0x0a92 }
            X.2qk r3 = r11.A05     // Catch:{ all -> 0x0a92 }
            int r1 = r0.size()     // Catch:{ all -> 0x0a92 }
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ all -> 0x0a92 }
            r4.<init>(r1)     // Catch:{ all -> 0x0a92 }
            X.C627336j.A0F(r3, r0, r4)     // Catch:{ all -> 0x0a92 }
            X.33Z r3 = r11.A0B     // Catch:{ all -> 0x0a92 }
            boolean r1 = r11.A0S     // Catch:{ all -> 0x0a92 }
            java.util.Map r9 = r3.A08(r4, r1)     // Catch:{ all -> 0x0a92 }
            java.util.TreeMap r6 = new java.util.TreeMap     // Catch:{ all -> 0x0a92 }
            r6.<init>()     // Catch:{ all -> 0x0a92 }
            X.5rC r1 = r11.A04     // Catch:{ all -> 0x0a92 }
            boolean r3 = r1.A07()     // Catch:{ all -> 0x0a92 }
            if (r3 == 0) goto L_0x05d5
            r1.A04()     // Catch:{ all -> 0x0a92 }
            java.lang.String r0 = "isPremiumMessageBroadcast"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)     // Catch:{ all -> 0x0a92 }
            throw r0     // Catch:{ all -> 0x0a92 }
        L_0x05d5:
            r0.size()     // Catch:{ all -> 0x0a92 }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ all -> 0x0a92 }
        L_0x05dc:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x0a92 }
            if (r0 == 0) goto L_0x063c
            com.whatsapp.jid.DeviceJid r5 = X.AnonymousClass0x7.A0R(r14)     // Catch:{ all -> 0x0a92 }
            X.2sr r0 = r11.A06     // Catch:{ all -> 0x0a92 }
            boolean r0 = r0.A0c(r5)     // Catch:{ all -> 0x0a92 }
            if (r0 != 0) goto L_0x05dc
            X.34g r12 = r11.A0H     // Catch:{ all -> 0x0a92 }
            X.2z0 r4 = r11.A0L     // Catch:{ all -> 0x0a92 }
            X.1EU r3 = r11.A0J     // Catch:{ all -> 0x0a92 }
            X.34x r1 = r11.A0K     // Catch:{ all -> 0x0a92 }
            java.lang.String r0 = r11.A0P     // Catch:{ all -> 0x0a92 }
            boolean r13 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0a92 }
            if (r13 == 0) goto L_0x0600
            java.lang.String r0 = r11.A0Q     // Catch:{ all -> 0x0a92 }
        L_0x0600:
            r39 = r12
            r40 = r5
            r41 = r3
            r42 = r1
            r43 = r4
            r44 = r0
            X.1EU r4 = r39.A04(r40, r41, r42, r43, r44)     // Catch:{ all -> 0x0a92 }
            com.whatsapp.jid.UserJid r0 = r5.userJid     // Catch:{ all -> 0x0a92 }
            java.lang.Object r0 = r9.get(r0)     // Catch:{ all -> 0x0a92 }
            X.2Ss r0 = (X.C43592Ss) r0     // Catch:{ all -> 0x0a92 }
            if (r0 == 0) goto L_0x061e
            X.1EU r4 = X.C33061sN.A00(r4, r0)     // Catch:{ all -> 0x0a92 }
        L_0x061e:
            X.1VX r3 = r11.A0D     // Catch:{ all -> 0x0a92 }
            r1 = 1723(0x6bb, float:2.414E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ all -> 0x0a92 }
            int r3 = r3.A0O(r0, r1)     // Catch:{ all -> 0x0a92 }
            r0 = -1
            if (r3 == r0) goto L_0x0638
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0a92 }
            java.lang.String r0 = "E2eMessageEncryptor/createCommonEncryptedMessageForIndividual/messagePayloadAdditionalBytes"
            X.C18260x0.A0w(r0, r1, r3)     // Catch:{ all -> 0x0a92 }
            X.1EU r4 = X.C622434g.A00(r4, r3)     // Catch:{ all -> 0x0a92 }
        L_0x0638:
            r6.put(r5, r4)     // Catch:{ all -> 0x0a92 }
            goto L_0x05dc
        L_0x063c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0a92 }
            java.lang.String r0 = "e2e messages created: "
            int r0 = X.AnonymousClass0x7.A0A(r0, r1, r6)     // Catch:{ all -> 0x0a92 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)     // Catch:{ all -> 0x0a92 }
            r10.A08(r0)     // Catch:{ all -> 0x0a92 }
            java.util.Map r1 = r11.A09(r6)     // Catch:{ all -> 0x0a92 }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0a92 }
            java.lang.String r0 = "messages encrypted: "
            r3.append(r0)     // Catch:{ all -> 0x0a92 }
            int r0 = r1.size()     // Catch:{ all -> 0x0a92 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r3, r0)     // Catch:{ all -> 0x0a92 }
            r10.A08(r0)     // Catch:{ all -> 0x0a92 }
            r10.A07()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.2ON r12 = new X.2ON     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r12.<init>(r7, r8, r1)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            goto L_0x0547
        L_0x0670:
            if (r19 == 0) goto L_0x07e3
            if (r1 == 0) goto L_0x07e3
            X.C626936e.A06(r12)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.util.HashMap r10 = X.AnonymousClass001.A0t()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r12 != 0) goto L_0x067e
            goto L_0x0685
        L_0x067e:
            X.2cY r0 = r11.A0I     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.util.Collection r9 = r0.A00()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            goto L_0x0686
        L_0x0685:
            r9 = 0
        L_0x0686:
            r8 = 0
            if (r9 != 0) goto L_0x069f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r0 = "sende2emessagejob/unable to retrieve participants in group at time of message"
            r1.append(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r0 = r11.A0O     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.C18260x0.A1M(r1, r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.2ON r12 = new X.2ON     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r12.<init>(r8, r10, r8)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            goto L_0x0547
        L_0x069f:
            boolean r0 = r12 instanceof X.AnonymousClass1fI     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r33 = r0
            if (r0 == 0) goto L_0x06b6
            byte[] r0 = r11.A0U     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x06b6
            java.util.Map r0 = r11.A0R     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x06b6
            r0 = r12
            X.1fI r0 = (X.AnonymousClass1fI) r0     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.C626936e.A06(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r11.A0A(r0, r9, r10)     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x06b6:
            X.2sj r0 = r11.A0A     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.33k r0 = X.C56892sj.A01(r0, r12)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.2sr r7 = r11.A06     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r4 = r11.A0S     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.util.Set r6 = r0.A0G(r7, r4)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r0 = r6.isEmpty()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x06cd
            r6.retainAll(r9)     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x06cd:
            java.util.TreeMap r5 = new java.util.TreeMap     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r5.<init>()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r0 = "E2eMessageEncryptor/getParticipantsData"
            X.33M r28 = X.AnonymousClass33M.A01(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r28.A09()     // Catch:{ all -> 0x0a98 }
            X.2qk r3 = r11.A05     // Catch:{ all -> 0x0a98 }
            int r1 = r6.size()     // Catch:{ all -> 0x0a98 }
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0a98 }
            r0.<init>(r1)     // Catch:{ all -> 0x0a98 }
            X.C627336j.A0F(r3, r6, r0)     // Catch:{ all -> 0x0a98 }
            X.33Z r1 = r11.A0B     // Catch:{ all -> 0x0a98 }
            java.util.Map r13 = r1.A08(r0, r4)     // Catch:{ all -> 0x0a98 }
            java.util.Iterator r26 = r9.iterator()     // Catch:{ all -> 0x0a98 }
            r1 = r8
            r4 = r8
            r25 = r8
        L_0x06f7:
            r0 = r8
            boolean r3 = r26.hasNext()     // Catch:{ all -> 0x0a98 }
            if (r3 == 0) goto L_0x0768
            com.whatsapp.jid.DeviceJid r3 = X.AnonymousClass0x7.A0R(r26)     // Catch:{ all -> 0x0a98 }
            boolean r23 = r6.contains(r3)     // Catch:{ all -> 0x0a98 }
            if (r33 == 0) goto L_0x0710
            boolean r14 = r7.A0b(r3)     // Catch:{ all -> 0x0a98 }
            r21 = 1
            if (r14 != 0) goto L_0x0712
        L_0x0710:
            r21 = 0
        L_0x0712:
            if (r23 == 0) goto L_0x074f
            if (r1 != 0) goto L_0x0728
            boolean r1 = r11.A0T     // Catch:{ all -> 0x0a98 }
            if (r1 == 0) goto L_0x071f
            X.2KL r1 = r11.A04()     // Catch:{ all -> 0x0a98 }
            goto L_0x0728
        L_0x071f:
            X.2fm r14 = r11.A09     // Catch:{ all -> 0x0a98 }
            r1 = 7
            java.lang.Object r1 = X.C48972fm.A00(r14, r11, r1)     // Catch:{ all -> 0x0a98 }
            X.2KL r1 = (X.AnonymousClass2KL) r1     // Catch:{ all -> 0x0a98 }
        L_0x0728:
            if (r21 == 0) goto L_0x073f
            if (r4 != 0) goto L_0x0730
            java.lang.String r4 = r11.A07(r9)     // Catch:{ all -> 0x0a98 }
        L_0x0730:
            if (r8 != 0) goto L_0x0761
            com.whatsapp.jid.UserJid r0 = r3.userJid     // Catch:{ all -> 0x0a98 }
            java.lang.Object r0 = r13.get(r0)     // Catch:{ all -> 0x0a98 }
            X.2Ss r0 = (X.C43592Ss) r0     // Catch:{ all -> 0x0a98 }
            X.1EU r0 = r11.A05(r1, r0, r4)     // Catch:{ all -> 0x0a98 }
            goto L_0x0761
        L_0x073f:
            com.whatsapp.jid.UserJid r8 = r3.userJid     // Catch:{ all -> 0x0a98 }
            java.lang.Object r8 = r13.get(r8)     // Catch:{ all -> 0x0a98 }
            X.2Ss r8 = (X.C43592Ss) r8     // Catch:{ all -> 0x0a98 }
            r14 = 0
            X.1EU r14 = r11.A05(r1, r8, r14)     // Catch:{ all -> 0x0a98 }
            r8 = r0
            r0 = r14
            goto L_0x0762
        L_0x074f:
            if (r21 == 0) goto L_0x06f7
            if (r4 != 0) goto L_0x0757
            java.lang.String r4 = r11.A07(r9)     // Catch:{ all -> 0x0a98 }
        L_0x0757:
            if (r25 != 0) goto L_0x075e
            r0 = 0
            X.1EU r25 = X.C622434g.A02(r0, r0, r4)     // Catch:{ all -> 0x0a98 }
        L_0x075e:
            r0 = r25
            goto L_0x0762
        L_0x0761:
            r8 = r0
        L_0x0762:
            if (r0 == 0) goto L_0x06f7
            r5.put(r3, r0)     // Catch:{ all -> 0x0a98 }
            goto L_0x06f7
        L_0x0768:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0a98 }
            java.lang.String r0 = "e2e messages created: "
            int r0 = X.AnonymousClass0x7.A0A(r0, r1, r5)     // Catch:{ all -> 0x0a98 }
            java.lang.String r1 = X.AnonymousClass000.A0h(r1, r0)     // Catch:{ all -> 0x0a98 }
            r0 = r28
            r0.A08(r1)     // Catch:{ all -> 0x0a98 }
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x0a98 }
            if (r0 != 0) goto L_0x0790
            java.util.Map r1 = r11.A09(r5)     // Catch:{ all -> 0x0a98 }
        L_0x0785:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0a98 }
            java.lang.String r0 = "messages encrypted: "
            r3.append(r0)     // Catch:{ all -> 0x0a98 }
            goto L_0x0792
        L_0x0790:
            r1 = 0
            goto L_0x0785
        L_0x0792:
            if (r1 == 0) goto L_0x0795
            goto L_0x0797
        L_0x0795:
            r0 = 0
            goto L_0x079b
        L_0x0797:
            int r0 = r1.size()     // Catch:{ all -> 0x0a98 }
        L_0x079b:
            java.lang.String r3 = X.AnonymousClass000.A0h(r3, r0)     // Catch:{ all -> 0x0a98 }
            r0 = r28
            r0.A08(r3)     // Catch:{ all -> 0x0a98 }
            r28.A07()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r0 = r12 instanceof X.AnonymousClass1fS     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x07d6
            java.util.TreeSet r0 = new java.util.TreeSet     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r0.<init>()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.util.Iterator r5 = r9.iterator()     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x07b4:
            boolean r3 = r5.hasNext()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r3 == 0) goto L_0x07d8
            com.whatsapp.jid.DeviceJid r3 = X.AnonymousClass0x7.A0R(r5)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r1 == 0) goto L_0x07c6
            boolean r4 = r1.containsKey(r3)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r4 != 0) goto L_0x07b4
        L_0x07c6:
            com.whatsapp.jid.UserJid r3 = r3.userJid     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r4 = r7.A0a(r3)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r4 != 0) goto L_0x07b4
            com.whatsapp.jid.DeviceJid r3 = r3.getPrimaryDevice()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r0.add(r3)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            goto L_0x07b4
        L_0x07d6:
            r0 = 0
            goto L_0x07dc
        L_0x07d8:
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x07dc:
            X.2ON r12 = new X.2ON     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r12.<init>(r0, r10, r1)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            goto L_0x0547
        L_0x07e3:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r0 = "sende2emessagejob/no need to include participant messages in message"
            r1.append(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r0 = r11.A0O     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.C18260x0.A1J(r1, r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.util.HashMap r1 = X.AnonymousClass001.A0t()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r0 = 0
            X.2ON r12 = new X.2ON     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r12.<init>(r0, r1, r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            goto L_0x0547
        L_0x07fe:
            boolean r0 = r2.multiDeviceFanOut     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0852
            r0 = r30
            boolean r0 = r0 instanceof X.C28011fL     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x0852
            X.2sr r1 = r2.A0D     // Catch:{ OutOfMemoryError -> 0x13f7 }
            com.whatsapp.jid.DeviceJid r0 = com.whatsapp.jid.DeviceJid.of(r15)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0835
            boolean r0 = X.C56972sr.A09(r1, r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0835
            r0 = r31
            java.util.Map r24 = r11.A08(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r0 = r24.isEmpty()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0541
            X.2sr r0 = r2.A0D     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.6kH r1 = X.C56972sr.A02(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.2eO r0 = r2.A0f     // Catch:{ OutOfMemoryError -> 0x13f7 }
            int r0 = r0.A00(r1)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            com.whatsapp.jobqueue.job.E2eMessageEncryptor$EncryptionFailException r3 = new com.whatsapp.jobqueue.job.E2eMessageEncryptor$EncryptionFailException     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r3.<init>(r1, r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            goto L_0x0bb8
        L_0x0835:
            int r0 = r31.size()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r6 = 1
            if (r0 > r6) goto L_0x0858
            boolean r0 = r2.A0C()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x0858
            X.8qC r0 = r2.A11     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.2sS r3 = X.C18320x8.A0I(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            byte r1 = r2.messageType     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r0 = r30
            boolean r0 = r3.A03(r0, r1)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x0858
        L_0x0852:
            java.util.Map r24 = java.util.Collections.emptyMap()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            goto L_0x0541
        L_0x0858:
            com.whatsapp.jid.UserJid r5 = X.AnonymousClass32Y.A05(r15)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r5 == 0) goto L_0x08da
            boolean r10 = X.C627336j.A0M(r5)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r9 = X.C627336j.A0L(r5)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.util.Iterator r8 = r31.iterator()     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x086e:
            boolean r0 = r8.hasNext()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r3 = 0
            if (r0 == 0) goto L_0x08b2
            com.whatsapp.jid.DeviceJid r1 = X.AnonymousClass0x7.A0R(r8)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r10 == 0) goto L_0x0881
            boolean r0 = X.C627336j.A0M(r1)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x0889
        L_0x0881:
            if (r9 == 0) goto L_0x088b
            boolean r0 = X.C627336j.A0L(r1)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x088b
        L_0x0889:
            r7 = 1
            goto L_0x088c
        L_0x088b:
            r7 = 0
        L_0x088c:
            int r0 = r1.getDevice()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r0 = X.AnonymousClass000.A1T(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x08a7
            X.2sr r0 = r2.A0D     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r0 = X.C56972sr.A09(r0, r1)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x08a7
            com.whatsapp.jid.UserJid r0 = r1.userJid     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r0 = r0.equals(r5)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x08a7
            r3 = 1
        L_0x08a7:
            if (r7 == 0) goto L_0x08ab
            if (r3 == 0) goto L_0x086e
        L_0x08ab:
            r4.append(r1)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.C18320x8.A1K(r4)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            goto L_0x086e
        L_0x08b2:
            int r0 = r4.length()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 <= 0) goto L_0x08da
            int r0 = r4.length()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            int r0 = r0 - r6
            r4.setLength(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r0 = "remoteChatJid="
            r1.append(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r1.append(r5)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r0 = "; invalid devices="
            java.lang.String r4 = X.AnonymousClass000.A0P(r4, r0, r1)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.2qk r1 = r2.A0B     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r0 = "InvalidDevicesForMdFanoutMessage"
            r1.A0A(r0, r3, r4)     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x08da:
            r0 = r31
            java.util.Map r24 = r11.A08(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            com.whatsapp.jid.DeviceJid r1 = X.C18320x8.A0O(r15)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r0 = r2.A0C()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x0541
            int r0 = r31.size()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 <= r6) goto L_0x0541
            r0 = r24
            boolean r0 = r0.containsKey(r1)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x0541
            X.2eO r0 = r2.A0f     // Catch:{ OutOfMemoryError -> 0x13f7 }
            int r0 = r0.A00(r1)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            com.whatsapp.jobqueue.job.E2eMessageEncryptor$EncryptionFailException r3 = new com.whatsapp.jobqueue.job.E2eMessageEncryptor$EncryptionFailException     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r3.<init>(r1, r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            goto L_0x0bb8
        L_0x0905:
            if (r26 == 0) goto L_0x090f
            int r78 = r26.size()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r0 = 2
            r2.A00 = r0     // Catch:{ OutOfMemoryError -> 0x13f7 }
            goto L_0x0911
        L_0x090f:
            r78 = 0
        L_0x0911:
            if (r16 == 0) goto L_0x0916
            r0 = 1
            r2.A00 = r0     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x0916:
            boolean r0 = r24.isEmpty()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0933
            if (r16 != 0) goto L_0x0933
            X.2OO r0 = r2.A0i     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0927
            X.2a1 r0 = r0.A01     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r23 = r0
            goto L_0x092f
        L_0x0927:
            r0 = r46
            r1 = r19
            X.2a1 r23 = r11.A06(r0, r1)     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x092f:
            if (r23 != 0) goto L_0x0935
            goto L_0x1381
        L_0x0933:
            r23 = 0
        L_0x0935:
            X.34x r0 = r2.A0r     // Catch:{ OutOfMemoryError -> 0x13f7 }
            com.whatsapp.jid.UserJid r6 = r0.A0o()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r0 = r2.botInvokeRawJid     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r1 = r2.A0D()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            com.whatsapp.jid.UserJid r5 = X.AnonymousClass32Y.A08(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.8qC r4 = r11.A0N     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r4.get()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.34x r3 = r11.A0K     // Catch:{ OutOfMemoryError -> 0x13f7 }
            int r0 = r11.A01     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r5 == 0) goto L_0x0954
            if (r1 != 0) goto L_0x0954
            if (r0 == 0) goto L_0x09bc
        L_0x0954:
            if (r0 <= 0) goto L_0x096b
            if (r22 == 0) goto L_0x095e
            boolean r0 = X.C155477ey.A00(r15)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x09bc
        L_0x095e:
            if (r20 == 0) goto L_0x096b
            r0 = r20
            com.whatsapp.jid.UserJid r0 = r0.userJid     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r0 = X.C155477ey.A00(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x096b
            goto L_0x09bc
        L_0x096b:
            boolean r0 = r3 instanceof X.C30251m9     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0984
            X.4uZ r0 = X.C106405Yw.A03(r15)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r0 = X.C155477ey.A00(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x0984
            boolean r0 = r15 instanceof com.whatsapp.jid.UserJid     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x09bc
            boolean r0 = X.C627336j.A0K(r15)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0984
            goto L_0x09bc
        L_0x0984:
            boolean r1 = r3 instanceof X.C30441mS     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r1 == 0) goto L_0x099f
            boolean r0 = X.C155477ey.A00(r6)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x099f
            boolean r0 = X.C155477ey.A00(r15)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x099f
            boolean r0 = r15 instanceof com.whatsapp.jid.UserJid     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x09bc
            boolean r0 = X.C627336j.A0K(r15)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x099f
            goto L_0x09bc
        L_0x099f:
            if (r3 == 0) goto L_0x09ba
            if (r1 == 0) goto L_0x09ba
            boolean r0 = r3.A1m()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x09ba
            boolean r0 = X.C155477ey.A00(r15)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x09ba
            boolean r0 = r15 instanceof com.whatsapp.jid.UserJid     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x09bc
            boolean r0 = X.C627336j.A0K(r15)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x09ba
            goto L_0x09bc
        L_0x09ba:
            r0 = 0
            goto L_0x09bd
        L_0x09bc:
            r0 = 1
        L_0x09bd:
            r21 = 0
            if (r0 == 0) goto L_0x0a56
            if (r5 != 0) goto L_0x0a44
            r4.get()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r0 = r3 instanceof X.C30251m9     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x09fa
            X.4uZ r0 = X.C106405Yw.A03(r15)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r0 = X.C155477ey.A00(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x09fa
            boolean r0 = r15 instanceof com.whatsapp.jid.UserJid     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x09de
            boolean r0 = X.C627336j.A0K(r15)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x09fa
        L_0x09de:
            r4.get()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r0 = 0
            X.C162457s7.A0J(r3, r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.1m9 r3 = (X.C30251m9) r3     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r3 == 0) goto L_0x0a56
            X.2z0 r1 = r3.A03     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r1 == 0) goto L_0x0a56
            X.2qz r0 = r11.A0M     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.34x r0 = r0.A05(r1)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0a56
            com.whatsapp.jid.UserJid r5 = r0.A0o()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            goto L_0x0a41
        L_0x09fa:
            r4.get()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r1 = r3 instanceof X.C30441mS     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r1 == 0) goto L_0x0a18
            boolean r0 = X.C155477ey.A00(r6)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0a18
            boolean r0 = X.C155477ey.A00(r15)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x0a18
            boolean r0 = r15 instanceof com.whatsapp.jid.UserJid     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x0a40
            boolean r0 = X.C627336j.A0K(r15)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0a18
            goto L_0x0a40
        L_0x0a18:
            r4.get()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r3 == 0) goto L_0x0a56
            if (r1 == 0) goto L_0x0a56
            boolean r0 = r3.A1m()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0a56
            boolean r0 = X.C155477ey.A00(r15)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x0a56
            boolean r0 = r15 instanceof com.whatsapp.jid.UserJid     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x0a35
            boolean r0 = X.C627336j.A0K(r15)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0a56
        L_0x0a35:
            X.2sS r0 = X.C18320x8.A0I(r4)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.util.List r1 = r3.A18     // Catch:{ OutOfMemoryError -> 0x13f7 }
            com.whatsapp.jid.UserJid r5 = r0.A00(r1)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            goto L_0x0a41
        L_0x0a40:
            r5 = r6
        L_0x0a41:
            if (r5 != 0) goto L_0x0a44
            goto L_0x0a56
        L_0x0a44:
            r1 = 0
            com.whatsapp.jid.DeviceJid r0 = r5.getPrimaryDevice()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.2a1 r0 = r11.A06(r0, r1)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0a56
            X.2kS r21 = new X.2kS     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r1 = r21
            r1.<init>(r5, r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x0a56:
            java.lang.Integer r0 = r2.liveLocationDuration     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r48 = 0
            if (r0 == 0) goto L_0x0a7e
            X.2qz r1 = r2.A0w     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r0 = r27
            X.34x r5 = r1.A05(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.1n8 r5 = (X.C30801n8) r5     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r5 == 0) goto L_0x0a7e
            X.2sH r0 = r2.A0I     // Catch:{ OutOfMemoryError -> 0x13f7 }
            long r3 = r0.A0H()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            long r0 = r5.A0K     // Catch:{ OutOfMemoryError -> 0x13f7 }
            int r5 = r5.A00     // Catch:{ OutOfMemoryError -> 0x13f7 }
            long r0 = X.C18280x3.A08(r3, r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            int r3 = (int) r0     // Catch:{ OutOfMemoryError -> 0x13f7 }
            int r5 = r5 - r3
            if (r5 <= 0) goto L_0x0a7e
            java.lang.Integer r48 = java.lang.Integer.valueOf(r5)     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x0a7e:
            int r0 = r2.retryCount     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x0d8f
            X.1EU r0 = r2.A0q     // Catch:{ OutOfMemoryError -> 0x13f7 }
            int r0 = r0.bitField0_     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 != 0) goto L_0x0aae
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x0aae
            goto L_0x0a9e
        L_0x0a92:
            r3 = move-exception
            r10.A07()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            goto L_0x0bb8
        L_0x0a98:
            r3 = move-exception
            r28.A07()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            goto L_0x0bb8
        L_0x0a9e:
            X.34x r1 = r2.A0r     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r1 == 0) goto L_0x0d8f
            int r0 = r1.A05     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 <= 0) goto L_0x0d8f
            java.lang.String r0 = r1.A15     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x0d8f
        L_0x0aae:
            X.9U4 r0 = r2.A0p     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.36F r3 = r0.A0A()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r1 = 0
            r0 = r45
            X.34w r35 = X.AnonymousClass36F.A05(r3, r0, r1)     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x0abb:
            boolean r0 = X.C627336j.A0K(r15)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0d8b
            X.34x r0 = r2.A0r     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0d8b
            int r0 = r0.A05     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.Integer r49 = java.lang.Integer.valueOf(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x0acb:
            X.2rx r1 = r2.A0H     // Catch:{ OutOfMemoryError -> 0x13f7 }
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A05(r30)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.2qS r11 = r1.A01(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r11 == 0) goto L_0x0d87
            boolean r0 = r11.A02()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0d87
            int r5 = r11.A01     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r5 <= 0) goto L_0x0d87
            int r4 = r11.A00     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r4 <= 0) goto L_0x0d87
            long r0 = r11.A04     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r6 = 0
            int r3 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x0d87
            X.3ZC r25 = new X.3ZC     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r3 = r25
            r3.<init>((int) r5, (long) r0, (int) r4)     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x0af4:
            X.34x r0 = r2.A0r     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0d83
            int r0 = r0.A0B     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r28 = r0
            X.2sH r0 = r2.A0I     // Catch:{ OutOfMemoryError -> 0x13f7 }
            long r62 = android.os.SystemClock.uptimeMillis()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            long r64 = r0.A0H()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            long r0 = r2.A03     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r4 = 0
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0b4f
            X.36E r0 = r2.A0E     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r33 = r0
            X.34x r14 = r2.A0r     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r74 = 8
            int r13 = r2.retryCount     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r10 = r2.A18     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r9 = r2.A15     // Catch:{ OutOfMemoryError -> 0x13f7 }
            int r8 = r2.A01     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r7 = r2.A14     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r91 = r2.A0D()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r79 = 0
            long r3 = r2.A03     // Catch:{ OutOfMemoryError -> 0x13f7 }
            long r0 = r2.A04     // Catch:{ OutOfMemoryError -> 0x13f7 }
            long r3 = r3 - r0
            long r0 = r2.A02     // Catch:{ OutOfMemoryError -> 0x13f7 }
            long r5 = r2.messageSendStartTime     // Catch:{ OutOfMemoryError -> 0x13f7 }
            long r0 = r0 - r5
            r86 = r3
            r71 = r33
            r72 = r14
            r73 = r31
            r76 = r13
            r77 = r8
            r80 = r79
            r81 = r28
            r82 = r3
            r84 = r0
            r88 = r10
            r89 = r9
            r90 = r7
            r92 = r16
            r71.A0O(r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r84, r86, r88, r89, r90, r91, r92)     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x0b4f:
            X.36E r10 = r2.A0E     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.34x r9 = r2.A0r     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r3 = 7
            int r8 = r2.retryCount     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r7 = r2.A18     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r6 = r2.A15     // Catch:{ OutOfMemoryError -> 0x13f7 }
            int r5 = r2.A01     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r4 = r2.A14     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r71 = r2.A0D()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r59 = 0
            long r62 = r62 - r17
            long r0 = r2.messageSendStartTime     // Catch:{ OutOfMemoryError -> 0x13f7 }
            long r64 = r64 - r0
            long r66 = X.C18310x6.A0A(r17)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r51 = r10
            r52 = r9
            r53 = r31
            r54 = r3
            r56 = r8
            r57 = r5
            r60 = r59
            r61 = r28
            r68 = r7
            r69 = r6
            r70 = r4
            r72 = r16
            r55 = r75
            r58 = r78
            r51.A0O(r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r64, r66, r68, r69, r70, r71, r72)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.36E r1 = r2.A0E     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r0 = r2.id     // Catch:{ OutOfMemoryError -> 0x13f7 }
            int r0 = r0.hashCode()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r1.A0C(r0, r3)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r0 = r2.A18     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0ba7
            X.2lf r0 = r2.A0n     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.34x r1 = r2.A0r     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.2z0 r1 = r1.A1J     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.util.Set r0 = r0.A02     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r0.add(r1)     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x0ba7:
            X.5rC r0 = r2.A08     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r1 = r0.A07()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r1 == 0) goto L_0x0bb9
            r0.A04()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r0 = "isPremiumMessageChat"
            java.lang.NullPointerException r3 = X.AnonymousClass001.A0g(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x0bb8:
            throw r3     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x0bb9:
            X.34x r1 = r2.A0r     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r0 = r1 instanceof X.AnonymousClass4BB     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0bdb
            X.4BB r1 = (X.AnonymousClass4BB) r1     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.util.List r10 = r1.BDE()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.34x r1 = r2.A0r     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.1VX r3 = r2.A0a     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r0 = r1 instanceof X.C30461mU     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x0bd1
            boolean r0 = r1 instanceof X.C30601mi     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0bdc
        L_0x0bd1:
            r1 = 6822(0x1aa6, float:9.56E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r0 = r3.A0Y(r0, r1)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x0bdc
        L_0x0bdb:
            r10 = 0
        L_0x0bdc:
            X.34g r3 = r2.A0g     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.1VX r1 = r2.A0a     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.1EU r0 = r2.A0q     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.1EU r0 = X.C57312tR.A01(r1, r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.36Y r1 = r3.A03     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r54 = X.AnonymousClass368.A07(r1, r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.8qC r0 = r2.A13     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.Object r3 = r0.get()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.2Yo r3 = (X.C45072Yo) r3     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.1VX r1 = r3.A00     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r0 = 5717(0x1655, float:8.011E-42)
            X.2vE r13 = X.C58422vE.A02     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r0 = r1.A0Y(r13, r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0c5a
            X.8qC r0 = r3.A01     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.Object r4 = r0.get()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.2ya r4 = (X.C60452ya) r4     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r4 == 0) goto L_0x0c5a
            X.2sr r0 = r2.A0D     // Catch:{ OutOfMemoryError -> 0x13f7 }
            com.whatsapp.jid.PhoneUserJid r3 = X.C56972sr.A04(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.34x r1 = r2.A0r     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.C18260x0.A0O(r1, r3)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r0 = r4.A01(r1)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0c5a
            byte[] r0 = r1.A1a     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0c5a
            byte[] r7 = r4.A02(r3, r3, r1, r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r7 == 0) goto L_0x0c5a
            int r0 = r7.length     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0c5a
            X.2rL r9 = X.C56052rL.A03()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r8 = "reporting"
            X.2rL r6 = X.C56052rL.A04(r8)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r0 = "reporting_token"
            X.2rL r5 = X.C56052rL.A04(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r3 = 32
            r0 = 128(0x80, double:6.32E-322)
            X.C626836d.A0H(r7, r3, r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.C56052rL.A09(r5, r6, r7)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.C56052rL.A07(r6, r9)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.36K r0 = r9.A0F()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.36K r0 = r0.A0l(r8)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0c5a
            if (r10 != 0) goto L_0x0c57
            java.util.LinkedList r10 = X.AnonymousClass0x9.A18()     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x0c57:
            r10.add(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x0c5a:
            X.34x r1 = r2.A0r     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r1 == 0) goto L_0x0da3
            X.2R4 r0 = r2.A0N     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r7 = 0
            X.21b r6 = r1.A0N     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r6 == 0) goto L_0x0cf3
            X.1VX r1 = r0.A02     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r0 = 5623(0x15f7, float:7.88E-42)
            boolean r0 = r1.A0Y(r13, r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0cf3
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r4 = "origin"
            java.lang.String r3 = "meta"
            r9 = 1
            if (r10 == 0) goto L_0x0ce7
            java.util.Iterator r14 = r10.iterator()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r1 = 0
        L_0x0c81:
            boolean r0 = r14.hasNext()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r8 = -1
            if (r0 == 0) goto L_0x0ce4
            X.36K r0 = X.C18310x6.A0Y(r14)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r0 = r0.A00     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r0 = X.C162457s7.A0P(r0, r3)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0c95
            goto L_0x0c98
        L_0x0c95:
            int r1 = r1 + 1
            goto L_0x0c81
        L_0x0c98:
            if (r1 == r8) goto L_0x0ce4
            java.lang.Object r0 = r10.get(r1)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.36K r0 = (X.AnonymousClass36K) r0     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.39V[] r0 = r0.A0u()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0cdf
            X.3ch r8 = new X.3ch     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r8.<init>(r0, r7)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r8)     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x0caf:
            java.lang.String r6 = r6.origin     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.AnonymousClass39V.A03(r4, r6, r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.39V[] r0 = X.C18300x5.A1Z(r0, r7)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.36K r4 = X.AnonymousClass36K.A0I(r3, r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.util.Iterator r8 = r10.iterator()     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x0cc4:
            boolean r0 = r8.hasNext()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0cf5
            java.lang.Object r0 = r8.next()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            int r6 = r7 + 1
            if (r7 >= 0) goto L_0x0cd8
            java.lang.RuntimeException r3 = X.C18280x3.A0X()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            goto L_0x0bb8
        L_0x0cd8:
            if (r7 == r1) goto L_0x0cdd
            r3.add(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x0cdd:
            r7 = r6
            goto L_0x0cc4
        L_0x0cdf:
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            goto L_0x0caf
        L_0x0ce4:
            r5.addAll(r10)     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x0ce7:
            X.39V[] r0 = new X.AnonymousClass39V[r9]     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r1 = r6.origin     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.AnonymousClass39V.A0B(r4, r1, r0, r7)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.36K r4 = X.AnonymousClass36K.A0I(r3, r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            goto L_0x0cf8
        L_0x0cf3:
            r5 = r10
            goto L_0x0cfb
        L_0x0cf5:
            r5.addAll(r3)     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x0cf8:
            r5.add(r4)     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x0cfb:
            X.34x r0 = r2.A0r     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r7 = 0
            X.C162457s7.A0J(r0, r7)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            byte r1 = r0.A1I     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r0 = 73
            if (r1 == r0) goto L_0x0d09
            goto L_0x0d93
        L_0x0d09:
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r1 = "share_pn"
            java.lang.String r0 = "true"
            X.39V r6 = new X.39V     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r6.<init>((java.lang.String) r1, (java.lang.String) r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r4 = "meta"
            r1 = 1
            if (r5 == 0) goto L_0x0d95
            java.util.Iterator r8 = r5.iterator()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r3 = 0
        L_0x0d23:
            boolean r0 = r8.hasNext()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0d95
            X.36K r0 = X.C18310x6.A0Y(r8)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r0 = r0.A00     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r0 = X.C162457s7.A0P(r0, r4)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0d36
            goto L_0x0d39
        L_0x0d36:
            int r3 = r3 + 1
            goto L_0x0d23
        L_0x0d39:
            if (r3 < 0) goto L_0x0d95
            java.lang.Object r0 = r5.get(r3)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.36K r0 = (X.AnonymousClass36K) r0     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.39V[] r1 = r0.A0u()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r1 == 0) goto L_0x0d7e
            X.3ch r0 = new X.3ch     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r0.<init>(r1, r7)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x0d50:
            r0.add(r6)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.39V[] r0 = X.C18300x5.A1Z(r0, r7)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.36K r1 = X.AnonymousClass36K.A0I(r4, r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.util.Iterator r6 = r5.iterator()     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x0d63:
            boolean r4 = r6.hasNext()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r4 == 0) goto L_0x0d9d
            java.lang.Object r4 = r6.next()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            int r5 = r7 + 1
            if (r7 >= 0) goto L_0x0d77
            java.lang.RuntimeException r3 = X.C18280x3.A0X()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            goto L_0x0bb8
        L_0x0d77:
            if (r7 == r3) goto L_0x0d7c
            r0.add(r4)     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x0d7c:
            r7 = r5
            goto L_0x0d63
        L_0x0d7e:
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            goto L_0x0d50
        L_0x0d83:
            r28 = 0
            goto L_0x0ba7
        L_0x0d87:
            r25 = 0
            goto L_0x0af4
        L_0x0d8b:
            r49 = 0
            goto L_0x0acb
        L_0x0d8f:
            r35 = 0
            goto L_0x0abb
        L_0x0d93:
            r10 = r5
            goto L_0x0da3
        L_0x0d95:
            X.39V[] r0 = new X.AnonymousClass39V[r1]     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r0[r7] = r6     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.AnonymousClass36K.A0R(r4, r10, r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            goto L_0x0da3
        L_0x0d9d:
            r10.addAll(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r10.add(r1)     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x0da3:
            X.1EU r4 = r2.A0q     // Catch:{ OutOfMemoryError -> 0x13f7 }
            int r3 = r2.originationFlags     // Catch:{ OutOfMemoryError -> 0x13f7 }
            int r1 = r2.retryCount     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.1VX r0 = r2.A0a     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r39 = r35
            r40 = r0
            r41 = r4
            r42 = r54
            r43 = r3
            r44 = r1
            java.lang.String r53 = X.C33061sN.A02(r39, r40, r41, r42, r43, r44)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r5 = 0
            X.34x r1 = r2.A0r     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r0 = r1 instanceof X.AnonymousClass4DV     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0eb4
            X.4DV r1 = (X.AnonymousClass4DV) r1     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.2hp r0 = r2.A0s     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.315 r1 = r0.A01(r1)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r1 == 0) goto L_0x0eb4
            boolean r0 = r1 instanceof X.AnonymousClass1pP     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0e41
            java.lang.String r0 = "biz"
            X.2rL r5 = X.C56052rL.A04(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.39W r1 = r1.A02     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r6 = 1
            r4 = 0
            java.lang.String r0 = "review_order"
            boolean r0 = X.AnonymousClass39W.A00(r1, r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != r6) goto L_0x0dee
            java.lang.String r1 = "native_flow_name"
            java.lang.String r0 = "order_status"
            X.C56052rL.A0D(r5, r1, r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            goto L_0x0eb4
        L_0x0dee:
            X.1C7 r0 = X.AnonymousClass1C7.DEFAULT_INSTANCE     // Catch:{ OutOfMemoryError -> 0x13f7 }
            int r8 = r0.messageVersion_     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.39P r0 = r1.A03     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r9 = "name"
            if (r0 == 0) goto L_0x0e3e
            java.util.List r0 = r0.A03     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x0dff
            X.3d3 r0 = X.C72023d3.A00     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x0dff:
            boolean r0 = X.C18310x6.A1X(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0e3e
            X.39P r0 = r1.A03     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.C162457s7.A0H(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.util.List r0 = r0.A03     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.395 r0 = (X.AnonymousClass395) r0     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.398 r0 = r0.A01     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r3 = r0.A00     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.C162457s7.A0C(r3)     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x0e19:
            java.lang.String r0 = "interactive"
            X.2rL r1 = X.C56052rL.A04(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r7 = "type"
            java.lang.String r0 = "native_flow"
            X.C56052rL.A0D(r1, r7, r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r7 = "v"
            X.C56052rL.A0B(r1, r7, r8)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.39V[] r6 = new X.AnonymousClass39V[r6]     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.AnonymousClass39V.A0B(r9, r3, r6, r4)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.36K r0 = X.AnonymousClass36K.A0I(r0, r6)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r1.A0H(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.C56052rL.A07(r1, r5)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            goto L_0x0eb4
        L_0x0e3e:
            java.lang.String r3 = ""
            goto L_0x0e19
        L_0x0e41:
            boolean r0 = r1 instanceof X.AnonymousClass1pM     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0e5f
            X.39V[] r3 = X.AnonymousClass0x9.A1V()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r1 = "type"
            java.lang.String r0 = "product_list"
            X.AnonymousClass39V.A04(r1, r0, r3)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r0 = "list"
            X.36K r1 = X.AnonymousClass36K.A0I(r0, r3)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r0 = "biz"
            X.36K r46 = X.AnonymousClass36K.A0F(r1, r0, r5)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            goto L_0x0ebf
        L_0x0e5f:
            boolean r0 = r1 instanceof X.AnonymousClass1pK     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0e9c
            java.lang.String r0 = "biz"
            X.2rL r6 = X.C56052rL.A04(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r0 = "interactive"
            X.2rL r5 = X.C56052rL.A04(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r0 = "type"
            java.lang.String r4 = "native_flow"
            X.C56052rL.A0D(r5, r0, r4)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r1 = "v"
            java.lang.String r0 = "1"
            X.C56052rL.A0D(r5, r1, r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.39V[] r3 = X.AnonymousClass0x9.A1V()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r1 = "name"
            java.lang.String r0 = "mpm"
            X.AnonymousClass39V.A04(r1, r0, r3)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.36K r0 = X.AnonymousClass36K.A0I(r4, r3)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r5.A0H(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.C56052rL.A07(r5, r6)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.36K r46 = r6.A0F()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            goto L_0x0ebf
        L_0x0e9c:
            boolean r0 = r1 instanceof X.C32021pQ     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0ebd
            X.39V[] r3 = X.AnonymousClass0x9.A1V()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r1 = "native_flow_name"
            java.lang.String r0 = "order_details"
            X.AnonymousClass39V.A04(r1, r0, r3)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r0 = "biz"
            X.36K r46 = X.AnonymousClass36K.A0I(r0, r3)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            goto L_0x0ebf
        L_0x0eb4:
            r46 = 0
            if (r5 == 0) goto L_0x0ebf
            X.36K r46 = r5.A0F()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            goto L_0x0ebf
        L_0x0ebd:
            r46 = 0
        L_0x0ebf:
            if (r11 == 0) goto L_0x0ec2
            goto L_0x0ec4
        L_0x0ec2:
            r11 = 0
            goto L_0x0f0e
        L_0x0ec4:
            int r1 = r11.A01     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r0 = 2
            if (r1 != r0) goto L_0x0ec2
            X.34x r0 = r2.A0r     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.2e5 r0 = r0.A0M     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0ec2
            boolean r0 = r0 instanceof X.C22891Qm     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0ec2
            X.1VX r1 = r2.A0a     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r0 = 5776(0x1690, float:8.094E-42)
            boolean r0 = r1.A0Y(r13, r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0ec2
            X.8qC r0 = r2.A12     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.Object r0 = r0.get()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.2bm r0 = (X.C46522bm) r0     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r0 = r0.A00()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x0ef5
            X.1VX r1 = r2.A0a     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r0 = 5877(0x16f5, float:8.235E-42)
            boolean r0 = r1.A0Y(r13, r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x0ec2
        L_0x0ef5:
            X.34x r0 = r2.A0r     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.2e5 r3 = r0.A0M     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.1Qm r3 = (X.C22891Qm) r3     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r0 = 0
            X.C162457s7.A0J(r3, r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r1 = r3.A03     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r0 = "FB_Ads"
            boolean r0 = X.C162457s7.A0P(r1, r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r1 = r3.A02     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.2kR r11 = new X.2kR     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r11.<init>(r0, r1)     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x0f0e:
            r0 = r27
            X.4uZ r0 = r0.A00     // Catch:{ OutOfMemoryError -> 0x13f7 }
            com.whatsapp.jid.UserJid r9 = X.AnonymousClass32Y.A05(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r9 == 0) goto L_0x0f58
            X.33g r0 = r2.A0G     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.56I r0 = r0.A0A     // Catch:{ OutOfMemoryError -> 0x13f7 }
            int r70 = r0.A00(r9)     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x0f20:
            X.34x r0 = r2.A0r     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r58 = 6
            r55 = r2
            r56 = r0
            r57 = r31
            r59 = r75
            r60 = r28
            r61 = r78
            r62 = r16
            r55.A0B(r56, r57, r58, r59, r60, r61, r62)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.31C r0 = r2.A0o     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r79 = r0
            long r0 = r2.originalTimestamp     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r76 = r0
            int r0 = r2.retryCount     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r67 = r0
            X.34x r0 = r2.A0r     // Catch:{ OutOfMemoryError -> 0x13f7 }
            byte r0 = r0.A1I     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r66 = r0
            X.1VX r4 = r2.A0a     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.2ss r5 = r2.A0O     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.2sj r3 = r2.A0S     // Catch:{ OutOfMemoryError -> 0x13f7 }
            com.whatsapp.jid.GroupJid r1 = X.AnonymousClass32V.A01(r15)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r0 = 3803(0xedb, float:5.329E-42)
            boolean r0 = r4.A0Y(r13, r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            goto L_0x0f5b
        L_0x0f58:
            r70 = 0
            goto L_0x0f20
        L_0x0f5b:
            r51 = 0
            if (r0 == 0) goto L_0x0f72
            if (r1 == 0) goto L_0x0f72
            boolean r0 = r5.A0O(r1)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r51 = "pn"
            if (r0 != 0) goto L_0x0f72
            boolean r0 = r3.A0B(r1)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0f72
            java.lang.String r51 = "lid"
        L_0x0f72:
            java.lang.String r0 = r2.groupParticipantHash     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r52 = r0
            java.lang.String r0 = r2.broadcastListName     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r55 = r0
            java.util.Map r0 = r12.A01     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r63 = r0
            java.util.List r0 = r12.A00     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r61 = r0
            int r0 = r2.originationFlags     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r68 = r0
            int r0 = r2.editVersion     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r69 = r0
            r33 = 0
            boolean r73 = r2.A0C()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.34x r1 = r2.A0r     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r0 = r1 instanceof X.C30511mZ     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x0ffc
            boolean r0 = r1 instanceof X.C30501mY     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x0ffc
            boolean r0 = r1 instanceof X.C30521ma     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x0ffc
            boolean r0 = r1 instanceof X.C30571mf     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x0ffc
            boolean r0 = r1 instanceof X.C30591mh     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x0ffc
            boolean r0 = r1 instanceof X.C30561me     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x0ffc
            boolean r0 = r1 instanceof X.C30551md     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x0ffc
            boolean r0 = r1 instanceof X.C30601mi     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x0ffc
            boolean r0 = r1 instanceof X.C30241m8     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x0ffc
            boolean r0 = r1 instanceof X.C30251m9     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x0ffc
            boolean r0 = r1.A1Z     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r18 = r0
        L_0x0fbe:
            boolean r0 = r1 instanceof X.C31901p2     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0ffa
            X.1p2 r1 = (X.C31901p2) r1     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.2Yl r0 = r2.A0t     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.4DW r1 = r0.A00(r1)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r0 = r1 instanceof X.C32031pS     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0ffa
            X.3Tr r1 = (X.C68573Tr) r1     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.39N r0 = r1.A01     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.397 r0 = r0.A01     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x0ffa
            java.lang.String r14 = r0.A00     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x0fd8:
            X.34x r1 = r2.A0r     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.2WW r0 = r2.A0l     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r0 = r0.A00(r1)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x1073
            X.2cY r0 = r2.A0h     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.util.Collection r8 = r0.A00()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.2qk r0 = r2.A0B     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.C627336j.A0F(r0, r8, r6)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            int r4 = r8.size()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r0 = X.AnonymousClass2z0.A0D(r1)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            goto L_0x0fff
        L_0x0ffa:
            r14 = 0
            goto L_0x0fd8
        L_0x0ffc:
            r18 = 1
            goto L_0x0fbe
        L_0x0fff:
            if (r0 == 0) goto L_0x100c
            X.1VX r3 = r2.A0a     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r0 = 3168(0xc60, float:4.44E-42)
            int r0 = r3.A0O(r13, r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r4 <= r0) goto L_0x100c
            goto L_0x1073
        L_0x100c:
            X.5Zz r0 = r2.A0j     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r3 = 0
            X.C162457s7.A0J(r0, r3)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r3 = r1 instanceof X.C30481mW     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r5 = 0
            if (r3 == 0) goto L_0x103c
            java.lang.String r3 = r1.A13()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r4 = r0.A03(r3)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r0 = r1
            X.1mW r0 = (X.C30481mW) r0     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r0 = r0.A07     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x102e
            int r3 = r0.length()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r3 == 0) goto L_0x102e
            r4 = r0
            goto L_0x1030
        L_0x102e:
            if (r4 == 0) goto L_0x103c
        L_0x1030:
            java.lang.String r0 = X.C106685Zz.A01(r4)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r5 = X.AnonymousClass35G.A02(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x103c:
            X.2y0 r4 = r2.A0m     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.1mW r1 = (X.C30481mW) r1     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.2sr r0 = r4.A00     // Catch:{ OutOfMemoryError -> 0x13f7 }
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x104a
            r3 = 0
            goto L_0x104e
        L_0x104a:
            byte[] r3 = r4.A01(r0, r1, r5)     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x104e:
            java.util.HashMap r0 = X.AnonymousClass001.A0t()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.util.Iterator r17 = r6.iterator()     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x1056:
            boolean r6 = r17.hasNext()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r6 == 0) goto L_0x106c
            com.whatsapp.jid.UserJid r7 = X.C18310x6.A0T(r17)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            byte[] r6 = r4.A01(r7, r1, r5)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r6 != 0) goto L_0x1067
            goto L_0x106b
        L_0x1067:
            r0.put(r7, r6)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            goto L_0x1056
        L_0x106b:
            r0 = 0
        L_0x106c:
            if (r3 == 0) goto L_0x1071
            if (r0 == 0) goto L_0x1071
            goto L_0x1076
        L_0x1071:
            r5 = 0
            goto L_0x107b
        L_0x1073:
            r5 = r33
            goto L_0x107b
        L_0x1076:
            X.2fw r5 = new X.2fw     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r5.<init>(r8, r0, r3)     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x107b:
            X.34x r1 = r2.A0r     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.1VX r4 = r2.A0a     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.2z0 r0 = r1.A1J     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.4uZ r3 = r0.A00     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r3 = r3 instanceof X.C135166kE     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r3 == 0) goto L_0x10a9
            boolean r0 = r0.A02     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x10a9
            boolean r0 = X.C627636p.A0l(r1)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x10a9
            r0 = 4905(0x1329, float:6.873E-42)
            boolean r0 = r4.A0Y(r13, r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x10a9
            int r1 = r1.A0E     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r1 == 0) goto L_0x10a6
            r0 = 1
            if (r1 == r0) goto L_0x10ac
            r0 = 2
            if (r1 != r0) goto L_0x10a9
            java.lang.String r59 = "denylist"
            goto L_0x10ae
        L_0x10a6:
            java.lang.String r59 = "contacts"
            goto L_0x10ae
        L_0x10a9:
            r59 = r33
            goto L_0x10ae
        L_0x10ac:
            java.lang.String r59 = "allowlist"
        L_0x10ae:
            X.2rv r3 = r2.A0z     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.34x r0 = r2.A0r     // Catch:{ OutOfMemoryError -> 0x13f7 }
            byte r1 = r0.A1I     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r0 = 88
            r4 = 0
            if (r1 != r0) goto L_0x10cb
            X.4uZ r0 = X.C106405Yw.A03(r30)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x10cb
            int r0 = r3.A00(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x10cb
            r1 = 1
            if (r0 == r1) goto L_0x10cf
            r1 = 2
            if (r0 == r1) goto L_0x10cf
        L_0x10cb:
            if (r21 == 0) goto L_0x10d1
            goto L_0x114e
        L_0x10cf:
            r4 = 1
            goto L_0x10cb
        L_0x10d1:
            if (r4 != 0) goto L_0x1171
            X.8qC r0 = r2.A11     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.2sS r3 = X.C18320x8.A0I(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.34x r0 = r2.A0r     // Catch:{ OutOfMemoryError -> 0x13f7 }
            byte r1 = r0.A1I     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r0 = r30
            boolean r0 = r3.A03(r0, r1)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x1171
            X.34x r0 = r2.A0r     // Catch:{ OutOfMemoryError -> 0x13f7 }
            byte r3 = r0.A1I     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r1 = 87
            if (r3 != r1) goto L_0x10f2
            java.lang.String r60 = "request_welcome"
            goto L_0x1173
        L_0x10f2:
            r60 = 0
            if (r70 == 0) goto L_0x1173
            if (r9 == 0) goto L_0x1173
            boolean r0 = r0 instanceof X.C30481mW     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x1173
            X.33g r0 = r2.A0G     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.5dt r0 = r0.A02(r9)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x1173
            java.util.List r4 = r0.A0P     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.util.List r6 = r0.A0S     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.34x r0 = r2.A0r     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r1 = r0.A13()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r3 = 0
            if (r1 == 0) goto L_0x1173
            int r0 = r1.length()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x1173
            java.util.Iterator r4 = r4.iterator()     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x111b:
            boolean r0 = r4.hasNext()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x1132
            java.lang.Object r0 = r4.next()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.3ZL r0 = (X.AnonymousClass3ZL) r0     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r0 = r0.A01     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r0 = X.C175728Zm.A0S(r1, r0, r3)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x111b
            java.lang.String r60 = "command"
            goto L_0x1173
        L_0x1132:
            java.util.Iterator r3 = r6.iterator()     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x1136:
            boolean r0 = r3.hasNext()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x1173
            java.lang.Object r0 = r3.next()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.2jL r0 = (X.C51142jL) r0     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r0 = r0.A01     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r0 = X.C162457s7.A0P(r0, r1)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x1136
            java.lang.String r60 = "prompt"
            goto L_0x1173
        L_0x114e:
            X.8qC r0 = r2.A11     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r0.get()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.34x r0 = r2.A0r     // Catch:{ OutOfMemoryError -> 0x13f7 }
            byte r1 = r0.A1I     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r0 = 88
            if (r1 != r0) goto L_0x10d1
            X.4uZ r0 = X.C106405Yw.A03(r30)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r0 = X.C155477ey.A00(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x10d1
            r0 = r30
            boolean r0 = r0 instanceof com.whatsapp.jid.UserJid     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x1171
            boolean r0 = X.C627336j.A0K(r30)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x10d1
        L_0x1171:
            java.lang.String r60 = "feedback"
        L_0x1173:
            r0 = 0
            X.2oN r1 = new X.2oN     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r57 = r33
            r34 = r1
            r36 = r20
            r37 = r30
            r39 = r22
            r40 = r5
            r41 = r11
            r42 = r21
            r43 = r23
            r44 = r27
            r45 = r25
            r47 = r29
            r56 = r33
            r58 = r14
            r62 = r10
            r64 = r26
            r65 = r24
            r71 = r76
            r74 = r18
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r73, r74)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r4 = 8
            r3 = r33
            android.os.Message r3 = android.os.Message.obtain(r3, r0, r4, r0, r1)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r1 = r79
            r4 = r29
            java.util.concurrent.Future r1 = r1.A05(r3, r4)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r1.get()     // Catch:{ Exception -> 0x13d2 }
            X.34x r3 = r2.A0r     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r1 = 3
            r4 = r31
            r5 = r1
            r6 = r75
            r7 = r28
            r8 = r78
            r9 = r16
            r2.A0B(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r3 = r2.A0D()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r3 == 0) goto L_0x11f2
            X.36E r5 = r2.A0E     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.34x r4 = r2.A0r     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.util.HashSet r3 = r2.targetDeviceRawJids     // Catch:{ OutOfMemoryError -> 0x13f7 }
            int r40 = r3.size()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r3 = r2.A18     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r37 = 1
            r42 = r0
            r43 = r0
            r44 = r0
            r45 = r0
            r46 = r37
            r34 = r5
            r35 = r4
            r36 = r33
            r38 = r37
            r39 = r7
            r41 = r0
            r47 = r3
            r34.A0N(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x11f2:
            if (r16 == 0) goto L_0x11f8
            boolean r0 = r2.forceSenderKeyDistribution     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x1363
        L_0x11f8:
            if (r19 == 0) goto L_0x1363
            if (r26 == 0) goto L_0x1363
            boolean r0 = r26.isEmpty()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x1363
            java.util.Set r4 = r26.keySet()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r0 = r31
            r4.retainAll(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.1fL r15 = (X.C28011fL) r15     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r0 = r2.useLidForEncryption     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x124d
            X.2sr r0 = r2.A0D     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.6kB r0 = r0.A0G()     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x1217:
            X.C626936e.A06(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.33n r6 = r2.A0J     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r5 = r15.getRawString()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.2ov r0 = X.AnonymousClass36G.A02(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.2oh r3 = new X.2oh     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r3.<init>(r0, r5)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.2wp r0 = r6.A0A     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.2JP r0 = r0.A01(r3)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x135e
            java.lang.String r0 = "SendE2EMessageJob/onRun/senderKey does exist after receiving the ack"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r0 = r2.useLidForEncryption     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x12d1
            X.2sj r0 = r2.A0S     // Catch:{ OutOfMemoryError -> 0x13f7 }
            boolean r0 = r0.A0B(r15)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 != 0) goto L_0x12d1
            X.2sj r1 = r2.A0S     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.3dV r0 = r1.A07     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.4Fq r9 = r0.A04()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            goto L_0x1254
        L_0x124d:
            X.2sr r0 = r2.A0D     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.6kH r0 = X.C56972sr.A03(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            goto L_0x1217
        L_0x1254:
            X.3Yo r8 = r9.Axl()     // Catch:{ all -> 0x13a5 }
            X.33h r5 = r1.A09     // Catch:{ all -> 0x139b }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x139b }
            java.lang.String r0 = "participant-user-store/markParticipantsAsHavingAddOnSenderKey/"
            X.C18260x0.A1R(r1, r0, r4)     // Catch:{ all -> 0x139b }
            X.4Fq r7 = X.C620533h.A02(r5)     // Catch:{ all -> 0x139b }
            X.3Yo r6 = r7.Axl()     // Catch:{ all -> 0x1391 }
            X.2pG r3 = r5.A0B     // Catch:{ all -> 0x1387 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x1387 }
            java.lang.String r0 = "participant-device-store/markDevicesAsHavingAddOnSenderKey: "
            r1.append(r0)     // Catch:{ all -> 0x1387 }
            r1.append(r15)     // Catch:{ all -> 0x1387 }
            java.lang.String r0 = " "
            X.C18260x0.A1R(r1, r0, r4)     // Catch:{ all -> 0x1387 }
            java.lang.String r0 = "UPDATE group_participant_device SET sent_add_on_sender_key = ? WHERE device_jid_row_id = ? AND group_participant_row_id IN (SELECT _id FROM group_participant_user WHERE group_jid_row_id = ? AND user_jid_row_id = ?)"
            r3.A03(r15, r0, r4)     // Catch:{ all -> 0x1387 }
            X.33k r0 = r5.A07(r15)     // Catch:{ all -> 0x1387 }
            java.util.Map r0 = r0.A08     // Catch:{ all -> 0x1387 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x1387 }
            X.6aS r0 = X.C129526aS.copyOf((java.util.Collection) r0)     // Catch:{ all -> 0x1387 }
            X.8Nf r5 = r0.iterator()     // Catch:{ all -> 0x1387 }
        L_0x1297:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x1387 }
            if (r0 == 0) goto L_0x12bd
            X.2zG r0 = X.C18320x8.A0G(r5)     // Catch:{ all -> 0x1387 }
            X.8Nf r3 = X.C60842zG.A00(r0)     // Catch:{ all -> 0x1387 }
        L_0x12a5:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x1387 }
            if (r0 == 0) goto L_0x1297
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x1387 }
            X.2kz r1 = (X.C52162kz) r1     // Catch:{ all -> 0x1387 }
            com.whatsapp.jid.DeviceJid r0 = r1.A02     // Catch:{ all -> 0x1387 }
            boolean r0 = r4.contains(r0)     // Catch:{ all -> 0x1387 }
            if (r0 == 0) goto L_0x12a5
            r0 = 1
            r1.A00 = r0     // Catch:{ all -> 0x1387 }
            goto L_0x12a5
        L_0x12bd:
            r6.A00()     // Catch:{ all -> 0x1387 }
            r6.close()     // Catch:{ all -> 0x1391 }
            r7.close()     // Catch:{ all -> 0x139b }
            r8.A00()     // Catch:{ all -> 0x139b }
            r8.close()     // Catch:{ all -> 0x13a5 }
            r9.close()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            goto L_0x1363
        L_0x12d1:
            X.2sj r3 = r2.A0S     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.3dV r0 = r3.A07     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.4Fq r10 = r0.A04()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.3Yo r9 = r10.Axl()     // Catch:{ all -> 0x13c8 }
            X.33h r7 = r3.A09     // Catch:{ all -> 0x13be }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x13be }
            java.lang.String r0 = "participant-user-store/markParticipantsAsHavingSenderKey/"
            X.C18260x0.A1R(r3, r0, r4)     // Catch:{ all -> 0x13be }
            X.4Fq r8 = X.C620533h.A02(r7)     // Catch:{ all -> 0x13be }
            X.3Yo r6 = r8.Axl()     // Catch:{ all -> 0x13b4 }
            X.2pG r5 = r7.A0B     // Catch:{ all -> 0x13aa }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x13aa }
            java.lang.String r0 = "participant-device-store/markDevicesAsHavingSenderKey: "
            r3.append(r0)     // Catch:{ all -> 0x13aa }
            r3.append(r15)     // Catch:{ all -> 0x13aa }
            java.lang.String r0 = " "
            X.C18260x0.A1R(r3, r0, r4)     // Catch:{ all -> 0x13aa }
            java.lang.String r0 = "UPDATE group_participant_device SET sent_sender_key = ? WHERE device_jid_row_id = ? AND group_participant_row_id IN (SELECT _id FROM group_participant_user WHERE group_jid_row_id = ? AND user_jid_row_id = ?)"
            r5.A03(r15, r0, r4)     // Catch:{ all -> 0x13aa }
            X.33k r3 = r7.A07(r15)     // Catch:{ all -> 0x13aa }
            int r0 = r3.A00     // Catch:{ all -> 0x13aa }
            if (r1 != r0) goto L_0x1346
            java.util.Map r0 = r3.A08     // Catch:{ all -> 0x13aa }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x13aa }
            X.6aS r0 = X.C129526aS.copyOf((java.util.Collection) r0)     // Catch:{ all -> 0x13aa }
        L_0x131c:
            X.8Nf r5 = r0.iterator()     // Catch:{ all -> 0x13aa }
        L_0x1320:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x13aa }
            if (r0 == 0) goto L_0x134b
            X.2zG r0 = X.C18320x8.A0G(r5)     // Catch:{ all -> 0x13aa }
            X.8Nf r3 = X.C60842zG.A00(r0)     // Catch:{ all -> 0x13aa }
        L_0x132e:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x13aa }
            if (r0 == 0) goto L_0x1320
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x13aa }
            X.2kz r1 = (X.C52162kz) r1     // Catch:{ all -> 0x13aa }
            com.whatsapp.jid.DeviceJid r0 = r1.A02     // Catch:{ all -> 0x13aa }
            boolean r0 = r4.contains(r0)     // Catch:{ all -> 0x13aa }
            if (r0 == 0) goto L_0x132e
            r0 = 1
            r1.A01 = r0     // Catch:{ all -> 0x13aa }
            goto L_0x132e
        L_0x1346:
            X.6aS r0 = r3.A04()     // Catch:{ all -> 0x13aa }
            goto L_0x131c
        L_0x134b:
            r6.A00()     // Catch:{ all -> 0x13aa }
            r6.close()     // Catch:{ all -> 0x13b4 }
            r8.close()     // Catch:{ all -> 0x13be }
            r9.A00()     // Catch:{ all -> 0x13be }
            r9.close()     // Catch:{ all -> 0x13c8 }
            r10.close()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            goto L_0x1363
        L_0x135e:
            java.lang.String r0 = "SendE2EMessageJob/onRun/senderKey doesn't exist after receiving the ack"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x1363:
            java.util.concurrent.ConcurrentHashMap r6 = A19
            java.lang.String r5 = r2.jid
            java.lang.String r4 = r2.id
            int r3 = r2.editVersion
            java.lang.String r1 = r2.participant
            X.2gl r0 = new X.2gl
            r0.<init>(r5, r4, r1, r3)
            r6.remove(r0)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "SendE2EMessageJob/e2e message send job finished"
            goto L_0x027d
        L_0x137d:
            r46 = r20
            goto L_0x0059
        L_0x1381:
            java.lang.String r0 = "SendE2EMessageJob/not sending message since companion's identity has changed"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            return
        L_0x1387:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x138c }
            goto L_0x1390
        L_0x138c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x1391 }
        L_0x1390:
            throw r1     // Catch:{ all -> 0x1391 }
        L_0x1391:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x1396 }
            goto L_0x139a
        L_0x1396:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x139b }
        L_0x139a:
            throw r1     // Catch:{ all -> 0x139b }
        L_0x139b:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x13a0 }
            goto L_0x13a4
        L_0x13a0:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x13a5 }
        L_0x13a4:
            throw r1     // Catch:{ all -> 0x13a5 }
        L_0x13a5:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x13cd }
            goto L_0x13d1
        L_0x13aa:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x13af }
            goto L_0x13b3
        L_0x13af:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x13b4 }
        L_0x13b3:
            throw r1     // Catch:{ all -> 0x13b4 }
        L_0x13b4:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x13b9 }
            goto L_0x13bd
        L_0x13b9:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x13be }
        L_0x13bd:
            throw r1     // Catch:{ all -> 0x13be }
        L_0x13be:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x13c3 }
            goto L_0x13c7
        L_0x13c3:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x13c8 }
        L_0x13c7:
            throw r1     // Catch:{ all -> 0x13c8 }
        L_0x13c8:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x13cd }
            goto L_0x13d1
        L_0x13cd:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x13d1:
            throw r1     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x13d2:
            r4 = move-exception
            r0 = 1
            r2.A18 = r0     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.1VX r1 = r2.A0a     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r0 = 2472(0x9a8, float:3.464E-42)
            boolean r0 = r1.A0Y(r13, r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            if (r0 == 0) goto L_0x13f6
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ OutOfMemoryError -> 0x13f7 }
            java.lang.String r1 = "SendE2EMessageJob/storing encrypted payload for:"
            r0 = r32
            X.C18260x0.A0s(r1, r0, r3)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            X.2OO r3 = new X.2OO     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r1 = r23
            r0 = r24
            r3.<init>(r12, r1, r0)     // Catch:{ OutOfMemoryError -> 0x13f7 }
            r2.A0i = r3     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x13f6:
            throw r4     // Catch:{ OutOfMemoryError -> 0x13f7 }
        L_0x13f7:
            r4 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SendE2EMessageJob/onRun/out of memory sending message: "
            r3.append(r0)
            r0 = r32
            r3.append(r0)
            java.lang.String r1 = " :forceOneOneEncryption="
            r0 = r16
            java.lang.String r0 = X.AnonymousClass000.A0b(r1, r3, r0)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.2qk r6 = r2.A0B
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "msg-send-failure-oom-"
            r1.append(r0)
            X.34x r0 = r2.A0r
            int r0 = X.AnonymousClass36M.A06(r0)
            java.lang.String r5 = X.AnonymousClass000.A0h(r1, r0)
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            byte r0 = r2.messageType
            r3.append(r0)
            java.lang.String r1 = "-"
            r3.append(r1)
            r0 = r16
            r3.append(r0)
            r3.append(r1)
            int r0 = r31.size()
            java.lang.String r1 = X.AnonymousClass000.A0h(r3, r0)
            r0 = 0
            r6.A0A(r5, r0, r1)
            X.34x r1 = r2.A0r
            if (r1 == 0) goto L_0x145b
            boolean r0 = r2.A17
            if (r0 != 0) goto L_0x145b
            boolean r0 = r1 instanceof X.C30331mH
            if (r0 != 0) goto L_0x145b
            boolean r0 = r1 instanceof X.AnonymousClass48R
            if (r0 != 0) goto L_0x145b
            if (r75 <= 0) goto L_0x146f
        L_0x145b:
            X.1VX r3 = r2.A0a
            r1 = 3352(0xd18, float:4.697E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r3.A0Y(r0, r1)
            if (r0 == 0) goto L_0x146f
            if (r16 == 0) goto L_0x1470
            r1 = 1
        L_0x146a:
            com.whatsapp.jobqueue.job.SendE2EMessageJob$OutOfMemoryException r4 = new com.whatsapp.jobqueue.job.SendE2EMessageJob$OutOfMemoryException
            r4.<init>(r1)
        L_0x146f:
            throw r4
        L_0x1470:
            if (r19 == 0) goto L_0x1477
            boolean r0 = r2.includeSenderKeysInMessage
            r1 = 2
            if (r0 != 0) goto L_0x146a
        L_0x1477:
            r1 = 0
            goto L_0x146a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendE2EMessageJob.A07():void");
    }

    public void Bm4(Context context) {
        C64333Db A002 = C389229y.A00(context);
        this.A0I = A002.Bqh();
        this.A0a = A002.Avy();
        this.A0C = C64333Db.A04(A002);
        this.A0B = A002.Azq();
        this.A0D = A002.BL4();
        this.A0O = C64333Db.A39(A002);
        this.A10 = (JniBridge) A002.AS8.get();
        this.A0j = (C106685Zz) A002.AJ4.get();
        this.A0z = A002.Ari();
        this.A0o = A002.BLC();
        this.A0d = (C54932pW) A002.AGY.get();
        this.A11 = C72343dZ.A00(A002.A3B);
        this.A0E = (AnonymousClass36E) A002.ALM.get();
        this.A0K = (C48972fm) A002.AW6.get();
        this.A0M = (AnonymousClass2Y0) A002.A53.get();
        this.A0b = (AnonymousClass2YF) A002.AAs.get();
        this.A0p = (AnonymousClass9U4) A002.AQC.get();
        this.A0P = C64333Db.A3D(A002);
        this.A0w = C64333Db.A8F(A002);
        this.A0n = (C52552lf) A002.AHS.get();
        this.A0U = C64333Db.A3K(A002);
        this.A0N = A002.Ajo();
        this.A0J = C64333Db.A2v(A002);
        this.A0V = (AnonymousClass300) A002.AM7.get();
        C107695bk r3 = A002.AcK.A00;
        this.A0x = (AnonymousClass2MM) r3.AA5.get();
        this.A0X = (C620333f) A002.AKQ.get();
        this.A0H = (C56422rx) A002.AZn.get();
        this.A0Y = (AnonymousClass33Z) A002.A85.get();
        this.A0Q = (C55672qj) A002.A8i.get();
        this.A0W = (C55332qB) A002.ATK.get();
        this.A0y = (C45612aI) r3.AA6.get();
        this.A09 = (C116985rC) A002.AOj.get();
        this.A0l = (AnonymousClass2WW) A002.A72.get();
        this.A0R = (C46412ba) A002.AGk.get();
        this.A0F = (C55492qR) A002.AR3.get();
        this.A0G = (C620433g) A002.A3v.get();
        this.A0k = (C621233o) A002.AJA.get();
        this.A0m = (C60102y0) r3.A2v.get();
        this.A0Z = (AnonymousClass2GF) A002.A97.get();
        this.A0c = (C54602oz) A002.ABK.get();
        this.A13 = C72343dZ.A00(A002.ALv);
        this.A0S = C64333Db.A3G(A002);
        this.A0u = (C51072jE) A002.ATh.get();
        this.A0T = (C66483Lp) A002.AL5.get();
        this.A0v = (C45502a7) A002.ANM.get();
        C88744aj r1 = C88744aj.A00;
        this.A08 = r1;
        this.A06 = r1;
        this.A0L = (AnonymousClass25r) r3.A3D.get();
        this.A12 = C72343dZ.A00(A002.A6A);
        this.A07 = r1;
        this.A0s = (C50222hp) A002.AIA.get();
        this.A0t = A002.Aq9();
        C56972sr r12 = this.A0D;
        JniBridge jniBridge = this.A10;
        C183538qC r7 = this.A11;
        C55832qz r5 = this.A0w;
        AnonymousClass33Z r32 = this.A0Y;
        this.A0g = new C622434g(r12, this.A0W, r32, (AnonymousClass36Y) A002.A7u.get(), r5, jniBridge, r7);
        this.A0f = new C48122eO(this.encryptionRetryCounts);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.whatsapp.jid.UserJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.1fL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: X.4uZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.whatsapp.jid.UserJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.whatsapp.jid.DeviceJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: com.whatsapp.jid.DeviceJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.whatsapp.jid.UserJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: com.whatsapp.jid.UserJid} */
    /* JADX WARNING: type inference failed for: r0v39, types: [org.whispersystems.jobqueue.requirements.Requirement] */
    /* JADX WARNING: type inference failed for: r0v48 */
    /* JADX WARNING: type inference failed for: r16v5, types: [com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSessionRequirement] */
    /* JADX WARNING: type inference failed for: r16v6, types: [com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSenderKeyRequirement] */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (r27 != null) goto L_0x0029;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendE2EMessageJob(X.C116985rC r26, com.whatsapp.jid.DeviceJid r27, com.whatsapp.jid.Jid r28, com.whatsapp.jid.UserJid r29, com.whatsapp.jid.UserJid r30, X.AnonymousClass1EU r31, java.lang.Integer r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.util.Map r37, java.util.Set r38, byte[] r39, byte[] r40, byte r41, int r42, int r43, int r44, long r45, long r47, long r49, long r51, boolean r53, boolean r54, boolean r55, boolean r56, boolean r57, boolean r58, boolean r59) {
        /*
            r25 = this;
            r1 = r29
            r3 = r28
            r6 = r3
            r13 = r35
            r20 = r13
            if (r29 != 0) goto L_0x0014
            boolean r0 = r3 instanceof com.whatsapp.jid.DeviceJid
            r1 = r3
            if (r0 == 0) goto L_0x0014
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1
            com.whatsapp.jid.UserJid r1 = r1.userJid
        L_0x0014:
            X.2gM r5 = X.C49332gM.A01()
            java.lang.String r0 = r1.getRawString()
            X.C49332gM.A03(r0, r5)
            boolean r0 = r3 instanceof X.C28011fL
            r4 = r27
            if (r0 == 0) goto L_0x0029
            r16 = 1
            if (r27 == 0) goto L_0x002b
        L_0x0029:
            r16 = 0
        L_0x002b:
            r11 = r39
            if (r39 == 0) goto L_0x0039
            int r1 = r11.length
            if (r1 != 0) goto L_0x0039
            java.lang.String r0 = "cannot use empty old alice base key"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x0039:
            r10 = r38
            r14 = r34
            r12 = r33
            r1 = r41
            r15 = r57
            r8 = r56
            r7 = r59
            r9 = r54
            r2 = r44
            if (r16 == 0) goto L_0x00a8
            if (r39 != 0) goto L_0x01a9
            if (r54 == 0) goto L_0x01a2
            r6 = 8
            boolean r6 = X.AnonymousClass001.A1X(r2, r6)
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r6)
            if (r0 == 0) goto L_0x00a6
            r6 = r3
            X.1fL r6 = (X.C28011fL) r6
        L_0x0060:
            if (r59 != 0) goto L_0x0064
            r20 = r14
        L_0x0064:
            com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSenderKeyRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSenderKeyRequirement
            r21 = r10
            r22 = r1
            r23 = r15
            r24 = r7
            r17 = r6
            r19 = r12
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x0077:
            r5.A05(r0)
        L_0x007a:
            if (r30 == 0) goto L_0x0088
            com.whatsapp.jid.DeviceJid r6 = r30.getPrimaryDevice()
            com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement
            r0.<init>(r6)
            r5.A05(r0)
        L_0x0088:
            r6 = r32
            if (r32 == 0) goto L_0x0094
            com.whatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement
            r0.<init>()
            r5.A05(r0)
        L_0x0094:
            r11 = r26
            boolean r0 = r11.A07()
            if (r0 == 0) goto L_0x00dd
            r11.A04()
            java.lang.String r0 = "getValidVNameRequirement"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x00a6:
            r6 = 0
            goto L_0x0060
        L_0x00a8:
            if (r56 == 0) goto L_0x00c6
            r0 = 8
            boolean r0 = X.AnonymousClass001.A1X(r2, r0)
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r0)
            X.4uZ r6 = (X.C95814uZ) r6
            com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSessionRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSessionRequirement
            r16 = r0
            r19 = r12
            r20 = r10
            r21 = r1
            r17 = r6
            r16.<init>(r17, r18, r19, r20, r21)
            goto L_0x0077
        L_0x00c6:
            if (r27 == 0) goto L_0x00c9
            r6 = r4
        L_0x00c9:
            com.whatsapp.jid.DeviceJid r6 = X.C18320x8.A0O(r6)
            com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement
            r0.<init>(r6)
            r5.A05(r0)
            if (r39 == 0) goto L_0x007a
            com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement
            r0.<init>(r6, r11)
            goto L_0x0077
        L_0x00dd:
            org.whispersystems.jobqueue.JobParameters r0 = r5.A04()
            r5 = r25
            r5.<init>(r0)
            r0 = 0
            r5.A00 = r0
            java.util.HashMap r0 = X.AnonymousClass001.A0t()
            r5.encryptionRetryCounts = r0
            r0 = r31
            X.C626936e.A06(r0)
            r5.A0q = r0
            X.C626936e.A05(r12)
            r5.id = r12
            java.lang.String r0 = r3.getRawString()
            r5.jid = r0
            com.whatsapp.jid.DeviceJid r0 = com.whatsapp.jid.DeviceJid.of(r3)
            r5.A0e = r0
            java.lang.String r0 = X.C627336j.A07(r4)
            r5.participant = r0
            java.lang.String r0 = X.C627336j.A07(r29)
            r5.recipientRawJid = r0
            java.util.HashSet r0 = X.AnonymousClass002.A0K()
            X.C627336j.A0H(r10, r0)
            r5.targetDeviceRawJids = r0
            r5.messageType = r1
            r0 = r42
            r5.retryCount = r0
            r0 = r53
            r5.A18 = r0
            r0 = r45
            r5.A05 = r0
            r5.groupParticipantHash = r14
            r5.groupParticipantUserHash = r13
            r5.includeSenderKeysInMessage = r9
            r0 = r47
            r5.expireTimeMs = r0
            r0 = r49
            r5.messageSendStartTime = r0
            r0 = r51
            r5.originalTimestamp = r0
            r0 = r43
            r5.originationFlags = r0
            r5.editVersion = r2
            r5.liveLocationDuration = r6
            r0 = r55
            r5.useOneOneEncryptionOnPHashMismatch = r0
            r5.multiDeviceFanOut = r8
            r5.useLidForEncryption = r15
            r0 = r40
            r5.ephemeralSharedSecret = r0
            r5.A0A = r11
            if (r37 == 0) goto L_0x017e
            java.util.Set r0 = r37.entrySet()
            java.util.HashMap r8 = X.AnonymousClass001.A0t()
            if (r0 == 0) goto L_0x017f
            java.util.Iterator r6 = r0.iterator()
        L_0x0162:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x017f
            java.util.Map$Entry r2 = X.AnonymousClass001.A0w(r6)
            com.whatsapp.jid.Jid r0 = X.AnonymousClass0x9.A0R(r2)
            if (r0 == 0) goto L_0x0162
            java.lang.String r1 = r0.getRawString()
            java.lang.Object r0 = r2.getValue()
            r8.put(r1, r0)
            goto L_0x0162
        L_0x017e:
            r8 = 0
        L_0x017f:
            r5.broadcastParticipantEphemeralSettings = r8
            r0 = r36
            r5.broadcastListName = r0
            r0 = r58
            r5.forceSenderKeyDistribution = r0
            r5.useParticipantUserHash = r7
            java.lang.String r0 = X.C627336j.A07(r30)
            r5.botInvokeRawJid = r0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SendE2EMessageJob/e2e message send job created"
            java.lang.String r0 = X.AnonymousClass0x9.A0x(r5, r0, r1)
            X.C18260x0.A1L(r1, r0)
            r5.A0A(r4, r3)
            return
        L_0x01a2:
            java.lang.String r0 = "cannot use group encryption without including sender key in message"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x01a9:
            java.lang.String r0 = "cannot use group encryption and old alice base key simultaneously"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendE2EMessageJob.<init>(X.5rC, com.whatsapp.jid.DeviceJid, com.whatsapp.jid.Jid, com.whatsapp.jid.UserJid, com.whatsapp.jid.UserJid, X.1EU, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.util.Set, byte[], byte[], byte, int, int, int, long, long, long, long, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
