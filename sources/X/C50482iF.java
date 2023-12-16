package X;

import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.regex.Matcher;

/* renamed from: X.2iF  reason: invalid class name and case insensitive filesystem */
public class C50482iF {
    public boolean A00 = false;
    public final C04840Qw A01 = new C04840Qw(5);
    public final C55682qk A02;
    public final C69263Wi A03;
    public final C620433g A04;
    public final C97104xd A05;
    public final C105405Uu A06;
    public final AnonymousClass5Y9 A07;
    public final C48392ep A08;
    public final AnonymousClass1VX A09;
    public final C27241dV A0A;
    public final AnonymousClass4FS A0B;

    public void A00(C84634Dc r6, String str) {
        C48392ep r4 = this.A08;
        try {
            Matcher A002 = r4.A00(str);
            if (A002.matches()) {
                String group = A002.group(1);
                if (group != null) {
                    C108865dg r0 = (C108865dg) this.A01.A04(group);
                    if (r0 != null) {
                        r6.BTE(r0);
                        return;
                    }
                    C27241dV r02 = this.A0A;
                    r02.A01 = group;
                    r02.A00 = "STOREFRONT";
                    this.A0B.BkM(new C117715sN(this, r6, group, 12));
                    return;
                }
            } else {
                r4.A00.A0A("ShopUtils/parseIdFromUrl", false, "Matcher didn't match for url");
            }
        } catch (AnonymousClass24N e) {
            Log.e((Throwable) e);
            C55682qk.A05(r4.A00, "ShopUtils/parseIdFromUrl", e);
        }
        this.A02.A0A("ShopManager/requestShopMetadataByUrl", false, AnonymousClass000.A0V("Couldn't find shopId: ", str, AnonymousClass001.A0o()));
        r6.BTD(Collections.EMPTY_MAP);
    }

    public boolean A01() {
        AnonymousClass1VX r2 = this.A09;
        C58422vE r1 = C58422vE.A02;
        if (r2.A0Y(r1, 854) || r2.A0Y(r1, 832) || !r2.A0Y(r1, 1062)) {
            return false;
        }
        return true;
    }

    public C50482iF(C55682qk r3, C69263Wi r4, C620433g r5, C97104xd r6, C105405Uu r7, AnonymousClass5Y9 r8, C48392ep r9, AnonymousClass1VX r10, C27241dV r11, AnonymousClass4FS r12) {
        this.A09 = r10;
        this.A03 = r4;
        this.A02 = r3;
        this.A08 = r9;
        this.A0B = r12;
        this.A05 = r6;
        this.A07 = r8;
        this.A06 = r7;
        this.A0A = r11;
        this.A04 = r5;
    }
}
