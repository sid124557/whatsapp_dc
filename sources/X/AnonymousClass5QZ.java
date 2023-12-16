package X;

import com.whatsapp.jid.UserJid;
import java.util.Arrays;

/* renamed from: X.5QZ  reason: invalid class name */
public class AnonymousClass5QZ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass3ZH A03;
    public final UserJid A04;
    public final String A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass5QZ r5 = (AnonymousClass5QZ) obj;
            if (this.A01 != r5.A01 || this.A00 != r5.A00 || !AnonymousClass75J.A00(this.A03, r5.A03) || !AnonymousClass75J.A00(this.A04, r5.A04) || !AnonymousClass75J.A00(this.A05, r5.A05) || this.A02 != r5.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[6];
        objArr[0] = this.A03;
        objArr[1] = this.A04;
        AnonymousClass000.A1N(objArr, this.A01);
        AnonymousClass000.A1O(objArr, this.A00);
        objArr[4] = this.A05;
        C18310x6.A1U(objArr, this.A02);
        return Arrays.hashCode(objArr);
    }

    public AnonymousClass5QZ(AnonymousClass3ZH r1, UserJid userJid, String str, int i, int i2, int i3) {
        this.A03 = r1;
        this.A04 = userJid;
        this.A01 = i;
        this.A00 = i2;
        this.A05 = str;
        this.A02 = i3;
    }
}
