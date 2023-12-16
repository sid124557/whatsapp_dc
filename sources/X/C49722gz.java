package X;

import java.util.List;

/* renamed from: X.2gz  reason: invalid class name and case insensitive filesystem */
public final class C49722gz {
    public C49362gP A00;
    public Integer A01;
    public String A02;
    public final String A03;
    public final List A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C49722gz) {
                C49722gz r8 = (C49722gz) obj;
                if (C107575bX.A0G(this.A03, r8.A03) && C107575bX.A0G(this.A02, r8.A02) && this.A00.equals(r8.A00)) {
                    Integer num = this.A01;
                    Integer num2 = r8.A01;
                    if (num == null ? num2 == null : num.equals(num2)) {
                        List list = this.A04;
                        int size = list.size();
                        List list2 = r8.A04;
                        if (size == list2.size()) {
                            if (list != list2) {
                                int i = 0;
                                while (i < list.size()) {
                                    if (list.get(i).equals(list2.get(i))) {
                                        i++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int intValue;
        int A07 = AnonymousClass0x2.A07(this.A02, (217 + this.A03.hashCode()) * 31);
        Integer num = this.A01;
        if (num == null) {
            intValue = 0;
        } else {
            intValue = num.intValue();
        }
        int A022 = AnonymousClass002.A02(this.A00, (A07 + intValue) * 31);
        for (C109015dw r0 : this.A04) {
            A022 = AnonymousClass0x7.A08(r0.A0F, A022 * 31);
        }
        return A022;
    }

    public C49722gz(C49362gP r1, Integer num, String str, String str2, List list) {
        this.A03 = str;
        this.A02 = str2;
        this.A00 = r1;
        this.A01 = num;
        this.A04 = list;
    }
}
