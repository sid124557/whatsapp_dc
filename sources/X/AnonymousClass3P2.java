package X;

import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.3P2  reason: invalid class name */
public class AnonymousClass3P2 implements AnonymousClass4EO {
    public final C56612sH A00;
    public final C28891hw A01;
    public final C66543Lv A02;
    public final C66493Lq A03;
    public final AnonymousClass2U1 A04;
    public final C56832sd A05;

    public void Be8() {
        AnonymousClass2U1 r0 = this.A04;
        C28001fK r3 = r0.A02;
        String str = r0.A04;
        List list = r0.A05;
        int i = r0.A00;
        Log.i("groupmgr/group_request/timeout/type: 14");
        this.A03.A1G.remove(r3);
        this.A02.A0V(this.A05.A02(r3, str, list, 3, i, this.A00.A0H()));
        this.A01.A0C(r3, false);
    }

    public void onError(int i) {
        AnonymousClass2U1 r0 = this.A04;
        C28001fK r3 = r0.A02;
        String str = r0.A04;
        List list = r0.A05;
        int i2 = r0.A00;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("groupmgr/request failed : ");
        A0o.append(i);
        C18310x6.A1Q(A0o, " | ", r3);
        C18270x1.A1F(A0o, 14);
        this.A03.A1G.remove(r3);
        int i3 = 2003;
        if (i != 406) {
            i3 = 2027;
            if (i != 412) {
                i3 = 2004;
                if (i != 429) {
                    i3 = 2002;
                    if (i != 500) {
                        i3 = 2001;
                    }
                }
            }
        }
        C18290x4.A1C(C66493Lq.A1H, str, i3);
        this.A02.A0V(this.A05.A02(r3, str, list, 3, i2, this.A00.A0H()));
        this.A01.A0C(r3, false);
    }

    public AnonymousClass3P2(C56612sH r4, C28891hw r5, C66543Lv r6, C66493Lq r7, AnonymousClass2U1 r8, C56832sd r9) {
        this.A00 = r4;
        this.A02 = r6;
        this.A03 = r7;
        this.A05 = r9;
        this.A01 = r5;
        this.A04 = r8;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("GroupResponseHandler - gid:");
        A0o.append(r8.A02);
        A0o.append(" subject:");
        String str = r8.A04;
        String str2 = "";
        A0o.append(str == null ? str2 : str);
        A0o.append(" pa:");
        List list = r8.A05;
        C18260x0.A1J(A0o, list != null ? Arrays.deepToString(list.toArray()) : str2);
    }

    public void BdP(AnonymousClass2RJ r4, C27991fJ r5) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("groupmgr/request success : ");
        A0o.append(r5);
        A0o.append(" | ");
        C18260x0.A1G(A0o, 14);
        this.A01.A0C(this.A04.A02, false);
    }
}
