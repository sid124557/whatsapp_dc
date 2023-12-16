package X;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* renamed from: X.8D6  reason: invalid class name */
public class AnonymousClass8D6 implements C185848uL {
    public Boolean A00;
    public String A01;
    public final JsonToken A02;

    public static IOException A00(AnonymousClass8D6 r2) {
        StringBuilder sb = new StringBuilder();
        sb.append("type mis matching");
        sb.append(r2.A02);
        return new IOException(sb.toString());
    }

    public boolean Ay6() {
        Boolean bool = this.A00;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw A00(this);
    }

    public int BGg() {
        String str = this.A01;
        if (str != null) {
            return Integer.valueOf(str).intValue();
        }
        throw A00(this);
    }

    public boolean BID() {
        return AnonymousClass000.A1Y(this.A02, JsonToken.NULL);
    }

    public long BKP() {
        String str = this.A01;
        if (str != null) {
            return Long.valueOf(str).longValue();
        }
        throw A00(this);
    }

    public Number BLl() {
        String str = this.A01;
        if (str != null) {
            try {
                return Long.valueOf(str);
            } catch (NumberFormatException unused) {
                return Double.valueOf(str);
            }
        } else {
            throw A00(this);
        }
    }

    public String BqG() {
        String str = this.A01;
        if (str != null) {
            return str;
        }
        throw A00(this);
    }

    public AnonymousClass8D6(JsonReader jsonReader) {
        JsonToken peek = jsonReader.peek();
        this.A02 = peek;
        int A04 = AnonymousClass6CA.A04(peek, AnonymousClass77M.A00);
        if (A04 == 1) {
            this.A00 = Boolean.valueOf(jsonReader.nextBoolean());
        } else if (A04 == 2) {
            jsonReader.nextNull();
        } else if (A04 == 3 || A04 == 4) {
            this.A01 = jsonReader.nextString();
        } else {
            throw AnonymousClass001.A0e("can't read value");
        }
    }
}
