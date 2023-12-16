package X;

import android.util.JsonReader;

/* renamed from: X.279  reason: invalid class name */
public final class AnonymousClass279 {
    public static final AnonymousClass0PJ A00(JsonReader jsonReader) {
        int[] iArr = new int[2];
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (true) {
            int i = 0;
            if (!jsonReader.hasNext()) {
                break;
            }
            String nextName = jsonReader.nextName();
            if (nextName != null) {
                int hashCode = nextName.hashCode();
                if (hashCode != -318184504) {
                    if (hashCode != 116079) {
                        if (hashCode == 3083499 && nextName.equals("dims")) {
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                if (i < 2) {
                                    iArr[i] = jsonReader.nextInt();
                                    i++;
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endArray();
                        }
                    } else if (nextName.equals("url")) {
                        str = jsonReader.nextString();
                    }
                } else if (nextName.equals("preview")) {
                    str2 = jsonReader.nextString();
                }
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return new AnonymousClass0PJ((Object) null, (Object) null);
        }
        return AnonymousClass0x9.A0G(new C166097y8(str, iArr[0], iArr[1]), new C166097y8(str2, iArr[0], iArr[1]));
    }
}
