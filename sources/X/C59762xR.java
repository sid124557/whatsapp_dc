package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2xR  reason: invalid class name and case insensitive filesystem */
public final class C59762xR {
    public final C49652gs A00;
    public final C29351ig A01;
    public final C55862r2 A02;
    public final C53062mU A03;
    public final C183538qC A04;
    public final C183538qC A05;
    public final AnonymousClass4C1 A06;
    public final AnonymousClass4C1 A07;
    public final C73853gB A08;
    public final C73853gB A09;

    public static final String A00(AnonymousClass28J r4) {
        StringBuilder A0o;
        if (r4 instanceof AnonymousClass1kp) {
            return "delivery_error";
        }
        if (r4 instanceof AnonymousClass1kq) {
            A0o = AnonymousClass001.A0o();
            A0o.append("error_");
            String message = ((Throwable) ((AnonymousClass1kq) r4).A00).getMessage();
            if (message == null) {
                message = "unknown";
            }
            A0o.append(message);
        } else if (r4 instanceof AnonymousClass1kr) {
            A0o = AnonymousClass001.A0o();
            A0o.append("multiple_errors [");
            List<Throwable> list = ((AnonymousClass1kr) r4).A00;
            ArrayList A0c = C73783g4.A0c(list);
            for (Throwable message2 : list) {
                A0c.add(message2.getMessage());
            }
            A0o.append(C73723fy.A09(", ", A0c));
            A0o.append(']');
        } else {
            if (r4 instanceof C29651ks) {
                A0o = AnonymousClass001.A0o();
                A0o.append("unknown_error (");
                C18320x8.A1N(A0o, ((C29651ks) r4).A00);
            } else if (r4 instanceof C29641ko) {
                A0o = AnonymousClass001.A0o();
                A0o.append("unknown_error_code (");
                A0o.append(0);
            } else {
                throw C73153f1.A00();
            }
            A0o.append(')');
        }
        return A0o.toString();
    }

    public final void A01(String str, String str2) {
        C55862r2 r2 = this.A02;
        if (str2 == null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("hasAvatar=");
            str2 = C18300x5.A0m(A0o, this.A00.A01());
        }
        r2.A02(1, str, str2);
    }

    public C59762xR(C49652gs r2, C29351ig r3, C55862r2 r4, C53062mU r5, C183538qC r6, C183538qC r7, AnonymousClass4C1 r8, AnonymousClass4C1 r9, C73853gB r10, C73853gB r11) {
        C18260x0.A0f(r4, r3, r2, r6, r7);
        C18260x0.A0W(r8, r5, r9);
        C162457s7.A0J(r10, 9);
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
        this.A04 = r6;
        this.A05 = r7;
        this.A07 = r8;
        this.A03 = r5;
        this.A06 = r9;
        this.A09 = r10;
        this.A08 = r11;
    }
}
