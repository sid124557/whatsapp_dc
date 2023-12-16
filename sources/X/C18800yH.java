package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.0yH  reason: invalid class name and case insensitive filesystem */
public class C18800yH extends Handler {
    public final ConcurrentMap A00 = AnonymousClass0x9.A1D();
    public final /* synthetic */ C613430h A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18800yH(Looper looper, C613430h r3) {
        super(looper);
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009a, code lost:
        if (r5 >= r3.A0D.size()) goto L_0x009c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r11) {
        /*
            r10 = this;
            int r0 = r11.what
            r4 = 0
            switch(r0) {
                case 1: goto L_0x007d;
                case 2: goto L_0x023b;
                case 3: goto L_0x0151;
                case 4: goto L_0x0133;
                case 5: goto L_0x0120;
                case 6: goto L_0x0007;
                default: goto L_0x0006;
            }
        L_0x0006:
            return
        L_0x0007:
            java.lang.Object r3 = r11.obj
            X.39T r3 = (X.AnonymousClass39T) r3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "XmppIncomingMessageRouter/handle-ack-received; stanzaKey="
            X.C18260x0.A1P(r1, r0, r3)
            X.30h r4 = r10.A01
            X.2hf r5 = r4.A08
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "received ack; stanzaKey="
            X.C18260x0.A1R(r1, r0, r3)
            java.util.Map r1 = r5.A05
            monitor-enter(r1)
            java.lang.Object r2 = r1.remove(r3)     // Catch:{ all -> 0x0252 }
            X.4Di r2 = (X.C84694Di) r2     // Catch:{ all -> 0x0252 }
            monitor-exit(r1)     // Catch:{ all -> 0x0252 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "handleAck callback found and removed: "
            r1.append(r0)
            boolean r0 = X.AnonymousClass000.A1W(r2)
            X.C18260x0.A1U(r1, r0)
            if (r2 == 0) goto L_0x0042
            r0 = 0
            r2.BQt(r0)
        L_0x0042:
            if (r3 == 0) goto L_0x005c
            java.lang.String r1 = r3.A05
            java.lang.String r0 = "message"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0057
            java.lang.String r0 = "receipt"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005c
        L_0x0057:
            X.3Qu r0 = r5.A04
            r0.A03()
        L_0x005c:
            X.2eQ r1 = r4.A09
            java.lang.String r2 = r3.A07
            java.lang.String r0 = "message acked with null id"
            X.C626936e.A07(r2, r0)
            java.lang.String r0 = "remove ackable message with null id"
            X.C626936e.A07(r2, r0)
            java.util.LinkedHashMap r1 = r1.A00
            monitor-enter(r1)
            java.lang.Object r0 = r1.remove(r2)     // Catch:{ all -> 0x024f }
            boolean r0 = X.AnonymousClass000.A1W(r0)
            monitor-exit(r1)     // Catch:{ all -> 0x024f }
            if (r0 == 0) goto L_0x0006
            r1.size()
            return
        L_0x007d:
            X.30h r3 = r10.A01
            int r6 = r11.arg1
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "XmppIncomingMessageRouter/handleIncomingXmppMessage recvType:"
            X.C18260x0.A0w(r0, r1, r6)
            android.util.SparseIntArray r1 = r3.A03
            r0 = -1
            int r5 = r1.get(r6, r0)
            if (r5 < 0) goto L_0x009c
            java.util.List r0 = r3.A0D
            int r1 = r0.size()
            r0 = 1
            if (r5 < r1) goto L_0x009d
        L_0x009c:
            r0 = 0
        L_0x009d:
            X.C626936e.A0C(r0)
            java.util.List r2 = r3.A0D     // Catch:{ 24Y -> 0x00c5 }
            java.lang.Object r0 = r2.get(r5)     // Catch:{ 24Y -> 0x00c5 }
            X.4DA r0 = (X.AnonymousClass4DA) r0     // Catch:{ 24Y -> 0x00c5 }
            boolean r0 = r0.BFA(r11, r6)     // Catch:{ 24Y -> 0x00c5 }
            if (r0 != 0) goto L_0x0006
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 24Y -> 0x00c5 }
            java.lang.String r0 = "Registered handler:"
            r1.append(r0)     // Catch:{ 24Y -> 0x00c5 }
            java.lang.Object r0 = r2.get(r5)     // Catch:{ 24Y -> 0x00c5 }
            r1.append(r0)     // Catch:{ 24Y -> 0x00c5 }
            java.lang.String r0 = " can't handle message of type:"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0G(r0, r1, r6)     // Catch:{ 24Y -> 0x00c5 }
            throw r0     // Catch:{ 24Y -> 0x00c5 }
        L_0x00c5:
            r5 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "XmppIncomingMessageRouter/handleIncomingXmppMessage/corrupt-stream-error/stanza "
            r1.append(r0)
            java.lang.String r0 = r5.bufString
            X.C18260x0.A1M(r1, r0)
            java.lang.String r0 = "XmppIncomingMessageRouter/handleIncomingXmppMessage/corrupt-stream-error"
            com.whatsapp.util.Log.w(r0, r5)
            X.2qk r2 = r3.A04
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "source=XmppIncomingMessageRouter recvType="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " error="
            java.lang.String r1 = X.AnonymousClass000.A0a(r0, r1, r5)
            java.lang.String r0 = "CorruptStreamException"
            r2.A0A(r0, r4, r1)
            android.os.Bundle r1 = r11.getData()
            java.lang.String r0 = "stanzaKey"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            X.39T r0 = (X.AnonymousClass39T) r0
            if (r0 == 0) goto L_0x0006
            X.31C r5 = r3.A02
            if (r5 == 0) goto L_0x0006
            X.2i8 r4 = r0.A02()
            java.lang.String r3 = "error"
            r2 = 487(0x1e7, float:6.82E-43)
            java.util.Map r1 = r4.A09
            X.39V r0 = new X.39V
            r0.<init>((java.lang.String) r3, (int) r2)
            r1.put(r3, r0)
            X.39T r0 = r4.A01()
            r5.A0H(r0)
            return
        L_0x0120:
            java.lang.Object r2 = r11.obj
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "XmppIncomingMessageRouter/iq-delivery-failure; id="
            X.C18260x0.A0q(r0, r2, r1)
            X.30h r0 = r10.A01
            X.C613430h.A00(r0, r2, r4)
            return
        L_0x0133:
            java.lang.Object r2 = r11.obj
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "XmppIncomingMessageRouter/iq-delivery-timeout; id="
            X.C18260x0.A0q(r0, r2, r1)
            X.30h r1 = r10.A01
            int r0 = r11.arg1
            boolean r0 = X.C18310x6.A1W(r0)
            X.C613430h.A00(r1, r2, r0)
            java.util.concurrent.ConcurrentMap r0 = r10.A00
            r0.remove(r2)
            return
        L_0x0151:
            X.30h r7 = r10.A01
            java.lang.Object r2 = r7.A0C
            monitor-enter(r2)
            java.util.Map r1 = r7.A0E     // Catch:{ all -> 0x0238 }
            java.util.Set r0 = r1.entrySet()     // Catch:{ all -> 0x0238 }
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r0)     // Catch:{ all -> 0x0238 }
            r1.clear()     // Catch:{ all -> 0x0238 }
            monitor-exit(r2)     // Catch:{ all -> 0x0238 }
            java.util.Iterator r6 = r0.iterator()
        L_0x0168:
            boolean r0 = r6.hasNext()
            r5 = 4
            if (r0 == 0) goto L_0x018d
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r6)
            java.lang.String r3 = X.C18310x6.A0q(r0)
            X.2mM r2 = r7.A07
            r1 = 0
            r2.A00(r1, r3, r5)
            r2.A01(r3)
            java.lang.Object r0 = r0.getValue()
            X.4EZ r0 = (X.AnonymousClass4EZ) r0
            r0.BQs(r3)
            r2.A02(r3, r1)
            goto L_0x0168
        L_0x018d:
            X.2hf r7 = r7.A08
            java.util.Map r3 = r7.A05
            monitor-enter(r3)
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0235 }
            java.util.Iterator r9 = X.C18280x3.A0i(r3)     // Catch:{ all -> 0x0233 }
        L_0x019a:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0233 }
            if (r0 == 0) goto L_0x01d4
            java.lang.Object r8 = r9.next()     // Catch:{ all -> 0x0233 }
            X.39T r8 = (X.AnonymousClass39T) r8     // Catch:{ all -> 0x0233 }
            java.lang.String r1 = "message"
            java.lang.String r0 = r8.A05     // Catch:{ all -> 0x0233 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0233 }
            if (r0 == 0) goto L_0x019a
            java.lang.String r1 = r8.A06     // Catch:{ all -> 0x0233 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0233 }
            r6 = 0
            if (r0 == 0) goto L_0x01bb
            r2 = 0
            goto L_0x01bf
        L_0x01bb:
            int r2 = java.lang.Integer.parseInt(r1)     // Catch:{ all -> 0x0233 }
        L_0x01bf:
            com.whatsapp.jid.Jid r0 = r8.A02     // Catch:{ all -> 0x0233 }
            X.4uZ r1 = X.C627336j.A02(r0)     // Catch:{ all -> 0x0233 }
            r0 = 8
            if (r2 == r0) goto L_0x01ca
            r6 = 1
        L_0x01ca:
            java.lang.String r0 = r8.A07     // Catch:{ all -> 0x0233 }
            X.2z0 r0 = X.AnonymousClass2z0.A05(r1, r0, r6)     // Catch:{ all -> 0x0233 }
            r5.add(r0)     // Catch:{ all -> 0x0233 }
            goto L_0x019a
        L_0x01d4:
            X.30H r2 = r7.A00     // Catch:{ all -> 0x0235 }
            java.lang.StringBuilder r1 = X.C18290x4.A0u(r2)     // Catch:{ all -> 0x0235 }
            java.lang.String r0 = "message-handler-callback/onMessageHandlerAckTimeout/keys:"
            X.C18260x0.A1R(r1, r0, r5)     // Catch:{ all -> 0x0235 }
            X.4FS r1 = r2.A0x     // Catch:{ all -> 0x0235 }
            X.3cY r0 = new X.3cY     // Catch:{ all -> 0x0235 }
            r0.<init>((X.AnonymousClass30H) r2, (java.util.List) r5)     // Catch:{ all -> 0x0235 }
            r1.BkM(r0)     // Catch:{ all -> 0x0235 }
            java.lang.String r0 = "disconnected"
            java.io.IOException r6 = X.AnonymousClass002.A0C(r0)     // Catch:{ all -> 0x0235 }
            java.util.Iterator r5 = X.AnonymousClass000.A0q(r3)     // Catch:{ all -> 0x0235 }
        L_0x01f3:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0235 }
            if (r0 == 0) goto L_0x0217
            java.util.Map$Entry r2 = X.AnonymousClass001.A0w(r5)     // Catch:{ all -> 0x0235 }
            java.lang.Object r0 = r2.getValue()     // Catch:{ all -> 0x0235 }
            X.4Di r0 = (X.C84694Di) r0     // Catch:{ all -> 0x0235 }
            r0.BQr(r6)     // Catch:{ all -> 0x0235 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0235 }
            java.lang.String r0 = "clearing ack callback for "
            r1.append(r0)     // Catch:{ all -> 0x0235 }
            java.lang.Object r0 = r2.getKey()     // Catch:{ all -> 0x0235 }
            X.C18260x0.A0m(r0, r1)     // Catch:{ all -> 0x0235 }
            goto L_0x01f3
        L_0x0217:
            r3.clear()     // Catch:{ all -> 0x0235 }
            X.3Qu r0 = r7.A04     // Catch:{ all -> 0x0235 }
            java.util.concurrent.atomic.AtomicInteger r2 = r0.A0K     // Catch:{ all -> 0x0235 }
            r2.set(r4)     // Catch:{ all -> 0x0235 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0235 }
            java.lang.String r0 = "XmppConnectionMetrics all outgoing stanza processing finished counter:"
            r1.append(r0)     // Catch:{ all -> 0x0235 }
            int r0 = r2.get()     // Catch:{ all -> 0x0235 }
            X.C18260x0.A1G(r1, r0)     // Catch:{ all -> 0x0235 }
            monitor-exit(r3)     // Catch:{ all -> 0x0235 }
            return
        L_0x0233:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0235 }
        L_0x0235:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0235 }
            throw r0
        L_0x0238:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0238 }
            throw r0
        L_0x023b:
            android.os.Bundle r1 = r11.getData()
            java.lang.String r0 = "iqId"
            java.lang.String r2 = r1.getString(r0)
            X.30h r1 = r10.A01
            java.lang.Object r0 = r11.obj
            X.36K r0 = (X.AnonymousClass36K) r0
            r1.A04(r0, r2)
            return
        L_0x024f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x024f }
            throw r0
        L_0x0252:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0252 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18800yH.handleMessage(android.os.Message):void");
    }
}
