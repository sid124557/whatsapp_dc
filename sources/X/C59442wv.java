package X;

import android.util.JsonWriter;

/* renamed from: X.2wv  reason: invalid class name and case insensitive filesystem */
public class C59442wv {
    public long A00;
    public String A01;
    public boolean A02;

    public C59442wv(long j, String str, boolean z) {
        this.A01 = str;
        this.A00 = j;
        this.A02 = z;
    }

    public void A00(JsonWriter jsonWriter) {
        jsonWriter.beginObject();
        jsonWriter.name("relative_path").value(this.A01);
        jsonWriter.name("size").value(this.A00);
        jsonWriter.name("required").value(this.A02);
        jsonWriter.endObject();
    }

    public C59442wv(AnonymousClass2SO r3) {
        this.A01 = r3.A04;
        this.A00 = r3.A01;
        this.A02 = r3.A05;
    }
}
