package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2ss  reason: invalid class name and case insensitive filesystem */
public class C56982ss {
    public boolean A00;
    public final AnonymousClass4EA A01;
    public final AnonymousClass1VX A02;
    public final HashSet A03 = AnonymousClass002.A0K();
    public final ConcurrentHashMap A04;
    public volatile C40412Fs A05;
    public volatile boolean A06;

    public static AnonymousClass31A A00(C56982ss r1, C95814uZ r2) {
        return r1.A0A(r2, false);
    }

    public int A05(C95814uZ r6, C95814uZ r7) {
        if (r6 == null && r7 == null) {
            return 0;
        }
        if (r6 != null) {
            if (r7 != null) {
                AnonymousClass31A A0A = A0A(r6, false);
                AnonymousClass31A A0A2 = A0A(r7, false);
                if (A0A == null) {
                    if (A0A2 == null) {
                        return 0;
                    }
                } else if (A0A2 != null) {
                    return Long.compare(A0A2.A02(), A0A.A02());
                }
            }
            return 1;
        }
        return -1;
    }

    public C624134x A0C(C95814uZ r4) {
        if (r4 == null) {
            Log.e("msgstore/last/message/jid is null");
            return null;
        }
        AnonymousClass31A A002 = A00(this, r4);
        if (A002 != null) {
            return A002.A0d;
        }
        C18260x0.A1S(AnonymousClass001.A0o(), "msgstore/last/message/no chat for ", r4);
        return null;
    }

    public String A0D(C95814uZ r3) {
        AnonymousClass31A A012;
        if (r3 == null || (A012 = A01(this, r3)) == null) {
            return null;
        }
        return A012.A0h;
    }

    public synchronized Collection A0E() {
        return A0G().values();
    }

    public synchronized Set A0F() {
        return A0G().keySet();
    }

    public synchronized void A0H(AnonymousClass31A r3, C95814uZ r4) {
        if (r4 != null) {
            A0G().put(r4, r3);
            if (r3.A0j) {
                this.A03.add(r4);
            }
            if ((r4 instanceof C95804uY) && !(r3 instanceof AnonymousClass1RL)) {
                String A0X = AnonymousClass000.A0X("non-newsletter chat", AnonymousClass000.A0l("chatscache/logIfChatInfoMismatch newsletter jid cached with "));
                Log.e(A0X, AnonymousClass001.A0c(A0X));
            }
        }
    }

    public synchronized void A0I(C95814uZ r2) {
        if (r2 != null) {
            A0G().remove(r2);
            this.A03.remove(r2);
        }
    }

    public synchronized void A0J(C624134x r7) {
        AnonymousClass31A A002 = A00(this, r7.A1J.A00);
        if (A002 != null) {
            C624134x r0 = A002.A0d;
            if (r0 != null && r0.A1L == r7.A1L) {
                A002.A0d = r7;
            }
            C624134x r02 = A002.A0c;
            if (r02 != null && r02.A1L == r7.A1L) {
                A002.A0c = r7;
            }
        }
    }

    public synchronized void A0K(AnonymousClass2z0 r4) {
        AnonymousClass31A A002 = A00(this, r4.A00);
        if (A002 != null) {
            C624134x r0 = A002.A0d;
            if (r0 != null && r0.A1J.equals(r4)) {
                A002.A0d = null;
            }
            C624134x r02 = A002.A0c;
            if (r02 != null && r02.A1J.equals(r4)) {
                A002.A0c = null;
            }
            C41862Lw r03 = A002.A0f;
            if (r03 != null && r03.A00.A1J.equals(r4)) {
                A002.A0f = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r0 = A01(r2, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0P(X.C95814uZ r3) {
        /*
            r2 = this;
            r1 = 0
            if (r3 == 0) goto L_0x000e
            X.31A r0 = A01(r2, r3)
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.A0j
            if (r0 == 0) goto L_0x000e
            r1 = 1
        L_0x000e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56982ss.A0P(X.4uZ):boolean");
    }

    public int A06(GroupJid groupJid) {
        if (!this.A02.A0Y(C58422vE.A02, 982)) {
            return 0;
        }
        return A07(groupJid);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass31A A0A(X.C95814uZ r8, boolean r9) {
        /*
            r7 = this;
            if (r8 == 0) goto L_0x005a
            if (r9 == 0) goto L_0x000b
            java.util.List r0 = java.util.Collections.singletonList(r8)
        L_0x0008:
            r6 = r7
            monitor-enter(r6)
            goto L_0x0012
        L_0x000b:
            X.4EA r0 = r7.A01
            java.util.List r0 = r0.B8t(r8)
            goto L_0x0008
        L_0x0012:
            java.util.concurrent.ConcurrentHashMap r5 = r7.A0G()     // Catch:{ all -> 0x0056 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x0056 }
        L_0x001a:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x0059
            X.4uZ r2 = X.C18300x5.A0P(r4)     // Catch:{ all -> 0x0056 }
            java.lang.Object r3 = r5.get(r2)     // Catch:{ all -> 0x0056 }
            X.31A r3 = (X.AnonymousClass31A) r3     // Catch:{ all -> 0x0056 }
            if (r3 == 0) goto L_0x001a
            boolean r0 = r3.A0o     // Catch:{ all -> 0x0056 }
            if (r0 != 0) goto L_0x004a
            X.4uZ r2 = r3.A0q     // Catch:{ all -> 0x0056 }
            boolean r0 = r8.equals(r2)     // Catch:{ all -> 0x0056 }
            if (r0 != 0) goto L_0x0054
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = "chatscache/logifnormalized jid normalized in getchat; input-jid="
            r1.append(r0)     // Catch:{ all -> 0x0056 }
            r1.append(r8)     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = ", output-jid="
            X.C18260x0.A1P(r1, r0, r2)     // Catch:{ all -> 0x0056 }
            goto L_0x0054
        L_0x004a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = "chatscache/getChatInternal skipped hidden chatInfo for jid: "
            X.C18260x0.A1P(r1, r0, r2)     // Catch:{ all -> 0x0056 }
            goto L_0x001a
        L_0x0054:
            monitor-exit(r6)
            return r3
        L_0x0056:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0059:
            monitor-exit(r6)
        L_0x005a:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56982ss.A0A(X.4uZ, boolean):X.31A");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x01dd */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.concurrent.ConcurrentHashMap A0G() {
        /*
            r12 = this;
            X.2Fs r0 = r12.A05
            if (r0 != 0) goto L_0x000b
            boolean r0 = r12.A06
            if (r0 != 0) goto L_0x000b
        L_0x0008:
            java.util.concurrent.ConcurrentHashMap r0 = r12.A04
            return r0
        L_0x000b:
            monitor-enter(r12)
            X.2Fs r1 = r12.A05     // Catch:{ all -> 0x01e6 }
            if (r1 == 0) goto L_0x01df
            r6 = 1
            r12.A06 = r6     // Catch:{ all -> 0x01e6 }
            r0 = 0
            r12.A05 = r0     // Catch:{ all -> 0x01e6 }
            r4 = 0
            X.2sA r0 = r1.A00     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            X.8qC r7 = r0.A02     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            X.2UO r0 = X.C18310x6.A0Q(r7)     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            X.3dV r0 = r0.A0G     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            boolean r0 = X.C72303dV.A00(r0)     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            if (r0 == 0) goto L_0x01cc
            X.2UO r0 = X.C18310x6.A0Q(r7)     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            X.2sF r0 = r0.A0R     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            java.lang.String r2 = "ChatManager_loadChats"
            r0.A07(r2)     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            X.2UO r0 = X.C18310x6.A0Q(r7)     // Catch:{ IllegalStateException -> 0x0096 }
            X.3dV r0 = r0.A0G     // Catch:{ IllegalStateException -> 0x0096 }
            X.4GK r10 = r0.get()     // Catch:{ IllegalStateException -> 0x0096 }
            X.2UO r0 = X.C18310x6.A0Q(r7)     // Catch:{ all -> 0x008c }
            X.2sm r0 = r0.A0C     // Catch:{ all -> 0x008c }
            java.util.Map r1 = r0.A0D()     // Catch:{ all -> 0x008c }
            X.2UO r0 = X.C18310x6.A0Q(r7)     // Catch:{ all -> 0x008c }
            X.2f2 r0 = r0.A0D     // Catch:{ all -> 0x008c }
            r0.A01(r1)     // Catch:{ all -> 0x008c }
            X.2UO r0 = X.C18310x6.A0Q(r7)     // Catch:{ all -> 0x008c }
            X.2sL r9 = r0.A0H     // Catch:{ all -> 0x008c }
            java.util.List r0 = r9.A04()     // Catch:{ all -> 0x008c }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x008c }
        L_0x005d:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x0071
            java.lang.Object r5 = r8.next()     // Catch:{ all -> 0x008c }
            X.1RL r5 = (X.AnonymousClass1RL) r5     // Catch:{ all -> 0x008c }
            X.2ss r3 = r9.A02     // Catch:{ all -> 0x008c }
            X.4uZ r0 = r5.A0q     // Catch:{ all -> 0x008c }
            r3.A0H(r5, r0)     // Catch:{ all -> 0x008c }
            goto L_0x005d
        L_0x0071:
            X.2UO r0 = X.C18310x6.A0Q(r7)     // Catch:{ all -> 0x008c }
            X.2so r0 = r0.A03     // Catch:{ all -> 0x008c }
            boolean r0 = r0.A0C()     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x0088
            X.2UO r0 = X.C18310x6.A0Q(r7)     // Catch:{ all -> 0x008c }
            X.2so r0 = r0.A03     // Catch:{ all -> 0x008c }
            X.2rM r0 = r0.A0H     // Catch:{ all -> 0x008c }
            r0.A01()     // Catch:{ all -> 0x008c }
        L_0x0088:
            r10.close()     // Catch:{ IllegalStateException -> 0x0096 }
            goto L_0x00de
        L_0x008c:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x0091 }
            goto L_0x0095
        L_0x0091:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IllegalStateException -> 0x0096 }
        L_0x0095:
            throw r1     // Catch:{ IllegalStateException -> 0x0096 }
        L_0x0096:
            r1 = move-exception
            java.lang.String r0 = "msgstore-manager/finish"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x01c1 }
            X.2UO r0 = X.C18310x6.A0Q(r7)     // Catch:{ all -> 0x01c1 }
            X.3dV r0 = r0.A0G     // Catch:{ all -> 0x01c1 }
            r0.A05()     // Catch:{ all -> 0x01c1 }
            X.0xz r0 = r0.A04     // Catch:{ all -> 0x01c1 }
            r0.close()     // Catch:{ all -> 0x01c1 }
            X.2UO r0 = X.C18310x6.A0Q(r7)     // Catch:{ all -> 0x01c1 }
            X.2fp r0 = r0.A0K     // Catch:{ all -> 0x01c1 }
            r0.A01()     // Catch:{ all -> 0x01c1 }
            X.2UO r0 = X.C18310x6.A0Q(r7)     // Catch:{ all -> 0x01c1 }
            X.2sm r0 = r0.A0C     // Catch:{ all -> 0x01c1 }
            java.util.Map r1 = r0.A0D()     // Catch:{ all -> 0x01c1 }
            X.2UO r0 = X.C18310x6.A0Q(r7)     // Catch:{ all -> 0x01c1 }
            X.2f2 r0 = r0.A0D     // Catch:{ all -> 0x01c1 }
            r0.A01(r1)     // Catch:{ all -> 0x01c1 }
            X.2UO r0 = X.C18310x6.A0Q(r7)     // Catch:{ all -> 0x01c1 }
            X.2so r0 = r0.A03     // Catch:{ all -> 0x01c1 }
            boolean r0 = r0.A0C()     // Catch:{ all -> 0x01c1 }
            if (r0 == 0) goto L_0x00de
            X.2UO r0 = X.C18310x6.A0Q(r7)     // Catch:{ all -> 0x01c1 }
            X.2so r0 = r0.A03     // Catch:{ all -> 0x01c1 }
            X.2rM r0 = r0.A0H     // Catch:{ all -> 0x01c1 }
            r0.A01()     // Catch:{ all -> 0x01c1 }
        L_0x00de:
            X.2UO r0 = X.C18310x6.A0Q(r7)     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            X.2sF r0 = r0.A0R     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            r0.A06(r2)     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            java.util.Iterator r5 = X.AnonymousClass000.A0q(r1)     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
        L_0x00eb:
            boolean r0 = r5.hasNext()     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            if (r0 == 0) goto L_0x0118
            java.util.Map$Entry r3 = X.AnonymousClass001.A0w(r5)     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            java.util.concurrent.ConcurrentHashMap r2 = r12.A04     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            X.4uZ r1 = X.C18320x8.A0N(r3)     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            java.lang.Object r0 = r3.getValue()     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            X.31A r0 = (X.AnonymousClass31A) r0     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            r2.put(r1, r0)     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            java.lang.Object r0 = r3.getValue()     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            X.31A r0 = (X.AnonymousClass31A) r0     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            boolean r0 = r0.A0j     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            if (r0 == 0) goto L_0x00eb
            java.util.HashSet r1 = r12.A03     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            X.4uZ r0 = X.C18320x8.A0N(r3)     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            r1.add(r0)     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            goto L_0x00eb
        L_0x0118:
            java.util.concurrent.ConcurrentHashMap r0 = r12.A04     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            java.util.Set r0 = r0.keySet()     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            java.util.ArrayList r5 = X.AnonymousClass002.A0J(r0)     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            X.2UO r0 = X.C18310x6.A0Q(r7)     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            X.3GM r7 = r0.A05     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            X.314 r1 = r7.A08     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            java.lang.String r0 = "ConversationsManager/initializeConversations"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            X.2ss r10 = r1.A02     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            r10.A0G()     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            X.3ZV r3 = r1.A01     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            monitor-enter(r3)     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            java.util.Iterator r11 = r5.iterator()     // Catch:{ all -> 0x01be }
        L_0x013f:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x01be }
            if (r0 == 0) goto L_0x0171
            X.4uZ r8 = X.C18300x5.A0P(r11)     // Catch:{ all -> 0x01be }
            boolean r0 = r10.A0L(r8)     // Catch:{ all -> 0x01be }
            if (r0 == 0) goto L_0x013f
            boolean r0 = r8 instanceof X.C95804uY     // Catch:{ all -> 0x01be }
            if (r0 != 0) goto L_0x013f
            long r0 = r10.A09(r8)     // Catch:{ all -> 0x01be }
            X.2jt r2 = new X.2jt     // Catch:{ all -> 0x01be }
            r2.<init>(r8, r0)     // Catch:{ all -> 0x01be }
            com.whatsapp.jid.GroupJid r0 = X.AnonymousClass32V.A00(r8)     // Catch:{ all -> 0x01be }
            int r0 = r10.A07(r0)     // Catch:{ all -> 0x01be }
            if (r0 == r6) goto L_0x013f
            java.util.concurrent.ConcurrentHashMap r0 = r10.A0G()     // Catch:{ all -> 0x01be }
            r0.get(r8)     // Catch:{ all -> 0x01be }
            r9.add(r2)     // Catch:{ all -> 0x01be }
            goto L_0x013f
        L_0x0171:
            boolean r0 = r3.A00     // Catch:{ all -> 0x01be }
            if (r0 == 0) goto L_0x0192
            java.util.HashMap r10 = r3.A03     // Catch:{ all -> 0x01be }
            r10.clear()     // Catch:{ all -> 0x01be }
            java.util.Iterator r8 = r9.iterator()     // Catch:{ all -> 0x01be }
        L_0x017e:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x01be }
            if (r0 == 0) goto L_0x0192
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x01be }
            X.2jt r0 = (X.C51482jt) r0     // Catch:{ all -> 0x01be }
            X.4uZ r2 = r0.A01     // Catch:{ all -> 0x01be }
            long r0 = r0.A00     // Catch:{ all -> 0x01be }
            X.AnonymousClass0x2.A1J(r2, r10, r0)     // Catch:{ all -> 0x01be }
            goto L_0x017e
        L_0x0192:
            java.util.ArrayList r1 = r3.A01     // Catch:{ all -> 0x01be }
            r1.clear()     // Catch:{ all -> 0x01be }
            r1.addAll(r9)     // Catch:{ all -> 0x01be }
            java.util.Comparator r0 = r3.A02     // Catch:{ all -> 0x01be }
            java.util.Collections.sort(r1, r0)     // Catch:{ all -> 0x01be }
            monitor-exit(r3)     // Catch:{ all -> 0x01be }
            X.3Wi r3 = r7.A02     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            X.1hw r2 = r7.A0A     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            java.util.Objects.requireNonNull(r2)     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            r1 = 44
            X.3Zj r0 = new X.3Zj     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            r0.<init>(r2, r1)     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            r3.BkS(r0)     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            java.lang.String r0 = "msgstore-manager/initialize/chats "
            X.C18260x0.A1B(r0, r1, r5)     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            r12.A00 = r6     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            goto L_0x01dd
        L_0x01be:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01be }
            goto L_0x01dc
        L_0x01c1:
            r1 = move-exception
            X.2UO r0 = X.C18310x6.A0Q(r7)     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            X.2sF r0 = r0.A0R     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            r0.A06(r2)     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            goto L_0x01dc
        L_0x01cc:
            java.lang.Throwable r1 = new java.lang.Throwable     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            r1.<init>()     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            java.lang.String r0 = "msgstore-manager/finish/db is not ready yet"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            X.23Y r1 = new X.23Y     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
            r1.<init>()     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
        L_0x01dc:
            throw r1     // Catch:{ 23Y -> 0x01dd, all -> 0x01e2 }
        L_0x01dd:
            r12.A06 = r4     // Catch:{ all -> 0x01e6 }
        L_0x01df:
            monitor-exit(r12)     // Catch:{ all -> 0x01e6 }
            goto L_0x0008
        L_0x01e2:
            r0 = move-exception
            r12.A06 = r4     // Catch:{ all -> 0x01e6 }
            throw r0     // Catch:{ all -> 0x01e6 }
        L_0x01e6:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x01e6 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56982ss.A0G():java.util.concurrent.ConcurrentHashMap");
    }

    public boolean A0N(C95814uZ r4) {
        if (!(r4 instanceof GroupJid) || A06((GroupJid) r4) != 3) {
            return false;
        }
        return true;
    }

    public boolean A0O(C95814uZ r4) {
        if (!(r4 instanceof GroupJid) || A07((GroupJid) r4) != 3) {
            return false;
        }
        return true;
    }

    public C56982ss(AnonymousClass4EA r2, AnonymousClass1VX r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = AnonymousClass0x9.A1D();
    }

    public static AnonymousClass31A A01(C56982ss r0, Object obj) {
        return (AnonymousClass31A) r0.A0G().get(obj);
    }

    public int A02(C95814uZ r2) {
        AnonymousClass31A A012 = A01(this, r2);
        if (A012 == null) {
            return 0;
        }
        return A012.A06;
    }

    public int A03(C95814uZ r2) {
        AnonymousClass31A A012 = A01(this, r2);
        if (A012 == null) {
            return 0;
        }
        return A012.A08;
    }

    public int A04(C95814uZ r2) {
        AnonymousClass31A A012 = A01(this, r2);
        if (A012 == null) {
            return 0;
        }
        return A012.A0b.expiration;
    }

    public int A07(GroupJid groupJid) {
        AnonymousClass31A A012;
        if (!C627336j.A0K(groupJid) || (A012 = A01(this, groupJid)) == null) {
            return 0;
        }
        return A012.A02;
    }

    public long A08(C95814uZ r3) {
        AnonymousClass31A A012 = A01(this, r3);
        if (A012 == null) {
            return 1;
        }
        return A012.A0P;
    }

    public long A09(C95814uZ r3) {
        AnonymousClass31A A012 = A01(this, r3);
        if (A012 == null) {
            return 0;
        }
        return A012.A0X;
    }

    public C42832Pr A0B(C95814uZ r9) {
        C42832Pr r2;
        AnonymousClass31A A012 = A01(this, r9);
        if (A012 == null) {
            return new C42832Pr(0, 0, Long.MIN_VALUE, 0);
        }
        synchronized (A012) {
            r2 = new C42832Pr(A012.A08, A012.A09, A012.A0Q, A012.A0A);
        }
        return r2;
    }

    public boolean A0L(C95814uZ r3) {
        if (!A0G().containsKey(r3) || A0Q(r3)) {
            return false;
        }
        return true;
    }

    public boolean A0M(C95814uZ r3) {
        AnonymousClass31A A012 = A01(this, r3);
        if (A012 == null || !A012.A0i) {
            return false;
        }
        return true;
    }

    public boolean A0Q(C95814uZ r9) {
        AnonymousClass31A A012 = A01(this, r9);
        if (A012 == null) {
            return true;
        }
        long j = A012.A0O;
        if (j == 0 && A012.A0F == Long.MIN_VALUE) {
            return false;
        }
        long j2 = A012.A0F;
        if (j2 != A012.A0G || j2 < j) {
            return false;
        }
        return true;
    }

    public boolean A0R(C95814uZ r4) {
        if (A06(AnonymousClass32V.A00(r4)) == 6) {
            AnonymousClass1VX r2 = this.A02;
            C58422vE r1 = C58422vE.A02;
            if (!r2.A0Y(r1, 5021) || !r2.A0Y(r1, 982)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
