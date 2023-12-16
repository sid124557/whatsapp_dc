package com.whatsapp.profile;

import X.AnonymousClass08M;
import X.AnonymousClass29D;
import X.AnonymousClass29E;
import X.AnonymousClass2P8;
import X.AnonymousClass31C;
import X.AnonymousClass45E;
import X.C05550Ty;
import X.C06270Wx;
import X.C162457s7;
import X.C32991sG;
import X.C33001sH;
import X.C33021sJ;
import X.C33031sK;
import X.C33041sL;
import X.C35371wl;
import X.C35571x5;
import X.C35711xJ;
import X.C41032Ir;
import X.C56972sr;
import X.C60702yz;
import com.whatsapp.R;

public final class UsernameViewModel extends C05550Ty {
    public String A00;
    public final AnonymousClass08M A01 = AnonymousClass08M.A01();
    public final C56972sr A02;
    public final AnonymousClass2P8 A03;

    public UsernameViewModel(C56972sr r2, AnonymousClass2P8 r3) {
        C162457s7.A0J(r2, 1);
        this.A02 = r2;
        this.A03 = r3;
    }

    public final C06270Wx A0D() {
        AnonymousClass08M r3 = this.A01;
        if (r3.A07() == null) {
            A0G((Integer) null);
            AnonymousClass2P8 r4 = this.A03;
            AnonymousClass31C r5 = r4.A00;
            String A032 = r5.A03();
            C35711xJ r2 = new C35711xJ(new C35371wl(new C35371wl(A032, 17)), 13);
            r5.A0D(new C35571x5(r2, ((AnonymousClass45E) r4.A01).invoke(this), 6), C41032Ir.A05(r2), A032, 421, 32000);
        }
        return r3;
    }

    public void A0E(AnonymousClass29D r7) {
        if (r7 instanceof C32991sG) {
            String str = ((C32991sG) r7).A00;
            if (str.length() > 0) {
                this.A02.A0V(str);
            }
        } else if ((r7 instanceof C33001sH) && ((C33001sH) r7).A00 == 404) {
            this.A02.A0V("");
        } else {
            return;
        }
        A0G((Integer) null);
    }

    public void A0F(AnonymousClass29E r6) {
        Integer num;
        int i;
        if (C162457s7.A0P(r6, C33031sK.A00)) {
            i = R.string.f11nameremoved;
        } else {
            if (r6 instanceof C33021sJ) {
                long j = ((C33021sJ) r6).A00;
                if (Long.valueOf(j) != null) {
                    if (j == 406 || j == 40601) {
                        i = R.string.f11nameremoved;
                    } else {
                        int i2 = (j > 40602 ? 1 : (j == 40602 ? 0 : -1));
                        i = R.string.f11nameremoved;
                        if (i2 == 0) {
                            i = R.string.f11nameremoved;
                        }
                    }
                }
            } else if (r6 instanceof C33041sL) {
                String str = this.A00;
                if (str != null) {
                    this.A02.A0V(str);
                }
            } else {
                return;
            }
            num = null;
            A0G(num);
        }
        num = Integer.valueOf(i);
        A0G(num);
    }

    public final void A0G(Integer num) {
        AnonymousClass08M r3 = this.A01;
        String A0K = this.A02.A0K();
        C162457s7.A0D(A0K);
        r3.A0G(new C60702yz(num, A0K, this.A00));
    }
}
