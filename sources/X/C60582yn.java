package X;

import com.whatsapp.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2yn  reason: invalid class name and case insensitive filesystem */
public final class C60582yn {
    public final C54292oU A00;
    public final AnonymousClass1VX A01;

    public final String A01(C43952Uc r3) {
        C54292oU r1;
        int i;
        if (r3.equals(C29901lX.A00)) {
            r1 = this.A00;
            i = R.string.f11nameremoved;
        } else if (r3.equals(C29921lZ.A00)) {
            r1 = this.A00;
            i = R.string.f11nameremoved;
        } else if (r3.equals(C29861lT.A00)) {
            r1 = this.A00;
            i = R.string.f11nameremoved;
        } else if (r3.equals(C29881lV.A00)) {
            r1 = this.A00;
            i = R.string.f11nameremoved;
        } else if (r3.equals(C29911lY.A00) || r3.equals(AnonymousClass1lQ.A00)) {
            r1 = this.A00;
            i = R.string.f11nameremoved;
        } else if (r3.equals(C29851lS.A00)) {
            r1 = this.A00;
            i = R.string.f11nameremoved;
        } else if (r3.equals(C29891lW.A00)) {
            r1 = this.A00;
            i = R.string.f11nameremoved;
        } else if (r3.equals(AnonymousClass1lR.A00)) {
            r1 = this.A00;
            i = R.string.f11nameremoved;
        } else if (r3.equals(C29871lU.A00)) {
            r1 = this.A00;
            i = R.string.f11nameremoved;
        } else {
            throw C73153f1.A00();
        }
        return C54292oU.A04(r1, i);
    }

    public final String A02(C43952Uc r4, AnonymousClass28N r5) {
        String str;
        if (r5 instanceof C29981lf) {
            str = ((C29981lf) r5).A00;
        } else if (r5 instanceof C29991lg) {
            str = ((C29991lg) r5).A00.A05;
            if (str == null) {
                str = "sticker-without-stable-id";
            }
        } else if (r5 instanceof C30001lh) {
            str = ((C30001lh) r5).A01;
        } else {
            throw C73153f1.A00();
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("avatar-sticker-");
        A0o.append(r4);
        return AnonymousClass0x2.A0e(str, A0o, '-');
    }

    public final List A03(C43952Uc r7, String str, List list) {
        AnonymousClass8U9 r5 = new AnonymousClass8U9();
        if (C18310x6.A1X(list)) {
            C23551Tr r4 = new C23551Tr(r7, r7.toString());
            if (!C162457s7.A0P(r4.A00, C29901lX.A00) || !this.A01.A0Y(C58422vE.A02, 6632)) {
                r5.add(new C23491Tl((AnonymousClass2UW) r4, (Integer) null, str, 10));
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass39M A0b = AnonymousClass0x7.A0b(it);
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("sticker-");
                A0o.append(r7);
                A0o.append('-');
                r5.add(new C23481Tk(r4, A0b, AnonymousClass000.A0X(A0b.A05, A0o)));
            }
        }
        return C159507lx.A0h(r5);
    }

    public C60582yn(C54292oU r1, AnonymousClass1VX r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public static final String A00(C43952Uc r2, int i) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("loading-avatar-sticker-");
        A0o.append(r2);
        A0o.append('-');
        return AnonymousClass000.A0h(A0o, i);
    }
}
