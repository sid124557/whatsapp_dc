package X;

import android.text.TextUtils;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.9KQ  reason: invalid class name */
public class AnonymousClass9KQ extends Exception {
    public static final Set A00 = C18280x3.A0h(new String[]{"error_code", "error_domain", "description"});
    public final Map mAdditionalAnnotations;
    public String mStatusCode;
    public final AnonymousClass9K2 mType;

    public String A01() {
        String message;
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.beginObject();
            jsonWriter.name("error_domain").value(this.mType.name());
            if (!TextUtils.isEmpty(this.mStatusCode)) {
                jsonWriter.name("error_code").value(this.mStatusCode);
            }
            if (!TextUtils.isEmpty(getMessage())) {
                JsonWriter name = jsonWriter.name("description");
                if (getMessage().length() > 200) {
                    message = getMessage().substring(0, 200);
                } else {
                    message = getMessage();
                }
                name.value(message);
            }
            Map map = this.mAdditionalAnnotations;
            if (map != null && !map.isEmpty()) {
                Iterator A0q = AnonymousClass000.A0q(this.mAdditionalAnnotations);
                while (A0q.hasNext()) {
                    Map.Entry A0w = AnonymousClass001.A0w(A0q);
                    if (!A00.contains(A0w.getKey())) {
                        jsonWriter.name(C18310x6.A0q(A0w)).value((String) A0w.getValue());
                    }
                }
            }
            jsonWriter.endObject();
            return stringWriter.toString();
        } catch (IOException unused) {
            return "";
        }
    }

    public AnonymousClass9KQ(AnonymousClass9K2 r1, String str, String str2, Throwable th, Map map) {
        super(str, th);
        this.mType = r1;
        this.mStatusCode = str2;
        this.mAdditionalAnnotations = map;
    }

    public AnonymousClass9K2 A00() {
        return this.mType;
    }
}
