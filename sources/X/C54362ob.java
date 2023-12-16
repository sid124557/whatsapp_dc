package X;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2ob  reason: invalid class name and case insensitive filesystem */
public abstract class C54362ob {
    public final C103515Ng A00;

    public C54362ob(C103515Ng r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public void A00(C53572nJ r12) {
        C103515Ng r4 = this.A00;
        Iterator it = r12.A01.iterator();
        while (it.hasNext()) {
            C52072kq r2 = (C52072kq) it.next();
            Iterator it2 = r12.A02.iterator();
            while (it2.hasNext()) {
                C624134x A0T = C18300x5.A0T(it2);
                C162457s7.A0H(A0T);
                r4.A00(r2.A00, A0T, r12.A04, (String) null, r12.A00, 1);
            }
        }
    }

    public void A01(AnonymousClass217 r20, C73263fC r21, String str, List list, int i) {
        List list2;
        Context context;
        C59462wx r3;
        String str2;
        C73263fC r8 = r21;
        String str3 = str;
        if (this instanceof C34491vF) {
            StringBuilder A0g = C18280x3.A0g(str3, 1);
            A0g.append("CrosspostRequestSessionManager/[Retry]Error encountered for session: ");
            A0g.append(str3);
            AnonymousClass356.A01(AnonymousClass000.A0P(r8, " with exception: ", A0g));
            return;
        }
        AnonymousClass217 r7 = r20;
        List list3 = list;
        int i2 = i;
        if (this instanceof C34511vH) {
            C34511vH r4 = (C34511vH) this;
            C18260x0.A0Q(str3, r7);
            String A02 = C626736a.A02(r8);
            AnonymousClass30E r6 = r4.A01;
            C111145hc A022 = r6.A02();
            if (A022 != null) {
                A022.A06("user_visible_error_type", A02);
            }
            C111145hc A023 = r6.A02();
            if (A023 != null) {
                A023.A04("SEE_CROSSPOST_ERROR");
            }
            context = r4.A00;
            str2 = "status_fragment";
            list2 = r4.A03;
            C84764Dp r32 = r4.A02;
            if (r7.ordinal() == 0) {
                C52722lw r2 = (C52722lw) r6.A0C.get();
                AnonymousClass549 r13 = new AnonymousClass549(list2, r6, r32, list3, 5);
                r2.A00.BkS(new C71613cO((C88674aZ) new AnonymousClass15e(context, r6, r7, r8, str3, list2, list3, i2), (C109665ez) r13, r32, r2));
                return;
            }
            r3 = r6.A07;
        } else {
            C34501vG r42 = (C34501vG) this;
            C18260x0.A0Q(str3, r7);
            String A024 = C626736a.A02(r8);
            AnonymousClass30E r22 = r42.A02;
            C111145hc A025 = r22.A02();
            if (A025 != null) {
                A025.A06("user_visible_error_type", A024);
            }
            C111145hc A026 = r22.A02();
            if (A026 != null) {
                A026.A04("SEE_CROSSPOST_ERROR");
            }
            r3 = r22.A07;
            context = r42.A00;
            list2 = C18290x4.A12(r42.A01);
            str2 = r42.A03;
        }
        r3.A01(context, r8, str2, str3, list2, list3, i2);
    }

    public void A02(AnonymousClass217 r11, String str) {
        String str2;
        C52722lw r3;
        AnonymousClass228 r0;
        if (this instanceof C34491vF) {
            AnonymousClass356.A01(AnonymousClass000.A0V("CrosspostRequestSessionManager/[Retry]Delivery Failure encountered for session: ", str, C18270x1.A0X(str)));
            return;
        }
        if (this instanceof C34511vH) {
            C34511vH r32 = (C34511vH) this;
            C162457s7.A0J(r11, 1);
            AnonymousClass30E r6 = r32.A01;
            C111145hc A02 = r6.A02();
            if (A02 != null) {
                A02.A06("user_visible_error_type", "no_internet");
            }
            C111145hc A022 = r6.A02();
            if (A022 != null) {
                A022.A04("SEE_CROSSPOST_ERROR");
            }
            List list = r32.A04;
            str2 = "status_fragment";
            List list2 = r32.A03;
            C84764Dp r7 = r32.A02;
            int ordinal = r11.ordinal();
            C183538qC r02 = r6.A0C;
            if (ordinal == 0) {
                C52722lw r33 = (C52722lw) r02.get();
                AnonymousClass549 r4 = new AnonymousClass549(list2, r6, r7, list, 5);
                r33.A00.BkS(new C71613cO((C88674aZ) new AnonymousClass15d(r6, list2), (C109665ez) r4, r7, r33));
                return;
            }
            r3 = (C52722lw) C18300x5.A0b(r02);
            C162457s7.A0J(r3, 2);
            r0 = C59462wx.A00(list2);
        } else {
            C34501vG r42 = (C34501vG) this;
            AnonymousClass30E r34 = r42.A02;
            C111145hc A023 = r34.A02();
            if (A023 != null) {
                A023.A06("user_visible_error_type", "no_internet");
            }
            C111145hc A024 = r34.A02();
            if (A024 != null) {
                A024.A04("SEE_CROSSPOST_ERROR");
            }
            List A12 = C18290x4.A12(r42.A01);
            str2 = r42.A03;
            r3 = (C52722lw) C18300x5.A0b(r34.A0C);
            C162457s7.A0J(r3, 2);
            r0 = C59462wx.A00(A12);
        }
        C162457s7.A0J(r0, 0);
        r3.A00((C109665ez) null, str2, r0.crosspostingOfflineText, 0);
    }
}
