package com.whatsapp.jobqueue.requirement;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x7;
import X.AnonymousClass1VX;
import X.AnonymousClass1fI;
import X.AnonymousClass2z0;
import X.AnonymousClass36G;
import X.C1228065u;
import X.C183538qC;
import X.C28011fL;
import X.C389229y;
import X.C46412ba;
import X.C47002cY;
import X.C55332qB;
import X.C56892sj;
import X.C56972sr;
import X.C56982ss;
import X.C57382tY;
import X.C58422vE;
import X.C620833k;
import X.C621133n;
import X.C626936e;
import X.C64333Db;
import X.C66483Lp;
import X.C72343dZ;
import X.C95814uZ;
import android.content.Context;
import com.whatsapp.jid.DeviceJid;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.whispersystems.jobqueue.requirements.Requirement;

public class AxolotlMultiDeviceSessionRequirement implements Requirement, C1228065u {
    public transient int A00;
    public transient C621133n A01;
    public transient C66483Lp A02;
    public transient C55332qB A03;
    public transient C95814uZ A04;
    public transient C47002cY A05;
    public transient C183538qC A06;
    public transient Object A07 = AnonymousClass002.A0D();
    public transient List A08;
    public transient boolean A09;
    public volatile transient int A0A;
    @Deprecated
    public boolean forceSenderKeyDistribution;
    public Boolean messageFromMe;
    public final String messageKeyId;
    public byte messageType;
    public final String remoteRawJid;
    public final HashSet targetDeviceRawJids;

    public final List A00() {
        Collection A002;
        List list;
        String A0B;
        synchronized (this.A07) {
            if (this instanceof AxolotlMultiDeviceSenderKeyRequirement) {
                AxolotlMultiDeviceSenderKeyRequirement axolotlMultiDeviceSenderKeyRequirement = (AxolotlMultiDeviceSenderKeyRequirement) this;
                HashSet hashSet = axolotlMultiDeviceSenderKeyRequirement.A05.A06;
                if (hashSet == null || hashSet.isEmpty()) {
                    C55332qB r4 = axolotlMultiDeviceSenderKeyRequirement.A03;
                    C95814uZ r2 = axolotlMultiDeviceSenderKeyRequirement.A04;
                    Boolean bool = axolotlMultiDeviceSenderKeyRequirement.messageFromMe;
                    C626936e.A06(bool);
                    A002 = r4.A01(AnonymousClass2z0.A05(r2, axolotlMultiDeviceSenderKeyRequirement.messageKeyId, bool.booleanValue()));
                    C28011fL A003 = C57382tY.A00(axolotlMultiDeviceSenderKeyRequirement.A04);
                    byte b = axolotlMultiDeviceSenderKeyRequirement.messageType;
                    AnonymousClass1VX r9 = axolotlMultiDeviceSenderKeyRequirement.A04;
                    C56972sr r8 = axolotlMultiDeviceSenderKeyRequirement.A00;
                    C56982ss r5 = axolotlMultiDeviceSenderKeyRequirement.A01;
                    C46412ba r22 = axolotlMultiDeviceSenderKeyRequirement.A02;
                    if (r9.A0Y(C58422vE.A02, 3069) && r5.A0N(A003)) {
                        if (b == 15 || b == 68) {
                            C620833k A004 = r22.A00(A003);
                            if (A004 != null && (!A004.A0P(r8))) {
                            }
                        }
                    }
                    boolean z = axolotlMultiDeviceSenderKeyRequirement.useParticipantUserHash;
                    C56892sj r0 = axolotlMultiDeviceSenderKeyRequirement.A03;
                    boolean z2 = axolotlMultiDeviceSenderKeyRequirement.useLidForEncryption;
                    if (z) {
                        C620833k A012 = C56892sj.A01(r0, A003);
                        if (z2) {
                            A0B = A012.A0A();
                        } else {
                            A0B = A012.A0C();
                        }
                    } else {
                        C620833k A013 = C56892sj.A01(r0, A003);
                        if (z2) {
                            A0B = A013.A09();
                        } else {
                            A0B = A013.A0B();
                        }
                    }
                    if (!(!A0B.equals(axolotlMultiDeviceSenderKeyRequirement.groupParticipantHash))) {
                        Set A0G = C56892sj.A01(axolotlMultiDeviceSenderKeyRequirement.A03, A003).A0G(axolotlMultiDeviceSenderKeyRequirement.A00, axolotlMultiDeviceSenderKeyRequirement.useLidForEncryption);
                        A0G.retainAll(A002);
                        if (A003 instanceof AnonymousClass1fI) {
                            HashSet A0K = AnonymousClass002.A0K();
                            Iterator it = A002.iterator();
                            while (it.hasNext()) {
                                DeviceJid A0R = AnonymousClass0x7.A0R(it);
                                if (axolotlMultiDeviceSenderKeyRequirement.A00.A0b(A0R)) {
                                    A0K.add(A0R);
                                }
                            }
                            A0G.addAll(A0K);
                        }
                        A002 = A0G;
                    }
                } else {
                    A002 = axolotlMultiDeviceSenderKeyRequirement.A05.A00();
                }
            } else {
                A002 = this.A05.A00();
            }
            if (!this.A09 || this.A00 != A002.size()) {
                if (!A002.isEmpty()) {
                    List A062 = AnonymousClass36G.A06(A002);
                    this.A08 = AnonymousClass001.A0s();
                    int size = A062.size() / 100;
                    int size2 = A062.size() % 100;
                    int i = 0;
                    while (i < size) {
                        int i2 = i * 100;
                        i++;
                        this.A08.add(A062.subList(i2, 100 * i));
                    }
                    if (size2 > 0) {
                        this.A08.add(A062.subList(AnonymousClass002.A04(A062, size2), A062.size()));
                    }
                } else {
                    this.A08 = null;
                }
                this.A09 = true;
                this.A00 = A002.size();
                this.A0A = 0;
            }
            list = this.A08;
        }
        return list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00af, code lost:
        if (r8 != r5) goto L_0x00b1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BIR() {
        /*
            r20 = this;
            r4 = r20
            java.util.List r3 = r4.A00()
            r18 = 1
            if (r3 == 0) goto L_0x00da
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x00da
            int r0 = r4.A0A
            r19 = r0
        L_0x0014:
            X.33n r10 = r4.A01
            int r0 = r4.A0A
            java.lang.Object r2 = r3.get(r0)
            java.util.List r2 = (java.util.List) r2
            java.util.HashSet r17 = X.AnonymousClass002.A0K()
            X.2pw r9 = r10.A0G
            monitor-enter(r9)
            java.util.Set r0 = r9.A02(r2)     // Catch:{ all -> 0x00d7 }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x00d7 }
            r0 = 0
            if (r1 == 0) goto L_0x00a6
            java.util.Set r13 = r9.A03(r2)     // Catch:{ all -> 0x00d7 }
            int r8 = r13.size()     // Catch:{ all -> 0x00d7 }
            r0 = 1
            if (r8 == 0) goto L_0x00a6
            X.2ot r0 = r10.A0B     // Catch:{ all -> 0x00d7 }
            android.database.Cursor r12 = r0.A00(r13)     // Catch:{ all -> 0x00d7 }
            java.lang.String r0 = "record"
            int r16 = r12.getColumnIndex(r0)     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = "recipient_id"
            int r11 = r12.getColumnIndex(r0)     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = "recipient_type"
            int r7 = r12.getColumnIndex(r0)     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = "device_id"
            int r6 = r12.getColumnIndex(r0)     // Catch:{ all -> 0x00cb }
            r5 = 0
        L_0x005d:
            boolean r0 = r12.moveToNext()     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x008b
            r0 = r16
            byte[] r15 = r12.getBlob(r0)     // Catch:{ all -> 0x00cb }
            long r0 = r12.getLong(r11)     // Catch:{ all -> 0x00cb }
            java.lang.String r14 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00cb }
            int r2 = r12.getInt(r7)     // Catch:{ all -> 0x00cb }
            int r0 = r12.getInt(r6)     // Catch:{ all -> 0x00cb }
            X.2ov r1 = new X.2ov     // Catch:{ all -> 0x00cb }
            r1.<init>(r14, r2, r0)     // Catch:{ all -> 0x00cb }
            X.C55182pw.A00(r9, r1, r15)     // Catch:{ IOException -> 0x0082 }
            goto L_0x0088
        L_0x0082:
            r0 = r17
            r0.add(r1)     // Catch:{ all -> 0x00cb }
            goto L_0x005d
        L_0x0088:
            int r5 = r5 + 1
            goto L_0x005d
        L_0x008b:
            r12.close()     // Catch:{ all -> 0x00d7 }
            r9.A05(r13)     // Catch:{ all -> 0x00d7 }
            monitor-exit(r9)     // Catch:{ all -> 0x00d7 }
            java.util.Iterator r1 = r17.iterator()
        L_0x0096:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a8
            java.lang.Object r0 = r1.next()
            X.2ov r0 = (X.C54562ov) r0
            r10.A0B(r0)
            goto L_0x0096
        L_0x00a6:
            monitor-exit(r9)     // Catch:{ all -> 0x00d7 }
            goto L_0x00b2
        L_0x00a8:
            int r0 = r17.size()
            if (r0 != 0) goto L_0x00b1
            r0 = 1
            if (r8 == r5) goto L_0x00b2
        L_0x00b1:
            r0 = 0
        L_0x00b2:
            r2 = 0
            if (r0 != 0) goto L_0x00b6
            return r2
        L_0x00b6:
            int r0 = r4.A0A
            int r1 = r0 + 1
            r4.A0A = r1
            int r0 = r3.size()
            if (r1 != r0) goto L_0x00c4
            r4.A0A = r2
        L_0x00c4:
            int r1 = r4.A0A
            r0 = r19
            if (r1 != r0) goto L_0x0014
            return r18
        L_0x00cb:
            r1 = move-exception
            if (r12 == 0) goto L_0x00d6
            r12.close()     // Catch:{ all -> 0x00d2 }
            goto L_0x00d6
        L_0x00d2:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00d7 }
        L_0x00d6:
            throw r1     // Catch:{ all -> 0x00d7 }
        L_0x00d7:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00d7 }
            throw r0
        L_0x00da:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSessionRequirement.BIR():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r4.booleanValue() != false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AxolotlMultiDeviceSessionRequirement(X.C95814uZ r3, java.lang.Boolean r4, java.lang.String r5, java.util.Set r6, byte r7) {
        /*
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = X.AnonymousClass002.A0D()
            r2.A07 = r0
            r2.messageKeyId = r5
            if (r4 == 0) goto L_0x0014
            boolean r1 = r4.booleanValue()
            r0 = 0
            if (r1 == 0) goto L_0x0015
        L_0x0014:
            r0 = 1
        L_0x0015:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.messageFromMe = r0
            r2.A04 = r3
            java.lang.String r0 = r3.getRawString()
            r2.remoteRawJid = r0
            java.util.HashSet r0 = X.AnonymousClass002.A0K()
            X.C627336j.A0H(r6, r0)
            r2.targetDeviceRawJids = r0
            r2.messageType = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSessionRequirement.<init>(X.4uZ, java.lang.Boolean, java.lang.String, java.util.Set, byte):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (r1 != false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void readObject(java.io.ObjectInputStream r3) {
        /*
            r2 = this;
            r3.defaultReadObject()
            java.lang.String r0 = r2.remoteRawJid     // Catch:{ 24P -> 0x002c }
            X.4uZ r0 = X.C106405Yw.A04(r0)     // Catch:{ 24P -> 0x002c }
            r2.A04 = r0     // Catch:{ 24P -> 0x002c }
            java.lang.Object r0 = X.AnonymousClass002.A0D()
            r2.A07 = r0
            java.lang.Boolean r0 = r2.messageFromMe
            if (r0 == 0) goto L_0x001c
            boolean r1 = r0.booleanValue()
            r0 = 0
            if (r1 == 0) goto L_0x001d
        L_0x001c:
            r0 = 1
        L_0x001d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.messageFromMe = r0
            boolean r0 = r2.forceSenderKeyDistribution
            if (r0 == 0) goto L_0x002b
            r0 = 58
            r2.messageType = r0
        L_0x002b:
            return
        L_0x002c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "invalid jid="
            r1.append(r0)
            java.lang.String r0 = r2.remoteRawJid
            java.io.InvalidObjectException r0 = X.C18270x1.A0C(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSessionRequirement.readObject(java.io.ObjectInputStream):void");
    }

    public void Bm4(Context context) {
        C64333Db A002 = C389229y.A00(context);
        this.A01 = C64333Db.A2v(A002);
        this.A06 = C72343dZ.A00(A002.A3B);
        this.A03 = (C55332qB) A002.ATK.get();
        C66483Lp r2 = (C66483Lp) A002.AL5.get();
        this.A02 = r2;
        C183538qC r6 = this.A06;
        C55332qB r3 = this.A03;
        C95814uZ r4 = this.A04;
        Boolean bool = this.messageFromMe;
        C626936e.A06(bool);
        this.A05 = new C47002cY(r2, r3, r4, AnonymousClass2z0.A05(r4, this.messageKeyId, bool.booleanValue()), r6, this.targetDeviceRawJids, this.messageType);
    }
}
