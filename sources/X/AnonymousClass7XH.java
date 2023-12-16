package X;

import android.content.Context;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;

/* renamed from: X.7XH  reason: invalid class name */
public class AnonymousClass7XH {
    public Context A00;
    public C151807Wj A01;
    public Locale A02;
    public Map A03 = AnonymousClass001.A0t();
    public Properties A04;
    public Properties A05;
    public Properties A06;
    public C48812fW A07;
    public AnonymousClass7WR A08;
    public AnonymousClass7Q1 A09;
    public C150747Sb A0A;

    public Properties A00(String str) {
        Properties properties = new Properties();
        try {
            properties.load(this.A00.getAssets().open(str));
            return properties;
        } catch (IOException e) {
            e.toString();
            return properties;
        }
    }

    public AnonymousClass7WR A01() {
        AnonymousClass7WR r3 = this.A08;
        if (r3 != null) {
            return r3;
        }
        AnonymousClass7Q1 r0 = this.A09;
        C151807Wj r2 = r0.A00;
        this.A01 = r2;
        AnonymousClass7WR r32 = new AnonymousClass7WR(r2, r0.A01, r0.A0A);
        this.A08 = r32;
        return r32;
    }

    public AnonymousClass7XH(Context context, AnonymousClass7Q1 r8) {
        Locale locale;
        Map map;
        String language;
        StringBuilder A0l;
        String str;
        this.A09 = r8;
        this.A02 = r8.A02;
        this.A00 = context;
        this.A01 = r8.A00;
        this.A06 = A00("cl-app.properties");
        this.A04 = A00("validation.properties");
        this.A05 = A00("version.properties");
        Locale locale2 = this.A02;
        if (locale2 != null) {
            map = this.A03;
            language = locale2.getLanguage();
            A0l = AnonymousClass000.A0l("cl-messages_");
            locale = this.A02;
        } else {
            locale = new Locale("en_US");
            map = this.A03;
            language = locale.getLanguage();
            A0l = AnonymousClass000.A0l("cl-messages_");
        }
        map.put(language, A00(AnonymousClass000.A0V(locale.getLanguage(), ".properties", A0l)));
        this.A07 = r8.A0A;
        this.A0A = new C150747Sb(this);
        if (r8.A00 != null && (str = r8.A01) != null) {
            this.A08 = new AnonymousClass7WR(this.A01, str, this.A07);
        }
    }
}
