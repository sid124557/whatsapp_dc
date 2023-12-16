package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass1BQ;
import X.AnonymousClass1EU;
import X.AnonymousClass2KL;
import X.AnonymousClass2US;
import X.AnonymousClass2XJ;
import X.AnonymousClass31C;
import X.AnonymousClass31S;
import X.AnonymousClass32Y;
import X.AnonymousClass35A;
import X.AnonymousClass36G;
import X.AnonymousClass36K;
import X.AnonymousClass39T;
import X.AnonymousClass39V;
import X.AnonymousClass4II;
import X.AnonymousClass4IJ;
import X.C1228065u;
import X.C130546c9;
import X.C135156kD;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C18310x6;
import X.C208419n;
import X.C381025p;
import X.C389229y;
import X.C42112Mv;
import X.C45442a1;
import X.C48972fm;
import X.C50412i8;
import X.C54422oh;
import X.C55492qR;
import X.C56612sH;
import X.C56972sr;
import X.C61222zu;
import X.C614730x;
import X.C618932r;
import X.C621133n;
import X.C621233o;
import X.C626936e;
import X.C627336j;
import X.C64333Db;
import X.C73523fe;
import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.whispersystems.jobqueue.Job;

public final class SendLiveLocationKeyJob extends Job implements C1228065u {
    public static final long serialVersionUID = 1;
    public transient C56972sr A00;
    public transient C55492qR A01;
    public transient C621133n A02;
    public transient C48972fm A03;
    public transient C621233o A04;
    public transient C61222zu A05;
    public final ArrayList rawJids;
    public final Integer retryCount;

    public void A07() {
        ArrayList arrayList;
        AnonymousClass1EU r0;
        C45442a1 r4;
        Integer num = this.retryCount;
        int i = 0;
        C621233o r10 = this.A04;
        if (num != null) {
            UserJid A08 = AnonymousClass32Y.A08((String) this.rawJids.get(0));
            int intValue = this.retryCount.intValue();
            synchronized (r10.A0R) {
                if (!r10.A0e(A08, intValue)) {
                    List emptyList = Collections.emptyList();
                    arrayList = emptyList;
                } else {
                    List singletonList = Collections.singletonList(A08);
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("LocationSharingManager/markParticipantsAsNeedSenderKey; jids.size");
                    C18260x0.A1G(A0o, singletonList.size());
                    ArrayList A0s = AnonymousClass001.A0s();
                    r10.A0C();
                    Iterator it = singletonList.iterator();
                    while (it.hasNext()) {
                        UserJid A0T = C18310x6.A0T(it);
                        if (!r10.A07.A0a(A0T)) {
                            HashSet hashSet = r10.A0U;
                            if (hashSet.contains(A0T)) {
                                hashSet.remove(A0T);
                                A0s.add(A0T);
                            }
                        }
                    }
                    r10.A0J.A08(A0s, false);
                    C42112Mv r1 = r10.A09;
                    new AnonymousClass2US();
                    r1.A00.A00();
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("LocationSharingManager/markSendingLocationKeyRetry/marking; remote_resource=");
                    A0o2.append(A08);
                    C18260x0.A0y("; retryCount=", A0o2, intValue);
                    r10.A0Y.put(A08, C18300x5.A0E(Long.valueOf(C56612sH.A08(r10)), intValue));
                    r10.A0a.put(A08, AnonymousClass001.A0f());
                    List singletonList2 = Collections.singletonList(A08);
                    arrayList = singletonList2;
                }
            }
        } else {
            List A0B = C627336j.A0B(UserJid.class, this.rawJids);
            synchronized (r10.A0R) {
                ArrayList A0s2 = AnonymousClass001.A0s();
                List A09 = r10.A09();
                Iterator it2 = A0B.iterator();
                while (it2.hasNext()) {
                    UserJid A0T2 = C18310x6.A0T(it2);
                    Map map = r10.A0a;
                    Integer num2 = (Integer) map.get(A0T2);
                    if (A09.contains(A0T2) && (num2 == null || num2.intValue() != 1)) {
                        A0s2.add(A0T2);
                        C18280x3.A1D(A0T2, map, 1);
                    }
                }
                arrayList = A0s2;
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        StringBuilder A0o3 = AnonymousClass001.A0o();
        if (isEmpty) {
            A0o3.append("skip send live location key job; no one to send");
            C18260x0.A1L(A0o3, A09());
            return;
        }
        A0o3.append("run send live location key job");
        C18260x0.A1L(A0o3, A09());
        try {
            C135156kD r8 = C135156kD.A00;
            if (this.A02.A0X()) {
                r0 = A08(r8);
            } else {
                r0 = (AnonymousClass1EU) C48972fm.A01(this.A03, new AnonymousClass4IJ(r8, 3, this));
            }
            HashMap A0t = AnonymousClass001.A0t();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                UserJid A0T3 = C18310x6.A0T(it3);
                if (this.A02.A0X()) {
                    r4 = C381025p.A01(AnonymousClass36G.A02(C618932r.A00(A0T3)), this.A02, r0.A0F());
                } else {
                    r4 = (C45442a1) C48972fm.A01(this.A03, new AnonymousClass4II(r0, this, A0T3, 2));
                }
                A0t.put(A0T3, r4);
            }
            C61222zu r42 = this.A05;
            Integer num3 = this.retryCount;
            if (num3 != null) {
                i = num3.intValue();
            }
            AnonymousClass31C r6 = r42.A02;
            String A042 = r6.A04();
            C50412i8 r02 = new C50412i8();
            r02.A05 = "notification";
            r02.A08 = "location";
            r02.A02 = r8;
            r02.A07 = A042;
            AnonymousClass39T A012 = r02.A01();
            AnonymousClass39V[] r7 = new AnonymousClass39V[3];
            boolean A0F = AnonymousClass39V.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A042, r7);
            r7[1] = new AnonymousClass39V((Jid) r8, "to");
            AnonymousClass39V.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "location", r7);
            AnonymousClass36K[] r43 = new AnonymousClass36K[A0t.size()];
            Iterator A0u = AnonymousClass001.A0u(A0t);
            int i2 = 0;
            while (A0u.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0u);
                AnonymousClass39V[] r13 = new AnonymousClass39V[1];
                AnonymousClass39V.A02(AnonymousClass0x9.A0R(A0w), "jid", r13, A0F ? 1 : 0);
                r43[i2] = AnonymousClass36K.A0F(AnonymousClass35A.A00((C45442a1) A0w.getValue(), i), "to", r13);
                i2++;
            }
            r6.A07(AnonymousClass36K.A0F(AnonymousClass36K.A0J("participants", (AnonymousClass39V[]) null, r43), "notification", r7), A012, 123).get();
            StringBuilder A0o4 = AnonymousClass001.A0o();
            A0o4.append("sent location key distribution notifications");
            C18260x0.A1L(A0o4, A09());
            C621233o r72 = this.A04;
            StringBuilder A0o5 = AnonymousClass001.A0o();
            A0o5.append("LocationSharingManager/markSentLocationKey; jids.size=");
            C18260x0.A1G(A0o5, arrayList.size());
            ArrayList A0s3 = AnonymousClass001.A0s();
            synchronized (r72.A0R) {
                r72.A0C();
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    UserJid A0T4 = C18310x6.A0T(it4);
                    if (!r72.A07.A0a(A0T4)) {
                        HashSet hashSet2 = r72.A0U;
                        if (!hashSet2.contains(A0T4)) {
                            Map map2 = r72.A0a;
                            Integer num4 = (Integer) map2.get(A0T4);
                            if (num4 != null && num4.intValue() == 1) {
                                hashSet2.add(A0T4);
                                A0s3.add(A0T4);
                                map2.remove(A0T4);
                            }
                        }
                    }
                }
                r72.A0J.A08(A0s3, true);
                if (r72.A0b()) {
                    r72.A0J();
                }
            }
            C42112Mv r12 = r72.A09;
            new AnonymousClass2US();
            r12.A00.A00();
        } catch (Exception e) {
            C621233o r44 = this.A04;
            synchronized (r44.A0R) {
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    r44.A0a.remove(C18310x6.A0T(it5));
                }
                throw e;
            }
        }
    }

    public final AnonymousClass1EU A08(Jid jid) {
        C54422oh A002 = C54422oh.A00(AnonymousClass36G.A02(C56972sr.A03(this.A00)), jid);
        C621133n r0 = this.A02;
        C73523fe A012 = C614730x.A01(r0, A002);
        try {
            AnonymousClass2KL r1 = new AnonymousClass2KL(new AnonymousClass2XJ(r0.A00.A02.A01).A00(AnonymousClass31S.A02(A002)).A03, 0);
            A012.close();
            C130546c9 A0G = AnonymousClass1EU.DEFAULT_INSTANCE.A0G();
            AnonymousClass1BQ r02 = ((AnonymousClass1EU) A0G.A00).fastRatchetKeySenderKeyDistributionMessage_;
            if (r02 == null) {
                r02 = AnonymousClass1BQ.DEFAULT_INSTANCE;
            }
            C208419n r2 = (C208419n) r02.A0H();
            r2.A0A(jid.getRawString());
            byte[] bArr = r1.A01;
            C626936e.A06(bArr);
            r2.A09(AnonymousClass0x9.A0J(bArr));
            AnonymousClass1EU A0T = C18290x4.A0T(A0G);
            AnonymousClass1BQ r03 = (AnonymousClass1BQ) r2.A06();
            r03.getClass();
            A0T.fastRatchetKeySenderKeyDistributionMessage_ = r03;
            A0T.bitField0_ |= 16384;
            return AnonymousClass0x9.A0W(A0G);
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendLiveLocationKeyJob(com.whatsapp.jid.DeviceJid r3, byte[] r4, int r5) {
        /*
            r2 = this;
            X.2gM r1 = X.C49332gM.A01()
            if (r4 == 0) goto L_0x0010
            int r0 = r4.length
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "cannot use empty old alice base key"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x0010:
            com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement
            r0.<init>(r3)
            r1.A05(r0)
            if (r4 == 0) goto L_0x0022
            com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement
            r0.<init>(r3, r4)
            r1.A05(r0)
        L_0x0022:
            java.lang.String r0 = "SendLiveLocationKeyJob"
            X.C49332gM.A03(r0, r1)
            org.whispersystems.jobqueue.JobParameters r0 = r1.A04()
            r2.<init>(r0)
            if (r5 < 0) goto L_0x0046
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()
            r2.rawJids = r1
            com.whatsapp.jid.UserJid r0 = r3.userJid
            java.lang.String r0 = r0.getRawString()
            r1.add(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r2.retryCount = r0
            return
        L_0x0046:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "retryCount cannot be negative"
            r1.append(r0)
            java.lang.String r0 = r2.A09()
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendLiveLocationKeyJob.<init>(com.whatsapp.jid.DeviceJid, byte[], int):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        ArrayList arrayList = this.rawJids;
        if (arrayList == null || arrayList.isEmpty()) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("jids must not be empty");
            throw C18270x1.A0C(A09(), A0o);
        }
        Integer num = this.retryCount;
        if (num != null && num.intValue() < 0) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("retryCount cannot be negative");
            throw C18270x1.A0C(A09(), A0o2);
        }
    }

    public final String A09() {
        StringBuilder A0o = AnonymousClass001.A0o();
        C18270x1.A1I(A0o, this);
        A0o.append("; jids.size()=");
        A0o.append(this.rawJids.size());
        A0o.append("; retryCount=");
        return AnonymousClass000.A0R(this.retryCount, A0o);
    }

    public void Bm4(Context context) {
        C64333Db A002 = C389229y.A00(context);
        this.A00 = A002.BL4();
        this.A03 = (C48972fm) A002.AW6.get();
        this.A02 = C64333Db.A2v(A002);
        this.A05 = (C61222zu) A002.AJD.get();
        this.A01 = (C55492qR) A002.AR3.get();
        this.A04 = (C621233o) A002.AJA.get();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendLiveLocationKeyJob(java.util.List r5) {
        /*
            r4 = this;
            X.2gM r3 = X.C49332gM.A01()
            java.util.Iterator r2 = r5.iterator()
        L_0x0008:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0024
            com.whatsapp.jid.UserJid r0 = X.C18310x6.A0T(r2)
            if (r0 == 0) goto L_0x0008
            com.whatsapp.jid.DeviceJid r1 = r0.getPrimaryDevice()
            X.C626936e.A06(r1)
            com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement
            r0.<init>(r1)
            r3.A05(r0)
            goto L_0x0008
        L_0x0024:
            java.lang.String r0 = "SendLiveLocationKeyJob"
            X.C49332gM.A03(r0, r3)
            org.whispersystems.jobqueue.JobParameters r0 = r3.A04()
            r4.<init>(r0)
            java.lang.String r0 = ""
            X.C626936e.A09(r0, r5)
            java.util.ArrayList r0 = X.C18300x5.A0u(r5)
            X.C627336j.A0H(r5, r0)
            r4.rawJids = r0
            r0 = 0
            r4.retryCount = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendLiveLocationKeyJob.<init>(java.util.List):void");
    }
}
