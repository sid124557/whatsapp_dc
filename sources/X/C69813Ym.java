package X;

import android.util.JsonWriter;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* renamed from: X.3Ym  reason: invalid class name and case insensitive filesystem */
public class C69813Ym implements Closeable {
    public boolean A00;
    public final JsonWriter A01;
    public final AnonymousClass8OQ A02;
    public final ZipOutputStream A03;

    public void close() {
        if (!this.A00) {
            JsonWriter jsonWriter = this.A01;
            jsonWriter.endObject();
            jsonWriter.flush();
            this.A03.closeEntry();
            this.A00 = true;
        }
    }

    public C69813Ym(Map map, ZipOutputStream zipOutputStream) {
        this.A02 = AnonymousClass8OQ.copyOf(map);
        this.A03 = zipOutputStream;
        zipOutputStream.putNextEntry(new ZipEntry("metadata.json"));
        JsonWriter jsonWriter = new JsonWriter(new BufferedWriter(new OutputStreamWriter(zipOutputStream)));
        this.A01 = jsonWriter;
        jsonWriter.beginObject();
    }
}
