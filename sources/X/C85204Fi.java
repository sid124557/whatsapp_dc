package X;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import org.json.JSONObject;

/* renamed from: X.4Fi  reason: invalid class name and case insensitive filesystem */
public interface C85204Fi extends Parcelable {
    String B3U(C620733j r1, AnonymousClass39Q r2);

    String B3V(C620733j r1, AnonymousClass39Q r2);

    String B3W(C620733j r1, BigDecimal bigDecimal);

    BigDecimal B3c(C620733j r1, String str);

    CharSequence B6J(Context context, int i);

    JSONObject Bqs();

    void writeToParcel(Parcel parcel, int i);
}
