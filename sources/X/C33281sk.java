package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1sk  reason: invalid class name and case insensitive filesystem */
public final class C33281sk extends AnonymousClass5ZM {
    public final C56612sH A00;
    public final C183538qC A01;
    public final C183538qC A02;
    public final C183538qC A03;
    public final C183538qC A04;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        StringBuilder A0l;
        StringBuilder A0o;
        String str;
        String str2;
        C183538qC r4 = this.A03;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("[XFAM] StatusCrosspostUnsentSessionManager/get unsent session called, current value: ");
        AnonymousClass66R r1 = ((C48582f8) r4.get()).A01;
        C18260x0.A0m(r1.getValue(), A0o2);
        AnonymousClass8OQ copyOf = AnonymousClass8OQ.copyOf((Map) (ConcurrentHashMap) r1.getValue());
        C162457s7.A0D(copyOf);
        Iterator it = copyOf.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(it);
            String A0q = C18310x6.A0q(A0w);
            Object value = A0w.getValue();
            C162457s7.A0D(value);
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator it2 = ((List) value).iterator();
            while (it2.hasNext()) {
                long A022 = C18270x1.A02(it2);
                C624134x A002 = C55122pp.A00(((C45522a9) this.A02.get()).A02, A022);
                if (A002 == null || C627636p.A0l(A002)) {
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    A0o3.append("CrosspostSendUnsentStatusTask/getMessageFromMessageRowIds encountered empty or revoked message: ");
                    A0o3.append(A022);
                    C18270x1.A1G(A0o3, ", skipping and retrying the rest");
                    ((AnonymousClass30J) this.A04.get()).A04(C18280x3.A0j(A022), 4);
                } else {
                    A0s.add(A002);
                }
            }
            C162457s7.A0H(A0q);
            long A0H = this.A00.A0H();
            if (!(A0s instanceof Collection) || !A0s.isEmpty()) {
                Iterator it3 = A0s.iterator();
                while (it3.hasNext()) {
                    C624134x A0T = C18300x5.A0T(it3);
                    if (!AnonymousClass36X.A07(A0T)) {
                        A0l = AnonymousClass000.A0l("CrosspostSendUnsentStatusTask/message ");
                        A0l.append(A0T.A1L);
                        C624134x.A0T(A0T, " invalid for retry due to incompatible type: ", A0l);
                    } else if (Math.abs(A0H - A0T.A0K) > 10800000) {
                        A0l = AnonymousClass000.A0l("CrosspostSendUnsentStatusTask/message ");
                        A0l.append(A0T.A1L);
                        A0l.append(" invalid for retry due to timestamp expiration: ");
                        A0l.append(A0T.A0K);
                    }
                    C106245Ye.A00(A0l.toString());
                    C106245Ye.A00(AnonymousClass000.A0V("CrosspostSendUnsentStatusTask/getEnforcedUniqueIdIfEligibleForRetry contains non retryable message in session: ", A0q, AnonymousClass001.A0o()));
                }
            }
            AnonymousClass30J r7 = (AnonymousClass30J) this.A04.get();
            ArrayList A0c = C73783g4.A0c(A0s);
            Iterator it4 = A0s.iterator();
            while (it4.hasNext()) {
                C624134x.A0Z(A0c, it4);
            }
            Map A012 = r7.A01(A0c);
            ArrayList A0s2 = AnonymousClass001.A0s();
            Iterator it5 = A0s.iterator();
            while (it5.hasNext()) {
                C624134x A0T2 = C18300x5.A0T(it5);
                C53142mc r12 = (C53142mc) C18280x3.A0W(A012, A0T2.A1L);
                if (r12 == null) {
                    A0o = AnonymousClass001.A0o();
                    str = "CrosspostSendUnsentStatusTask/db entry not found for message id: ";
                } else if (!(A0T2 instanceof C30481mW) || !((str2 = r12.A04) == null || str2.length() == 0)) {
                    A0s2.add(r12.A02);
                } else {
                    A0o = AnonymousClass001.A0o();
                    str = "CrosspostSendUnsentStatusTask/text status empty media path: ";
                }
                C106245Ye.A00(C624134x.A0C(A0T2, str, A0o));
                StringBuilder A0l2 = AnonymousClass000.A0l(str);
                A0l2.append(A0T2.A1L);
                C18270x1.A0z(A0l2);
            }
            if (A0s2.size() == A0s.size()) {
                C55932r9 r8 = (C55932r9) this.A01.get();
                StringBuilder A0g = C18280x3.A0g(A0q, 0);
                A0g.append("XFamilyCrosspostRequestSessionManager/handleCrosspostRetry started for session: ");
                A0g.append(A0q);
                A0g.append(" with messages: ");
                ArrayList A0c2 = C73783g4.A0c(A0s);
                Iterator it6 = A0s.iterator();
                while (it6.hasNext()) {
                    C624134x.A0Z(A0c2, it6);
                }
                C106245Ye.A00(AnonymousClass000.A0R(A0c2, A0g));
                ((C48582f8) r8.A0C.get()).A00(A0q);
                ((C47152cn) r8.A06.get()).A00(new AnonymousClass3YQ(new C36611zb(r8, (Boolean) null, A0q, A0s, false), r8, A0q), A0q, A0s, A0s2);
            }
            C106245Ye.A00(AnonymousClass000.A0V("CrosspostSendUnsentStatusTask/uniqueId validation failed for session: ", A0q, AnonymousClass001.A0o()));
            C626936e.A0D(false, AnonymousClass000.A0T("CrosspostSendUnsentStatusTask/uniqueId validation failed for session: ", A0q));
            StringBuilder A0o4 = AnonymousClass001.A0o();
            A0o4.append("CrosspostSendUnsentStatusTask/doInBackground sessionId: ");
            A0o4.append(A0q);
            C18270x1.A1G(A0o4, " not eligible for retry, updating db");
            ((C48582f8) r4.get()).A00(A0q);
            AnonymousClass30J r6 = (AnonymousClass30J) this.A04.get();
            ArrayList A0c3 = C73783g4.A0c(A0s);
            Iterator it7 = A0s.iterator();
            while (it7.hasNext()) {
                C624134x.A0Z(A0c3, it7);
            }
            r6.A04(A0c3, 4);
        }
        return null;
    }

    public C33281sk(C56612sH r1, C183538qC r2, C183538qC r3, C183538qC r4, C183538qC r5) {
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r3;
        this.A02 = r4;
        this.A03 = r5;
    }
}
