package X;

import android.database.Cursor;
import android.database.CursorWrapper;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Map;

/* renamed from: X.0xx  reason: invalid class name and case insensitive filesystem */
public class C18600xx extends CursorWrapper {
    public final Map A00 = AnonymousClass001.A0t();

    public int getColumnIndex(String str) {
        Map map = this.A00;
        Number A0q = AnonymousClass0x9.A0q(str, map);
        if (A0q != null) {
            return A0q.intValue();
        }
        int columnIndex = super.getColumnIndex(str);
        C18280x3.A1D(str, map, columnIndex);
        return columnIndex;
    }

    public C18600xx(Cursor cursor) {
        super(cursor);
    }

    public int getColumnIndexOrThrow(String str) {
        String str2;
        int columnIndex = getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            str2 = Arrays.toString(getColumnNames());
        } catch (Exception e) {
            Log.d("Cannot collect column names for debug purposes", e);
            str2 = "";
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("column '");
        A0o.append(str);
        A0o.append("' does not exist. Available columns: ");
        throw AnonymousClass000.A0F(str2, A0o);
    }
}
