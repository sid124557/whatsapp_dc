package X;

import android.util.JsonReader;
import java.util.zip.ZipInputStream;

/* renamed from: X.1gZ  reason: invalid class name and case insensitive filesystem */
public class C28271gZ extends C69843Yp {
    public final C619032s A00;
    public final ZipInputStream A01;

    public C28271gZ(JsonReader jsonReader, C619032s r2, ZipInputStream zipInputStream) {
        super(jsonReader);
        this.A01 = zipInputStream;
        this.A00 = r2;
    }

    public void close() {
        super.close();
        this.A01.close();
    }
}
