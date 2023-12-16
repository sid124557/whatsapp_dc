package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5ZA  reason: invalid class name */
public final class AnonymousClass5ZA {
    public boolean A00;
    public boolean A01;
    public final C986252p A02;
    public final C986352q A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final boolean A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5ZA) {
                AnonymousClass5ZA r5 = (AnonymousClass5ZA) obj;
                if (!C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A05, r5.A05) || !C162457s7.A0P(this.A06, r5.A06) || this.A01 != r5.A01 || !C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A02, r5.A02) || this.A07 != r5.A07 || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x2.A01((AnonymousClass000.A08(this.A04, AnonymousClass0x2.A01(AnonymousClass000.A08(this.A06, AnonymousClass000.A08(this.A05, C18300x5.A04(this.A03))), this.A01)) + AnonymousClass000.A07(this.A02)) * 31, this.A07), this.A00);
    }

    public AnonymousClass5ZA(C986252p r1, C986352q r2, List list, List list2, List list3, boolean z, boolean z2, boolean z3) {
        this.A03 = r2;
        this.A05 = list;
        this.A06 = list2;
        this.A01 = z;
        this.A04 = list3;
        this.A02 = r1;
        this.A07 = z2;
        this.A00 = z3;
    }

    public static final List A00(List list) {
        ArrayList A0c = C73783g4.A0c(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C986452r r1 = (C986452r) it.next();
            AnonymousClass3ZH A0G = r1.A00.A0G();
            if (A0G == null) {
                A0G = r1.A00;
            }
            C162457s7.A0H(A0G);
            A0c.add(new C986452r(r1.A01, A0G, r1.A02, r1.A03, r1.A04, r1.A05));
        }
        return A0c;
    }

    public static final void A01(AnonymousClass3ZH r4, List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C162457s7.A0P(((C986452r) obj).A00.A0H, r4.A0H)) {
                break;
            }
        }
        C986452r r2 = (C986452r) obj;
        if (r2 != null) {
            r2.A00 = r4;
        }
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("StatusListUpdates(myStatus=");
        A0o.append(this.A03);
        A0o.append(", newUpdates=");
        A0o.append(this.A05);
        A0o.append(", viewedUpdates=");
        A0o.append(this.A06);
        A0o.append(", viewedStatusesExpanded=");
        A0o.append(this.A01);
        A0o.append(", mutedStatuses=");
        A0o.append(this.A04);
        A0o.append(", mutedStatusesEntrypoint=");
        A0o.append(this.A02);
        A0o.append(", inSearchMode=");
        A0o.append(this.A07);
        A0o.append(", mutedStatusesExpanded=");
        return C18260x0.A0A(A0o, this.A00);
    }
}
