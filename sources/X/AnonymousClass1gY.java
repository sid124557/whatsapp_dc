package X;

import android.os.ParcelFileDescriptor;
import android.util.JsonReader;

/* renamed from: X.1gY  reason: invalid class name */
public class AnonymousClass1gY extends C69843Yp {
    public final ParcelFileDescriptor A00;
    public final C619032s A01;

    public AnonymousClass1gY(ParcelFileDescriptor parcelFileDescriptor, JsonReader jsonReader, C619032s r3) {
        super(jsonReader);
        this.A00 = parcelFileDescriptor;
        this.A01 = r3;
    }

    public void close() {
        super.close();
        this.A00.close();
    }
}
