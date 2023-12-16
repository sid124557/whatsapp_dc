package X;

import android.database.Cursor;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.1sh  reason: invalid class name and case insensitive filesystem */
public class C33251sh extends AnonymousClass5ZM {
    public final /* synthetic */ AnonymousClass3FK A00;

    public C33251sh(AnonymousClass3FK r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Cursor A0E;
        AnonymousClass3FK r14 = this.A00;
        ArrayList A02 = r14.A08.A02();
        C620333f r10 = r14.A09;
        ArrayList A0s = AnonymousClass001.A0s();
        long A01 = C56612sH.A01(r10.A06);
        Iterator A11 = C18290x4.A11(new C73323fJ());
        while (A11.hasNext()) {
            byte A002 = C18300x5.A00(A11);
            AnonymousClass4GK A03 = r10.A0G.get();
            try {
                C66443Ll r8 = r10.A0P;
                C56862sg r5 = ((AnonymousClass3H0) A03).A03;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append(C625035h.A00(A002));
                String A0X = AnonymousClass000.A0X(" WHERE message_add_on.from_me = 1  AND message_add_on.status < 4 AND message_add_on.timestamp > ? AND message_add_on.message_add_on_type = ?", A0o);
                String[] A1Z = AnonymousClass0x9.A1Z();
                C18260x0.A1W(A1Z, A002, A01);
                A0E = r5.A0E(A0X, "MessageAddOnStore/getUnsentMessageAddOnCursor", A1Z);
                HashMap A003 = AnonymousClass26E.A00(A0E, A002);
                while (A0E.moveToNext()) {
                    C30331mH A05 = r8.A05(A0E, A003);
                    if (A05 == null) {
                        Log.e("MessageAddOnManager/getMessageAddOnForParentMessage unexpected fmessage");
                    } else {
                        A05.A1y(A0E, r10.A0C, A003);
                        C624134x A012 = C30331mH.A01(A05, r10.A0X);
                        if (A012 == null) {
                            Log.w("MessageAddOnManager/fillInMessageAddOnReactionForNotification parent message missing");
                        } else {
                            if (A05 instanceof C30591mh) {
                                if (!(A012 instanceof C30451mT)) {
                                    Log.w("MessageAddOnManager/fillInMessageAddOn parent message not a poll for a poll vote");
                                } else {
                                    C30591mh r1 = (C30591mh) A05;
                                    C30331mH.A02(r10.A0M, r1);
                                    C618632o.A00((C30451mT) A012, r1);
                                }
                            }
                            if ((A05 instanceof C30601mi) && (A012 instanceof C30461mU)) {
                                ((C30601mi) A05).A04 = A012.A1a;
                            }
                            C30331mH.A04(A012, A05);
                            A05.A04 = C33051sM.A01(A012);
                            A0s.add(A05);
                        }
                    }
                }
                A0E.close();
                A03.close();
            } catch (Throwable th) {
                try {
                    A03.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        A02.addAll(A0s);
        if (A02.isEmpty()) {
            return null;
        }
        int A08 = r14.A03.A08(true);
        HashMap A0t = AnonymousClass001.A0t();
        Iterator it = A02.iterator();
        while (it.hasNext()) {
            C624134x A0T = C18300x5.A0T(it);
            if (r14.A01(A0T)) {
                if (A0T.A1Q == 0) {
                    A0T.A1Q = SystemClock.uptimeMillis();
                }
                if (!(A0T instanceof C30331mH)) {
                    A0T.A1d = r14.A06.A1S.A01(A0T);
                }
                if (A0T.A1I == 16) {
                    C30361mK r4 = (C30361mK) A0T;
                    if (r4.A02 == 2) {
                        C66423Lj r42 = (C66423Lj) r14.A0D.get();
                        C43772Tk r0 = new C43772Tk(r42.A08, A0T);
                        r0.A07 = true;
                        r0.A06 = true;
                        r42.A00(new C53932nu(r0), (C72183dJ) null, (Runnable) null);
                    } else {
                        C621033m r2 = r14.A02;
                        C69263Wi.A0B(r2.A02, r4, r2, 31);
                    }
                } else if (A0T instanceof C30471mV) {
                    C30471mV r15 = (C30471mV) A0T;
                    AnonymousClass33C r82 = r15.A01;
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("unsentMessages/sendUnsentMessages/url isNull=");
                    A0o2.append(!r15.A22());
                    C624134x.A0O(r15, ", status=", A0o2);
                    String A07 = AnonymousClass2z0.A07(A0T, ", key=", A0o2);
                    C18260x0.A1J(A0o2, A07);
                    if (r15.A22() && (r82 == null || r82.A0F == null)) {
                        r14.A00(r15, (Runnable) null);
                    } else if (AnonymousClass358.A00(r15.A0D, 2) >= 0) {
                        C18260x0.A0q("unsentMessages/sendUnsentMessages/assumingThisMessage is from web/key=", A07, AnonymousClass001.A0o());
                        r14.A00(A0T, new C70623an(r14, r15, A0T, r82, A08, 0));
                    } else if (A08 == 1 || A08 == 2 || (r15 instanceof AnonymousClass1n2) || ((r15 instanceof C30721mu) && r15.A09 == 1)) {
                        String str = r15.A08;
                        if (str == null) {
                            r14.A01.A08(r15, false, false);
                        } else {
                            AbstractCollection abstractCollection = (AbstractCollection) A0t.get(str);
                            if (abstractCollection == null) {
                                abstractCollection = AnonymousClass001.A0s();
                                A0t.put(r15.A08, abstractCollection);
                            }
                            abstractCollection.add(r15);
                        }
                    }
                } else {
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    C18260x0.A1J(A0o3, AnonymousClass2z0.A07(A0T, "unsentMessages/sendUnsentMessages/ key=", A0o3));
                    r14.A00(A0T, (Runnable) null);
                }
            }
        }
        Iterator A10 = C18290x4.A10(A0t);
        while (A10.hasNext()) {
            r14.A01.A06(new AnonymousClass30M((ArrayList) A10.next()), false, false);
        }
        return null;
        throw th;
    }
}
