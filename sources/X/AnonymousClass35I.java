package X;

import android.util.JsonReader;
import java.util.Locale;

/* renamed from: X.35I  reason: invalid class name */
public final class AnonymousClass35I {
    public static final AnonymousClass35I A00 = new AnonymousClass35I();

    public final String A03(C620733j r3, Locale locale) {
        String str;
        String language;
        String country;
        if (locale == null || (language = locale.getLanguage()) == null || language.length() == 0) {
            str = r3.A07();
        } else {
            String language2 = locale.getLanguage();
            if (language2 == null || !language2.equalsIgnoreCase("zh") || (country = locale.getCountry()) == null || country.length() == 0) {
                str = locale.getLanguage();
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append(locale.getLanguage());
                A0o.append('-');
                return AnonymousClass000.A0X(locale.getCountry(), A0o);
            }
        }
        C162457s7.A0D(str);
        return str;
    }

    public static final AnonymousClass0PJ A00(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i = 0;
        String str = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (C162457s7.A0P(nextName, "status")) {
                i = jsonReader.nextInt();
            } else if (C162457s7.A0P(nextName, "msg")) {
                str = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return AnonymousClass0x9.A0G(Integer.valueOf(i), str);
    }

    public static final C166097y8 A01(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i = -1;
        String str = null;
        int i2 = -1;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName != null) {
                int hashCode = nextName.hashCode();
                if (hashCode != -1221029593) {
                    if (hashCode != 116079) {
                        if (hashCode == 113126854 && nextName.equals("width")) {
                            i = C18290x4.A02(jsonReader);
                        }
                    } else if (nextName.equals("url")) {
                        str = jsonReader.nextString();
                    }
                } else if (nextName.equals("height")) {
                    i2 = C18290x4.A02(jsonReader);
                }
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        if (str != null) {
            return new C166097y8(str, i, i2);
        }
        return null;
    }

    public static final String A02(JsonReader jsonReader) {
        int i;
        jsonReader.beginObject();
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName != null) {
                int hashCode = nextName.hashCode();
                if (hashCode != -1019779949) {
                    if (hashCode != -407761836) {
                        if (hashCode == 94851343 && nextName.equals("count")) {
                            i2 = jsonReader.nextInt();
                        }
                    } else if (nextName.equals("total_count")) {
                        i4 = jsonReader.nextInt();
                    }
                } else if (nextName.equals("offset")) {
                    i3 = jsonReader.nextInt();
                }
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        if (i2 <= 0 || i3 < 0 || i4 <= 0 || i4 <= (i = i2 + i3)) {
            return null;
        }
        return String.valueOf(i);
    }
}
