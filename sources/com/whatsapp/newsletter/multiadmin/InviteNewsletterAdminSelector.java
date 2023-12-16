package com.whatsapp.newsletter.multiadmin;

import X.AnonymousClass001;
import X.AnonymousClass0IT;
import X.AnonymousClass20D;
import X.AnonymousClass21J;
import X.AnonymousClass3ZH;
import X.AnonymousClass4SG;
import X.AnonymousClass5QK;
import X.AnonymousClass669;
import X.AnonymousClass66R;
import X.AnonymousClass68W;
import X.C102295Ih;
import X.C106715a2;
import X.C107695bk;
import X.C119905xj;
import X.C119915xk;
import X.C119925xl;
import X.C119935xm;
import X.C13770ni;
import X.C140046t4;
import X.C154517dI;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18300x5;
import X.C27981fH;
import X.C45392Zw;
import X.C50142hh;
import X.C53812ni;
import X.C56662sM;
import X.C616131n;
import X.C64333Db;
import X.C66433Lk;
import X.C70023Zo;
import X.C84004Aq;
import X.C84814Du;
import X.C85494Gl;
import X.C86604Kt;
import X.C88834as;
import X.C89634eX;
import X.C95804uY;
import X.C95814uZ;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.wds.components.search.WDSSearchBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class InviteNewsletterAdminSelector extends C89634eX implements AnonymousClass669, C84004Aq {
    public C56662sM A00;
    public C50142hh A01;
    public AnonymousClass5QK A02;
    public C45392Zw A03;
    public C66433Lk A04;
    public C106715a2 A05;
    public List A06;
    public boolean A07;
    public final AnonymousClass66R A08;
    public final AnonymousClass66R A09;
    public final AnonymousClass66R A0A;
    public final AnonymousClass66R A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (r4 == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006a, code lost:
        if (r4 == false) goto L_0x0073;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A7N(X.AnonymousClass5QN r9, X.AnonymousClass3ZH r10) {
        /*
            r8 = this;
            r3 = 0
            X.C162457s7.A0J(r9, r3)
            super.A7N(r9, r10)
            java.util.List r0 = r8.A06
            r6 = -1
            if (r0 == 0) goto L_0x002c
            java.util.Iterator r2 = r0.iterator()
            r7 = 0
        L_0x0011:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002c
            java.lang.Object r0 = r2.next()
            X.5Ih r0 = (X.C102295Ih) r0
            X.3ZH r0 = r0.A00
            X.4uZ r1 = r0.A0H
            X.4uZ r0 = r10.A0H
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 != 0) goto L_0x002d
            int r7 = r7 + 1
            goto L_0x0011
        L_0x002c:
            r7 = -1
        L_0x002d:
            r5 = 0
            if (r7 == r6) goto L_0x0073
            java.util.List r0 = r8.A06
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r0 = r0.get(r7)
            X.5Ih r0 = (X.C102295Ih) r0
            if (r0 == 0) goto L_0x00bc
            boolean r4 = r0.A01
            r2 = 2131890266(0x7f12105a, float:1.9415219E38)
            if (r4 != 0) goto L_0x0046
        L_0x0043:
            r2 = 2131890265(0x7f121059, float:1.9415217E38)
        L_0x0046:
            java.util.List r0 = r8.A06
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r0 = r0.get(r7)
            X.5Ih r0 = (X.C102295Ih) r0
            if (r0 == 0) goto L_0x00ba
            X.21q r1 = r0.A02
        L_0x0054:
            X.21q r0 = X.C372821q.ADMIN
            if (r1 == r0) goto L_0x006c
            java.util.List r0 = r8.A06
            if (r0 == 0) goto L_0x00b8
            java.lang.Object r0 = r0.get(r7)
            X.5Ih r0 = (X.C102295Ih) r0
            if (r0 == 0) goto L_0x00b8
            X.21q r1 = r0.A02
        L_0x0066:
            X.21q r0 = X.C372821q.OWNER
            if (r1 == r0) goto L_0x006c
            if (r4 == 0) goto L_0x0073
        L_0x006c:
            java.lang.String r0 = r8.getString(r2)
            r9.A00(r0, r3)
        L_0x0073:
            java.util.List r0 = r8.A0U
            if (r0 == 0) goto L_0x00b4
            java.util.Iterator r4 = r0.iterator()
            r2 = 0
        L_0x007c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00b4
            X.4uZ r1 = X.C86604Kt.A0b(r4)
            X.4uZ r0 = r10.A0H
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x00b5
            if (r2 == r6) goto L_0x00b4
            X.66R r0 = r8.A08
            java.lang.Object r1 = X.C18300x5.A0d(r0)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r0 = r8.A0U
            if (r0 == 0) goto L_0x00a4
            X.3ZH r0 = X.AnonymousClass4L0.A0L(r0, r2)
            if (r0 == 0) goto L_0x00a4
            X.4uZ r5 = r0.A0H
        L_0x00a4:
            boolean r0 = X.C73723fy.A0U(r1, r5)
            if (r0 == 0) goto L_0x00b4
            r0 = 2131890266(0x7f12105a, float:1.9415219E38)
            java.lang.String r0 = r8.getString(r0)
            r9.A00(r0, r3)
        L_0x00b4:
            return
        L_0x00b5:
            int r2 = r2 + 1
            goto L_0x007c
        L_0x00b8:
            r1 = r5
            goto L_0x0066
        L_0x00ba:
            r1 = r5
            goto L_0x0054
        L_0x00bc:
            r4 = 0
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector.A7N(X.5QN, X.3ZH):void");
    }

    public final List A7c(List list) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C53812ni r4 = (C53812ni) it.next();
            C27981fH r2 = r4.A03;
            if (r2 != null) {
                C56662sM r0 = this.A00;
                if (r0 != null) {
                    C95814uZ A022 = r0.A02(r2);
                    if (A022 == null) {
                        A022 = r2;
                    }
                    AnonymousClass3ZH A0A2 = this.A0B.A0A(A022);
                    A0A2.A0y = false;
                    A0s.add(new C102295Ih(r4.A01, A0A2, ((List) C18300x5.A0d(this.A08)).contains(A022)));
                } else {
                    throw C18270x1.A0S("waJidMapRepository");
                }
            }
        }
        return A0s;
    }

    public void Ayk(AnonymousClass3ZH r5) {
        Object obj;
        C162457s7.A0J(r5, 0);
        super.Ayk(r5);
        List list = this.A06;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C162457s7.A0P(((C102295Ih) obj).A00.A0H, r5.A0H)) {
                    break;
                }
            }
            C102295Ih r2 = (C102295Ih) obj;
            if (r2 != null) {
                r2.A00.A0y = r5.A0y;
                this.A03.notifyDataSetChanged();
            }
        }
    }

    public void BbD(C95804uY r9, String str, List list) {
        C162457s7.A0J(r9, 0);
        C18260x0.A0Q(list, str);
        C13770ni A002 = AnonymousClass0IT.A00(this);
        C616131n.A02((C85494Gl) null, new InviteNewsletterAdminSelector$onSend$1(r9, this, str, list, (C84814Du) null), A002, (AnonymousClass20D) null, 3);
    }

    public void A5r() {
        if (!this.A07) {
            this.A07 = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r2 = A2W.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            AnonymousClass4SG.A3T(r2, r1, this);
            AnonymousClass4SG.A3M(A2W, r2, this, r2.A6O.get());
            this.A01 = (C50142hh) r1.A89.get();
            this.A05 = C18280x3.A0Q(r1);
            this.A04 = C86604Kt.A0e(r2);
            this.A02 = (AnonymousClass5QK) r1.A7w.get();
            this.A00 = (C56662sM) r2.AaX.get();
            this.A03 = (C45392Zw) r1.A7x.get();
        }
    }

    public InviteNewsletterAdminSelector(int i) {
        this.A07 = false;
        AnonymousClass68W.A00(this, 64);
    }

    public void BPt(AnonymousClass3ZH r1) {
        Ayk(r1);
    }

    public void Bek(AnonymousClass21J r2, String str, List list) {
        C95804uY r0;
        C18260x0.A0O(list, r2);
        if (r2 == AnonymousClass21J.INVITE && (r0 = (C95804uY) this.A0A.getValue()) != null && str != null) {
            BbD(r0, str, list);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bs7();
        this.A04.BkP(new C70023Zo(this, 38));
        WDSSearchBar wDSSearchBar = this.A0R;
        if (wDSSearchBar != null) {
            wDSSearchBar.A07.setTrailingButtonIcon(C140046t4.A00);
            wDSSearchBar.A07.setHint((int) R.string.f11nameremoved);
        }
    }

    public InviteNewsletterAdminSelector() {
        this(0);
        this.A0A = C154517dI.A01(new C119925xl(this));
        this.A0B = C154517dI.A01(new C119935xm(this));
        this.A08 = C154517dI.A01(new C119905xj(this));
        this.A09 = C154517dI.A01(new C119915xk(this));
    }
}
