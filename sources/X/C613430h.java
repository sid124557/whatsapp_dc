package X;

import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.SparseIntArray;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.30h  reason: invalid class name and case insensitive filesystem */
public class C613430h {
    public int A00 = 0;
    public HandlerThread A01;
    public AnonymousClass31C A02;
    public final SparseIntArray A03 = new SparseIntArray();
    public final C55682qk A04;
    public final AnonymousClass1VX A05;
    public final C52552lf A06;
    public final C52982mM A07;
    public final C50122hf A08;
    public final C48142eQ A09;
    public final C18800yH A0A;
    public final AnonymousClass4EZ A0B = new AnonymousClass4KQ(this, 5);
    public final Object A0C = AnonymousClass002.A0D();
    public final List A0D = AnonymousClass001.A0s();
    public final Map A0E = AnonymousClass001.A0t();
    public final Map A0F = AnonymousClass001.A0t();

    public void A01(Message message, int i) {
        message.what = 1;
        message.arg1 = i;
        this.A0A.sendMessage(message);
    }

    public static /* synthetic */ void A00(C613430h r3, String str, boolean z) {
        AnonymousClass4EZ r1;
        if (z) {
            C52552lf r12 = r3.A06;
            C626936e.A07(str, "Can't remove message with null id");
            List list = r12.A00;
            synchronized (list) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (str.equals(((AnonymousClass2OW) it.next()).A01)) {
                        it.remove();
                    }
                }
            }
        }
        synchronized (r3.A0C) {
            r1 = (AnonymousClass4EZ) r3.A0F.remove(str);
            if (r1 == null) {
                r1 = (AnonymousClass4EZ) r3.A0E.remove(str);
            }
        }
        C52982mM r32 = r3.A07;
        r32.A00((Integer) null, str, 4);
        r32.A01(str);
        if (r1 != null) {
            r1.BQs(str);
        } else {
            C18260x0.A0s("XmppIncomingMessageRouter/ignoring failure due to missing callback for iqId:", str, AnonymousClass001.A0o());
        }
        r32.A02(str, (Integer) null);
    }

    public void A02(AnonymousClass31C r1) {
        this.A02 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r1 == r9.A0B) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.AnonymousClass4EZ r10, java.lang.String r11, int r12, long r13, boolean r15) {
        /*
            r9 = this;
            java.lang.Object r4 = r9.A0C
            monitor-enter(r4)
            java.util.Map r0 = r9.A0E     // Catch:{ all -> 0x00a0 }
            boolean r0 = r0.containsKey(r11)     // Catch:{ all -> 0x00a0 }
            r5 = 1
            boolean r2 = X.AnonymousClass000.A1T(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00a0 }
            java.lang.String r0 = "Pending iq-callback for id:"
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r11, r1)     // Catch:{ all -> 0x00a0 }
            X.C626936e.A0F(r2, r0)     // Catch:{ all -> 0x00a0 }
            java.util.Map r0 = r9.A0F     // Catch:{ all -> 0x00a0 }
            java.lang.Object r1 = r0.put(r11, r10)     // Catch:{ all -> 0x00a0 }
            X.4EZ r1 = (X.AnonymousClass4EZ) r1     // Catch:{ all -> 0x00a0 }
            if (r1 == 0) goto L_0x002a
            X.4EZ r0 = r9.A0B     // Catch:{ all -> 0x00a0 }
            r2 = 0
            if (r1 != r0) goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00a0 }
            java.lang.String r0 = "Pending request for id:"
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r11, r1)     // Catch:{ all -> 0x00a0 }
            X.C626936e.A0F(r2, r0)     // Catch:{ all -> 0x00a0 }
            r1 = 0
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0055
            X.0yH r3 = r9.A0A     // Catch:{ all -> 0x00a0 }
            if (r15 != 0) goto L_0x0043
            r5 = 0
        L_0x0043:
            X.30h r0 = r3.A01     // Catch:{ all -> 0x00a0 }
            X.0yH r2 = r0.A0A     // Catch:{ all -> 0x00a0 }
            r1 = 4
            r0 = 0
            android.os.Message r0 = r2.obtainMessage(r1, r5, r0, r11)     // Catch:{ all -> 0x00a0 }
            r2.sendMessageDelayed(r0, r13)     // Catch:{ all -> 0x00a0 }
            java.util.concurrent.ConcurrentMap r0 = r3.A00     // Catch:{ all -> 0x00a0 }
            r0.put(r11, r11)     // Catch:{ all -> 0x00a0 }
        L_0x0055:
            monitor-exit(r4)     // Catch:{ all -> 0x00a0 }
            X.2mM r4 = r9.A07
            java.util.concurrent.ConcurrentHashMap r3 = r4.A03
            boolean r0 = r3.containsKey(r11)
            if (r0 != 0) goto L_0x008e
            X.2TM r2 = new X.2TM
            r2.<init>()
            r2.A00 = r12
            long r0 = android.os.SystemClock.uptimeMillis()
            r2.A05 = r0
            r3.put(r11, r2)
            X.316 r2 = r4.A02
            int r5 = r11.hashCode()
            java.lang.String r1 = "IqMessagePerfLoggerInterceptor"
            r0 = 1
            r2.A06(r5, r1, r0)
            java.lang.String r6 = "iq_type"
            long r7 = (long) r12
            X.8JP r3 = r2.A0C
            X.2ck r0 = r2.A0A
            int r4 = r0.A07
            r3.markerAnnotate((int) r4, (int) r5, (java.lang.String) r6, (long) r7)
            java.lang.String r0 = "iq_queue"
            r2.A04(r5, r0)
            return
        L_0x008e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "IqPerfLogger/onIqMessageQueued already exists iqId="
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = " iqSendType="
            X.C18260x0.A0x(r0, r1, r12)
            return
        L_0x00a0:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00a0 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C613430h.A03(X.4EZ, java.lang.String, int, long, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (r2 == r4.A0B) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.Object r3 = r4.A0C
            monitor-enter(r3)
            java.util.Map r0 = r4.A0F     // Catch:{ all -> 0x0018 }
            java.lang.Object r2 = r0.remove(r5)     // Catch:{ all -> 0x0018 }
            X.4EZ r2 = (X.AnonymousClass4EZ) r2     // Catch:{ all -> 0x0018 }
            if (r2 == 0) goto L_0x0012
            X.4EZ r1 = r4.A0B     // Catch:{ all -> 0x0018 }
            r0 = 0
            if (r2 != r1) goto L_0x0013
        L_0x0012:
            r0 = 1
        L_0x0013:
            X.C626936e.A0C(r0)     // Catch:{ all -> 0x0018 }
            monitor-exit(r3)     // Catch:{ all -> 0x0018 }
            return
        L_0x0018:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0018 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C613430h.A05(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r4.A0E.isEmpty() == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(boolean r5) {
        /*
            r4 = this;
            java.lang.Object r3 = r4.A0C
            monitor-enter(r3)
            java.util.Map r0 = r4.A0F     // Catch:{ all -> 0x0044 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0014
            java.util.Map r0 = r4.A0E     // Catch:{ all -> 0x0044 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0044 }
            r2 = 0
            if (r0 != 0) goto L_0x0015
        L_0x0014:
            r2 = 1
        L_0x0015:
            if (r5 != 0) goto L_0x0038
            if (r2 != 0) goto L_0x0038
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = "XmppIncomingMessageRouter/resetIqIdCounter sendingChannelHasPendingXmpp:"
            r1.append(r0)     // Catch:{ all -> 0x0046 }
            r1.append(r5)     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = " hasPendingIqCallbacks:"
            X.C18260x0.A1D(r0, r1, r2)     // Catch:{ all -> 0x0046 }
            r0 = 0
            r4.A00 = r0     // Catch:{ all -> 0x0046 }
            X.0yH r1 = r4.A0A     // Catch:{ all -> 0x0046 }
            r0 = 4
            r1.removeMessages(r0)     // Catch:{ all -> 0x0046 }
            java.util.concurrent.ConcurrentMap r0 = r1.A00     // Catch:{ all -> 0x0046 }
            r0.clear()     // Catch:{ all -> 0x0046 }
        L_0x0038:
            monitor-exit(r3)     // Catch:{ all -> 0x0046 }
            X.0yH r1 = r4.A0A
            r0 = 3
            android.os.Message r0 = r1.obtainMessage(r0)
            r0.sendToTarget()
            return
        L_0x0044:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0046 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C613430h.A06(boolean):void");
    }

    public boolean A07(int i) {
        int i2 = this.A03.get(i, -1);
        if (i2 < 0 || i2 >= this.A0D.size()) {
            return false;
        }
        return true;
    }

    public C613430h(C55682qk r4, AnonymousClass1VX r5, C52552lf r6, C52982mM r7, C50122hf r8, C48142eQ r9) {
        this.A05 = r5;
        this.A04 = r4;
        this.A07 = r7;
        this.A09 = r9;
        this.A06 = r6;
        this.A08 = r8;
        HandlerThread handlerThread = new HandlerThread("XmppMessageRouter", 1);
        this.A01 = handlerThread;
        handlerThread.start();
        this.A0A = new C18800yH(this.A01.getLooper(), this);
    }

    public final void A04(AnonymousClass36K r8, String str) {
        AnonymousClass4EZ r1;
        C18260x0.A0q("XmppIncomingMessageRouter/iq-response; id=", str, AnonymousClass001.A0o());
        synchronized (this.A0C) {
            r1 = (AnonymousClass4EZ) this.A0E.remove(str);
        }
        if (r1 != null) {
            C52982mM r5 = this.A07;
            r5.A01(str);
            String A0r = r8.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null);
            try {
                if ("result".equals(A0r)) {
                    r1.BdM(r8, str);
                } else if ("error".equals(A0r)) {
                    r1.BSN(r8, str);
                } else {
                    StringBuilder A032 = C55682qk.A03(this.A04, "unexpected_recv_iq_type", A0r, false);
                    A032.append("Unexpected type=");
                    A032.append(A0r);
                    C626936e.A0D(false, AnonymousClass000.A0V(" for iq=", str, A032));
                }
                r5.A02(str, (Integer) null);
            } catch (AnonymousClass24Y e) {
                C18260x0.A0v("XmppIncomingMessageRouter/handleIncomingIqResponse/corrupt-stream-error iqId=", str, AnonymousClass001.A0o(), e);
                this.A04.A0A("CorruptStreamException", false, AnonymousClass000.A0a("source=XmppIncomingMessageRouter:iq message=", AnonymousClass001.A0o(), e));
                r5.A02(str, C18280x3.A0S());
            }
        } else {
            C18260x0.A0s("XmppIncomingMessageRouter/ignoring response due to missing callback for iqId:", str, AnonymousClass001.A0o());
        }
    }

    public boolean A08(AnonymousClass36K r8, String str) {
        C18800yH r3;
        AnonymousClass4EZ r0;
        String A0L = AnonymousClass36K.A0L(r8, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        if ("result".equals(A0L)) {
            C52982mM r6 = this.A07;
            AnonymousClass2TM r5 = (AnonymousClass2TM) r6.A03.get(str);
            if (r5 != null && r5.A06 == 0) {
                r5.A06 = SystemClock.uptimeMillis();
                AnonymousClass316 r2 = r6.A02;
                int hashCode = str.hashCode();
                r2.A03(hashCode, "iq_send");
                r2.A04(hashCode, "iq_processing_queue");
            }
        } else if ("error".equals(A0L)) {
            this.A07.A00(Integer.valueOf(C57492tj.A01(r8)), str, 3);
        }
        synchronized (this.A0C) {
            r3 = this.A0A;
            Object remove = r3.A00.remove(str);
            if (remove != null) {
                r3.removeMessages(4, remove);
            }
            r0 = (AnonymousClass4EZ) this.A0E.get(str);
        }
        if (r0 == null) {
            C18260x0.A0s("xmppIncomingMessageRouter/handleIqResponse no callback found for id=", str, AnonymousClass001.A0o());
            return false;
        } else if (!(r0 instanceof C68253Sl) || !this.A05.A0Y(C58422vE.A02, 5003)) {
            Message obtainMessage = r3.obtainMessage(2, r8);
            obtainMessage.getData().putString("iqId", str);
            obtainMessage.sendToTarget();
            return true;
        } else {
            Log.d("xmppIncomingMessageRouter/handleIqResponse processing an iq response early");
            A04(r8, str);
            return true;
        }
    }
}
