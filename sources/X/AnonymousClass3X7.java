package X;

import com.whatsapp.jid.DeviceJid;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3X7  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3X7 implements C84134Bd {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C64833Fe A03;
    public final /* synthetic */ DeviceJid A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ Map A06;
    public final /* synthetic */ Set A07;

    public final void AwB(Object obj) {
        C64833Fe r2 = this.A03;
        Map map = this.A06;
        r2.A0J.BkP(new C71033bS(r2, this.A04, this.A05, (List) obj, map, this.A07, this.A00, this.A01, this.A02));
    }

    public /* synthetic */ AnonymousClass3X7(C64833Fe r1, DeviceJid deviceJid, String str, Map map, Set set, int i, int i2, int i3) {
        this.A03 = r1;
        this.A06 = map;
        this.A04 = deviceJid;
        this.A05 = str;
        this.A07 = set;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }
}
