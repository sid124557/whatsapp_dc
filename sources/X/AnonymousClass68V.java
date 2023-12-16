package X;

import android.content.Context;

/* renamed from: X.68V  reason: invalid class name */
public class AnonymousClass68V implements AnonymousClass66C {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass68V(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A02 = obj;
        this.A01 = obj3;
    }

    public void B27(AnonymousClass30Y r5) {
        String str;
        if (this.A03 != 0) {
            AnonymousClass2P1 BES = ((AnonymousClass5OW) this.A00).A06.BES((C95814uZ) this.A01, C107405bG.A0D((Context) this.A02));
            if (BES != null) {
                String str2 = BES.A01;
                r5.A00(str2.length(), "wallpaper", str2);
                return;
            }
            return;
        }
        int A002 = ((AnonymousClass5OW) this.A00).A03.A00((C95814uZ) this.A01, ((C624134x) this.A02).A1M);
        if (A002 < 100) {
            int i = A002 / 25;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(i * 25);
            A0o.append("-");
            str = AnonymousClass000.A0h(A0o, ((i + 1) * 25) - 1);
        } else if (A002 < 1000) {
            str = "100-999";
        } else if (A002 < 10000) {
            str = "1000-9999";
        } else {
            str = "10000+";
        }
        r5.A00(str.length(), "offset_from_end_of_chat", str);
    }

    public String B9C() {
        if (this.A03 != 0) {
            return "wallpaper";
        }
        return "offset_from_end_of_chat";
    }
}
