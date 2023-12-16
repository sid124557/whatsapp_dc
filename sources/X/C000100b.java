package X;

import android.content.AsyncQueryHandler;
import android.content.ContentResolver;
import android.database.Cursor;
import android.util.Log;

/* renamed from: X.00b  reason: invalid class name and case insensitive filesystem */
public class C000100b extends AsyncQueryHandler {
    public final /* synthetic */ AnonymousClass08H A00;

    public void onQueryComplete(int i, Object obj, Cursor cursor) {
        String str;
        if (cursor == null) {
            Log.w("CarApp.Conn", "Null response from content provider when checking connection to the car, treating as disconnected");
        } else {
            int columnIndex = cursor.getColumnIndex("CarConnectionState");
            if (columnIndex < 0) {
                str = "Connection to car response is missing the connection type, treating as disconnected";
            } else if (!cursor.moveToNext()) {
                str = "Connection to car response is empty, treating as disconnected";
            } else {
                this.A00.A0G(Integer.valueOf(cursor.getInt(columnIndex)));
                return;
            }
            Log.e("CarApp.Conn", str);
        }
        this.A00.A0G(0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C000100b(ContentResolver contentResolver, AnonymousClass08H r2) {
        super(contentResolver);
        this.A00 = r2;
    }
}
