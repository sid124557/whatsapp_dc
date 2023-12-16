package X;

import java.util.List;

/* renamed from: X.6HA  reason: invalid class name */
public class AnonymousClass6HA extends AnonymousClass0QO {
    public final List A00;
    public final List A01;

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A03(int i, int i2) {
        C181748nG r3 = (C181748nG) this.A01.get(i);
        C181748nG r2 = (C181748nG) this.A00.get(i2);
        int type = r3.getType();
        if (type != r2.getType()) {
            return false;
        }
        if (type == 0) {
            return ((AnonymousClass8EZ) r3).A00.equals(((AnonymousClass8EZ) r2).A00);
        }
        if (type == 1) {
            return ((AnonymousClass8EY) r3).A00.equals(((AnonymousClass8EY) r2).A00);
        }
        return true;
    }

    public boolean A04(int i, int i2) {
        String str;
        String str2;
        C181748nG r3 = (C181748nG) this.A01.get(i);
        C181748nG r2 = (C181748nG) this.A00.get(i2);
        int type = r3.getType();
        if (type != r2.getType()) {
            return false;
        }
        if (type == 0) {
            str = ((AnonymousClass8EZ) r3).A00.A0F;
            str2 = ((AnonymousClass8EZ) r2).A00.A0F;
        } else if (type != 1) {
            return true;
        } else {
            str = ((AnonymousClass8EY) r3).A00;
            str2 = ((AnonymousClass8EY) r2).A00;
        }
        return str.equals(str2);
    }

    public AnonymousClass6HA(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }
}
