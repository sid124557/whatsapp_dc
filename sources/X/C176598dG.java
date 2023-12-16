package X;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;

/* renamed from: X.8dG  reason: invalid class name and case insensitive filesystem */
public class C176598dG extends AnonymousClass8Q0 implements C180078kS {
    public C177088e3 A00;

    public static C176598dG A0A(Object obj) {
        if (obj == null || (obj instanceof C176598dG)) {
            return (C176598dG) obj;
        }
        if ((obj instanceof C176708dR) || (obj instanceof C176758dW)) {
            return new C176598dG((C177088e3) obj);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        C18260x0.A1T(A0o, "unknown object in factory: ", obj);
        throw C18310x6.A0d(A0o);
    }

    public String A0N() {
        String str;
        C177088e3 r1 = this.A00;
        if (!(r1 instanceof C176708dR)) {
            return ((C176758dW) r1).A0U();
        }
        String A0U = ((C176708dR) r1).A0U();
        char A002 = AnonymousClass6C9.A00(A0U);
        StringBuilder A0o = AnonymousClass001.A0o();
        if (A002 < '5') {
            str = "20";
        } else {
            str = "19";
        }
        return AnonymousClass000.A0V(str, A0U, A0o);
    }

    public Date A0O() {
        StringBuilder A0o;
        String str;
        try {
            C177088e3 r4 = this.A00;
            if (!(r4 instanceof C176708dR)) {
                return ((C176758dW) r4).A0W();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssz");
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
            String A0U = ((C176708dR) r4).A0U();
            if (AnonymousClass6C9.A00(A0U) < '5') {
                A0o = AnonymousClass001.A0o();
                str = "20";
            } else {
                A0o = AnonymousClass001.A0o();
                str = "19";
            }
            return C155497f0.A00(simpleDateFormat.parse(AnonymousClass000.A0V(str, A0U, A0o)));
        } catch (ParseException e) {
            throw AnonymousClass001.A0e(AnonymousClass000.A0a("invalid date string: ", AnonymousClass001.A0o(), e));
        }
    }

    public C176598dG(Date date, Locale locale) {
        C177088e3 r1;
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(0, "Z");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", locale);
        simpleDateFormat.setTimeZone(simpleTimeZone);
        String A0V = AnonymousClass000.A0V(simpleDateFormat.format(date), "Z", AnonymousClass001.A0o());
        int parseInt = Integer.parseInt(A0V.substring(0, 4));
        if (parseInt < 1950 || parseInt > 2049) {
            r1 = new C176098cS(A0V);
        } else {
            r1 = new C177038dy(A0V.substring(2));
        }
        this.A00 = r1;
    }

    public String toString() {
        return A0N();
    }

    public C176598dG(C177088e3 r2) {
        if ((r2 instanceof C176708dR) || (r2 instanceof C176758dW)) {
            this.A00 = r2;
            return;
        }
        throw AnonymousClass001.A0c("unknown object passed to Time");
    }
}
