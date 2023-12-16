package X;

import java.util.List;
import java.util.Set;

/* renamed from: X.3Ew  reason: invalid class name and case insensitive filesystem */
public class C64763Ew implements C84424Ch {
    public final /* synthetic */ C66493Lq A00;
    public final /* synthetic */ C27991fJ A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ Set A03;

    public C64763Ew(C66493Lq r1, C27991fJ r2, List list, Set set) {
        this.A00 = r1;
        this.A03 = set;
        this.A01 = r2;
        this.A02 = list;
    }

    public void onError(int i) {
    }

    public void onSuccess() {
        String A032;
        Set set = this.A03;
        C27991fJ r2 = this.A01;
        set.add(r2);
        AnonymousClass33p r4 = this.A00.A0O;
        C626936e.A06(r2);
        String string = AnonymousClass0x2.A0F(r4).getString("pnh_cag_jid_sucessfully_upgraded", (String) null);
        if (string == null) {
            A032 = r2.getRawString();
        } else {
            A032 = C18260x0.A03(r2, ",", AnonymousClass000.A0l(string));
        }
        C18270x1.A0j(C18270x1.A03(r4), "pnh_cag_jid_sucessfully_upgraded", A032);
        if (this.A02.size() == set.size()) {
            C18270x1.A0l(C18270x1.A03(r4), "pnh_cag_upgrade_incomplete", false);
            C18270x1.A0j(C18270x1.A03(r4), "pnh_cag_jid_sucessfully_upgraded", (String) null);
        }
    }
}
