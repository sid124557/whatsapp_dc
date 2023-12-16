package X;

import android.util.JsonReader;
import android.util.JsonWriter;
import com.whatsapp.jid.DeviceJid;
import java.io.StringReader;

/* renamed from: X.1mE  reason: invalid class name and case insensitive filesystem */
public abstract class C30301mE extends C624134x {
    public DeviceJid A00;
    public boolean A01;

    public static JsonReader A00(String str) {
        return new JsonReader(new StringReader(str));
    }

    public static void A01(JsonWriter jsonWriter, C30871nL r2) {
        jsonWriter.beginObject();
        jsonWriter.name("requestStanzaId").value(r2.A00);
    }

    public C30301mE(AnonymousClass2z0 r1, byte b, long j) {
        super(r1, b, j);
    }
}
