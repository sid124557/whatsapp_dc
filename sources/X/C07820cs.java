package X;

import java.util.List;

/* renamed from: X.0cs  reason: invalid class name and case insensitive filesystem */
public class C07820cs implements C15710ro {
    public int A00;
    public int A01 = 1;
    public int A02;
    public C15710ro A03 = null;
    public AnonymousClass0G1 A04 = AnonymousClass0G1.UNKNOWN;
    public AnonymousClass05R A05 = null;
    public C07830ct A06;
    public List A07 = AnonymousClass001.A0s();
    public List A08 = AnonymousClass001.A0s();
    public boolean A09 = false;
    public boolean A0A = false;
    public boolean A0B = false;

    public static void A00(C07820cs r0, Object obj) {
        r0.A07.add(obj);
    }

    public void A01() {
        this.A08.clear();
        this.A07.clear();
        this.A0B = false;
        this.A02 = 0;
        this.A0A = false;
        this.A09 = false;
    }

    public void A02(int i) {
        if (!this.A0B) {
            this.A0B = true;
            this.A02 = i;
            for (C15710ro r0 : this.A07) {
                r0.BrU(r0);
            }
        }
    }

    public void BrU(C15710ro r7) {
        List<C07820cs> list = this.A08;
        for (C07820cs r0 : list) {
            if (!r0.A0B) {
                return;
            }
        }
        this.A0A = true;
        C15710ro r02 = this.A03;
        if (r02 != null) {
            r02.BrU(this);
        }
        if (this.A09) {
            this.A06.BrU(this);
            return;
        }
        C07820cs r3 = null;
        int i = 0;
        for (C07820cs r1 : list) {
            if (!(r1 instanceof AnonymousClass05R)) {
                i++;
                r3 = r1;
            }
        }
        if (r3 != null && i == 1 && r3.A0B) {
            AnonymousClass05R r2 = this.A05;
            if (r2 != null) {
                if (r2.A0B) {
                    this.A00 = this.A01 * r2.A02;
                } else {
                    return;
                }
            }
            A02(r3.A02 + this.A00);
        }
        C15710ro r03 = this.A03;
        if (r03 != null) {
            r03.BrU(this);
        }
    }

    public C07820cs(C07830ct r4) {
        this.A06 = r4;
    }

    public String toString() {
        Object obj;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A06.A03.A0f);
        A0o.append(":");
        A0o.append(this.A04);
        A0o.append("(");
        if (this.A0B) {
            obj = Integer.valueOf(this.A02);
        } else {
            obj = "unresolved";
        }
        A0o.append(obj);
        A0o.append(") <t=");
        A0o.append(this.A08.size());
        A0o.append(":d=");
        A0o.append(this.A07.size());
        return AnonymousClass000.A0X(">", A0o);
    }
}
