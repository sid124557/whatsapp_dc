package X;

import android.database.Cursor;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: X.1tG  reason: invalid class name and case insensitive filesystem */
public class C33521tG extends AnonymousClass5ZM {
    public final long A00 = SystemClock.elapsedRealtime();
    public final C621033m A01;
    public final WeakReference A02;
    public final boolean A03;
    public final boolean A04;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Set entrySet;
        Cursor A012;
        C621033m r3 = this.A01;
        boolean z = this.A04;
        boolean z2 = this.A03;
        List A05 = r3.A0R.A05();
        HashSet A0K = AnonymousClass002.A0K();
        Iterator it = A05.iterator();
        while (it.hasNext()) {
            C95814uZ A0P = C18300x5.A0P(it);
            if (r3.A0i.A03(A0P) > 0) {
                r3.A1T.A09(A0P, (C624134x) null);
                C69263Wi.A0B(r3.A02, A0P, r3, 34);
            }
            A0K.addAll(r3.A0L.A09(A0P, !z, z2));
        }
        C66543Lv r6 = r3.A0l;
        if (z) {
            Log.i("CoreMessageStore/clearallmsgs_excludestarred");
            ArrayList A0s = AnonymousClass001.A0s();
            AnonymousClass4GK A032 = r6.A18.get();
            try {
                A012 = C56862sg.A01(((AnonymousClass3H0) A032).A03, "SELECT DISTINCT chat_row_id FROM message_view", "GET_CHATS_FROM_MESSAGES_SQL");
                while (A012.moveToNext()) {
                    C95814uZ A0C = r6.A0W.A0C(A012);
                    if (A0C != null && !(A0C instanceof C135166kE)) {
                        A0s.add(A0C);
                    }
                }
                A012.close();
                A032.close();
                Iterator it2 = A0s.iterator();
                while (it2.hasNext()) {
                    r6.A0Q(C18300x5.A0P(it2), (Long) null, true, z2);
                }
                Message.obtain(r6.A0q.A01, 8).sendToTarget();
            } catch (Throwable th) {
                th = th;
                try {
                    A032.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else {
            Log.i("CoreMessageStore/clearallmsgs");
            AnonymousClass33M A013 = AnonymousClass33M.A01("msgstore/clearallmsgs");
            r6.A2O.clear();
            C85284Fq A042 = r6.A18.A04();
            try {
                C69833Yo Axl = A042.Axl();
                try {
                    r6.A0i(A013);
                    C56982ss r1 = r6.A0X;
                    synchronized (r1) {
                        entrySet = r1.A0G().entrySet();
                    }
                    Iterator it3 = entrySet.iterator();
                    while (it3.hasNext()) {
                        Map.Entry A0w = AnonymousClass001.A0w(it3);
                        AnonymousClass31A r0 = (AnonymousClass31A) A0w.getValue();
                        r0.A09();
                        C95814uZ A0N = C18320x8.A0N(A0w);
                        if (A0N != null && r0.A00 == 1) {
                            r6.A0r(A0N, (Long) null);
                        }
                    }
                    Axl.A00();
                    Axl.close();
                    A042.close();
                    C64393Dh r12 = r6.A07;
                    C627536m.A0P(r12.A08().A0P);
                    C627536m.A0P(r12.A08().A0H);
                    if (z2) {
                        r6.A0G();
                    }
                    Message.obtain(r6.A0q.A01, 8).sendToTarget();
                    AnonymousClass33M.A05(A013, "CoreMessageStore/clearallmsgs time spent:", AnonymousClass001.A0o());
                } catch (Throwable th3) {
                    Axl.close();
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
                A042.close();
                throw th;
            }
        }
        r3.A0L.A0O(A0K);
        C69263Wi r2 = r3.A02;
        C619933b r13 = r3.A1T;
        Objects.requireNonNull(r13);
        C69263Wi.A00(r2, r13, 8);
        r3.A0C.A01();
        long A0E = AnonymousClass0x7.A0E(this.A00);
        if (A0E >= 300) {
            return null;
        }
        SystemClock.sleep(300 - A0E);
        return null;
        throw th;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass4FU r0 = (AnonymousClass4FU) this.A02.get();
        if (r0 != null) {
            r0.BjL();
        }
    }

    public C33521tG(AnonymousClass4FU r3, C621033m r4, boolean z, boolean z2) {
        this.A02 = AnonymousClass0x9.A14(r3);
        this.A01 = r4;
        this.A04 = z;
        this.A03 = z2;
    }
}
