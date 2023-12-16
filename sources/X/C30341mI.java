package X;

import com.whatsapp.jid.GroupJid;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1mI  reason: invalid class name and case insensitive filesystem */
public class C30341mI extends C624134x {
    public final int A00;

    public C30341mI(AnonymousClass2z0 r2, int i, long j) {
        super(r2, (byte) 7, j);
        A1G(6);
        this.A00 = i;
    }

    public static void A00(GroupJid groupJid, C31881p0 r3, String str) {
        List singletonList = Collections.singletonList(new C52662lq(groupJid, str, 1));
        C162457s7.A0D(singletonList);
        List list = r3.A00;
        list.clear();
        list.addAll(singletonList);
    }

    public void A1G(int i) {
        if (i != 6) {
            C626936e.A0D(false, "Cannot change status for FMessageSystem");
        }
        super.A1G(i);
    }

    public boolean A1v() {
        int i = this.A00;
        if (i == 18 || i == 57 || i == 71 || i == 20 || i == 126 || i == 123 || i == 79 || i == 90 || i == 14 || i == 52 || i == 27 || i == 131 || i == 4 || i == 7 || i == 51 || i == 11 || i == 17 || i == 1 || i == 6 || i == 5 || i == 12 || i == 127 || i == 29 || i == 30 || i == 31 || i == 32 || i == 54 || i == 53 || i == 13 || i == 15 || i == 16 || i == 81 || i == 82 || i == 9 || i == 21 || i == 84 || i == 85 || i == 83 || i == 42 || i == 40 || i == 41 || i == 64 || i == 65 || i == 66 || i == 56 || i == 59 || i == 80 || i == 130 || i == 91 || i == 92 || i == 60 || i == 68 || i == 70 || i == 75 || i == 95 || i == 76 || i == 77 || i == 78 || i == 87 || i == 88 || i == 89 || i == 100 || i == 106 || i == 124 || i == 144 || i == 107 || i == 108 || i == 109 || i == 110 || i == 111 || i == 112 || i == 128 || i == 113 || i == 114 || i == 115 || i == 116 || i == 118 || i == 120 || i == 121 || i == 122 || i == 143 || i == 137 || i == 138 || i == 140 || i == 141 || i == 145 || i == 149 || i == 150 || i == 151 || i == 152) {
            return true;
        }
        return false;
    }
}
